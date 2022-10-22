package typingsJapgolly.reactColor

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesSliderPicke
import typingsJapgolly.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSliderSliderMod {
  
  @JSImport("react-color/lib/components/slider/Slider", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SliderPickerProps, js.Object, Any]
  
  type SliderPicker = japgolly.scalajs.react.facade.React.Component[SliderPickerProps & js.Object, js.Object]
  
  trait SliderPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[SliderPickerProps & js.Object, js.Object]
        ] {
    
    @JSName("styles")
    var styles_SliderPickerProps: js.UndefOr[PartialClassesSliderPicke] = js.undefined
  }
  object SliderPickerProps {
    
    inline def apply(): SliderPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderPickerProps]
    }
    
    extension [Self <: SliderPickerProps](x: Self) {
      
      inline def setStyles(value: PartialClassesSliderPicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait SliderPickerStylesProps extends StObject {
    
    var Hue: CSSProperties
    
    var hue: CSSProperties
  }
  object SliderPickerStylesProps {
    
    inline def apply(Hue: CSSProperties, hue: CSSProperties): SliderPickerStylesProps = {
      val __obj = js.Dynamic.literal(Hue = Hue.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderPickerStylesProps]
    }
    
    extension [Self <: SliderPickerStylesProps](x: Self) {
      
      inline def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
    }
  }
}
