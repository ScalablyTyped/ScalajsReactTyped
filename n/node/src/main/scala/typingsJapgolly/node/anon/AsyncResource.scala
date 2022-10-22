package typingsJapgolly.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncResource extends StObject {
  
  var asyncResource: typingsJapgolly.node.asyncHooksMod.AsyncResource
}
object AsyncResource {
  
  inline def apply(asyncResource: typingsJapgolly.node.asyncHooksMod.AsyncResource): AsyncResource = {
    val __obj = js.Dynamic.literal(asyncResource = asyncResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncResource]
  }
  
  extension [Self <: AsyncResource](x: Self) {
    
    inline def setAsyncResource(value: typingsJapgolly.node.asyncHooksMod.AsyncResource): Self = StObject.set(x, "asyncResource", value.asInstanceOf[js.Any])
  }
}
