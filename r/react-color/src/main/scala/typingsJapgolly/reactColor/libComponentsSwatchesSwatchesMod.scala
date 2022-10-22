package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesSwatchesPic
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSwatchesSwatchesMod {
  
  @JSImport("react-color/lib/components/swatches/Swatches", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SwatchesPickerProps, js.Object, Any]
  
  type SwatchesPicker = japgolly.scalajs.react.facade.React.Component[SwatchesPickerProps & js.Object, js.Object]
  
  trait SwatchesPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[SwatchesPickerProps & js.Object, js.Object]
        ] {
    
    var colors: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
    
    @JSName("styles")
    var styles_SwatchesPickerProps: js.UndefOr[PartialClassesSwatchesPic] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SwatchesPickerProps {
    
    inline def apply(): SwatchesPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwatchesPickerProps]
    }
    
    extension [Self <: SwatchesPickerProps](x: Self) {
      
      inline def setColors(value: js.Array[js.Array[String]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: js.Array[String]*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Callback): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ MouseEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      inline def setStyles(value: PartialClassesSwatchesPic): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SwatchesPickerStylesProps extends StObject {
    
    var body: CSSProperties
    
    var clear: CSSProperties
    
    var overflow: CSSProperties
    
    var picker: CSSProperties
  }
  object SwatchesPickerStylesProps {
    
    inline def apply(body: CSSProperties, clear: CSSProperties, overflow: CSSProperties, picker: CSSProperties): SwatchesPickerStylesProps = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwatchesPickerStylesProps]
    }
    
    extension [Self <: SwatchesPickerStylesProps](x: Self) {
      
      inline def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setOverflow(value: CSSProperties): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    }
  }
}
