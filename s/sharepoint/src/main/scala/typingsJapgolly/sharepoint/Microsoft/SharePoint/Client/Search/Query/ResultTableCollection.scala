package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.IEnumerator
import typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage
import typingsJapgolly.sharepoint.SP.ClientValueObjectCollection
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultTableCollection
  extends StObject
     with ClientValueObjectCollection[ResultTable] {
  
  def get_elapsedTime(): Double
  
  def get_item(index: Double): ResultTable
  
  def get_properties(): StringDictionary[Any]
  
  def get_queryErrors(): StringDictionary[ControlMessage]
  
  def get_queryId(): String
  
  def get_spellingSuggestion(): String
  
  def get_triggeredRules(): js.Array[Guid]
  
  def initPropertiesFromJson(parentNode: Any): Unit
  
  def set_elapsedTime(value: Double): Unit
}
object ResultTableCollection {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    getEnumerator: CallbackTo[IEnumerator[ResultTable]],
    get_count: CallbackTo[Double],
    get_elapsedTime: CallbackTo[Double],
    get_item: Double => ResultTable,
    get_properties: CallbackTo[StringDictionary[Any]],
    get_queryErrors: CallbackTo[StringDictionary[ControlMessage]],
    get_queryId: CallbackTo[String],
    get_spellingSuggestion: CallbackTo[String],
    get_triggeredRules: CallbackTo[js.Array[Guid]],
    get_typeId: CallbackTo[String],
    initPropertiesFromJson: Any => Callback,
    set_elapsedTime: Double => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ResultTableCollection = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), getEnumerator = getEnumerator.toJsFn, get_count = get_count.toJsFn, get_elapsedTime = get_elapsedTime.toJsFn, get_item = js.Any.fromFunction1(get_item), get_properties = get_properties.toJsFn, get_queryErrors = get_queryErrors.toJsFn, get_queryId = get_queryId.toJsFn, get_spellingSuggestion = get_spellingSuggestion.toJsFn, get_triggeredRules = get_triggeredRules.toJsFn, get_typeId = get_typeId.toJsFn, initPropertiesFromJson = js.Any.fromFunction1((t0: Any) => initPropertiesFromJson(t0).runNow()), set_elapsedTime = js.Any.fromFunction1((t0: Double) => set_elapsedTime(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ResultTableCollection]
  }
  
  extension [Self <: ResultTableCollection](x: Self) {
    
    inline def setGet_elapsedTime(value: CallbackTo[Double]): Self = StObject.set(x, "get_elapsedTime", value.toJsFn)
    
    inline def setGet_item(value: Double => ResultTable): Self = StObject.set(x, "get_item", js.Any.fromFunction1(value))
    
    inline def setGet_properties(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "get_properties", value.toJsFn)
    
    inline def setGet_queryErrors(value: CallbackTo[StringDictionary[ControlMessage]]): Self = StObject.set(x, "get_queryErrors", value.toJsFn)
    
    inline def setGet_queryId(value: CallbackTo[String]): Self = StObject.set(x, "get_queryId", value.toJsFn)
    
    inline def setGet_spellingSuggestion(value: CallbackTo[String]): Self = StObject.set(x, "get_spellingSuggestion", value.toJsFn)
    
    inline def setGet_triggeredRules(value: CallbackTo[js.Array[Guid]]): Self = StObject.set(x, "get_triggeredRules", value.toJsFn)
    
    inline def setInitPropertiesFromJson(value: Any => Callback): Self = StObject.set(x, "initPropertiesFromJson", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet_elapsedTime(value: Double => Callback): Self = StObject.set(x, "set_elapsedTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
