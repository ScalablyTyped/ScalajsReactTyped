package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubwebQuery
  extends StObject
     with ClientValueObject {
  
  def get_configurationFilter(): Double
  
  def get_webTemplateFilter(): Double
  
  def set_configurationFilter(value: Double): Unit
  
  def set_webTemplateFilter(value: Double): Unit
}
object SubwebQuery {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_configurationFilter: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    get_webTemplateFilter: CallbackTo[Double],
    set_configurationFilter: Double => Callback,
    set_webTemplateFilter: Double => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): SubwebQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_configurationFilter = get_configurationFilter.toJsFn, get_typeId = get_typeId.toJsFn, get_webTemplateFilter = get_webTemplateFilter.toJsFn, set_configurationFilter = js.Any.fromFunction1((t0: Double) => set_configurationFilter(t0).runNow()), set_webTemplateFilter = js.Any.fromFunction1((t0: Double) => set_webTemplateFilter(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[SubwebQuery]
  }
  
  extension [Self <: SubwebQuery](x: Self) {
    
    inline def setGet_configurationFilter(value: CallbackTo[Double]): Self = StObject.set(x, "get_configurationFilter", value.toJsFn)
    
    inline def setGet_webTemplateFilter(value: CallbackTo[Double]): Self = StObject.set(x, "get_webTemplateFilter", value.toJsFn)
    
    inline def setSet_configurationFilter(value: Double => Callback): Self = StObject.set(x, "set_configurationFilter", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_webTemplateFilter(value: Double => Callback): Self = StObject.set(x, "set_webTemplateFilter", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
