package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRequest extends StObject {
  
  def add_failed(value: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit
  
  def add_succeeded(value: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit
  
  def get(): Unit
  
  def get_expectedContentType(): String
  
  def get_request(): WebRequest
  
  def get_url(): String
  
  def post(body: String): Unit
  
  def remove_failed(value: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit
  
  def remove_succeeded(value: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit
  
  def set_expectedContentType(value: String): Unit
  
  def set_url(value: String): Unit
}
object PageRequest {
  
  inline def apply(
    add_failed: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit] => Callback,
    add_succeeded: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit] => Callback,
    get: Callback,
    get_expectedContentType: CallbackTo[String],
    get_request: CallbackTo[WebRequest],
    get_url: CallbackTo[String],
    post: String => Callback,
    remove_failed: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit] => Callback,
    remove_succeeded: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit] => Callback,
    set_expectedContentType: String => Callback,
    set_url: String => Callback
  ): PageRequest = {
    val __obj = js.Dynamic.literal(add_failed = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit]) => add_failed(t0).runNow()), add_succeeded = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit]) => add_succeeded(t0).runNow()), get = get.toJsFn, get_expectedContentType = get_expectedContentType.toJsFn, get_request = get_request.toJsFn, get_url = get_url.toJsFn, post = js.Any.fromFunction1((t0: String) => post(t0).runNow()), remove_failed = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit]) => remove_failed(t0).runNow()), remove_succeeded = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit]) => remove_succeeded(t0).runNow()), set_expectedContentType = js.Any.fromFunction1((t0: String) => set_expectedContentType(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()))
    __obj.asInstanceOf[PageRequest]
  }
  
  extension [Self <: PageRequest](x: Self) {
    
    inline def setAdd_failed(value: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit] => Callback): Self = StObject.set(x, "add_failed", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit]) => value(t0).runNow()))
    
    inline def setAdd_succeeded(value: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit] => Callback): Self = StObject.set(x, "add_succeeded", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit]) => value(t0).runNow()))
    
    inline def setGet(value: Callback): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setGet_expectedContentType(value: CallbackTo[String]): Self = StObject.set(x, "get_expectedContentType", value.toJsFn)
    
    inline def setGet_request(value: CallbackTo[WebRequest]): Self = StObject.set(x, "get_request", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setPost(value: String => Callback): Self = StObject.set(x, "post", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemove_failed(value: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit] => Callback): Self = StObject.set(x, "remove_failed", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit]) => value(t0).runNow()))
    
    inline def setRemove_succeeded(value: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit] => Callback): Self = StObject.set(x, "remove_succeeded", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit]) => value(t0).runNow()))
    
    inline def setSet_expectedContentType(value: String => Callback): Self = StObject.set(x, "set_expectedContentType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
