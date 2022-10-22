package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationObjectStorageResponse extends StObject {
  
  /**
    * Specifies the ARN of the object storage system location that you create.
    */
  var LocationArn: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
}
object CreateLocationObjectStorageResponse {
  
  inline def apply(): CreateLocationObjectStorageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationObjectStorageResponse]
  }
  
  extension [Self <: CreateLocationObjectStorageResponse](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
