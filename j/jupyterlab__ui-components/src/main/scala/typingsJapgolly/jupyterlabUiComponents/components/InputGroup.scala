package typingsJapgolly.jupyterlabUiComponents.components

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
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.jupyterlabUiComponents.libBlueprintMod.CommonProps
import typingsJapgolly.jupyterlabUiComponents.libBlueprintMod.IInputGroupProps
import typingsJapgolly.react.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputGroup {
  
  @JSImport("@jupyterlab/ui-components", "InputGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[Any & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[Any & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[Any & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[Any & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[Any & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[Any & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[Any & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[Any & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[Any & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[Any & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[Any & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[Any & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[Any & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[Any & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[Any & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[Any & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[Any & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[Any & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onInput(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onInvalid(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[Any & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[Any & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[Any & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[Any & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[Any & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[Any & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[Any & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[Any & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[Any & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[Any & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[Any & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[Any & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onReset(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[Any & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[Any & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[Any & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[Any & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[Any & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[Any & Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[Any & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[Any & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def rightIcon(value: String): this.type = set("rightIcon", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InputGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IInputGroupProps & CommonProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
