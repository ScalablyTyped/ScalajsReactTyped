package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataDeleteRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of the metadata field to update */
  var name: String
}
object MetadataDeleteRequest {
  
  inline def apply(name: String): MetadataDeleteRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataDeleteRequest]
  }
  
  extension [Self <: MetadataDeleteRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
