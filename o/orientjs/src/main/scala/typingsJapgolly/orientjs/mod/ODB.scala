package typingsJapgolly.orientjs.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import typingsJapgolly.orientjs.orientjsStrings.document
import typingsJapgolly.orientjs.orientjsStrings.graph
import typingsJapgolly.orientjs.orientjsStrings.memory
import typingsJapgolly.orientjs.orientjsStrings.plocal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "ODB")
@js.native
open class ODB () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  var `class`: OClass = js.native
  
  var cluster: OCluster = js.native
  
  /**
    * Configure the database instance.
    * @param  config The configuration for the database.
    * @return            The configured database object.
    */
  def configure(config: DbConfig): ODB = js.native
  
  /**
    * Create a create query.
    *
    * @return The query instance.
    */
  def create(): OStatement = js.native
  def create(params: Any): OStatement = js.native
  def create(paramtype: String, paramname: String): OStatement = js.native
  
  def createFn(fn: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = js.native
  def createFn(fn: js.Function1[/* repeated */ Any, Any], options: Any): js.Promise[Any] = js.native
  /**
    * Create a orient function from a plain Javascript function
    *
    * @param   name     The name of the function
    * @param   fn       Plain Javascript function to stringify
    * @param   options  Not currently used but will be used for 'IDEMPOTENT' arg
    * @promise {Mixed}           The results of the query / command.
    */
  def createFn(name: String, fn: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = js.native
  def createFn(name: String, fn: js.Function1[/* repeated */ Any, Any], options: Any): js.Promise[Any] = js.native
  
  /**
    * Create a query instance for this database.
    *
    * @return The query instance.
    */
  def createQuery(): OStatement = js.native
  
  /**
    * Create a context for a user, using their authentication token.
    * The context includes the query builder methods, which will be executed
    * on behalf of the user.
    *
    * @param  token The authentication token.
    * @return              The object containing the query builder methods.
    */
  def createUserContext(token: Any): Any = js.native
  
  var dataSegments: js.Array[Any] = js.native
  
  /**
    * Create a delete query.
    *
    * @return The query instance.
    */
  def delete(): OStatement = js.native
  def delete(params: Any): OStatement = js.native
  
  /**
    * Escape the given input.
    *
    * @param  input The input to escape.
    * @return       The escaped input.
    */
  def escape(input: String): String = js.native
  
  /**
    * Execute an SQL query against the database and retreive the raw, parsed response.
    *
    * @param   query   The query or command to execute.
    * @param   options The options for the query / command.
    * @promise {Mixed}          The results of the query / command.
    */
  def exec[R](query: String): js.Promise[R] = js.native
  def exec[R](query: String, options: QueryOptions): js.Promise[R] = js.native
  
  var forcePrepare: Boolean = js.native
  
  /**
    * Create a transactional query with if.
    *
    * @param condition
    * @param statements
    * @returns
    */
  def `if`(condition: OSqlExpression, statements: OStatement*): OStatement = js.native
  /**
    * Create a transactional query with if.
    *
    * @param condition
    * @param statements
    * @returns
    */
  def `if`(condition: OSqlExpression, statements: js.Array[OStatement]): OStatement = js.native
  
  var index: OIndex = js.native
  
  /**
    * Initialize the database instance.
    */
  def init(): Unit = js.native
  
  /**
    * Create an insert query.
    *
    * @return The query instance.
    */
  def insert(): OStatement = js.native
  def insert(params: Any): OStatement = js.native
  
  /**
    * Create a transactional query.
    *
    * @return The query instance.
    */
  def let(): OStatement = js.native
  def let(name: String, value: String): OStatement = js.native
  def let(name: String, value: OStatement): OStatement = js.native
  def let(params: Any): OStatement = js.native
  
  var name: String = js.native
  
  /**
    * Normalize a result, where possible.
    * @param  result The result to normalize.
    * @return        The normalized result.
    */
  def normalizeResult(result: Any): Any = js.native
  
  /**
    * Normalize the content for a result.
    * @param  content The content to normalize.
    * @return         The normalized content.
    */
  def normalizeResultContent(content: Any): Any = js.native
  
  /**
    * Open the database.
    *
    * @promise {Db} The open db instance.
    */
  def open(): js.Promise[ODB] = js.native
  
  var password: String = js.native
  
  /**
    * Create a raw expression.
    *
    * @return The raw expression instance.
    */
  def rawExpression(param: String): ORawExpression = js.native
  
  var record: ORecord = js.native
  
  /**
    * Register a transformer function for documents of the given class.
    * This function will be invoked for each document of the specified class
    * in all future result sets.
    *
    * @param    className   The name of the document class.
    * @param  transformer The transformer function.
    * @return                   The database instance.
    */
  def registerTransformer[T](className: String, transformer: js.Function1[/* item */ ORecord, T]): ODB = js.native
  
  /**
    * Reload the configuration for the database.
    *
    * @promise {Db}  The database with reloaded configuration.
    */
  def reload(): js.Promise[ODB] = js.native
  
  /**
    * Create a select query.
    *
    * @return The query instance.
    */
  def select(): OStatement = js.native
  def select(params: Any): OStatement = js.native
  
  /**
    * Send the given operation to the server, ensuring the
    * database is open first.
    *
    * @param  operation The operation to send.
    * @param  data       The data for the operation.
    * @promise {Mixed}            The result of the operation.
    */
  def send[R](operation: Double, data: Any): js.Promise[R] = js.native
  
  var sequence: OSequence = js.native
  
  var server: OServer = js.native
  
  var sessionId: Double = js.native
  
  /**
    * Create a sql Function.
    *
    * @param [options]
    * @returns
    */
  def sqlFunction(): OSqlFunction = js.native
  def sqlFunction(options: Any): OSqlFunction = js.native
  
  var storage: plocal | memory = js.native
  
  var token: Any = js.native
  
  var transactionId: Double = js.native
  
  /**
    * Transform a document according to its `@class` property, using the registered transformers.
    * @param  document The document to transform.
    * @return           The transformed document.
    */
  def transformDocument(document: ODocument): Any = js.native
  
  var transformerFunctions: Any = js.native
  
  var transformers: Any = js.native
  
  /**
    * Create a traverse query.
    *
    * @return The query instance.
    */
  def traverse(): OStatement = js.native
  def traverse(params: Any): OStatement = js.native
  
  var `type`: graph | document = js.native
  
  /**
    * Create an update query.
    *
    * @return The query instance.
    */
  def update(): OStatement = js.native
  def update(params: Any): OStatement = js.native
  
  var username: String = js.native
}
