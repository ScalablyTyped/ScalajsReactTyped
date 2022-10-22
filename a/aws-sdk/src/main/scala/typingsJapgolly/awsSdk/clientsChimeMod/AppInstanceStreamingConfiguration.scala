package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceStreamingConfiguration extends StObject {
  
  /**
    * The type of data to be streamed.
    */
  var AppInstanceDataType: typingsJapgolly.awsSdk.clientsChimeMod.AppInstanceDataType
  
  /**
    * The resource ARN.
    */
  var ResourceArn: Arn
}
object AppInstanceStreamingConfiguration {
  
  inline def apply(AppInstanceDataType: AppInstanceDataType, ResourceArn: Arn): AppInstanceStreamingConfiguration = {
    val __obj = js.Dynamic.literal(AppInstanceDataType = AppInstanceDataType.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInstanceStreamingConfiguration]
  }
  
  extension [Self <: AppInstanceStreamingConfiguration](x: Self) {
    
    inline def setAppInstanceDataType(value: AppInstanceDataType): Self = StObject.set(x, "AppInstanceDataType", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
