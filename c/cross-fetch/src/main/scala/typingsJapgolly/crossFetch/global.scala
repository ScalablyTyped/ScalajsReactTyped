package typingsJapgolly.crossFetch

import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* was `typeof Response` */
  object Response {
    
    @JSGlobal("_Response")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard dom */
    inline def error(): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[org.scalajs.dom.Response]
    
    /* standard dom */
    inline def redirect(url: String): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
    inline def redirect(url: String, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
    inline def redirect(url: URL): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
    inline def redirect(url: URL, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
  }
  
  /* was `typeof fetch` */
  inline def fetch(input: URL): js.Promise[Response] = js.Dynamic.global.applyDynamic("_fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  /* was `typeof fetch` */
  inline def fetch(input: URL, init: RequestInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("_fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  /* was `typeof fetch` */
  inline def fetch(input: RequestInfo): js.Promise[Response] = js.Dynamic.global.applyDynamic("_fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  /* was `typeof fetch` */
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("_fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
}
