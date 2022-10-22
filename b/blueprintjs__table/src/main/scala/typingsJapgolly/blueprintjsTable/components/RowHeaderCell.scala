package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmHeadersRowHeaderCellMod.IRowHeaderCellProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RowHeaderCell {
  
  @JSImport("@blueprintjs/table", "RowHeaderCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.RowHeaderCell] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def enableRowReordering(value: Boolean): this.type = set("enableRowReordering", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    inline def isRowSelected(value: Boolean): this.type = set("isRowSelected", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def menuRenderer(value: /* index */ js.UndefOr[Double] => Element): this.type = set("menuRenderer", js.Any.fromFunction1(value))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nameRenderer(
      value: (/* name */ String, /* index */ js.UndefOr[Double]) => japgolly.scalajs.react.facade.React.Element
    ): this.type = set("nameRenderer", js.Any.fromFunction2(value))
    
    inline def reorderHandle(value: VdomElement): this.type = set("reorderHandle", value.rawElement.asInstanceOf[js.Any])
    
    inline def resizeHandle(value: typingsJapgolly.blueprintjsTable.libEsmInteractionsResizeHandleMod.ResizeHandle): this.type = set("resizeHandle", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RowHeaderCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IRowHeaderCellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
