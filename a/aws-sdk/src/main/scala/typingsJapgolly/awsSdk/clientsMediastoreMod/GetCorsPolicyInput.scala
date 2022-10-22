package typingsJapgolly.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCorsPolicyInput extends StObject {
  
  /**
    * The name of the container that the policy is assigned to.
    */
  var ContainerName: typingsJapgolly.awsSdk.clientsMediastoreMod.ContainerName
}
object GetCorsPolicyInput {
  
  inline def apply(ContainerName: ContainerName): GetCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCorsPolicyInput]
  }
  
  extension [Self <: GetCorsPolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
