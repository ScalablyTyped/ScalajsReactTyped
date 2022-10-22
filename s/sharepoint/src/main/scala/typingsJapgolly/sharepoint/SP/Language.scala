package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language
  extends StObject
     with ClientValueObject {
  
  def get_displayName(): String
  
  def get_languageTag(): String
  
  def get_lcid(): Double
}
object Language {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_displayName: CallbackTo[String],
    get_languageTag: CallbackTo[String],
    get_lcid: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): Language = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_displayName = get_displayName.toJsFn, get_languageTag = get_languageTag.toJsFn, get_lcid = get_lcid.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setGet_displayName(value: CallbackTo[String]): Self = StObject.set(x, "get_displayName", value.toJsFn)
    
    inline def setGet_languageTag(value: CallbackTo[String]): Self = StObject.set(x, "get_languageTag", value.toJsFn)
    
    inline def setGet_lcid(value: CallbackTo[Double]): Self = StObject.set(x, "get_lcid", value.toJsFn)
  }
}
