package typingsJapgolly.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppInstanceResponse extends StObject {
  
  /**
    * The ARN of the AppInstance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
}
object UpdateAppInstanceResponse {
  
  inline def apply(): UpdateAppInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppInstanceResponse]
  }
  
  extension [Self <: UpdateAppInstanceResponse](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
  }
}
