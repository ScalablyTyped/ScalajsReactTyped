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
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typingsJapgolly.officeUiFabricReact.layerTypesMod.ILayerProps
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
import typingsJapgolly.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase
import typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanel
import typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelHeaderRenderer
import typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps
import typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelStyleProps
import typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelStyles
import typingsJapgolly.officeUiFabricReact.panelTypesMod.PanelType
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.HTMLAttributes
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

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.types.IPanelProps> */
trait ReadonlyIPanelProps extends js.Object {
  val about: js.UndefOr[String] = js.undefined
  val accessKey: js.UndefOr[String] = js.undefined
  val allowTouchBodyScroll: js.UndefOr[Boolean] = js.undefined
  val `aria-activedescendant`: js.UndefOr[String] = js.undefined
  val `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  val `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  val `aria-busy`: js.UndefOr[Boolean] = js.undefined
  val `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  val `aria-colcount`: js.UndefOr[Double] = js.undefined
  val `aria-colindex`: js.UndefOr[Double] = js.undefined
  val `aria-colspan`: js.UndefOr[Double] = js.undefined
  val `aria-controls`: js.UndefOr[String] = js.undefined
  val `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  val `aria-describedby`: js.UndefOr[String] = js.undefined
  val `aria-details`: js.UndefOr[String] = js.undefined
  val `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  val `aria-errormessage`: js.UndefOr[String] = js.undefined
  val `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  val `aria-flowto`: js.UndefOr[String] = js.undefined
  val `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  val `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  val `aria-label`: js.UndefOr[String] = js.undefined
  val `aria-labelledby`: js.UndefOr[String] = js.undefined
  val `aria-level`: js.UndefOr[Double] = js.undefined
  val `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  val `aria-modal`: js.UndefOr[Boolean] = js.undefined
  val `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  val `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  val `aria-owns`: js.UndefOr[String] = js.undefined
  val `aria-placeholder`: js.UndefOr[String] = js.undefined
  val `aria-posinset`: js.UndefOr[Double] = js.undefined
  val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  val `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  val `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  val `aria-required`: js.UndefOr[Boolean] = js.undefined
  val `aria-roledescription`: js.UndefOr[String] = js.undefined
  val `aria-rowcount`: js.UndefOr[Double] = js.undefined
  val `aria-rowindex`: js.UndefOr[Double] = js.undefined
  val `aria-rowspan`: js.UndefOr[Double] = js.undefined
  val `aria-selected`: js.UndefOr[Boolean] = js.undefined
  val `aria-setsize`: js.UndefOr[Double] = js.undefined
  val `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  val `aria-valuemax`: js.UndefOr[Double] = js.undefined
  val `aria-valuemin`: js.UndefOr[Double] = js.undefined
  val `aria-valuenow`: js.UndefOr[Double] = js.undefined
  val `aria-valuetext`: js.UndefOr[String] = js.undefined
  val autoCapitalize: js.UndefOr[String] = js.undefined
  val autoCorrect: js.UndefOr[String] = js.undefined
  val autoSave: js.UndefOr[String] = js.undefined
  val children: js.UndefOr[Node] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val componentId: js.UndefOr[String] = js.undefined
  val componentRef: js.UndefOr[IRefObject[IPanel]] = js.undefined
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  val contextMenu: js.UndefOr[String] = js.undefined
  val customWidth: js.UndefOr[String] = js.undefined
  val dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  val datatype: js.UndefOr[String] = js.undefined
  val defaultChecked: js.UndefOr[Boolean] = js.undefined
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  val dir: js.UndefOr[String] = js.undefined
  val draggable: js.UndefOr[Booleanish] = js.undefined
  val elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.undefined
  val firstFocusableSelector: js.UndefOr[String] = js.undefined
  val focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.undefined
  val forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined
  val hasCloseButton: js.UndefOr[Boolean] = js.undefined
  val headerClassName: js.UndefOr[String] = js.undefined
  val headerText: js.UndefOr[String] = js.undefined
  val headerTextProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  val hidden: js.UndefOr[Boolean] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined
  val inlist: js.UndefOr[js.Any] = js.undefined
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  val is: js.UndefOr[String] = js.undefined
  val isBlocking: js.UndefOr[Boolean] = js.undefined
  val isFooterAtBottom: js.UndefOr[Boolean] = js.undefined
  val isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined
  val isLightDismiss: js.UndefOr[Boolean] = js.undefined
  val isOpen: js.UndefOr[Boolean] = js.undefined
  val itemID: js.UndefOr[String] = js.undefined
  val itemProp: js.UndefOr[String] = js.undefined
  val itemRef: js.UndefOr[String] = js.undefined
  val itemScope: js.UndefOr[Boolean] = js.undefined
  val itemType: js.UndefOr[String] = js.undefined
  val lang: js.UndefOr[String] = js.undefined
  val layerProps: js.UndefOr[ILayerProps] = js.undefined
  val onAbort: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[PanelBase]] = js.undefined
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[PanelBase]] = js.undefined
  val onAnimationStart: js.UndefOr[AnimationEventHandler[PanelBase]] = js.undefined
  val onAuxClick: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onBeforeInput: js.UndefOr[FormEventHandler[PanelBase]] = js.undefined
  val onBlur: js.UndefOr[FocusEventHandler[PanelBase]] = js.undefined
  val onCanPlay: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onChange: js.UndefOr[FormEventHandler[PanelBase]] = js.undefined
  val onClick: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[PanelBase]] = js.undefined
  val onCompositionStart: js.UndefOr[CompositionEventHandler[PanelBase]] = js.undefined
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[PanelBase]] = js.undefined
  val onContextMenu: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onCopy: js.UndefOr[ClipboardEventHandler[PanelBase]] = js.undefined
  val onCut: js.UndefOr[ClipboardEventHandler[PanelBase]] = js.undefined
  val onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]] = js.undefined
  val onDismissed: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onDoubleClick: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onDrag: js.UndefOr[DragEventHandler[PanelBase]] = js.undefined
  val onDragEnd: js.UndefOr[DragEventHandler[PanelBase]] = js.undefined
  val onDragEnter: js.UndefOr[DragEventHandler[PanelBase]] = js.undefined
  val onDragExit: js.UndefOr[DragEventHandler[PanelBase]] = js.undefined
  val onDragLeave: js.UndefOr[DragEventHandler[PanelBase]] = js.undefined
  val onDragOver: js.UndefOr[DragEventHandler[PanelBase]] = js.undefined
  val onDragStart: js.UndefOr[DragEventHandler[PanelBase]] = js.undefined
  val onDrop: js.UndefOr[DragEventHandler[PanelBase]] = js.undefined
  val onDurationChange: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onEmptied: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onEncrypted: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onEnded: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onError: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onFocus: js.UndefOr[FocusEventHandler[PanelBase]] = js.undefined
  val onInput: js.UndefOr[FormEventHandler[PanelBase]] = js.undefined
  val onInvalid: js.UndefOr[FormEventHandler[PanelBase]] = js.undefined
  val onKeyDown: js.UndefOr[KeyboardEventHandler[PanelBase]] = js.undefined
  val onKeyPress: js.UndefOr[KeyboardEventHandler[PanelBase]] = js.undefined
  val onKeyUp: js.UndefOr[KeyboardEventHandler[PanelBase]] = js.undefined
  val onLightDismissClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onLoad: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onLoadStart: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onLoadedData: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onMouseDown: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onMouseEnter: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onMouseLeave: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onMouseMove: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onMouseOut: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onMouseOver: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onMouseUp: js.UndefOr[MouseEventHandler[PanelBase]] = js.undefined
  val onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onOuterClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onPaste: js.UndefOr[ClipboardEventHandler[PanelBase]] = js.undefined
  val onPause: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onPlay: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onPlaying: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onPointerCancel: js.UndefOr[PointerEventHandler[PanelBase]] = js.undefined
  val onPointerDown: js.UndefOr[PointerEventHandler[PanelBase]] = js.undefined
  val onPointerEnter: js.UndefOr[PointerEventHandler[PanelBase]] = js.undefined
  val onPointerLeave: js.UndefOr[PointerEventHandler[PanelBase]] = js.undefined
  val onPointerMove: js.UndefOr[PointerEventHandler[PanelBase]] = js.undefined
  val onPointerOut: js.UndefOr[PointerEventHandler[PanelBase]] = js.undefined
  val onPointerOver: js.UndefOr[PointerEventHandler[PanelBase]] = js.undefined
  val onPointerUp: js.UndefOr[PointerEventHandler[PanelBase]] = js.undefined
  val onProgress: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onRateChange: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onRenderBody: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  val onRenderFooter: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  val onRenderFooterContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  val onRenderHeader: js.UndefOr[IPanelHeaderRenderer] = js.undefined
  val onRenderNavigation: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  val onRenderNavigationContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  val onReset: js.UndefOr[FormEventHandler[PanelBase]] = js.undefined
  val onScroll: js.UndefOr[UIEventHandler[PanelBase]] = js.undefined
  val onSeeked: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onSeeking: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onSelect: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onStalled: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onSubmit: js.UndefOr[FormEventHandler[PanelBase]] = js.undefined
  val onSuspend: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onTimeUpdate: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onTouchCancel: js.UndefOr[TouchEventHandler[PanelBase]] = js.undefined
  val onTouchEnd: js.UndefOr[TouchEventHandler[PanelBase]] = js.undefined
  val onTouchMove: js.UndefOr[TouchEventHandler[PanelBase]] = js.undefined
  val onTouchStart: js.UndefOr[TouchEventHandler[PanelBase]] = js.undefined
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[PanelBase]] = js.undefined
  val onVolumeChange: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onWaiting: js.UndefOr[ReactEventHandler[PanelBase]] = js.undefined
  val onWheel: js.UndefOr[WheelEventHandler[PanelBase]] = js.undefined
  val overlayProps: js.UndefOr[IOverlayProps] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val prefix: js.UndefOr[String] = js.undefined
  val property: js.UndefOr[String] = js.undefined
  val radioGroup: js.UndefOr[String] = js.undefined
  val resource: js.UndefOr[String] = js.undefined
  val results: js.UndefOr[Double] = js.undefined
  val role: js.UndefOr[String] = js.undefined
  val security: js.UndefOr[String] = js.undefined
  val slot: js.UndefOr[String] = js.undefined
  val spellCheck: js.UndefOr[Booleanish] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val styles: js.UndefOr[IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]] = js.undefined
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  val tabIndex: js.UndefOr[Double] = js.undefined
  val theme: js.UndefOr[ITheme] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val translate: js.UndefOr[yes | no] = js.undefined
  val `type`: js.UndefOr[PanelType] = js.undefined
  val typeof: js.UndefOr[String] = js.undefined
  val unselectable: js.UndefOr[on | off] = js.undefined
  val vocab: js.UndefOr[String] = js.undefined
}

object ReadonlyIPanelProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    allowTouchBodyScroll: js.UndefOr[Boolean] = js.undefined,
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
    closeButtonAriaLabel: String = null,
    color: String = null,
    componentId: String = null,
    componentRef: IRefObject[IPanel] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    customWidth: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String = null,
    focusTrapZoneProps: IFocusTrapZoneProps = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    hasCloseButton: js.UndefOr[Boolean] = js.undefined,
    headerClassName: String = null,
    headerText: String = null,
    headerTextProps: HTMLAttributes[HTMLDivElement] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isFooterAtBottom: js.UndefOr[Boolean] = js.undefined,
    isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined,
    isLightDismiss: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    layerProps: ILayerProps = null,
    onAbort: ReactEventFrom[PanelBase with Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[PanelBase with Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[PanelBase with Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[PanelBase with Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onBeforeInput: ReactEventFrom[PanelBase with Element] => Callback = null,
    onBlur: ReactFocusEventFrom[PanelBase with Element] => Callback = null,
    onCanPlay: ReactEventFrom[PanelBase with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[PanelBase with Element] => Callback = null,
    onChange: ReactEventFrom[PanelBase with Element] => Callback = null,
    onClick: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[PanelBase with Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[PanelBase with Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[PanelBase with Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[PanelBase with Element] => Callback = null,
    onCut: ReactClipboardEventFrom[PanelBase with Element] => Callback = null,
    onDismiss: /* ev */ js.UndefOr[ReactEventFrom[HTMLElement]] => Callback = null,
    onDismissed: js.UndefOr[Callback] = js.undefined,
    onDoubleClick: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onDrag: ReactDragEventFrom[PanelBase with Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[PanelBase with Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[PanelBase with Element] => Callback = null,
    onDragExit: ReactDragEventFrom[PanelBase with Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[PanelBase with Element] => Callback = null,
    onDragOver: ReactDragEventFrom[PanelBase with Element] => Callback = null,
    onDragStart: ReactDragEventFrom[PanelBase with Element] => Callback = null,
    onDrop: ReactDragEventFrom[PanelBase with Element] => Callback = null,
    onDurationChange: ReactEventFrom[PanelBase with Element] => Callback = null,
    onEmptied: ReactEventFrom[PanelBase with Element] => Callback = null,
    onEncrypted: ReactEventFrom[PanelBase with Element] => Callback = null,
    onEnded: ReactEventFrom[PanelBase with Element] => Callback = null,
    onError: ReactEventFrom[PanelBase with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[PanelBase with Element] => Callback = null,
    onInput: ReactEventFrom[PanelBase with Element] => Callback = null,
    onInvalid: ReactEventFrom[PanelBase with Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[PanelBase with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[PanelBase with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[PanelBase with Element] => Callback = null,
    onLightDismissClick: js.UndefOr[Callback] = js.undefined,
    onLoad: ReactEventFrom[PanelBase with Element] => Callback = null,
    onLoadStart: ReactEventFrom[PanelBase with Element] => Callback = null,
    onLoadedData: ReactEventFrom[PanelBase with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[PanelBase with Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[PanelBase with Element] => Callback = null,
    onOpen: js.UndefOr[Callback] = js.undefined,
    onOpened: js.UndefOr[Callback] = js.undefined,
    onOuterClick: js.UndefOr[Callback] = js.undefined,
    onPaste: ReactClipboardEventFrom[PanelBase with Element] => Callback = null,
    onPause: ReactEventFrom[PanelBase with Element] => Callback = null,
    onPlay: ReactEventFrom[PanelBase with Element] => Callback = null,
    onPlaying: ReactEventFrom[PanelBase with Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[PanelBase with Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[PanelBase with Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[PanelBase with Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[PanelBase with Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[PanelBase with Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[PanelBase with Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[PanelBase with Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[PanelBase with Element] => Callback = null,
    onProgress: ReactEventFrom[PanelBase with Element] => Callback = null,
    onRateChange: ReactEventFrom[PanelBase with Element] => Callback = null,
    onRenderBody: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPanelProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderFooter: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPanelProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderFooterContent: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPanelProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderHeader: IPanelHeaderRenderer = null,
    onRenderNavigation: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPanelProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderNavigationContent: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IPanelProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onReset: ReactEventFrom[PanelBase with Element] => Callback = null,
    onScroll: ReactUIEventFrom[PanelBase with Element] => Callback = null,
    onSeeked: ReactEventFrom[PanelBase with Element] => Callback = null,
    onSeeking: ReactEventFrom[PanelBase with Element] => Callback = null,
    onSelect: ReactEventFrom[PanelBase with Element] => Callback = null,
    onStalled: ReactEventFrom[PanelBase with Element] => Callback = null,
    onSubmit: ReactEventFrom[PanelBase with Element] => Callback = null,
    onSuspend: ReactEventFrom[PanelBase with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[PanelBase with Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[PanelBase with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[PanelBase with Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[PanelBase with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[PanelBase with Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[PanelBase with Element] => Callback = null,
    onVolumeChange: ReactEventFrom[PanelBase with Element] => Callback = null,
    onWaiting: ReactEventFrom[PanelBase with Element] => Callback = null,
    onWheel: ReactWheelEventFrom[PanelBase with Element] => Callback = null,
    overlayProps: IOverlayProps = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles] = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    theme: ITheme = null,
    title: String = null,
    translate: yes | no = null,
    `type`: PanelType = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): ReadonlyIPanelProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTouchBodyScroll)) __obj.updateDynamic("allowTouchBodyScroll")(allowTouchBodyScroll.asInstanceOf[js.Any])
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
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentId != null) __obj.updateDynamic("componentId")(componentId.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (customWidth != null) __obj.updateDynamic("customWidth")(customWidth.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (focusTrapZoneProps != null) __obj.updateDynamic("focusTrapZoneProps")(focusTrapZoneProps.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseButton)) __obj.updateDynamic("hasCloseButton")(hasCloseButton.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (headerTextProps != null) __obj.updateDynamic("headerTextProps")(headerTextProps.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isFooterAtBottom)) __obj.updateDynamic("isFooterAtBottom")(isFooterAtBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(isHiddenOnDismiss)) __obj.updateDynamic("isHiddenOnDismiss")(isHiddenOnDismiss.asInstanceOf[js.Any])
    if (!js.isUndefined(isLightDismiss)) __obj.updateDynamic("isLightDismiss")(isLightDismiss.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (layerProps != null) __obj.updateDynamic("layerProps")(layerProps.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onCut(t0).runNow()))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onDismiss(t0).runNow()))
    onDismissed.foreach(p => __obj.updateDynamic("onDismissed")(p.toJsFn))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    onLightDismissClick.foreach(p => __obj.updateDynamic("onLightDismissClick")(p.toJsFn))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    onOpened.foreach(p => __obj.updateDynamic("onOpened")(p.toJsFn))
    onOuterClick.foreach(p => __obj.updateDynamic("onOuterClick")(p.toJsFn))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onRenderBody != null) __obj.updateDynamic("onRenderBody")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderBody(t0, t1).runNow()))
    if (onRenderFooter != null) __obj.updateDynamic("onRenderFooter")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderFooter(t0, t1).runNow()))
    if (onRenderFooterContent != null) __obj.updateDynamic("onRenderFooterContent")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderFooterContent(t0, t1).runNow()))
    if (onRenderHeader != null) __obj.updateDynamic("onRenderHeader")(onRenderHeader.asInstanceOf[js.Any])
    if (onRenderNavigation != null) __obj.updateDynamic("onRenderNavigation")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderNavigation(t0, t1).runNow()))
    if (onRenderNavigationContent != null) __obj.updateDynamic("onRenderNavigationContent")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.panelTypesMod.IPanelProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderNavigationContent(t0, t1).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[
  typingsJapgolly.officeUiFabricReact.panelBaseMod.PanelBase with org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (overlayProps != null) __obj.updateDynamic("overlayProps")(overlayProps.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIPanelProps]
  }
}

