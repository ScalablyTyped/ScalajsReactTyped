package typingsJapgolly.nodeJsflRunner.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSFL
  extends /* index */ StringDictionary[js.Any] {
  def init(args: js.Any*): Unit
}

object JSFL {
  @scala.inline
  def apply(
    init: /* repeated */ js.Any => Callback,
    StringDictionary: /* index */ StringDictionary[js.Any] = null
  ): JSFL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => init(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSFL]
  }
}

