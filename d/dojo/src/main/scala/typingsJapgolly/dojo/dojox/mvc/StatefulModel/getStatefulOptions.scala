package typingsJapgolly.dojo.dojox.mvc.StatefulModel

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulModel.getStatefulOptions.html
  *
  * An object that defines how model object should be created from plain object hierarchy.
  *
  */
trait getStatefulOptions extends js.Object {
  /**
    * Create a stateful array from a plain array.
    *
    * @param a The plain array.
    */
  def getStatefulArray(a: js.Array[_]): js.Any
  /**
    * Create a stateful object from a plain object.
    *
    * @param o The plain object.
    */
  def getStatefulObject(o: js.Object): js.Any
  /**
    * Create a stateful value from a plain value.
    *
    * @param v The plain value.
    */
  def getStatefulValue(v: js.Any): js.Any
  /**
    * Returns the type of the given value.
    *
    * @param v The value.
    */
  def getType(v: js.Any): String
}

object getStatefulOptions {
  @scala.inline
  def apply(
    getStatefulArray: js.Array[js.Any] => CallbackTo[js.Any],
    getStatefulObject: js.Object => CallbackTo[js.Any],
    getStatefulValue: js.Any => CallbackTo[js.Any],
    getType: js.Any => CallbackTo[String]
  ): getStatefulOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatefulArray")(js.Any.fromFunction1((t0: js.Array[js.Any]) => getStatefulArray(t0).runNow()))
    __obj.updateDynamic("getStatefulObject")(js.Any.fromFunction1((t0: js.Object) => getStatefulObject(t0).runNow()))
    __obj.updateDynamic("getStatefulValue")(js.Any.fromFunction1((t0: js.Any) => getStatefulValue(t0).runNow()))
    __obj.updateDynamic("getType")(js.Any.fromFunction1((t0: js.Any) => getType(t0).runNow()))
    __obj.asInstanceOf[getStatefulOptions]
  }
}

