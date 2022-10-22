package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.officeUiFabricReact.anon.CheckboxVisibility
import typingsJapgolly.officeUiFabricReact.anon.CollapseAllVisibility
import typingsJapgolly.officeUiFabricReact.anon.IsSelectedOnFocus
import typingsJapgolly.officeUiFabricReact.anon.RequiredPickIShimmeredDet
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderBaseProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDotbaseMod.IDetailsListState
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsRowCheckProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsRowCheckStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsRowCheckStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.IDetailsRowState
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowBaseProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowFieldsDottypesMod.IDetailsRowFieldsProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListShimmeredDetailsListDottypesMod.IShimmeredDetailsListStyles
import typingsJapgolly.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneState
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDetailsListMod {
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "CheckboxVisibility")
  @js.native
  object CheckboxVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility & Double
      ] = js.native
    
    /* 1 */ val always: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.always & Double = js.native
    
    /* 2 */ val hidden: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.hidden & Double = js.native
    
    /* 0 */ val onHover: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.onHover & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility & Double
      ] = js.native
    
    /* 0 */ val hidden: typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility.hidden & Double = js.native
    
    /* 1 */ val visible: typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility.visible & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "ColumnActionsMode")
  @js.native
  object ColumnActionsMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode & Double
      ] = js.native
    
    /* 1 */ val clickable: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.clickable & Double = js.native
    
    /* 0 */ val disabled: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.disabled & Double = js.native
    
    /* 2 */ val hasDropdown: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.hasDropdown & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "ColumnDragEndLocation")
  @js.native
  object ColumnDragEndLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation & Double
      ] = js.native
    
    /* 2 */ val header: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.header & Double = js.native
    
    /* 0 */ val outside: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.outside & Double = js.native
    
    /* 1 */ val surface: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation.surface & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "ConstrainMode")
  @js.native
  object ConstrainMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ConstrainMode & Double
      ] = js.native
    
    /* 1 */ val horizontalConstrained: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ConstrainMode.horizontalConstrained & Double = js.native
    
    /* 0 */ val unconstrained: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ConstrainMode.unconstrained & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DEFAULT_CELL_STYLE_PROPS")
  @js.native
  val DEFAULT_CELL_STYLE_PROPS: ICellStyleProps = js.native
  
  object DEFAULT_ROW_HEIGHTS {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DEFAULT_ROW_HEIGHTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DEFAULT_ROW_HEIGHTS.compactRowHeight")
    @js.native
    def compactRowHeight: Double = js.native
    inline def compactRowHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compactRowHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DEFAULT_ROW_HEIGHTS.rowHeight")
    @js.native
    def rowHeight: Double = js.native
    inline def rowHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsColumn")
  @js.native
  val DetailsColumn: FunctionComponent[IDetailsColumnProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsColumnBase")
  @js.native
  open class DetailsColumnBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsDetailsListMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsHeader")
  @js.native
  val DetailsHeader: FunctionComponent[IDetailsHeaderBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsHeaderBase")
  @js.native
  open class DetailsHeaderBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsDetailsListMod.DetailsHeaderBase {
    def this(props: IDetailsHeaderBaseProps) = this()
  }
  /* static members */
  object DetailsHeaderBase {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsHeaderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsHeaderBase.defaultProps")
    @js.native
    def defaultProps: CollapseAllVisibility = js.native
    inline def defaultProps_=(x: CollapseAllVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsList")
  @js.native
  val DetailsList: FunctionComponent[IDetailsListProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListBase")
  @js.native
  open class DetailsListBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsDetailsListMod.DetailsListBase {
    def this(props: IDetailsListProps) = this()
  }
  /* static members */
  object DetailsListBase {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListBase.defaultProps")
    @js.native
    def defaultProps: CheckboxVisibility = js.native
    inline def defaultProps_=(x: CheckboxVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsListState]
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListLayoutMode")
  @js.native
  object DetailsListLayoutMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode & Double
      ] = js.native
    
    /* 0 */ val fixedColumns: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode.fixedColumns & Double = js.native
    
    /* 1 */ val justified: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode.justified & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRow")
  @js.native
  val DetailsRow: FunctionComponent[IDetailsRowBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowBase")
  @js.native
  open class DetailsRowBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsDetailsListMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
  }
  /* static members */
  object DetailsRowBase {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: IDetailsRowBaseProps, previousState: IDetailsRowState): IDetailsRowState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsRowState]
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowCheck")
  @js.native
  val DetailsRowCheck: FunctionComponent[IDetailsRowCheckProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowFields")
  @js.native
  val DetailsRowFields: FunctionComponent[IDetailsRowFieldsProps] = js.native
  
  object DetailsRowGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.cell")
    @js.native
    def cell: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.cellAnimation")
    @js.native
    def cellAnimation: String = js.native
    inline def cellAnimation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellAnimation")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.cellCheck")
    @js.native
    def cellCheck: String = js.native
    inline def cellCheck_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellCheck")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.cellMeasurer")
    @js.native
    def cellMeasurer: String = js.native
    inline def cellMeasurer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellMeasurer")(x.asInstanceOf[js.Any])
    
    inline def cell_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cell")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.check")
    @js.native
    def check: String = js.native
    inline def check_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("check")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.compact")
    @js.native
    def compact: String = js.native
    inline def compact_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compact")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.fields")
    @js.native
    def fields: String = js.native
    inline def fields_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.isCheckVisible")
    @js.native
    def isCheckVisible: String = js.native
    inline def isCheckVisible_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCheckVisible")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.isContentUnselectable")
    @js.native
    def isContentUnselectable: String = js.native
    inline def isContentUnselectable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isContentUnselectable")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.isRowHeader")
    @js.native
    def isRowHeader: String = js.native
    inline def isRowHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.isSelected")
    @js.native
    def isSelected: String = js.native
    inline def isSelected_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.listCellFirstChild")
    @js.native
    def listCellFirstChild: String = js.native
    inline def listCellFirstChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listCellFirstChild")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.root")
    @js.native
    def root: String = js.native
    inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectAllVisibility")
  @js.native
  object SelectAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility & Double
      ] = js.native
    
    /* 1 */ val hidden: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility.hidden & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility.none & Double = js.native
    
    /* 2 */ val visible: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility.visible & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "Selection")
  @js.native
  open class Selection[TItem] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsDetailsListMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: /* import warning: importer.ImportType#apply Failed type conversion: TItem extends @uifabric/utilities.@uifabric/utilities/lib/selection/Selection.types.IObjectWithKey ? [] | [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem>] : [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptionsWithRequiredGetKey<TItem>] */ js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection & Double
      ] = js.native
    
    /* 0 */ val horizontal: typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection.vertical & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode & Double
      ] = js.native
    
    /* 2 */ val multiple: typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.multiple & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.none & Double = js.native
    
    /* 1 */ val single: typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.single & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone")
  @js.native
  open class SelectionZone protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsDetailsListMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  /* static members */
  object SelectionZone {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone.defaultProps")
    @js.native
    def defaultProps: IsSelectedOnFocus = js.native
    inline def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ISelectionZoneState]
  }
  
  inline def buildColumns(
    items: js.Array[Any],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ ReactMouseEventFrom[HTMLElement], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildColumns")(items.asInstanceOf[js.Any], canResizeColumns.asInstanceOf[js.Any], onColumnClick.asInstanceOf[js.Any], sortedColumnKey.asInstanceOf[js.Any], isSortedDescending.asInstanceOf[js.Any], groupedColumnKey.asInstanceOf[js.Any], isMultiline.asInstanceOf[js.Any])).asInstanceOf[js.Array[IColumn]]
  
  inline def getDetailsColumnStyles(props: IDetailsColumnStyleProps): IDetailsColumnStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsColumnStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsColumnStyles]
  
  inline def getDetailsHeaderStyles(props: IDetailsHeaderStyleProps): IDetailsHeaderStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsHeaderStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsHeaderStyles]
  
  inline def getDetailsListStyles(props: IDetailsListStyleProps): IDetailsListStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsListStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsListStyles]
  
  inline def getDetailsRowCheckStyles(props: IDetailsRowCheckStyleProps): IDetailsRowCheckStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsRowCheckStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsRowCheckStyles]
  
  inline def getDetailsRowStyles(props: IDetailsRowStyleProps): IDetailsRowStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetailsRowStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsRowStyles]
  
  inline def getShimmeredDetailsListStyles(props: RequiredPickIShimmeredDet): IShimmeredDetailsListStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getShimmeredDetailsListStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IShimmeredDetailsListStyles]
}
