package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChapCredentialsOutput extends StObject {
  
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var TargetARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.TargetARN] = js.undefined
}
object DeleteChapCredentialsOutput {
  
  inline def apply(): DeleteChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteChapCredentialsOutput]
  }
  
  extension [Self <: DeleteChapCredentialsOutput](x: Self) {
    
    inline def setInitiatorName(value: IqnName): Self = StObject.set(x, "InitiatorName", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNameUndefined: Self = StObject.set(x, "InitiatorName", js.undefined)
    
    inline def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    inline def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
  }
}
