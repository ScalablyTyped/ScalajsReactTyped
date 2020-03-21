package typingsJapgolly.router5.routerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener
  extends /* key */ StringDictionary[js.Any] {
  def next(`val`: js.Any): js.Object
}

object Listener {
  @scala.inline
  def apply(next: js.Any => CallbackTo[js.Object], StringDictionary: /* key */ StringDictionary[js.Any] = null): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: js.Any) => next(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Listener]
  }
}

