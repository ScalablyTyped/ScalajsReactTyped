package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeColorsSpacing
import typingsJapgolly.cathoQuantum.anon.InitialRows
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.dark
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.TextareaHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaMod {
  
  @JSImport("@catho/quantum/TextArea", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TextAreaProps, js.Object, Any]
  
  type TextArea = japgolly.scalajs.react.facade.React.Component[TextAreaProps & js.Object, js.Object]
  
  trait TextAreaProps
    extends StObject
       with TextareaHTMLAttributes[HTMLTextAreaElement] {
    
    var autoResizeConfig: js.UndefOr[InitialRows] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var helperText: js.UndefOr[String] = js.undefined
    
    @JSName("id")
    var id_TextAreaProps: js.UndefOr[String | Double] = js.undefined
    
    var isAutoResize: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    @JSName("onChange")
    var onChange_TextAreaProps: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var skin: js.UndefOr[typingsJapgolly.cathoQuantum.cathoQuantumStrings.default | dark] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeColorsSpacing] = js.undefined
    
    @JSName("value")
    var value_TextAreaProps: js.UndefOr[String] = js.undefined
  }
  object TextAreaProps {
    
    inline def apply(): TextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaProps]
    }
    
    extension [Self <: TextAreaProps](x: Self) {
      
      inline def setAutoResizeConfig(value: InitialRows): Self = StObject.set(x, "autoResizeConfig", value.asInstanceOf[js.Any])
      
      inline def setAutoResizeConfigUndefined: Self = StObject.set(x, "autoResizeConfig", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsAutoResize(value: Boolean): Self = StObject.set(x, "isAutoResize", value.asInstanceOf[js.Any])
      
      inline def setIsAutoResizeUndefined: Self = StObject.set(x, "isAutoResize", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSkin(value: typingsJapgolly.cathoQuantum.cathoQuantumStrings.default | dark): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: BaseFontSizeColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
