package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.tableSemanticStyledComponentsMod.StyledTableHeadCellProps
import typingsJapgolly.baseui.tableSemanticTypesMod.Divider
import typingsJapgolly.baseui.tableSemanticTypesMod.Size
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledTableHeadCell {
  
  inline def apply[C /* <: ElementType */](): Builder[C] = {
    val __props = js.Dynamic.literal()
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyledTableHeadCellProps])]))
  }
  
  @JSImport("baseui/table-semantic", "StyledTableHeadCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $col(value: js.Object): this.type = set("$col", value.asInstanceOf[js.Any])
    
    inline def $colIndex(value: Double): this.type = set("$colIndex", value.asInstanceOf[js.Any])
    
    inline def $colIndexNull: this.type = set("$colIndex", null)
    
    inline def $divider(value: Divider): this.type = set("$divider", value.asInstanceOf[js.Any])
    
    inline def $isNumeric(value: Boolean): this.type = set("$isNumeric", value.asInstanceOf[js.Any])
    
    inline def $isNumericNull: this.type = set("$isNumeric", null)
    
    inline def $size(value: Size): this.type = set("$size", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[StyledTableHeadCellProps, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: StyledTableHeadCellProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make[C /* <: ElementType */](companion: StyledTableHeadCell.type): Builder[C] = new Builder[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyledTableHeadCellProps])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
