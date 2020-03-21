package typingsJapgolly.ionicons.stencilCoreMod.JSXBase

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CompositionEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[T] extends js.Object {
  var onAnimationEnd: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  var onAnimationIteration: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.undefined
  // MouseEvents
  var onAuxClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
  var onBlurCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onChangeCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onClickCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionStart: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionUpdate: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onContextMenuCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onCopyCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onCut: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onCutCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onDblClickCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEndCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEnterCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragExit: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragExitCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragOverCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragStartCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDropCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
   // also a Media Event
  var onErrorCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
  var onFocusCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
  var onGotPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onInput: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInputCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInvalid: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onInvalidCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyDownCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyPressCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var onKeyUpCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLoadCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLostPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseDownCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseOut: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseOutCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseOver: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseOverCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onMouseUpCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onPasteCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.undefined
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerOutCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerOver: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerOverCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onResetCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[js.Function1[/* event */ UIEvent, Unit]] = js.undefined
  var onScrollCapture: js.UndefOr[js.Function1[/* event */ UIEvent, Unit]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onSubmitCapture: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  var onTouchStartCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[js.Function1[/* event */ TransitionEvent, Unit]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[js.Function1[/* event */ TransitionEvent, Unit]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.undefined
  var onWheelCapture: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.undefined
  var ref: js.UndefOr[js.Function1[/* elm */ js.UndefOr[T], Unit]] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply[T](
    onAnimationEnd: /* event */ AnimationEvent => Callback = null,
    onAnimationEndCapture: /* event */ AnimationEvent => Callback = null,
    onAnimationIteration: /* event */ AnimationEvent => Callback = null,
    onAnimationIterationCapture: /* event */ AnimationEvent => Callback = null,
    onAnimationStart: /* event */ AnimationEvent => Callback = null,
    onAnimationStartCapture: /* event */ AnimationEvent => Callback = null,
    onAuxClick: /* event */ MouseEvent => Callback = null,
    onBlur: /* event */ FocusEvent => Callback = null,
    onBlurCapture: /* event */ FocusEvent => Callback = null,
    onChange: /* event */ Event_ => Callback = null,
    onChangeCapture: /* event */ Event_ => Callback = null,
    onClick: /* event */ MouseEvent => Callback = null,
    onClickCapture: /* event */ MouseEvent => Callback = null,
    onCompositionEnd: /* event */ CompositionEvent => Callback = null,
    onCompositionEndCapture: /* event */ CompositionEvent => Callback = null,
    onCompositionStart: /* event */ CompositionEvent => Callback = null,
    onCompositionStartCapture: /* event */ CompositionEvent => Callback = null,
    onCompositionUpdate: /* event */ CompositionEvent => Callback = null,
    onCompositionUpdateCapture: /* event */ CompositionEvent => Callback = null,
    onContextMenu: /* event */ MouseEvent => Callback = null,
    onContextMenuCapture: /* event */ MouseEvent => Callback = null,
    onCopy: /* event */ ClipboardEvent => Callback = null,
    onCopyCapture: /* event */ ClipboardEvent => Callback = null,
    onCut: /* event */ ClipboardEvent => Callback = null,
    onCutCapture: /* event */ ClipboardEvent => Callback = null,
    onDblClick: /* event */ MouseEvent => Callback = null,
    onDblClickCapture: /* event */ MouseEvent => Callback = null,
    onDrag: /* event */ DragEvent => Callback = null,
    onDragCapture: /* event */ DragEvent => Callback = null,
    onDragEnd: /* event */ DragEvent => Callback = null,
    onDragEndCapture: /* event */ DragEvent => Callback = null,
    onDragEnter: /* event */ DragEvent => Callback = null,
    onDragEnterCapture: /* event */ DragEvent => Callback = null,
    onDragExit: /* event */ DragEvent => Callback = null,
    onDragExitCapture: /* event */ DragEvent => Callback = null,
    onDragLeave: /* event */ DragEvent => Callback = null,
    onDragLeaveCapture: /* event */ DragEvent => Callback = null,
    onDragOver: /* event */ DragEvent => Callback = null,
    onDragOverCapture: /* event */ DragEvent => Callback = null,
    onDragStart: /* event */ DragEvent => Callback = null,
    onDragStartCapture: /* event */ DragEvent => Callback = null,
    onDrop: /* event */ DragEvent => Callback = null,
    onDropCapture: /* event */ DragEvent => Callback = null,
    onError: /* event */ Event_ => Callback = null,
    onErrorCapture: /* event */ Event_ => Callback = null,
    onFocus: /* event */ FocusEvent => Callback = null,
    onFocusCapture: /* event */ FocusEvent => Callback = null,
    onGotPointerCapture: /* event */ PointerEvent => Callback = null,
    onGotPointerCaptureCapture: /* event */ PointerEvent => Callback = null,
    onInput: /* event */ Event_ => Callback = null,
    onInputCapture: /* event */ Event_ => Callback = null,
    onInvalid: /* event */ Event_ => Callback = null,
    onInvalidCapture: /* event */ Event_ => Callback = null,
    onKeyDown: /* event */ KeyboardEvent => Callback = null,
    onKeyDownCapture: /* event */ KeyboardEvent => Callback = null,
    onKeyPress: /* event */ KeyboardEvent => Callback = null,
    onKeyPressCapture: /* event */ KeyboardEvent => Callback = null,
    onKeyUp: /* event */ KeyboardEvent => Callback = null,
    onKeyUpCapture: /* event */ KeyboardEvent => Callback = null,
    onLoad: /* event */ Event_ => Callback = null,
    onLoadCapture: /* event */ Event_ => Callback = null,
    onLostPointerCapture: /* event */ PointerEvent => Callback = null,
    onLostPointerCaptureCapture: /* event */ PointerEvent => Callback = null,
    onMouseDown: /* event */ MouseEvent => Callback = null,
    onMouseDownCapture: /* event */ MouseEvent => Callback = null,
    onMouseEnter: /* event */ MouseEvent => Callback = null,
    onMouseLeave: /* event */ MouseEvent => Callback = null,
    onMouseMove: /* event */ MouseEvent => Callback = null,
    onMouseMoveCapture: /* event */ MouseEvent => Callback = null,
    onMouseOut: /* event */ MouseEvent => Callback = null,
    onMouseOutCapture: /* event */ MouseEvent => Callback = null,
    onMouseOver: /* event */ MouseEvent => Callback = null,
    onMouseOverCapture: /* event */ MouseEvent => Callback = null,
    onMouseUp: /* event */ MouseEvent => Callback = null,
    onMouseUpCapture: /* event */ MouseEvent => Callback = null,
    onPaste: /* event */ ClipboardEvent => Callback = null,
    onPasteCapture: /* event */ ClipboardEvent => Callback = null,
    onPointerCancel: /* event */ PointerEvent => Callback = null,
    onPointerCancelCapture: /* event */ PointerEvent => Callback = null,
    onPointerDown: /* event */ PointerEvent => Callback = null,
    onPointerDownCapture: /* event */ PointerEvent => Callback = null,
    onPointerEnter: /* event */ PointerEvent => Callback = null,
    onPointerEnterCapture: /* event */ PointerEvent => Callback = null,
    onPointerLeave: /* event */ PointerEvent => Callback = null,
    onPointerLeaveCapture: /* event */ PointerEvent => Callback = null,
    onPointerMove: /* event */ PointerEvent => Callback = null,
    onPointerMoveCapture: /* event */ PointerEvent => Callback = null,
    onPointerOut: /* event */ PointerEvent => Callback = null,
    onPointerOutCapture: /* event */ PointerEvent => Callback = null,
    onPointerOver: /* event */ PointerEvent => Callback = null,
    onPointerOverCapture: /* event */ PointerEvent => Callback = null,
    onPointerUp: /* event */ PointerEvent => Callback = null,
    onPointerUpCapture: /* event */ PointerEvent => Callback = null,
    onReset: /* event */ Event_ => Callback = null,
    onResetCapture: /* event */ Event_ => Callback = null,
    onScroll: /* event */ UIEvent => Callback = null,
    onScrollCapture: /* event */ UIEvent => Callback = null,
    onSubmit: /* event */ Event_ => Callback = null,
    onSubmitCapture: /* event */ Event_ => Callback = null,
    onTouchCancel: /* event */ TouchEvent => Callback = null,
    onTouchCancelCapture: /* event */ TouchEvent => Callback = null,
    onTouchEnd: /* event */ TouchEvent => Callback = null,
    onTouchEndCapture: /* event */ TouchEvent => Callback = null,
    onTouchMove: /* event */ TouchEvent => Callback = null,
    onTouchMoveCapture: /* event */ TouchEvent => Callback = null,
    onTouchStart: /* event */ TouchEvent => Callback = null,
    onTouchStartCapture: /* event */ TouchEvent => Callback = null,
    onTransitionEnd: /* event */ TransitionEvent => Callback = null,
    onTransitionEndCapture: /* event */ TransitionEvent => Callback = null,
    onWheel: /* event */ WheelEvent => Callback = null,
    onWheelCapture: /* event */ WheelEvent => Callback = null,
    ref: /* elm */ js.UndefOr[T] => Callback = null,
    slot: String = null
  ): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationEnd(t0).runNow()))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationEndCapture(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationIteration(t0).runNow()))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationIterationCapture(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationStart(t0).runNow()))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationStartCapture(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onAuxClick(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent) => onBlur(t0).runNow()))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent) => onBlurCapture(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onChange(t0).runNow()))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onChangeCapture(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onClick(t0).runNow()))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onClickCapture(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionEnd(t0).runNow()))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionEndCapture(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionStart(t0).runNow()))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionStartCapture(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionUpdate(t0).runNow()))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionUpdateCapture(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onContextMenu(t0).runNow()))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onContextMenuCapture(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onCopy(t0).runNow()))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onCopyCapture(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onCut(t0).runNow()))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onCutCapture(t0).runNow()))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onDblClick(t0).runNow()))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onDblClickCapture(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDrag(t0).runNow()))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragCapture(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragEnd(t0).runNow()))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragEndCapture(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragEnter(t0).runNow()))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragEnterCapture(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragExit(t0).runNow()))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragExitCapture(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragLeave(t0).runNow()))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragLeaveCapture(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragOver(t0).runNow()))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragOverCapture(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragStart(t0).runNow()))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragStartCapture(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDrop(t0).runNow()))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDropCapture(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onError(t0).runNow()))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onErrorCapture(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent) => onFocus(t0).runNow()))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent) => onFocusCapture(t0).runNow()))
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onGotPointerCapture(t0).runNow()))
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onGotPointerCaptureCapture(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInput(t0).runNow()))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInputCapture(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInvalid(t0).runNow()))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInvalidCapture(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDownCapture(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyPress(t0).runNow()))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyPressCapture(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyUp(t0).runNow()))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyUpCapture(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onLoad(t0).runNow()))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onLoadCapture(t0).runNow()))
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onLostPointerCapture(t0).runNow()))
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onLostPointerCaptureCapture(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseDown(t0).runNow()))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseDownCapture(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseMove(t0).runNow()))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseMoveCapture(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseOut(t0).runNow()))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseOutCapture(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseOver(t0).runNow()))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseOverCapture(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseUp(t0).runNow()))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseUpCapture(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onPaste(t0).runNow()))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onPasteCapture(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerCancel(t0).runNow()))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerCancelCapture(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerDown(t0).runNow()))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerDownCapture(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerEnter(t0).runNow()))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerEnterCapture(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerLeave(t0).runNow()))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerLeaveCapture(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerMove(t0).runNow()))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerMoveCapture(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerOut(t0).runNow()))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerOutCapture(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerOver(t0).runNow()))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerOverCapture(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerUp(t0).runNow()))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerUpCapture(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onReset(t0).runNow()))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onResetCapture(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.UIEvent) => onScroll(t0).runNow()))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.UIEvent) => onScrollCapture(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onSubmit(t0).runNow()))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onSubmitCapture(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchCancel(t0).runNow()))
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchCancelCapture(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchMove(t0).runNow()))
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchMoveCapture(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchStart(t0).runNow()))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchStartCapture(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TransitionEvent) => onTransitionEnd(t0).runNow()))
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TransitionEvent) => onTransitionEndCapture(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.WheelEvent) => onWheel(t0).runNow()))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.WheelEvent) => onWheelCapture(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1((t0: /* elm */ js.UndefOr[T]) => ref(t0).runNow()))
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMAttributes[T]]
  }
}

