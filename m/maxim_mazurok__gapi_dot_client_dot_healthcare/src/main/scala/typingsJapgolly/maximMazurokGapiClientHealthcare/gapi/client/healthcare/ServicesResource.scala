package typingsJapgolly.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicesResource extends StObject {
  
  var nlp: NlpResource
}
object ServicesResource {
  
  inline def apply(nlp: NlpResource): ServicesResource = {
    val __obj = js.Dynamic.literal(nlp = nlp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesResource]
  }
  
  extension [Self <: ServicesResource](x: Self) {
    
    inline def setNlp(value: NlpResource): Self = StObject.set(x, "nlp", value.asInstanceOf[js.Any])
  }
}
