package typingsJapgolly.microsoftAjax

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Provides extensions to the base ECMAScript (JavaScript) Boolean object.
* Boolean Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb397557(v=vs.100).aspx}
*/
trait BooleanConstructor extends js.Object {
  //#region Extensions
  /**
    * Converts a string representation of a logical value to its Boolean object equivalent.
    */
  def parse(value: java.lang.String): Boolean
}

object BooleanConstructor {
  @scala.inline
  def apply(parse: java.lang.String => CallbackTo[Boolean]): BooleanConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[BooleanConstructor]
  }
}

