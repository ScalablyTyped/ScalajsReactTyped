package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typingsJapgolly.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.change
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typingsJapgolly.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/DetailsList", JSImport.Namespace)
@js.native
object libDetailsListMod extends js.Object {
  @js.native
  class DetailsColumnBase protected ()
    extends typingsJapgolly.officeUiFabricReact.detailsListMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @js.native
  class DetailsHeaderBase protected ()
    extends typingsJapgolly.officeUiFabricReact.detailsListMod.DetailsHeaderBase {
    def this(props: IDetailsHeaderBaseProps) = this()
  }
  
  @js.native
  class DetailsListBase protected ()
    extends typingsJapgolly.officeUiFabricReact.detailsListMod.DetailsListBase {
    def this(props: IDetailsListProps) = this()
  }
  
  @js.native
  class DetailsRowBase protected ()
    extends typingsJapgolly.officeUiFabricReact.detailsListMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
  }
  
  @js.native
  class Selection[TItem] protected ()
    extends typingsJapgolly.officeUiFabricReact.detailsListMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
  }
  
  @js.native
  class SelectionZone protected ()
    extends typingsJapgolly.officeUiFabricReact.detailsListMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  
  val DetailsHeader: FunctionComponent[IDetailsHeaderBaseProps] = js.native
  val DetailsList: FunctionComponent[IDetailsListProps] = js.native
  val DetailsRow: FunctionComponent[IDetailsRowBaseProps] = js.native
  val DetailsRowCheck: FunctionComponent[IDetailsRowCheckProps] = js.native
  val DetailsRowFields: FunctionComponent[IDetailsRowFieldsProps] = js.native
  val SELECTION_CHANGE: change = js.native
  def buildColumns(
    items: js.Array[_],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ ReactMouseEventFrom[HTMLElement], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = js.native
  @js.native
  object CheckboxVisibility extends js.Object {
    /* 1 */ val always: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.always with Double = js.native
    /* 2 */ val hidden: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.hidden with Double = js.native
    /* 0 */ val onHover: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.onHover with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility with Double
      ] = js.native
  }
  
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  @js.native
  object ColumnActionsMode extends js.Object {
    /* 1 */ val clickable: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.clickable with Double = js.native
    /* 0 */ val disabled: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.disabled with Double = js.native
    /* 2 */ val hasDropdown: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode with Double
      ] = js.native
  }
  
  @js.native
  object ColumnDragEndLocation extends js.Object {
    /* 2 */ val header: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.header with Double = js.native
    /* 0 */ val outside: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.outside with Double = js.native
    /* 1 */ val surface: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.surface with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation with Double
      ] = js.native
  }
  
  @js.native
  object ConstrainMode extends js.Object {
    /* 1 */ val horizontalConstrained: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
    /* 0 */ val unconstrained: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ConstrainMode.unconstrained with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ConstrainMode with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object DetailsHeaderBase extends js.Object {
    var defaultProps: AnonCollapseAllVisibility = js.native
  }
  
  /* static members */
  @js.native
  object DetailsListBase extends js.Object {
    var defaultProps: AnonCheckboxVisibility = js.native
  }
  
  @js.native
  object DetailsListLayoutMode extends js.Object {
    /* 0 */ val fixedColumns: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.fixedColumns with Double = js.native
    /* 1 */ val justified: typingsJapgolly.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.justified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode with Double
      ] = js.native
  }
  
  @js.native
  object DetailsRowGlobalClassNames extends js.Object {
    var cell: String = js.native
    var cellAnimation: String = js.native
    var cellCheck: String = js.native
    var cellMeasurer: String = js.native
    var check: String = js.native
    var compact: String = js.native
    var fields: String = js.native
    var isCheckVisible: String = js.native
    var isContentUnselectable: String = js.native
    var isRowHeader: String = js.native
    var isSelected: String = js.native
    var listCellFirstChild: String = js.native
    var root: String = js.native
  }
  
  @js.native
  object SelectAllVisibility extends js.Object {
    /* 1 */ val hidden: typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.hidden with Double = js.native
    /* 0 */ val none: typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.none with Double = js.native
    /* 2 */ val visible: typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility with Double
      ] = js.native
  }
  
  @js.native
  object SelectionDirection extends js.Object {
    /* 0 */ val horizontal: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionDirection with Double
      ] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 2 */ val multiple: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    /* 0 */ val none: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    /* 1 */ val single: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
  }
  
  /* static members */
  @js.native
  object SelectionZone extends js.Object {
    var defaultProps: AnonIsSelectedOnFocus = js.native
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
  
}

