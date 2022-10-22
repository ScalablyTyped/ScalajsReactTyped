package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTemplateSelector extends StObject {
  
  val ClassSelector: IMetadataCardControl
  
  val Events: IEvents
  
  def GetObjectTypeIconURL(): String
  
  def GetObjectTypeId(): Double
  
  def GetObjectTypeName(): String
  
  def GetTemplateItems(): Any
  
  def SelectItem(itemID: String): Unit
}
object IObjectTemplateSelector {
  
  inline def apply(
    ClassSelector: IMetadataCardControl,
    Events: IEvents,
    GetObjectTypeIconURL: CallbackTo[String],
    GetObjectTypeId: CallbackTo[Double],
    GetObjectTypeName: CallbackTo[String],
    GetTemplateItems: CallbackTo[Any],
    SelectItem: String => Callback
  ): IObjectTemplateSelector = {
    val __obj = js.Dynamic.literal(ClassSelector = ClassSelector.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GetObjectTypeIconURL = GetObjectTypeIconURL.toJsFn, GetObjectTypeId = GetObjectTypeId.toJsFn, GetObjectTypeName = GetObjectTypeName.toJsFn, GetTemplateItems = GetTemplateItems.toJsFn, SelectItem = js.Any.fromFunction1((t0: String) => SelectItem(t0).runNow()))
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
  
  extension [Self <: IObjectTemplateSelector](x: Self) {
    
    inline def setClassSelector(value: IMetadataCardControl): Self = StObject.set(x, "ClassSelector", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGetObjectTypeIconURL(value: CallbackTo[String]): Self = StObject.set(x, "GetObjectTypeIconURL", value.toJsFn)
    
    inline def setGetObjectTypeId(value: CallbackTo[Double]): Self = StObject.set(x, "GetObjectTypeId", value.toJsFn)
    
    inline def setGetObjectTypeName(value: CallbackTo[String]): Self = StObject.set(x, "GetObjectTypeName", value.toJsFn)
    
    inline def setGetTemplateItems(value: CallbackTo[Any]): Self = StObject.set(x, "GetTemplateItems", value.toJsFn)
    
    inline def setSelectItem(value: String => Callback): Self = StObject.set(x, "SelectItem", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
