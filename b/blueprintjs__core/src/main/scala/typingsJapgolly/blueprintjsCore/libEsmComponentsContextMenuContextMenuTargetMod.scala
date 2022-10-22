package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.anon.Instantiable
import typingsJapgolly.blueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsContextMenuContextMenuTargetMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenuTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Instantiable & T = ^.asInstanceOf[js.Dynamic].applyDynamic("ContextMenuTarget")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable & T]
  
  @js.native
  trait IContextMenuTargetComponent
    extends Component[js.Object, js.Object, Any] {
    
    var onContextMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    def renderContextMenu(e: ReactMouseEventFrom[HTMLElement]): js.UndefOr[Element] = js.native
  }
}
