package typingsJapgolly.sharepoint.SP.Publishing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.Web
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageLayoutCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_associatedContentTypeId(): String
  
  def get_masterPageUrl(): String
  
  def get_newPageLayoutEditablePath(): String
  
  def get_newPageLayoutNameWithoutExtension(): String
  
  def get_web(): Web
  
  def set_associatedContentTypeId(value: String): String
  
  def set_masterPageUrl(value: String): String
  
  def set_newPageLayoutEditablePath(value: String): String
  
  def set_newPageLayoutNameWithoutExtension(value: String): String
  
  def set_web(value: Web): Web
}
object PageLayoutCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_associatedContentTypeId: CallbackTo[String],
    get_masterPageUrl: CallbackTo[String],
    get_newPageLayoutEditablePath: CallbackTo[String],
    get_newPageLayoutNameWithoutExtension: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_web: CallbackTo[Web],
    set_associatedContentTypeId: String => String,
    set_masterPageUrl: String => String,
    set_newPageLayoutEditablePath: String => String,
    set_newPageLayoutNameWithoutExtension: String => String,
    set_web: Web => Web,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): PageLayoutCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_associatedContentTypeId = get_associatedContentTypeId.toJsFn, get_masterPageUrl = get_masterPageUrl.toJsFn, get_newPageLayoutEditablePath = get_newPageLayoutEditablePath.toJsFn, get_newPageLayoutNameWithoutExtension = get_newPageLayoutNameWithoutExtension.toJsFn, get_typeId = get_typeId.toJsFn, get_web = get_web.toJsFn, set_associatedContentTypeId = js.Any.fromFunction1(set_associatedContentTypeId), set_masterPageUrl = js.Any.fromFunction1(set_masterPageUrl), set_newPageLayoutEditablePath = js.Any.fromFunction1(set_newPageLayoutEditablePath), set_newPageLayoutNameWithoutExtension = js.Any.fromFunction1(set_newPageLayoutNameWithoutExtension), set_web = js.Any.fromFunction1(set_web), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[PageLayoutCreationInformation]
  }
  
  extension [Self <: PageLayoutCreationInformation](x: Self) {
    
    inline def setGet_associatedContentTypeId(value: CallbackTo[String]): Self = StObject.set(x, "get_associatedContentTypeId", value.toJsFn)
    
    inline def setGet_masterPageUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_masterPageUrl", value.toJsFn)
    
    inline def setGet_newPageLayoutEditablePath(value: CallbackTo[String]): Self = StObject.set(x, "get_newPageLayoutEditablePath", value.toJsFn)
    
    inline def setGet_newPageLayoutNameWithoutExtension(value: CallbackTo[String]): Self = StObject.set(x, "get_newPageLayoutNameWithoutExtension", value.toJsFn)
    
    inline def setGet_web(value: CallbackTo[Web]): Self = StObject.set(x, "get_web", value.toJsFn)
    
    inline def setSet_associatedContentTypeId(value: String => String): Self = StObject.set(x, "set_associatedContentTypeId", js.Any.fromFunction1(value))
    
    inline def setSet_masterPageUrl(value: String => String): Self = StObject.set(x, "set_masterPageUrl", js.Any.fromFunction1(value))
    
    inline def setSet_newPageLayoutEditablePath(value: String => String): Self = StObject.set(x, "set_newPageLayoutEditablePath", js.Any.fromFunction1(value))
    
    inline def setSet_newPageLayoutNameWithoutExtension(value: String => String): Self = StObject.set(x, "set_newPageLayoutNameWithoutExtension", js.Any.fromFunction1(value))
    
    inline def setSet_web(value: Web => Web): Self = StObject.set(x, "set_web", js.Any.fromFunction1(value))
  }
}
