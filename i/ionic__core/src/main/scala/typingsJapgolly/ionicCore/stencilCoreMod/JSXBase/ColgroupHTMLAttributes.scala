package typingsJapgolly.ionicCore.stencilCoreMod.JSXBase

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
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

trait ColgroupHTMLAttributes[T] extends HTMLAttributes[T] {
  var span: js.UndefOr[Double] = js.undefined
}

object ColgroupHTMLAttributes {
  @scala.inline
  def apply[T](
    about: String = null,
    accessKey: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    autocapitalize: String = null,
    autocorrect: String = null,
    autosave: String = null,
    `class`: String | StringDictionary[Boolean] = null,
    color: String = null,
    contentEditable: Boolean | String = null,
    contenteditable: Boolean | String = null,
    contextMenu: String = null,
    contextmenu: String = null,
    datatype: String = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    innerHTML: String = null,
    inputMode: String = null,
    inputmode: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    itemid: String = null,
    itemprop: String = null,
    itemref: String = null,
    itemscope: js.UndefOr[Boolean] = js.undefined,
    itemtype: String = null,
    key: String | Double = null,
    lang: String = null,
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
    part: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    radiogroup: String = null,
    ref: /* elm */ js.UndefOr[T] => Callback = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    slot: String = null,
    span: Int | Double = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    spellcheck: Boolean | String = null,
    style: StringDictionary[js.UndefOr[String]] = null,
    tabIndex: Int | Double = null,
    tabindex: Double | String = null,
    title: String = null,
    typeof: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null
  ): ColgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (autocorrect != null) __obj.updateDynamic("autocorrect")(autocorrect.asInstanceOf[js.Any])
    if (autosave != null) __obj.updateDynamic("autosave")(autosave.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contenteditable != null) __obj.updateDynamic("contenteditable")(contenteditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (itemid != null) __obj.updateDynamic("itemid")(itemid.asInstanceOf[js.Any])
    if (itemprop != null) __obj.updateDynamic("itemprop")(itemprop.asInstanceOf[js.Any])
    if (itemref != null) __obj.updateDynamic("itemref")(itemref.asInstanceOf[js.Any])
    if (!js.isUndefined(itemscope)) __obj.updateDynamic("itemscope")(itemscope.asInstanceOf[js.Any])
    if (itemtype != null) __obj.updateDynamic("itemtype")(itemtype.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
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
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (radiogroup != null) __obj.updateDynamic("radiogroup")(radiogroup.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1((t0: /* elm */ js.UndefOr[T]) => ref(t0).runNow()))
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (spellcheck != null) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColgroupHTMLAttributes[T]]
  }
}

