package typingsJapgolly.body

import typingsJapgolly.body.anon.Limit
import typingsJapgolly.body.commonCallbackMod.Callback
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  inline def apply(req: IncomingMessage, cb: Callback[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], cb: Callback[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], opts: Limit, cb: Callback[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("body/form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
