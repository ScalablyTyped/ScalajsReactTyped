package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.atMaterialDashUiCore.Anon_Dense
import typingsJapgolly.atMaterialDashUiCore.PartialClassNameMapNativeSelectClassKey
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`additions text`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`inline`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.additions
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.all
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ascending
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.assertive
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.both
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.copy
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.date
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.decimal
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dense
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.descending
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dialog
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.email
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.execute
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grammar
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grid
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.horizontal
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.link
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.list
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.listbox
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.location
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.menu
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mixed
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.move
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.no
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.numeric
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.off
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.on
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.other
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.page
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.polite
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.popup
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.removals
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.search
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.spelling
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.step
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tel
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.text
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.time
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tree
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.url
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.vertical
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.yes
import typingsJapgolly.atMaterialDashUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typingsJapgolly.atMaterialDashUiCore.nativeSelectMod.default
import typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectMod.NativeSelectProps
import typingsJapgolly.react.Anon_Html
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeSelect {
  def apply(
    IconComponent: ReactType[_] = null,
    about: String = null,
    accessKey: String = null,
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
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    className: String = null,
    classes: PartialClassNameMapNativeSelectClassKey = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: (js.Array[String | Double | Boolean | js.Object]) | String | Double | Boolean | js.Object = null,
    dir: String = null,
    disableUnderline: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    endAdornment: VdomNode = null,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    innerRef: Ref | RefHandle[_] = null,
    input: VdomNode = null,
    inputComponent: ReactType[InputBaseComponentProps] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    inputProps: InputBaseComponentProps = null,
    inputRef: Ref | RefHandle[_] = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    margin: dense | none = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onAbort: ReactEventFrom[HTMLDivElement] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[HTMLDivElement] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[HTMLDivElement] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[HTMLDivElement] => Callback = null,
    onAuxClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLDivElement] => Callback = null,
    onBlur: ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onCanPlay: ReactEventFrom[HTMLDivElement] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLDivElement] => Callback = null,
    onChange: (/* event */ ReactEventFrom[HTMLSelectElement], /* child */ Node) => Callback = null,
    onClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[HTMLDivElement] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[HTMLDivElement] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[HTMLDivElement] => Callback = null,
    onContextMenu: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onCopy: ReactClipboardEventFrom[HTMLDivElement] => Callback = null,
    onCut: ReactClipboardEventFrom[HTMLDivElement] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onDrag: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragEnd: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragEnter: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragExit: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragLeave: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragOver: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragStart: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDrop: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDurationChange: ReactEventFrom[HTMLDivElement] => Callback = null,
    onEmptied: ReactEventFrom[HTMLDivElement] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLDivElement] => Callback = null,
    onEnded: ReactEventFrom[HTMLDivElement] => Callback = null,
    onError: ReactEventFrom[HTMLDivElement] => Callback = null,
    onFilled: js.UndefOr[Callback] = js.undefined,
    onFocus: ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onInput: ReactEventFrom[HTMLDivElement] => Callback = null,
    onInvalid: ReactEventFrom[HTMLDivElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[(HTMLTextAreaElement | HTMLInputElement) with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLDivElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[(HTMLTextAreaElement | HTMLInputElement) with Element] => Callback = null,
    onLoad: ReactEventFrom[HTMLDivElement] => Callback = null,
    onLoadStart: ReactEventFrom[HTMLDivElement] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLDivElement] => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLDivElement] => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseMove: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseOut: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseOver: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseUp: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onPaste: ReactClipboardEventFrom[HTMLDivElement] => Callback = null,
    onPause: ReactEventFrom[HTMLDivElement] => Callback = null,
    onPlay: ReactEventFrom[HTMLDivElement] => Callback = null,
    onPlaying: ReactEventFrom[HTMLDivElement] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerDown: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerMove: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerOut: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerOver: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerUp: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onProgress: ReactEventFrom[HTMLDivElement] => Callback = null,
    onRateChange: ReactEventFrom[HTMLDivElement] => Callback = null,
    onReset: ReactEventFrom[HTMLDivElement] => Callback = null,
    onScroll: ReactUIEventFrom[HTMLDivElement] => Callback = null,
    onSeeked: ReactEventFrom[HTMLDivElement] => Callback = null,
    onSeeking: ReactEventFrom[HTMLDivElement] => Callback = null,
    onSelect: ReactEventFrom[HTMLDivElement] => Callback = null,
    onStalled: ReactEventFrom[HTMLDivElement] => Callback = null,
    onSubmit: ReactEventFrom[HTMLDivElement] => Callback = null,
    onSuspend: ReactEventFrom[HTMLDivElement] => Callback = null,
    onTimeUpdate: ReactEventFrom[HTMLDivElement] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[HTMLDivElement] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[HTMLDivElement] => Callback = null,
    onTouchMove: ReactTouchEventFrom[HTMLDivElement] => Callback = null,
    onTouchStart: ReactTouchEventFrom[HTMLDivElement] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[HTMLDivElement] => Callback = null,
    onVolumeChange: ReactEventFrom[HTMLDivElement] => Callback = null,
    onWaiting: ReactEventFrom[HTMLDivElement] => Callback = null,
    onWheel: ReactWheelEventFrom[HTMLDivElement] => Callback = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderPrefix: /* state */ Anon_Dense => CallbackTo[Node] = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rows: String | Double = null,
    rowsMax: String | Double = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    startAdornment: VdomNode = null,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: (js.Array[String | Double | Boolean]) | String | Double | Boolean = null,
    variant: standard | outlined | filled = null,
    vocab: String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NativeSelectProps, default, Unit, NativeSelectProps] = {
    val __obj = js.Dynamic.literal()
  
      if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
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
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disableUnderline)) __obj.updateDynamic("disableUnderline")(disableUnderline.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (endAdornment != null) __obj.updateDynamic("endAdornment")(endAdornment.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.rawNode.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLSelectElement], t1: /* child */ japgolly.scalajs.react.raw.React.Node) => onChange(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onError(t0).runNow()))
    onFilled.foreach(p => __obj.updateDynamic("onFilled")(p.toJsFn))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  (org.scalajs.dom.raw.HTMLTextAreaElement | org.scalajs.dom.raw.HTMLInputElement) with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  (org.scalajs.dom.raw.HTMLTextAreaElement | org.scalajs.dom.raw.HTMLInputElement) with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onWheel(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (renderPrefix != null) __obj.updateDynamic("renderPrefix")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.atMaterialDashUiCore.Anon_Dense) => renderPrefix(t0).runNow()))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (startAdornment != null) __obj.updateDynamic("startAdornment")(startAdornment.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectMod.NativeSelectProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.nativeSelectMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectMod.NativeSelectProps])(children: _*)
  }
  @JSImport("@material-ui/core/NativeSelect", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

