package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopularQuery
  extends StObject
     with ClientValueObject {
  
  def get_LCID(): Double
  
  def get_clickCount(): Double
  
  def get_queryCount(): Double
  
  def get_queryText(): String
  
  def set_LCID(value: Double): Unit
  
  def set_clickCount(value: Double): Unit
  
  def set_queryCount(value: Double): Unit
  
  def set_queryText(value: String): Unit
}
object PopularQuery {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_LCID: CallbackTo[Double],
    get_clickCount: CallbackTo[Double],
    get_queryCount: CallbackTo[Double],
    get_queryText: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_LCID: Double => Callback,
    set_clickCount: Double => Callback,
    set_queryCount: Double => Callback,
    set_queryText: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): PopularQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_LCID = get_LCID.toJsFn, get_clickCount = get_clickCount.toJsFn, get_queryCount = get_queryCount.toJsFn, get_queryText = get_queryText.toJsFn, get_typeId = get_typeId.toJsFn, set_LCID = js.Any.fromFunction1((t0: Double) => set_LCID(t0).runNow()), set_clickCount = js.Any.fromFunction1((t0: Double) => set_clickCount(t0).runNow()), set_queryCount = js.Any.fromFunction1((t0: Double) => set_queryCount(t0).runNow()), set_queryText = js.Any.fromFunction1((t0: String) => set_queryText(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[PopularQuery]
  }
  
  extension [Self <: PopularQuery](x: Self) {
    
    inline def setGet_LCID(value: CallbackTo[Double]): Self = StObject.set(x, "get_LCID", value.toJsFn)
    
    inline def setGet_clickCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_clickCount", value.toJsFn)
    
    inline def setGet_queryCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_queryCount", value.toJsFn)
    
    inline def setGet_queryText(value: CallbackTo[String]): Self = StObject.set(x, "get_queryText", value.toJsFn)
    
    inline def setSet_LCID(value: Double => Callback): Self = StObject.set(x, "set_LCID", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_clickCount(value: Double => Callback): Self = StObject.set(x, "set_clickCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_queryCount(value: Double => Callback): Self = StObject.set(x, "set_queryCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_queryText(value: String => Callback): Self = StObject.set(x, "set_queryText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
