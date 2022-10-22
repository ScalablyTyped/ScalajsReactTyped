package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.WebProxy")
@js.native
open class WebProxy ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.WebProxy
object WebProxy {
  
  @JSGlobal("SP.WebProxy")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def invoke(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    requestInfo: typingsJapgolly.sharepoint.SP.WebRequestInfo
  ): typingsJapgolly.sharepoint.SP.WebResponseInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(context.asInstanceOf[js.Any], requestInfo.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.WebResponseInfo]
}
