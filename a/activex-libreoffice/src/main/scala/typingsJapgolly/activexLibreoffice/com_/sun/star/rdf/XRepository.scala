package typingsJapgolly.activexLibreoffice.com_.sun.star.rdf

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a set of named RDF graphs.
  *
  * A repository for storing information according to the data model of the [Resource Description Framework]{@link url="http://www.w3.org/RDF/"} . This
  * interface may be used e.g. for repositories that correspond to a loaded ODF document, or for repositories that are backed by some kind of database.
  *
  * The RDF triples are stored as a set of named RDF graphs. Importing and exporting files in the [RDF/XML]{@link
  * url="http://www.w3.org/TR/rdf-syntax-grammar/"} format is supported. Support for other file formats is optional. Support for querying the repository
  * with the [SPARQL]{@link url="http://www.w3.org/TR/rdf-sparql-query/"} query language is provided.
  * @see XRepositorySupplier
  * @see XDocumentRepository
  * @since OOo 3.2
  */
trait XRepository extends StObject {
  
  /**
    * gets the names of all the graphs in the repository.
    * @returns a list containing the names of the graphs in the repository
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  val GraphNames: SafeArray[XURI]
  
  /**
    * creates a fresh unique blank node.
    * @returns a newly generated blank node which is unique in this repository
    */
  def createBlankNode(): XBlankNode
  
  /**
    * creates a graph with the given name.
    *
    * The name must be unique within the repository.
    * @param GraphName the name of the graph that is to be created
    * @returns the graph with the given name
    * @throws com::sun::star::lang::IllegalArgumentException if the given GraphName is invalid
    * @throws com::sun::star::container::ElementExistException if a graph with the given GraphName already exists
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def createGraph(GraphName: XURI): XNamedGraph
  
  /**
    * destroys the graph with the given name, and removes it from the repository.
    *
    * This invalidates any instances of {@link XNamedGraph} for the argument.
    * @param GraphName the name of the graph that is to be destroyed
    * @throws com::sun::star::lang::IllegalArgumentException if the given GraphName is invalid
    * @throws com::sun::star::container::NoSuchElementException if a graph with the given GraphName does not exist
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def destroyGraph(GraphName: XURI): Unit
  
  /**
    * exports a named graph from the repository.
    *
    * Implementations must support RDF/XML format. Support for other RDF formats is optional. If the format is not supported by the implementation, an
    * {@link com.sun.star.datatransfer.UnsupportedFlavorException} is raised.
    * @param Format the format of the output file
    * @param OutStream the target output stream
    * @param GraphName the name of the graph that is to be exported
    * @param BaseURI a base {@link URI} to resolve relative {@link URI} references
    * @see FileFormat
    * @throws com::sun::star::lang::IllegalArgumentException if the given stream or the GraphName is `NULL` , or BaseURI is `NULL` and the format requires use
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the format requested is unknown or not supported
    * @throws com::sun::star::container::NoSuchElementException if a graph with the given GraphName does not exist
    * @throws RepositoryException if an error occurs when accessing the repository.
    * @throws com::sun::star::io::IOException if an I/O error occurs.
    */
  def exportGraph(Format: Double, OutStream: XOutputStream, GraphName: XURI, BaseURI: XURI): Unit
  
  /**
    * gets a graph by its name.
    * @param GraphName the name of the graph that is to be returned
    * @returns the graph with the given name if it exists, else `NULL`
    * @throws com::sun::star::lang::IllegalArgumentException if the given GraphName is invalid
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def getGraph(GraphName: XURI): XNamedGraph
  
  /**
    * gets the names of all the graphs in the repository.
    * @returns a list containing the names of the graphs in the repository
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def getGraphNames(): SafeArray[XURI]
  
  /**
    * gets matching RDF statements from the repository.
    *
    * Any parameter may be `NULL` , which acts as a wildcard. For example, to get all statements about myURI: `getStatements(myURI, null, null)`
    * @param Subject the subject of the RDF triple.
    * @param Predicate the predicate of the RDF triple.
    * @param Object the object of the RDF triple.
    * @returns an iterator over all RDF statements in the repository that match the parameters, represented as an enumeration of {@link Statement}
    * @see Statement
    * @see XNamedGraph.getStatements
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def getStatements(Subject: XResource, Predicate: XURI, Object: XNode): XEnumeration
  
  /**
    * imports a named graph into the repository.
    *
    * Implementations must support RDF/XML format. Support for other RDF formats is optional. If the format is not supported by the implementation, an
    * {@link com.sun.star.datatransfer.UnsupportedFlavorException} is raised. If the format requires use of a BaseURI, but none is given, an {@link
    * com.sun.star.lang.IllegalArgumentException} is raised.
    * @param Format the format of the input file
    * @param InStream the input stream, containing an RDF file in the specified format
    * @param GraphName the name of the graph that is imported
    * @param BaseURI a base {@link URI} to resolve relative {@link URI} references
    * @returns the imported graph
    * @see FileFormat
    * @throws com::sun::star::lang::IllegalArgumentException if the given stream or the GraphName is `NULL` , or BaseURI is `NULL` and the format requires use
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the format requested is unknown or not supported
    * @throws com::sun::star::container::ElementExistException if a graph with the given GraphName already exists in the repository
    * @throws ParseException if the input does not conform to the specified file format.
    * @throws RepositoryException if an error occurs when accessing the repository.
    * @throws com::sun::star::io::IOException if an I/O error occurs.
    */
  def importGraph(Format: Double, InStream: XInputStream, GraphName: XURI, BaseURI: XURI): XNamedGraph
  
