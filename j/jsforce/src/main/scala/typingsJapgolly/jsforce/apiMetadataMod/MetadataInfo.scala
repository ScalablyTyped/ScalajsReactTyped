package typingsJapgolly.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataInfo extends StObject {
  
  var fullName: String
}
object MetadataInfo {
  
  inline def apply(fullName: String): MetadataInfo = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataInfo]
  }
  
  extension [Self <: MetadataInfo](x: Self) {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
  }
}
