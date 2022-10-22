package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.devextremeStrings.dblclick_
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.Item
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.Node
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.Scrollable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeView[TKey]
  extends StObject
     with CollectionWidget[dxTreeViewOptions[TKey], dxTreeViewItem, TKey] {
  
  /**
    * Collapses all items.
    */
  def collapseAll(): Unit = js.native
  
  /**
    * Collapses an item with a specific key.
    */
  def collapseItem(itemData: Item): DxPromise[Unit] = js.native
  /**
    * Collapses an item found using its DOM node.
    */
  def collapseItem(itemElement: Element): DxPromise[Unit] = js.native
  /**
    * Collapses an item with a specific key.
    */
  def collapseItem(key: TKey): DxPromise[Unit] = js.native
  
  /**
    * Expands all items. If you load items on demand, this method expands only the loaded items.
    */
  def expandAll(): Unit = js.native
  
  /**
    * Expands an item found using its data object.
    */
  def expandItem(itemData: Item): DxPromise[Unit] = js.native
  /**
    * Expands an item found using its DOM node.
    */
  def expandItem(itemElement: Element): DxPromise[Unit] = js.native
  /**
    * Expands an item with a specific key.
    */
  def expandItem(key: TKey): DxPromise[Unit] = js.native
  
  /**
    * Gets all nodes.
    */
  def getNodes(): js.Array[Node[TKey]] = js.native
  
  /**
    * 
    */
  def getScrollable(): Scrollable = js.native
  
  /**
    * Gets the keys of selected nodes.
    */
  def getSelectedNodeKeys(): js.Array[TKey] = js.native
  
  /**
    * Gets selected nodes.
    */
  def getSelectedNodes(): js.Array[Node[TKey]] = js.native
  
  /**
    * Scrolls the content to an item found using its data.
    */
  def scrollToItem(itemData: Item): DxPromise[Unit] = js.native
  /**
    * Scrolls the content to an item found using its DOM node.
    */
  def scrollToItem(itemElement: Element): DxPromise[Unit] = js.native
  /**
    * Scrolls the content to an item found using its key.
    */
  def scrollToItem(key: TKey): DxPromise[Unit] = js.native
  
  /**
    * Selects all nodes.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Selects a node found using its data object.
    */
  def selectItem(itemData: Item): Boolean = js.native
  /**
    * Selects a TreeView node found using its DOM node.
    */
  def selectItem(itemElement: Element): Boolean = js.native
  /**
    * Selects a node with a specific key.
    */
  def selectItem(key: TKey): Boolean = js.native
  
  /**
    * Cancels the selection of all nodes.
    */
  def unselectAll(): Unit = js.native
  
  /**
    * Cancels the selection of a node found using its data object.
    */
  def unselectItem(itemData: Item): Boolean = js.native
  /**
    * Cancels the selection of a TreeView node found using its DOM node.
    */
  def unselectItem(itemElement: Element): Boolean = js.native
  /**
    * Cancels the selection of a node with a specific key.
    */
  def unselectItem(key: TKey): Boolean = js.native
  
  /**
    * Updates the tree view scrollbars according to the current size of the UI component content.
    */
  def updateDimensions(): DxPromise[Unit] = js.native
}
object dxTreeView {
  
  type ContentReadyEvent[TKey] = EventInfo[dxTreeView[TKey]]
  
  type DisposingEvent[TKey] = EventInfo[dxTreeView[TKey]]
  
  trait ExplicitTypes[TKey] extends StObject {
    
    var ContentReadyEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.ContentReadyEvent[TKey]
    
    var DisposingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.DisposingEvent[TKey]
    
    var InitializedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.InitializedEvent[TKey]
    
    var ItemClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.ItemClickEvent[TKey]
    
    var ItemCollapsedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.ItemCollapsedEvent[TKey]
    
    var ItemContextMenuEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.ItemContextMenuEvent[TKey]
    
    var ItemExpandedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.ItemExpandedEvent[TKey]
    
    var ItemHoldEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.ItemHoldEvent[TKey]
    
    var ItemRenderedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.ItemRenderedEvent[TKey]
    
    var ItemSelectionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.ItemSelectionChangedEvent[TKey]
    
    var Node: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.Node[TKey]
    
    var OptionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.OptionChangedEvent[TKey]
    
    var Properties: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.Properties[TKey]
    
    var SelectAllValueChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.SelectAllValueChangedEvent[TKey]
    
