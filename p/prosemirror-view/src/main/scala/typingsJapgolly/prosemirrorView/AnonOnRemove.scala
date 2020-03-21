package typingsJapgolly.prosemirrorView

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRemove extends js.Object {
  var onRemove: js.UndefOr[(js.Function1[/* decorationSpec */ StringDictionary[js.Any], Unit]) | Null] = js.undefined
}

object AnonOnRemove {
  @scala.inline
  def apply(onRemove: /* decorationSpec */ StringDictionary[js.Any] => Callback = null): AnonOnRemove = {
    val __obj = js.Dynamic.literal()
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* decorationSpec */ org.scalablytyped.runtime.StringDictionary[js.Any]) => onRemove(t0).runNow()))
    __obj.asInstanceOf[AnonOnRemove]
  }
}

