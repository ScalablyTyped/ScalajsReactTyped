package typingsJapgolly.reactRouter

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponentRef[C /* <: ComponentType[_] */] extends js.Object {
  var wrappedComponentRef: js.UndefOr[Ref] = js.undefined
}

object AnonWrappedComponentRef {
  @scala.inline
  def apply[C /* <: ComponentType[_] */](wrappedComponentRef: Ref = null): AnonWrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    if (wrappedComponentRef != null) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWrappedComponentRef[C]]
  }
}

