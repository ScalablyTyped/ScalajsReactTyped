package typingsJapgolly.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var id: ResourceId
}
object Resource {
  
  inline def apply(id: ResourceId): Resource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
