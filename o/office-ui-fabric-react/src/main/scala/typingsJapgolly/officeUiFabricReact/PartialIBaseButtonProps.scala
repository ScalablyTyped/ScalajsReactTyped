package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typingsJapgolly.officeUiFabricReact.baseButtonMod.BaseButton
import typingsJapgolly.officeUiFabricReact.buttonButtonMod.Button
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButton
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps
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
import typingsJapgolly.officeUiFabricReact.splitButtonClassNamesMod.ISplitButtonClassNames
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.ButtonHTMLAttributes
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
import typingsJapgolly.uifabricMergeStyles.istyleMod.IStyle
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.icomponentasMod.IComponentAs
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsJapgolly.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Button/BaseButton.IBaseButtonProps> */
trait PartialIBaseButtonProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var acceptCharset: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var allowDisabledFocus: js.UndefOr[Boolean] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var ariaDescription: js.UndefOr[String] = js.undefined
  var ariaHidden: js.UndefOr[Boolean] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var baseClassName: js.UndefOr[String] = js.undefined
  var buttonType: js.UndefOr[ButtonType] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
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
  var componentRef: js.UndefOr[IRefObject[IButton]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var coords: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var dateTime: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultRender: js.UndefOr[js.Any] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[IStyle] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var encType: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var getClassNames: js.UndefOr[
    js.Function11[
      /* theme */ ITheme, 
      /* className */ String, 
      /* variantClassName */ String, 
      /* iconClassName */ js.UndefOr[String], 
      /* menuIconClassName */ js.UndefOr[String], 
      /* disabled */ Boolean, 
      /* checked */ Boolean, 
      /* expanded */ Boolean, 
      /* hasMenu */ Boolean, 
      /* isSplit */ js.UndefOr[Boolean], 
      /* allowDisabledFocus */ Boolean, 
      IButtonClassNames
    ]
  ] = js.undefined
  var getSplitButtonClassNames: js.UndefOr[
    js.Function4[
      /* disabled */ Boolean, 
      /* expanded */ Boolean, 
      /* checked */ Boolean, 
      /* allowDisabledFocus */ Boolean, 
      ISplitButtonClassNames
    ]
  ] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var httpEquiv: js.UndefOr[String] = js.undefined
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var keyParams: js.UndefOr[String] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
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
  var menuAs: js.UndefOr[IComponentAs[IContextualMenuProps]] = js.undefined
  var menuIconProps: js.UndefOr[IIconProps] = js.undefined
  var menuProps: js.UndefOr[IContextualMenuProps] = js.undefined
  var menuTriggerKeyCode: js.UndefOr[KeyCodes] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAnimationEnd: js.UndefOr[
    AnimationEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onAnimationIteration: js.UndefOr[
    AnimationEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onAnimationStart: js.UndefOr[
    AnimationEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onAuxClick: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onBeforeInput: js.UndefOr[
    FormEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onBlur: js.UndefOr[
    FocusEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onCanPlay: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onCanPlayThrough: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    FormEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onCompositionEnd: js.UndefOr[
    CompositionEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onCompositionStart: js.UndefOr[
    CompositionEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onCompositionUpdate: js.UndefOr[
    CompositionEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onCopy: js.UndefOr[
    ClipboardEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onCut: js.UndefOr[
    ClipboardEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDrag: js.UndefOr[
    DragEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDragEnd: js.UndefOr[
    DragEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDragEnter: js.UndefOr[
    DragEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDragExit: js.UndefOr[
    DragEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDragLeave: js.UndefOr[
    DragEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDragOver: js.UndefOr[
    DragEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDragStart: js.UndefOr[
    DragEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDrop: js.UndefOr[
    DragEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onDurationChange: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onEmptied: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onEncrypted: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onEnded: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onError: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    FocusEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onInput: js.UndefOr[
    FormEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onInvalid: js.UndefOr[
    FormEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onKeyDown: js.UndefOr[
    KeyboardEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onKeyPress: js.UndefOr[
    KeyboardEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    KeyboardEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onLoad: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onLoadStart: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onLoadedData: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onLoadedMetadata: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onMenuClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], 
      /* button */ js.UndefOr[IButtonProps], 
      Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onMouseOut: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onMouseOver: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    MouseEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPaste: js.UndefOr[
    ClipboardEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPause: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPlay: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPlaying: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPointerCancel: js.UndefOr[
    PointerEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPointerDown: js.UndefOr[
    PointerEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPointerEnter: js.UndefOr[
    PointerEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPointerLeave: js.UndefOr[
    PointerEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPointerMove: js.UndefOr[
    PointerEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPointerOut: js.UndefOr[
    PointerEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPointerOver: js.UndefOr[
    PointerEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onPointerUp: js.UndefOr[
    PointerEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onProgress: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onRateChange: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onRenderAriaDescription: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  var onRenderChildren: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  var onRenderDescription: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  var onRenderIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  var onRenderMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.undefined
  var onRenderMenuIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  var onRenderText: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  var onReset: js.UndefOr[
    FormEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onScroll: js.UndefOr[
    UIEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onSeeked: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onSeeking: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onStalled: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onSubmit: js.UndefOr[
    FormEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onSuspend: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onTimeUpdate: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onTouchCancel: js.UndefOr[
    TouchEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onTouchEnd: js.UndefOr[
    TouchEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onTouchMove: js.UndefOr[
    TouchEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onTouchStart: js.UndefOr[
    TouchEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onTransitionEnd: js.UndefOr[
    TransitionEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onVolumeChange: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onWaiting: js.UndefOr[
    ReactEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var onWheel: js.UndefOr[
    WheelEventHandler[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | BaseButton | Button | HTMLSpanElement
    ]
  ] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var optimum: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var persistMenu: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var primaryActionButtonProps: js.UndefOr[IButtonProps] = js.undefined
  var primaryDisabled: js.UndefOr[Boolean] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var renderPersistedMenuHiddenOnMount: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rootProps: js.UndefOr[
    ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var sandbox: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
  var seamless: js.UndefOr[Boolean] = js.undefined
  var secondaryText: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var split: js.UndefOr[Boolean] = js.undefined
  var splitButtonAriaLabel: js.UndefOr[String] = js.undefined
  var splitButtonMenuProps: js.UndefOr[IButtonProps] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcDoc: js.UndefOr[String] = js.undefined
  var srcLang: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var styles: js.UndefOr[IButtonStyles] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[Boolean] = js.undefined
  var toggled: js.UndefOr[Boolean] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var uniqueId: js.UndefOr[String | Double] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var variantClassName: js.UndefOr[String] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wmode: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[String] = js.undefined
}

