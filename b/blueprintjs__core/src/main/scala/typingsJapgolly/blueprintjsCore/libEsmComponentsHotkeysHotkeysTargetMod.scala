package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.blueprintjsCore.anon.DisplayName
import typingsJapgolly.blueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHotkeysHotkeysTargetMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): DisplayName & T = ^.asInstanceOf[js.Dynamic].applyDynamic("HotkeysTarget")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[DisplayName & T]
  
  @js.native
  trait IHotkeysTargetComponent
    extends Component[js.Object, js.Object, Any] {
    
    /**
      * Components decorated with the `@HotkeysTarget` decorator must implement
      * this method, and it must return a `Hotkeys` React element.
      */
    def renderHotkeys(): Element = js.native
  }
}
