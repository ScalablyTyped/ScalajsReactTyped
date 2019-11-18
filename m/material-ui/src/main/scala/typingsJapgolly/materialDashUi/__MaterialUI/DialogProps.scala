package typingsJapgolly.materialDashUi.__MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.Anon_Html
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.DOMAttributes
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait DialogProps
  extends DOMAttributes[js.Object] {
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[String] = js.undefined
  var actions: js.UndefOr[js.Array[DialogAction | Element]] = js.undefined
  var actionsContainerClassName: js.UndefOr[String] = js.undefined
  var actionsContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined
  var autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined
  var bodyClassName: js.UndefOr[String] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ Boolean, Unit]] = js.undefined
  var open: Boolean
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var paperClassName: js.UndefOr[String] = js.undefined
  var paperProps: js.UndefOr[js.Any] = js.undefined
  var ref: js.UndefOr[LegacyRef[Dialog]] = js.undefined
  var repositionOnUpdate: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var titleClassName: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    open: Boolean,
    actionFocus: String = null,
    actions: js.Array[DialogAction | Element] = null,
    actionsContainerClassName: String = null,
    actionsContainerStyle: CSSProperties = null,
    autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined,
    autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined,
    bodyClassName: String = null,
    bodyStyle: CSSProperties = null,
    children: VdomNode = null,
    className: String = null,
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    key: Key = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onAbort: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onBeforeInput: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onBlur: ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onCanPlay: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onChange: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onClick: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onCut: ReactClipboardEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDrag: ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDragExit: ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDragOver: ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDragStart: ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDrop: ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onDurationChange: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onEmptied: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onEncrypted: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onEnded: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onError: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onFocus: ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onInput: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onInvalid: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onLoad: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onLoadStart: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onLoadedData: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPause: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPlay: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPlaying: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onProgress: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onRateChange: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onRequestClose: /* buttonClicked */ Boolean => Callback = null,
    onReset: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onScroll: ReactUIEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onSeeked: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onSeeking: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onSelect: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onStalled: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onSubmit: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onSuspend: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onVolumeChange: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onWaiting: ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onWheel: ReactWheelEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    paperClassName: String = null,
    paperProps: js.Any = null,
    ref: LegacyRef[Dialog] = null,
    repositionOnUpdate: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: VdomNode = null,
    titleClassName: String = null,
    titleStyle: CSSProperties = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (actionFocus != null) __obj.updateDynamic("actionFocus")(actionFocus.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (actionsContainerClassName != null) __obj.updateDynamic("actionsContainerClassName")(actionsContainerClassName.asInstanceOf[js.Any])
    if (actionsContainerStyle != null) __obj.updateDynamic("actionsContainerStyle")(actionsContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDetectWindowHeight)) __obj.updateDynamic("autoDetectWindowHeight")(autoDetectWindowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScrollBodyContent)) __obj.updateDynamic("autoScrollBodyContent")(autoScrollBodyContent.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1((t0: /* buttonClicked */ scala.Boolean) => onRequestClose(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (paperClassName != null) __obj.updateDynamic("paperClassName")(paperClassName.asInstanceOf[js.Any])
    if (paperProps != null) __obj.updateDynamic("paperProps")(paperProps.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(repositionOnUpdate)) __obj.updateDynamic("repositionOnUpdate")(repositionOnUpdate.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

