package typingsJapgolly.sharepoint.SP.Social

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a link that includes a URI and text representation.
  This class is used to represent the location of a web site.  */
trait SocialLink
  extends StObject
     with ClientValueObject {
  
  def get_text(): String
  
  def get_uri(): String
  
  def set_text(value: String): String
  
  def set_uri(value: String): String
}
object SocialLink {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_text: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_uri: CallbackTo[String],
    set_text: String => String,
    set_uri: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SocialLink = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_text = get_text.toJsFn, get_typeId = get_typeId.toJsFn, get_uri = get_uri.toJsFn, set_text = js.Any.fromFunction1(set_text), set_uri = js.Any.fromFunction1(set_uri), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SocialLink]
  }
  
  extension [Self <: SocialLink](x: Self) {
    
    inline def setGet_text(value: CallbackTo[String]): Self = StObject.set(x, "get_text", value.toJsFn)
    
    inline def setGet_uri(value: CallbackTo[String]): Self = StObject.set(x, "get_uri", value.toJsFn)
    
    inline def setSet_text(value: String => String): Self = StObject.set(x, "set_text", js.Any.fromFunction1(value))
    
    inline def setSet_uri(value: String => String): Self = StObject.set(x, "set_uri", js.Any.fromFunction1(value))
  }
}
