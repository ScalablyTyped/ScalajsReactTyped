package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.constructorMod.IConstructor
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenuTarget", JSImport.Namespace)
@js.native
object contextMenuTargetMod extends js.Object {
  @js.native
  trait IContextMenuTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    var onContextMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
    def renderContextMenu(e: ReactMouseEventFrom[HTMLElement]): js.UndefOr[Element] = js.native
  }
  
  def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): AnonInstantiable with T = js.native
}

