package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a Collaborative Application Markup Language (CAML) query on a list. */
trait CamlQuery
  extends StObject
     with ClientValueObject {
  
  /** Returns true if the query returns dates in Coordinated Universal Time (UTC) format. */
  def get_datesInUtc(): Boolean
  
  /** Server relative URL of a list folder from which results will be returned. */
  def get_folderServerRelativeUrl(): String
  
  def get_listItemCollectionPosition(): ListItemCollectionPosition
  
  /** Gets value that specifies the XML schema that defines the list view. */
  def get_viewXml(): String
  
  /** Sets a value that indicates whether the query returns dates in Coordinated Universal Time (UTC) format. */
  def set_datesInUtc(value: Boolean): Unit
  
  /** Sets a value that specifies the server relative URL of a list folder from which results will be returned. */
  def set_folderServerRelativeUrl(value: String): Unit
  
  /** Sets a value that specifies the information required to get the next page of data for the list view. */
  def set_listItemCollectionPosition(value: ListItemCollectionPosition): Unit
  
  /** Sets value that specifies the XML schema that defines the list view. It must be null, empty, or an XML fragment that conforms to the ViewDefinition type.  */
  def set_viewXml(value: String): Unit
}
object CamlQuery {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_datesInUtc: CallbackTo[Boolean],
    get_folderServerRelativeUrl: CallbackTo[String],
    get_listItemCollectionPosition: CallbackTo[ListItemCollectionPosition],
    get_typeId: CallbackTo[String],
    get_viewXml: CallbackTo[String],
    set_datesInUtc: Boolean => Callback,
    set_folderServerRelativeUrl: String => Callback,
    set_listItemCollectionPosition: ListItemCollectionPosition => Callback,
    set_viewXml: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): CamlQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_datesInUtc = get_datesInUtc.toJsFn, get_folderServerRelativeUrl = get_folderServerRelativeUrl.toJsFn, get_listItemCollectionPosition = get_listItemCollectionPosition.toJsFn, get_typeId = get_typeId.toJsFn, get_viewXml = get_viewXml.toJsFn, set_datesInUtc = js.Any.fromFunction1((t0: Boolean) => set_datesInUtc(t0).runNow()), set_folderServerRelativeUrl = js.Any.fromFunction1((t0: String) => set_folderServerRelativeUrl(t0).runNow()), set_listItemCollectionPosition = js.Any.fromFunction1((t0: ListItemCollectionPosition) => set_listItemCollectionPosition(t0).runNow()), set_viewXml = js.Any.fromFunction1((t0: String) => set_viewXml(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[CamlQuery]
  }
  
  extension [Self <: CamlQuery](x: Self) {
    
    inline def setGet_datesInUtc(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_datesInUtc", value.toJsFn)
    
    inline def setGet_folderServerRelativeUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_folderServerRelativeUrl", value.toJsFn)
    
    inline def setGet_listItemCollectionPosition(value: CallbackTo[ListItemCollectionPosition]): Self = StObject.set(x, "get_listItemCollectionPosition", value.toJsFn)
    
    inline def setGet_viewXml(value: CallbackTo[String]): Self = StObject.set(x, "get_viewXml", value.toJsFn)
    
    inline def setSet_datesInUtc(value: Boolean => Callback): Self = StObject.set(x, "set_datesInUtc", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_folderServerRelativeUrl(value: String => Callback): Self = StObject.set(x, "set_folderServerRelativeUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_listItemCollectionPosition(value: ListItemCollectionPosition => Callback): Self = StObject.set(x, "set_listItemCollectionPosition", js.Any.fromFunction1((t0: ListItemCollectionPosition) => value(t0).runNow()))
    
    inline def setSet_viewXml(value: String => Callback): Self = StObject.set(x, "set_viewXml", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
