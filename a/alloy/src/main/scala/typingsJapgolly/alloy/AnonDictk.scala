package typingsJapgolly.alloy

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictk
  extends /* k */ StringDictionary[js.Any] {
  def instance(name: String): js.Any
}

object AnonDictk {
  @scala.inline
  def apply(instance: String => CallbackTo[js.Any], StringDictionary: /* k */ StringDictionary[js.Any] = null): AnonDictk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instance")(js.Any.fromFunction1((t0: java.lang.String) => instance(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictk]
  }
}

