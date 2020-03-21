package typingsJapgolly.stringReplaceWebpackPlugin.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplacementItem extends js.Object {
  /**
    * a regex to match against the file contents
    */
  var pattern: js.RegExp
  /**
    * an ECMAScript string replacement function
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace#Specifying_a_function_as_a_parameter
    */
  def replacement(substring: String, args: js.Any*): String
}

object ReplacementItem {
  @scala.inline
  def apply(pattern: js.RegExp, replacement: (String, /* repeated */ js.Any) => CallbackTo[String]): ReplacementItem = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("replacement")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => replacement(t0, t1).runNow()))
    __obj.asInstanceOf[ReplacementItem]
  }
}

