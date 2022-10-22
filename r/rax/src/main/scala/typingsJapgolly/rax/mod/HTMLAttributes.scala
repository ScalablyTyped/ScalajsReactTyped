package typingsJapgolly.rax.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.rax.anon.Html
import typingsJapgolly.rax.raxStrings.off
import typingsJapgolly.rax.raxStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined 
- typingsJapgolly.rax.mod.DOMAttributes because Inheritance from two classes. Inlined children, dangerouslySetInnerHTML, onCopy, onCopyCapture, onCut, onCutCapture, onPaste, onPasteCapture, onCompositionEnd, onCompositionEndCapture, onCompositionStart, onCompositionStartCapture, onCompositionUpdate, onCompositionUpdateCapture, onFocus, onFocusCapture, onBlur, onBlurCapture, onChange, onChangeCapture, onBeforeInput, onBeforeInputCapture, onInput, onInputCapture, onReset, onResetCapture, onSubmit, onSubmitCapture, onInvalid, onInvalidCapture, onLoad, onLoadCapture, onError, onErrorCapture, onKeyDown, onKeyDownCapture, onKeyPress, onKeyPressCapture, onKeyUp, onKeyUpCapture, onAbort, onAbortCapture, onCanPlay, onCanPlayCapture, onCanPlayThrough, onCanPlayThroughCapture, onDurationChange, onDurationChangeCapture, onEmptied, onEmptiedCapture, onEncrypted, onEncryptedCapture, onEnded, onEndedCapture, onLoadedData, onLoadedDataCapture, onLoadedMetadata, onLoadedMetadataCapture, onLoadStart, onLoadStartCapture, onPause, onPauseCapture, onPlay, onPlayCapture, onPlaying, onPlayingCapture, onProgress, onProgressCapture, onRateChange, onRateChangeCapture, onSeeked, onSeekedCapture, onSeeking, onSeekingCapture, onStalled, onStalledCapture, onSuspend, onSuspendCapture, onTimeUpdate, onTimeUpdateCapture, onVolumeChange, onVolumeChangeCapture, onWaiting, onWaitingCapture, onAuxClick, onAuxClickCapture, onClick, onClickCapture, onContextMenu, onContextMenuCapture, onDoubleClick, onDoubleClickCapture, onDrag, onDragCapture, onDragEnd, onDragEndCapture, onDragEnter, onDragEnterCapture, onDragExit, onDragExitCapture, onDragLeave, onDragLeaveCapture, onDragOver, onDragOverCapture, onDragStart, onDragStartCapture, onDrop, onDropCapture, onMouseDown, onMouseDownCapture, onMouseEnter, onMouseLeave, onMouseMove, onMouseMoveCapture, onMouseOut, onMouseOutCapture, onMouseOver, onMouseOverCapture, onMouseUp, onMouseUpCapture, onSelect, onSelectCapture, onTouchCancel, onTouchCancelCapture, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchMoveCapture, onTouchStart, onTouchStartCapture, onPointerDown, onPointerDownCapture, onPointerMove, onPointerMoveCapture, onPointerUp, onPointerUpCapture, onPointerCancel, onPointerCancelCapture, onPointerEnter, onPointerEnterCapture, onPointerLeave, onPointerLeaveCapture, onPointerOver, onPointerOverCapture, onPointerOut, onPointerOutCapture, onGotPointerCapture, onGotPointerCaptureCapture, onLostPointerCapture, onLostPointerCaptureCapture, onScroll, onScrollCapture, onWheel, onWheelCapture, onAnimationStart, onAnimationStartCapture, onAnimationEnd, onAnimationEndCapture, onAnimationIteration, onAnimationIterationCapture, onTransitionEnd, onTransitionEndCapture, onLongpress, onAppear, onDisappear */ trait HTMLAttributes[T]
  extends StObject
     with AriaAttributes {
  
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  
  var autoCorrect: js.UndefOr[String] = js.undefined
  
  var autoSave: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[RaxNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var contentEditable: js.UndefOr[Boolean] = js.undefined
  
  var contextMenu: js.UndefOr[String] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  // Rax-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inlist: js.UndefOr[Any] = js.undefined
  
  // Unknown
  var inputMode: js.UndefOr[String] = js.undefined
  
  var is: js.UndefOr[String] = js.undefined
  
  var itemID: js.UndefOr[String] = js.undefined
  
  var itemProp: js.UndefOr[String] = js.undefined
  
  var itemRef: js.UndefOr[String] = js.undefined
  
  var itemScope: js.UndefOr[Boolean] = js.undefined
  
  var itemType: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  // Media Events
  var onAbort: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onAbortCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAppear: js.UndefOr[AppearEventHandler[T]] = js.undefined
  
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onAuxClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onCanPlay: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayThroughCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onChangeCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onCutCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onDisappear: js.UndefOr[AppearEventHandler[T]] = js.undefined
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onDoubleClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDurationChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onDurationChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEmptied: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEmptiedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEncrypted: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEncryptedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEnded: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEndedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onError: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // also a Media Event
  var onErrorCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onInvalidCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  // Image Events
  var onLoad: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadStart: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadStartCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedData: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedDataCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedMetadataCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Weex Common Events
  var onLongpress: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onPause: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPauseCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlay: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlaying: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlayingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onProgress: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onProgressCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onRateChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onRateChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onResetCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
  
  var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.undefined
  
  var onSeeked: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeekedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeeking: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeekingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Selection Events
  var onSelect: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSelectCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onStalled: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onStalledCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onSubmitCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onSuspend: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSuspendCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onTimeUpdateCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  
  var onVolumeChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onVolumeChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onWaiting: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onWaitingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
  
  var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var radioGroup: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  
  var security: js.UndefOr[String] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
  
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var typeof: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr[on | off] = js.undefined
  
  var vocab: js.UndefOr[String] = js.undefined
}
object HTMLAttributes {
  
  inline def apply[T](): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
  
  extension [Self <: HTMLAttributes[?], T](x: Self & HTMLAttributes[T]) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setChildren(value: RaxNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContentEditable(value: Boolean): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultValue(value: String | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOnAbort(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnAbortCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onAbortCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: AnimationEvent[T] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: AnimationEvent[T]) => value(t0).runNow()))
    
    inline def setOnAnimationEndCapture(value: AnimationEvent[T] => Callback): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1((t0: AnimationEvent[T]) => value(t0).runNow()))
    
    inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: AnimationEvent[T] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: AnimationEvent[T]) => value(t0).runNow()))
    
    inline def setOnAnimationIterationCapture(value: AnimationEvent[T] => Callback): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1((t0: AnimationEvent[T]) => value(t0).runNow()))
    
    inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: AnimationEvent[T] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: AnimationEvent[T]) => value(t0).runNow()))
    
    inline def setOnAnimationStartCapture(value: AnimationEvent[T] => Callback): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1((t0: AnimationEvent[T]) => value(t0).runNow()))
    
    inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAppear(value: AppearEvent[T] => Callback): Self = StObject.set(x, "onAppear", js.Any.fromFunction1((t0: AppearEvent[T]) => value(t0).runNow()))
    
    inline def setOnAppearUndefined: Self = StObject.set(x, "onAppear", js.undefined)
    
    inline def setOnAuxClick(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnAuxClickCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onAuxClickCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: FormEvent[T] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnBeforeInputCapture(value: FormEvent[T] => Callback): Self = StObject.set(x, "onBeforeInputCapture", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: FocusEvent[T] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: FocusEvent[T]) => value(t0).runNow()))
    
    inline def setOnBlurCapture(value: FocusEvent[T] => Callback): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1((t0: FocusEvent[T]) => value(t0).runNow()))
    
    inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnCanPlayCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onCanPlayCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    inline def setOnCanPlayThrough(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnCanPlayThroughCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onCanPlayThroughCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: FormEvent[T] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnChangeCapture(value: FormEvent[T] => Callback): Self = StObject.set(x, "onChangeCapture", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnClickCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: CompositionEvent[T] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: CompositionEvent[T]) => value(t0).runNow()))
    
    inline def setOnCompositionEndCapture(value: CompositionEvent[T] => Callback): Self = StObject.set(x, "onCompositionEndCapture", js.Any.fromFunction1((t0: CompositionEvent[T]) => value(t0).runNow()))
    
    inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: CompositionEvent[T] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: CompositionEvent[T]) => value(t0).runNow()))
    
    inline def setOnCompositionStartCapture(value: CompositionEvent[T] => Callback): Self = StObject.set(x, "onCompositionStartCapture", js.Any.fromFunction1((t0: CompositionEvent[T]) => value(t0).runNow()))
    
    inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: CompositionEvent[T] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: CompositionEvent[T]) => value(t0).runNow()))
    
    inline def setOnCompositionUpdateCapture(value: CompositionEvent[T] => Callback): Self = StObject.set(x, "onCompositionUpdateCapture", js.Any.fromFunction1((t0: CompositionEvent[T]) => value(t0).runNow()))
    
    inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnContextMenuCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ClipboardEvent[T] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ClipboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnCopyCapture(value: ClipboardEvent[T] => Callback): Self = StObject.set(x, "onCopyCapture", js.Any.fromFunction1((t0: ClipboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ClipboardEvent[T] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ClipboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnCutCapture(value: ClipboardEvent[T] => Callback): Self = StObject.set(x, "onCutCapture", js.Any.fromFunction1((t0: ClipboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDisappear(value: AppearEvent[T] => Callback): Self = StObject.set(x, "onDisappear", js.Any.fromFunction1((t0: AppearEvent[T]) => value(t0).runNow()))
    
    inline def setOnDisappearUndefined: Self = StObject.set(x, "onDisappear", js.undefined)
    
    inline def setOnDoubleClick(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnDoubleClickCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onDoubleClickCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragCapture(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    inline def setOnDragEnd(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragEndCapture(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragEnterCapture(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragExitCapture(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragLeaveCapture(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragOverCapture(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragStartCapture(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDropCapture(value: DragEvent[T] => Callback): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1((t0: DragEvent[T]) => value(t0).runNow()))
    
    inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnDurationChangeCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onDurationChangeCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnEmptiedCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onEmptiedCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnEncryptedCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onEncryptedCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnEndedCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onEndedCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnErrorCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onErrorCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[T] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: FocusEvent[T]) => value(t0).runNow()))
    
    inline def setOnFocusCapture(value: FocusEvent[T] => Callback): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1((t0: FocusEvent[T]) => value(t0).runNow()))
    
    inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnGotPointerCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnGotPointerCaptureCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    inline def setOnInput(value: FormEvent[T] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnInputCapture(value: FormEvent[T] => Callback): Self = StObject.set(x, "onInputCapture", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: FormEvent[T] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnInvalidCapture(value: FormEvent[T] => Callback): Self = StObject.set(x, "onInvalidCapture", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEvent[T] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: KeyboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnKeyDownCapture(value: KeyboardEvent[T] => Callback): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1((t0: KeyboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: KeyboardEvent[T] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: KeyboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnKeyPressCapture(value: KeyboardEvent[T] => Callback): Self = StObject.set(x, "onKeyPressCapture", js.Any.fromFunction1((t0: KeyboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: KeyboardEvent[T] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: KeyboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnKeyUpCapture(value: KeyboardEvent[T] => Callback): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1((t0: KeyboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnLoadCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onLoadCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    inline def setOnLoadStart(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnLoadStartCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onLoadStartCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnLoadedDataCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onLoadedDataCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnLoadedMetadataCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onLoadedMetadataCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnLongpress(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onLongpress", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnLongpressUndefined: Self = StObject.set(x, "onLongpress", js.undefined)
    
    inline def setOnLostPointerCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnLostPointerCaptureCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    inline def setOnMouseDown(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseDownCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseMoveCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseOutCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseOverCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseUpCapture(value: MouseEvent[T, org.scalajs.dom.MouseEvent] => Callback): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1((t0: MouseEvent[T, org.scalajs.dom.MouseEvent]) => value(t0).runNow()))
    
    inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ClipboardEvent[T] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ClipboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnPasteCapture(value: ClipboardEvent[T] => Callback): Self = StObject.set(x, "onPasteCapture", js.Any.fromFunction1((t0: ClipboardEvent[T]) => value(t0).runNow()))
    
    inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnPauseCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onPauseCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnPlayCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onPlayCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnPlayingCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onPlayingCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerCancelCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerDownCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerEnterCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerMoveCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerOutCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerOverCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerUpCapture(value: PointerEvent[T] => Callback): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1((t0: PointerEvent[T]) => value(t0).runNow()))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnProgressCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onProgressCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnRateChangeCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onRateChangeCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: FormEvent[T] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnResetCapture(value: FormEvent[T] => Callback): Self = StObject.set(x, "onResetCapture", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: UIEvent[T] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: UIEvent[T]) => value(t0).runNow()))
    
    inline def setOnScrollCapture(value: UIEvent[T] => Callback): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1((t0: UIEvent[T]) => value(t0).runNow()))
    
    inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnSeekedCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onSeekedCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnSeekingCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onSeekingCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnSelectCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onSelectCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnStalledCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onStalledCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: FormEvent[T] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnSubmitCapture(value: FormEvent[T] => Callback): Self = StObject.set(x, "onSubmitCapture", js.Any.fromFunction1((t0: FormEvent[T]) => value(t0).runNow()))
    
    inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnSuspendCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onSuspendCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnTimeUpdateCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onTimeUpdateCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: TouchEvent[T] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: TouchEvent[T]) => value(t0).runNow()))
    
    inline def setOnTouchCancelCapture(value: TouchEvent[T] => Callback): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1((t0: TouchEvent[T]) => value(t0).runNow()))
    
    inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: TouchEvent[T] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: TouchEvent[T]) => value(t0).runNow()))
    
    inline def setOnTouchEndCapture(value: TouchEvent[T] => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: TouchEvent[T]) => value(t0).runNow()))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: TouchEvent[T] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: TouchEvent[T]) => value(t0).runNow()))
    
    inline def setOnTouchMoveCapture(value: TouchEvent[T] => Callback): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1((t0: TouchEvent[T]) => value(t0).runNow()))
    
    inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: TouchEvent[T] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: TouchEvent[T]) => value(t0).runNow()))
    
    inline def setOnTouchStartCapture(value: TouchEvent[T] => Callback): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1((t0: TouchEvent[T]) => value(t0).runNow()))
    
    inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: TransitionEvent[T] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: TransitionEvent[T]) => value(t0).runNow()))
    
    inline def setOnTransitionEndCapture(value: TransitionEvent[T] => Callback): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1((t0: TransitionEvent[T]) => value(t0).runNow()))
    
    inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnVolumeChangeCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onVolumeChangeCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnWaitingCapture(value: SyntheticEvent[T, Event] => Callback): Self = StObject.set(x, "onWaitingCapture", js.Any.fromFunction1((t0: SyntheticEvent[T, Event]) => value(t0).runNow()))
    
    inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: WheelEvent[T] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: WheelEvent[T]) => value(t0).runNow()))
    
    inline def setOnWheelCapture(value: WheelEvent[T] => Callback): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1((t0: WheelEvent[T]) => value(t0).runNow()))
    
    inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
