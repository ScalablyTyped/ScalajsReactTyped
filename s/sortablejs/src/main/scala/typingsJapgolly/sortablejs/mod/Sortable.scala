package typingsJapgolly.sortablejs.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.sortablejs.AnonGet
import typingsJapgolly.sortablejs.AnonX
import typingsJapgolly.sortablejs.sortablejsStrings.animation
import typingsJapgolly.sortablejs.sortablejsStrings.bubbleScroll
import typingsJapgolly.sortablejs.sortablejsStrings.chosenClass
import typingsJapgolly.sortablejs.sortablejsStrings.dataIdAttr
import typingsJapgolly.sortablejs.sortablejsStrings.delay
import typingsJapgolly.sortablejs.sortablejsStrings.delayOnTouchOnly
import typingsJapgolly.sortablejs.sortablejsStrings.direction
import typingsJapgolly.sortablejs.sortablejsStrings.disabled
import typingsJapgolly.sortablejs.sortablejsStrings.dragClass
import typingsJapgolly.sortablejs.sortablejsStrings.draggable
import typingsJapgolly.sortablejs.sortablejsStrings.dragoverBubble
import typingsJapgolly.sortablejs.sortablejsStrings.dropBubble
import typingsJapgolly.sortablejs.sortablejsStrings.easing
import typingsJapgolly.sortablejs.sortablejsStrings.emptyInsertThreshold
import typingsJapgolly.sortablejs.sortablejsStrings.fallbackClass
import typingsJapgolly.sortablejs.sortablejsStrings.fallbackOffset
import typingsJapgolly.sortablejs.sortablejsStrings.fallbackOnBody
import typingsJapgolly.sortablejs.sortablejsStrings.fallbackTolerance
import typingsJapgolly.sortablejs.sortablejsStrings.filter
import typingsJapgolly.sortablejs.sortablejsStrings.forceFallback
import typingsJapgolly.sortablejs.sortablejsStrings.ghostClass
import typingsJapgolly.sortablejs.sortablejsStrings.group
import typingsJapgolly.sortablejs.sortablejsStrings.handle
import typingsJapgolly.sortablejs.sortablejsStrings.ignore
import typingsJapgolly.sortablejs.sortablejsStrings.invertSwap
import typingsJapgolly.sortablejs.sortablejsStrings.invertedSwapThreshold
import typingsJapgolly.sortablejs.sortablejsStrings.multiDrag
import typingsJapgolly.sortablejs.sortablejsStrings.multiDragKey
import typingsJapgolly.sortablejs.sortablejsStrings.preventOnFilter
import typingsJapgolly.sortablejs.sortablejsStrings.removeCloneOnHide
import typingsJapgolly.sortablejs.sortablejsStrings.removeOnSpill
import typingsJapgolly.sortablejs.sortablejsStrings.revertOnSpill
import typingsJapgolly.sortablejs.sortablejsStrings.scroll
import typingsJapgolly.sortablejs.sortablejsStrings.scrollSensitivity
import typingsJapgolly.sortablejs.sortablejsStrings.scrollSpeed
import typingsJapgolly.sortablejs.sortablejsStrings.selectedClass
import typingsJapgolly.sortablejs.sortablejsStrings.sort
import typingsJapgolly.sortablejs.sortablejsStrings.store
import typingsJapgolly.sortablejs.sortablejsStrings.swap
import typingsJapgolly.sortablejs.sortablejsStrings.swapClass
import typingsJapgolly.sortablejs.sortablejsStrings.swapThreshold
import typingsJapgolly.sortablejs.sortablejsStrings.touchStartThreshold
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sortable extends js.Object {
  var el: HTMLElement = js.native
  var options: Options = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
    * @param element an HTMLElement or selector string.
    * @param selector default: `options.draggable`
    */
  def closest(element: HTMLElement): HTMLElement | Null = js.native
  def closest(element: HTMLElement, selector: String): HTMLElement | Null = js.native
  /**
    * Removes the sortable functionality completely.
    */
  def destroy(): Unit = js.native
  @JSName("option")
  def option_animation(name: animation): Double = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_animation(name: animation, value: Double): Unit = js.native
  @JSName("option")
  def option_bubbleScroll(name: bubbleScroll): Boolean = js.native
  @JSName("option")
  def option_bubbleScroll(name: bubbleScroll, value: Boolean): Unit = js.native
  @JSName("option")
  def option_chosenClass(name: chosenClass): String = js.native
  @JSName("option")
  def option_chosenClass(name: chosenClass, value: String): Unit = js.native
  @JSName("option")
  def option_dataIdAttr(name: dataIdAttr): String = js.native
  @JSName("option")
  def option_dataIdAttr(name: dataIdAttr, value: String): Unit = js.native
  @JSName("option")
  def option_delay(name: delay): Double = js.native
  @JSName("option")
  def option_delay(name: delay, value: Double): Unit = js.native
  @JSName("option")
  def option_delayOnTouchOnly(name: delayOnTouchOnly): Boolean = js.native
  @JSName("option")
  def option_delayOnTouchOnly(name: delayOnTouchOnly, value: Boolean): Unit = js.native
  @JSName("option")
  def option_direction(name: direction): (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction = js.native
  @JSName("option")
  def option_direction(
    name: direction,
    value: js.Function3[
      /* evt */ SortableEvent, 
      /* target */ typingsJapgolly.std.HTMLElement, 
      /* dragEl */ typingsJapgolly.std.HTMLElement, 
      Direction
    ]
  ): Unit = js.native
  @JSName("option")
  def option_direction(name: direction, value: Direction): Unit = js.native
  @JSName("option")
  def option_disabled(name: disabled): Boolean = js.native
  @JSName("option")
  def option_disabled(name: disabled, value: Boolean): Unit = js.native
  @JSName("option")
  def option_dragClass(name: dragClass): String = js.native
  @JSName("option")
  def option_dragClass(name: dragClass, value: String): Unit = js.native
  @JSName("option")
  def option_draggable(name: draggable): String = js.native
  @JSName("option")
  def option_draggable(name: draggable, value: String): Unit = js.native
  @JSName("option")
  def option_dragoverBubble(name: dragoverBubble): Boolean = js.native
  @JSName("option")
  def option_dragoverBubble(name: dragoverBubble, value: Boolean): Unit = js.native
  @JSName("option")
  def option_dropBubble(name: dropBubble): Boolean = js.native
  @JSName("option")
  def option_dropBubble(name: dropBubble, value: Boolean): Unit = js.native
  @JSName("option")
  def option_easing(name: easing): String = js.native
  @JSName("option")
  def option_easing(name: easing, value: String): Unit = js.native
  @JSName("option")
  def option_emptyInsertThreshold(name: emptyInsertThreshold): Double = js.native
  @JSName("option")
  def option_emptyInsertThreshold(name: emptyInsertThreshold, value: Double): Unit = js.native
  @JSName("option")
  def option_fallbackClass(name: fallbackClass): String = js.native
  @JSName("option")
  def option_fallbackClass(name: fallbackClass, value: String): Unit = js.native
  @JSName("option")
  def option_fallbackOffset(name: fallbackOffset): AnonX = js.native
  @JSName("option")
  def option_fallbackOffset(name: fallbackOffset, value: AnonX): Unit = js.native
  @JSName("option")
  def option_fallbackOnBody(name: fallbackOnBody): Boolean = js.native
  @JSName("option")
  def option_fallbackOnBody(name: fallbackOnBody, value: Boolean): Unit = js.native
  @JSName("option")
  def option_fallbackTolerance(name: fallbackTolerance): Double = js.native
  @JSName("option")
  def option_fallbackTolerance(name: fallbackTolerance, value: Double): Unit = js.native
  @JSName("option")
  def option_filter(name: filter): String | (js.ThisFunction3[
    /* this */ this.type, 
    /* event */ Event_ | TouchEvent, 
    /* target */ HTMLElement, 
    /* sortable */ this.type, 
    Boolean
  ]) = js.native
  @JSName("option")
  def option_filter(name: filter, value: String): Unit = js.native
  @JSName("option")
  def option_filter(
    name: filter,
    value: js.ThisFunction3[
      /* this */ this.type, 
      /* event */ Event_ | typingsJapgolly.std.TouchEvent, 
      /* target */ typingsJapgolly.std.HTMLElement, 
      /* sortable */ this.type, 
      Boolean
    ]
  ): Unit = js.native
  @JSName("option")
  def option_forceFallback(name: forceFallback): Boolean = js.native
  @JSName("option")
  def option_forceFallback(name: forceFallback, value: Boolean): Unit = js.native
  @JSName("option")
  def option_ghostClass(name: ghostClass): String = js.native
  @JSName("option")
  def option_ghostClass(name: ghostClass, value: String): Unit = js.native
  @JSName("option")
  def option_group(name: group): String | GroupOptions = js.native
  @JSName("option")
  def option_group(name: group, value: String): Unit = js.native
  @JSName("option")
  def option_group(name: group, value: GroupOptions): Unit = js.native
  @JSName("option")
  def option_handle(name: handle): String = js.native
  @JSName("option")
  def option_handle(name: handle, value: String): Unit = js.native
  @JSName("option")
  def option_ignore(name: ignore): String = js.native
  @JSName("option")
  def option_ignore(name: ignore, value: String): Unit = js.native
  @JSName("option")
  def option_invertSwap(name: invertSwap): Boolean = js.native
  @JSName("option")
  def option_invertSwap(name: invertSwap, value: Boolean): Unit = js.native
  @JSName("option")
  def option_invertedSwapThreshold(name: invertedSwapThreshold): Double = js.native
  @JSName("option")
  def option_invertedSwapThreshold(name: invertedSwapThreshold, value: Double): Unit = js.native
  @JSName("option")
  def option_multiDrag(name: multiDrag): Boolean = js.native
  @JSName("option")
  def option_multiDrag(name: multiDrag, value: Boolean): Unit = js.native
  @JSName("option")
  def option_multiDragKey(name: multiDragKey): Null = js.native
  @JSName("option")
  def option_multiDragKey_Unit(name: multiDragKey): Unit = js.native
  @JSName("option")
  def option_preventOnFilter(name: preventOnFilter): Boolean = js.native
  @JSName("option")
  def option_preventOnFilter(name: preventOnFilter, value: Boolean): Unit = js.native
  @JSName("option")
  def option_removeCloneOnHide(name: removeCloneOnHide): Boolean = js.native
  @JSName("option")
  def option_removeCloneOnHide(name: removeCloneOnHide, value: Boolean): Unit = js.native
  @JSName("option")
  def option_removeOnSpill(name: removeOnSpill): Boolean = js.native
  @JSName("option")
  def option_removeOnSpill(name: removeOnSpill, value: Boolean): Unit = js.native
  @JSName("option")
  def option_revertOnSpill(name: revertOnSpill): Boolean = js.native
  @JSName("option")
  def option_revertOnSpill(name: revertOnSpill, value: Boolean): Unit = js.native
  @JSName("option")
  def option_scroll(name: scroll): Boolean | HTMLElement = js.native
  @JSName("option")
  def option_scroll(name: scroll, value: Boolean): Unit = js.native
  @JSName("option")
  def option_scroll(name: scroll, value: typingsJapgolly.std.HTMLElement): Unit = js.native
  @JSName("option")
  def option_scrollSensitivity(name: scrollSensitivity): Double = js.native
  @JSName("option")
  def option_scrollSensitivity(name: scrollSensitivity, value: Double): Unit = js.native
  @JSName("option")
  def option_scrollSpeed(name: scrollSpeed): Double = js.native
  @JSName("option")
  def option_scrollSpeed(name: scrollSpeed, value: Double): Unit = js.native
  @JSName("option")
  def option_selectedClass(name: selectedClass): String = js.native
  @JSName("option")
  def option_selectedClass(name: selectedClass, value: String): Unit = js.native
  @JSName("option")
  def option_sort(name: sort): Boolean = js.native
  @JSName("option")
  def option_sort(name: sort, value: Boolean): Unit = js.native
  @JSName("option")
  def option_store(name: store): AnonGet = js.native
  @JSName("option")
  def option_store(name: store, value: AnonGet): Unit = js.native
  @JSName("option")
  def option_swap(name: swap): Boolean = js.native
  @JSName("option")
  def option_swap(name: swap, value: Boolean): Unit = js.native
  @JSName("option")
  def option_swapClass(name: swapClass): String = js.native
  @JSName("option")
  def option_swapClass(name: swapClass, value: String): Unit = js.native
  @JSName("option")
  def option_swapThreshold(name: swapThreshold): Double = js.native
  @JSName("option")
  def option_swapThreshold(name: swapThreshold, value: Double): Unit = js.native
  @JSName("option")
  def option_touchStartThreshold(name: touchStartThreshold): Double = js.native
  @JSName("option")
  def option_touchStartThreshold(name: touchStartThreshold, value: Double): Unit = js.native
  /**
    * Saving and restoring of the sort.
    */
  def save(): Unit = js.native
  /**
    * Sorts the elements according to the array.
    * @param order an array of strings to sort.
    */
  def sort(order: js.Array[String]): Unit = js.native
  /**
    * Serializes the sortable's item data-id's (dataIdAttr option) into an array of string.
    */
  def toArray(): js.Array[String] = js.native
}

