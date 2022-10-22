package typingsJapgolly.swr

import typingsJapgolly.swr.distTypesMod.Middleware
import typingsJapgolly.swr.distTypesMod.SWRHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsWithMiddlewareMod {
  
  @JSImport("swr/dist/utils/with-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withMiddleware(useSWR: SWRHook, middleware: Middleware): SWRHook = (^.asInstanceOf[js.Dynamic].applyDynamic("withMiddleware")(useSWR.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[SWRHook]
}
