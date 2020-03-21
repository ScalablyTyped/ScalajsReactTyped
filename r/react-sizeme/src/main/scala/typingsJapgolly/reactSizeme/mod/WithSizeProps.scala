package typingsJapgolly.reactSizeme.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSizeme.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithSizeProps extends js.Object {
  var onSize: js.UndefOr[WithSizeOnSizeCallback] = js.undefined
}

object WithSizeProps {
  @scala.inline
  def apply(onSize: /* size */ AnonHeight => Callback = null): WithSizeProps = {
    val __obj = js.Dynamic.literal()
    if (onSize != null) __obj.updateDynamic("onSize")(js.Any.fromFunction1((t0: /* size */ typingsJapgolly.reactSizeme.AnonHeight) => onSize(t0).runNow()))
    __obj.asInstanceOf[WithSizeProps]
  }
}

