package typingsJapgolly.sharepoint.SP.Publishing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesignPackageInfo
  extends StObject
     with ClientValueObject {
  
  def get_majorVersion(): Double
  
  def get_minorVersion(): Double
  
  def get_packageGuid(): Guid
  
  def get_packageName(): String
  
  def set_majorVersion(value: Double): Double
  
  def set_minorVersion(value: Double): Double
  
  def set_packageGuid(value: Guid): Guid
  
  def set_packageName(value: String): String
}
object DesignPackageInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_majorVersion: CallbackTo[Double],
    get_minorVersion: CallbackTo[Double],
    get_packageGuid: CallbackTo[Guid],
    get_packageName: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_majorVersion: Double => Double,
    set_minorVersion: Double => Double,
    set_packageGuid: Guid => Guid,
    set_packageName: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): DesignPackageInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_majorVersion = get_majorVersion.toJsFn, get_minorVersion = get_minorVersion.toJsFn, get_packageGuid = get_packageGuid.toJsFn, get_packageName = get_packageName.toJsFn, get_typeId = get_typeId.toJsFn, set_majorVersion = js.Any.fromFunction1(set_majorVersion), set_minorVersion = js.Any.fromFunction1(set_minorVersion), set_packageGuid = js.Any.fromFunction1(set_packageGuid), set_packageName = js.Any.fromFunction1(set_packageName), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[DesignPackageInfo]
  }
  
  extension [Self <: DesignPackageInfo](x: Self) {
    
    inline def setGet_majorVersion(value: CallbackTo[Double]): Self = StObject.set(x, "get_majorVersion", value.toJsFn)
    
    inline def setGet_minorVersion(value: CallbackTo[Double]): Self = StObject.set(x, "get_minorVersion", value.toJsFn)
    
    inline def setGet_packageGuid(value: CallbackTo[Guid]): Self = StObject.set(x, "get_packageGuid", value.toJsFn)
    
    inline def setGet_packageName(value: CallbackTo[String]): Self = StObject.set(x, "get_packageName", value.toJsFn)
    
    inline def setSet_majorVersion(value: Double => Double): Self = StObject.set(x, "set_majorVersion", js.Any.fromFunction1(value))
    
    inline def setSet_minorVersion(value: Double => Double): Self = StObject.set(x, "set_minorVersion", js.Any.fromFunction1(value))
    
    inline def setSet_packageGuid(value: Guid => Guid): Self = StObject.set(x, "set_packageGuid", js.Any.fromFunction1(value))
    
    inline def setSet_packageName(value: String => String): Self = StObject.set(x, "set_packageName", js.Any.fromFunction1(value))
  }
}
