package typingsJapgolly.ipp.mod

import typingsJapgolly.ipp.anon.Detailedstatusmessage
import typingsJapgolly.ipp.anon.Jobstatemessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDocumentResponse extends StObject {
  
  var id: Double
  
  var `job-attributes-tag`: Jobstatemessage
  
  var `operation-attributes-tag`: Detailedstatusmessage
  
  var statusCode: StatusCode
  
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  
  var version: IPPVersion
}
object SendDocumentResponse {
  
  inline def apply(
    id: Double,
    `job-attributes-tag`: Jobstatemessage,
    `operation-attributes-tag`: Detailedstatusmessage,
    statusCode: StatusCode,
    version: IPPVersion
  ): SendDocumentResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDocumentResponse]
  }
  
  extension [Self <: SendDocumentResponse](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def `setJob-attributes-tag`(value: Jobstatemessage): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    inline def `setOperation-attributes-tag`(value: Detailedstatusmessage): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def `setUnsupported-attributes`(value: js.Array[String]): Self = StObject.set(x, "unsupported-attributes", value.asInstanceOf[js.Any])
    
    inline def `setUnsupported-attributesUndefined`: Self = StObject.set(x, "unsupported-attributes", js.undefined)
    
    inline def `setUnsupported-attributesVarargs`(value: String*): Self = StObject.set(x, "unsupported-attributes", js.Array(value*))
    
    inline def setVersion(value: IPPVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
