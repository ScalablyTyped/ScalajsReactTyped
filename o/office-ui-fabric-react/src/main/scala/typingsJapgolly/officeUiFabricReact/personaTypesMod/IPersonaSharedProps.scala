package typingsJapgolly.officeUiFabricReact.personaTypesMod

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
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState
import typingsJapgolly.officeUiFabricReact.personaBaseMod.PersonaBase
import typingsJapgolly.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.reactStrings.`additions text`
import typingsJapgolly.react.reactStrings.`inline`
import typingsJapgolly.react.reactStrings.additions
import typingsJapgolly.react.reactStrings.all
import typingsJapgolly.react.reactStrings.ascending
import typingsJapgolly.react.reactStrings.assertive
import typingsJapgolly.react.reactStrings.both
import typingsJapgolly.react.reactStrings.copy
import typingsJapgolly.react.reactStrings.date
import typingsJapgolly.react.reactStrings.decimal
import typingsJapgolly.react.reactStrings.descending
import typingsJapgolly.react.reactStrings.dialog
import typingsJapgolly.react.reactStrings.email
import typingsJapgolly.react.reactStrings.execute
import typingsJapgolly.react.reactStrings.grammar
import typingsJapgolly.react.reactStrings.grid
import typingsJapgolly.react.reactStrings.horizontal
import typingsJapgolly.react.reactStrings.inherit
import typingsJapgolly.react.reactStrings.link
import typingsJapgolly.react.reactStrings.list
import typingsJapgolly.react.reactStrings.listbox
import typingsJapgolly.react.reactStrings.location
import typingsJapgolly.react.reactStrings.menu
import typingsJapgolly.react.reactStrings.mixed
import typingsJapgolly.react.reactStrings.move
import typingsJapgolly.react.reactStrings.no
import typingsJapgolly.react.reactStrings.none
import typingsJapgolly.react.reactStrings.numeric
import typingsJapgolly.react.reactStrings.off
import typingsJapgolly.react.reactStrings.on
import typingsJapgolly.react.reactStrings.other
import typingsJapgolly.react.reactStrings.page
import typingsJapgolly.react.reactStrings.polite
import typingsJapgolly.react.reactStrings.popup
import typingsJapgolly.react.reactStrings.removals
import typingsJapgolly.react.reactStrings.search
import typingsJapgolly.react.reactStrings.spelling
import typingsJapgolly.react.reactStrings.step
import typingsJapgolly.react.reactStrings.tel
import typingsJapgolly.react.reactStrings.text
import typingsJapgolly.react.reactStrings.time
import typingsJapgolly.react.reactStrings.tree
import typingsJapgolly.react.reactStrings.url
import typingsJapgolly.react.reactStrings.vertical
import typingsJapgolly.react.reactStrings.yes
import typingsJapgolly.std.HTMLDivElement
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaSharedProps extends HTMLAttributes[PersonaBase | PersonaCoinBase | HTMLDivElement] {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional HTML element props for Persona coin.
    */
  var coinProps: js.UndefOr[IPersonaCoinProps] = js.undefined
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether to not render persona details, and just render the persona image/initials.
    */
  var hidePersonaDetails: js.UndefOr[Boolean] = js.undefined
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
  /**
    * This flag can be used to signal the persona is out of office.
    * This will change the way the presence icon looks for statuses that support dual-presence.
    */
  var isOutOfOffice: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional callback for when loading state of the photo changes
    */
  var onPhotoLoadingStateChange: js.UndefOr[js.Function1[/* newImageLoadState */ ImageLoadState, Unit]] = js.undefined
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
    * Optional custom renderer for the coin
    */
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  /**
    * Optional text to display, usually a custom message set. The optional text will only be shown when using Size100.
    */
  var optionalText: js.UndefOr[String] = js.undefined
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
  /**
    * Secondary text to display, usually the role of the user.
    */
  var secondaryText: js.UndefOr[String] = js.undefined
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
}

object IPersonaSharedProps {
  @scala.inline
  def apply(
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
    onAbort: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onAuxClick: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onBeforeInput: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onBlur: ReactFocusEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onCanPlay: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onCanPlayThrough: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onChange: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onClick: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onContextMenu: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onCopy: ReactClipboardEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onCut: ReactClipboardEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDrag: ReactDragEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDragEnd: ReactDragEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDragEnter: ReactDragEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDragExit: ReactDragEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDragLeave: ReactDragEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDragOver: ReactDragEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDragStart: ReactDragEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDrop: ReactDragEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onDurationChange: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onEmptied: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onEncrypted: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onEnded: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onError: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onFocus: ReactFocusEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onInput: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onInvalid: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onLoad: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onLoadStart: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onLoadedData: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onLoadedMetadata: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onMouseDown: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onMouseMove: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onMouseOut: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onMouseOver: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onMouseUp: ReactMouseEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPaste: ReactClipboardEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPause: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPhotoLoadingStateChange: /* newImageLoadState */ ImageLoadState => Callback = null,
    onPlay: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPlaying: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPointerDown: ReactPointerEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPointerMove: ReactPointerEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPointerOut: ReactPointerEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPointerOver: ReactPointerEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onPointerUp: ReactPointerEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onProgress: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onRateChange: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
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
    onRenderPersonaCoin: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPersonaSharedProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onReset: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onScroll: ReactUIEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onSeeked: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onSeeking: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onSelect: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onStalled: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onSubmit: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onSuspend: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onTimeUpdate: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onTouchMove: ReactTouchEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onTouchStart: ReactTouchEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onVolumeChange: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onWaiting: ReactEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
    onWheel: ReactWheelEventFrom[
      (PersonaBase | PersonaCoinBase | org.scalajs.dom.raw.HTMLDivElement) with Element
    ] => Callback = null,
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
  ): IPersonaSharedProps = {
    val __obj = js.Dynamic.literal()
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
    if (onRenderPersonaCoin != null) __obj.updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderPersonaCoin(t0, t1).runNow()))
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
    __obj.asInstanceOf[IPersonaSharedProps]
  }
}

