package typingsJapgolly.slimerjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebServerModule extends StObject {
  
  def create(): WebServer
}
object WebServerModule {
  
  inline def apply(create: CallbackTo[WebServer]): WebServerModule = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[WebServerModule]
  }
  
  extension [Self <: WebServerModule](x: Self) {
    
    inline def setCreate(value: CallbackTo[WebServer]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
