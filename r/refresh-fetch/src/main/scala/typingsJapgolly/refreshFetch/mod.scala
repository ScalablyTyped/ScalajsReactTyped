package typingsJapgolly.refreshFetch

import org.scalajs.dom.Request
import org.scalajs.dom.RequestInit
import org.scalajs.dom.URL
import typingsJapgolly.refreshFetch.anon.Body
import typingsJapgolly.refreshFetch.anon.Fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("refresh-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureRefreshFetch[T](configuration: Fetch[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("configureRefreshFetch")(configuration.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def fetchJSON[ResponseBody](url: String): js.Promise[Body[ResponseBody]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJSON")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Body[ResponseBody]]]
  inline def fetchJSON[ResponseBody](url: String, options: RequestInit): js.Promise[Body[ResponseBody]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJSON")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body[ResponseBody]]]
  inline def fetchJSON[ResponseBody](url: Request): js.Promise[Body[ResponseBody]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJSON")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Body[ResponseBody]]]
  inline def fetchJSON[ResponseBody](url: Request, options: RequestInit): js.Promise[Body[ResponseBody]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJSON")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body[ResponseBody]]]
  inline def fetchJSON[ResponseBody](url: URL): js.Promise[Body[ResponseBody]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJSON")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Body[ResponseBody]]]
  inline def fetchJSON[ResponseBody](url: URL, options: RequestInit): js.Promise[Body[ResponseBody]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJSON")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body[ResponseBody]]]
}
