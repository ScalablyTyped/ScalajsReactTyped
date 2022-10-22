package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStackPolicyInput extends StObject {
  
  /**
    * The name or unique stack ID that's associated with the stack whose policy you want to get.
    */
  var StackName: typingsJapgolly.awsSdk.clientsCloudformationMod.StackName
}
object GetStackPolicyInput {
  
  inline def apply(StackName: StackName): GetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackPolicyInput]
  }
  
  extension [Self <: GetStackPolicyInput](x: Self) {
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
