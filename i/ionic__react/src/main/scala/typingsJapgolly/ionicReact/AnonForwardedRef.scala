package typingsJapgolly.ionicReact

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRef[OverlayType /* <: OverlayBase */] extends js.Object {
  var forwardedRef: js.UndefOr[RefHandle[OverlayType]] = js.undefined
}

object AnonForwardedRef {
  @scala.inline
  def apply[OverlayType /* <: OverlayBase */](forwardedRef: RefHandle[OverlayType] = null): AnonForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRef[OverlayType]]
  }
}

