package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeColorsSpacing
import typingsJapgolly.cathoQuantum.anon.From
import typingsJapgolly.cathoQuantum.anon.LabelValue
import typingsJapgolly.cathoQuantum.cathoQuantumBooleans.`false`
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.auto
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.inverted
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.normal
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.off
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.on
import typingsJapgolly.cathoQuantum.rangeSliderMod.RangeSliderProps
import typingsJapgolly.cathoQuantum.rangeSliderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangeSlider {
  
  @JSImport("@catho/quantum/RangeSlider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Double | From): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def marks(value: js.Array[LabelValue]): this.type = set("marks", value.asInstanceOf[js.Any])
    
    inline def marksVarargs(value: LabelValue*): this.type = set("marks", js.Array(value*))
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onChangeCommitted(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onChangeCommitted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def theme(value: BaseFontSizeColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tipFormatter(value: (/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double]) => String): this.type = set("tipFormatter", js.Any.fromFunction2(value))
    
    inline def track(value: normal | `false` | inverted): this.type = set("track", value.asInstanceOf[js.Any])
    
    inline def value(value: Double | From): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueLabelDisplay(value: auto | on | off): this.type = set("valueLabelDisplay", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RangeSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RangeSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
