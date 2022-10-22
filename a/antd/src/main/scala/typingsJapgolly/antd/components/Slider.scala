package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.antdBooleans.`true`
import typingsJapgolly.antd.libSliderMod.SliderMarks
import typingsJapgolly.antd.libSliderMod.SliderRange
import typingsJapgolly.antd.libSliderMod.SliderRangeProps
import typingsJapgolly.antd.libSliderMod.SliderSingleProps
import typingsJapgolly.antd.libSliderMod.SliderTooltipProps
import typingsJapgolly.antd.libTooltipMod.TooltipPlacement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  object SliderRangePropsRefAttributes {
    
    inline def apply(range: `true` | SliderRange): Builder = {
      val __props = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[SliderRangeProps & RefAttributes[Any]]))
    }
    
    @JSImport("antd", "Slider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: js.Tuple2[Double, Double]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
      
      inline def getTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getTooltipPopupContainer", js.Any.fromFunction1(value))
      
      inline def handleStyle(value: js.Array[CSSProperties]): this.type = set("handleStyle", value.asInstanceOf[js.Any])
      
      inline def handleStyleVarargs(value: CSSProperties*): this.type = set("handleStyle", js.Array(value*))
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
      
      inline def marks(value: SliderMarks): this.type = set("marks", value.asInstanceOf[js.Any])
      
      inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
      
      inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
      
      inline def onAfterChange(value: /* value */ js.Tuple2[Double, Double] => Callback): this.type = set("onAfterChange", js.Any.fromFunction1((t0: /* value */ js.Tuple2[Double, Double]) => value(t0).runNow()))
      
      inline def onChange(value: /* value */ js.Tuple2[Double, Double] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.Tuple2[Double, Double]) => value(t0).runNow()))
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
      
      inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
      
      inline def stepNull: this.type = set("step", null)
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def tipFormatter(value: /* value */ js.UndefOr[Double] => japgolly.scalajs.react.facade.React.Node): this.type = set("tipFormatter", js.Any.fromFunction1(value))
      
      inline def tipFormatterNull: this.type = set("tipFormatter", null)
      
      inline def tooltip(value: SliderTooltipProps): this.type = set("tooltip", value.asInstanceOf[js.Any])
      
      inline def tooltipPlacement(value: TooltipPlacement): this.type = set("tooltipPlacement", value.asInstanceOf[js.Any])
      
      inline def tooltipPrefixCls(value: String): this.type = set("tooltipPrefixCls", value.asInstanceOf[js.Any])
      
      inline def tooltipVisible(value: Boolean): this.type = set("tooltipVisible", value.asInstanceOf[js.Any])
      
      inline def trackStyle(value: js.Array[CSSProperties]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
      
      inline def trackStyleVarargs(value: CSSProperties*): this.type = set("trackStyle", js.Array(value*))
      
      inline def value(value: js.Tuple2[Double, Double]): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: SliderRangeProps & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SliderSinglePropsRefAttributes {
    
    @JSImport("antd", "Slider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
      
      inline def getTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getTooltipPopupContainer", js.Any.fromFunction1(value))
      
      inline def handleStyle(value: CSSProperties): this.type = set("handleStyle", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
      
      inline def marks(value: SliderMarks): this.type = set("marks", value.asInstanceOf[js.Any])
      
      inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
      
      inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
      
      inline def onAfterChange(value: /* value */ Double => Callback): this.type = set("onAfterChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def onChange(value: /* value */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def range(value: `false`): this.type = set("range", value.asInstanceOf[js.Any])
      
      inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
      
      inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
      
      inline def stepNull: this.type = set("step", null)
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def tipFormatter(value: /* value */ js.UndefOr[Double] => japgolly.scalajs.react.facade.React.Node): this.type = set("tipFormatter", js.Any.fromFunction1(value))
      
      inline def tipFormatterNull: this.type = set("tipFormatter", null)
      
      inline def tooltip(value: SliderTooltipProps): this.type = set("tooltip", value.asInstanceOf[js.Any])
      
      inline def tooltipPlacement(value: TooltipPlacement): this.type = set("tooltipPlacement", value.asInstanceOf[js.Any])
      
      inline def tooltipPrefixCls(value: String): this.type = set("tooltipPrefixCls", value.asInstanceOf[js.Any])
      
      inline def tooltipVisible(value: Boolean): this.type = set("tooltipVisible", value.asInstanceOf[js.Any])
      
      inline def trackStyle(value: CSSProperties): this.type = set("trackStyle", value.asInstanceOf[js.Any])
      
      inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: SliderSinglePropsRefAttributes.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SliderSingleProps & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
