package typingsJapgolly.rebassForms.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
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
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLLabelElement
import typingsJapgolly.csstype.mod.AlignItemsProperty
import typingsJapgolly.csstype.mod.AlignSelfProperty
import typingsJapgolly.csstype.mod.DisplayProperty
import typingsJapgolly.csstype.mod.FlexDirectionProperty
import typingsJapgolly.csstype.mod.FlexProperty
import typingsJapgolly.csstype.mod.FlexWrapProperty
import typingsJapgolly.csstype.mod.GlobalsNumber
import typingsJapgolly.csstype.mod.HeightProperty
import typingsJapgolly.csstype.mod.JustifyContentProperty
import typingsJapgolly.csstype.mod.MaxHeightProperty
import typingsJapgolly.csstype.mod.MaxWidthProperty
import typingsJapgolly.csstype.mod.MinHeightProperty
import typingsJapgolly.csstype.mod.MinWidthProperty
import typingsJapgolly.csstype.mod.OverflowProperty
import typingsJapgolly.csstype.mod.OverflowXProperty
import typingsJapgolly.csstype.mod.OverflowYProperty
import typingsJapgolly.csstype.mod.VerticalAlignProperty
import typingsJapgolly.csstype.mod.WidthProperty
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rebass.mod.SxStyleProp
import typingsJapgolly.rebassForms.mod.LabelProps
import typingsJapgolly.rebassForms.rebassFormsStrings.`additions text`
import typingsJapgolly.rebassForms.rebassFormsStrings.`inline`
import typingsJapgolly.rebassForms.rebassFormsStrings.additions
import typingsJapgolly.rebassForms.rebassFormsStrings.all
import typingsJapgolly.rebassForms.rebassFormsStrings.ascending
import typingsJapgolly.rebassForms.rebassFormsStrings.assertive
import typingsJapgolly.rebassForms.rebassFormsStrings.both
import typingsJapgolly.rebassForms.rebassFormsStrings.colors
import typingsJapgolly.rebassForms.rebassFormsStrings.copy
import typingsJapgolly.rebassForms.rebassFormsStrings.date
import typingsJapgolly.rebassForms.rebassFormsStrings.decimal
import typingsJapgolly.rebassForms.rebassFormsStrings.descending
import typingsJapgolly.rebassForms.rebassFormsStrings.dialog
import typingsJapgolly.rebassForms.rebassFormsStrings.email
import typingsJapgolly.rebassForms.rebassFormsStrings.execute
import typingsJapgolly.rebassForms.rebassFormsStrings.fontSizes
import typingsJapgolly.rebassForms.rebassFormsStrings.grammar
import typingsJapgolly.rebassForms.rebassFormsStrings.grid
import typingsJapgolly.rebassForms.rebassFormsStrings.horizontal
import typingsJapgolly.rebassForms.rebassFormsStrings.inherit
import typingsJapgolly.rebassForms.rebassFormsStrings.link
import typingsJapgolly.rebassForms.rebassFormsStrings.list
import typingsJapgolly.rebassForms.rebassFormsStrings.listbox
import typingsJapgolly.rebassForms.rebassFormsStrings.location
import typingsJapgolly.rebassForms.rebassFormsStrings.menu
import typingsJapgolly.rebassForms.rebassFormsStrings.mixed
import typingsJapgolly.rebassForms.rebassFormsStrings.move
import typingsJapgolly.rebassForms.rebassFormsStrings.no
import typingsJapgolly.rebassForms.rebassFormsStrings.none
import typingsJapgolly.rebassForms.rebassFormsStrings.numeric
import typingsJapgolly.rebassForms.rebassFormsStrings.off
import typingsJapgolly.rebassForms.rebassFormsStrings.on
import typingsJapgolly.rebassForms.rebassFormsStrings.other
import typingsJapgolly.rebassForms.rebassFormsStrings.page
import typingsJapgolly.rebassForms.rebassFormsStrings.polite
import typingsJapgolly.rebassForms.rebassFormsStrings.popup
import typingsJapgolly.rebassForms.rebassFormsStrings.removals
import typingsJapgolly.rebassForms.rebassFormsStrings.search
import typingsJapgolly.rebassForms.rebassFormsStrings.space
import typingsJapgolly.rebassForms.rebassFormsStrings.spelling
import typingsJapgolly.rebassForms.rebassFormsStrings.step
import typingsJapgolly.rebassForms.rebassFormsStrings.tel
import typingsJapgolly.rebassForms.rebassFormsStrings.text
import typingsJapgolly.rebassForms.rebassFormsStrings.time
import typingsJapgolly.rebassForms.rebassFormsStrings.tree
import typingsJapgolly.rebassForms.rebassFormsStrings.url
import typingsJapgolly.rebassForms.rebassFormsStrings.vertical
import typingsJapgolly.rebassForms.rebassFormsStrings.yes
import typingsJapgolly.styledComponents.styledComponentsMod.CSSObject
import typingsJapgolly.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typingsJapgolly.styledSystem.mod.RequiredTheme
import typingsJapgolly.styledSystem.mod.ResponsiveValue
import typingsJapgolly.styledSystem.mod.TLengthStyledSystem
import typingsJapgolly.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label {
  def apply(
    about: String = null,
    accessKey: String = null,
    alignItems: ResponsiveValue[AlignItemsProperty, RequiredTheme] = null,
    alignSelf: ResponsiveValue[AlignSelfProperty, RequiredTheme] = null,
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
    as: ElementType = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    backgroundColor: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme] = null,
    bg: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme] = null,
    className: String = null,
    color: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    display: ResponsiveValue[DisplayProperty, RequiredTheme] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    flex: ResponsiveValue[FlexProperty[TLengthStyledSystem], RequiredTheme] = null,
    flexDirection: ResponsiveValue[FlexDirectionProperty, RequiredTheme] = null,
    flexWrap: ResponsiveValue[FlexWrapProperty, RequiredTheme] = null,
    fontSize: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme] = null,
    form: String = null,
    height: ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    htmlFor: String = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    justifyContent: ResponsiveValue[JustifyContentProperty, RequiredTheme] = null,
    lang: String = null,
    m: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    margin: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginRight: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginTop: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginX: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginY: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    maxHeight: ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    maxWidth: ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], RequiredTheme] = null,
    mb: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    minHeight: ResponsiveValue[MinHeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    minWidth: ResponsiveValue[MinWidthProperty[TLengthStyledSystem], RequiredTheme] = null,
    ml: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    mr: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    mt: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    mx: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    my: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    onAbort: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[HTMLLabelElement] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[HTMLLabelElement] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[HTMLLabelElement] => Callback = null,
    onAuxClick: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onBlur: ReactFocusEventFrom[HTMLLabelElement] => Callback = null,
    onCanPlay: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onChange: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onClick: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[HTMLLabelElement] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[HTMLLabelElement] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[HTMLLabelElement] => Callback = null,
    onContextMenu: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onCopy: ReactClipboardEventFrom[HTMLLabelElement] => Callback = null,
    onCut: ReactClipboardEventFrom[HTMLLabelElement] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onDrag: ReactDragEventFrom[HTMLLabelElement] => Callback = null,
    onDragEnd: ReactDragEventFrom[HTMLLabelElement] => Callback = null,
    onDragEnter: ReactDragEventFrom[HTMLLabelElement] => Callback = null,
    onDragExit: ReactDragEventFrom[HTMLLabelElement] => Callback = null,
    onDragLeave: ReactDragEventFrom[HTMLLabelElement] => Callback = null,
    onDragOver: ReactDragEventFrom[HTMLLabelElement] => Callback = null,
    onDragStart: ReactDragEventFrom[HTMLLabelElement] => Callback = null,
    onDrop: ReactDragEventFrom[HTMLLabelElement] => Callback = null,
    onDurationChange: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onEmptied: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onEnded: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onError: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLLabelElement] => Callback = null,
    onInput: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onInvalid: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLLabelElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLLabelElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLLabelElement] => Callback = null,
    onLoad: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onLoadStart: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onMouseMove: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onMouseOut: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onMouseOver: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onMouseUp: ReactMouseEventFrom[HTMLLabelElement] => Callback = null,
    onPaste: ReactClipboardEventFrom[HTMLLabelElement] => Callback = null,
    onPause: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onPlay: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onPlaying: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[HTMLLabelElement] => Callback = null,
    onPointerDown: ReactPointerEventFrom[HTMLLabelElement] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[HTMLLabelElement] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[HTMLLabelElement] => Callback = null,
    onPointerMove: ReactPointerEventFrom[HTMLLabelElement] => Callback = null,
    onPointerOut: ReactPointerEventFrom[HTMLLabelElement] => Callback = null,
    onPointerOver: ReactPointerEventFrom[HTMLLabelElement] => Callback = null,
    onPointerUp: ReactPointerEventFrom[HTMLLabelElement] => Callback = null,
    onProgress: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onRateChange: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onReset: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onScroll: ReactUIEventFrom[HTMLLabelElement] => Callback = null,
    onSeeked: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onSeeking: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onSelect: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onStalled: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onSubmit: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onSuspend: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onTimeUpdate: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[HTMLLabelElement] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[HTMLLabelElement] => Callback = null,
    onTouchMove: ReactTouchEventFrom[HTMLLabelElement] => Callback = null,
    onTouchStart: ReactTouchEventFrom[HTMLLabelElement] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[HTMLLabelElement] => Callback = null,
    onVolumeChange: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onWaiting: ReactEventFrom[HTMLLabelElement] => Callback = null,
    onWheel: ReactWheelEventFrom[HTMLLabelElement] => Callback = null,
    opacity: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    order: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    overflow: ResponsiveValue[OverflowProperty, RequiredTheme] = null,
    overflowX: ResponsiveValue[OverflowXProperty, RequiredTheme] = null,
    overflowY: ResponsiveValue[OverflowYProperty, RequiredTheme] = null,
    p: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    padding: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    paddingBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    paddingLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    paddingRight: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    paddingTop: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    paddingX: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    paddingY: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    pb: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    pl: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    placeholder: String = null,
    pr: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    prefix: String = null,
    property: String = null,
    pt: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    px: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    py: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    size: ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    sx: SxStyleProp = null,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    tx: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    variant: ResponsiveValue[String, RequiredTheme] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem], RequiredTheme] = null,
    vocab: String = null,
    width: ResponsiveValue[WidthProperty[TLengthStyledSystem], RequiredTheme] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LabelProps, typingsJapgolly.rebassForms.mod.Label, Unit, LabelProps] = {
    val __obj = js.Dynamic.literal()
  
      if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
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
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLLabelElement]) => onWheel(t0).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (sx != null) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (tx != null) __obj.updateDynamic("tx")(tx.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rebassForms.mod.LabelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rebassForms.mod.Label](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rebassForms.mod.LabelProps])(children: _*)
  }
  @JSImport("@rebass/forms", "Label")
  @js.native
  object componentImport extends js.Object
  
}

