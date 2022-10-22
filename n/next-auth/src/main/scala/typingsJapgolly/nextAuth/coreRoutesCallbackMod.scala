package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.anon.Method
import typingsJapgolly.nextAuth.coreMod.OutgoingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRoutesCallbackMod {
  
  @JSImport("next-auth/core/routes/callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: Method): js.Promise[OutgoingResponse[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Any]]]
}
