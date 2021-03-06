package typingsJapgolly.officeUiFabricReact.comboBoxTypesMod

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
import typingsJapgolly.officeUiFabricReact.PartialIButtonStyles
import typingsJapgolly.officeUiFabricReact.PartialIComboBoxOptionSty
import typingsJapgolly.officeUiFabricReact.PartialIComboBoxStyles
import typingsJapgolly.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.comboBoxClassNamesMod.IComboBoxClassNames
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.off
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.on
import typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps
import typingsJapgolly.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
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
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxProps extends ISelectableDroppableTextProps[IComboBox, IComboBox] {
  /**
    * Whether the ComboBox is free form, meaning that the user input is not bound to provided options. Defaults to false.
    */
  var allowFreeform: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional prop to add a string id that can be referenced inside the aria-describedby attribute
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Whether the ComboBox auto completes. As the user is inputing text, it will be suggested potential matches from the list of options. If
    * the combo box is expanded, this will also scroll to the suggested option, and give it a selected style.
    *
    * @defaultvalue "on"
    */
  var autoComplete: js.UndefOr[on | off] = js.undefined
  /**
    * The AutofillProps to be passed into the Autofill component inside combobox
    */
  var autofill: js.UndefOr[IAutofillProps] = js.undefined
  /**
    * The IconProps to use for the button aspect of the combobox
    */
  var buttonIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Styles for the caret down button.
    */
  var caretDownButtonStyles: js.UndefOr[PartialIButtonStyles] = js.undefined
  /**
    * Default styles that should be applied to ComboBox options,
    * in case an option does not come with user-defined custom styles
    */
  var comboBoxOptionStyles: js.UndefOr[PartialIComboBoxOptionSty] = js.undefined
  /**
    * Custom max width for dropdown
    */
  var dropdownMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Custom width for dropdown (unless useComboBoxAsMenuWidth is undefined or false)
    */
  var dropdownWidth: js.UndefOr[Double] = js.undefined
  /**
    * Custom function for providing the classNames for the ComboBox. Can be used to provide
    * all styles for the component instead of applying them on top of the default styles.
    */
  var getClassNames: js.UndefOr[
    js.Function8[
      /* theme */ ITheme, 
      /* isOpen */ Boolean, 
      /* disabled */ Boolean, 
      /* required */ Boolean, 
      /* focused */ Boolean, 
      /* allowFreeForm */ Boolean, 
      /* hasErrorMessage */ Boolean, 
      /* className */ js.UndefOr[String], 
      IComboBoxClassNames
    ]
  ] = js.undefined
  /**
    * Optional iconButton props on combo box
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Sets the 'aria-hidden' attribute on the ComboBox's button element instructing screen readers how to handle the element.
    * This element is hidden by default because all functionality is handled by the input element and the arrow button is
    * only meant to be decorative.
    * @defaultvalue true
    */
  var isButtonAriaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional keytip for this combo box
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Callback issued when either:
    * 1) the selected option changes
    * 2) a manually edited value is submitted. In this case there may not be a matched option if allowFreeform is also true
    *    (and hence only value would be true, the other parameter would be null in this case)
    */
  @JSName("onChange")
  var onChange_IComboBoxProps: js.UndefOr[
    js.Function4[
      /* event */ ReactEventFrom[IComboBox with Element], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      /* value */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback issued when a ComboBox item is clicked.
    */
  var onItemClick: js.UndefOr[
    js.Function3[
      /* event */ ReactEventFrom[IComboBox with Element], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * Function that gets invoked before the menu gets dismissed
    */
  var onMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function that gets invoked when the ComboBox menu is dismissed
    */
  var onMenuDismissed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function that gets invoked when the ComboBox menu is launched
    */
  var onMenuOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback issued when the user changes the pending value in ComboBox
    */
  var onPendingValueChanged: js.UndefOr[
    js.Function3[
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      /* value */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /**
    * Custom render function for the label text.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[IOnRenderComboBoxLabelProps]] = js.undefined
  /**
    * Add additional content below the callout list.
    */
  var onRenderLowerContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.undefined
  /**
    * Add additional content above the callout list.
    */
  var onRenderUpperContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.undefined
  /**
    * Callback issued when the options should be resolved, if they have been updated or
    * if they need to be passed in the first time
    */
  var onResolveOptions: js.UndefOr[
    js.Function1[
      /* options */ js.Array[IComboBoxOption], 
      js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
    ]
  ] = js.undefined
  /**
    * Callback issued when the ComboBox requests the list to scroll to a specific element
    */
  var onScrollToItem: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.undefined
  /**
    * Collection of options for this ComboBox
    */
  @JSName("options")
  var options_IComboBoxProps: js.Array[IComboBoxOption]
  /**
    * Menu will not be created or destroyed when opened or closed, instead it
    * will be hidden. This will improve perf of the menu opening but could potentially
    * impact overall perf by having more elements in the dom. Should only be used
    * when perf is important.
    * Note: This may increase the amount of time it takes for the comboBox itself to mount.
    */
  var persistMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * When options are scrollable the selected option is positioned at the top of the callout when it is opened
    * (unless it has reached the end of the scrollbar).
    * @defaultvalue false;
    */
  var scrollSelectedToTop: js.UndefOr[Boolean] = js.undefined
  /**
    * When specified, determines whether the callout (the menu which drops down) should
    * restore the focus after being dismissed or not.  If false, then the menu will not try
    * to set focus to whichever element had focus before the menu was opened.
    * @defaultvalue true;
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[PartialIComboBoxStyles] = js.undefined
  /**
    * Value to show in the input, does not have to map to a combobox option
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use the ComboBoxes width as the menu's width
    */
  var useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.undefined
}

object IComboBoxProps {
  @scala.inline
  def apply(
    options: js.Array[IComboBoxOption],
    about: String = null,
    accessKey: String = null,
    allowFreeform: js.UndefOr[Boolean] = js.undefined,
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
    `aria-live`: typingsJapgolly.react.reactStrings.off | assertive | polite = null,
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
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    autoCapitalize: String = null,
    autoComplete: on | off = null,
    autoCorrect: String = null,
    autoSave: String = null,
    autofill: IAutofillProps = null,
    buttonIconProps: IIconProps = null,
    calloutProps: ICalloutProps = null,
    caretDownButtonStyles: PartialIButtonStyles = null,
    children: VdomNode = null,
    className: String = null,
    color: String = null,
    comboBoxOptionStyles: PartialIComboBoxOptionSty = null,
    componentRef: IRefObject[IComboBox] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultSelectedKey: String | Double | (js.Array[Double | String]) = null,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    dropdownMaxWidth: Int | Double = null,
    dropdownWidth: Int | Double = null,
    errorMessage: String = null,
    getClassNames: (/* theme */ ITheme, /* isOpen */ Boolean, /* disabled */ Boolean, /* required */ Boolean, /* focused */ Boolean, /* allowFreeForm */ Boolean, /* hasErrorMessage */ Boolean, /* className */ js.UndefOr[String]) => CallbackTo[IComboBoxClassNames] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    iconButtonProps: IButtonProps = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isButtonAriaHidden: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    keytipProps: IKeytipProps = null,
    label: String = null,
    lang: String = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    onAbort: ReactEventFrom[IComboBox with Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[IComboBox with Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[IComboBox with Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[IComboBox with Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onBeforeInput: ReactEventFrom[IComboBox with Element] => Callback = null,
    onBlur: ReactFocusEventFrom[IComboBox with Element] => Callback = null,
    onCanPlay: ReactEventFrom[IComboBox with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[IComboBox with Element] => Callback = null,
    onChange: (/* event */ ReactEventFrom[IComboBox with Element], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Callback = null,
    onClick: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[IComboBox with Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[IComboBox with Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[IComboBox with Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[IComboBox with Element] => Callback = null,
    onCut: ReactClipboardEventFrom[IComboBox with Element] => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onDoubleClick: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onDrag: ReactDragEventFrom[IComboBox with Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[IComboBox with Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[IComboBox with Element] => Callback = null,
    onDragExit: ReactDragEventFrom[IComboBox with Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[IComboBox with Element] => Callback = null,
    onDragOver: ReactDragEventFrom[IComboBox with Element] => Callback = null,
    onDragStart: ReactDragEventFrom[IComboBox with Element] => Callback = null,
    onDrop: ReactDragEventFrom[IComboBox with Element] => Callback = null,
    onDurationChange: ReactEventFrom[IComboBox with Element] => Callback = null,
    onEmptied: ReactEventFrom[IComboBox with Element] => Callback = null,
    onEncrypted: ReactEventFrom[IComboBox with Element] => Callback = null,
    onEnded: ReactEventFrom[IComboBox with Element] => Callback = null,
    onError: ReactEventFrom[IComboBox with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[IComboBox with Element] => Callback = null,
    onInput: ReactEventFrom[IComboBox with Element] => Callback = null,
    onInvalid: ReactEventFrom[IComboBox with Element] => Callback = null,
    onItemClick: (/* event */ ReactEventFrom[IComboBox with Element], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double]) => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[IComboBox with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[IComboBox with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[IComboBox with Element] => Callback = null,
    onLoad: ReactEventFrom[IComboBox with Element] => Callback = null,
    onLoadStart: ReactEventFrom[IComboBox with Element] => Callback = null,
    onLoadedData: ReactEventFrom[IComboBox with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[IComboBox with Element] => Callback = null,
    onMenuDismiss: js.UndefOr[Callback] = js.undefined,
    onMenuDismissed: js.UndefOr[Callback] = js.undefined,
    onMenuOpen: js.UndefOr[Callback] = js.undefined,
    onMouseDown: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[IComboBox with Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[IComboBox with Element] => Callback = null,
    onPause: ReactEventFrom[IComboBox with Element] => Callback = null,
    onPendingValueChanged: (/* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Callback = null,
    onPlay: ReactEventFrom[IComboBox with Element] => Callback = null,
    onPlaying: ReactEventFrom[IComboBox with Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[IComboBox with Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[IComboBox with Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[IComboBox with Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[IComboBox with Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[IComboBox with Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[IComboBox with Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[IComboBox with Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[IComboBox with Element] => Callback = null,
    onProgress: ReactEventFrom[IComboBox with Element] => Callback = null,
    onRateChange: ReactEventFrom[IComboBox with Element] => Callback = null,
    onRenderContainer: (/* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderItem: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableOption], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderLabel: (/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IOnRenderComboBoxLabelProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderList: (/* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderLowerContent: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IComboBoxProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderOption: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableOption], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderUpperContent: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IComboBoxProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onReset: ReactEventFrom[IComboBox with Element] => Callback = null,
    onResolveOptions: /* options */ js.Array[IComboBoxOption] => CallbackTo[js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]] = null,
    onScroll: ReactUIEventFrom[IComboBox with Element] => Callback = null,
    onScrollToItem: /* itemIndex */ Double => Callback = null,
    onSeeked: ReactEventFrom[IComboBox with Element] => Callback = null,
    onSeeking: ReactEventFrom[IComboBox with Element] => Callback = null,
    onSelect: ReactEventFrom[IComboBox with Element] => Callback = null,
    onStalled: ReactEventFrom[IComboBox with Element] => Callback = null,
    onSubmit: ReactEventFrom[IComboBox with Element] => Callback = null,
    onSuspend: ReactEventFrom[IComboBox with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[IComboBox with Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[IComboBox with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[IComboBox with Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[IComboBox with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[IComboBox with Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[IComboBox with Element] => Callback = null,
    onVolumeChange: ReactEventFrom[IComboBox with Element] => Callback = null,
    onWaiting: ReactEventFrom[IComboBox with Element] => Callback = null,
    onWheel: ReactWheelEventFrom[IComboBox with Element] => Callback = null,
    openOnKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    panelProps: IPanelProps = null,
    persistMenu: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    scrollSelectedToTop: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    selectedKey: String | Double | (js.Array[Double | String]) = null,
    shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: PartialIComboBoxStyles = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    text: String = null,
    theme: ITheme = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: typingsJapgolly.react.reactStrings.on | typingsJapgolly.react.reactStrings.off = null,
    useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null
  ): IComboBoxProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFreeform)) __obj.updateDynamic("allowFreeform")(allowFreeform.asInstanceOf[js.Any])
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
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (autofill != null) __obj.updateDynamic("autofill")(autofill.asInstanceOf[js.Any])
    if (buttonIconProps != null) __obj.updateDynamic("buttonIconProps")(buttonIconProps.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (caretDownButtonStyles != null) __obj.updateDynamic("caretDownButtonStyles")(caretDownButtonStyles.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (comboBoxOptionStyles != null) __obj.updateDynamic("comboBoxOptionStyles")(comboBoxOptionStyles.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultSelectedKey != null) __obj.updateDynamic("defaultSelectedKey")(defaultSelectedKey.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dropdownMaxWidth != null) __obj.updateDynamic("dropdownMaxWidth")(dropdownMaxWidth.asInstanceOf[js.Any])
    if (dropdownWidth != null) __obj.updateDynamic("dropdownWidth")(dropdownWidth.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction8((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme, t1: /* isOpen */ scala.Boolean, t2: /* disabled */ scala.Boolean, t3: /* required */ scala.Boolean, t4: /* focused */ scala.Boolean, t5: /* allowFreeForm */ scala.Boolean, t6: /* hasErrorMessage */ scala.Boolean, t7: /* className */ js.UndefOr[java.lang.String]) => getClassNames(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (iconButtonProps != null) __obj.updateDynamic("iconButtonProps")(iconButtonProps.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isButtonAriaHidden)) __obj.updateDynamic("isButtonAriaHidden")(isButtonAriaHidden.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element], t1: /* option */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption], t2: /* index */ js.UndefOr[scala.Double], t3: /* value */ js.UndefOr[java.lang.String]) => onChange(t0, t1, t2, t3).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onCut(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction3((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element], t1: /* option */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption], t2: /* index */ js.UndefOr[scala.Double]) => onItemClick(t0, t1, t2).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    onMenuDismiss.foreach(p => __obj.updateDynamic("onMenuDismiss")(p.toJsFn))
    onMenuDismissed.foreach(p => __obj.updateDynamic("onMenuDismissed")(p.toJsFn))
    onMenuOpen.foreach(p => __obj.updateDynamic("onMenuOpen")(p.toJsFn))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPendingValueChanged != null) __obj.updateDynamic("onPendingValueChanged")(js.Any.fromFunction3((t0: /* option */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption], t1: /* index */ js.UndefOr[scala.Double], t2: /* value */ js.UndefOr[java.lang.String]) => onPendingValueChanged(t0, t1, t2).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onRenderContainer != null) __obj.updateDynamic("onRenderContainer")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps[
    typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox, 
    typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox
  ]], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps[
        typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox, 
        typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox
      ]
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderContainer(t0, t1).runNow()))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderItem(t0, t1).runNow()))
    if (onRenderLabel != null) __obj.updateDynamic("onRenderLabel")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IOnRenderComboBoxLabelProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IOnRenderComboBoxLabelProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderLabel(t0, t1).runNow()))
    if (onRenderList != null) __obj.updateDynamic("onRenderList")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps[
    typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox, 
    typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox
  ]], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps[
        typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox, 
        typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox
      ]
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderList(t0, t1).runNow()))
    if (onRenderLowerContent != null) __obj.updateDynamic("onRenderLowerContent")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderLowerContent(t0, t1).runNow()))
    if (onRenderOption != null) __obj.updateDynamic("onRenderOption")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderOption(t0, t1).runNow()))
    if (onRenderUpperContent != null) __obj.updateDynamic("onRenderUpperContent")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderUpperContent(t0, t1).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onResolveOptions != null) __obj.updateDynamic("onResolveOptions")(js.Any.fromFunction1((t0: /* options */ js.Array[typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption]) => onResolveOptions(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onScrollToItem != null) __obj.updateDynamic("onScrollToItem")(js.Any.fromFunction1((t0: /* itemIndex */ scala.Double) => onScrollToItem(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[
  typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox with org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (!js.isUndefined(openOnKeyboardFocus)) __obj.updateDynamic("openOnKeyboardFocus")(openOnKeyboardFocus.asInstanceOf[js.Any])
    if (panelProps != null) __obj.updateDynamic("panelProps")(panelProps.asInstanceOf[js.Any])
    if (!js.isUndefined(persistMenu)) __obj.updateDynamic("persistMenu")(persistMenu.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSelectedToTop)) __obj.updateDynamic("scrollSelectedToTop")(scrollSelectedToTop.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRestoreFocus)) __obj.updateDynamic("shouldRestoreFocus")(shouldRestoreFocus.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(useComboBoxAsMenuWidth)) __obj.updateDynamic("useComboBoxAsMenuWidth")(useComboBoxAsMenuWidth.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxProps]
  }
}

