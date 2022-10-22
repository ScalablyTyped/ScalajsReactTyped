package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultTable
  extends StObject
     with ClientValueObject {
  
  def get_groupTemplateId(): String
  
  def get_itemTemplateId(): String
  
  def get_properties(): StringDictionary[Any]
  
  def get_queryId(): String
  
  def get_queryRuleId(): String
  
  def get_resultRows(): js.Array[StringDictionary[Any]]
  
  def get_resultTitle(): String
  
  def get_resultTitleUrl(): String
  
  def get_rowCount(): Double
  
  def get_tableType(): String
  
  def get_totalRows(): Double
  
  def get_totalRowsIncludingDuplicates(): Double
  
  def initPropertiesFromJson(parentNode: Any): Unit
}
object ResultTable {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_groupTemplateId: CallbackTo[String],
    get_itemTemplateId: CallbackTo[String],
    get_properties: CallbackTo[StringDictionary[Any]],
    get_queryId: CallbackTo[String],
    get_queryRuleId: CallbackTo[String],
    get_resultRows: CallbackTo[js.Array[StringDictionary[Any]]],
    get_resultTitle: CallbackTo[String],
    get_resultTitleUrl: CallbackTo[String],
    get_rowCount: CallbackTo[Double],
    get_tableType: CallbackTo[String],
    get_totalRows: CallbackTo[Double],
    get_totalRowsIncludingDuplicates: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    initPropertiesFromJson: Any => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ResultTable = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_groupTemplateId = get_groupTemplateId.toJsFn, get_itemTemplateId = get_itemTemplateId.toJsFn, get_properties = get_properties.toJsFn, get_queryId = get_queryId.toJsFn, get_queryRuleId = get_queryRuleId.toJsFn, get_resultRows = get_resultRows.toJsFn, get_resultTitle = get_resultTitle.toJsFn, get_resultTitleUrl = get_resultTitleUrl.toJsFn, get_rowCount = get_rowCount.toJsFn, get_tableType = get_tableType.toJsFn, get_totalRows = get_totalRows.toJsFn, get_totalRowsIncludingDuplicates = get_totalRowsIncludingDuplicates.toJsFn, get_typeId = get_typeId.toJsFn, initPropertiesFromJson = js.Any.fromFunction1((t0: Any) => initPropertiesFromJson(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ResultTable]
  }
  
  extension [Self <: ResultTable](x: Self) {
    
    inline def setGet_groupTemplateId(value: CallbackTo[String]): Self = StObject.set(x, "get_groupTemplateId", value.toJsFn)
    
    inline def setGet_itemTemplateId(value: CallbackTo[String]): Self = StObject.set(x, "get_itemTemplateId", value.toJsFn)
    
    inline def setGet_properties(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "get_properties", value.toJsFn)
    
    inline def setGet_queryId(value: CallbackTo[String]): Self = StObject.set(x, "get_queryId", value.toJsFn)
    
    inline def setGet_queryRuleId(value: CallbackTo[String]): Self = StObject.set(x, "get_queryRuleId", value.toJsFn)
    
    inline def setGet_resultRows(value: CallbackTo[js.Array[StringDictionary[Any]]]): Self = StObject.set(x, "get_resultRows", value.toJsFn)
    
    inline def setGet_resultTitle(value: CallbackTo[String]): Self = StObject.set(x, "get_resultTitle", value.toJsFn)
    
    inline def setGet_resultTitleUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_resultTitleUrl", value.toJsFn)
    
    inline def setGet_rowCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_rowCount", value.toJsFn)
    
    inline def setGet_tableType(value: CallbackTo[String]): Self = StObject.set(x, "get_tableType", value.toJsFn)
    
    inline def setGet_totalRows(value: CallbackTo[Double]): Self = StObject.set(x, "get_totalRows", value.toJsFn)
    
    inline def setGet_totalRowsIncludingDuplicates(value: CallbackTo[Double]): Self = StObject.set(x, "get_totalRowsIncludingDuplicates", value.toJsFn)
    
    inline def setInitPropertiesFromJson(value: Any => Callback): Self = StObject.set(x, "initPropertiesFromJson", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
