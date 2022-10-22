package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.Color
import typingsJapgolly.reactColor.anon.PartialClassesSketchPicke
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSketchSketchMod {
  
  @JSImport("react-color/lib/components/sketch/Sketch", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SketchPickerProps, js.Object, Any]
  
  type PresetColor = Color | String
  
  type SketchPicker = japgolly.scalajs.react.facade.React.Component[SketchPickerProps & js.Object, js.Object]
  
  trait SketchPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[SketchPickerProps & js.Object, js.Object]
        ] {
    
    var disableAlpha: js.UndefOr[Boolean] = js.undefined
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
    
    var presetColors: js.UndefOr[js.Array[PresetColor]] = js.undefined
    
    @JSName("styles")
    var styles_SketchPickerProps: js.UndefOr[PartialClassesSketchPicke] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object SketchPickerProps {
    
    inline def apply(): SketchPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SketchPickerProps]
    }
    
    extension [Self <: SketchPickerProps](x: Self) {
      
      inline def setDisableAlpha(value: Boolean): Self = StObject.set(x, "disableAlpha", value.asInstanceOf[js.Any])
      
      inline def setDisableAlphaUndefined: Self = StObject.set(x, "disableAlpha", js.undefined)
      
      inline def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Callback): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ MouseEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      inline def setPresetColors(value: js.Array[PresetColor]): Self = StObject.set(x, "presetColors", value.asInstanceOf[js.Any])
      
      inline def setPresetColorsUndefined: Self = StObject.set(x, "presetColors", js.undefined)
      
      inline def setPresetColorsVarargs(value: PresetColor*): Self = StObject.set(x, "presetColors", js.Array(value*))
      
      inline def setStyles(value: PartialClassesSketchPicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SketchPickerStylesProps extends StObject {
    
    var Alpha: CSSProperties
    
    var Hue: CSSProperties
    
    var Saturation: CSSProperties
    
    var activeColor: CSSProperties
    
    var alpha: CSSProperties
    
    var color: CSSProperties
    
    var controls: CSSProperties
    
    var hue: CSSProperties
    
    var picker: CSSProperties
    
    var saturation: CSSProperties
    
    var sliders: CSSProperties
  }
  object SketchPickerStylesProps {
    
    inline def apply(
      Alpha: CSSProperties,
      Hue: CSSProperties,
      Saturation: CSSProperties,
      activeColor: CSSProperties,
      alpha: CSSProperties,
      color: CSSProperties,
      controls: CSSProperties,
      hue: CSSProperties,
      picker: CSSProperties,
      saturation: CSSProperties,
      sliders: CSSProperties
    ): SketchPickerStylesProps = {
      val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Hue = Hue.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], activeColor = activeColor.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any])
      __obj.asInstanceOf[SketchPickerStylesProps]
    }
    
    extension [Self <: SketchPickerStylesProps](x: Self) {
      
      inline def setActiveColor(value: CSSProperties): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: CSSProperties): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
      
      inline def setColor(value: CSSProperties): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setControls(value: CSSProperties): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setSaturation(value: CSSProperties): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
      
      inline def setSliders(value: CSSProperties): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
    }
  }
}
