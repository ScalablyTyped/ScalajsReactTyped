package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.blueprintjsCore.constructorMod.IConstructor
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysTarget", JSImport.Namespace)
@js.native
object hotkeysTargetMod extends js.Object {
  @js.native
  trait IHotkeysTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    /**
      * Components decorated with the `@HotkeysTarget` decorator must implement
      * this method, and it must return a `Hotkeys` React element.
      */
    def renderHotkeys(): Element = js.native
  }
  
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): AnonDisplayName with T = js.native
}

