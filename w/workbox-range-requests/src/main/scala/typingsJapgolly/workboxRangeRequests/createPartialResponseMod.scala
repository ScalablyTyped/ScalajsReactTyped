package typingsJapgolly.workboxRangeRequests

import org.scalajs.dom.Request
import org.scalajs.dom.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPartialResponseMod {
  
  @JSImport("workbox-range-requests/createPartialResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPartialResponse")(request.asInstanceOf[js.Any], originalResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
}
