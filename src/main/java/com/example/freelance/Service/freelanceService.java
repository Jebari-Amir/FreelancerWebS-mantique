package com.example.freelance.Service;

import com.example.freelance.Entity.*;
import com.example.freelance.Tool.FileTool;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class freelanceService {

    @Autowired
    private Model rdfModel;
    public List<Contrat> getContrat(){
        File queryFile = new File("data/query.txt");
        String queryString = FileTool.getContents(queryFile);
        List<Contrat> results = new ArrayList<>();

        try {
            Query query = QueryFactory.create(queryString);
            QueryExecution queryExecution = QueryExecutionFactory.create(query, rdfModel);

            ResultSet resultSet = queryExecution.execSelect();
            System.out.println("==========================");

            while (resultSet.hasNext()) {
                QuerySolution solution = resultSet.nextSolution();
                System.out.println("==========================");
                System.out.println(solution);
                System.out.println(resultSet);
                System.out.println("==========================");
                Contrat result = new Contrat();
                result.setName(solution.get("name").toString());
                result.setDate(solution.get("date").toString());
                result.setStatus(solution.get("status").toString());
                result.setMoneyAmount(solution.get("moneyAmount").toString());
                result.setFreelancer(solution.get("freelancer").toString());
                result.setProject(solution.get("projet").toString());
                results.add(result);
            }
        } catch (QueryParseException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return results;
    }

    public List<Deliverable> getDeliverable(){
        File queryFile = new File("data/deliverableQuery.txt");
        String queryString = FileTool.getContents(queryFile);
        List<Deliverable> results = new ArrayList<>();

        try {
            Query query = QueryFactory.create(queryString);
            QueryExecution queryExecution = QueryExecutionFactory.create(query, rdfModel);

            ResultSet resultSet = queryExecution.execSelect();
            System.out.println("==========================");

            while (resultSet.hasNext()) {
                QuerySolution solution = resultSet.nextSolution();
                System.out.println("==========================");
                System.out.println(solution);
                System.out.println(resultSet);
                System.out.println("==========================");
                Deliverable result = new Deliverable();
                result.setName(solution.get("name").toString());
                result.setDescription(solution.get("description").toString());
                result.setDeadline(solution.get("deadline").toString());
                result.setType(solution.get("type").toString());
                result.setReview(solution.get("review").toString());
                result.setFreelancer(solution.get("freelancer").toString());
                result.setProject(solution.get("projet").toString());
                results.add(result);
            }
        } catch (QueryParseException e) {
            // Handle query parsing error
        } catch (Exception e) {
            // Handle other exceptions
        }

        return results;
    }




///////////////////////////////////////////////////////////////////////////////////////////////////////

    public List<Conge> getConge(){
        File queryFile = new File("data/congeQuery.txt");
        String queryString = FileTool.getContents(queryFile);
        List<Conge> results = new ArrayList<>();

        try {
            Query query = QueryFactory.create(queryString);
            QueryExecution queryExecution = QueryExecutionFactory.create(query, rdfModel);

            ResultSet resultSet = queryExecution.execSelect();
            System.out.println("==========================");

            while (resultSet.hasNext()) {
                QuerySolution solution = resultSet.nextSolution();
                System.out.println("==========================");
                System.out.println(solution);
                System.out.println(resultSet);
                System.out.println("==========================");
                Conge result = new Conge();
                result.setDateconge(solution.get("dateconge").toString());
                result.setNombre(solution.get("nombre").toString());
                result.setMotif(solution.get("motif").toString());
                result.setReport(solution.get("report").toString());
                result.setTypedeconge(solution.get("typedeconge").toString());

                //  result.setFreelancer(solution.get("freelancer").toString());
                results.add(result);
            }
        } catch (QueryParseException e) {
            // Handle query parsing error
        } catch (Exception e) {
            // Handle other exceptions
        }

        return results;
    }



    ////////////////////////////////////////////////////////////////////////////////////:
    public List<Contact> getContact(){
        File queryFile = new File("data/contactQuery.txt");
        String queryString = FileTool.getContents(queryFile);
        List<Contact> results = new ArrayList<>();

        try {
            Query query = QueryFactory.create(queryString);
            QueryExecution queryExecution = QueryExecutionFactory.create(query, rdfModel);

            ResultSet resultSet = queryExecution.execSelect();
            System.out.println("==========================");

            while (resultSet.hasNext()) {
                QuerySolution solution = resultSet.nextSolution();
                System.out.println("==========================");
                System.out.println(solution);
                System.out.println(resultSet);
                System.out.println("==========================");
                Contact result = new Contact();
                result.setEmail(solution.get("email").toString());
                result.setDatedenaissance(solution.get("datedenaissance").toString());
                result.setPoste(solution.get("poste").toString());
                result.setNote(solution.get("note").toString());
                result.setReclamation(solution.get("reclamation").toString());

                //  result.setFreelancer(solution.get("freelancer").toString());
                results.add(result);
            }
        } catch (QueryParseException e) {
            // Handle query parsing error
        } catch (Exception e) {
            // Handle other exceptions
        }

        return results;
    }



    ////////////////////////////////////////////////////////////////////////////////////:
    public List<typedeconge> getTypedeconge(){
        File queryFile = new File("data/typedecongeQuery.txt");
        String queryString = FileTool.getContents(queryFile);
        List<typedeconge> results = new ArrayList<>();

        try {
            Query query = QueryFactory.create(queryString);
            QueryExecution queryExecution = QueryExecutionFactory.create(query, rdfModel);

            ResultSet resultSet = queryExecution.execSelect();
            System.out.println("==========================");

            while (resultSet.hasNext()) {
                QuerySolution solution = resultSet.nextSolution();
                System.out.println("==========================");
                System.out.println(solution);
                System.out.println(resultSet);
                System.out.println("==========================");
                typedeconge result = new typedeconge();
                result.setName(solution.get("name").toString());
                result.setDescription(solution.get("description").toString());


                results.add(result);
            }
        } catch (QueryParseException e) {
            // Handle query parsing error
        } catch (Exception e) {
            // Handle other exceptions
        }

        return results;
    }


    ////////////////////////////////////////////////////////////////////////////////////:
    public List<reclamation> getReclamation(){
        File queryFile = new File("data/reclamtionQuery.txt");
        String queryString = FileTool.getContents(queryFile);
        List<reclamation> results = new ArrayList<>();

        try {
            Query query = QueryFactory.create(queryString);
            QueryExecution queryExecution = QueryExecutionFactory.create(query, rdfModel);

            ResultSet resultSet = queryExecution.execSelect();
            System.out.println("==========================");

            while (resultSet.hasNext()) {
                QuerySolution solution = resultSet.nextSolution();
                System.out.println("==========================");
                System.out.println(solution);
                System.out.println(resultSet);
                System.out.println("==========================");
                reclamation result = new reclamation();
                result.setSujet(solution.get("sujet").toString());
                result.setMessage(solution.get("message").toString());
                result.setOffreemploi(solution.get("offreemploi").toString());
                result.setContact(solution.get("contact").toString());



                results.add(result);
            }
        } catch (QueryParseException e) {
            // Handle query parsing error
        } catch (Exception e) {
            // Handle other exceptions
        }

        return results;
    }




}
