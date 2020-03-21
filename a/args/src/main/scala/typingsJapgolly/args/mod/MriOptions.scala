package typingsJapgolly.args.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MriOptions extends js.Object {
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var boolean: js.UndefOr[String | js.Array[String]] = js.undefined
  var default: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var string: js.UndefOr[String | js.Array[String]] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* param */ String, Boolean]] = js.undefined
}

object MriOptions {
  @scala.inline
  def apply(
    alias: StringDictionary[String | js.Array[String]] = null,
    args: js.Array[String] = null,
    boolean: String | js.Array[String] = null,
    default: StringDictionary[js.Any] = null,
    string: String | js.Array[String] = null,
    unknown: /* param */ String => CallbackTo[Boolean] = null
  ): MriOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1((t0: /* param */ java.lang.String) => unknown(t0).runNow()))
    __obj.asInstanceOf[MriOptions]
  }
}

