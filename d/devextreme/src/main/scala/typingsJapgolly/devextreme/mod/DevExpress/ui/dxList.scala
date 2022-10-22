package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.anon.Group
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.ItemInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.CollectionWidget.SelectionChangedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemLike
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxList[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidget[dxListOptions[TItem, TKey], TItem, TKey] {
  
  /**
    * Gets the UI component&apos;s height in pixels.
    */
  def clientHeight(): Double = js.native
  
  /**
    * Collapses a group with a specific index.
    */
  def collapseGroup(groupIndex: Double): DxPromise[Unit] = js.native
  
  /**
    * Removes an item found using its DOM node.
    */
  def deleteItem(itemElement: Element): DxPromise[Unit] = js.native
  def deleteItem(itemIndex: Any): DxPromise[Unit] = js.native
  /**
    * Removes an item with a specific index.
    */
  def deleteItem(itemIndex: Double): DxPromise[Unit] = js.native
  
  /**
    * Expands a group with a specific index.
    */
  def expandGroup(groupIndex: Double): DxPromise[Unit] = js.native
  
  /**
    * Checks whether an item found using its DOM node is selected.
    */
  def isItemSelected(itemElement: Element): Boolean = js.native
  def isItemSelected(itemIndex: Any): Boolean = js.native
  /**
    * Checks whether an item with a specific index is selected.
    */
  def isItemSelected(itemIndex: Double): Boolean = js.native
  
  /**
    * Reloads list data.
    */
  def reload(): Unit = js.native
  
  /**
    * Reorders items found using their DOM nodes.
    */
  def reorderItem(itemElement: Element, toItemElement: Element): DxPromise[Unit] = js.native
  def reorderItem(itemIndex: Any, toItemIndex: Any): DxPromise[Unit] = js.native
  def reorderItem(itemIndex: Any, toItemIndex: Double): DxPromise[Unit] = js.native
  def reorderItem(itemIndex: Double, toItemIndex: Any): DxPromise[Unit] = js.native
  /**
    * Reorders items with specific indexes.
    */
  def reorderItem(itemIndex: Double, toItemIndex: Double): DxPromise[Unit] = js.native
  
  /**
    * Scrolls the content by a specified distance.
    */
  def scrollBy(distance: Double): Unit = js.native
  
  /**
    * Gets the content&apos;s height in pixels.
    */
  def scrollHeight(): Double = js.native
  
  /**
    * Scrolls the content to a specific position.
    */
  def scrollTo(location: Double): Unit = js.native
  
  /**
    * Scrolls the content to an item found using its DOM node.
    */
  def scrollToItem(itemElement: Element): Unit = js.native
  def scrollToItem(itemIndex: Any): Unit = js.native
  /**
    * Scrolls the content to an item with a specific index.
    */
  def scrollToItem(itemIndex: Double): Unit = js.native
  
  /**
    * Gets the top scroll offset.
    */
  def scrollTop(): Double = js.native
  
  /**
    * Selects all items.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Selects an item found using its DOM node.
    */
  def selectItem(itemElement: Element): Unit = js.native
  def selectItem(itemIndex: Any): Unit = js.native
  /**
    * Selects an item with a specific index.
    */
  def selectItem(itemIndex: Double): Unit = js.native
  
  /**
    * Cancels the selection of all items.
    */
  def unselectAll(): Unit = js.native
  
  /**
    * Cancels the selection of an item found using its DOM node.
    */
  def unselectItem(itemElement: Element): Unit = js.native
  def unselectItem(itemIndex: Any): Unit = js.native
  /**
    * Cancels the selection of an item with a specific index.
    */
  def unselectItem(itemIndex: Double): Unit = js.native
  
  /**
    * Updates the UI component scrollbar according to UI component content size.
    */
  def updateDimensions(): DxPromise[Unit] = js.native
}
object dxList {
  
  type ContentReadyEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxList[TItem, TKey]]
  
  type DisposingEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxList[TItem, TKey]]
  
  trait ExplicitTypes[TItem /* <: ItemLike */, TKey] extends StObject {
    
    var ContentReadyEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ContentReadyEvent[TItem, TKey]
    
    var DisposingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.DisposingEvent[TItem, TKey]
    
    var GroupRenderedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.GroupRenderedEvent[TItem, TKey]
    
    var InitializedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.InitializedEvent[TItem, TKey]
    
    var ItemClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemClickEvent[TItem, TKey]
    
    var ItemContextMenuEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemContextMenuEvent[TItem, TKey]
    
    var ItemDeletedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemDeletedEvent[TItem, TKey]
    
    var ItemDeletingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemDeletingEvent[TItem, TKey]
    
    var ItemHoldEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemHoldEvent[TItem, TKey]
    
    var ItemRenderedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemRenderedEvent[TItem, TKey]
    
    var ItemReorderedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemReorderedEvent[TItem, TKey]
    
    var ItemSwipeEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ItemSwipeEvent[TItem, TKey]
    
    var OptionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.OptionChangedEvent[TItem, TKey]
    
    var PageLoadingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.PageLoadingEvent[TItem, TKey]
    
    var Properties: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.Properties[TItem, TKey]
    
    var PullRefreshEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.PullRefreshEvent[TItem, TKey]
    
    var ScrollEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.ScrollEvent[TItem, TKey]
    
    var SelectAllValueChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.SelectAllValueChangedEvent[TItem, TKey]
    
    var SelectionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxList.SelectionChangedEvent[TItem, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      ContentReadyEvent: ContentReadyEvent[TItem, TKey],
      DisposingEvent: DisposingEvent[TItem, TKey],
      GroupRenderedEvent: GroupRenderedEvent[TItem, TKey],
      InitializedEvent: InitializedEvent[TItem, TKey],
      ItemClickEvent: ItemClickEvent[TItem, TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TItem, TKey],
      ItemDeletedEvent: ItemDeletedEvent[TItem, TKey],
      ItemDeletingEvent: ItemDeletingEvent[TItem, TKey],
      ItemHoldEvent: ItemHoldEvent[TItem, TKey],
      ItemRenderedEvent: ItemRenderedEvent[TItem, TKey],
      ItemReorderedEvent: ItemReorderedEvent[TItem, TKey],
      ItemSwipeEvent: ItemSwipeEvent[TItem, TKey],
      OptionChangedEvent: OptionChangedEvent[TItem, TKey],
      PageLoadingEvent: PageLoadingEvent[TItem, TKey],
      Properties: Properties[TItem, TKey],
      PullRefreshEvent: PullRefreshEvent[TItem, TKey],
      ScrollEvent: ScrollEvent[TItem, TKey],
      SelectAllValueChangedEvent: SelectAllValueChangedEvent[TItem, TKey],
      SelectionChangedEvent: SelectionChangedEvent[TItem, TKey]
    ): ExplicitTypes[TItem, TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], GroupRenderedEvent = GroupRenderedEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemDeletedEvent = ItemDeletedEvent.asInstanceOf[js.Any], ItemDeletingEvent = ItemDeletingEvent.asInstanceOf[js.Any], ItemHoldEvent = ItemHoldEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], ItemReorderedEvent = ItemReorderedEvent.asInstanceOf[js.Any], ItemSwipeEvent = ItemSwipeEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], PageLoadingEvent = PageLoadingEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], PullRefreshEvent = PullRefreshEvent.asInstanceOf[js.Any], ScrollEvent = ScrollEvent.asInstanceOf[js.Any], SelectAllValueChangedEvent = SelectAllValueChangedEvent.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TItem, TKey]]
    }
    
    extension [Self <: ExplicitTypes[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (ExplicitTypes[TItem, TKey])) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TItem, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TItem, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setGroupRenderedEvent(value: GroupRenderedEvent[TItem, TKey]): Self = StObject.set(x, "GroupRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TItem, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TItem, TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TItem, TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemDeletedEvent(value: ItemDeletedEvent[TItem, TKey]): Self = StObject.set(x, "ItemDeletedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemDeletingEvent(value: ItemDeletingEvent[TItem, TKey]): Self = StObject.set(x, "ItemDeletingEvent", value.asInstanceOf[js.Any])
      
      inline def setItemHoldEvent(value: ItemHoldEvent[TItem, TKey]): Self = StObject.set(x, "ItemHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TItem, TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemReorderedEvent(value: ItemReorderedEvent[TItem, TKey]): Self = StObject.set(x, "ItemReorderedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemSwipeEvent(value: ItemSwipeEvent[TItem, TKey]): Self = StObject.set(x, "ItemSwipeEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TItem, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setPageLoadingEvent(value: PageLoadingEvent[TItem, TKey]): Self = StObject.set(x, "PageLoadingEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TItem, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setPullRefreshEvent(value: PullRefreshEvent[TItem, TKey]): Self = StObject.set(x, "PullRefreshEvent", value.asInstanceOf[js.Any])
      
      inline def setScrollEvent(value: ScrollEvent[TItem, TKey]): Self = StObject.set(x, "ScrollEvent", value.asInstanceOf[js.Any])
      
      inline def setSelectAllValueChangedEvent(value: SelectAllValueChangedEvent[TItem, TKey]): Self = StObject.set(x, "SelectAllValueChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TItem, TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait GroupRenderedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxList[TItem, TKey]] {
    
    val groupData: js.UndefOr[Any] = js.undefined
    
    val groupElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val groupIndex: js.UndefOr[Double] = js.undefined
  }
  object GroupRenderedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](component: dxList[TItem, TKey], element: DxElement_[HTMLElement]): GroupRenderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupRenderedEvent[TItem, TKey]]
    }
    
    extension [Self <: GroupRenderedEvent[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (GroupRenderedEvent[TItem, TKey])) {
      
      inline def setGroupData(value: Any): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
      
      inline def setGroupDataUndefined: Self = StObject.set(x, "groupData", js.undefined)
      
      inline def setGroupElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "groupElement", value.asInstanceOf[js.Any])
      
      inline def setGroupElementUndefined: Self = StObject.set(x, "groupElement", js.undefined)
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
    }
  }
  
  type InitializedEvent[TItem /* <: ItemLike */, TKey] = InitializedEventInfo[dxList[TItem, TKey]]
  
  type Item = dxListItem
  
  trait ItemClickEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxList[TItem, TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ListItemInfo[TItem]
  object ItemClickEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double | Group
    ): ItemClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TItem, TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxList[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ListItemInfo[TItem]
  object ItemContextMenuEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double | Group
    ): ItemContextMenuEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TItem, TKey]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.context
    - typingsJapgolly.devextreme.devextremeStrings.slideButton
    - typingsJapgolly.devextreme.devextremeStrings.slideItem
    - typingsJapgolly.devextreme.devextremeStrings.static
    - typingsJapgolly.devextreme.devextremeStrings.swipe
    - typingsJapgolly.devextreme.devextremeStrings.toggle
  */
  trait ItemDeleteMode extends StObject
  object ItemDeleteMode {
    
    inline def context: typingsJapgolly.devextreme.devextremeStrings.context = "context".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.context]
    
    inline def slideButton: typingsJapgolly.devextreme.devextremeStrings.slideButton = "slideButton".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.slideButton]
    
    inline def slideItem: typingsJapgolly.devextreme.devextremeStrings.slideItem = "slideItem".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.slideItem]
    
    inline def static: typingsJapgolly.devextreme.devextremeStrings.static = "static".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.static]
    
    inline def swipe: typingsJapgolly.devextreme.devextremeStrings.swipe = "swipe".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.swipe]
    
    inline def toggle: typingsJapgolly.devextreme.devextremeStrings.toggle = "toggle".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.toggle]
  }
  
  trait ItemDeletedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxList[TItem, TKey]]
       with ListItemInfo[TItem]
  object ItemDeletedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double | Group
    ): ItemDeletedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDeletedEvent[TItem, TKey]]
    }
  }
  
  trait ItemDeletingEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxList[TItem, TKey]]
       with ListItemInfo[TItem] {
    
    var cancel: js.UndefOr[Boolean | (PromiseLike[Boolean | Unit])] = js.undefined
  }
  object ItemDeletingEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double | Group
    ): ItemDeletingEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDeletingEvent[TItem, TKey]]
    }
    
    extension [Self <: ItemDeletingEvent[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (ItemDeletingEvent[TItem, TKey])) {
      
      inline def setCancel(value: Boolean | (PromiseLike[Boolean | Unit])): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    }
  }
  
  trait ItemHoldEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxList[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ListItemInfo[TItem]
  object ItemHoldEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double | Group
    ): ItemHoldEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHoldEvent[TItem, TKey]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type ItemLike = String | Item | Any
  
  trait ItemRenderedEvent[TItem /* <: Item | Any */, TKey]
    extends StObject
       with EventInfo[dxList[TItem, TKey]]
       with ItemInfo[TItem]
  object ItemRenderedEvent {
    
    inline def apply[TItem /* <: Item | Any */, TKey](
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemRenderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TItem, TKey]]
    }
  }
  
  trait ItemReorderedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxList[TItem, TKey]]
       with ListItemInfo[TItem] {
    
    val fromIndex: Double
    
    val toIndex: Double
  }
  object ItemReorderedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double | Group,
      toIndex: Double
    ): ItemReorderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemReorderedEvent[TItem, TKey]]
    }
    
    extension [Self <: ItemReorderedEvent[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (ItemReorderedEvent[TItem, TKey])) {
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemSwipeEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxList[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ListItemInfo[TItem] {
    
    val direction: String
  }
  object ItemSwipeEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxList[TItem, TKey],
      direction: String,
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double | Group
    ): ItemSwipeEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemSwipeEvent[TItem, TKey]]
    }
    
    extension [Self <: ItemSwipeEvent[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (ItemSwipeEvent[TItem, TKey])) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait ListItemInfo[TItem /* <: ItemLike */] extends StObject {
    
    val itemData: js.UndefOr[TItem] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val itemIndex: Double | Group
  }
  object ListItemInfo {
    
    inline def apply[TItem /* <: ItemLike */](itemElement: DxElement_[HTMLElement], itemIndex: Double | Group): ListItemInfo[TItem] = {
      val __obj = js.Dynamic.literal(itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemInfo[TItem]]
    }
    
    extension [Self <: ListItemInfo[?], TItem /* <: ItemLike */](x: Self & ListItemInfo[TItem]) {
      
      inline def setItemData(value: TItem): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double | Group): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.context
    - typingsJapgolly.devextreme.devextremeStrings.slide
  */
  trait ListMenuMode extends StObject
  object ListMenuMode {
    
    inline def context: typingsJapgolly.devextreme.devextremeStrings.context = "context".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.context]
    
    inline def slide: typingsJapgolly.devextreme.devextremeStrings.slide = "slide".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.slide]
  }
  
  trait OptionChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxList[TItem, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](component: dxList[TItem, TKey], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TItem, TKey]]
    }
  }
  
  type PageLoadingEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxList[TItem, TKey]]
  
  type Properties[TItem /* <: ItemLike */, TKey] = dxListOptions[TItem, TKey]
  
  type PullRefreshEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxList[TItem, TKey]]
  
  trait ScrollEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxList[TItem, TKey], Event]
       with ScrollInfo
  object ScrollEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      reachedBottom: Boolean,
      reachedLeft: Boolean,
      reachedRight: Boolean,
      reachedTop: Boolean
    ): ScrollEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], reachedBottom = reachedBottom.asInstanceOf[js.Any], reachedLeft = reachedLeft.asInstanceOf[js.Any], reachedRight = reachedRight.asInstanceOf[js.Any], reachedTop = reachedTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollEvent[TItem, TKey]]
    }
  }
  
  trait ScrollInfo extends StObject {
    
    val reachedBottom: Boolean
    
    val reachedLeft: Boolean
    
    val reachedRight: Boolean
    
    val reachedTop: Boolean
    
    val scrollOffset: js.UndefOr[Any] = js.undefined
  }
  object ScrollInfo {
    
    inline def apply(reachedBottom: Boolean, reachedLeft: Boolean, reachedRight: Boolean, reachedTop: Boolean): ScrollInfo = {
      val __obj = js.Dynamic.literal(reachedBottom = reachedBottom.asInstanceOf[js.Any], reachedLeft = reachedLeft.asInstanceOf[js.Any], reachedRight = reachedRight.asInstanceOf[js.Any], reachedTop = reachedTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollInfo]
    }
    
    extension [Self <: ScrollInfo](x: Self) {
      
      inline def setReachedBottom(value: Boolean): Self = StObject.set(x, "reachedBottom", value.asInstanceOf[js.Any])
      
      inline def setReachedLeft(value: Boolean): Self = StObject.set(x, "reachedLeft", value.asInstanceOf[js.Any])
      
      inline def setReachedRight(value: Boolean): Self = StObject.set(x, "reachedRight", value.asInstanceOf[js.Any])
      
      inline def setReachedTop(value: Boolean): Self = StObject.set(x, "reachedTop", value.asInstanceOf[js.Any])
      
      inline def setScrollOffset(value: Any): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    }
  }
  
  trait SelectAllValueChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxList[TItem, TKey]] {
    
    val value: Boolean
  }
  object SelectAllValueChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](component: dxList[TItem, TKey], element: DxElement_[HTMLElement], value: Boolean): SelectAllValueChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectAllValueChangedEvent[TItem, TKey]]
    }
    
    extension [Self <: SelectAllValueChangedEvent[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (SelectAllValueChangedEvent[TItem, TKey])) {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxList[TItem, TKey]]
       with SelectionChangedInfo[TItem]
  object SelectionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      addedItems: js.Array[TItem],
      component: dxList[TItem, TKey],
      element: DxElement_[HTMLElement],
      removedItems: js.Array[TItem]
    ): SelectionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent[TItem, TKey]]
    }
  }
}
