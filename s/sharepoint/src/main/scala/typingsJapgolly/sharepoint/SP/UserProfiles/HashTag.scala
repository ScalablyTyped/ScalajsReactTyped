package typingsJapgolly.sharepoint.SP.UserProfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashTag
  extends StObject
     with ClientValueObject {
  
  def get_name(): String
  
  def get_useCount(): Double
}
object HashTag {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_name: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_useCount: CallbackTo[Double],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): HashTag = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_name = get_name.toJsFn, get_typeId = get_typeId.toJsFn, get_useCount = get_useCount.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[HashTag]
  }
  
  extension [Self <: HashTag](x: Self) {
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_useCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_useCount", value.toJsFn)
  }
}
