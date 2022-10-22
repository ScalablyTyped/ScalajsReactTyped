package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.officeUiFabricReact.anon.Callback
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupFooterDottypesMod.IGroupFooterProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupHeaderDottypesMod.IGroupHeaderProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupShowAllDottypesMod.IGroupShowAllProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupRenderProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListStyles
import typingsJapgolly.officeUiFabricReact.libComponentsListListDottypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.uifabricMergeStyles.libIstylesetMod.IProcessedStyleSet
import typingsJapgolly.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGroupedListGroupedListSectionMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListSection", "GroupedListSection")
  @js.native
  open class GroupedListSection protected () extends Component[IGroupedListSectionProps, IGroupedListSectionState, Any] {
    def this(props: IGroupedListSectionProps) = this()
    
    /* private */ var _dragDropSubscription: Any = js.native
    
    /* private */ var _droppingClassName: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /**
      * get the correct css class to reflect the dropping state for a given group
      *
      * If the group is the current drop target, return the default dropping class name
      * Otherwise, return '';
      *
      */
    /* private */ var _getDroppingClassName: Any = js.native
    
    /**
      * collect all the data we need to enable drag/drop for a group
      */
    /* private */ var _getGroupDragDropOptions: Any = js.native
    
    /* private */ var _getGroupKey: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _list: Any = js.native
    
    /* private */ var _onRenderGroup: Any = js.native
    
    /* private */ var _onRenderGroupCell: Any = js.native
    
    /* private */ var _onRenderGroupFooter: Any = js.native
    
    /* private */ var _onRenderGroupHeader: Any = js.native
    
    /* private */ var _onRenderGroupShowAll: Any = js.native
    
    /* private */ var _onSelectionChange: Any = js.native
    
    /* private */ var _renderSubGroup: Any = js.native
    
    /* private */ var _returnOne: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _subGroupRefs: Any = js.native
    
    /**
      * update groupIsDropping state based on the input value, which is used to change style during drag and drop
      *
      * @param newValue - new isDropping state value
      * @param event - the event trigger dropping state change which can be dragenter, dragleave etc
      */
    /* private */ var _updateDroppingState: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MGroupedListSection(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MGroupedListSection(previousProps: IGroupedListSectionProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGroupedListSection(): Unit = js.native
    
    def forceListUpdate(): Unit = js.native
  }
  
  @js.native
  trait IGroupedListSectionProps
    extends StObject
       with ClassAttributes[GroupedListSection] {
    
    /** Whether to render in compact mode */
    var compact: js.UndefOr[Boolean] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Map of callback functions related to drag and drop functionality. */
    var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
    
    /** helper to manage drag/drop across item rows and groups */
    var dragDropHelper: js.UndefOr[IDragDropHelper] = js.native
    
    /** Event names and corresponding callbacks that will be registered to the group and the rendered elements */
    var eventsToRegister: js.UndefOr[js.Array[Callback]] = js.native
    
    /** Information to pass in to the group footer. */
    var footerProps: js.UndefOr[IGroupFooterProps] = js.native
    
    /** Grouping item limit. */
    var getGroupItemLimit: js.UndefOr[js.Function1[/* group */ IGroup, Double]] = js.native
    
    /** Optional grouping instructions. */
    var group: js.UndefOr[IGroup] = js.native
    
    /** Optional grouping instructions. */
    var groupIndex: js.UndefOr[Double] = js.native
    
    /** Optional group nesting level. */
    var groupNestingDepth: js.UndefOr[Double] = js.native
    
    /** Optional override properties to render groups. */
    var groupProps: js.UndefOr[IGroupRenderProps] = js.native
    
    /** GroupedList resolved class names */
    var groupedListClassNames: js.UndefOr[IProcessedStyleSet[IGroupedListStyles]] = js.native
    
    /** Stores parent group's children. */
    var groups: js.UndefOr[js.Array[IGroup]] = js.native
    
    /** Information to pass in to the group header. */
    var headerProps: js.UndefOr[IGroupHeaderProps] = js.native
    
    /** List of items to render. */
    var items: js.Array[Any] = js.native
    
    /** Optional list props to pass to list renderer.  */
    var listProps: js.UndefOr[IListProps[Any]] = js.native
    
    /** Rendering callback to render the group items. */
    def onRenderCell(): Node = js.native
    def onRenderCell(nestingDepth: Double): Node = js.native
    def onRenderCell(nestingDepth: Double, item: Any): Node = js.native
    def onRenderCell(nestingDepth: Double, item: Any, index: Double): Node = js.native
    def onRenderCell(nestingDepth: Double, item: Unit, index: Double): Node = js.native
    def onRenderCell(nestingDepth: Unit, item: Any): Node = js.native
    def onRenderCell(nestingDepth: Unit, item: Any, index: Double): Node = js.native
    def onRenderCell(nestingDepth: Unit, item: Unit, index: Double): Node = js.native
    
    /** Override for rendering the group footer. */
    var onRenderGroupFooter: js.UndefOr[IRenderFunction[IGroupFooterProps]] = js.native
    
    /** Override for rendering the group header. */
    var onRenderGroupHeader: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.native
    
    /** Override for rendering the group Show All link. */
    var onRenderGroupShowAll: js.UndefOr[IRenderFunction[IGroupShowAllProps]] = js.native
    
    /**
      * Optional callback to determine whether the list should be rendered in full, or virtualized.
      * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
      * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for
      * smaller lists.
      * The default implementation will virtualize when this callback is not provided.
      */
    var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[Any], Boolean]] = js.native
    
    /** Optional selection model to track selection state.  */
    var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
    
    /** Controls how/if the details list manages selection. */
    var selectionMode: js.UndefOr[SelectionMode] = js.native
    
    /** Information to pass in to the group Show All footer. */
    var showAllProps: js.UndefOr[IGroupShowAllProps] = js.native
    
    /** Optional Viewport, provided by the parent component. */
    var viewport: js.UndefOr[IViewport] = js.native
  }
  
  trait IGroupedListSectionState extends StObject {
    
    var isDropping: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
  }
  object IGroupedListSectionState {
    
    inline def apply(): IGroupedListSectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupedListSectionState]
    }
    
    extension [Self <: IGroupedListSectionState](x: Self) {
      
      inline def setIsDropping(value: Boolean): Self = StObject.set(x, "isDropping", value.asInstanceOf[js.Any])
      
      inline def setIsDroppingUndefined: Self = StObject.set(x, "isDropping", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    }
  }
}
