package typingsJapgolly.syncRequest

import typingsJapgolly.httpBasic.libHttpVerbMod.HttpVerb
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.syncRequest.libOptionsMod.Options
import typingsJapgolly.thenRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBrowserMod {
  
  @JSImport("sync-request/lib/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(method: HttpVerb, url: String): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def default(method: HttpVerb, url: String, options: Options): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def default(method: HttpVerb, url: URL_): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def default(method: HttpVerb, url: URL_, options: Options): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  @JSImport("sync-request/lib/browser", "FormData")
  @js.native
  val FormData: Any = js.native
}
