package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactSelect.anon.Children
import typingsJapgolly.reactSelect.anon.Cx
import typingsJapgolly.reactSelect.anon.GetPortalPlacement
import typingsJapgolly.reactSelect.anon.Left
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CoercedMenuPlacement
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CommonProps
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.MenuPlacement
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.MenuPosition
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsMenuMod {
  
  @JSImport("react-select/dist/declarations/src/components/Menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: MenuProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object LoadingMessage {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: NoticeProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "LoadingMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "LoadingMessage.defaultProps")
    @js.native
    def defaultProps: Children = js.native
    inline def defaultProps_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def MenuList[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: MenuListProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuList")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-select/dist/declarations/src/components/Menu", "MenuPlacer")
  @js.native
  open class MenuPlacer[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] protected () extends Component[MenuPlacerProps[Option, IsMulti, Group], MenuState, Any] {
    def this(props: MenuPlacerProps[Option, IsMulti, Group]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuPlacerProps[Option, IsMulti, Group], context: Any) = this()
    
    @JSName("context")
    var context_MenuPlacer: ContextType[Context[GetPortalPlacement]] = js.native
    
    var getPlacement: RefFn[HTMLDivElement] = js.native
    
    def getUpdatedProps(): Cx[Option, IsMulti, Group] = js.native
  }
  /* static members */
  object MenuPlacer {
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "MenuPlacer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "MenuPlacer.contextType")
    @js.native
    def contextType: Context[GetPortalPlacement] = js.native
    inline def contextType_=(x: Context[GetPortalPlacement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  inline def MenuPortal[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
    hasAppendToChildrenClassNameControlElementCxInnerPropsMenuPlacementMenuPositionGetStyles: MenuPortalProps[Option, IsMulti, Group]
  ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuPortal")(hasAppendToChildrenClassNameControlElementCxInnerPropsMenuPlacementMenuPositionGetStyles.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object NoOptionsMessage {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: NoticeProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "NoOptionsMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "NoOptionsMessage.defaultProps")
    @js.native
    def defaultProps: Children = js.native
    inline def defaultProps_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getMenuPlacement(hasMaxHeightMenuElMinHeightPlacementShouldScrollIsFixedPositionTheme: PlacementArgs): CalculatedMenuPlacementAndHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuPlacement")(hasMaxHeightMenuElMinHeightPlacementShouldScrollIsFixedPositionTheme.asInstanceOf[js.Any]).asInstanceOf[CalculatedMenuPlacementAndHeight]
  
  inline def loadingMessageCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasHasHasBaseUnitColors: NoticeProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("loadingMessageCSS")(hasHasHasBaseUnitColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def menuCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasPlacementHasBorderRadiusSpacingColors: MenuProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("menuCSS")(hasPlacementHasBorderRadiusSpacingColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def menuListCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasMaxHeightHasHasBaseUnit: MenuListProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("menuListCSS")(hasMaxHeightHasHasBaseUnit.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def menuPortalCSS(hasRectOffsetPosition: PortalStyleArgs): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("menuPortalCSS")(hasRectOffsetPosition.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def noOptionsMessageCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasHasHasBaseUnitColors: NoticeProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("noOptionsMessageCSS")(hasHasHasBaseUnitColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  trait CalculatedMenuPlacementAndHeight extends StObject {
    
    var maxHeight: Double
    
    var placement: CoercedMenuPlacement
  }
  object CalculatedMenuPlacementAndHeight {
    
    inline def apply(maxHeight: Double, placement: CoercedMenuPlacement): CalculatedMenuPlacementAndHeight = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculatedMenuPlacementAndHeight]
    }
    
    extension [Self <: CalculatedMenuPlacementAndHeight](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: CoercedMenuPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChildrenProps extends StObject {
    
    var placerProps: PlacerProps
    
    var ref: RefFn[HTMLDivElement]
  }
  object ChildrenProps {
    
    inline def apply(placerProps: PlacerProps, ref: HTMLDivElement | Null => Callback): ChildrenProps = {
      val __obj = js.Dynamic.literal(placerProps = placerProps.asInstanceOf[js.Any], ref = js.Any.fromFunction1((t0: HTMLDivElement | Null) => ref(t0).runNow()))
      __obj.asInstanceOf[ChildrenProps]
    }
    
    extension [Self <: ChildrenProps](x: Self) {
      
      inline def setPlacerProps(value: PlacerProps): Self = StObject.set(x, "placerProps", value.asInstanceOf[js.Any])
      
      inline def setRef(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait MenuListProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: Node = js.native
    
    /** The currently focused option */
    var focusedOption: Option = js.native
    
    /** Props to be passed to the menu-list wrapper. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Inner ref to DOM ReactNode */
    var innerRef: RefFn[HTMLDivElement] = js.native
    
    /** Set the max height of the Menu component  */
    var maxHeight: Double = js.native
  }
  
  trait MenuPlacementProps extends StObject {
    
    /** Set the maximum height of the menu. */
    var maxMenuHeight: Double
    
    /** Set whether the menu should be at the top, at the bottom. The auto options sets it to bottom. */
    var menuPlacement: MenuPlacement
    
    /** The CSS position value of the menu, when "fixed" extra layout management is required */
    var menuPosition: MenuPosition
    
    /** Set whether the page should scroll to show the menu. */
    var menuShouldScrollIntoView: Boolean
    
    /** Set the minimum height of the menu. */
    var minMenuHeight: Double
  }
  object MenuPlacementProps {
    
    inline def apply(
      maxMenuHeight: Double,
      menuPlacement: MenuPlacement,
      menuPosition: MenuPosition,
      menuShouldScrollIntoView: Boolean,
      minMenuHeight: Double
    ): MenuPlacementProps = {
      val __obj = js.Dynamic.literal(maxMenuHeight = maxMenuHeight.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], menuShouldScrollIntoView = menuShouldScrollIntoView.asInstanceOf[js.Any], minMenuHeight = minMenuHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuPlacementProps]
    }
    
    extension [Self <: MenuPlacementProps](x: Self) {
      
      inline def setMaxMenuHeight(value: Double): Self = StObject.set(x, "maxMenuHeight", value.asInstanceOf[js.Any])
      
      inline def setMenuPlacement(value: MenuPlacement): Self = StObject.set(x, "menuPlacement", value.asInstanceOf[js.Any])
      
      inline def setMenuPosition(value: MenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      inline def setMenuShouldScrollIntoView(value: Boolean): Self = StObject.set(x, "menuShouldScrollIntoView", value.asInstanceOf[js.Any])
      
      inline def setMinMenuHeight(value: Double): Self = StObject.set(x, "minMenuHeight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MenuPlacerProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonProps[Option, IsMulti, Group]
       with MenuPlacementProps {
    
    /** The children to be rendered. */
    def children(childrenProps: ChildrenProps): Node = js.native
  }
  
  @js.native
  trait MenuPortalProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    var appendTo: js.UndefOr[HTMLElement] = js.native
    
    var children: Node = js.native
    
    var controlElement: HTMLDivElement | Null = js.native
    
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var menuPlacement: MenuPlacement = js.native
    
    var menuPosition: MenuPosition = js.native
  }
  
  @js.native
  trait MenuProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group]
       with MenuPlacementProps {
    
    /** The children to be rendered. */
    var children: Node = js.native
    
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Reference to the internal element, consumed by the MenuPlacer component */
    var innerRef: RefFn[HTMLDivElement] = js.native
    
    var isLoading: Boolean = js.native
    
    var placement: CoercedMenuPlacement = js.native
  }
  
  trait MenuState extends StObject {
    
    var maxHeight: Double
    
    var placement: CoercedMenuPlacement | Null
  }
  object MenuState {
    
    inline def apply(maxHeight: Double): MenuState = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], placement = null)
      __obj.asInstanceOf[MenuState]
    }
    
    extension [Self <: MenuState](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: CoercedMenuPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementNull: Self = StObject.set(x, "placement", null)
    }
  }
  
  @js.native
  trait NoticeProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: Node = js.native
    
    /** Props to be passed on to the wrapper. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
  }
  
  trait PlacementArgs extends StObject {
    
    var isFixedPosition: Boolean
    
    var maxHeight: Double
    
    var menuEl: HTMLDivElement | Null
    
    var minHeight: Double
    
    var placement: MenuPlacement
    
    var shouldScroll: Boolean
    
    var theme: Theme
  }
  object PlacementArgs {
    
    inline def apply(
      isFixedPosition: Boolean,
      maxHeight: Double,
      minHeight: Double,
      placement: MenuPlacement,
      shouldScroll: Boolean,
      theme: Theme
    ): PlacementArgs = {
      val __obj = js.Dynamic.literal(isFixedPosition = isFixedPosition.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], menuEl = null)
      __obj.asInstanceOf[PlacementArgs]
    }
    
    extension [Self <: PlacementArgs](x: Self) {
      
      inline def setIsFixedPosition(value: Boolean): Self = StObject.set(x, "isFixedPosition", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMenuEl(value: HTMLDivElement): Self = StObject.set(x, "menuEl", value.asInstanceOf[js.Any])
      
      inline def setMenuElNull: Self = StObject.set(x, "menuEl", null)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: MenuPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setShouldScroll(value: Boolean): Self = StObject.set(x, "shouldScroll", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlacerProps extends StObject {
    
    var maxHeight: Double
    
    var placement: CoercedMenuPlacement
  }
  object PlacerProps {
    
    inline def apply(maxHeight: Double, placement: CoercedMenuPlacement): PlacerProps = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlacerProps]
    }
    
    extension [Self <: PlacerProps](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: CoercedMenuPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  trait PortalStyleArgs extends StObject {
    
    var offset: Double
    
    var position: MenuPosition
    
    var rect: Left
  }
  object PortalStyleArgs {
    
    inline def apply(offset: Double, position: MenuPosition, rect: Left): PortalStyleArgs = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalStyleArgs]
    }
    
    extension [Self <: PortalStyleArgs](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: MenuPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRect(value: Left): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
}
