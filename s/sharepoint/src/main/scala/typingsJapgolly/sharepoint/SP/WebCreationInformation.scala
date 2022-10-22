package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_description(): String
  
  def get_language(): Double
  
  def get_title(): String
  
  def get_url(): String
  
  def get_useSamePermissionsAsParentSite(): Boolean
  
  def get_webTemplate(): String
  
  def set_description(value: String): Unit
  
  def set_language(value: Double): Unit
  
  def set_title(value: String): Unit
  
  def set_url(value: String): Unit
  
  def set_useSamePermissionsAsParentSite(value: Boolean): Unit
  
  def set_webTemplate(value: String): Unit
}
object WebCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_description: CallbackTo[String],
    get_language: CallbackTo[Double],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_url: CallbackTo[String],
    get_useSamePermissionsAsParentSite: CallbackTo[Boolean],
    get_webTemplate: CallbackTo[String],
    set_description: String => Callback,
    set_language: Double => Callback,
    set_title: String => Callback,
    set_url: String => Callback,
    set_useSamePermissionsAsParentSite: Boolean => Callback,
    set_webTemplate: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): WebCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_description = get_description.toJsFn, get_language = get_language.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, get_url = get_url.toJsFn, get_useSamePermissionsAsParentSite = get_useSamePermissionsAsParentSite.toJsFn, get_webTemplate = get_webTemplate.toJsFn, set_description = js.Any.fromFunction1((t0: String) => set_description(t0).runNow()), set_language = js.Any.fromFunction1((t0: Double) => set_language(t0).runNow()), set_title = js.Any.fromFunction1((t0: String) => set_title(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), set_useSamePermissionsAsParentSite = js.Any.fromFunction1((t0: Boolean) => set_useSamePermissionsAsParentSite(t0).runNow()), set_webTemplate = js.Any.fromFunction1((t0: String) => set_webTemplate(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[WebCreationInformation]
  }
  
  extension [Self <: WebCreationInformation](x: Self) {
    
    inline def setGet_description(value: CallbackTo[String]): Self = StObject.set(x, "get_description", value.toJsFn)
    
    inline def setGet_language(value: CallbackTo[Double]): Self = StObject.set(x, "get_language", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setGet_useSamePermissionsAsParentSite(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_useSamePermissionsAsParentSite", value.toJsFn)
    
    inline def setGet_webTemplate(value: CallbackTo[String]): Self = StObject.set(x, "get_webTemplate", value.toJsFn)
    
    inline def setSet_description(value: String => Callback): Self = StObject.set(x, "set_description", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_language(value: Double => Callback): Self = StObject.set(x, "set_language", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_title(value: String => Callback): Self = StObject.set(x, "set_title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_useSamePermissionsAsParentSite(value: Boolean => Callback): Self = StObject.set(x, "set_useSamePermissionsAsParentSite", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_webTemplate(value: String => Callback): Self = StObject.set(x, "set_webTemplate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
