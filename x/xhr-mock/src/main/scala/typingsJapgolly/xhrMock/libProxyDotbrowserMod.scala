package typingsJapgolly.xhrMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProxyDotbrowserMod {
  
  @JSImport("xhr-mock/lib/proxy.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    req: typingsJapgolly.xhrMock.libMockRequestMod.default,
    res: typingsJapgolly.xhrMock.libMockResponseMod.default
  ): js.Promise[typingsJapgolly.xhrMock.libMockResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.xhrMock.libMockResponseMod.default]]
}
