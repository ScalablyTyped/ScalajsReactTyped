package typingsJapgolly.dojo.dojox.mvc.StatefulModel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojox.mvc.StatefulArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulModel.getPlainValueOptions.html
  *
  * An object that defines how plain value should be created from model object.
  *
  */
trait getPlainValueOptions extends js.Object {
  /**
    *
    * @param a
    */
  def getPlainArray(a: StatefulArray): js.Any
  /**
    *
    * @param o
    */
  def getPlainObject(o: typingsJapgolly.dojo.dojox.mvc.StatefulModel): js.Object
  /**
    *
    * @param v
    */
  def getPlainValue(v: js.Any): js.Any
  /**
    * Returns the type of the given value.
    *
    * @param v The value.
    */
  def getType(v: js.Any): String
}

object getPlainValueOptions {
  @scala.inline
  def apply(
    getPlainArray: StatefulArray => CallbackTo[js.Any],
    getPlainObject: typingsJapgolly.dojo.dojox.mvc.StatefulModel => CallbackTo[js.Object],
    getPlainValue: js.Any => CallbackTo[js.Any],
    getType: js.Any => CallbackTo[String]
  ): getPlainValueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPlainArray")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.mvc.StatefulArray) => getPlainArray(t0).runNow()))
    __obj.updateDynamic("getPlainObject")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.mvc.StatefulModel) => getPlainObject(t0).runNow()))
    __obj.updateDynamic("getPlainValue")(js.Any.fromFunction1((t0: js.Any) => getPlainValue(t0).runNow()))
    __obj.updateDynamic("getType")(js.Any.fromFunction1((t0: js.Any) => getType(t0).runNow()))
    __obj.asInstanceOf[getPlainValueOptions]
  }
}

