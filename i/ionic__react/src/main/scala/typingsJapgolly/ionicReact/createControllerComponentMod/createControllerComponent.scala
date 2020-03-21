package typingsJapgolly.ionicReact.createControllerComponentMod

import typingsJapgolly.ionicReact.AnonCreate
import typingsJapgolly.ionicReact.AnonForwardedRef
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/createControllerComponent", "createControllerComponent")
@js.native
object createControllerComponent extends js.Object {
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](displayName: String, controller: AnonCreate[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType with ReactControllerProps with AnonForwardedRef[OverlayType]]) with RefAttributes[OverlayType]
  ] = js.native
}

