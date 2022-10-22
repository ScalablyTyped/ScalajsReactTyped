package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorChangeHandler
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommonEditableInputMod {
  
  @JSImport("react-color/lib/components/common/EditableInput", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EditableInputProps, js.Object, Any]
  
  type EditableInput = japgolly.scalajs.react.facade.React.Component[EditableInputProps & js.Object, js.Object]
  
  trait EditableInputProps
    extends StObject
       with ClassAttributes[
          japgolly.scalajs.react.facade.React.Component[EditableInputProps & js.Object, js.Object]
        ] {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var dragLabel: js.UndefOr[String] = js.undefined
    
    var dragMax: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
    
    var style: js.UndefOr[EditableInputStyles] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object EditableInputProps {
    
    inline def apply(): EditableInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableInputProps]
    }
    
    extension [Self <: EditableInputProps](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDragLabel(value: String): Self = StObject.set(x, "dragLabel", value.asInstanceOf[js.Any])
      
      inline def setDragLabelUndefined: Self = StObject.set(x, "dragLabel", js.undefined)
      
      inline def setDragMax(value: String): Self = StObject.set(x, "dragMax", value.asInstanceOf[js.Any])
      
      inline def setDragMaxUndefined: Self = StObject.set(x, "dragMax", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: EditableInputStyles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait EditableInputStyles extends StObject {
    
    var input: js.UndefOr[CSSProperties] = js.undefined
    
    var label: js.UndefOr[CSSProperties] = js.undefined
    
    var wrap: js.UndefOr[CSSProperties] = js.undefined
  }
  object EditableInputStyles {
    
    inline def apply(): EditableInputStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableInputStyles]
    }
    
    extension [Self <: EditableInputStyles](x: Self) {
      
      inline def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setWrap(value: CSSProperties): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
