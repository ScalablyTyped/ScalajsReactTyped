package typingsJapgolly.mobxDashReactDashLite.distObserverMod

import typingsJapgolly.mobxDashReactDashLite.Anon_ForwardRef
import typingsJapgolly.react.reactMod.ForwardRefExoticComponent
import typingsJapgolly.react.reactMod.FunctionComponent
import typingsJapgolly.react.reactMod.MemoExoticComponent
import typingsJapgolly.react.reactMod.PropsWithoutRef
import typingsJapgolly.react.reactMod.RefAttributes
import typingsJapgolly.react.reactMod.RefForwardingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/observer", "observer")
@js.native
object observer extends js.Object {
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = js.native
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = js.native
  def apply[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptions with Anon_ForwardRef): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
}

