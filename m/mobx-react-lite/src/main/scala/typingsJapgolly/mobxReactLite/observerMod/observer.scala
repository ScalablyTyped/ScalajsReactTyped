package typingsJapgolly.mobxReactLite.observerMod

import typingsJapgolly.mobxReactLite.IObserverOptionsforwardRe
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.RefForwardingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/observer", "observer")
@js.native
object observer extends js.Object {
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = js.native
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = js.native
  def apply[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
}

