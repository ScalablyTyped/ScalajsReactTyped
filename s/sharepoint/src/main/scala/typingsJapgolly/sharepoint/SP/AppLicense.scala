package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppLicense
  extends StObject
     with ClientValueObject {
  
  def get_rawXMLLicenseToken(): String
}
object AppLicense {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_rawXMLLicenseToken: CallbackTo[String],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): AppLicense = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_rawXMLLicenseToken = get_rawXMLLicenseToken.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[AppLicense]
  }
  
  extension [Self <: AppLicense](x: Self) {
    
    inline def setGet_rawXMLLicenseToken(value: CallbackTo[String]): Self = StObject.set(x, "get_rawXMLLicenseToken", value.toJsFn)
  }
}
