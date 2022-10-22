package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyWebRequestExecutorFactory
  extends StObject
     with IWebRequestExecutorFactory
object ProxyWebRequestExecutorFactory {
  
  inline def apply(createWebRequestExecutor: CallbackTo[WebRequestExecutor]): ProxyWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = createWebRequestExecutor.toJsFn)
    __obj.asInstanceOf[ProxyWebRequestExecutorFactory]
  }
}
