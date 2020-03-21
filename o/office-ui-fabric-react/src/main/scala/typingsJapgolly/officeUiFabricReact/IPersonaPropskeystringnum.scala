package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`additions text`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`inline`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.additions
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.all
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.ascending
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.both
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.copy
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.date
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.decimal
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.descending
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.dialog
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.email
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.execute
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.grammar
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.grid
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.horizontal
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.link
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.list
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.listbox
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.location
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.menu
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.mixed
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.move
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.no
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.none
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.numeric
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.off
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.on
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.other
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.page
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.polite
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.popup
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.removals
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.search
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.spelling
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.step
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.tel
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.text
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.time
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.tree
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.url
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.vertical
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.yes
import typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase
import typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersona
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaCoinProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaStyleProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaStyles
import typingsJapgolly.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import typingsJapgolly.officeUiFabricReact.personaTypesMod.PersonaPresence
import typingsJapgolly.officeUiFabricReact.personaTypesMod.PersonaSize
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
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
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Persona.IPersonaProps & {  key  :string | number} */
trait IPersonaPropskeystringnum extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.undefined
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
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
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
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
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
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
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
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
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
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
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
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
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  /**
    * Additional CSS class(es) to apply to the Persona
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional HTML element props for Persona coin.
    */
  var coinProps: js.UndefOr[IPersonaCoinProps] = js.undefined
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IPersona interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPersona]] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to not render persona details, and just render the persona image/initials.
    */
  var hidePersonaDetails: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /**
    * Alt text for the image to use. Defaults to an empty string.
    */
  var imageAlt: js.UndefOr[String] = js.undefined
  /**
    * The user's initials to display in the image area when there is no image.
    * @defaultvalue [Derived from text]
    */
  var imageInitials: js.UndefOr[String] = js.undefined
  /**
    * If true, adds the css class 'is-fadeIn' to the image.
    */
  var imageShouldFadeIn: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables imageShouldFadeIn.
    * @defaultvalue false
    */
  var imageShouldStartVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue [Derived from text]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.undefined
  /**
    * This flag can be used to signal the persona is out of office.
    * This will change the way the presence icon looks for statuses that support dual-presence.
    */
  var isOutOfOffice: js.UndefOr[Boolean] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var key: String | Double
  var lang: js.UndefOr[String] = js.undefined
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  /**
    * Optional callback for when loading state of the photo changes
    */
  var onPhotoLoadingStateChange: js.UndefOr[js.Function1[/* newImageLoadState */ ImageLoadState, Unit]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  /**
    * Optional custom renderer for the coin
    * @deprecated Use `onRenderPersonaCoin` for custom rendering instead
    */
  var onRenderCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  /**
    * Optional custom renderer for the initials
    */
  var onRenderInitials: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  /**
    * Optional custom renderer for the optional text.
    */
  var onRenderOptionalText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the coin
    */
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  /**
    * Optional custom renderer for the primary text.
    */
  var onRenderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the secondary text.
    */
  var onRenderSecondaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the tertiary text.
    */
  var onRenderTertiaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[PersonaBase | PersonaCoinBase | HTMLDivElement]] = js.undefined
  /**
    * Optional text to display, usually a custom message set. The optional text will only be shown when using Size100.
    */
  var optionalText: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @defaultvalue PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  /**
    * Presence title to be shown as a tooltip on hover over the presence icon.
    */
  var presenceTitle: js.UndefOr[String] = js.undefined
  /**
    * Primary text to display, usually the name of the person.
    * @deprecated Use `text` instead.
    */
  var primaryText: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  // Unknown
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  /**
    * Secondary text to display, usually the role of the user.
    */
  var secondaryText: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  /**
    * If true renders the initials while the image is loading.
    * This only applies when an imageUrl is provided.
    * @defaultvalue false
    */
  var showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.undefined
  var showSecondaryText: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, show the special coin for unknown persona.
    * It has '?' in place of initials, with static font and background colors
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined
  /**
    * Decides the size of the control.
    * @defaultvalue PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
    * Tertiary text to display, usually the status of the user. The tertiary text will only be shown when using Size72 or Size100.
    */
  var tertiaryText: js.UndefOr[String] = js.undefined
  /**
    * Primary text to display, usually the name of the person.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object IPersonaPropskeystringnum {
  @scala.inline
  def apply(
    key: String | Double,
    about: String = null,
    accessKey: String = null,
    allowPhoneInitials: js.UndefOr[Boolean] = js.undefined,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: VdomNode = null,
    className: String = null,
    coinProps: IPersonaCoinProps = null,
    coinSize: Int | Double = null,
    color: String = null,
    componentRef: IRefObject[IPersona] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hidePersonaDetails: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    imageAlt: String = null,
    imageInitials: String = null,
    imageShouldFadeIn: js.UndefOr[Boolean] = js.undefined,
    imageShouldStartVisible: js.UndefOr[Boolean] = js.undefined,
    imageUrl: String = null,
    initialsColor: PersonaInitialsColor | String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isOutOfOffice: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    onAbort: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onBeforeInput: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onBlur: ReactFocusEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onCanPlay: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onChange: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onClick: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onCut: ReactClipboardEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDrag: ReactDragEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDragExit: ReactDragEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDragOver: ReactDragEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDragStart: ReactDragEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDrop: ReactDragEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onDurationChange: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onEmptied: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onEncrypted: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onEnded: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onError: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onInput: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onInvalid: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onLoad: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onLoadStart: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onLoadedData: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPause: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPhotoLoadingStateChange: /* newImageLoadState */ ImageLoadState => Callback = null,
    onPlay: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPlaying: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onProgress: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onRateChange: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onRenderCoin: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPersonaSharedProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderInitials: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPersonaSharedProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderOptionalText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPersonaProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderPersonaCoin: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPersonaSharedProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderPrimaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPersonaProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderSecondaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPersonaProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderTertiaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPersonaProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onReset: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onScroll: ReactUIEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onSeeked: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onSeeking: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onSelect: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onStalled: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onSubmit: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onSuspend: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onVolumeChange: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onWaiting: ReactEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    onWheel: ReactWheelEventFrom[(PersonaBase | PersonaCoinBase | HTMLDivElement) with Element] => Callback = null,
    optionalText: String = null,
    placeholder: String = null,
    prefix: String = null,
    presence: PersonaPresence = null,
    presenceTitle: String = null,
    primaryText: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    secondaryText: String = null,
    security: String = null,
    showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.undefined,
    showSecondaryText: js.UndefOr[Boolean] = js.undefined,
    showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined,
    size: PersonaSize = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles] = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    tertiaryText: String = null,
    text: String = null,
    theme: ITheme = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): IPersonaPropskeystringnum = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPhoneInitials)) __obj.updateDynamic("allowPhoneInitials")(allowPhoneInitials.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (coinProps != null) __obj.updateDynamic("coinProps")(coinProps.asInstanceOf[js.Any])
    if (coinSize != null) __obj.updateDynamic("coinSize")(coinSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePersonaDetails)) __obj.updateDynamic("hidePersonaDetails")(hidePersonaDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (imageInitials != null) __obj.updateDynamic("imageInitials")(imageInitials.asInstanceOf[js.Any])
    if (!js.isUndefined(imageShouldFadeIn)) __obj.updateDynamic("imageShouldFadeIn")(imageShouldFadeIn.asInstanceOf[js.Any])
    if (!js.isUndefined(imageShouldStartVisible)) __obj.updateDynamic("imageShouldStartVisible")(imageShouldStartVisible.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (initialsColor != null) __obj.updateDynamic("initialsColor")(initialsColor.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutOfOffice)) __obj.updateDynamic("isOutOfOffice")(isOutOfOffice.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPhotoLoadingStateChange != null) __obj.updateDynamic("onPhotoLoadingStateChange")(js.Any.fromFunction1((t0: /* newImageLoadState */ typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState) => onPhotoLoadingStateChange(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onRenderCoin != null) __obj.updateDynamic("onRenderCoin")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderCoin(t0, t1).runNow()))
    if (onRenderInitials != null) __obj.updateDynamic("onRenderInitials")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderInitials(t0, t1).runNow()))
    if (onRenderOptionalText != null) __obj.updateDynamic("onRenderOptionalText")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderOptionalText(t0, t1).runNow()))
    if (onRenderPersonaCoin != null) __obj.updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderPersonaCoin(t0, t1).runNow()))
    if (onRenderPrimaryText != null) __obj.updateDynamic("onRenderPrimaryText")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderPrimaryText(t0, t1).runNow()))
    if (onRenderSecondaryText != null) __obj.updateDynamic("onRenderSecondaryText")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderSecondaryText(t0, t1).runNow()))
    if (onRenderTertiaryText != null) __obj.updateDynamic("onRenderTertiaryText")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderTertiaryText(t0, t1).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[
  (typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase | typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (optionalText != null) __obj.updateDynamic("optionalText")(optionalText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (presenceTitle != null) __obj.updateDynamic("presenceTitle")(presenceTitle.asInstanceOf[js.Any])
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(showInitialsUntilImageLoads)) __obj.updateDynamic("showInitialsUntilImageLoads")(showInitialsUntilImageLoads.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecondaryText)) __obj.updateDynamic("showSecondaryText")(showSecondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnknownPersonaCoin)) __obj.updateDynamic("showUnknownPersonaCoin")(showUnknownPersonaCoin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaPropskeystringnum]
  }
}

