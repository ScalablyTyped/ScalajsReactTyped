package typingsJapgolly.reactMdForm

import org.scalajs.dom.HTMLFormElement
import typingsJapgolly.react.mod.FormHTMLAttributes
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFormMod {
  
  @JSImport("@react-md/form/types/Form", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[FormProps & RefAttributes[HTMLFormElement]] = js.native
  
  trait FormProps
    extends StObject
       with FormHTMLAttributes[HTMLFormElement] {
    
    /**
      * Boolean if the form should no longer prevent default submit behavior. If
      * you enable this prop you should honestly just use a `<form>` element
      * instead
      */
    var disablePreventDefault: js.UndefOr[Boolean] = js.undefined
  }
  object FormProps {
    
    inline def apply(): FormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps]
    }
    
    extension [Self <: FormProps](x: Self) {
      
      inline def setDisablePreventDefault(value: Boolean): Self = StObject.set(x, "disablePreventDefault", value.asInstanceOf[js.Any])
      
      inline def setDisablePreventDefaultUndefined: Self = StObject.set(x, "disablePreventDefault", js.undefined)
    }
  }
}
