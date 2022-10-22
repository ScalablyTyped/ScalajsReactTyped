package typingsJapgolly.inkTextInput

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TextInputProps> * / any */ @JSImport("ink-text-input", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject
  
  type TextInput = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TextInputProps> */ Any
  
  trait TextInputProps extends StObject {
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TextInputProps {
    
    inline def apply(): TextInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputProps]
    }
    
    extension [Self <: TextInputProps](x: Self) {
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSubmit(value: /* value */ String => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
