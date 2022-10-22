package typingsJapgolly.msportalfxMock

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.q.mod.Promise
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcHelpersAjaxHelperMod {
  
  object AjaxHelper {
    
    @JSImport("msportalfx-mock/lib/src/Helpers/ajaxHelper", "AjaxHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Forward the passed in request to the passed in host and returns the response.
      *
      * @param request The incoming request to forward.
      * @param host The target host.
      * @param port The target host port.
      * @return A promise that will resolve with the response body from the forwarded request.
      */
    inline def fwdAjax(request: Any, host: String): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fwdAjax")(request.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
    inline def fwdAjax(request: Any, host: String, port: Double): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fwdAjax")(request.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
    
    /**
      * Gets the JSON data from the body of the response. If it fails to parse as valid JSON, the original data will be returned.
      *
      * @param response The response object.
      * @return A promise that is resolved with the data.
      */
    inline def getJsonData(response: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonData")(response.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
    
    /**
      * Forwards the request back to the same host but a different path.
      *
      * @param request The incoming request to forward.
      * @param port The target host port.
      * @param method The forward request method.
      * @return A promise that will resolve with the response body from the forwarded request.
      */
    inline def loopbackAjax(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      path: String
    ): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loopbackAjax")(request.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
    inline def loopbackAjax(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      path: String,
      method: String
    ): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loopbackAjax")(request.asInstanceOf[js.Any], path.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  }
}
