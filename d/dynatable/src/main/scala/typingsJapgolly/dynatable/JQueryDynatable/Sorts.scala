package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sorts extends js.Object {
  /** functions object for Sorts */
  var functions: SortsFunctions
  /**
    * Add a new sort in sortKeys
    *
    * @param attr The key for for the sorting
    * @param direction The sorting direction (-1 or +1)
    * @return A reference to the related Dynatable object
    */
  def add(attr: String, direction: Double): Dynatable
  /** Remove all the sortKeys */
  def clear(): Unit
  /**
    * Try to intelligently guess which sort function to use based on the type of attribute values.
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @return A string containing one of the types ('string' or 'number')
    */
  def guessType(a: js.Any, b: js.Any, attr: String): String
  /** Create and init the sorts */
  def init(): Unit
  /**
    * Check if sort feature is enabled
    *
    * @return A boolean if sort feature is enabled
    */
  def initOnLoad(): Boolean
  /**
    * Remove a sort attribute from the sortKeys
    *
    * @param attr The key to be removed from the sorting
    * @return A reference to the related Dynatable object
    */
  def remove(attr: String): Dynatable
}

object Sorts {
  @scala.inline
  def apply(
    add: (String, Double) => CallbackTo[Dynatable],
    clear: Callback,
    functions: SortsFunctions,
    guessType: (js.Any, js.Any, String) => CallbackTo[String],
    init: Callback,
    initOnLoad: CallbackTo[Boolean],
    remove: String => CallbackTo[Dynatable]
  ): Sorts = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => add(t0, t1).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("guessType")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: java.lang.String) => guessType(t0, t1, t2).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("initOnLoad")(initOnLoad.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[Sorts]
  }
}

