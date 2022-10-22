package typingsJapgolly.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComponentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component build version to delete.
    */
  var componentBuildVersionArn: ComponentBuildVersionArn
}
object DeleteComponentRequest {
  
  inline def apply(componentBuildVersionArn: ComponentBuildVersionArn): DeleteComponentRequest = {
    val __obj = js.Dynamic.literal(componentBuildVersionArn = componentBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentRequest]
  }
  
  extension [Self <: DeleteComponentRequest](x: Self) {
    
    inline def setComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
