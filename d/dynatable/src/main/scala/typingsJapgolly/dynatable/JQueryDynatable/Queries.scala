package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queries extends js.Object {
  /** functions object for Queries */
  var functions: QueriesFunctions
  /**
    * Add a new condition in the queries
    *
    * @param name The key for for the query
    * @param value The value we wish to find
    * @return A reference to the related Dynatable object
    */
  def add(name: String, value: js.Any): Dynatable
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
  def run(): js.Any
  /**
    * Shortcut for performing simple query from built-in search
    *
    * @param q The value that will be searched for
    */
  def runSearch(q: js.Any): Unit
  /** Set up the input fields for creating queries */
  def setupInputs(): Unit
}

object Queries {
  @scala.inline
  def apply(
    add: (String, js.Any) => CallbackTo[Dynatable],
    functions: QueriesFunctions,
    init: Callback,
    initOnLoad: CallbackTo[Boolean],
    remove: String => CallbackTo[Dynatable],
    run: CallbackTo[js.Any],
    runSearch: js.Any => Callback,
    setupInputs: Callback
  ): Queries = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => add(t0, t1).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("initOnLoad")(initOnLoad.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.updateDynamic("runSearch")(js.Any.fromFunction1((t0: js.Any) => runSearch(t0).runNow()))
    __obj.updateDynamic("setupInputs")(setupInputs.toJsFn)
    __obj.asInstanceOf[Queries]
  }
}

