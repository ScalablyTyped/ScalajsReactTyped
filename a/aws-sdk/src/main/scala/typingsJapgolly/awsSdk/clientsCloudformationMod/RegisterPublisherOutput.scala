package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterPublisherOutput extends StObject {
  
  /**
    * The ID assigned this account by CloudFormation for publishing extensions.
    */
  var PublisherId: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.PublisherId] = js.undefined
}
object RegisterPublisherOutput {
  
  inline def apply(): RegisterPublisherOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterPublisherOutput]
  }
  
  extension [Self <: RegisterPublisherOutput](x: Self) {
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
  }
}
