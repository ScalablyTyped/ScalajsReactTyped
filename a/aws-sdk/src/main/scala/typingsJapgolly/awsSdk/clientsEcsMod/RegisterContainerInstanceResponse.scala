package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterContainerInstanceResponse extends StObject {
  
  /**
    * The container instance that was registered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}
object RegisterContainerInstanceResponse {
  
  inline def apply(): RegisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterContainerInstanceResponse]
  }
  
  extension [Self <: RegisterContainerInstanceResponse](x: Self) {
    
    inline def setContainerInstance(value: ContainerInstance): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
