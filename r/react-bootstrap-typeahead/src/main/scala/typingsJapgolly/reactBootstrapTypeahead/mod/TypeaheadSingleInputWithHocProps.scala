package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.HTMLInputTypeAttribute
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.`additions removals`
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.`additions text`
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.`removals additions`
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.`removals text`
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.`text additions`
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.`text removals`
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.additions
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.all
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.ascending
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.assertive
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.combobox
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.copy
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.date
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.decimal
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.descending
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.done
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.email
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.enter
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.environment
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.execute
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.go
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.grammar
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.horizontal
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.inherit
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.link
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.location
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.mixed
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.move
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.next
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.no
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.none
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.numeric
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.off
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.on
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.other
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.page
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.polite
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.popup
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.previous
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.removals
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.search
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.send
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.spelling
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.step
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.tel
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.text
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.time
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.url
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.user
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.vertical
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.Omit<react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps, keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>> */
/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T> */
@js.native
trait TypeaheadSingleInputWithHocProps[T /* <: TypeaheadModel */] extends StObject {
  
  var about: js.UndefOr[String] = js.native
  
  var accept: js.UndefOr[String] = js.native
  
  var accessKey: js.UndefOr[String] = js.native
  
  var alt: js.UndefOr[String] = js.native
  
  var `aria-activedescendant`: String = js.native
  
  var `aria-atomic`: js.UndefOr[Booleanish] = js.native
  
  var `aria-autocomplete`: list | both = js.native
  
  var `aria-busy`: js.UndefOr[Booleanish] = js.native
  
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  
  var `aria-colcount`: js.UndefOr[Double] = js.native
  
  var `aria-colindex`: js.UndefOr[Double] = js.native
  
  var `aria-colspan`: js.UndefOr[Double] = js.native
  
  var `aria-controls`: js.UndefOr[String] = js.native
  
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  
  var `aria-describedby`: js.UndefOr[String] = js.native
  
  var `aria-details`: js.UndefOr[String] = js.native
  
  var `aria-disabled`: js.UndefOr[Booleanish] = js.native
  
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  
  var `aria-errormessage`: js.UndefOr[String] = js.native
  
  var `aria-expanded`: Boolean = js.native
  
  var `aria-flowto`: js.UndefOr[String] = js.native
  
  var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
  
  var `aria-haspopup`: listbox = js.native
  
  var `aria-hidden`: js.UndefOr[Booleanish] = js.native
  
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var `aria-level`: js.UndefOr[Double] = js.native
  
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  
  var `aria-modal`: js.UndefOr[Booleanish] = js.native
  
  var `aria-multiline`: js.UndefOr[Booleanish] = js.native
  
  var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
  
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  
  var `aria-owns`: String = js.native
  
  var `aria-placeholder`: js.UndefOr[String] = js.native
  
  var `aria-posinset`: js.UndefOr[Double] = js.native
  
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  
  var `aria-readonly`: js.UndefOr[Booleanish] = js.native
  
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.native
  
  var `aria-required`: js.UndefOr[Booleanish] = js.native
  
  var `aria-roledescription`: js.UndefOr[String] = js.native
  
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  
  var `aria-selected`: js.UndefOr[Booleanish] = js.native
  
  var `aria-setsize`: js.UndefOr[Double] = js.native
  
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  
  var `aria-valuetext`: js.UndefOr[String] = js.native
  
  var autoCapitalize: js.UndefOr[String] = js.native
  
  var autoComplete: String = js.native
  
  var autoCorrect: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoSave: js.UndefOr[String] = js.native
  
  var capture: js.UndefOr[Boolean | user | environment] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[Node] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var disabled: Boolean = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var formAction: js.UndefOr[String] = js.native
  
  var formEncType: js.UndefOr[String] = js.native
  
  var formMethod: js.UndefOr[String] = js.native
  
  var formNoValidate: js.UndefOr[Boolean] = js.native
  
  var formTarget: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inlist: js.UndefOr[Any] = js.native
  
  var inputClassName: String = js.native
  
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  var inputRef: LegacyRef[HTMLInputElement] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var list: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Double | String] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double | String] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  def onBlur(e: ReactEventFrom[Element]): Unit = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  def onChange(selected: js.Array[T]): Unit = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  def onClick(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  def onFocus(e: ReactEventFrom[Element]): Unit = js.native
  
  var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  def onKeyDown(e: ReactEventFrom[Element]): Unit = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.native
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.native
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var role: combobox = js.native
  
  var security: js.UndefOr[String] = js.native
  
  /* Callback function that determines whether the hint should be selected. */
  var shouldSelectHint: js.UndefOr[ShouldSelect] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var step: js.UndefOr[Double | String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var translate: js.UndefOr[yes | no] = js.native
  
  var `type`: js.UndefOr[HTMLInputTypeAttribute] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  var value: String = js.native
  
  var vocab: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
