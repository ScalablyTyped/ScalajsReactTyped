package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeColorsSpacing
import typingsJapgolly.cathoQuantum.anon.From
import typingsJapgolly.cathoQuantum.anon.LabelValue
import typingsJapgolly.cathoQuantum.cathoQuantumBooleans.`false`
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.auto
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.inverted
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.normal
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.off
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.on
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeSliderMod {
  
  @JSImport("@catho/quantum/RangeSlider", JSImport.Default)
  @js.native
  open class default ()
    extends Component[RangeSliderProps, js.Object, Any]
  
  type RangeSlider = japgolly.scalajs.react.facade.React.Component[RangeSliderProps & js.Object, js.Object]
  
  trait RangeSliderProps extends StObject {
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[Double | From] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var marks: js.UndefOr[js.Array[LabelValue]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onChangeCommitted: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeColorsSpacing] = js.undefined
    
    var tipFormatter: js.UndefOr[
        js.Function2[/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double], String]
      ] = js.undefined
    
    var track: js.UndefOr[normal | `false` | inverted] = js.undefined
    
    var value: js.UndefOr[Double | From] = js.undefined
    
    var valueLabelDisplay: js.UndefOr[auto | on | off] = js.undefined
  }
  object RangeSliderProps {
    
    inline def apply(): RangeSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSliderProps]
    }
    
    extension [Self <: RangeSliderProps](x: Self) {
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setDefaultValue(value: Double | From): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMarks(value: js.Array[LabelValue]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMarksVarargs(value: LabelValue*): Self = StObject.set(x, "marks", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeCommitted(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChangeCommitted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeCommittedUndefined: Self = StObject.set(x, "onChangeCommitted", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTheme(value: BaseFontSizeColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTipFormatter(value: (/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double]) => String): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction2(value))
      
      inline def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      inline def setTrack(value: normal | `false` | inverted): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      inline def setValue(value: Double | From): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueLabelDisplay(value: auto | on | off): Self = StObject.set(x, "valueLabelDisplay", value.asInstanceOf[js.Any])
      
      inline def setValueLabelDisplayUndefined: Self = StObject.set(x, "valueLabelDisplay", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
