package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageBuilderRequest extends StObject {
  
  /**
    * The name of the image builder.
    */
  var Name: typingsJapgolly.awsSdk.clientsAppstreamMod.Name
}
object DeleteImageBuilderRequest {
  
  inline def apply(Name: Name): DeleteImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageBuilderRequest]
  }
  
  extension [Self <: DeleteImageBuilderRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
