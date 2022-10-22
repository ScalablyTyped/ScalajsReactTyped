package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.EventArgs
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRequestFailedEventArgs
  extends StObject
     with EventArgs {
  
  def get_errorMessage(): String
  
  def get_executor(): WebRequestExecutor
  
  def get_isErrorPage(): Boolean
}
object PageRequestFailedEventArgs {
  
  inline def apply(
    Empty: EventArgs,
    get_errorMessage: CallbackTo[String],
    get_executor: CallbackTo[WebRequestExecutor],
    get_isErrorPage: CallbackTo[Boolean]
  ): PageRequestFailedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_errorMessage = get_errorMessage.toJsFn, get_executor = get_executor.toJsFn, get_isErrorPage = get_isErrorPage.toJsFn)
    __obj.asInstanceOf[PageRequestFailedEventArgs]
  }
  
  extension [Self <: PageRequestFailedEventArgs](x: Self) {
    
    inline def setGet_errorMessage(value: CallbackTo[String]): Self = StObject.set(x, "get_errorMessage", value.toJsFn)
    
    inline def setGet_executor(value: CallbackTo[WebRequestExecutor]): Self = StObject.set(x, "get_executor", value.toJsFn)
    
    inline def setGet_isErrorPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isErrorPage", value.toJsFn)
  }
}
