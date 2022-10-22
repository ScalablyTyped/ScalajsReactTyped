package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequest extends StObject {
  
  def add_requestFailed(value: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit
  
  def add_requestSucceeded(value: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit
  
  def get_navigateWhenServerRedirect(): Boolean
  
  def get_webRequest(): WebRequest
  
  def remove_requestFailed(value: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit
  
  def remove_requestSucceeded(value: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit
  
  def set_navigateWhenServerRedirect(value: Boolean): Unit
}
object ClientRequest {
  
  inline def apply(
    add_requestFailed: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit] => Callback,
    add_requestSucceeded: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Callback,
    get_navigateWhenServerRedirect: CallbackTo[Boolean],
    get_webRequest: CallbackTo[WebRequest],
    remove_requestFailed: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit] => Callback,
    remove_requestSucceeded: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Callback,
    set_navigateWhenServerRedirect: Boolean => Callback
  ): ClientRequest = {
    val __obj = js.Dynamic.literal(add_requestFailed = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit]) => add_requestFailed(t0).runNow()), add_requestSucceeded = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit]) => add_requestSucceeded(t0).runNow()), get_navigateWhenServerRedirect = get_navigateWhenServerRedirect.toJsFn, get_webRequest = get_webRequest.toJsFn, remove_requestFailed = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit]) => remove_requestFailed(t0).runNow()), remove_requestSucceeded = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit]) => remove_requestSucceeded(t0).runNow()), set_navigateWhenServerRedirect = js.Any.fromFunction1((t0: Boolean) => set_navigateWhenServerRedirect(t0).runNow()))
    __obj.asInstanceOf[ClientRequest]
  }
  
  extension [Self <: ClientRequest](x: Self) {
    
    inline def setAdd_requestFailed(value: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit] => Callback): Self = StObject.set(x, "add_requestFailed", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit]) => value(t0).runNow()))
    
    inline def setAdd_requestSucceeded(
      value: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Callback
    ): Self = StObject.set(x, "add_requestSucceeded", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit]) => value(t0).runNow()))
    
    inline def setGet_navigateWhenServerRedirect(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_navigateWhenServerRedirect", value.toJsFn)
    
    inline def setGet_webRequest(value: CallbackTo[WebRequest]): Self = StObject.set(x, "get_webRequest", value.toJsFn)
    
    inline def setRemove_requestFailed(value: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit] => Callback): Self = StObject.set(x, "remove_requestFailed", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ ClientRequestFailedEventArgs, Unit]) => value(t0).runNow()))
    
    inline def setRemove_requestSucceeded(
      value: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Callback
    ): Self = StObject.set(x, "remove_requestSucceeded", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ ClientRequestSucceededEventArgs, Unit]) => value(t0).runNow()))
    
    inline def setSet_navigateWhenServerRedirect(value: Boolean => Callback): Self = StObject.set(x, "set_navigateWhenServerRedirect", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
