package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReorderingRule
  extends StObject
     with ClientValueObject {
  
  def get_boost(): Double
  
  def get_matchType(): ReorderingRuleMatchType
  
  def get_matchValue(): String
  
  def set_boost(value: Double): Unit
  
  def set_matchType(value: ReorderingRuleMatchType): Unit
  
  def set_matchValue(value: String): Unit
}
object ReorderingRule {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_boost: CallbackTo[Double],
    get_matchType: CallbackTo[ReorderingRuleMatchType],
    get_matchValue: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_boost: Double => Callback,
    set_matchType: ReorderingRuleMatchType => Callback,
    set_matchValue: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ReorderingRule = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_boost = get_boost.toJsFn, get_matchType = get_matchType.toJsFn, get_matchValue = get_matchValue.toJsFn, get_typeId = get_typeId.toJsFn, set_boost = js.Any.fromFunction1((t0: Double) => set_boost(t0).runNow()), set_matchType = js.Any.fromFunction1((t0: ReorderingRuleMatchType) => set_matchType(t0).runNow()), set_matchValue = js.Any.fromFunction1((t0: String) => set_matchValue(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ReorderingRule]
  }
  
  extension [Self <: ReorderingRule](x: Self) {
    
    inline def setGet_boost(value: CallbackTo[Double]): Self = StObject.set(x, "get_boost", value.toJsFn)
    
    inline def setGet_matchType(value: CallbackTo[ReorderingRuleMatchType]): Self = StObject.set(x, "get_matchType", value.toJsFn)
    
    inline def setGet_matchValue(value: CallbackTo[String]): Self = StObject.set(x, "get_matchValue", value.toJsFn)
    
    inline def setSet_boost(value: Double => Callback): Self = StObject.set(x, "set_boost", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_matchType(value: ReorderingRuleMatchType => Callback): Self = StObject.set(x, "set_matchType", js.Any.fromFunction1((t0: ReorderingRuleMatchType) => value(t0).runNow()))
    
    inline def setSet_matchValue(value: String => Callback): Self = StObject.set(x, "set_matchValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
