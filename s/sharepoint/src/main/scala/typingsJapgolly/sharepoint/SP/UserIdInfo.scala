package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdInfo
  extends StObject
     with ClientValueObject {
  
  def get_nameId(): String
  
  def get_nameIdIssuer(): String
}
object UserIdInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_nameId: CallbackTo[String],
    get_nameIdIssuer: CallbackTo[String],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): UserIdInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_nameId = get_nameId.toJsFn, get_nameIdIssuer = get_nameIdIssuer.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[UserIdInfo]
  }
  
  extension [Self <: UserIdInfo](x: Self) {
    
    inline def setGet_nameId(value: CallbackTo[String]): Self = StObject.set(x, "get_nameId", value.toJsFn)
    
    inline def setGet_nameIdIssuer(value: CallbackTo[String]): Self = StObject.set(x, "get_nameIdIssuer", value.toJsFn)
  }
}
