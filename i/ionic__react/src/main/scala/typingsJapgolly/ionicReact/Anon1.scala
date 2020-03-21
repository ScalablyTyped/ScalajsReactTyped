package typingsJapgolly.ionicReact

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[OverlayType /* <: OverlayElement */] extends js.Object {
  var forwardedRef: js.UndefOr[RefHandle[OverlayType]] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](forwardedRef: RefHandle[OverlayType] = null): Anon1[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1[OverlayType]]
  }
}

