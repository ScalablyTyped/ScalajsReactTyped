package typingsJapgolly.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrailResponse extends StObject {
  
  var Trail: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudtrailMod.Trail] = js.undefined
}
object GetTrailResponse {
  
  inline def apply(): GetTrailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrailResponse]
  }
  
  extension [Self <: GetTrailResponse](x: Self) {
    
    inline def setTrail(value: Trail): Self = StObject.set(x, "Trail", value.asInstanceOf[js.Any])
    
    inline def setTrailUndefined: Self = StObject.set(x, "Trail", js.undefined)
  }
}
