package typingsJapgolly.reactMdForm

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.typesToggleInputToggleMod.InputToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesToggleRadioMod {
  
  @JSImport("@react-md/form/types/toggle/Radio", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps & RefAttributes[HTMLInputElement]] = js.native
  
  trait RadioProps
    extends StObject
       with InputToggleProps {
    
    /**
      * A value is required for a radio button unlike a checkbox.
      */
    @JSName("value")
    var value_RadioProps: js.Array[String] | String | Double
  }
  object RadioProps {
    
    inline def apply(id: String, value: js.Array[String] | String | Double): RadioProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioProps]
    }
    
    extension [Self <: RadioProps](x: Self) {
      
      inline def setValue(value: js.Array[String] | String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