    var SelectionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView.SelectionChangedEvent[TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TKey](
      ContentReadyEvent: ContentReadyEvent[TKey],
      DisposingEvent: DisposingEvent[TKey],
      InitializedEvent: InitializedEvent[TKey],
      ItemClickEvent: ItemClickEvent[TKey],
      ItemCollapsedEvent: ItemCollapsedEvent[TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TKey],
      ItemExpandedEvent: ItemExpandedEvent[TKey],
      ItemHoldEvent: ItemHoldEvent[TKey],
      ItemRenderedEvent: ItemRenderedEvent[TKey],
      ItemSelectionChangedEvent: ItemSelectionChangedEvent[TKey],
      Node: Node[TKey],
      OptionChangedEvent: OptionChangedEvent[TKey],
      Properties: Properties[TKey],
      SelectAllValueChangedEvent: SelectAllValueChangedEvent[TKey],
      SelectionChangedEvent: SelectionChangedEvent[TKey]
    ): ExplicitTypes[TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemCollapsedEvent = ItemCollapsedEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemExpandedEvent = ItemExpandedEvent.asInstanceOf[js.Any], ItemHoldEvent = ItemHoldEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], ItemSelectionChangedEvent = ItemSelectionChangedEvent.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SelectAllValueChangedEvent = SelectAllValueChangedEvent.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TKey]]
    }
    
    extension [Self <: ExplicitTypes[?], TKey](x: Self & ExplicitTypes[TKey]) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemCollapsedEvent(value: ItemCollapsedEvent[TKey]): Self = StObject.set(x, "ItemCollapsedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemExpandedEvent(value: ItemExpandedEvent[TKey]): Self = StObject.set(x, "ItemExpandedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemHoldEvent(value: ItemHoldEvent[TKey]): Self = StObject.set(x, "ItemHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemSelectionChangedEvent(value: ItemSelectionChangedEvent[TKey]): Self = StObject.set(x, "ItemSelectionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node[TKey]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setSelectAllValueChangedEvent(value: SelectAllValueChangedEvent[TKey]): Self = StObject.set(x, "SelectAllValueChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TKey] = InitializedEventInfo[dxTreeView[TKey]]
  
  type Item = dxTreeViewItem
  
  trait ItemClickEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[TKey]
  object ItemClickEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemClickEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TKey]]
    }
  }
  
  trait ItemCollapsedEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], MouseEvent | PointerEvent]
       with ItemInfo[TKey]
  object ItemCollapsedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemCollapsedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemCollapsedEvent[TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TKey]
  object ItemContextMenuEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemContextMenuEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TKey]]
    }
  }
  
  trait ItemExpandedEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], MouseEvent | PointerEvent]
       with ItemInfo[TKey]
  object ItemExpandedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemExpandedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemExpandedEvent[TKey]]
    }
  }
  
  trait ItemHoldEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TKey]
  object ItemHoldEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemHoldEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHoldEvent[TKey]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait ItemInfo[TKey] extends StObject {
    
    val itemData: js.UndefOr[Item] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val itemIndex: js.UndefOr[Double] = js.undefined
    
    val node: js.UndefOr[Node[TKey]] = js.undefined
  }
  object ItemInfo {
    
    inline def apply[TKey](): ItemInfo[TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemInfo[TKey]]
    }
    
    extension [Self <: ItemInfo[?], TKey](x: Self & ItemInfo[TKey]) {
      
      inline def setItemData(value: Item): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
      
      inline def setNode(value: Node[TKey]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  trait ItemRenderedEvent[TKey]
    extends StObject
       with EventInfo[dxTreeView[TKey]]
       with ItemInfo[TKey]
  object ItemRenderedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemRenderedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TKey]]
    }
  }
  
  trait ItemSelectionChangedEvent[TKey]
    extends StObject
       with EventInfo[dxTreeView[TKey]]
       with ItemInfo[TKey]
  object ItemSelectionChangedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemSelectionChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemSelectionChangedEvent[TKey]]
    }
  }
  
  type Node[TKey] = dxTreeViewNode[TKey]
  
  trait OptionChangedEvent[TKey]
    extends StObject
       with EventInfo[dxTreeView[TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TKey]]
    }
  }
  
  type Properties[TKey] = dxTreeViewOptions[TKey]
  
  /* Inlined devextreme.devextreme.DevExpress.core.Skip<devextreme.devextreme.DevExpress.ui.dxScrollable<devextreme.devextreme.DevExpress.ui.dxScrollable.Properties>, '_templateManager' | '_cancelOptionChange' | '_getTemplate' | '_invalidate' | '_refresh' | '_notifyOptionChanged' | '_createElement'> */
  trait Scrollable extends StObject {
    
    @JSName("$element")
    def $element(): UserDefinedElement[Element]
    @JSName("$element")
    var $element_Original: js.Function0[UserDefinedElement[Element]]
    
    def beginUpdate(): Unit
    @JSName("beginUpdate")
    var beginUpdate_Original: js.Function0[Unit]
    
    def clientHeight(): Double
    @JSName("clientHeight")
    var clientHeight_Original: js.Function0[Double]
    
    def clientWidth(): Double
    @JSName("clientWidth")
    var clientWidth_Original: js.Function0[Double]
    
    def content(): DxElement_[HTMLElement]
    @JSName("content")
    var content_Original: js.Function0[DxElement_[HTMLElement]]
    
    def dispose(): Unit
    @JSName("dispose")
    var dispose_Original: js.Function0[Unit]
    
    def element(): DxElement_[HTMLElement]
    @JSName("element")
    var element_Original: js.Function0[DxElement_[HTMLElement]]
    
    def endUpdate(): Unit
    @JSName("endUpdate")
    var endUpdate_Original: js.Function0[Unit]
    
    def instance(): this.type
    @JSName("instance")
    var instance_Original: js.Function0[this.type]
    
    def off(eventName: String): this.type
    @JSName("off")
    var off_Original: js.Function1[/* eventName */ String, this.type]
    
    def on(eventName: String, eventHandler: js.Function): this.type
    @JSName("on")
    var on_Original: js.Function2[/* eventName */ String, /* eventHandler */ js.Function, this.type]
    
    def option(): typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.Properties
    @JSName("option")
    var option_Original: js.Function0[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.Properties]
    
    def resetOption(optionName: String): Unit
    @JSName("resetOption")
    var resetOption_Original: js.Function1[/* optionName */ String, Unit]
    
    def scrollBy(distance: Any): Unit
    def scrollBy(distance: Double): Unit
    @JSName("scrollBy")
    var scrollBy_Original: js.Function1[/* distance */ Double | Any, Unit]
    
    def scrollHeight(): Double
    @JSName("scrollHeight")
    var scrollHeight_Original: js.Function0[Double]
    
    def scrollLeft(): Double
    @JSName("scrollLeft")
    var scrollLeft_Original: js.Function0[Double]
    
    def scrollOffset(): Any
    @JSName("scrollOffset")
    var scrollOffset_Original: js.Function0[Any]
    
    def scrollTo(targetLocation: Any): Unit
    def scrollTo(targetLocation: Double): Unit
    
    def scrollToElement(element: UserDefinedElement[Element]): Unit
    @JSName("scrollToElement")
    var scrollToElement_Original: js.Function1[/* element */ UserDefinedElement[Element], Unit]
    
    @JSName("scrollTo")
    var scrollTo_Original: js.Function1[/* targetLocation */ Double | Any, Unit]
    
    def scrollTop(): Double
    @JSName("scrollTop")
    var scrollTop_Original: js.Function0[Double]
    
    def scrollWidth(): Double
    @JSName("scrollWidth")
    var scrollWidth_Original: js.Function0[Double]
    
    def update(): DxPromise[Unit]
    @JSName("update")
    var update_Original: js.Function0[DxPromise[Unit]]
  }
  object Scrollable {
    
    inline def apply(
      $element: CallbackTo[UserDefinedElement[Element]],
      beginUpdate: Callback,
      clientHeight: CallbackTo[Double],
      clientWidth: CallbackTo[Double],
      content: CallbackTo[DxElement_[HTMLElement]],
      dispose: Callback,
      element: CallbackTo[DxElement_[HTMLElement]],
      endUpdate: Callback,
      instance: CallbackTo[Scrollable],
      off: /* eventName */ String => Scrollable,
      on: (/* eventName */ String, /* eventHandler */ js.Function) => Scrollable,
      option: CallbackTo[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.Properties],
      resetOption: /* optionName */ String => Callback,
      scrollBy: /* distance */ Double | Any => Callback,
      scrollHeight: CallbackTo[Double],
      scrollLeft: CallbackTo[Double],
      scrollOffset: CallbackTo[Any],
      scrollTo: /* targetLocation */ Double | Any => Callback,
      scrollToElement: /* element */ UserDefinedElement[Element] => Callback,
      scrollTop: CallbackTo[Double],
      scrollWidth: CallbackTo[Double],
      update: CallbackTo[DxPromise[Unit]]
    ): Scrollable = {
      val __obj = js.Dynamic.literal($element = $element.toJsFn, beginUpdate = beginUpdate.toJsFn, clientHeight = clientHeight.toJsFn, clientWidth = clientWidth.toJsFn, content = content.toJsFn, dispose = dispose.toJsFn, element = element.toJsFn, endUpdate = endUpdate.toJsFn, instance = instance.toJsFn, off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), option = option.toJsFn, resetOption = js.Any.fromFunction1((t0: /* optionName */ String) => resetOption(t0).runNow()), scrollBy = js.Any.fromFunction1((t0: /* distance */ Double | Any) => scrollBy(t0).runNow()), scrollHeight = scrollHeight.toJsFn, scrollLeft = scrollLeft.toJsFn, scrollOffset = scrollOffset.toJsFn, scrollTo = js.Any.fromFunction1((t0: /* targetLocation */ Double | Any) => scrollTo(t0).runNow()), scrollToElement = js.Any.fromFunction1((t0: /* element */ UserDefinedElement[Element]) => scrollToElement(t0).runNow()), scrollTop = scrollTop.toJsFn, scrollWidth = scrollWidth.toJsFn, update = update.toJsFn)
      __obj.asInstanceOf[Scrollable]
    }
    
    extension [Self <: Scrollable](x: Self) {
      
      inline def set$element(value: CallbackTo[UserDefinedElement[Element]]): Self = StObject.set(x, "$element", value.toJsFn)
      
      inline def setBeginUpdate(value: Callback): Self = StObject.set(x, "beginUpdate", value.toJsFn)
      
      inline def setClientHeight(value: CallbackTo[Double]): Self = StObject.set(x, "clientHeight", value.toJsFn)
      
      inline def setClientWidth(value: CallbackTo[Double]): Self = StObject.set(x, "clientWidth", value.toJsFn)
      
      inline def setContent(value: CallbackTo[DxElement_[HTMLElement]]): Self = StObject.set(x, "content", value.toJsFn)
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setElement(value: CallbackTo[DxElement_[HTMLElement]]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setEndUpdate(value: Callback): Self = StObject.set(x, "endUpdate", value.toJsFn)
      
      inline def setInstance(value: CallbackTo[Scrollable]): Self = StObject.set(x, "instance", value.toJsFn)
      
      inline def setOff(value: /* eventName */ String => Scrollable): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(value: (/* eventName */ String, /* eventHandler */ js.Function) => Scrollable): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOption(value: CallbackTo[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.Properties]): Self = StObject.set(x, "option", value.toJsFn)
      
      inline def setResetOption(value: /* optionName */ String => Callback): Self = StObject.set(x, "resetOption", js.Any.fromFunction1((t0: /* optionName */ String) => value(t0).runNow()))
      
      inline def setScrollBy(value: /* distance */ Double | Any => Callback): Self = StObject.set(x, "scrollBy", js.Any.fromFunction1((t0: /* distance */ Double | Any) => value(t0).runNow()))
      
      inline def setScrollHeight(value: CallbackTo[Double]): Self = StObject.set(x, "scrollHeight", value.toJsFn)
      
      inline def setScrollLeft(value: CallbackTo[Double]): Self = StObject.set(x, "scrollLeft", value.toJsFn)
      
      inline def setScrollOffset(value: CallbackTo[Any]): Self = StObject.set(x, "scrollOffset", value.toJsFn)
      
      inline def setScrollTo(value: /* targetLocation */ Double | Any => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: /* targetLocation */ Double | Any) => value(t0).runNow()))
      
      inline def setScrollToElement(value: /* element */ UserDefinedElement[Element] => Callback): Self = StObject.set(x, "scrollToElement", js.Any.fromFunction1((t0: /* element */ UserDefinedElement[Element]) => value(t0).runNow()))
      
      inline def setScrollTop(value: CallbackTo[Double]): Self = StObject.set(x, "scrollTop", value.toJsFn)
      
      inline def setScrollWidth(value: CallbackTo[Double]): Self = StObject.set(x, "scrollWidth", value.toJsFn)
      
      inline def setUpdate(value: CallbackTo[DxPromise[Unit]]): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  trait SelectAllValueChangedEvent[TKey]
    extends StObject
       with EventInfo[dxTreeView[TKey]] {
    
    val value: js.UndefOr[Boolean] = js.undefined
  }
  object SelectAllValueChangedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): SelectAllValueChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectAllValueChangedEvent[TKey]]
    }
    
    extension [Self <: SelectAllValueChangedEvent[?], TKey](x: Self & SelectAllValueChangedEvent[TKey]) {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type SelectionChangedEvent[TKey] = EventInfo[dxTreeView[TKey]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.normal
    - typingsJapgolly.devextreme.devextremeStrings.selectAll
  */
  trait TreeViewCheckBoxMode extends StObject
  object TreeViewCheckBoxMode {
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def normal: typingsJapgolly.devextreme.devextremeStrings.normal = "normal".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.normal]
    
    inline def selectAll: typingsJapgolly.devextreme.devextremeStrings.selectAll = "selectAll".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.selectAll]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.dblclick_
    - typingsJapgolly.devextreme.devextremeStrings.click
  */
  trait TreeViewExpandEvent extends StObject
  object TreeViewExpandEvent {
    
    inline def click: typingsJapgolly.devextreme.devextremeStrings.click = "click".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.click]
    
    inline def dblclick: dblclick_ = "dblclick".asInstanceOf[dblclick_]
  }
}
