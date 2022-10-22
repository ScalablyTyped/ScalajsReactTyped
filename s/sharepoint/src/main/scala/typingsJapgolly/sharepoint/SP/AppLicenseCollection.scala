package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppLicenseCollection
  extends StObject
     with ClientValueObjectCollection[AppLicense] {
  
  def add(item: AppLicense): Unit
  
  def get_item(index: Double): AppLicense
}
object AppLicenseCollection {
  
  inline def apply(
    add: AppLicense => Callback,
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    getEnumerator: CallbackTo[IEnumerator[AppLicense]],
    get_count: CallbackTo[Double],
    get_item: Double => AppLicense,
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): AppLicenseCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: AppLicense) => add(t0).runNow()), customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), getEnumerator = getEnumerator.toJsFn, get_count = get_count.toJsFn, get_item = js.Any.fromFunction1(get_item), get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[AppLicenseCollection]
  }
  
  extension [Self <: AppLicenseCollection](x: Self) {
    
    inline def setAdd(value: AppLicense => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: AppLicense) => value(t0).runNow()))
    
    inline def setGet_item(value: Double => AppLicense): Self = StObject.set(x, "get_item", js.Any.fromFunction1(value))
  }
}
