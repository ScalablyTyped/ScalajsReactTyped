package typingsJapgolly.fortawesomeReactFontawesome.mod

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
import org.scalajs.dom.raw.SVGSVGElement
import typingsJapgolly.fortawesomeFontawesomeSvgCore.mod.FaSymbol
import typingsJapgolly.fortawesomeFontawesomeSvgCore.mod.FlipProp
import typingsJapgolly.fortawesomeFontawesomeSvgCore.mod.IconProp
import typingsJapgolly.fortawesomeFontawesomeSvgCore.mod.PullProp
import typingsJapgolly.fortawesomeFontawesomeSvgCore.mod.RotateProp
import typingsJapgolly.fortawesomeFontawesomeSvgCore.mod.SizeProp
import typingsJapgolly.fortawesomeFontawesomeSvgCore.mod.Transform
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @fortawesome/react-fontawesome.@fortawesome/react-fontawesome.BackwardCompatibleOmit<react.react.DOMAttributes<std.SVGSVGElement>, 'children' | 'mask'> */
trait FontAwesomeIconProps extends js.Object {
  var border: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  var flip: js.UndefOr[FlipProp] = js.undefined
  var icon: IconProp
  var inverse: js.UndefOr[Boolean] = js.undefined
  var listItem: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[IconProp] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.undefined
  var pull: js.UndefOr[PullProp] = js.undefined
  var pulse: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[RotateProp] = js.undefined
  var size: js.UndefOr[SizeProp] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swapOpacity: js.UndefOr[Boolean] = js.undefined
  var symbol: js.UndefOr[FaSymbol] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[String | Transform] = js.undefined
}

object FontAwesomeIconProps {
  @scala.inline
  def apply(
    icon: IconProp,
    border: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: FlipProp = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    listItem: js.UndefOr[Boolean] = js.undefined,
    mask: IconProp = null,
    onAbort: ReactEventFrom[SVGSVGElement] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[SVGSVGElement] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[SVGSVGElement] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[SVGSVGElement] => Callback = null,
    onAuxClick: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onBeforeInput: ReactEventFrom[SVGSVGElement] => Callback = null,
    onBlur: ReactFocusEventFrom[SVGSVGElement] => Callback = null,
    onCanPlay: ReactEventFrom[SVGSVGElement] => Callback = null,
    onCanPlayThrough: ReactEventFrom[SVGSVGElement] => Callback = null,
    onChange: ReactEventFrom[SVGSVGElement] => Callback = null,
    onClick: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[SVGSVGElement] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[SVGSVGElement] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[SVGSVGElement] => Callback = null,
    onContextMenu: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onCopy: ReactClipboardEventFrom[SVGSVGElement] => Callback = null,
    onCut: ReactClipboardEventFrom[SVGSVGElement] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onDrag: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragEnd: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragEnter: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragExit: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragLeave: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragOver: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragStart: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDrop: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDurationChange: ReactEventFrom[SVGSVGElement] => Callback = null,
    onEmptied: ReactEventFrom[SVGSVGElement] => Callback = null,
    onEncrypted: ReactEventFrom[SVGSVGElement] => Callback = null,
    onEnded: ReactEventFrom[SVGSVGElement] => Callback = null,
    onError: ReactEventFrom[SVGSVGElement] => Callback = null,
    onFocus: ReactFocusEventFrom[SVGSVGElement] => Callback = null,
    onInput: ReactEventFrom[SVGSVGElement] => Callback = null,
    onInvalid: ReactEventFrom[SVGSVGElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[SVGSVGElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[SVGSVGElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[SVGSVGElement] => Callback = null,
    onLoad: ReactEventFrom[SVGSVGElement] => Callback = null,
    onLoadStart: ReactEventFrom[SVGSVGElement] => Callback = null,
    onLoadedData: ReactEventFrom[SVGSVGElement] => Callback = null,
    onLoadedMetadata: ReactEventFrom[SVGSVGElement] => Callback = null,
    onMouseDown: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseMove: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseOut: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseOver: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseUp: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onPaste: ReactClipboardEventFrom[SVGSVGElement] => Callback = null,
    onPause: ReactEventFrom[SVGSVGElement] => Callback = null,
    onPlay: ReactEventFrom[SVGSVGElement] => Callback = null,
    onPlaying: ReactEventFrom[SVGSVGElement] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerDown: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerMove: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerOut: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerOver: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerUp: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onProgress: ReactEventFrom[SVGSVGElement] => Callback = null,
    onRateChange: ReactEventFrom[SVGSVGElement] => Callback = null,
    onReset: ReactEventFrom[SVGSVGElement] => Callback = null,
    onScroll: ReactUIEventFrom[SVGSVGElement] => Callback = null,
    onSeeked: ReactEventFrom[SVGSVGElement] => Callback = null,
    onSeeking: ReactEventFrom[SVGSVGElement] => Callback = null,
    onSelect: ReactEventFrom[SVGSVGElement] => Callback = null,
    onStalled: ReactEventFrom[SVGSVGElement] => Callback = null,
    onSubmit: ReactEventFrom[SVGSVGElement] => Callback = null,
    onSuspend: ReactEventFrom[SVGSVGElement] => Callback = null,
    onTimeUpdate: ReactEventFrom[SVGSVGElement] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[SVGSVGElement] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[SVGSVGElement] => Callback = null,
    onTouchMove: ReactTouchEventFrom[SVGSVGElement] => Callback = null,
    onTouchStart: ReactTouchEventFrom[SVGSVGElement] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[SVGSVGElement] => Callback = null,
    onVolumeChange: ReactEventFrom[SVGSVGElement] => Callback = null,
    onWaiting: ReactEventFrom[SVGSVGElement] => Callback = null,
    onWheel: ReactWheelEventFrom[SVGSVGElement] => Callback = null,
    pull: PullProp = null,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotation: RotateProp = null,
    size: SizeProp = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    swapOpacity: js.UndefOr[Boolean] = js.undefined,
    symbol: FaSymbol = null,
    tabIndex: Int | Double = null,
    title: String = null,
    transform: String | Transform = null
  ): FontAwesomeIconProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onWheel(t0).runNow()))
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swapOpacity)) __obj.updateDynamic("swapOpacity")(swapOpacity.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontAwesomeIconProps]
  }
}

