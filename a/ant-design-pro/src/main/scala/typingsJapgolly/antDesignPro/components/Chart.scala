package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
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
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsJapgolly.antvG2.mod.EventParams
import typingsJapgolly.antvG2.mod.Styles.background
import typingsJapgolly.bizcharts.AnonBottom
import typingsJapgolly.bizcharts.AnonData
import typingsJapgolly.bizcharts.AnonItems
import typingsJapgolly.bizcharts.AnonTooltip
import typingsJapgolly.bizcharts.AnonTooltipAny
import typingsJapgolly.bizcharts.mod.ChartProps
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chart {
  def apply(
    height: Double,
    StringDictionary: /* event */ StringDictionary[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    background: background = null,
    className: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    data: js.Any = null,
    filter: js.Array[_] = null,
    forceFit: js.UndefOr[Boolean] = js.undefined,
    onAbort: ReactEventFrom[js.Object with Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[js.Object with Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[js.Object with Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[js.Object with Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onBeforeInput: ReactEventFrom[js.Object with Element] => Callback = null,
    onBlur: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onCanPlay: ReactEventFrom[js.Object with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[js.Object with Element] => Callback = null,
    onChange: ReactEventFrom[js.Object with Element] => Callback = null,
    onClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[js.Object with Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[js.Object with Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[js.Object with Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[js.Object with Element] => Callback = null,
    onCut: ReactClipboardEventFrom[js.Object with Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onDrag: ReactDragEventFrom[js.Object with Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[js.Object with Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[js.Object with Element] => Callback = null,
    onDragExit: ReactDragEventFrom[js.Object with Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[js.Object with Element] => Callback = null,
    onDragOver: ReactDragEventFrom[js.Object with Element] => Callback = null,
    onDragStart: ReactDragEventFrom[js.Object with Element] => Callback = null,
    onDrop: ReactDragEventFrom[js.Object with Element] => Callback = null,
    onDurationChange: ReactEventFrom[js.Object with Element] => Callback = null,
    onEmptied: ReactEventFrom[js.Object with Element] => Callback = null,
    onEncrypted: ReactEventFrom[js.Object with Element] => Callback = null,
    onEnded: ReactEventFrom[js.Object with Element] => Callback = null,
    onError: ReactEventFrom[js.Object with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onGetG2Instance: /* chart */ typingsJapgolly.antvG2.mod.Chart => Callback = null,
    onInput: ReactEventFrom[js.Object with Element] => Callback = null,
    onInvalid: ReactEventFrom[js.Object with Element] => Callback = null,
    onItemSelected: /* ev */ EventParams => Callback = null,
    onItemSelectedChange: /* ev */ AnonData => Callback = null,
    onItemUnselected: /* ev */ EventParams => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onLoad: ReactEventFrom[js.Object with Element] => Callback = null,
    onLoadStart: ReactEventFrom[js.Object with Element] => Callback = null,
    onLoadedData: ReactEventFrom[js.Object with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[js.Object with Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[js.Object with Element] => Callback = null,
    onPause: ReactEventFrom[js.Object with Element] => Callback = null,
    onPlay: ReactEventFrom[js.Object with Element] => Callback = null,
    onPlaying: ReactEventFrom[js.Object with Element] => Callback = null,
    onPlotClick: /* ev */ EventParams => Callback = null,
    onPlotDblClick: /* ev */ EventParams => Callback = null,
    onPlotEnter: /* ev */ EventParams => Callback = null,
    onPlotLeave: /* ev */ EventParams => Callback = null,
    onPlotMove: /* ev */ EventParams => Callback = null,
    onPointerCancel: ReactPointerEventFrom[js.Object with Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[js.Object with Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[js.Object with Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[js.Object with Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[js.Object with Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[js.Object with Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[js.Object with Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[js.Object with Element] => Callback = null,
    onProgress: ReactEventFrom[js.Object with Element] => Callback = null,
    onRateChange: ReactEventFrom[js.Object with Element] => Callback = null,
    onReset: ReactEventFrom[js.Object with Element] => Callback = null,
    onScroll: ReactUIEventFrom[js.Object with Element] => Callback = null,
    onSeeked: ReactEventFrom[js.Object with Element] => Callback = null,
    onSeeking: ReactEventFrom[js.Object with Element] => Callback = null,
    onSelect: ReactEventFrom[js.Object with Element] => Callback = null,
    onStalled: ReactEventFrom[js.Object with Element] => Callback = null,
    onSubmit: ReactEventFrom[js.Object with Element] => Callback = null,
    onSuspend: ReactEventFrom[js.Object with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[js.Object with Element] => Callback = null,
    onTooltipChange: /* ev */ AnonItems => Callback = null,
    onTooltipHide: /* ev */ AnonTooltipAny => Callback = null,
    onTooltipShow: /* ev */ AnonTooltip => Callback = null,
    onTouchCancel: ReactTouchEventFrom[js.Object with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[js.Object with Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[js.Object with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[js.Object with Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[js.Object with Element] => Callback = null,
    onVolumeChange: ReactEventFrom[js.Object with Element] => Callback = null,
    onWaiting: ReactEventFrom[js.Object with Element] => Callback = null,
    onWheel: ReactWheelEventFrom[js.Object with Element] => Callback = null,
    padding: String | AnonBottom | Double | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple2[String, String]) = null,
    pixelRatio: Int | Double = null,
    placeholder: Node | String | Boolean = null,
    plotBackground: background = null,
    scale: js.Any = null,
    style: CSSProperties = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ChartProps, typingsJapgolly.antDesignPro.bizchartsMod.Chart, Unit, ChartProps] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFit)) __obj.updateDynamic("forceFit")(forceFit.asInstanceOf[js.Any])
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
    if (onGetG2Instance != null) __obj.updateDynamic("onGetG2Instance")(js.Any.fromFunction1((t0: /* chart */ typingsJapgolly.antvG2.mod.Chart) => onGetG2Instance(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.antvG2.mod.EventParams) => onItemSelected(t0).runNow()))
    if (onItemSelectedChange != null) __obj.updateDynamic("onItemSelectedChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.bizcharts.AnonData) => onItemSelectedChange(t0).runNow()))
    if (onItemUnselected != null) __obj.updateDynamic("onItemUnselected")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.antvG2.mod.EventParams) => onItemUnselected(t0).runNow()))
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
    if (onPlotClick != null) __obj.updateDynamic("onPlotClick")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.antvG2.mod.EventParams) => onPlotClick(t0).runNow()))
    if (onPlotDblClick != null) __obj.updateDynamic("onPlotDblClick")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.antvG2.mod.EventParams) => onPlotDblClick(t0).runNow()))
    if (onPlotEnter != null) __obj.updateDynamic("onPlotEnter")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.antvG2.mod.EventParams) => onPlotEnter(t0).runNow()))
    if (onPlotLeave != null) __obj.updateDynamic("onPlotLeave")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.antvG2.mod.EventParams) => onPlotLeave(t0).runNow()))
    if (onPlotMove != null) __obj.updateDynamic("onPlotMove")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.antvG2.mod.EventParams) => onPlotMove(t0).runNow()))
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
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTooltipChange != null) __obj.updateDynamic("onTooltipChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.bizcharts.AnonItems) => onTooltipChange(t0).runNow()))
    if (onTooltipHide != null) __obj.updateDynamic("onTooltipHide")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.bizcharts.AnonTooltipAny) => onTooltipHide(t0).runNow()))
    if (onTooltipShow != null) __obj.updateDynamic("onTooltipShow")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.bizcharts.AnonTooltip) => onTooltipShow(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (plotBackground != null) __obj.updateDynamic("plotBackground")(plotBackground.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.ChartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.bizchartsMod.Chart](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.ChartProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Chart")
  @js.native
  object componentImport extends js.Object
  
}

