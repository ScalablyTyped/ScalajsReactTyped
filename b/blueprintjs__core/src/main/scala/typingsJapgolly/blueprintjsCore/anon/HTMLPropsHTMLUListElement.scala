package typingsJapgolly.blueprintjsCore.anon

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
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`additions removals`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`additions text`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`inline`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`removals additions`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`removals text`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`text additions`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`text removals`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.additions
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.all
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.ascending
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.assertive
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.both
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.copy
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.date
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.decimal
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.descending
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.dialog
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.email
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.environment
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.execute
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.grammar
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.grid
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.horizontal
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.inherit
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.link
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.list
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.listbox
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.location
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.menu
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.mixed
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.move
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.no
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.none
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.numeric
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.off
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.on
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.other
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.page
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.polite
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.popup
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.removals
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.search
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.spelling
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.step
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.tel
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.text
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.time
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.tree
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.url
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.user
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.vertical
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.yes
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.HTMLProps<std.HTMLUListElement> & @blueprintjs/core.@blueprintjs/core/lib/esm/common.IElementRefProps<std.HTMLUListElement> & {  children :react.react.ReactNode | undefined} */
trait HTMLPropsHTMLUListElement extends StObject {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  
  // Standard HTML Attributes
  var accept: js.UndefOr[String] = js.undefined
  
  var acceptCharset: js.UndefOr[String] = js.undefined
  
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  
  var action: js.UndefOr[String] = js.undefined
  
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  
  var alt: js.UndefOr[String] = js.undefined
  
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.undefined
  
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.undefined
  
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.undefined
  
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Booleanish] = js.undefined
  
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  var as: js.UndefOr[String] = js.undefined
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  
  var autoComplete: js.UndefOr[String] = js.undefined
  
  var autoCorrect: js.UndefOr[String] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var autoSave: js.UndefOr[String] = js.undefined
  
  var capture: js.UndefOr[Boolean | user | environment] = js.undefined
  
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  
  var challenge: js.UndefOr[String] = js.undefined
  
  var charSet: js.UndefOr[String] = js.undefined
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var cite: js.UndefOr[String] = js.undefined
  
  var classID: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var cols: js.UndefOr[Double] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  
  var contextMenu: js.UndefOr[String] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var coords: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[typingsJapgolly.react.anon.Html] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var dateTime: js.UndefOr[String] = js.undefined
  
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  var defer: js.UndefOr[Boolean] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var download: js.UndefOr[Any] = js.undefined
  
  var draggable: js.UndefOr[Booleanish] = js.undefined
  
  /** A ref handler or a ref object that receives the native HTML element rendered by this component. */
  var elementRef: js.UndefOr[Ref[HTMLUListElement]] = js.undefined
  
  var encType: js.UndefOr[String] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var formAction: js.UndefOr[String] = js.undefined
  
  var formEncType: js.UndefOr[String] = js.undefined
  
  var formMethod: js.UndefOr[String] = js.undefined
  
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  
  var formTarget: js.UndefOr[String] = js.undefined
  
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  
  var headers: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var high: js.UndefOr[Double] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var hrefLang: js.UndefOr[String] = js.undefined
  
  var htmlFor: js.UndefOr[String] = js.undefined
  
  var httpEquiv: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inlist: js.UndefOr[Any] = js.undefined
  
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  
  var integrity: js.UndefOr[String] = js.undefined
  
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.undefined
  
  var itemID: js.UndefOr[String] = js.undefined
  
  var itemProp: js.UndefOr[String] = js.undefined
  
  var itemRef: js.UndefOr[String] = js.undefined
  
  var itemScope: js.UndefOr[Boolean] = js.undefined
  
  var itemType: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[typingsJapgolly.react.mod.Key | Null] = js.undefined
  
  var keyParams: js.UndefOr[String] = js.undefined
  
  var keyType: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var list: js.UndefOr[String] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var low: js.UndefOr[Double] = js.undefined
  
  var manifest: js.UndefOr[String] = js.undefined
  
  var marginHeight: js.UndefOr[Double] = js.undefined
  
  var marginWidth: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double | String] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var mediaGroup: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var min: js.UndefOr[Double | String] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noValidate: js.UndefOr[Boolean] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLUListElement]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLUListElement]] = js.undefined
  
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLUListElement]] = js.undefined
  
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLUListElement]] = js.undefined
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLUListElement]] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLUListElement]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLUListElement]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLUListElement]] = js.undefined
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLUListElement]] = js.undefined
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onError: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLUListElement]] = js.undefined
  
  var onInput: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
  
  // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.undefined
  
  /** @deprecated */
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.undefined
  
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLUListElement]] = js.undefined
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
  
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
  
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLUListElement]] = js.undefined
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLUListElement]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLUListElement]] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLUListElement]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLUListElement]] = js.undefined
  
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLUListElement]] = js.undefined
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
  
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLUListElement]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var optimum: js.UndefOr[Double] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var playsInline: js.UndefOr[Boolean] = js.undefined
  
  var poster: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var preload: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  // Unknown
  var radioGroup: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[HTMLUListElement]] = js.undefined
  
  var rel: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[AriaRole] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var sandbox: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var scoped: js.UndefOr[Boolean] = js.undefined
  
  var scrolling: js.UndefOr[String] = js.undefined
  
  var seamless: js.UndefOr[Boolean] = js.undefined
  
  var security: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var shape: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
  
  var span: js.UndefOr[Double] = js.undefined
  
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srcDoc: js.UndefOr[String] = js.undefined
  
  var srcLang: js.UndefOr[String] = js.undefined
  
  var srcSet: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double | String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var translate: js.UndefOr[yes | no] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var typeof: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr[on | off] = js.undefined
  
  var useMap: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  
  var vocab: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var wmode: js.UndefOr[String] = js.undefined
  
  var wrap: js.UndefOr[String] = js.undefined
}
object HTMLPropsHTMLUListElement {
  
  inline def apply(): HTMLPropsHTMLUListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLPropsHTMLUListElement]
  }
  
  extension [Self <: HTMLPropsHTMLUListElement](x: Self) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
    
    inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
    
    inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
    
    inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
    
    inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
    
    inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
    
    inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    inline def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
    
    inline def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: typingsJapgolly.react.anon.Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setElementRef(value: Ref[HTMLUListElement]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
    
    inline def setElementRefFunction1(value: HTMLUListElement | Null => Callback): Self = StObject.set(x, "elementRef", js.Any.fromFunction1((t0: HTMLUListElement | Null) => value(t0).runNow()))
    
    inline def setElementRefNull: Self = StObject.set(x, "elementRef", null)
    
    inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
    
    inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
    
    inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
    
    inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
    
    inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
    
    inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
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
    
    inline def setKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
    
    inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
    
    inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
    
    inline def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
    
    inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
    
    inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
    
    inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
    
    inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOnAbort(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: ReactFocusEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEnd(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: ReactFocusEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnInput(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadStart(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: ReactUIEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: ReactWheelEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
    
    inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRef(value: LegacyRef[HTMLUListElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLUListElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLUListElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
    
    inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
    
    inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
    
    inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
    
    inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
    
    inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
    
    inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
    
    inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
