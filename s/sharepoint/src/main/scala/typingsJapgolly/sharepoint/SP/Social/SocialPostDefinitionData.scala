package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides additional information about server-generated posts.
  This type can only be specified in a server-to-server call. */
trait SocialPostDefinitionData
  extends StObject
     with ClientValueObject {
  
  def get_items(): js.Array[SocialPostDefinitionDataItem]
  
  def get_name(): String
  
  def set_items(value: js.Array[SocialPostDefinitionDataItem]): js.Array[SocialPostDefinitionDataItem]
  
  def set_name(value: String): String
}
object SocialPostDefinitionData {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_items: CallbackTo[js.Array[SocialPostDefinitionDataItem]],
    get_name: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_items: js.Array[SocialPostDefinitionDataItem] => js.Array[SocialPostDefinitionDataItem],
    set_name: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialPostDefinitionData = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_items = get_items.toJsFn, get_name = get_name.toJsFn, get_typeId = get_typeId.toJsFn, set_items = js.Any.fromFunction1(set_items), set_name = js.Any.fromFunction1(set_name), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialPostDefinitionData]
  }
  
  extension [Self <: SocialPostDefinitionData](x: Self) {
    
    inline def setGet_items(value: CallbackTo[js.Array[SocialPostDefinitionDataItem]]): Self = StObject.set(x, "get_items", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setSet_items(value: js.Array[SocialPostDefinitionDataItem] => js.Array[SocialPostDefinitionDataItem]): Self = StObject.set(x, "set_items", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => String): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
  }
}
