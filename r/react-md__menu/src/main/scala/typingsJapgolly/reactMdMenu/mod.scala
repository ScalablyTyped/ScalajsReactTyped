package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdList.typesListMod.ListElement
import typingsJapgolly.reactMdMenu.anon.ReadonlyMenuBarContext
import typingsJapgolly.reactMdMenu.anon.ReadonlyMenuConfiguration
import typingsJapgolly.reactMdMenu.anon.ReadonlyMenuVisibilityCon
import typingsJapgolly.reactMdMenu.typesMenuBarMod.MenuBarProps
import typingsJapgolly.reactMdMenu.typesMenuBarProviderMod.MenuBarProviderProps
import typingsJapgolly.reactMdMenu.typesMenuBarWidgetMod.MenuBarWidgetProps
import typingsJapgolly.reactMdMenu.typesMenuButtonMod.MenuButtonProps
import typingsJapgolly.reactMdMenu.typesMenuConfigurationProviderMod.MenuConfigurationProviderProps
import typingsJapgolly.reactMdMenu.typesMenuItemButtonMod.MenuItemButtonProps
import typingsJapgolly.reactMdMenu.typesMenuItemGroupMod.MenuItemGroupProps
import typingsJapgolly.reactMdMenu.typesMenuItemLinkMod.MenuItemLinkProps
import typingsJapgolly.reactMdMenu.typesMenuItemLinkMod.MenuItemLinkWithComponentProps
import typingsJapgolly.reactMdMenu.typesMenuItemSeparatorMod.MenuItemSeparatorProps
import typingsJapgolly.reactMdMenu.typesMenuKeyboardFocusProviderMod.MenuKeyboardFocusProviderProps
import typingsJapgolly.reactMdMenu.typesMenuRendererMod.MenuRendererProps
import typingsJapgolly.reactMdMenu.typesMenuSheetMod.MenuSheetProps
import typingsJapgolly.reactMdMenu.typesMenuVisibilityProviderMod.MenuVisibilityProviderProps
import typingsJapgolly.reactMdMenu.typesTypesMod.DropdownMenuProps
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuConfiguration
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuItemProps
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuProps
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuWidgetProps
import typingsJapgolly.reactMdMenu.typesTypesMod.RenderMenuAsSheet
import typingsJapgolly.reactMdMenu.typesUseContextMenuMod.ContextMenuHookOptions
import typingsJapgolly.reactMdMenu.typesUseContextMenuMod.ContextMenuHookReturnValue
import typingsJapgolly.reactMdMenu.typesUseMenuMod.MenuHookOptions
import typingsJapgolly.reactMdMenu.typesUseMenuMod.MenuHookReturnValue
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetPosition
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetVerticalSize
import typingsJapgolly.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<@react-md/menu.@react-md/menu/types/types.MenuConfigurationContext> */
  object DEFAULT_MENU_CONFIGURATION {
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.horizontal")
    @js.native
    val horizontal: Boolean = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.renderAsSheet")
    @js.native
    val renderAsSheet: RenderMenuAsSheet = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.sheetFooter")
    @js.native
    val sheetFooter: Node = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.sheetHeader")
    @js.native
    val sheetHeader: Node = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.sheetPosition")
    @js.native
    val sheetPosition: SheetPosition = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.sheetVerticalSize")
    @js.native
    val sheetVerticalSize: SheetVerticalSize = js.native
  }
  
  inline def DropdownMenu(
    hasIdOnClickOnKeyDownOnMouseEnterOnMouseLeaveMenuLabelPropMenuPropsMenuStyleMenuClassNameSheetPropsSheetMenuPropsSheetStyleSheetClassNamePropSheetHeaderPropSheetFooterPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeListStyleListClassNameListPropsAppearEnterExitPropTimeoutClassNamesAnchorFixedPositionOptionsGetFixedPositionOptionsTemporaryPortalPortalIntoPortalIntoIdOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedPropHorizontalChildrenPreventScrollCloseOnResizeCloseOnScrollPropIconRotator: DropdownMenuProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DropdownMenu")(hasIdOnClickOnKeyDownOnMouseEnterOnMouseLeaveMenuLabelPropMenuPropsMenuStyleMenuClassNameSheetPropsSheetMenuPropsSheetStyleSheetClassNamePropSheetHeaderPropSheetFooterPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeListStyleListClassNameListPropsAppearEnterExitPropTimeoutClassNamesAnchorFixedPositionOptionsGetFixedPositionOptionsTemporaryPortalPortalIntoPortalIntoIdOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedPropHorizontalChildrenPreventScrollCloseOnResizeCloseOnScrollPropIconRotator.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/menu", "Menu")
  @js.native
  val Menu: ForwardRefExoticComponent[LabelRequiredForA11y[MenuProps] & RefAttributes[HTMLDivElement]] = js.native
  
  inline def MenuBar(hasHoverTimeoutProps: MenuBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBar")(hasHoverTimeoutProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MenuBarProvider(hasChildrenRootDefaultActiveIdHoverTimeout: MenuBarProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBarProvider")(hasChildrenRootDefaultActiveIdHoverTimeout.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MenuBarWidget(hasChildrenTabIndexPropOnFocusPropOnKeyDownProps: MenuBarWidgetProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBarWidget")(hasChildrenTabIndexPropOnFocusPropOnKeyDownProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/menu", "MenuButton")
  @js.native
  val MenuButton: ForwardRefExoticComponent[MenuButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  inline def MenuConfigurationProvider(hasChildrenConfiguration: MenuConfigurationProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuConfigurationProvider")(hasChildrenConfiguration.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/menu", "MenuItem")
  @js.native
  val MenuItem: ForwardRefExoticComponent[MenuItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItemButton")
  @js.native
  val MenuItemButton: ForwardRefExoticComponent[MenuItemButtonProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItemGroup")
  @js.native
  val MenuItemGroup: ForwardRefExoticComponent[MenuItemGroupProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItemLink")
  @js.native
  val MenuItemLink: ForwardRefExoticComponent[
    (MenuItemLinkProps & RefAttributes[HTMLAnchorElement]) | ((Pick[MenuItemLinkWithComponentProps, String | Double]) & RefAttributes[HTMLAnchorElement])
  ] = js.native
  
  @JSImport("@react-md/menu", "MenuItemSeparator")
  @js.native
  val MenuItemSeparator: ForwardRefExoticComponent[MenuItemSeparatorProps & RefAttributes[HTMLLIElement]] = js.native
  
  inline def MenuKeyboardFocusProvider(hasHorizontalChildren: MenuKeyboardFocusProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuKeyboardFocusProvider")(hasHorizontalChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MenuRenderer(
    hasMenuRefMenuPropsMenuStyleMenuClassNameSheetPropsPropSheetHeaderPropSheetFooterSheetStyleSheetClassNameSheetMenuPropsChildrenPropHorizontalPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeOnRequestCloseOnClickOnKeyDownProps: MenuRendererProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuRenderer")(hasMenuRefMenuPropsMenuStyleMenuClassNameSheetPropsPropSheetHeaderPropSheetFooterSheetStyleSheetClassNameSheetMenuPropsChildrenPropHorizontalPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeOnRequestCloseOnClickOnKeyDownProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MenuSheet(
    hasIdChildrenHeaderFooterHorizontalMenuRefMenuPropsListStyleListClassNameListPropsPositionVerticalSizeOnClickOverlayPropsOnRequestCloseProps: LabelRequiredForA11y[MenuSheetProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuSheet")(hasIdChildrenHeaderFooterHorizontalMenuRefMenuPropsListStyleListClassNameListPropsPositionVerticalSizeOnClickOverlayPropsOnRequestCloseProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MenuVisibilityProvider(hasVisibleSetVisibleChildren: MenuVisibilityProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuVisibilityProvider")(hasVisibleSetVisibleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/menu", "MenuWidget")
  @js.native
  val MenuWidget: ForwardRefExoticComponent[LabelRequiredForA11y[MenuWidgetProps] & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useContextMenu(): ContextMenuHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")().asInstanceOf[ContextMenuHookReturnValue]
  inline def useContextMenu(
    hasAnchorBaseIdMenuLabelFixedPositionOptionsOnContextMenuPreventScrollOptions: ContextMenuHookOptions
  ): ContextMenuHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")(hasAnchorBaseIdMenuLabelFixedPositionOptionsOnContextMenuPreventScrollOptions.asInstanceOf[js.Any]).asInstanceOf[ContextMenuHookReturnValue]
  
  inline def useMenu[ToggleEl /* <: HTMLElement */](options: MenuHookOptions[ToggleEl]): MenuHookReturnValue[ToggleEl] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenu")(options.asInstanceOf[js.Any]).asInstanceOf[MenuHookReturnValue[ToggleEl]]
  
  inline def useMenuBarContext(): ReadonlyMenuBarContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuBarContext")().asInstanceOf[ReadonlyMenuBarContext]
  
  inline def useMenuBarWidgetFocusId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuBarWidgetFocusId")().asInstanceOf[String]
  
  inline def useMenuConfiguration(): ReadonlyMenuConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuConfiguration")().asInstanceOf[ReadonlyMenuConfiguration]
  inline def useMenuConfiguration(hasHorizontalRenderAsSheetSheetHeaderSheetFooterSheetPositionSheetVerticalSize: MenuConfiguration): ReadonlyMenuConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuConfiguration")(hasHorizontalRenderAsSheetSheetHeaderSheetFooterSheetPositionSheetVerticalSize.asInstanceOf[js.Any]).asInstanceOf[ReadonlyMenuConfiguration]
  
  inline def useMenuVisibility(): ReadonlyMenuVisibilityCon = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuVisibility")().asInstanceOf[ReadonlyMenuVisibilityCon]
}
