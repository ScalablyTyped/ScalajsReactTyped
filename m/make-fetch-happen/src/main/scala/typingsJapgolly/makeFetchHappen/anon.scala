package typingsJapgolly.makeFetchHappen

import org.scalajs.dom.CacheQueryOptions
import org.scalajs.dom.URL
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(request: URL): js.Promise[Boolean] = js.native
    def apply(request: URL, options: CacheQueryOptions): js.Promise[Boolean] = js.native
    def apply(request: RequestInfo): js.Promise[Boolean] = js.native
    def apply(request: RequestInfo, options: CacheQueryOptions): js.Promise[Boolean] = js.native
  }
}
