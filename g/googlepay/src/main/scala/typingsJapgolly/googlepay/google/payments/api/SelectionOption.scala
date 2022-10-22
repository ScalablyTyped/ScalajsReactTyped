package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed info for a selectable option.
  */
trait SelectionOption extends StObject {
  
  /**
    * A descriptive text that will be displayed below option label.
    *
    * This field is optional.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the option.
    *
    * This field is required.
    */
  var id: String
  
  /**
    * The label to be displayed as the option.
    *
    * This field is required.
    */
  var label: String
}
object SelectionOption {
  
  inline def apply(id: String, label: String): SelectionOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOption]
  }
  
  extension [Self <: SelectionOption](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
