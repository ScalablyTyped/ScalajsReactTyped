package typingsJapgolly.nivoBar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoBar.anon.Color
import typingsJapgolly.nivoBar.anon.Data
import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarItemProps
import typingsJapgolly.nivoBar.distTypesTypesMod.BarTooltipProps
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedDatum
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarItem {
  
  inline def apply[RawDatum /* <: BarDatum */](
    bar: ComputedBarDatum[RawDatum] & Data,
    borderRadius: Double,
    borderWidth: Double,
    isFocusable: Boolean,
    isInteractive: Boolean,
    label: String,
    shouldRenderLabel: Boolean,
    style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  borderColor :string,   color :string,   height :number,   labelColor :string,   labelOpacity :number,   labelX :number,   labelY :number,   opacity :number,   transform :string,   width :number}> */ Any,
    tooltip: FC[BarTooltipProps[RawDatum]]
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], isFocusable = isFocusable.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], shouldRenderLabel = shouldRenderLabel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[BarItemProps[RawDatum]]))
  }
  
  @JSImport("@nivo/bar", "BarItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: BarDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaDescribedBy(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): this.type = set("ariaDescribedBy", js.Any.fromFunction1(value))
    
    inline def ariaLabel(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): this.type = set("ariaLabel", js.Any.fromFunction1(value))
    
    inline def ariaLabelledBy(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): this.type = set("ariaLabelledBy", js.Any.fromFunction1(value))
    
    inline def onClick(
      value: (/* datum */ ComputedDatum[RawDatum] & Color, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum] & Color, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[RawDatum /* <: BarDatum */](p: BarItemProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
