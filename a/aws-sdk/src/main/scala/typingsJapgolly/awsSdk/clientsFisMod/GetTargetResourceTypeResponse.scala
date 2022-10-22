package typingsJapgolly.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetResourceTypeResponse extends StObject {
  
  /**
    * Information about the resource type.
    */
  var targetResourceType: js.UndefOr[TargetResourceType] = js.undefined
}
object GetTargetResourceTypeResponse {
  
  inline def apply(): GetTargetResourceTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTargetResourceTypeResponse]
  }
  
  extension [Self <: GetTargetResourceTypeResponse](x: Self) {
    
    inline def setTargetResourceType(value: TargetResourceType): Self = StObject.set(x, "targetResourceType", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceTypeUndefined: Self = StObject.set(x, "targetResourceType", js.undefined)
  }
}
