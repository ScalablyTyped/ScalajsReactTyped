package typingsJapgolly.storybookComponents

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
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
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.Validator
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.storybookComponents.inputMod.Alignments
import typingsJapgolly.storybookComponents.inputMod.Sizes
import typingsJapgolly.storybookComponents.inputMod.ValidationStates
import typingsJapgolly.storybookComponents.storybookComponentsStrings.`additions text`
import typingsJapgolly.storybookComponents.storybookComponentsStrings.`inline`
import typingsJapgolly.storybookComponents.storybookComponentsStrings.additions
import typingsJapgolly.storybookComponents.storybookComponentsStrings.all
import typingsJapgolly.storybookComponents.storybookComponentsStrings.ascending
import typingsJapgolly.storybookComponents.storybookComponentsStrings.assertive
import typingsJapgolly.storybookComponents.storybookComponentsStrings.both
import typingsJapgolly.storybookComponents.storybookComponentsStrings.copy
import typingsJapgolly.storybookComponents.storybookComponentsStrings.date
import typingsJapgolly.storybookComponents.storybookComponentsStrings.decimal
import typingsJapgolly.storybookComponents.storybookComponentsStrings.descending
import typingsJapgolly.storybookComponents.storybookComponentsStrings.dialog
import typingsJapgolly.storybookComponents.storybookComponentsStrings.email
import typingsJapgolly.storybookComponents.storybookComponentsStrings.execute
import typingsJapgolly.storybookComponents.storybookComponentsStrings.grammar
import typingsJapgolly.storybookComponents.storybookComponentsStrings.grid
import typingsJapgolly.storybookComponents.storybookComponentsStrings.horizontal
import typingsJapgolly.storybookComponents.storybookComponentsStrings.inherit
import typingsJapgolly.storybookComponents.storybookComponentsStrings.link
import typingsJapgolly.storybookComponents.storybookComponentsStrings.list
import typingsJapgolly.storybookComponents.storybookComponentsStrings.listbox
import typingsJapgolly.storybookComponents.storybookComponentsStrings.location
import typingsJapgolly.storybookComponents.storybookComponentsStrings.menu
import typingsJapgolly.storybookComponents.storybookComponentsStrings.mixed
import typingsJapgolly.storybookComponents.storybookComponentsStrings.move
import typingsJapgolly.storybookComponents.storybookComponentsStrings.no
import typingsJapgolly.storybookComponents.storybookComponentsStrings.none
import typingsJapgolly.storybookComponents.storybookComponentsStrings.numeric
import typingsJapgolly.storybookComponents.storybookComponentsStrings.off
import typingsJapgolly.storybookComponents.storybookComponentsStrings.on
import typingsJapgolly.storybookComponents.storybookComponentsStrings.other
import typingsJapgolly.storybookComponents.storybookComponentsStrings.page
import typingsJapgolly.storybookComponents.storybookComponentsStrings.polite
import typingsJapgolly.storybookComponents.storybookComponentsStrings.popup
import typingsJapgolly.storybookComponents.storybookComponentsStrings.removals
import typingsJapgolly.storybookComponents.storybookComponentsStrings.search
import typingsJapgolly.storybookComponents.storybookComponentsStrings.spelling
import typingsJapgolly.storybookComponents.storybookComponentsStrings.step
import typingsJapgolly.storybookComponents.storybookComponentsStrings.tel
import typingsJapgolly.storybookComponents.storybookComponentsStrings.text
import typingsJapgolly.storybookComponents.storybookComponentsStrings.time
import typingsJapgolly.storybookComponents.storybookComponentsStrings.tree
import typingsJapgolly.storybookComponents.storybookComponentsStrings.url
import typingsJapgolly.storybookComponents.storybookComponentsStrings.vertical
import typingsJapgolly.storybookComponents.storybookComponentsStrings.yes
import typingsJapgolly.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<std.Pick<@storybook/components.@storybook/components/dist/form/input/input.TextareaProps, 'color' | 'content' | 'height' | 'translate' | 'width' | 'start' | 'hidden' | 'size' | 'style' | 'default' | 'wrap' | 'open' | 'multiple' | 'disabled' | 'key' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'href' | 'cite' | 'data' | 'form' | 'label' | 'span' | 'summary' | 'pattern' | 'cellPadding' | 'cellSpacing' | 'alt' | 'crossOrigin' | 'sizes' | 'src' | 'srcSet' | 'useMap' | 'value' | 'reversed' | 'type' | 'list' | 'step' | 'async' | 'max' | 'media' | 'method' | 'min' | 'name' | 'target' | 'download' | 'hrefLang' | 'rel' | 'autoFocus' | 'formAction' | 'formEncType' | 'formMethod' | 'formNoValidate' | 'formTarget' | 'htmlFor' | 'valid' | 'align' | 'accept' | 'acceptCharset' | 'action' | 'allowFullScreen' | 'allowTransparency' | 'as' | 'autoComplete' | 'autoPlay' | 'capture' | 'charSet' | 'challenge' | 'checked' | 'classID' | 'cols' | 'colSpan' | 'controls' | 'coords' | 'dateTime' | 'defer' | 'encType' | 'frameBorder' | 'headers' | 'high' | 'httpEquiv' | 'integrity' | 'keyParams' | 'keyType' | 'kind' | 'loop' | 'low' | 'manifest' | 'marginHeight' | 'marginWidth' | 'maxLength' | 'mediaGroup' | 'minLength' | 'muted' | 'nonce' | 'noValidate' | 'optimum' | 'playsInline' | 'poster' | 'preload' | 'readOnly' | 'required' | 'rows' | 'rowSpan' | 'sandbox' | 'scope' | 'scoped' | 'scrolling' | 'seamless' | 'selected' | 'shape' | 'srcDoc' | 'srcLang' | 'wmode' | 'onHeightChange' | 'useCacheForDOMMeasurements' | 'minRows' | 'maxRows' | 'inputRef'> & react.react.RefAttributes<any> & @storybook/components.@storybook/components/dist/form/input/input.TextareaProps & @emotion/styled-base.AnonThemeTheme<@storybook/theming.@storybook/theming.Theme>> */
@js.native
trait WeakValidationMapPickText extends js.Object {
  var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var accept: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var acceptCharset: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var action: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var align: js.UndefOr[Validator[js.UndefOr[Alignments | Null]]] = js.native
  var allowFullScreen: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var allowTransparency: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var alt: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list | both | Null]]] = js.native
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]] = js.native
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]] = js.native
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]] = js.native
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.native
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.native
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.native
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-relevant`: js.UndefOr[
    Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]
  ] = js.native
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.native
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var as: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var async: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoComplete: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var autoPlay: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var capture: js.UndefOr[Validator[js.UndefOr[Boolean | Null | String]]] = js.native
  var cellPadding: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var cellSpacing: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var challenge: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var charSet: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var checked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var children: js.UndefOr[Validator[js.UndefOr[Null | Node]]] = js.native
  var cite: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var classID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var colSpan: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var cols: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var content: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var contentEditable: js.UndefOr[Validator[js.UndefOr[inherit | Booleanish | Null]]] = js.native
  var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var controls: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var coords: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var crossOrigin: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var css: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[AnonHtml | Null]]] = js.native
  var data: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var dateTime: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var default: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.native
  var defer: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var download: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var draggable: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  var encType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var form: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var formAction: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var formEncType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var formMethod: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var formNoValidate: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var formTarget: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var frameBorder: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var headers: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var height: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var high: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var href: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var hrefLang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var htmlFor: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var httpEquiv: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var inlist: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var inputMode: js.UndefOr[
    Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]
  ] = js.native
  var inputRef: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | Null | RefHandle[HTMLTextAreaElement]
      ]
    ]
  ] = js.native
  var integrity: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
  var keyParams: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var keyType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var kind: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var label: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var list: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var loop: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var low: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var manifest: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var marginHeight: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var marginWidth: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var max: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var maxLength: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var maxRows: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var media: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var mediaGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var method: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var min: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var minLength: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var minRows: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var multiple: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var muted: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var noValidate: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var nonce: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onAbortCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onAnimationEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onAnimationIterationCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onAnimationStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onAuxClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onBeforeInputCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onBlurCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onCanPlayCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* event */ ReactEventFrom[HTMLTextAreaElement], Unit]) | Null]
    ]
  ] = js.native
  var onChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCompositionEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCompositionStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onContextMenuCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCopyCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDoubleClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragEnterCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragExitCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragLeaveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDropCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onDurationChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onEmptiedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onEncryptedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onEndedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onErrorCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onFocusCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onGotPointerCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onHeightChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* height */ Double, Unit]) | Null]]] = js.native
  var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onInputCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onInvalidCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onKeyDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onKeyPressCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onKeyUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onLoadCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onLoadStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onLoadedDataCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLostPointerCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseOutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onPasteCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPauseCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPlayCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPlayingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerCancelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerEnterCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerLeaveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerOutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onProgressCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onRateChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onResetCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLTextAreaElement]]]] = js.native
  var onScrollCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onSeekedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onSeekingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onSelectCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onStalledCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onSubmitCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onSuspendCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTimeUpdateCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTouchCancelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTouchMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTouchStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTransitionEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onVolumeChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onWaitingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLTextAreaElement]]]] = js.native
  var onWheelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var open: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var optimum: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var pattern: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var playsInline: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var poster: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var preload: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref]]] = js.native
  var rel: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var required: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var reversed: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var rowSpan: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var rows: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var sandbox: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var scope: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var scoped: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var scrolling: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var seamless: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var shape: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var size: js.UndefOr[Validator[js.UndefOr[Null | Sizes]]] = js.native
  var sizes: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var span: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var spellCheck: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  var src: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var srcDoc: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var srcLang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var srcSet: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var start: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var step: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var summary: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var target: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[Null | Theme]]] = js.native
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var translate: js.UndefOr[Validator[js.UndefOr[yes | no | Null]]] = js.native
  var `type`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.native
  var useCacheForDOMMeasurements: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var useMap: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var valid: js.UndefOr[Validator[js.UndefOr[Null | ValidationStates]]] = js.native
  var value: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var width: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var wmode: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var wrap: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}

object WeakValidationMapPickText {
  @scala.inline
  def apply(
    about: Validator[js.UndefOr[Null | String]] = null,
    accept: Validator[js.UndefOr[Null | String]] = null,
    acceptCharset: Validator[js.UndefOr[Null | String]] = null,
    accessKey: Validator[js.UndefOr[Null | String]] = null,
    action: Validator[js.UndefOr[Null | String]] = null,
    align: Validator[js.UndefOr[Alignments | Null]] = null,
    allowFullScreen: Validator[js.UndefOr[Boolean | Null]] = null,
    allowTransparency: Validator[js.UndefOr[Boolean | Null]] = null,
    alt: Validator[js.UndefOr[Null | String]] = null,
    `aria-activedescendant`: Validator[js.UndefOr[Null | String]] = null,
    `aria-atomic`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-autocomplete`: Validator[js.UndefOr[none | `inline` | list | both | Null]] = null,
    `aria-busy`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-checked`: Validator[js.UndefOr[mixed | Boolean | Null]] = null,
    `aria-colcount`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-colindex`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-colspan`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-controls`: Validator[js.UndefOr[Null | String]] = null,
    `aria-current`: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]] = null,
    `aria-describedby`: Validator[js.UndefOr[Null | String]] = null,
    `aria-details`: Validator[js.UndefOr[Null | String]] = null,
    `aria-disabled`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-dropeffect`: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]] = null,
    `aria-errormessage`: Validator[js.UndefOr[Null | String]] = null,
    `aria-expanded`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-flowto`: Validator[js.UndefOr[Null | String]] = null,
    `aria-grabbed`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-haspopup`: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]] = null,
    `aria-hidden`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-invalid`: Validator[js.UndefOr[grammar | spelling | Boolean | Null]] = null,
    `aria-keyshortcuts`: Validator[js.UndefOr[Null | String]] = null,
    `aria-label`: Validator[js.UndefOr[Null | String]] = null,
    `aria-labelledby`: Validator[js.UndefOr[Null | String]] = null,
    `aria-level`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-live`: Validator[js.UndefOr[off | assertive | polite | Null]] = null,
    `aria-modal`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-multiline`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-multiselectable`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-orientation`: Validator[js.UndefOr[horizontal | vertical | Null]] = null,
    `aria-owns`: Validator[js.UndefOr[Null | String]] = null,
    `aria-placeholder`: Validator[js.UndefOr[Null | String]] = null,
    `aria-posinset`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-pressed`: Validator[js.UndefOr[mixed | Boolean | Null]] = null,
    `aria-readonly`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-relevant`: Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]] = null,
    `aria-required`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-roledescription`: Validator[js.UndefOr[Null | String]] = null,
    `aria-rowcount`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-rowindex`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-rowspan`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-selected`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-setsize`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-sort`: Validator[js.UndefOr[none | ascending | descending | other | Null]] = null,
    `aria-valuemax`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuemin`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuenow`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuetext`: Validator[js.UndefOr[Null | String]] = null,
    as: Validator[js.UndefOr[Null | String]] = null,
    async: Validator[js.UndefOr[Boolean | Null]] = null,
    autoCapitalize: Validator[js.UndefOr[Null | String]] = null,
    autoComplete: Validator[js.UndefOr[Null | String]] = null,
    autoCorrect: Validator[js.UndefOr[Null | String]] = null,
    autoFocus: Validator[js.UndefOr[Boolean | Null]] = null,
    autoPlay: Validator[js.UndefOr[Boolean | Null]] = null,
    autoSave: Validator[js.UndefOr[Null | String]] = null,
    capture: Validator[js.UndefOr[Boolean | Null | String]] = null,
    cellPadding: Validator[js.UndefOr[Double | Null | String]] = null,
    cellSpacing: Validator[js.UndefOr[Double | Null | String]] = null,
    challenge: Validator[js.UndefOr[Null | String]] = null,
    charSet: Validator[js.UndefOr[Null | String]] = null,
    checked: Validator[js.UndefOr[Boolean | Null]] = null,
    children: Validator[js.UndefOr[Null | Node]] = null,
    cite: Validator[js.UndefOr[Null | String]] = null,
    classID: Validator[js.UndefOr[Null | String]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    colSpan: Validator[js.UndefOr[Double | Null]] = null,
    color: Validator[js.UndefOr[Null | String]] = null,
    cols: Validator[js.UndefOr[Double | Null]] = null,
    content: Validator[js.UndefOr[Null | String]] = null,
    contentEditable: Validator[js.UndefOr[inherit | Booleanish | Null]] = null,
    contextMenu: Validator[js.UndefOr[Null | String]] = null,
    controls: Validator[js.UndefOr[Boolean | Null]] = null,
    coords: Validator[js.UndefOr[Null | String]] = null,
    crossOrigin: Validator[js.UndefOr[Null | String]] = null,
    css: Validator[js.UndefOr[_ | Null]] = null,
    dangerouslySetInnerHTML: Validator[js.UndefOr[AnonHtml | Null]] = null,
    data: Validator[js.UndefOr[Null | String]] = null,
    datatype: Validator[js.UndefOr[Null | String]] = null,
    dateTime: Validator[js.UndefOr[Null | String]] = null,
    default: Validator[js.UndefOr[Boolean | Null]] = null,
    defaultChecked: Validator[js.UndefOr[Boolean | Null]] = null,
    defaultValue: Validator[js.UndefOr[js.Array[String] | Double | Null | String]] = null,
    defer: Validator[js.UndefOr[Boolean | Null]] = null,
    dir: Validator[js.UndefOr[Null | String]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    download: Validator[js.UndefOr[_ | Null]] = null,
    draggable: Validator[js.UndefOr[Booleanish | Null]] = null,
    encType: Validator[js.UndefOr[Null | String]] = null,
    form: Validator[js.UndefOr[Null | String]] = null,
    formAction: Validator[js.UndefOr[Null | String]] = null,
    formEncType: Validator[js.UndefOr[Null | String]] = null,
    formMethod: Validator[js.UndefOr[Null | String]] = null,
    formNoValidate: Validator[js.UndefOr[Boolean | Null]] = null,
    formTarget: Validator[js.UndefOr[Null | String]] = null,
    frameBorder: Validator[js.UndefOr[Double | Null | String]] = null,
    headers: Validator[js.UndefOr[Null | String]] = null,
    height: Validator[js.UndefOr[Double | Null | String]] = null,
    hidden: Validator[js.UndefOr[Boolean | Null]] = null,
    high: Validator[js.UndefOr[Double | Null]] = null,
    href: Validator[js.UndefOr[Null | String]] = null,
    hrefLang: Validator[js.UndefOr[Null | String]] = null,
    htmlFor: Validator[js.UndefOr[Null | String]] = null,
    httpEquiv: Validator[js.UndefOr[Null | String]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    inlist: Validator[js.UndefOr[_ | Null]] = null,
    inputMode: Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]] = null,
    inputRef: Validator[
      js.UndefOr[
        (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | Null | RefHandle[HTMLTextAreaElement]
      ]
    ] = null,
    integrity: Validator[js.UndefOr[Null | String]] = null,
    is: Validator[js.UndefOr[Null | String]] = null,
    itemID: Validator[js.UndefOr[Null | String]] = null,
    itemProp: Validator[js.UndefOr[Null | String]] = null,
    itemRef: Validator[js.UndefOr[Null | String]] = null,
    itemScope: Validator[js.UndefOr[Boolean | Null]] = null,
    itemType: Validator[js.UndefOr[Null | String]] = null,
    key: Validator[js.UndefOr[Key | Null]] = null,
    keyParams: Validator[js.UndefOr[Null | String]] = null,
    keyType: Validator[js.UndefOr[Null | String]] = null,
    kind: Validator[js.UndefOr[Null | String]] = null,
    label: Validator[js.UndefOr[Null | String]] = null,
    lang: Validator[js.UndefOr[Null | String]] = null,
    list: Validator[js.UndefOr[Null | String]] = null,
    loop: Validator[js.UndefOr[Boolean | Null]] = null,
    low: Validator[js.UndefOr[Double | Null]] = null,
    manifest: Validator[js.UndefOr[Null | String]] = null,
    marginHeight: Validator[js.UndefOr[Double | Null]] = null,
    marginWidth: Validator[js.UndefOr[Double | Null]] = null,
    max: Validator[js.UndefOr[Double | Null | String]] = null,
    maxLength: Validator[js.UndefOr[Double | Null]] = null,
    maxRows: Validator[js.UndefOr[Double | Null]] = null,
    media: Validator[js.UndefOr[Null | String]] = null,
    mediaGroup: Validator[js.UndefOr[Null | String]] = null,
    method: Validator[js.UndefOr[Null | String]] = null,
    min: Validator[js.UndefOr[Double | Null | String]] = null,
    minLength: Validator[js.UndefOr[Double | Null]] = null,
    minRows: Validator[js.UndefOr[Double | Null]] = null,
    multiple: Validator[js.UndefOr[Boolean | Null]] = null,
    muted: Validator[js.UndefOr[Boolean | Null]] = null,
    name: Validator[js.UndefOr[Null | String]] = null,
    noValidate: Validator[js.UndefOr[Boolean | Null]] = null,
    nonce: Validator[js.UndefOr[Null | String]] = null,
    onAbort: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onAbortCapture: Validator[js.UndefOr[_ | Null]] = null,
    onAnimationEnd: Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]] = null,
    onAnimationEndCapture: Validator[js.UndefOr[_ | Null]] = null,
    onAnimationIteration: Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]] = null,
    onAnimationIterationCapture: Validator[js.UndefOr[_ | Null]] = null,
    onAnimationStart: Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]] = null,
    onAnimationStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onAuxClick: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onAuxClickCapture: Validator[js.UndefOr[_ | Null]] = null,
    onBeforeInput: Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]] = null,
    onBeforeInputCapture: Validator[js.UndefOr[_ | Null]] = null,
    onBlur: Validator[js.UndefOr[FocusEventHandler[HTMLTextAreaElement] | Null]] = null,
    onBlurCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCanPlay: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onCanPlayCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCanPlayThrough: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onCanPlayThroughCapture: Validator[js.UndefOr[_ | Null]] = null,
    onChange: Validator[
      js.UndefOr[(js.Function1[/* event */ ReactEventFrom[HTMLTextAreaElement], Unit]) | Null]
    ] = null,
    onChangeCapture: Validator[js.UndefOr[_ | Null]] = null,
    onClick: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onClickCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCompositionEnd: Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]] = null,
    onCompositionEndCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCompositionStart: Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]] = null,
    onCompositionStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCompositionUpdate: Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]] = null,
    onCompositionUpdateCapture: Validator[js.UndefOr[_ | Null]] = null,
    onContextMenu: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onContextMenuCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCopy: Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]] = null,
    onCopyCapture: Validator[js.UndefOr[_ | Null]] = null,
    onCut: Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]] = null,
    onCutCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDoubleClick: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDoubleClickCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDrag: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDragCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragEnd: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDragEndCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragEnter: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDragEnterCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragExit: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDragExitCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragLeave: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDragLeaveCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragOver: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDragOverCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDragStart: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDragStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDrop: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]] = null,
    onDropCapture: Validator[js.UndefOr[_ | Null]] = null,
    onDurationChange: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onDurationChangeCapture: Validator[js.UndefOr[_ | Null]] = null,
    onEmptied: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onEmptiedCapture: Validator[js.UndefOr[_ | Null]] = null,
    onEncrypted: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onEncryptedCapture: Validator[js.UndefOr[_ | Null]] = null,
    onEnded: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onEndedCapture: Validator[js.UndefOr[_ | Null]] = null,
    onError: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onErrorCapture: Validator[js.UndefOr[_ | Null]] = null,
    onFocus: Validator[js.UndefOr[FocusEventHandler[HTMLTextAreaElement] | Null]] = null,
    onFocusCapture: Validator[js.UndefOr[_ | Null]] = null,
    onGotPointerCapture: Validator[js.UndefOr[_ | Null]] = null,
    onGotPointerCaptureCapture: Validator[js.UndefOr[_ | Null]] = null,
    onHeightChange: Validator[js.UndefOr[(js.Function1[/* height */ Double, Unit]) | Null]] = null,
    onInput: Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]] = null,
    onInputCapture: Validator[js.UndefOr[_ | Null]] = null,
    onInvalid: Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]] = null,
    onInvalidCapture: Validator[js.UndefOr[_ | Null]] = null,
    onKeyDown: Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]] = null,
    onKeyDownCapture: Validator[js.UndefOr[_ | Null]] = null,
    onKeyPress: Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]] = null,
    onKeyPressCapture: Validator[js.UndefOr[_ | Null]] = null,
    onKeyUp: Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]] = null,
    onKeyUpCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLoad: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onLoadCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLoadStart: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onLoadStartCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLoadedData: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onLoadedDataCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLoadedMetadata: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onLoadedMetadataCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLostPointerCapture: Validator[js.UndefOr[_ | Null]] = null,
    onLostPointerCaptureCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseDown: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onMouseDownCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseEnter: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onMouseLeave: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onMouseMove: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onMouseMoveCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseOut: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onMouseOutCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseOver: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onMouseOverCapture: Validator[js.UndefOr[_ | Null]] = null,
    onMouseUp: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]] = null,
    onMouseUpCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPaste: Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]] = null,
    onPasteCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPause: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null,
    onPauseCapture: Validator[js.UndefOr[_ | Null]] = null,
    onPlay: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]] = null
  ): WeakValidationMapPickText = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (allowFullScreen != null) __obj.updateDynamic("allowFullScreen")(allowFullScreen.asInstanceOf[js.Any])
    if (allowTransparency != null) __obj.updateDynamic("allowTransparency")(allowTransparency.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (`aria-atomic` != null) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (`aria-busy` != null) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (`aria-disabled` != null) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (`aria-expanded` != null) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (`aria-grabbed` != null) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (`aria-hidden` != null) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (`aria-modal` != null) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (`aria-multiline` != null) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (`aria-multiselectable` != null) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (`aria-readonly` != null) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (`aria-required` != null) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (`aria-selected` != null) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoFocus != null) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoPlay != null) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (defaultChecked != null) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (defer != null) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (formNoValidate != null) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (itemScope != null) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (marginHeight != null) __obj.updateDynamic("marginHeight")(marginHeight.asInstanceOf[js.Any])
    if (marginWidth != null) __obj.updateDynamic("marginWidth")(marginWidth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (muted != null) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noValidate != null) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort.asInstanceOf[js.Any])
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(onAbortCapture.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd.asInstanceOf[js.Any])
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(onAnimationEndCapture.asInstanceOf[js.Any])
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration.asInstanceOf[js.Any])
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(onAnimationIterationCapture.asInstanceOf[js.Any])
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart.asInstanceOf[js.Any])
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(onAnimationStartCapture.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick.asInstanceOf[js.Any])
    if (onAuxClickCapture != null) __obj.updateDynamic("onAuxClickCapture")(onAuxClickCapture.asInstanceOf[js.Any])
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput.asInstanceOf[js.Any])
    if (onBeforeInputCapture != null) __obj.updateDynamic("onBeforeInputCapture")(onBeforeInputCapture.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(onBlurCapture.asInstanceOf[js.Any])
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay.asInstanceOf[js.Any])
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(onCanPlayCapture.asInstanceOf[js.Any])
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough.asInstanceOf[js.Any])
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(onCanPlayThroughCapture.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(onChangeCapture.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(onClickCapture.asInstanceOf[js.Any])
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd.asInstanceOf[js.Any])
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(onCompositionEndCapture.asInstanceOf[js.Any])
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart.asInstanceOf[js.Any])
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(onCompositionStartCapture.asInstanceOf[js.Any])
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate.asInstanceOf[js.Any])
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(onCompositionUpdateCapture.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(onContextMenuCapture.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy.asInstanceOf[js.Any])
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(onCopyCapture.asInstanceOf[js.Any])
    if (onCut != null) __obj.updateDynamic("onCut")(onCut.asInstanceOf[js.Any])
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(onCutCapture.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDoubleClickCapture != null) __obj.updateDynamic("onDoubleClickCapture")(onDoubleClickCapture.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(onDragCapture.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(onDragEndCapture.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(onDragEnterCapture.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(onDragExitCapture.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(onDragLeaveCapture.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(onDragOverCapture.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(onDragStartCapture.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(onDropCapture.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange.asInstanceOf[js.Any])
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(onDurationChangeCapture.asInstanceOf[js.Any])
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied.asInstanceOf[js.Any])
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(onEmptiedCapture.asInstanceOf[js.Any])
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted.asInstanceOf[js.Any])
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(onEncryptedCapture.asInstanceOf[js.Any])
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded.asInstanceOf[js.Any])
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(onEndedCapture.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(onFocusCapture.asInstanceOf[js.Any])
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(onGotPointerCapture.asInstanceOf[js.Any])
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(onGotPointerCaptureCapture.asInstanceOf[js.Any])
    if (onHeightChange != null) __obj.updateDynamic("onHeightChange")(onHeightChange.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(onInput.asInstanceOf[js.Any])
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(onInputCapture.asInstanceOf[js.Any])
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid.asInstanceOf[js.Any])
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(onInvalidCapture.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown.asInstanceOf[js.Any])
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(onKeyDownCapture.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(onKeyPressCapture.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp.asInstanceOf[js.Any])
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(onKeyUpCapture.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(onLoadCapture.asInstanceOf[js.Any])
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart.asInstanceOf[js.Any])
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(onLoadStartCapture.asInstanceOf[js.Any])
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData.asInstanceOf[js.Any])
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(onLoadedDataCapture.asInstanceOf[js.Any])
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata.asInstanceOf[js.Any])
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(onLoadedMetadataCapture.asInstanceOf[js.Any])
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(onLostPointerCapture.asInstanceOf[js.Any])
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(onLostPointerCaptureCapture.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(onMouseDownCapture.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(onMouseMoveCapture.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(onMouseOutCapture.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(onMouseOverCapture.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(onMouseUpCapture.asInstanceOf[js.Any])
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste.asInstanceOf[js.Any])
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(onPasteCapture.asInstanceOf[js.Any])
    if (onPause != null) __obj.updateDynamic("onPause")(onPause.asInstanceOf[js.Any])
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(onPauseCapture.asInstanceOf[js.Any])
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapPickText]
  }
}

