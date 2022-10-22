package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the info about a Web site for a contact. */
trait ContactWebsite extends StObject {
  
  /** Gets and sets the description of a Web site for a contact. The maximum string length for the description is 512 characters. */
  var description: String
  
  var rawValue: Any
  
  /* unmapped type */
  /** Gets and sets the Uniform Resource Identifier (URI) of a Web site for a contact. */
  var uri: Uri
}
object ContactWebsite {
  
  inline def apply(description: String, rawValue: Any, uri: Uri): ContactWebsite = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactWebsite]
  }
  
  extension [Self <: ContactWebsite](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setRawValue(value: Any): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
