package typingsJapgolly.atMaterialDashUiCore.components

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
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGSVGElement
import typingsJapgolly.atMaterialDashUiCore.PartialClassNameMapSvgIconClassKey
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropTypes.Color
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`additions text`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`after-edge`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`before-edge`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`inline`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`text-after-edge`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`text-before-edge`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.action
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.additions
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.all
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.alphabetic
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ascending
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.assertive
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.auto
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.baseline
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.both
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.central
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.copy
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.date
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.default
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.descending
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dialog
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.disabled
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.error
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.evenodd
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.execute
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grammar
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grid
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.hanging
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.horizontal
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ideographic
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.inherit
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.initial
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.isolated
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.large
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.linearRGB
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.link
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.list
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.listbox
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.location
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mathematical
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.medial
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.menu
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.middle
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mixed
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.move
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.no
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.nonzero
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.off
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.other
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.page
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.polite
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.popup
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.removals
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.replace
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.sRGB
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.small
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.spelling
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.step
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.sum
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.terminal
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.text
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.time
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tree
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.vertical
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.yes
import typingsJapgolly.atMaterialDashUiCore.svgIconSvgIconMod.SvgIconProps
import typingsJapgolly.react.Anon_Html
import typingsJapgolly.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SvgIcon {
  def apply(
    accentHeight: Double | String = null,
    accumulate: none | sum = null,
    additive: replace | sum = null,
    alignmentBaseline: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit = null,
    allowReorder: no | yes = null,
    alphabetic: Double | String = null,
    amplitude: Double | String = null,
    arabicForm: initial | medial | terminal | isolated = null,
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
    ascent: Double | String = null,
    attributeName: String = null,
    attributeType: String = null,
    autoReverse: Double | String = null,
    azimuth: Double | String = null,
    baseFrequency: Double | String = null,
    baseProfile: Double | String = null,
    baselineShift: Double | String = null,
    bbox: Double | String = null,
    begin: Double | String = null,
    bias: Double | String = null,
    by: Double | String = null,
    calcMode: Double | String = null,
    capHeight: Double | String = null,
    className: String = null,
    classes: PartialClassNameMapSvgIconClassKey = null,
    clip: Double | String = null,
    clipPath: String = null,
    clipPathUnits: Double | String = null,
    clipRule: Double | String = null,
    color: Color | action | disabled | error = null,
    colorInterpolation: Double | String = null,
    colorInterpolationFilters: auto | sRGB | linearRGB | inherit = null,
    colorProfile: Double | String = null,
    colorRendering: Double | String = null,
    component: ReactType[SvgIconProps] = null,
    contentScriptType: Double | String = null,
    contentStyleType: Double | String = null,
    cursor: Double | String = null,
    cx: Double | String = null,
    cy: Double | String = null,
    d: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    decelerate: Double | String = null,
    descent: Double | String = null,
    diffuseConstant: Double | String = null,
    direction: Double | String = null,
    display: Double | String = null,
    divisor: Double | String = null,
    dominantBaseline: Double | String = null,
    dur: Double | String = null,
    dx: Double | String = null,
    dy: Double | String = null,
    edgeMode: Double | String = null,
    elevation: Double | String = null,
    enableBackground: Double | String = null,
    end: Double | String = null,
    exponent: Double | String = null,
    externalResourcesRequired: Double | String = null,
    fill: String = null,
    fillOpacity: Double | String = null,
    fillRule: nonzero | evenodd | inherit = null,
    filter: String = null,
    filterRes: Double | String = null,
    filterUnits: Double | String = null,
    floodColor: Double | String = null,
    floodOpacity: Double | String = null,
    focusable: Double | String = null,
    fontFamily: String = null,
    fontSize: inherit | default | small | large = null,
    fontSizeAdjust: Double | String = null,
    fontStretch: Double | String = null,
    fontStyle: Double | String = null,
    fontVariant: Double | String = null,
    fontWeight: Double | String = null,
    format: Double | String = null,
    from: Double | String = null,
    fx: Double | String = null,
    fy: Double | String = null,
    g1: Double | String = null,
    g2: Double | String = null,
    glyphName: Double | String = null,
    glyphOrientationHorizontal: Double | String = null,
    glyphOrientationVertical: Double | String = null,
    glyphRef: Double | String = null,
    gradientTransform: String = null,
    gradientUnits: String = null,
    hanging: Double | String = null,
    height: Double | String = null,
    horizAdvX: Double | String = null,
    horizOriginX: Double | String = null,
    href: String = null,
    id: String = null,
    ideographic: Double | String = null,
    imageRendering: Double | String = null,
    in: String = null,
    in2: Double | String = null,
    innerRef: Ref | RefHandle[_] = null,
    intercept: Double | String = null,
    k: Double | String = null,
    k1: Double | String = null,
    k2: Double | String = null,
    k3: Double | String = null,
    k4: Double | String = null,
    kernelMatrix: Double | String = null,
    kernelUnitLength: Double | String = null,
    kerning: Double | String = null,
    keyPoints: Double | String = null,
    keySplines: Double | String = null,
    keyTimes: Double | String = null,
    lang: String = null,
    lengthAdjust: Double | String = null,
    letterSpacing: Double | String = null,
    lightingColor: Double | String = null,
    limitingConeAngle: Double | String = null,
    local: Double | String = null,
    markerEnd: String = null,
    markerHeight: Double | String = null,
    markerMid: String = null,
    markerStart: String = null,
    markerUnits: Double | String = null,
    markerWidth: Double | String = null,
    mask: String = null,
    maskContentUnits: Double | String = null,
    maskUnits: Double | String = null,
    mathematical: Double | String = null,
    max: Double | String = null,
    media: String = null,
    method: String = null,
    min: Double | String = null,
    mode: Double | String = null,
    name: String = null,
    nativeColor: String = null,
    numOctaves: Double | String = null,
    offset: Double | String = null,
    onAbort: ReactEventFrom[SVGSVGElement] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[SVGSVGElement] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[SVGSVGElement] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[SVGSVGElement] => Callback = null,
    onAuxClick: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onBeforeInput: ReactEventFrom[SVGSVGElement] => Callback = null,
    onBlur: ReactFocusEventFrom[SVGSVGElement] => Callback = null,
    onCanPlay: ReactEventFrom[SVGSVGElement] => Callback = null,
    onCanPlayThrough: ReactEventFrom[SVGSVGElement] => Callback = null,
    onChange: ReactEventFrom[SVGSVGElement] => Callback = null,
    onClick: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[SVGSVGElement] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[SVGSVGElement] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[SVGSVGElement] => Callback = null,
    onContextMenu: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onCopy: ReactClipboardEventFrom[SVGSVGElement] => Callback = null,
    onCut: ReactClipboardEventFrom[SVGSVGElement] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onDrag: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragEnd: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragEnter: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragExit: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragLeave: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragOver: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDragStart: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDrop: ReactDragEventFrom[SVGSVGElement] => Callback = null,
    onDurationChange: ReactEventFrom[SVGSVGElement] => Callback = null,
    onEmptied: ReactEventFrom[SVGSVGElement] => Callback = null,
    onEncrypted: ReactEventFrom[SVGSVGElement] => Callback = null,
    onEnded: ReactEventFrom[SVGSVGElement] => Callback = null,
    onError: ReactEventFrom[SVGSVGElement] => Callback = null,
    onFocus: ReactFocusEventFrom[SVGSVGElement] => Callback = null,
    onInput: ReactEventFrom[SVGSVGElement] => Callback = null,
    onInvalid: ReactEventFrom[SVGSVGElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[SVGSVGElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[SVGSVGElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[SVGSVGElement] => Callback = null,
    onLoad: ReactEventFrom[SVGSVGElement] => Callback = null,
    onLoadStart: ReactEventFrom[SVGSVGElement] => Callback = null,
    onLoadedData: ReactEventFrom[SVGSVGElement] => Callback = null,
    onLoadedMetadata: ReactEventFrom[SVGSVGElement] => Callback = null,
    onMouseDown: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseMove: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseOut: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseOver: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onMouseUp: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    onPaste: ReactClipboardEventFrom[SVGSVGElement] => Callback = null,
    onPause: ReactEventFrom[SVGSVGElement] => Callback = null,
    onPlay: ReactEventFrom[SVGSVGElement] => Callback = null,
    onPlaying: ReactEventFrom[SVGSVGElement] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerDown: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerMove: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerOut: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerOver: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onPointerUp: ReactPointerEventFrom[SVGSVGElement] => Callback = null,
    onProgress: ReactEventFrom[SVGSVGElement] => Callback = null,
    onRateChange: ReactEventFrom[SVGSVGElement] => Callback = null,
    onReset: ReactEventFrom[SVGSVGElement] => Callback = null,
    onScroll: ReactUIEventFrom[SVGSVGElement] => Callback = null,
    onSeeked: ReactEventFrom[SVGSVGElement] => Callback = null,
    onSeeking: ReactEventFrom[SVGSVGElement] => Callback = null,
    onSelect: ReactEventFrom[SVGSVGElement] => Callback = null,
    onStalled: ReactEventFrom[SVGSVGElement] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SvgIconProps, 
    typingsJapgolly.atMaterialDashUiCore.svgIconMod.default, 
    Unit, 
    SvgIconProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (accentHeight != null) __obj.updateDynamic("accentHeight")(accentHeight.asInstanceOf[js.Any])
    if (accumulate != null) __obj.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
    if (additive != null) __obj.updateDynamic("additive")(additive.asInstanceOf[js.Any])
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (allowReorder != null) __obj.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
    if (alphabetic != null) __obj.updateDynamic("alphabetic")(alphabetic.asInstanceOf[js.Any])
    if (amplitude != null) __obj.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
    if (arabicForm != null) __obj.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
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
    if (ascent != null) __obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (attributeType != null) __obj.updateDynamic("attributeType")(attributeType.asInstanceOf[js.Any])
    if (autoReverse != null) __obj.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
    if (azimuth != null) __obj.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
    if (baseFrequency != null) __obj.updateDynamic("baseFrequency")(baseFrequency.asInstanceOf[js.Any])
    if (baseProfile != null) __obj.updateDynamic("baseProfile")(baseProfile.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (by != null) __obj.updateDynamic("by")(by.asInstanceOf[js.Any])
    if (calcMode != null) __obj.updateDynamic("calcMode")(calcMode.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipPathUnits != null) __obj.updateDynamic("clipPathUnits")(clipPathUnits.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorInterpolationFilters != null) __obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
    if (colorProfile != null) __obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contentScriptType != null) __obj.updateDynamic("contentScriptType")(contentScriptType.asInstanceOf[js.Any])
    if (contentStyleType != null) __obj.updateDynamic("contentStyleType")(contentStyleType.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (decelerate != null) __obj.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
    if (descent != null) __obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
    if (diffuseConstant != null) __obj.updateDynamic("diffuseConstant")(diffuseConstant.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (dur != null) __obj.updateDynamic("dur")(dur.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (edgeMode != null) __obj.updateDynamic("edgeMode")(edgeMode.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (enableBackground != null) __obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (externalResourcesRequired != null) __obj.updateDynamic("externalResourcesRequired")(externalResourcesRequired.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterRes != null) __obj.updateDynamic("filterRes")(filterRes.asInstanceOf[js.Any])
    if (filterUnits != null) __obj.updateDynamic("filterUnits")(filterUnits.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (g1 != null) __obj.updateDynamic("g1")(g1.asInstanceOf[js.Any])
    if (g2 != null) __obj.updateDynamic("g2")(g2.asInstanceOf[js.Any])
    if (glyphName != null) __obj.updateDynamic("glyphName")(glyphName.asInstanceOf[js.Any])
    if (glyphOrientationHorizontal != null) __obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (glyphRef != null) __obj.updateDynamic("glyphRef")(glyphRef.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (hanging != null) __obj.updateDynamic("hanging")(hanging.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizAdvX != null) __obj.updateDynamic("horizAdvX")(horizAdvX.asInstanceOf[js.Any])
    if (horizOriginX != null) __obj.updateDynamic("horizOriginX")(horizOriginX.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ideographic != null) __obj.updateDynamic("ideographic")(ideographic.asInstanceOf[js.Any])
    if (imageRendering != null) __obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (in2 != null) __obj.updateDynamic("in2")(in2.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (intercept != null) __obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
    if (k != null) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (k1 != null) __obj.updateDynamic("k1")(k1.asInstanceOf[js.Any])
    if (k2 != null) __obj.updateDynamic("k2")(k2.asInstanceOf[js.Any])
    if (k3 != null) __obj.updateDynamic("k3")(k3.asInstanceOf[js.Any])
    if (k4 != null) __obj.updateDynamic("k4")(k4.asInstanceOf[js.Any])
    if (kernelMatrix != null) __obj.updateDynamic("kernelMatrix")(kernelMatrix.asInstanceOf[js.Any])
    if (kernelUnitLength != null) __obj.updateDynamic("kernelUnitLength")(kernelUnitLength.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (keyPoints != null) __obj.updateDynamic("keyPoints")(keyPoints.asInstanceOf[js.Any])
    if (keySplines != null) __obj.updateDynamic("keySplines")(keySplines.asInstanceOf[js.Any])
    if (keyTimes != null) __obj.updateDynamic("keyTimes")(keyTimes.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lengthAdjust != null) __obj.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (limitingConeAngle != null) __obj.updateDynamic("limitingConeAngle")(limitingConeAngle.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerHeight != null) __obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (markerUnits != null) __obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
    if (markerWidth != null) __obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskContentUnits != null) __obj.updateDynamic("maskContentUnits")(maskContentUnits.asInstanceOf[js.Any])
    if (maskUnits != null) __obj.updateDynamic("maskUnits")(maskUnits.asInstanceOf[js.Any])
    if (mathematical != null) __obj.updateDynamic("mathematical")(mathematical.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nativeColor != null) __obj.updateDynamic("nativeColor")(nativeColor.asInstanceOf[js.Any])
    if (numOctaves != null) __obj.updateDynamic("numOctaves")(numOctaves.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onStalled(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.svgIconSvgIconMod.SvgIconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.svgIconMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.svgIconSvgIconMod.SvgIconProps])(children: _*)
  }
  @JSImport("@material-ui/core/SvgIcon", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

