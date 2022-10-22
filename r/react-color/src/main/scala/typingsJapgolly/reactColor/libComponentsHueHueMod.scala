package typingsJapgolly.reactColor

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesHuePickerSt
import typingsJapgolly.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHueHueMod {
  
  @JSImport("react-color/lib/components/hue/Hue", JSImport.Default)
  @js.native
  open class default ()
    extends Component[HuePickerProps, js.Object, Any]
  
  type HuePicker = japgolly.scalajs.react.facade.React.Component[HuePickerProps & js.Object, js.Object]
  
  trait HuePickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[HuePickerProps & js.Object, js.Object]
        ] {
    
    var height: js.UndefOr[String] = js.undefined
    
    @JSName("styles")
    var styles_HuePickerProps: js.UndefOr[PartialClassesHuePickerSt] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object HuePickerProps {
    
    inline def apply(): HuePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HuePickerProps]
    }
    
    extension [Self <: HuePickerProps](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyles(value: PartialClassesHuePickerSt): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait HuePickerStylesProps extends StObject {
    
    var hue: CSSProperties
    
    var picker: CSSProperties
  }
  object HuePickerStylesProps {
    
    inline def apply(hue: CSSProperties, picker: CSSProperties): HuePickerStylesProps = {
      val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[HuePickerStylesProps]
    }
    
    extension [Self <: HuePickerStylesProps](x: Self) {
      
      inline def setHue(value: CSSProperties): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    }
  }
}
