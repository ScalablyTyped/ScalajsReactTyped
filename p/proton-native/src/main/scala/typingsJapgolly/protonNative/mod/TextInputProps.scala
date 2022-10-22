package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * The default text in the TextInput.
    */
  var children: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the TextInput can be used.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether multiple lines can be inputted into the TextInput.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when the TextInput text is changed. The new text is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  /**
    * Whether the TextInput can be written to by the user.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether characters are hidden in the TextInput. Commonly used for passwords.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the TextInput can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object TextInputProps {
  
  inline def apply(): TextInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProps]
  }
  
  extension [Self <: TextInputProps](x: Self) {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setOnChange(value: /* text */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
