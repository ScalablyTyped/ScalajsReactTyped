package typingsJapgolly.showdown.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Helper Interface 
  */
trait Helper_
  extends /* key */ StringDictionary[js.Function1[/* repeated */ js.Any, _]] {
  def replaceRecursiveRegExp(args: js.Any*): String
}

object Helper_ {
  @scala.inline
  def apply(
    replaceRecursiveRegExp: /* repeated */ js.Any => CallbackTo[String],
    StringDictionary: /* key */ StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null
  ): Helper_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replaceRecursiveRegExp")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => replaceRecursiveRegExp(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Helper_]
  }
}

