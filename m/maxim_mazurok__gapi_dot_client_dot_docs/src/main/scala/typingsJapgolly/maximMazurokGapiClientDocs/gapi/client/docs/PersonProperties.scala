package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonProperties extends StObject {
  
  /** Output only. The email address linked to this Person. This field is always present. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of the person if it is displayed in the link text instead of the person's email address. */
  var name: js.UndefOr[String] = js.undefined
}
object PersonProperties {
  
  inline def apply(): PersonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonProperties]
  }
  
  extension [Self <: PersonProperties](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
