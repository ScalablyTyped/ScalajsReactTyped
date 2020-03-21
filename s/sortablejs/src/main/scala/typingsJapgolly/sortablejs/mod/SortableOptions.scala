package typingsJapgolly.sortablejs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.sortablejs.AnonGet
import typingsJapgolly.sortablejs.AnonX
import typingsJapgolly.sortablejs.sortablejsNumbers.`-1`
import typingsJapgolly.sortablejs.sortablejsNumbers.`1`
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOptions extends js.Object {
  /**
    * ms, animation speed moving items when sorting, `0` — without animation
    */
  var animation: js.UndefOr[Double] = js.undefined
  /**
    * Class name for the chosen item
    */
  var chosenClass: js.UndefOr[String] = js.undefined
  var dataIdAttr: js.UndefOr[String] = js.undefined
  /**
    * time in milliseconds to define when the sorting should start
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Only delay if user is using touch
    */
  var delayOnTouchOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Direction of Sortable
    * (will be detected automatically if not given)
    */
  var direction: js.UndefOr[
    (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
  ] = js.undefined
  /**
    * Disables the sortable if set to true.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Class name for the dragging item
    */
  var dragClass: js.UndefOr[String] = js.undefined
  /**
    * Specifies which items inside the element should be draggable
    */
  var draggable: js.UndefOr[String] = js.undefined
  var dragoverBubble: js.UndefOr[Boolean] = js.undefined
  var dropBubble: js.UndefOr[Boolean] = js.undefined
  /**
    * Easing for animation. Defaults to null.
    *
    * See https://easings.net/ for examples.
    *
    * For other possible values, see
    * https://www.w3schools.com/cssref/css3_pr_animation-timing-function.asp
    *
    * @example
    *
    * // CSS functions
    * | 'steps(int, start | end)'
    * | 'cubic-bezier(n, n, n, n)'
    *
    * // CSS values
    * | 'linear'
    * | 'ease'
    * | 'ease-in'
    * | 'ease-out'
    * | 'ease-in-out'
    * | 'step-start'
    * | 'step-end'
    * | 'initial'
    * | 'inherit'
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * distance mouse must be from empty sortable
    * to insert drag element into it
    */
  var emptyInsertThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Class name for the cloned DOM Element when using forceFallback
    */
  var fallbackClass: js.UndefOr[String] = js.undefined
  var fallbackOffset: js.UndefOr[AnonX] = js.undefined
  /**
    * Appends the cloned DOM Element into the Document's Body
    */
  var fallbackOnBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify in pixels how far the mouse should move before it's considered as a drag.
    */
  var fallbackTolerance: js.UndefOr[Double] = js.undefined
  /**
    * Selectors that do not lead to dragging (String or Function)
    */
  var filter: js.UndefOr[
    String | (js.ThisFunction3[
      /* this */ Sortable, 
      /* event */ Event_ | TouchEvent, 
      /* target */ HTMLElement, 
      /* sortable */ Sortable, 
      Boolean
    ])
  ] = js.undefined
  /**
    * ignore the HTML5 DnD behaviour and force the fallback to kick in
    */
  var forceFallback: js.UndefOr[Boolean] = js.undefined
  /**
    * Class name for the drop placeholder
    */
  var ghostClass: js.UndefOr[String] = js.undefined
  /**
    * To drag elements from one list into another, both lists must have the same group value.
    * You can also define whether lists can give away, give and keep a copy (clone), and receive elements.
    */
  var group: js.UndefOr[String | GroupOptions] = js.undefined
  /**
    * Drag handle selector within list items
    */
  var handle: js.UndefOr[String] = js.undefined
  var ignore: js.UndefOr[String] = js.undefined
  /**
    * Will always use inverted swap zone if set to true
    */
  var invertSwap: js.UndefOr[Boolean] = js.undefined
  /**
    * Threshold of the inverted swap zone
    * (will be set to `swapThreshold` value by default)
    */
  var invertedSwapThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Element is dropped into the list from another list
    */
  var onAdd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Called when dragging element changes position
    */
  var onChange: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.undefined
  /**
    * Element is chosen
    */
  var onChoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Created a clone of an element
    */
  var onClone: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Element dragging ended
    */
  var onEnd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Attempt to drag a filtered element
    */
  var onFilter: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Event when you move an item in the list or between lists
    */
  var onMove: js.UndefOr[
    js.Function2[/* evt */ MoveEvent, /* originalEvent */ Event_, Boolean | `-1` | `1`]
  ] = js.undefined
  /**
    * Element is removed from the list into another list
    */
  var onRemove: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Called by any change to the list (add / update / remove)
    */
  var onSort: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Element dragging started
    */
  var onStart: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Element is unchosen
    */
  var onUnchoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Changed sorting within list
    */
  var onUpdate: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Call `event.preventDefault()` when triggered `filter`
    */
  var preventOnFilter: js.UndefOr[Boolean] = js.undefined
  /**
    * Remove the clone element when it is not showing,
    * rather than just hiding it
    */
  var removeCloneOnHide: js.UndefOr[Boolean] = js.undefined
  var setData: js.UndefOr[
    js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
  ] = js.undefined
  /**
    * sorting inside list
    */
  var sort: js.UndefOr[Boolean] = js.undefined
  var store: js.UndefOr[AnonGet] = js.undefined
  /**
    * Threshold of the swap zone.
    * Defaults to `1`
    */
  var swapThreshold: js.UndefOr[Double] = js.undefined
  /**
    * How many *pixels* the point should move before cancelling a delayed drag event
    */
  var touchStartThreshold: js.UndefOr[Double] = js.undefined
}

object SortableOptions {
  @scala.inline
  def apply(
    animation: Int | Double = null,
    chosenClass: String = null,
    dataIdAttr: String = null,
    delay: Int | Double = null,
    delayOnTouchOnly: js.UndefOr[Boolean] = js.undefined,
    direction: (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragClass: String = null,
    draggable: String = null,
    dragoverBubble: js.UndefOr[Boolean] = js.undefined,
    dropBubble: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    emptyInsertThreshold: Int | Double = null,
    fallbackClass: String = null,
    fallbackOffset: AnonX = null,
    fallbackOnBody: js.UndefOr[Boolean] = js.undefined,
    fallbackTolerance: Int | Double = null,
    filter: String | (js.ThisFunction3[
      /* this */ Sortable, 
      /* event */ Event_ | TouchEvent, 
      /* target */ HTMLElement, 
      /* sortable */ Sortable, 
      Boolean
    ]) = null,
    forceFallback: js.UndefOr[Boolean] = js.undefined,
    ghostClass: String = null,
    group: String | GroupOptions = null,
    handle: String = null,
    ignore: String = null,
    invertSwap: js.UndefOr[Boolean] = js.undefined,
    invertedSwapThreshold: Int | Double = null,
    onAdd: /* event */ SortableEvent => Callback = null,
    onChange: /* evt */ SortableEvent => Callback = null,
    onChoose: /* event */ SortableEvent => Callback = null,
    onClone: /* event */ SortableEvent => Callback = null,
    onEnd: /* event */ SortableEvent => Callback = null,
    onFilter: /* event */ SortableEvent => Callback = null,
    onMove: (/* evt */ MoveEvent, /* originalEvent */ Event_) => CallbackTo[Boolean | `-1` | `1`] = null,
    onRemove: /* event */ SortableEvent => Callback = null,
    onSort: /* event */ SortableEvent => Callback = null,
    onStart: /* event */ SortableEvent => Callback = null,
    onUnchoose: /* event */ SortableEvent => Callback = null,
    onUpdate: /* event */ SortableEvent => Callback = null,
    preventOnFilter: js.UndefOr[Boolean] = js.undefined,
    removeCloneOnHide: js.UndefOr[Boolean] = js.undefined,
    setData: (/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement) => Callback = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    store: AnonGet = null,
    swapThreshold: Int | Double = null,
    touchStartThreshold: Int | Double = null
  ): SortableOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (chosenClass != null) __obj.updateDynamic("chosenClass")(chosenClass.asInstanceOf[js.Any])
    if (dataIdAttr != null) __obj.updateDynamic("dataIdAttr")(dataIdAttr.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(delayOnTouchOnly)) __obj.updateDynamic("delayOnTouchOnly")(delayOnTouchOnly.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(dragoverBubble)) __obj.updateDynamic("dragoverBubble")(dragoverBubble.asInstanceOf[js.Any])
    if (!js.isUndefined(dropBubble)) __obj.updateDynamic("dropBubble")(dropBubble.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (emptyInsertThreshold != null) __obj.updateDynamic("emptyInsertThreshold")(emptyInsertThreshold.asInstanceOf[js.Any])
    if (fallbackClass != null) __obj.updateDynamic("fallbackClass")(fallbackClass.asInstanceOf[js.Any])
    if (fallbackOffset != null) __obj.updateDynamic("fallbackOffset")(fallbackOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackOnBody)) __obj.updateDynamic("fallbackOnBody")(fallbackOnBody.asInstanceOf[js.Any])
    if (fallbackTolerance != null) __obj.updateDynamic("fallbackTolerance")(fallbackTolerance.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFallback)) __obj.updateDynamic("forceFallback")(forceFallback.asInstanceOf[js.Any])
    if (ghostClass != null) __obj.updateDynamic("ghostClass")(ghostClass.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(invertSwap)) __obj.updateDynamic("invertSwap")(invertSwap.asInstanceOf[js.Any])
    if (invertedSwapThreshold != null) __obj.updateDynamic("invertedSwapThreshold")(invertedSwapThreshold.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onAdd(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.sortablejs.mod.SortableEvent) => onChange(t0).runNow()))
    if (onChoose != null) __obj.updateDynamic("onChoose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onChoose(t0).runNow()))
    if (onClone != null) __obj.updateDynamic("onClone")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onClone(t0).runNow()))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onEnd(t0).runNow()))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onFilter(t0).runNow()))
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction2((t0: /* evt */ typingsJapgolly.sortablejs.mod.MoveEvent, t1: /* originalEvent */ typingsJapgolly.std.Event_) => onMove(t0, t1).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onRemove(t0).runNow()))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onSort(t0).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onStart(t0).runNow()))
    if (onUnchoose != null) __obj.updateDynamic("onUnchoose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onUnchoose(t0).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onUpdate(t0).runNow()))
    if (!js.isUndefined(preventOnFilter)) __obj.updateDynamic("preventOnFilter")(preventOnFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(removeCloneOnHide)) __obj.updateDynamic("removeCloneOnHide")(removeCloneOnHide.asInstanceOf[js.Any])
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction2((t0: /* dataTransfer */ org.scalajs.dom.raw.DataTransfer, t1: /* draggedElement */ org.scalajs.dom.raw.HTMLElement) => setData(t0, t1).runNow()))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (swapThreshold != null) __obj.updateDynamic("swapThreshold")(swapThreshold.asInstanceOf[js.Any])
    if (touchStartThreshold != null) __obj.updateDynamic("touchStartThreshold")(touchStartThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableOptions]
  }
}

