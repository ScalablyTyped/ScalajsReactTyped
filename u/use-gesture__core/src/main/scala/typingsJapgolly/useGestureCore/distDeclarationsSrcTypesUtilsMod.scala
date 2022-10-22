package typingsJapgolly.useGestureCore

import japgolly.scalajs.react.Callback
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.useGestureCore.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesUtilsMod {
  
  trait DOMHandlers extends StObject {
    
    var onAbort: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onAbortCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[EventHandler[AnimationEvent]] = js.undefined
    
    var onAnimationEndCapture: js.UndefOr[EventHandler[AnimationEvent]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[EventHandler[AnimationEvent]] = js.undefined
    
    var onAnimationIterationCapture: js.UndefOr[EventHandler[AnimationEvent]] = js.undefined
    
    var onAnimationStart: js.UndefOr[EventHandler[AnimationEvent]] = js.undefined
    
    var onAnimationStartCapture: js.UndefOr[EventHandler[AnimationEvent]] = js.undefined
    
    var onAuxClick: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onAuxClickCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onBeforeInput: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onBeforeInputCapture: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onBlur: js.UndefOr[EventHandler[FocusEvent]] = js.undefined
    
    var onBlurCapture: js.UndefOr[EventHandler[FocusEvent]] = js.undefined
    
    var onCanPlay: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onCanPlayCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onCanPlayThroughCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onChange: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onChangeCapture: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onClickCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[EventHandler[CompositionEvent]] = js.undefined
    
    var onCompositionEndCapture: js.UndefOr[EventHandler[CompositionEvent]] = js.undefined
    
    var onCompositionStart: js.UndefOr[EventHandler[CompositionEvent]] = js.undefined
    
    var onCompositionStartCapture: js.UndefOr[EventHandler[CompositionEvent]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[EventHandler[CompositionEvent]] = js.undefined
    
    var onCompositionUpdateCapture: js.UndefOr[EventHandler[CompositionEvent]] = js.undefined
    
    var onContextMenu: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onContextMenuCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onCopy: js.UndefOr[EventHandler[ClipboardEvent]] = js.undefined
    
    var onCopyCapture: js.UndefOr[EventHandler[ClipboardEvent]] = js.undefined
    
    var onCut: js.UndefOr[EventHandler[ClipboardEvent]] = js.undefined
    
    var onCutCapture: js.UndefOr[EventHandler[ClipboardEvent]] = js.undefined
    
    var onDoubleClick: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onDoubleClickCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onDrag: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragCapture: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragEnd: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragEndCapture: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragEnter: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragEnterCapture: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragExit: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragExitCapture: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragLeave: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragLeaveCapture: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragOver: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragOverCapture: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragStart: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDragStartCapture: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDrop: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDropCapture: js.UndefOr[EventHandler[DragEvent]] = js.undefined
    
    var onDurationChange: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onDurationChangeCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onEmptied: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onEmptiedCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onEncrypted: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onEncryptedCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onEnded: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onEndedCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onError: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onErrorCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onFocus: js.UndefOr[EventHandler[FocusEvent]] = js.undefined
    
    var onFocusCapture: js.UndefOr[EventHandler[FocusEvent]] = js.undefined
    
    var onGotPointerCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onGotPointerCaptureCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onInput: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onInputCapture: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onInvalid: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onInvalidCapture: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onKeyDown: js.UndefOr[EventHandler[KeyboardEvent]] = js.undefined
    
    var onKeyDownCapture: js.UndefOr[EventHandler[KeyboardEvent]] = js.undefined
    
    var onKeyUp: js.UndefOr[EventHandler[KeyboardEvent]] = js.undefined
    
    var onKeyUpCapture: js.UndefOr[EventHandler[KeyboardEvent]] = js.undefined
    
    var onLoad: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onLoadCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onLoadStart: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onLoadStartCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onLoadedData: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onLoadedDataCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onLoadedMetadataCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onLostPointerCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onLostPointerCaptureCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onMouseDown: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseDownCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseEnter: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseLeave: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseMove: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseMoveCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseOut: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseOutCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseOver: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseOverCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseUp: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onMouseUpCapture: js.UndefOr[EventHandler[MouseEvent]] = js.undefined
    
    var onPaste: js.UndefOr[EventHandler[ClipboardEvent]] = js.undefined
    
    var onPasteCapture: js.UndefOr[EventHandler[ClipboardEvent]] = js.undefined
    
    var onPause: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onPauseCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onPlay: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onPlayCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onPlaying: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onPlayingCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onPointerCancel: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerDown: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerEnter: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerLeave: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerMove: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerOut: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerOutCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerOver: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerOverCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerUp: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[EventHandler[PointerEvent]] = js.undefined
    
    var onProgress: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onProgressCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onRateChange: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onRateChangeCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onReset: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onResetCapture: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onScroll: js.UndefOr[EventHandler[UIEvent]] = js.undefined
    
    var onScrollCapture: js.UndefOr[EventHandler[UIEvent]] = js.undefined
    
    var onSeeked: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onSeekedCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onSeeking: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onSeekingCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onSelect: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onSelectCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onStalled: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onStalledCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onSubmit: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onSubmitCapture: js.UndefOr[EventHandler[FormDataEvent]] = js.undefined
    
    var onSuspend: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onSuspendCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onTimeUpdateCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onTouchCancel: js.UndefOr[EventHandler[TouchEvent]] = js.undefined
    
    var onTouchCancelCapture: js.UndefOr[EventHandler[TouchEvent]] = js.undefined
    
    var onTouchEnd: js.UndefOr[EventHandler[TouchEvent]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[EventHandler[TouchEvent]] = js.undefined
    
    var onTouchMove: js.UndefOr[EventHandler[TouchEvent]] = js.undefined
    
    var onTouchMoveCapture: js.UndefOr[EventHandler[TouchEvent]] = js.undefined
    
    var onTouchStart: js.UndefOr[EventHandler[TouchEvent]] = js.undefined
    
    var onTouchStartCapture: js.UndefOr[EventHandler[TouchEvent]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[EventHandler[TransitionEvent]] = js.undefined
    
    var onTransitionEndCapture: js.UndefOr[EventHandler[TransitionEvent]] = js.undefined
    
    var onVolumeChange: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onVolumeChangeCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onWaiting: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onWaitingCapture: js.UndefOr[EventHandler[Event]] = js.undefined
    
    var onWheel: js.UndefOr[EventHandler[WheelEvent]] = js.undefined
    
    var onWheelCapture: js.UndefOr[EventHandler[WheelEvent]] = js.undefined
  }
  object DOMHandlers {
    
    inline def apply(): DOMHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMHandlers]
    }
    
    extension [Self <: DOMHandlers](x: Self) {
      
      inline def setOnAbort(value: Event => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnAbortCapture(value: Event => Callback): Self = StObject.set(x, "onAbortCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: AnimationEvent) => value(t0).runNow()))
      
      inline def setOnAnimationEndCapture(value: AnimationEvent => Callback): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1((t0: AnimationEvent) => value(t0).runNow()))
      
      inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: AnimationEvent) => value(t0).runNow()))
      
      inline def setOnAnimationIterationCapture(value: AnimationEvent => Callback): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1((t0: AnimationEvent) => value(t0).runNow()))
      
      inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: AnimationEvent) => value(t0).runNow()))
      
      inline def setOnAnimationStartCapture(value: AnimationEvent => Callback): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1((t0: AnimationEvent) => value(t0).runNow()))
      
      inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnAuxClickCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onAuxClickCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormDataEvent => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnBeforeInputCapture(value: FormDataEvent => Callback): Self = StObject.set(x, "onBeforeInputCapture", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: FocusEvent) => value(t0).runNow()))
      
      inline def setOnBlurCapture(value: FocusEvent => Callback): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1((t0: FocusEvent) => value(t0).runNow()))
      
      inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: Event => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnCanPlayCapture(value: Event => Callback): Self = StObject.set(x, "onCanPlayCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
      
      inline def setOnCanPlayThrough(value: Event => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughCapture(value: Event => Callback): Self = StObject.set(x, "onCanPlayThroughCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormDataEvent => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnChangeCapture(value: FormDataEvent => Callback): Self = StObject.set(x, "onChangeCapture", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnClickCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: CompositionEvent) => value(t0).runNow()))
      
      inline def setOnCompositionEndCapture(value: CompositionEvent => Callback): Self = StObject.set(x, "onCompositionEndCapture", js.Any.fromFunction1((t0: CompositionEvent) => value(t0).runNow()))
      
      inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: CompositionEvent) => value(t0).runNow()))
      
      inline def setOnCompositionStartCapture(value: CompositionEvent => Callback): Self = StObject.set(x, "onCompositionStartCapture", js.Any.fromFunction1((t0: CompositionEvent) => value(t0).runNow()))
      
      inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: CompositionEvent) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateCapture(value: CompositionEvent => Callback): Self = StObject.set(x, "onCompositionUpdateCapture", js.Any.fromFunction1((t0: CompositionEvent) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnContextMenuCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ClipboardEvent) => value(t0).runNow()))
      
      inline def setOnCopyCapture(value: ClipboardEvent => Callback): Self = StObject.set(x, "onCopyCapture", js.Any.fromFunction1((t0: ClipboardEvent) => value(t0).runNow()))
      
      inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ClipboardEvent) => value(t0).runNow()))
      
      inline def setOnCutCapture(value: ClipboardEvent => Callback): Self = StObject.set(x, "onCutCapture", js.Any.fromFunction1((t0: ClipboardEvent) => value(t0).runNow()))
      
      inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnDoubleClickCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onDoubleClickCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragCapture(value: DragEvent => Callback): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
      
      inline def setOnDragEnd(value: DragEvent => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragEndCapture(value: DragEvent => Callback): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragEnterCapture(value: DragEvent => Callback): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragExitCapture(value: DragEvent => Callback): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragLeaveCapture(value: DragEvent => Callback): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragOverCapture(value: DragEvent => Callback): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragStartCapture(value: DragEvent => Callback): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDropCapture(value: DragEvent => Callback): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1((t0: DragEvent) => value(t0).runNow()))
      
      inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: Event => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnDurationChangeCapture(value: Event => Callback): Self = StObject.set(x, "onDurationChangeCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: Event => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnEmptiedCapture(value: Event => Callback): Self = StObject.set(x, "onEmptiedCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: Event => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnEncryptedCapture(value: Event => Callback): Self = StObject.set(x, "onEncryptedCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: Event => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnEndedCapture(value: Event => Callback): Self = StObject.set(x, "onEndedCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: Event => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnErrorCapture(value: Event => Callback): Self = StObject.set(x, "onErrorCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: FocusEvent) => value(t0).runNow()))
      
      inline def setOnFocusCapture(value: FocusEvent => Callback): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1((t0: FocusEvent) => value(t0).runNow()))
      
      inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnGotPointerCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnGotPointerCaptureCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
      
      inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
      
      inline def setOnInput(value: FormDataEvent => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnInputCapture(value: FormDataEvent => Callback): Self = StObject.set(x, "onInputCapture", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormDataEvent => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnInvalidCapture(value: FormDataEvent => Callback): Self = StObject.set(x, "onInvalidCapture", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnKeyDownCapture(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnKeyUpCapture(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: Event => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnLoadCapture(value: Event => Callback): Self = StObject.set(x, "onLoadCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
      
      inline def setOnLoadStart(value: Event => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnLoadStartCapture(value: Event => Callback): Self = StObject.set(x, "onLoadStartCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: Event => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnLoadedDataCapture(value: Event => Callback): Self = StObject.set(x, "onLoadedDataCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: Event => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataCapture(value: Event => Callback): Self = StObject.set(x, "onLoadedMetadataCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnLostPointerCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnLostPointerCaptureCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
      
      inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseDownCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseMoveCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseOutCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseOverCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseUpCapture(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ClipboardEvent) => value(t0).runNow()))
      
      inline def setOnPasteCapture(value: ClipboardEvent => Callback): Self = StObject.set(x, "onPasteCapture", js.Any.fromFunction1((t0: ClipboardEvent) => value(t0).runNow()))
      
      inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: Event => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnPauseCapture(value: Event => Callback): Self = StObject.set(x, "onPauseCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: Event => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnPlayCapture(value: Event => Callback): Self = StObject.set(x, "onPlayCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: Event => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnPlayingCapture(value: Event => Callback): Self = StObject.set(x, "onPlayingCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerCancelCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerDownCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerEnterCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerLeaveCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerMoveCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerOutCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerOverCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerUpCapture(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: Event => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnProgressCapture(value: Event => Callback): Self = StObject.set(x, "onProgressCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: Event => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnRateChangeCapture(value: Event => Callback): Self = StObject.set(x, "onRateChangeCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormDataEvent => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnResetCapture(value: FormDataEvent => Callback): Self = StObject.set(x, "onResetCapture", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: UIEvent) => value(t0).runNow()))
      
      inline def setOnScrollCapture(value: UIEvent => Callback): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1((t0: UIEvent) => value(t0).runNow()))
      
      inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: Event => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnSeekedCapture(value: Event => Callback): Self = StObject.set(x, "onSeekedCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: Event => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnSeekingCapture(value: Event => Callback): Self = StObject.set(x, "onSeekingCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: Event => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnSelectCapture(value: Event => Callback): Self = StObject.set(x, "onSelectCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: Event => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnStalledCapture(value: Event => Callback): Self = StObject.set(x, "onStalledCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormDataEvent => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnSubmitCapture(value: FormDataEvent => Callback): Self = StObject.set(x, "onSubmitCapture", js.Any.fromFunction1((t0: FormDataEvent) => value(t0).runNow()))
      
      inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: Event => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnSuspendCapture(value: Event => Callback): Self = StObject.set(x, "onSuspendCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: Event => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnTimeUpdateCapture(value: Event => Callback): Self = StObject.set(x, "onTimeUpdateCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: TouchEvent) => value(t0).runNow()))
      
      inline def setOnTouchCancelCapture(value: TouchEvent => Callback): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1((t0: TouchEvent) => value(t0).runNow()))
      
      inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: TouchEvent) => value(t0).runNow()))
      
      inline def setOnTouchEndCapture(value: TouchEvent => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: TouchEvent) => value(t0).runNow()))
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: TouchEvent) => value(t0).runNow()))
      
      inline def setOnTouchMoveCapture(value: TouchEvent => Callback): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1((t0: TouchEvent) => value(t0).runNow()))
      
      inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: TouchEvent) => value(t0).runNow()))
      
      inline def setOnTouchStartCapture(value: TouchEvent => Callback): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1((t0: TouchEvent) => value(t0).runNow()))
      
      inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: TransitionEvent) => value(t0).runNow()))
      
      inline def setOnTransitionEndCapture(value: TransitionEvent => Callback): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1((t0: TransitionEvent) => value(t0).runNow()))
      
      inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: Event => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnVolumeChangeCapture(value: Event => Callback): Self = StObject.set(x, "onVolumeChangeCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: Event => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnWaitingCapture(value: Event => Callback): Self = StObject.set(x, "onWaitingCapture", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: WheelEvent) => value(t0).runNow()))
      
      inline def setOnWheelCapture(value: WheelEvent => Callback): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1((t0: WheelEvent) => value(t0).runNow()))
      
      inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    }
  }
  
  type EventHandler[E /* <: Event */] = js.Function1[/* event */ E, Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends undefined ? never : T
    }}}
    */
  @js.native
  trait NonUndefined[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.useGestureCore.useGestureCoreStrings.mouse
    - typingsJapgolly.useGestureCore.useGestureCoreStrings.touch
    - typingsJapgolly.useGestureCore.useGestureCoreStrings.pen
  */
  trait PointerType extends StObject
  object PointerType {
    
    inline def mouse: typingsJapgolly.useGestureCore.useGestureCoreStrings.mouse = "mouse".asInstanceOf[typingsJapgolly.useGestureCore.useGestureCoreStrings.mouse]
    
    inline def pen: typingsJapgolly.useGestureCore.useGestureCoreStrings.pen = "pen".asInstanceOf[typingsJapgolly.useGestureCore.useGestureCoreStrings.pen]
    
    inline def touch: typingsJapgolly.useGestureCore.useGestureCoreStrings.touch = "touch".asInstanceOf[typingsJapgolly.useGestureCore.useGestureCoreStrings.touch]
  }
  
  type Target = EventTarget | `0`
  
  type Vector2 = js.Tuple2[Double, Double]
  
  @js.native
  trait WebKitGestureEvent
    extends StObject
       with typingsJapgolly.std.PointerEvent {
    
    var rotation: Double = js.native
    
    var scale: Double = js.native
  }
}
