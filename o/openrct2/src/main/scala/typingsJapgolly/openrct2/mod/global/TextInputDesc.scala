package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for the text input window.
  */
trait TextInputDesc extends StObject {
  
  /**
    * The function to call when the user has entered a new value and pressed OK.
    */
  def callback(value: String): Unit
  
  /**
    * The description to show above the text box.
    */
  var description: String
  
  /**
    * The current value of the text box.
    */
  var initialValue: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum length the value can be.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The title of the text input window.
    */
  var title: String
}
object TextInputDesc {
  
  inline def apply(callback: String => Callback, description: String, title: String): TextInputDesc = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: String) => callback(t0).runNow()), description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputDesc]
  }
  
  extension [Self <: TextInputDesc](x: Self) {
    
    inline def setCallback(value: String => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
