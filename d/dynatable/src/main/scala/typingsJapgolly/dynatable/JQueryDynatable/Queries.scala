package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queries extends StObject {
  
  /**
    * Add a new condition in the queries
    *
    * @param name The key for for the query
    * @param value The value we wish to find
    * @return A reference to the related Dynatable object
    */
  def add(name: String, value: Any): Dynatable
  
  /** functions object for Queries */
  var functions: QueriesFunctions
  
  /** Set up the initial search parameters */
  def init(): Unit
  
  /**
    * Check if search feature is enabled
    *
    * @return A boolean if search feature is enabled
    */
  def initOnLoad(): Boolean
  
  /**
    * Remove the query from the dataset
    *
    * @param name The key for for the query to be removed
    * @return A reference to the related Dynatable object
    */
  def remove(name: String): Dynatable
  
  /**  Run a search with all the saved queries */
  def run(): Any
  
  /**
    * Shortcut for performing simple query from built-in search
    *
    * @param q The value that will be searched for
    */
  def runSearch(q: Any): Unit
  
  /** Set up the input fields for creating queries */
  def setupInputs(): Unit
}
object Queries {
  
  inline def apply(
    add: (String, Any) => Dynatable,
    functions: QueriesFunctions,
    init: Callback,
    initOnLoad: CallbackTo[Boolean],
    remove: String => Dynatable,
    run: CallbackTo[Any],
    runSearch: Any => Callback,
    setupInputs: Callback
  ): Queries = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), functions = functions.asInstanceOf[js.Any], init = init.toJsFn, initOnLoad = initOnLoad.toJsFn, remove = js.Any.fromFunction1(remove), run = run.toJsFn, runSearch = js.Any.fromFunction1((t0: Any) => runSearch(t0).runNow()), setupInputs = setupInputs.toJsFn)
    __obj.asInstanceOf[Queries]
  }
  
  extension [Self <: Queries](x: Self) {
    
    inline def setAdd(value: (String, Any) => Dynatable): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setFunctions(value: QueriesFunctions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitOnLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "initOnLoad", value.toJsFn)
    
    inline def setRemove(value: String => Dynatable): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRun(value: CallbackTo[Any]): Self = StObject.set(x, "run", value.toJsFn)
    
    inline def setRunSearch(value: Any => Callback): Self = StObject.set(x, "runSearch", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetupInputs(value: Callback): Self = StObject.set(x, "setupInputs", value.toJsFn)
  }
}
