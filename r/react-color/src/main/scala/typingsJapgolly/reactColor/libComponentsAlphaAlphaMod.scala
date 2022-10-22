package typingsJapgolly.reactColor

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesAlphaPicker
import typingsJapgolly.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAlphaAlphaMod {
  
  @JSImport("react-color/lib/components/alpha/Alpha", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AlphaPickerProps, js.Object, Any]
  
  type AlphaPicker = japgolly.scalajs.react.facade.React.Component[AlphaPickerProps & js.Object, js.Object]
  
  trait AlphaPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[AlphaPickerProps & js.Object, js.Object]
        ] {
    
    var height: js.UndefOr[String] = js.undefined
    
    @JSName("styles")
    var styles_AlphaPickerProps: js.UndefOr[PartialClassesAlphaPicker] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object AlphaPickerProps {
    
    inline def apply(): AlphaPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlphaPickerProps]
    }
    
    extension [Self <: AlphaPickerProps](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyles(value: PartialClassesAlphaPicker): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AlphaPickerStylesProps extends StObject {
    
    var alpha: CSSProperties
    
    var picker: CSSProperties
  }
  object AlphaPickerStylesProps {
    
    inline def apply(alpha: CSSProperties, picker: CSSProperties): AlphaPickerStylesProps = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlphaPickerStylesProps]
    }
    
    extension [Self <: AlphaPickerStylesProps](x: Self) {
      
      inline def setAlpha(value: CSSProperties): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    }
  }
}
