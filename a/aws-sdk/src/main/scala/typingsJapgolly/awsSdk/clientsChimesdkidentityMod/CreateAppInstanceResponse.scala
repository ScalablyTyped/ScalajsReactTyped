package typingsJapgolly.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the AppInstance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
}
object CreateAppInstanceResponse {
  
  inline def apply(): CreateAppInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppInstanceResponse]
  }
  
  extension [Self <: CreateAppInstanceResponse](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
  }
}
