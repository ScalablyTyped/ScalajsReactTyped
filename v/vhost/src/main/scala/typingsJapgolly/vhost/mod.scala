package typingsJapgolly.vhost

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.std.Record
import typingsJapgolly.vhost.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(hostname: String, handler: Handler): typingsJapgolly.express.mod.Handler = (^.asInstanceOf[js.Dynamic].apply(hostname.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.express.mod.Handler]
  inline def apply(hostname: js.RegExp, handler: Handler): typingsJapgolly.express.mod.Handler = (^.asInstanceOf[js.Dynamic].apply(hostname.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.express.mod.Handler]
  
  @JSImport("vhost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Handler = js.Function3[
    /* req */ Request, 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]
  
  @js.native
  trait Request
    extends StObject
       with typingsJapgolly.expressServeStaticCore.mod.Request {
    
    var vhost: Dictkey = js.native
  }
}
