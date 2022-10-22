package typingsJapgolly.next.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClient[T] extends StObject {
  
  def onClient(): T
  
  def onEdgeServer(): T
  
  def onServer(): T
  
  var page: String
  
  var pageRuntime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
}
object OnClient {
  
  inline def apply[T](
    onClient: CallbackTo[T],
    onEdgeServer: CallbackTo[T],
    onServer: CallbackTo[T],
    page: String,
    pageRuntime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
  ): OnClient[T] = {
    val __obj = js.Dynamic.literal(onClient = onClient.toJsFn, onEdgeServer = onEdgeServer.toJsFn, onServer = onServer.toJsFn, page = page.asInstanceOf[js.Any], pageRuntime = pageRuntime.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClient[T]]
  }
  
  extension [Self <: OnClient[?], T](x: Self & OnClient[T]) {
    
    inline def setOnClient(value: CallbackTo[T]): Self = StObject.set(x, "onClient", value.toJsFn)
    
    inline def setOnEdgeServer(value: CallbackTo[T]): Self = StObject.set(x, "onEdgeServer", value.toJsFn)
    
    inline def setOnServer(value: CallbackTo[T]): Self = StObject.set(x, "onServer", value.toJsFn)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageRuntime(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
    ): Self = StObject.set(x, "pageRuntime", value.asInstanceOf[js.Any])
  }
}
