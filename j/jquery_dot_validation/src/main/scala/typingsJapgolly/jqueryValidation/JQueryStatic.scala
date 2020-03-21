package typingsJapgolly.jqueryValidation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryValidation.JQueryValidation.ValidatorStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var validator: ValidatorStatic
  /**
    * Replaces {n} placeholders with arguments.
    *
    * @param template The string to format.
    */
  def format(template: String, arguments: String*): String
}

object JQueryStatic {
  @scala.inline
  def apply(format: (String, /* repeated */ String) => CallbackTo[String], validator: ValidatorStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(validator = validator.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ java.lang.String) => format(t0, t1).runNow()))
    __obj.asInstanceOf[JQueryStatic]
  }
}

