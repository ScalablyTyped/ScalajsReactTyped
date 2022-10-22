package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxNavigate extends StObject {
  
  def add_navigate(handler: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit]): Unit
  
  def convertMDSURLtoRegularURL(mdsPath: String): String
  
  def getParam(paramName: String): String
  
  def getSavedFormAction(): String
  
  def get_hash(): String
  
  def get_href(): String
  
  def get_search(): String
  
  def remove_navigate(handler: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit]): Unit
  
  def submit(formToSubmit: HTMLFormElement): Unit
  
  def update(
    url: String,
    updateParts: StringDictionary[String | Double],
    fullNavigate: Boolean,
    anchorName: String
  ): Unit
}
object AjaxNavigate {
  
  inline def apply(
    add_navigate: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit] => Callback,
    convertMDSURLtoRegularURL: String => String,
    getParam: String => String,
    getSavedFormAction: CallbackTo[String],
    get_hash: CallbackTo[String],
    get_href: CallbackTo[String],
    get_search: CallbackTo[String],
    remove_navigate: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit] => Callback,
    submit: HTMLFormElement => Callback,
    update: (String, StringDictionary[String | Double], Boolean, String) => Callback
  ): AjaxNavigate = {
    val __obj = js.Dynamic.literal(add_navigate = js.Any.fromFunction1((t0: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit]) => add_navigate(t0).runNow()), convertMDSURLtoRegularURL = js.Any.fromFunction1(convertMDSURLtoRegularURL), getParam = js.Any.fromFunction1(getParam), getSavedFormAction = getSavedFormAction.toJsFn, get_hash = get_hash.toJsFn, get_href = get_href.toJsFn, get_search = get_search.toJsFn, remove_navigate = js.Any.fromFunction1((t0: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit]) => remove_navigate(t0).runNow()), submit = js.Any.fromFunction1((t0: HTMLFormElement) => submit(t0).runNow()), update = js.Any.fromFunction4((t0: String, t1: StringDictionary[String | Double], t2: Boolean, t3: String) => (update(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[AjaxNavigate]
  }
  
  extension [Self <: AjaxNavigate](x: Self) {
    
    inline def setAdd_navigate(value: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit] => Callback): Self = StObject.set(x, "add_navigate", js.Any.fromFunction1((t0: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit]) => value(t0).runNow()))
    
    inline def setConvertMDSURLtoRegularURL(value: String => String): Self = StObject.set(x, "convertMDSURLtoRegularURL", js.Any.fromFunction1(value))
    
    inline def setGetParam(value: String => String): Self = StObject.set(x, "getParam", js.Any.fromFunction1(value))
    
    inline def setGetSavedFormAction(value: CallbackTo[String]): Self = StObject.set(x, "getSavedFormAction", value.toJsFn)
    
    inline def setGet_hash(value: CallbackTo[String]): Self = StObject.set(x, "get_hash", value.toJsFn)
    
    inline def setGet_href(value: CallbackTo[String]): Self = StObject.set(x, "get_href", value.toJsFn)
    
    inline def setGet_search(value: CallbackTo[String]): Self = StObject.set(x, "get_search", value.toJsFn)
    
    inline def setRemove_navigate(value: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit] => Callback): Self = StObject.set(x, "remove_navigate", js.Any.fromFunction1((t0: js.Function2[/* obj */ Any, /* eventArgs */ Any, Unit]) => value(t0).runNow()))
    
    inline def setSubmit(value: HTMLFormElement => Callback): Self = StObject.set(x, "submit", js.Any.fromFunction1((t0: HTMLFormElement) => value(t0).runNow()))
    
    inline def setUpdate(value: (String, StringDictionary[String | Double], Boolean, String) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction4((t0: String, t1: StringDictionary[String | Double], t2: Boolean, t3: String) => (value(t0, t1, t2, t3)).runNow()))
  }
}
