package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonContextMenuTargetWrapperMod.IContextMenuTargetWrapper
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContextMenuTargetWrapper {
  
  inline def apply(renderContextMenu: ReactMouseEventFrom[HTMLElement] => js.UndefOr[Element], style: CSSProperties): Builder = {
    val __props = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IContextMenuTargetWrapper]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/common/contextMenuTargetWrapper", "ContextMenuTargetWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.blueprintjsTable.libEsmCommonContextMenuTargetWrapperMod.ContextMenuTargetWrapper
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IContextMenuTargetWrapper): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
