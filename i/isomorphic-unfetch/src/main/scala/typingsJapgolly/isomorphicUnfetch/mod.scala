package typingsJapgolly.isomorphicUnfetch

import org.scalajs.dom.Body
import org.scalajs.dom.Headers
import org.scalajs.dom.Request
import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /* was `typeof fetch` */
    inline def apply(input: URL): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
    /* was `typeof fetch` */
    inline def apply(input: URL, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    /* was `typeof fetch` */
    inline def apply(input: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
    /* was `typeof fetch` */
    inline def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    
    @JSImport("isomorphic-unfetch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object unfetch {
    
    type IsomorphicBody = Body | typingsJapgolly.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typingsJapgolly.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typingsJapgolly.nodeFetch.mod.Request
    
    type IsomorphicRequestInit = RequestInit | typingsJapgolly.nodeFetch.mod.RequestInit
    
    type IsomorphicResponse = Response | typingsJapgolly.nodeFetch.mod.Response
  }
}
