package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesBlockPicker
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.reactColorStrings.hide
import typingsJapgolly.reactColor.reactColorStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBlockBlockMod {
  
  @JSImport("react-color/lib/components/block/Block", JSImport.Default)
  @js.native
  open class default ()
    extends Component[BlockPickerProps, js.Object, Any]
  
  type BlockPicker = japgolly.scalajs.react.facade.React.Component[BlockPickerProps & js.Object, js.Object]
  
  trait BlockPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[BlockPickerProps & js.Object, js.Object]
        ] {
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
    
    @JSName("styles")
    var styles_BlockPickerProps: js.UndefOr[PartialClassesBlockPicker] = js.undefined
    
    var triangle: js.UndefOr[hide | top] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object BlockPickerProps {
    
    inline def apply(): BlockPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockPickerProps]
    }
    
    extension [Self <: BlockPickerProps](x: Self) {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Callback): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ MouseEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      inline def setStyles(value: PartialClassesBlockPicker): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTriangle(value: hide | top): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait BlockPickerStylesProps extends StObject {
    
    var body: CSSProperties
    
    var card: CSSProperties
    
    var head: CSSProperties
    
    var input: CSSProperties
    
    var label: CSSProperties
    
    var triangle: CSSProperties
  }
  object BlockPickerStylesProps {
    
    inline def apply(
      body: CSSProperties,
      card: CSSProperties,
      head: CSSProperties,
      input: CSSProperties,
      label: CSSProperties,
      triangle: CSSProperties
    ): BlockPickerStylesProps = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockPickerStylesProps]
    }
    
    extension [Self <: BlockPickerStylesProps](x: Self) {
      
      inline def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setHead(value: CSSProperties): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
    }
  }
}
