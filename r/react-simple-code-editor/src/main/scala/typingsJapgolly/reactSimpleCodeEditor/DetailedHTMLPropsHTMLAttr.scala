package typingsJapgolly.reactSimpleCodeEditor

import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.`additions text`
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.`inline`
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.additions
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.all
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.ascending
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.assertive
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.both
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.copy
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.date
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.decimal
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.descending
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.dialog
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.email
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.execute
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.grammar
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.grid
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.horizontal
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.inherit
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.link
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.list
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.listbox
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.location
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.menu
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.mixed
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.move
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.no
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.none
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.numeric
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.off
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.on
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.other
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.page
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.polite
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.popup
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.removals
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.search
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.spelling
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.step
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.tel
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.text
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.time
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.tree
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.url
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.vertical
import typingsJapgolly.reactSimpleCodeEditor.reactSimpleCodeEditorStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement> & {  value  :string, onValueChange (value : string): void, highlight (value : string): string | react.react.ReactNode,   tabSize ? :number,   insertSpaces ? :boolean,   ignoreTabKey ? :boolean,   padding ? :number | string,   style ? :react.react.CSSProperties,   textareaId ? :string,   autoFocus ? :boolean,   disabled ? :boolean,   form ? :string,   maxLength ? :number,   minLength ? :number,   name ? :string,   placeholder ? :string,   readOnly ? :boolean,   required ? :boolean, onClick ? (e : react.react.MouseEvent<std.HTMLTextAreaElement, react.react.NativeMouseEvent>): void, onFocus ? (e : react.react.FocusEvent<std.HTMLTextAreaElement>): void, onBlur ? (e : react.react.FocusEvent<std.HTMLTextAreaElement>): void, onKeyUp ? (e : react.react.KeyboardEvent<std.HTMLTextAreaElement>): void, onKeyDown ? (e : react.react.KeyboardEvent<std.HTMLTextAreaElement>): void} */
@js.native
trait DetailedHTMLPropsHTMLAttr extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.native
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.native
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.native
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.native
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.native
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.native
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.native
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.native
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.native
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.native
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.native
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.native
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.native
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.native
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[Node] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var datatype: js.UndefOr[String] = js.native
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var form: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var ignoreTabKey: js.UndefOr[Boolean] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var insertSpaces: js.UndefOr[Boolean] = js.native
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var lang: js.UndefOr[String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onBlur: js.UndefOr[
    FocusEventHandler[HTMLDivElement] | (js.Function1[/* e */ ReactFocusEventFrom[HTMLTextAreaElement], Unit])
  ] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onClick: js.UndefOr[
    (js.Function1[/* e */ ReactMouseEventFrom[HTMLTextAreaElement], Unit]) | MouseEventHandler[HTMLDivElement]
  ] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[
    FocusEventHandler[HTMLDivElement] | (js.Function1[/* e */ ReactFocusEventFrom[HTMLTextAreaElement], Unit])
  ] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[
    (js.Function1[/* e */ ReactKeyboardEventFrom[HTMLTextAreaElement], Unit]) | KeyboardEventHandler[HTMLDivElement]
  ] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onKeyUp: js.UndefOr[
    (js.Function1[/* e */ ReactKeyboardEventFrom[HTMLTextAreaElement], Unit]) | KeyboardEventHandler[HTMLDivElement]
  ] = js.native
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
  var padding: js.UndefOr[Double | String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  // Unknown
  var radioGroup: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[LegacyRef[HTMLDivElement]] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  // Props for the textarea
  var textareaId: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  // Props for the component
  var value: String = js.native
  var vocab: js.UndefOr[String] = js.native
  def highlight(value: String): String | Node = js.native
  def onValueChange(value: String): Unit = js.native
}

