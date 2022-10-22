package typingsJapgolly.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCorsPolicyInput extends StObject {
  
  /**
    * The name of the container that you want to assign the CORS policy to.
    */
  var ContainerName: typingsJapgolly.awsSdk.clientsMediastoreMod.ContainerName
  
  /**
    * The CORS policy to apply to the container. 
    */
  var CorsPolicy: typingsJapgolly.awsSdk.clientsMediastoreMod.CorsPolicy
}
object PutCorsPolicyInput {
  
  inline def apply(ContainerName: ContainerName, CorsPolicy: CorsPolicy): PutCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCorsPolicyInput]
  }
  
  extension [Self <: PutCorsPolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setCorsPolicy(value: CorsPolicy): Self = StObject.set(x, "CorsPolicy", value.asInstanceOf[js.Any])
    
    inline def setCorsPolicyVarargs(value: CorsRule*): Self = StObject.set(x, "CorsPolicy", js.Array(value*))
  }
}
