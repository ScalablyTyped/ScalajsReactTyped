package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsIamMod.instanceProfileNameType
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/iam.GetInstanceProfileRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetInstanceProfileRequest extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the instance profile to get information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
}
object GetInstanceProfileRequest {
  
  inline def apply(InstanceProfileName: instanceProfileNameType): GetInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileRequest]
  }
  
  extension [Self <: GetInstanceProfileRequest](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setInstanceProfileName(value: instanceProfileNameType): Self = StObject.set(x, "InstanceProfileName", value.asInstanceOf[js.Any])
  }
}
