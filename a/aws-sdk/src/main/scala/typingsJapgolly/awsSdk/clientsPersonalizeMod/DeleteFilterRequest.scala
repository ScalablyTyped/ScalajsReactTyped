package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFilterRequest extends StObject {
  
  /**
    * The ARN of the filter to delete.
    */
  var filterArn: Arn
}
object DeleteFilterRequest {
  
  inline def apply(filterArn: Arn): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(filterArn = filterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterRequest]
  }
  
  extension [Self <: DeleteFilterRequest](x: Self) {
    
    inline def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
  }
}
