package typingsJapgolly.reactDashRouter

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponentRef[C /* <: ComponentType[_] */] extends js.Object {
  var wrappedComponentRef: js.UndefOr[Ref] = js.undefined
}

object Anon_WrappedComponentRef {
  @scala.inline
  def apply[C /* <: ComponentType[_] */](wrappedComponentRef: Ref = null): Anon_WrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    if (wrappedComponentRef != null) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WrappedComponentRef[C]]
  }
}

