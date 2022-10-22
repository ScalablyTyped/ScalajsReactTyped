package typingsJapgolly.reactElemental.components

import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.HTMLInputTypeAttribute
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.reactElemental.mod.TextAreaProps
import typingsJapgolly.reactElemental.reactElementalStrings.`additions removals`
import typingsJapgolly.reactElemental.reactElementalStrings.`additions text`
import typingsJapgolly.reactElemental.reactElementalStrings.`inline`
import typingsJapgolly.reactElemental.reactElementalStrings.`removals additions`
import typingsJapgolly.reactElemental.reactElementalStrings.`removals text`
import typingsJapgolly.reactElemental.reactElementalStrings.`text additions`
import typingsJapgolly.reactElemental.reactElementalStrings.`text removals`
import typingsJapgolly.reactElemental.reactElementalStrings.additions
import typingsJapgolly.reactElemental.reactElementalStrings.all
import typingsJapgolly.reactElemental.reactElementalStrings.ascending
import typingsJapgolly.reactElemental.reactElementalStrings.assertive
import typingsJapgolly.reactElemental.reactElementalStrings.both
import typingsJapgolly.reactElemental.reactElementalStrings.copy
import typingsJapgolly.reactElemental.reactElementalStrings.date
import typingsJapgolly.reactElemental.reactElementalStrings.decimal
import typingsJapgolly.reactElemental.reactElementalStrings.descending
import typingsJapgolly.reactElemental.reactElementalStrings.dialog
import typingsJapgolly.reactElemental.reactElementalStrings.done
import typingsJapgolly.reactElemental.reactElementalStrings.email
import typingsJapgolly.reactElemental.reactElementalStrings.enter
import typingsJapgolly.reactElemental.reactElementalStrings.environment
import typingsJapgolly.reactElemental.reactElementalStrings.execute
import typingsJapgolly.reactElemental.reactElementalStrings.go
import typingsJapgolly.reactElemental.reactElementalStrings.grammar
import typingsJapgolly.reactElemental.reactElementalStrings.grid
import typingsJapgolly.reactElemental.reactElementalStrings.horizontal
import typingsJapgolly.reactElemental.reactElementalStrings.inherit
import typingsJapgolly.reactElemental.reactElementalStrings.link
import typingsJapgolly.reactElemental.reactElementalStrings.list
import typingsJapgolly.reactElemental.reactElementalStrings.listbox
import typingsJapgolly.reactElemental.reactElementalStrings.location
import typingsJapgolly.reactElemental.reactElementalStrings.menu
import typingsJapgolly.reactElemental.reactElementalStrings.mixed
import typingsJapgolly.reactElemental.reactElementalStrings.move
import typingsJapgolly.reactElemental.reactElementalStrings.next
import typingsJapgolly.reactElemental.reactElementalStrings.no
import typingsJapgolly.reactElemental.reactElementalStrings.none
import typingsJapgolly.reactElemental.reactElementalStrings.numeric
import typingsJapgolly.reactElemental.reactElementalStrings.off
import typingsJapgolly.reactElemental.reactElementalStrings.on
import typingsJapgolly.reactElemental.reactElementalStrings.other
import typingsJapgolly.reactElemental.reactElementalStrings.page
import typingsJapgolly.reactElemental.reactElementalStrings.polite
import typingsJapgolly.reactElemental.reactElementalStrings.popup
import typingsJapgolly.reactElemental.reactElementalStrings.previous
import typingsJapgolly.reactElemental.reactElementalStrings.removals
import typingsJapgolly.reactElemental.reactElementalStrings.search
import typingsJapgolly.reactElemental.reactElementalStrings.send
import typingsJapgolly.reactElemental.reactElementalStrings.spelling
import typingsJapgolly.reactElemental.reactElementalStrings.step
import typingsJapgolly.reactElemental.reactElementalStrings.tel
import typingsJapgolly.reactElemental.reactElementalStrings.text
import typingsJapgolly.reactElemental.reactElementalStrings.time
import typingsJapgolly.reactElemental.reactElementalStrings.tree
import typingsJapgolly.reactElemental.reactElementalStrings.url
import typingsJapgolly.reactElemental.reactElementalStrings.user
import typingsJapgolly.reactElemental.reactElementalStrings.vertical
import typingsJapgolly.reactElemental.reactElementalStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextArea {
  
  inline def apply(
    onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] & js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] & js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] & js.UndefOr[ChangeEventHandler[HTMLInputElement]],
    onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] & js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] & js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] & js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] & js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] & js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] & js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] & js.UndefOr[UIEventHandler[HTMLInputElement]],
    onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] & js.UndefOr[FormEventHandler[HTMLInputElement]],
    onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] & js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] & js.UndefOr[TransitionEventHandler[HTMLInputElement]],
    onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] & js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] & js.UndefOr[WheelEventHandler[HTMLInputElement]]
  ): Builder = {
    val __props = js.Dynamic.literal(onAbort = onAbort.asInstanceOf[js.Any], onAnimationEnd = onAnimationEnd.asInstanceOf[js.Any], onAnimationIteration = onAnimationIteration.asInstanceOf[js.Any], onAnimationStart = onAnimationStart.asInstanceOf[js.Any], onAuxClick = onAuxClick.asInstanceOf[js.Any], onBeforeInput = onBeforeInput.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onCanPlay = onCanPlay.asInstanceOf[js.Any], onCanPlayThrough = onCanPlayThrough.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onCompositionEnd = onCompositionEnd.asInstanceOf[js.Any], onCompositionStart = onCompositionStart.asInstanceOf[js.Any], onCompositionUpdate = onCompositionUpdate.asInstanceOf[js.Any], onContextMenu = onContextMenu.asInstanceOf[js.Any], onCopy = onCopy.asInstanceOf[js.Any], onCut = onCut.asInstanceOf[js.Any], onDoubleClick = onDoubleClick.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any], onDragEnd = onDragEnd.asInstanceOf[js.Any], onDragEnter = onDragEnter.asInstanceOf[js.Any], onDragExit = onDragExit.asInstanceOf[js.Any], onDragLeave = onDragLeave.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], onDragStart = onDragStart.asInstanceOf[js.Any], onDrop = onDrop.asInstanceOf[js.Any], onDurationChange = onDurationChange.asInstanceOf[js.Any], onEmptied = onEmptied.asInstanceOf[js.Any], onEncrypted = onEncrypted.asInstanceOf[js.Any], onEnded = onEnded.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onInput = onInput.asInstanceOf[js.Any], onInvalid = onInvalid.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyPress = onKeyPress.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onLoadStart = onLoadStart.asInstanceOf[js.Any], onLoadedData = onLoadedData.asInstanceOf[js.Any], onLoadedMetadata = onLoadedMetadata.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], onMouseMove = onMouseMove.asInstanceOf[js.Any], onMouseOut = onMouseOut.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], onMouseUp = onMouseUp.asInstanceOf[js.Any], onPaste = onPaste.asInstanceOf[js.Any], onPause = onPause.asInstanceOf[js.Any], onPlay = onPlay.asInstanceOf[js.Any], onPlaying = onPlaying.asInstanceOf[js.Any], onPointerCancel = onPointerCancel.asInstanceOf[js.Any], onPointerDown = onPointerDown.asInstanceOf[js.Any], onPointerEnter = onPointerEnter.asInstanceOf[js.Any], onPointerLeave = onPointerLeave.asInstanceOf[js.Any], onPointerMove = onPointerMove.asInstanceOf[js.Any], onPointerOut = onPointerOut.asInstanceOf[js.Any], onPointerOver = onPointerOver.asInstanceOf[js.Any], onPointerUp = onPointerUp.asInstanceOf[js.Any], onProgress = onProgress.asInstanceOf[js.Any], onRateChange = onRateChange.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], onSeeked = onSeeked.asInstanceOf[js.Any], onSeeking = onSeeking.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], onStalled = onStalled.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], onSuspend = onSuspend.asInstanceOf[js.Any], onTimeUpdate = onTimeUpdate.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransitionEnd = onTransitionEnd.asInstanceOf[js.Any], onVolumeChange = onVolumeChange.asInstanceOf[js.Any], onWaiting = onWaiting.asInstanceOf[js.Any], onWheel = onWheel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TextAreaProps]))
  }
  
  @JSImport("react-elemental", "TextArea")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def capture(value: Boolean | user | environment): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def dirName(value: String): this.type = set("dirName", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def enterKeyHint(value: enter | done | go | next | previous | search | send): this.type = set("enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    inline def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    
    inline def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    inline def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    inline def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def list(value: String): this.type = set("list", value.asInstanceOf[js.Any])
    
    inline def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def textarea(value: Boolean): this.type = set("textarea", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def `type`(value: HTMLInputTypeAttribute): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextAreaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
