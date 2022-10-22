package typingsJapgolly.reactMdForm

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextFieldTextFieldAddonMod {
  
  @JSImport("@react-md/form/types/text-field/TextFieldAddon", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait TextFieldAddonProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the addon should be presentational only and prevent pointer
      * events.
      */
    var presentational: js.UndefOr[Boolean] = js.undefined
  }
  object TextFieldAddonProps {
    
    inline def apply(): TextFieldAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldAddonProps]
    }
    
    extension [Self <: TextFieldAddonProps](x: Self) {
      
      inline def setPresentational(value: Boolean): Self = StObject.set(x, "presentational", value.asInstanceOf[js.Any])
      
      inline def setPresentationalUndefined: Self = StObject.set(x, "presentational", js.undefined)
    }
  }
}
