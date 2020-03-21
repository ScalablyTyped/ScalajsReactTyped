package typingsJapgolly.x2js.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeConverter extends js.Object {
  /**
    * Will be called for every attribute where test() returns true, replacing the original value of the attribute.
    * 
    * @param {string} name
    * @param {*} value
    * @returns {string}
    * 
    * @memberOf X2JS.AttributeConverter
    */
  def convert(name: String, value: js.Any): String
  /**
    * Indicates whether an attribute should be converted.
    * 
    * @param {string} name
    * @param {*} value
    * @returns {boolean}
    * 
    * @memberOf X2JS.AttributeConverter
    */
  def test(name: String, value: js.Any): Boolean
}

object AttributeConverter {
  @scala.inline
  def apply(convert: (String, js.Any) => CallbackTo[String], test: (String, js.Any) => CallbackTo[Boolean]): AttributeConverter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convert")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => convert(t0, t1).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => test(t0, t1).runNow()))
    __obj.asInstanceOf[AttributeConverter]
  }
}

