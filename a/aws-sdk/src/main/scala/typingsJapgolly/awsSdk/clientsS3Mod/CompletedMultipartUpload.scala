package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedMultipartUpload extends StObject {
  
  /**
    * Array of CompletedPart data types. If you do not supply a valid Part with your request, the service sends back an HTTP 400 response.
    */
  var Parts: js.UndefOr[CompletedPartList] = js.undefined
}
object CompletedMultipartUpload {
  
  inline def apply(): CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletedMultipartUpload]
  }
  
  extension [Self <: CompletedMultipartUpload](x: Self) {
    
    inline def setParts(value: CompletedPartList): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
    
    inline def setPartsVarargs(value: CompletedPart*): Self = StObject.set(x, "Parts", js.Array(value*))
  }
}
