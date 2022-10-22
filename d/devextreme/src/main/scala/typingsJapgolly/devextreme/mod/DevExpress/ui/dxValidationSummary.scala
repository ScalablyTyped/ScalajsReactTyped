package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.ItemInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.CollectionWidget.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxValidationSummary[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidget[dxValidationSummaryOptions[TItem, TKey], TItem, TKey] {
  
  /**
    * 
    */
  def refreshValidationGroup(): Unit = js.native
}
object dxValidationSummary {
  
  type ContentReadyEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxValidationSummary[TItem, TKey]]
  
  type DisposingEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxValidationSummary[TItem, TKey]]
  
  trait ExplicitTypes[TItem /* <: ItemLike */, TKey] extends StObject {
    
    var ContentReadyEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxValidationSummary.ContentReadyEvent[TItem, TKey]
    
    var DisposingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxValidationSummary.DisposingEvent[TItem, TKey]
    
    var InitializedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxValidationSummary.InitializedEvent[TItem, TKey]
    
    var ItemClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxValidationSummary.ItemClickEvent[TItem, TKey]
    
    var OptionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxValidationSummary.OptionChangedEvent[TItem, TKey]
    
    var Properties: typingsJapgolly.devextreme.mod.DevExpress.ui.dxValidationSummary.Properties[TItem, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      ContentReadyEvent: ContentReadyEvent[TItem, TKey],
      DisposingEvent: DisposingEvent[TItem, TKey],
      InitializedEvent: InitializedEvent[TItem, TKey],
      ItemClickEvent: ItemClickEvent[TItem, TKey],
      OptionChangedEvent: OptionChangedEvent[TItem, TKey],
      Properties: Properties[TItem, TKey]
    ): ExplicitTypes[TItem, TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TItem, TKey]]
    }
    
    extension [Self <: ExplicitTypes[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (ExplicitTypes[TItem, TKey])) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TItem, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TItem, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TItem, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TItem, TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TItem, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TItem, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TItem /* <: ItemLike */, TKey] = InitializedEventInfo[dxValidationSummary[TItem, TKey]]
  
  trait ItemClickEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxValidationSummary[TItem, TKey], MouseEvent | PointerEvent]
       with ItemInfo[TItem]
  object ItemClickEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxValidationSummary[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TItem, TKey]]
    }
  }
  
  trait OptionChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxValidationSummary[TItem, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxValidationSummary[TItem, TKey],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TItem, TKey]]
    }
  }
  
  type Properties[TItem /* <: ItemLike */, TKey] = dxValidationSummaryOptions[TItem, TKey]
}
