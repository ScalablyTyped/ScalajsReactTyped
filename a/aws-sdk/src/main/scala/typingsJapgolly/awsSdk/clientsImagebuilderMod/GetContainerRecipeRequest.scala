package typingsJapgolly.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerRecipeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container recipe to retrieve.
    */
  var containerRecipeArn: ContainerRecipeArn
}
object GetContainerRecipeRequest {
  
  inline def apply(containerRecipeArn: ContainerRecipeArn): GetContainerRecipeRequest = {
    val __obj = js.Dynamic.literal(containerRecipeArn = containerRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerRecipeRequest]
  }
  
  extension [Self <: GetContainerRecipeRequest](x: Self) {
    
    inline def setContainerRecipeArn(value: ContainerRecipeArn): Self = StObject.set(x, "containerRecipeArn", value.asInstanceOf[js.Any])
  }
}
