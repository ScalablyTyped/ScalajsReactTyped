package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.ItemInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxBox {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.col
    - typingsJapgolly.devextreme.devextremeStrings.row
  */
  trait BoxDirection extends StObject
  object BoxDirection {
    
    inline def col: typingsJapgolly.devextreme.devextremeStrings.col = "col".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.col]
    
    inline def row: typingsJapgolly.devextreme.devextremeStrings.row = "row".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.row]
  }
  
  type ContentReadyEvent[TItem /* <: ItemLike[TKey] */, TKey] = EventInfo[dxBox[TItem, TKey]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.center
    - typingsJapgolly.devextreme.devextremeStrings.end
    - typingsJapgolly.devextreme.devextremeStrings.start
    - typingsJapgolly.devextreme.devextremeStrings.stretch
  */
  trait CrosswiseDistribution extends StObject
  object CrosswiseDistribution {
    
    inline def center: typingsJapgolly.devextreme.devextremeStrings.center = "center".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.center]
    
    inline def end: typingsJapgolly.devextreme.devextremeStrings.end = "end".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.end]
    
    inline def start: typingsJapgolly.devextreme.devextremeStrings.start = "start".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.start]
    
    inline def stretch: typingsJapgolly.devextreme.devextremeStrings.stretch = "stretch".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.stretch]
  }
  
  type DisposingEvent[TItem /* <: ItemLike[TKey] */, TKey] = EventInfo[dxBox[TItem, TKey]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.center
    - typingsJapgolly.devextreme.devextremeStrings.end
    - typingsJapgolly.devextreme.devextremeStrings.`space-around`
    - typingsJapgolly.devextreme.devextremeStrings.`space-between`
    - typingsJapgolly.devextreme.devextremeStrings.start
  */
  trait Distribution extends StObject
  object Distribution {
    
    inline def center: typingsJapgolly.devextreme.devextremeStrings.center = "center".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.center]
    
    inline def end: typingsJapgolly.devextreme.devextremeStrings.end = "end".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.end]
    
    inline def `space-around`: typingsJapgolly.devextreme.devextremeStrings.`space-around` = "space-around".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.`space-around`]
    
    inline def `space-between`: typingsJapgolly.devextreme.devextremeStrings.`space-between` = "space-between".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.`space-between`]
    
    inline def start: typingsJapgolly.devextreme.devextremeStrings.start = "start".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.start]
  }
  
  trait ExplicitTypes[TItem /* <: ItemLike[TKey] */, TKey] extends StObject {
    
    var ContentReadyEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.ContentReadyEvent[TItem, TKey]
    
    var DisposingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.DisposingEvent[TItem, TKey]
    
    var InitializedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.InitializedEvent[TItem, TKey]
    
    var ItemClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.ItemClickEvent[TItem, TKey]
    
    var ItemContextMenuEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.ItemContextMenuEvent[TItem, TKey]
    
    var ItemHoldEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.ItemHoldEvent[TItem, TKey]
    
    var ItemRenderedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.ItemRenderedEvent[TItem, TKey]
    
    var OptionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.OptionChangedEvent[TItem, TKey]
    
    var Properties: typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox.Properties[TItem, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      ContentReadyEvent: ContentReadyEvent[TItem, TKey],
      DisposingEvent: DisposingEvent[TItem, TKey],
      InitializedEvent: InitializedEvent[TItem, TKey],
      ItemClickEvent: ItemClickEvent[TItem, TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TItem, TKey],
      ItemHoldEvent: ItemHoldEvent[TItem, TKey],
      ItemRenderedEvent: ItemRenderedEvent[TItem, TKey],
      OptionChangedEvent: OptionChangedEvent[TItem, TKey],
      Properties: Properties[TItem, TKey]
    ): ExplicitTypes[TItem, TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemHoldEvent = ItemHoldEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TItem, TKey]]
    }
    
    extension [Self <: ExplicitTypes[?, ?], TItem /* <: ItemLike[TKey] */, TKey](x: Self & (ExplicitTypes[TItem, TKey])) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TItem, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TItem, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TItem, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TItem, TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TItem, TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemHoldEvent(value: ItemHoldEvent[TItem, TKey]): Self = StObject.set(x, "ItemHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TItem, TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TItem, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TItem, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TItem /* <: ItemLike[TKey] */, TKey] = InitializedEventInfo[dxBox[TItem, TKey]]
  
  type Item[TKey] = dxBoxItem[TKey]
  
  trait ItemClickEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with NativeEventInfo[dxBox[TItem, TKey], MouseEvent | PointerEvent]
       with ItemInfo[TItem]
  object ItemClickEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxBox[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TItem, TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with NativeEventInfo[dxBox[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemContextMenuEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxBox[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemContextMenuEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TItem, TKey]]
    }
  }
  
  trait ItemHoldEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with NativeEventInfo[dxBox[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemHoldEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxBox[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemHoldEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHoldEvent[TItem, TKey]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type ItemLike[TKey] = String | Item[TKey] | Any
  
  trait ItemRenderedEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with EventInfo[dxBox[TItem, TKey]]
       with ItemInfo[TItem]
  object ItemRenderedEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxBox[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemRenderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TItem, TKey]]
    }
  }
  
  trait OptionChangedEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with EventInfo[dxBox[TItem, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](component: dxBox[TItem, TKey], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TItem, TKey]]
    }
  }
  
  type Properties[TItem /* <: ItemLike[TKey] */, TKey] = dxBoxOptions[TItem, TKey]
}
