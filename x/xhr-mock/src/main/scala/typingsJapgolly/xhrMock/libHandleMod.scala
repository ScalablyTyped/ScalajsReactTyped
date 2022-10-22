package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.libMockRequestMod.default
import typingsJapgolly.xhrMock.libTypesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleMod {
  
  @JSImport("xhr-mock/lib/handle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsJapgolly.xhrMock.libMockResponseMod.default
  ): js.Promise[typingsJapgolly.xhrMock.libMockResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(handlers.asInstanceOf[js.Any], request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.xhrMock.libMockResponseMod.default]]
  
  inline def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsJapgolly.xhrMock.libMockResponseMod.default
  ): typingsJapgolly.xhrMock.libMockResponseMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(handlers.asInstanceOf[js.Any], request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xhrMock.libMockResponseMod.default]
}
