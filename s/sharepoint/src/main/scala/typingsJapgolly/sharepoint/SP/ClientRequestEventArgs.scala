package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.EventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequestEventArgs
  extends StObject
     with EventArgs {
  
  def get_request(): ClientRequest
}
object ClientRequestEventArgs {
  
  inline def apply(Empty: EventArgs, get_request: CallbackTo[ClientRequest]): ClientRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_request = get_request.toJsFn)
    __obj.asInstanceOf[ClientRequestEventArgs]
  }
  
  extension [Self <: ClientRequestEventArgs](x: Self) {
    
    inline def setGet_request(value: CallbackTo[ClientRequest]): Self = StObject.set(x, "get_request", value.toJsFn)
  }
}
