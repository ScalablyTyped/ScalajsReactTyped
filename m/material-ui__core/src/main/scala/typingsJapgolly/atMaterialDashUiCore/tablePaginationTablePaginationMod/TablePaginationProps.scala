package typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTableHeaderCellElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.atMaterialDashUiCore.PartialClassNameMapTablePaginationClassKey
import typingsJapgolly.atMaterialDashUiCore.PartialIconButtonProps
import typingsJapgolly.atMaterialDashUiCore.PartialSelectProps
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`additions text`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`inline`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.additions
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.all
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ascending
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.assertive
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.baseline
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.body
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.both
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.center
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.copy
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.date
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.decimal
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.descending
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dialog
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.email
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.execute
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.footer
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grammar
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grid
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.head
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.horizontal
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.inherit
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.justify
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.link
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.list
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.listbox
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.location
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.menu
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.middle
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mixed
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.move
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.no
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.numeric
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.off
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.on
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.other
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.page
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.polite
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.popup
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.removals
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.search
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.spelling
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.step
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tel
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.text
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.time
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tree
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.url
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.vertical
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.yes
import typingsJapgolly.atMaterialDashUiCore.tableCellTableCellMod.Padding
import typingsJapgolly.atMaterialDashUiCore.tableCellTableCellMod.SortDirection
import typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.TablePaginationActionsProps
import typingsJapgolly.react.Anon_Html
import typingsJapgolly.react.NativeMouseEvent
import typingsJapgolly.react.reactMod.AnimationEventHandler
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.ChangeEventHandler
import typingsJapgolly.react.reactMod.ClipboardEventHandler
import typingsJapgolly.react.reactMod.CompositionEventHandler
import typingsJapgolly.react.reactMod.DragEventHandler
import typingsJapgolly.react.reactMod.FocusEventHandler
import typingsJapgolly.react.reactMod.FormEventHandler
import typingsJapgolly.react.reactMod.KeyboardEventHandler
import typingsJapgolly.react.reactMod.MouseEvent
import typingsJapgolly.react.reactMod.MouseEventHandler
import typingsJapgolly.react.reactMod.PointerEventHandler
import typingsJapgolly.react.reactMod.ReactEventHandler
import typingsJapgolly.react.reactMod.ReactType
import typingsJapgolly.react.reactMod.TouchEventHandler
import typingsJapgolly.react.reactMod.TransitionEventHandler
import typingsJapgolly.react.reactMod.UIEventHandler
import typingsJapgolly.react.reactMod.WheelEventHandler
import typingsJapgolly.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationBaseProps, @material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationClassKey, 'component'> */
@js.native
trait TablePaginationProps extends js.Object {
  var ActionsComponent: js.UndefOr[ReactType[TablePaginationActionsProps]] = js.native
  var SelectProps: js.UndefOr[PartialSelectProps] = js.native
  var about: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var align: js.UndefOr[inherit | left | center | right | justify] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var backIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
  var children: js.UndefOr[Node] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapTablePaginationClassKey] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var component: js.UndefOr[ReactType[TablePaginationBaseProps]] = js.native
  var contentEditable: js.UndefOr[Boolean] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var count: Double = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var innerRef: js.UndefOr[Ref | RefHandle[_]] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var labelDisplayedRows: js.UndefOr[js.Function1[/* paginationInfo */ LabelDisplayedRowsArgs, Node]] = js.native
  var labelRowsPerPage: js.UndefOr[Node] = js.native
  var lang: js.UndefOr[String] = js.native
  var nextIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onChangeRowsPerPage: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement | HTMLInputElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLTableHeaderCellElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLTableHeaderCellElement]] = js.native
  var padding: js.UndefOr[Padding] = js.native
  var page: Double = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var rowsPerPage: Double = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  var scope: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var sortDirection: js.UndefOr[SortDirection] = js.native
  var spellCheck: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var valign: js.UndefOr[top | middle | bottom | baseline] = js.native
  var variant: js.UndefOr[head | body | footer] = js.native
  var vocab: js.UndefOr[String] = js.native
  def onChangePage(event: Null, page: Double): Unit = js.native
  def onChangePage(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], page: Double): Unit = js.native
}

