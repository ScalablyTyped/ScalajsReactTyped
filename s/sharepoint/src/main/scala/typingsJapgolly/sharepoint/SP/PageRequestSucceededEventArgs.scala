package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.EventArgs
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRequestSucceededEventArgs
  extends StObject
     with EventArgs {
  
  def get_executor(): WebRequestExecutor
}
object PageRequestSucceededEventArgs {
  
  inline def apply(Empty: EventArgs, get_executor: CallbackTo[WebRequestExecutor]): PageRequestSucceededEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_executor = get_executor.toJsFn)
    __obj.asInstanceOf[PageRequestSucceededEventArgs]
  }
  
  extension [Self <: PageRequestSucceededEventArgs](x: Self) {
    
    inline def setGet_executor(value: CallbackTo[WebRequestExecutor]): Self = StObject.set(x, "get_executor", value.toJsFn)
  }
}
