package typingsJapgolly.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActPromiseResult[T] extends StObject {
  
  var context: Hemera[ClientRequest, ClientResponse]
  
  var data: T
}
object ActPromiseResult {
  
  inline def apply[T](context: Hemera[ClientRequest, ClientResponse], data: T): ActPromiseResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActPromiseResult[T]]
  }
  
  extension [Self <: ActPromiseResult[?], T](x: Self & ActPromiseResult[T]) {
    
    inline def setContext(value: Hemera[ClientRequest, ClientResponse]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
