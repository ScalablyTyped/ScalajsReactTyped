package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsSliderSliderMod.SliderProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsSliderSliderMod.Style
import typingsJapgolly.wixUiCore.wixUiCoreStrings.across
import typingsJapgolly.wixUiCore.wixUiCoreStrings.always
import typingsJapgolly.wixUiCore.wixUiCoreStrings.bar
import typingsJapgolly.wixUiCore.wixUiCoreStrings.circle
import typingsJapgolly.wixUiCore.wixUiCoreStrings.count
import typingsJapgolly.wixUiCore.wixUiCoreStrings.dot
import typingsJapgolly.wixUiCore.wixUiCoreStrings.horizontal
import typingsJapgolly.wixUiCore.wixUiCoreStrings.hover
import typingsJapgolly.wixUiCore.wixUiCoreStrings.line
import typingsJapgolly.wixUiCore.wixUiCoreStrings.middle
import typingsJapgolly.wixUiCore.wixUiCoreStrings.none
import typingsJapgolly.wixUiCore.wixUiCoreStrings.normal
import typingsJapgolly.wixUiCore.wixUiCoreStrings.rectangle
import typingsJapgolly.wixUiCore.wixUiCoreStrings.square
import typingsJapgolly.wixUiCore.wixUiCoreStrings.value
import typingsJapgolly.wixUiCore.wixUiCoreStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  inline def apply(`aria-label`: String): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SliderProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.Slider] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onChange(value: /* x */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* x */ Any) => value(t0).runNow()))
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def stepType(value: value | count): this.type = set("stepType", value.asInstanceOf[js.Any])
    
    inline def style(value: Style): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def thumbShape(value: circle | square | rectangle | bar): this.type = set("thumbShape", value.asInstanceOf[js.Any])
    
    inline def tickMarksPosition(value: normal | middle | across): this.type = set("tickMarksPosition", value.asInstanceOf[js.Any])
    
    inline def tickMarksShape(value: none | line | dot): this.type = set("tickMarksShape", value.asInstanceOf[js.Any])
    
    inline def tooltipPosition(value: normal | across): this.type = set("tooltipPosition", value.asInstanceOf[js.Any])
    
    inline def tooltipPrefix(value: String): this.type = set("tooltipPrefix", value.asInstanceOf[js.Any])
    
    inline def tooltipSuffix(value: String): this.type = set("tooltipSuffix", value.asInstanceOf[js.Any])
    
    inline def tooltipVisibility(value: none | always | hover): this.type = set("tooltipVisibility", value.asInstanceOf[js.Any])
    
    inline def trackSize(value: Double): this.type = set("trackSize", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
