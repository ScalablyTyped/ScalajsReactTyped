package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesCompactPick
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCompactCompactMod {
  
  @JSImport("react-color/lib/components/compact/Compact", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CompactPickerProps, js.Object, Any]
  
  type CompactPicker = japgolly.scalajs.react.facade.React.Component[CompactPickerProps & js.Object, js.Object]
  
  trait CompactPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[CompactPickerProps & js.Object, js.Object]
        ] {
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
    
    @JSName("styles")
    var styles_CompactPickerProps: js.UndefOr[PartialClassesCompactPick] = js.undefined
  }
  object CompactPickerProps {
    
    inline def apply(): CompactPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompactPickerProps]
    }
    
    extension [Self <: CompactPickerProps](x: Self) {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Callback): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ MouseEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      inline def setStyles(value: PartialClassesCompactPick): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait CompactPickerStylesProps extends StObject {
    
    var Compact: CSSProperties
    
    var clear: CSSProperties
    
    var compact: CSSProperties
  }
  object CompactPickerStylesProps {
    
    inline def apply(Compact: CSSProperties, clear: CSSProperties, compact: CSSProperties): CompactPickerStylesProps = {
      val __obj = js.Dynamic.literal(Compact = Compact.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompactPickerStylesProps]
    }
    
    extension [Self <: CompactPickerStylesProps](x: Self) {
      
      inline def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setCompact(value: CSSProperties): Self = StObject.set(x, "Compact", value.asInstanceOf[js.Any])
    }
  }
}
