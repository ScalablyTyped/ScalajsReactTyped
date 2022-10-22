package typingsJapgolly.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerPolicyInput extends StObject {
  
  /**
    * The name of the container. 
    */
  var ContainerName: typingsJapgolly.awsSdk.clientsMediastoreMod.ContainerName
}
object GetContainerPolicyInput {
  
  inline def apply(ContainerName: ContainerName): GetContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerPolicyInput]
  }
  
  extension [Self <: GetContainerPolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
