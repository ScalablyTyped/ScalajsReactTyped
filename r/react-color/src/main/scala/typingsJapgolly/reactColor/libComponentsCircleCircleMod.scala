package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesCirclePicke
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCircleCircleMod {
  
  @JSImport("react-color/lib/components/circle/Circle", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CirclePickerProps, js.Object, Any]
  
  type CirclePicker = japgolly.scalajs.react.facade.React.Component[CirclePickerProps & js.Object, js.Object]
  
  trait CirclePickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[CirclePickerProps & js.Object, js.Object]
        ] {
    
    var circleSize: js.UndefOr[Double] = js.undefined
    
    var circleSpacing: js.UndefOr[Double] = js.undefined
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
    
    @JSName("styles")
    var styles_CirclePickerProps: js.UndefOr[PartialClassesCirclePicke] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object CirclePickerProps {
    
    inline def apply(): CirclePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CirclePickerProps]
    }
    
    extension [Self <: CirclePickerProps](x: Self) {
      
      inline def setCircleSize(value: Double): Self = StObject.set(x, "circleSize", value.asInstanceOf[js.Any])
      
      inline def setCircleSizeUndefined: Self = StObject.set(x, "circleSize", js.undefined)
      
      inline def setCircleSpacing(value: Double): Self = StObject.set(x, "circleSpacing", value.asInstanceOf[js.Any])
      
      inline def setCircleSpacingUndefined: Self = StObject.set(x, "circleSpacing", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Callback): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ MouseEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      inline def setStyles(value: PartialClassesCirclePicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CirclePickerStylesProps extends StObject {
    
    var card: CSSProperties
  }
  object CirclePickerStylesProps {
    
    inline def apply(card: CSSProperties): CirclePickerStylesProps = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirclePickerStylesProps]
    }
    
    extension [Self <: CirclePickerStylesProps](x: Self) {
      
      inline def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    }
  }
}
