package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.layoutGridTypesMod.Alignment
import typingsJapgolly.baseui.layoutGridTypesMod.CSSLengthUnit
import typingsJapgolly.baseui.layoutGridTypesMod.Responsive
import typingsJapgolly.baseui.layoutGridTypesMod.StyledCellProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableStyledCell {
  
  inline def apply[C /* <: ElementType */](): Builder[C] = {
    val __props = js.Dynamic.literal()
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyledCellProps])]))
  }
  
  @JSImport("baseui/layout-grid", "UnstableStyledCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $align(value: Responsive[Alignment]): this.type = set("$align", value.asInstanceOf[js.Any])
    
    inline def $alignVarargs(value: Alignment*): this.type = set("$align", js.Array(value*))
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $gridColumns(value: Responsive[Double]): this.type = set("$gridColumns", value.asInstanceOf[js.Any])
    
    inline def $gridColumnsVarargs(value: Double*): this.type = set("$gridColumns", js.Array(value*))
    
    inline def $gridGaps(value: Responsive[Double]): this.type = set("$gridGaps", value.asInstanceOf[js.Any])
    
    inline def $gridGapsVarargs(value: Double*): this.type = set("$gridGaps", js.Array(value*))
    
    inline def $gridGutters(value: Responsive[Double]): this.type = set("$gridGutters", value.asInstanceOf[js.Any])
    
    inline def $gridGuttersVarargs(value: Double*): this.type = set("$gridGutters", js.Array(value*))
    
    inline def $gridUnit(value: CSSLengthUnit): this.type = set("$gridUnit", value.asInstanceOf[js.Any])
    
    inline def $order(value: Responsive[Double]): this.type = set("$order", value.asInstanceOf[js.Any])
    
    inline def $orderVarargs(value: Double*): this.type = set("$order", js.Array(value*))
    
    inline def $skip(value: Responsive[Double]): this.type = set("$skip", value.asInstanceOf[js.Any])
    
    inline def $skipVarargs(value: Double*): this.type = set("$skip", js.Array(value*))
    
    inline def $span(value: Responsive[Double]): this.type = set("$span", value.asInstanceOf[js.Any])
    
    inline def $spanVarargs(value: Double*): this.type = set("$span", js.Array(value*))
    
    inline def $style(value: StyleObject | (js.Function1[StyledCellProps, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: StyledCellProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make[C /* <: ElementType */](companion: UnstableStyledCell.type): Builder[C] = new Builder[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyledCellProps])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
