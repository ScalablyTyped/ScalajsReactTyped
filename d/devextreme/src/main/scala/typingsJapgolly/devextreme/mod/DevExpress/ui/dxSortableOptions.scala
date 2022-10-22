package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.common.DragHighlight
import typingsJapgolly.devextreme.mod.DevExpress.common.Orientation
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSortable.AddEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSortable.DragChangeEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSortable.DragEndEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSortable.DragMoveEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSortable.DragStartEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSortable.DragTemplateData
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSortable.RemoveEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSortable.ReorderEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSortableOptions
  extends StObject
     with DraggableBaseOptions[dxSortable] {
  
  /**
    * Allows a user to drop an item inside another item.
    */
  var allowDropInsideItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows a user to reorder sortable items.
    */
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies custom markup to be shown instead of the item being dragged.
    */
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ DragTemplateData, 
      /* containerElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies how to highlight the item&apos;s drop position.
    */
  var dropFeedbackMode: js.UndefOr[DragHighlight] = js.undefined
  
  /**
    * Specifies a CSS selector for the items that can be dragged.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Notifies the UI component of the items&apos; orientation.
    */
  var itemOrientation: js.UndefOr[Orientation] = js.undefined
  
  /**
    * Moves an element in the HTML markup when it is dropped.
    */
  var moveItemOnDrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is called when a new item is added.
    */
  var onAdd: js.UndefOr[js.Function1[/* e */ AddEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when the dragged item&apos;s position in the list is changed.
    */
  var onDragChange: js.UndefOr[js.Function1[/* e */ DragChangeEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when the drag gesture is finished.
    */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ DragEndEvent, Unit]] = js.undefined
  
  /**
    * A function that is called every time a draggable item is moved.
    */
  var onDragMove: js.UndefOr[js.Function1[/* e */ DragMoveEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when drag gesture is initialized.
    */
  var onDragStart: js.UndefOr[js.Function1[/* e */ DragStartEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when a draggable item is removed.
    */
  var onRemove: js.UndefOr[js.Function1[/* e */ RemoveEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when the draggable items are reordered.
    */
  var onReorder: js.UndefOr[js.Function1[/* e */ ReorderEvent, Unit]] = js.undefined
}
object dxSortableOptions {
  
  inline def apply(): dxSortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSortableOptions]
  }
  
  extension [Self <: dxSortableOptions](x: Self) {
    
    inline def setAllowDropInsideItem(value: Boolean): Self = StObject.set(x, "allowDropInsideItem", value.asInstanceOf[js.Any])
    
    inline def setAllowDropInsideItemUndefined: Self = StObject.set(x, "allowDropInsideItem", js.undefined)
    
    inline def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
    
    inline def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
    
    inline def setDragTemplate(
      value: template | (js.Function2[
          /* dragInfo */ DragTemplateData, 
          /* containerElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dragTemplate", value.asInstanceOf[js.Any])
    
    inline def setDragTemplateFunction2(
      value: (/* dragInfo */ DragTemplateData, /* containerElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dragTemplate", js.Any.fromFunction2(value))
    
    inline def setDragTemplateUndefined: Self = StObject.set(x, "dragTemplate", js.undefined)
    
    inline def setDropFeedbackMode(value: DragHighlight): Self = StObject.set(x, "dropFeedbackMode", value.asInstanceOf[js.Any])
    
    inline def setDropFeedbackModeUndefined: Self = StObject.set(x, "dropFeedbackMode", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setItemOrientation(value: Orientation): Self = StObject.set(x, "itemOrientation", value.asInstanceOf[js.Any])
    
    inline def setItemOrientationUndefined: Self = StObject.set(x, "itemOrientation", js.undefined)
    
    inline def setMoveItemOnDrop(value: Boolean): Self = StObject.set(x, "moveItemOnDrop", value.asInstanceOf[js.Any])
    
    inline def setMoveItemOnDropUndefined: Self = StObject.set(x, "moveItemOnDrop", js.undefined)
    
    inline def setOnAdd(value: /* e */ AddEvent => Callback): Self = StObject.set(x, "onAdd", js.Any.fromFunction1((t0: /* e */ AddEvent) => value(t0).runNow()))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnDragChange(value: /* e */ DragChangeEvent => Callback): Self = StObject.set(x, "onDragChange", js.Any.fromFunction1((t0: /* e */ DragChangeEvent) => value(t0).runNow()))
    
    inline def setOnDragChangeUndefined: Self = StObject.set(x, "onDragChange", js.undefined)
    
    inline def setOnDragEnd(value: /* e */ DragEndEvent => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: /* e */ DragEndEvent) => value(t0).runNow()))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragMove(value: /* e */ DragMoveEvent => Callback): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1((t0: /* e */ DragMoveEvent) => value(t0).runNow()))
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(value: /* e */ DragStartEvent => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: /* e */ DragStartEvent) => value(t0).runNow()))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnRemove(value: /* e */ RemoveEvent => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction1((t0: /* e */ RemoveEvent) => value(t0).runNow()))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOnReorder(value: /* e */ ReorderEvent => Callback): Self = StObject.set(x, "onReorder", js.Any.fromFunction1((t0: /* e */ ReorderEvent) => value(t0).runNow()))
    
    inline def setOnReorderUndefined: Self = StObject.set(x, "onReorder", js.undefined)
  }
}
