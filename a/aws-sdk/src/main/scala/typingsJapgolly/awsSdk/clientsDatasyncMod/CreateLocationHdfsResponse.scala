package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationHdfsResponse extends StObject {
  
  /**
    * The ARN of the source HDFS cluster location that's created. 
    */
  var LocationArn: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
}
object CreateLocationHdfsResponse {
  
  inline def apply(): CreateLocationHdfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationHdfsResponse]
  }
  
  extension [Self <: CreateLocationHdfsResponse](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