  /**
    * executes a SPARQL "ASK" query.
    *
    * This method runs a SPARQL query that computes a boolean, i.e., a query beginning with "ASK".
    * @param Query the SPARQL query `string`
    * @returns the boolean query result
    * @throws QueryException if the query is malformed, or evaluation fails
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def queryAsk(Query: String): Boolean
  
  /**
    * executes a SPARQL "CONSTRUCT" query.
    *
    * This method runs a SPARQL query that constructs a result graph, i.e., a query beginning with "CONSTRUCT".
    * @param Query the SPARQL query `string`
    * @returns an iterator over the query result graph, represented as an enumeration of {@link Statement}
    * @see Statement
    * @throws QueryException if the query is malformed, or evaluation fails
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def queryConstruct(Query: String): XEnumeration
  
  /**
    * executes a SPARQL "SELECT" query.
    *
    * This method runs a SPARQL query that returns a list of variable bindings, i.e., a query beginning with "SELECT". The result is basically a
    * (rectangular) table with labeled columns, where individual cells may be `NULL` .
    * @param Query the SPARQL query `string`
    * @returns an enumeration, containing {{ordered list here, see documentation}}
    * @see XQuerySelectResult
    * @throws QueryException if the query is malformed, or evaluation fails
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def querySelect(Query: String): XQuerySelectResult
}
object XRepository {
  
  inline def apply(
    GraphNames: SafeArray[XURI],
    createBlankNode: CallbackTo[XBlankNode],
    createGraph: XURI => XNamedGraph,
    destroyGraph: XURI => Callback,
    exportGraph: (Double, XOutputStream, XURI, XURI) => Callback,
    getGraph: XURI => XNamedGraph,
    getGraphNames: CallbackTo[SafeArray[XURI]],
    getStatements: (XResource, XURI, XNode) => XEnumeration,
    importGraph: (Double, XInputStream, XURI, XURI) => XNamedGraph,
    queryAsk: String => Boolean,
    queryConstruct: String => XEnumeration,
    querySelect: String => XQuerySelectResult
  ): XRepository = {
    val __obj = js.Dynamic.literal(GraphNames = GraphNames.asInstanceOf[js.Any], createBlankNode = createBlankNode.toJsFn, createGraph = js.Any.fromFunction1(createGraph), destroyGraph = js.Any.fromFunction1((t0: XURI) => destroyGraph(t0).runNow()), exportGraph = js.Any.fromFunction4((t0: Double, t1: XOutputStream, t2: XURI, t3: XURI) => (exportGraph(t0, t1, t2, t3)).runNow()), getGraph = js.Any.fromFunction1(getGraph), getGraphNames = getGraphNames.toJsFn, getStatements = js.Any.fromFunction3(getStatements), importGraph = js.Any.fromFunction4(importGraph), queryAsk = js.Any.fromFunction1(queryAsk), queryConstruct = js.Any.fromFunction1(queryConstruct), querySelect = js.Any.fromFunction1(querySelect))
    __obj.asInstanceOf[XRepository]
  }
  
  extension [Self <: XRepository](x: Self) {
    
    inline def setCreateBlankNode(value: CallbackTo[XBlankNode]): Self = StObject.set(x, "createBlankNode", value.toJsFn)
    
    inline def setCreateGraph(value: XURI => XNamedGraph): Self = StObject.set(x, "createGraph", js.Any.fromFunction1(value))
    
    inline def setDestroyGraph(value: XURI => Callback): Self = StObject.set(x, "destroyGraph", js.Any.fromFunction1((t0: XURI) => value(t0).runNow()))
    
    inline def setExportGraph(value: (Double, XOutputStream, XURI, XURI) => Callback): Self = StObject.set(x, "exportGraph", js.Any.fromFunction4((t0: Double, t1: XOutputStream, t2: XURI, t3: XURI) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetGraph(value: XURI => XNamedGraph): Self = StObject.set(x, "getGraph", js.Any.fromFunction1(value))
    
    inline def setGetGraphNames(value: CallbackTo[SafeArray[XURI]]): Self = StObject.set(x, "getGraphNames", value.toJsFn)
    
    inline def setGetStatements(value: (XResource, XURI, XNode) => XEnumeration): Self = StObject.set(x, "getStatements", js.Any.fromFunction3(value))
    
    inline def setGraphNames(value: SafeArray[XURI]): Self = StObject.set(x, "GraphNames", value.asInstanceOf[js.Any])
    
    inline def setImportGraph(value: (Double, XInputStream, XURI, XURI) => XNamedGraph): Self = StObject.set(x, "importGraph", js.Any.fromFunction4(value))
    
    inline def setQueryAsk(value: String => Boolean): Self = StObject.set(x, "queryAsk", js.Any.fromFunction1(value))
    
    inline def setQueryConstruct(value: String => XEnumeration): Self = StObject.set(x, "queryConstruct", js.Any.fromFunction1(value))
    
    inline def setQuerySelect(value: String => XQuerySelectResult): Self = StObject.set(x, "querySelect", js.Any.fromFunction1(value))
  }
}
