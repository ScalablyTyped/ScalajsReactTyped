package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDotclassNamesMod.IMenuItemClassNames
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsContextualMenuContextualMenuItemDottypesMod {
  
  trait IContextualMenuItemProps
    extends StObject
       with HTMLAttributes[IContextualMenuItemProps] {
    
    /**
      * Classnames for different aspects of a menu item
      */
    var classNames: IMenuItemClassNames
    
    /**
      * Optional callback to access the IContextualMenuRenderItem interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IContextualMenuRenderItem]] = js.undefined
    
    /**
      * This prop will get set by ContextualMenu and can be called to close the menu this item belongs to.
      * If dismissAll is true, all menus will be closed.
      */
    var dismissMenu: js.UndefOr[
        js.Function2[/* ev */ js.UndefOr[Any], /* dismissAll */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /**
      * This prop will get set by ContextualMenu and can be called to close this item's subMenu, if present.
      */
    var dismissSubMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * This prop will get set by the wrapping component and will return the element that wraps this ContextualMenuItem.
      * Used for openSubMenu.
      */
    var getSubmenuTarget: js.UndefOr[js.Function0[js.UndefOr[HTMLElement]]] = js.undefined
    
    /**
      * If this item has icons
      */
    var hasIcons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Index of the item
      */
    var index: Double
    
    /**
      * The item to display
      */
    var item: IContextualMenuItem
    
    /**
      * Click handler for the checkmark
      */
    var onCheckmarkClick: js.UndefOr[
        js.Function2[/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], Unit]
      ] = js.undefined
    
    /**
      * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
      */
    var openSubMenu: js.UndefOr[js.Function2[/* item */ Any, /* target */ HTMLElement, Unit]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IContextualMenuItemProps {
    
    inline def apply(classNames: IMenuItemClassNames, index: Double, item: IContextualMenuItem): IContextualMenuItemProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuItemProps]
    }
    
    extension [Self <: IContextualMenuItemProps](x: Self) {
      
      inline def setClassNames(value: IMenuItemClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setComponentRef(value: IRefObject[IContextualMenuRenderItem]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IContextualMenuRenderItem | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IContextualMenuRenderItem | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDismissMenu(value: (/* ev */ js.UndefOr[Any], /* dismissAll */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "dismissMenu", js.Any.fromFunction2((t0: /* ev */ js.UndefOr[Any], t1: /* dismissAll */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setDismissMenuUndefined: Self = StObject.set(x, "dismissMenu", js.undefined)
      
      inline def setDismissSubMenu(value: Callback): Self = StObject.set(x, "dismissSubMenu", value.toJsFn)
      
      inline def setDismissSubMenuUndefined: Self = StObject.set(x, "dismissSubMenu", js.undefined)
      
      inline def setGetSubmenuTarget(value: CallbackTo[js.UndefOr[HTMLElement]]): Self = StObject.set(x, "getSubmenuTarget", value.toJsFn)
      
      inline def setGetSubmenuTargetUndefined: Self = StObject.set(x, "getSubmenuTarget", js.undefined)
      
      inline def setHasIcons(value: Boolean): Self = StObject.set(x, "hasIcons", value.asInstanceOf[js.Any])
      
      inline def setHasIconsUndefined: Self = StObject.set(x, "hasIcons", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: IContextualMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOnCheckmarkClick(value: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onCheckmarkClick", js.Any.fromFunction2((t0: /* item */ IContextualMenuItem, t1: /* ev */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnCheckmarkClickUndefined: Self = StObject.set(x, "onCheckmarkClick", js.undefined)
      
      inline def setOpenSubMenu(value: (/* item */ Any, /* target */ HTMLElement) => Callback): Self = StObject.set(x, "openSubMenu", js.Any.fromFunction2((t0: /* item */ Any, t1: /* target */ HTMLElement) => (value(t0, t1)).runNow()))
      
      inline def setOpenSubMenuUndefined: Self = StObject.set(x, "openSubMenu", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IContextualMenuItemStyleProps => DeepPartial[IContextualMenuItemStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IContextualMenuItemRenderFunctions extends StObject {
    
    /**
      * Rendering function for check mark icon
      */
    def renderCheckMarkIcon(props: IContextualMenuItemProps): Node = js.native
    def renderCheckMarkIcon(props: IContextualMenuItemProps, customClassNames: js.Array[String]): Node = js.native
    
    /**
      * Rendering function for item icon
      */
    def renderItemIcon(props: IContextualMenuItemProps): Node = js.native
    def renderItemIcon(props: IContextualMenuItemProps, customClassNames: js.Array[String]): Node = js.native
    
    /**
      * Rendering function for item label
      */
    def renderItemName(props: IContextualMenuItemProps): Node = js.native
    def renderItemName(props: IContextualMenuItemProps, customClassNames: js.Array[String]): Node = js.native
    
    /**
      * Rendering function for secondary text label
      */
    def renderSecondaryText(props: IContextualMenuItemProps): Node = js.native
    def renderSecondaryText(props: IContextualMenuItemProps, customClassNames: js.Array[String]): Node = js.native
    
    /**
      * Rendering function for submenu icon
      */
    def renderSubMenuIcon(props: IContextualMenuItemProps): Node = js.native
    def renderSubMenuIcon(props: IContextualMenuItemProps, customClassNames: js.Array[String]): Node = js.native
  }
  
  trait IContextualMenuItemStyleProps extends StObject {
    
    /**
      * Whether or not the menu item is checked.
      */
    var checked: Boolean
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the menu item is disabled.
      */
    var disabled: Boolean
    
    /**
      * The optional class name to apply to the divider element.
      */
    var dividerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the menu item is expanded.
      */
    var expanded: Boolean
    
    /**
      * The optional class name to apply to the icon element.
      */
    var iconClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if a menu item is an anchor link.
      */
    var isAnchorLink: Boolean
    
    /**
      * The optional class name to apply to the item element.
      */
    var itemClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if the icon used is of the known set of icons.
      */
    var knownIcon: Boolean
    
    /**
      * Whether or not the primary section of a split menu item is disabled.
      */
    var primaryDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The optional class name to apply to the sub-menu if present.
      */
    var subMenuClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme
  }
  object IContextualMenuItemStyleProps {
    
    inline def apply(
      checked: Boolean,
      disabled: Boolean,
      expanded: Boolean,
      isAnchorLink: Boolean,
      knownIcon: Boolean,
      theme: ITheme
    ): IContextualMenuItemStyleProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isAnchorLink = isAnchorLink.asInstanceOf[js.Any], knownIcon = knownIcon.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuItemStyleProps]
    }
    
    extension [Self <: IContextualMenuItemStyleProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDividerClassName(value: String): Self = StObject.set(x, "dividerClassName", value.asInstanceOf[js.Any])
      
      inline def setDividerClassNameUndefined: Self = StObject.set(x, "dividerClassName", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      inline def setIsAnchorLink(value: Boolean): Self = StObject.set(x, "isAnchorLink", value.asInstanceOf[js.Any])
      
      inline def setItemClassName(value: String): Self = StObject.set(x, "itemClassName", value.asInstanceOf[js.Any])
      
      inline def setItemClassNameUndefined: Self = StObject.set(x, "itemClassName", js.undefined)
      
      inline def setKnownIcon(value: Boolean): Self = StObject.set(x, "knownIcon", value.asInstanceOf[js.Any])
      
      inline def setPrimaryDisabled(value: Boolean): Self = StObject.set(x, "primaryDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrimaryDisabledUndefined: Self = StObject.set(x, "primaryDisabled", js.undefined)
      
      inline def setSubMenuClassName(value: String): Self = StObject.set(x, "subMenuClassName", value.asInstanceOf[js.Any])
      
      inline def setSubMenuClassNameUndefined: Self = StObject.set(x, "subMenuClassName", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IContextualMenuItemStyles
    extends StObject
       with IButtonStyles {
    
    /**
      * Styles for a menu item that is an anchor link.
      */
    var anchorLink: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Default style for checkmark icons.
      */
    var checkmarkIcon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles for a divider item of a ContextualMenu.
      */
    var divider: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Default icon color style for known icons.
      */
    var iconColor: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles for a menu item that is an anchor link.
      */
    var item: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles for the content inside the button/link of the menuItem.
      */
    var linkContent: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles for a menu item that is a link.
      */
    var linkContentMenu: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles for the container of a split menu item.
      */
    var splitContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles for the menu portion of a split menu item.
      */
    var splitMenu: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles for the primary portion of a split menu item.
      */
    var splitPrimary: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles for the submenu icon of a menu item.
      */
    var subMenuIcon: js.UndefOr[IStyle] = js.undefined
  }
  object IContextualMenuItemStyles {
    
    inline def apply(): IContextualMenuItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IContextualMenuItemStyles]
    }
    
    extension [Self <: IContextualMenuItemStyles](x: Self) {
      
      inline def setAnchorLink(value: IStyle): Self = StObject.set(x, "anchorLink", value.asInstanceOf[js.Any])
      
      inline def setAnchorLinkNull: Self = StObject.set(x, "anchorLink", null)
      
      inline def setAnchorLinkUndefined: Self = StObject.set(x, "anchorLink", js.undefined)
      
      inline def setCheckmarkIcon(value: IStyle): Self = StObject.set(x, "checkmarkIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkIconNull: Self = StObject.set(x, "checkmarkIcon", null)
      
      inline def setCheckmarkIconUndefined: Self = StObject.set(x, "checkmarkIcon", js.undefined)
      
      inline def setDivider(value: IStyle): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerNull: Self = StObject.set(x, "divider", null)
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setIconColor(value: IStyle): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorNull: Self = StObject.set(x, "iconColor", null)
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setItem(value: IStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemNull: Self = StObject.set(x, "item", null)
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setLinkContent(value: IStyle): Self = StObject.set(x, "linkContent", value.asInstanceOf[js.Any])
      
      inline def setLinkContentMenu(value: IStyle): Self = StObject.set(x, "linkContentMenu", value.asInstanceOf[js.Any])
      
      inline def setLinkContentMenuNull: Self = StObject.set(x, "linkContentMenu", null)
      
      inline def setLinkContentMenuUndefined: Self = StObject.set(x, "linkContentMenu", js.undefined)
      
      inline def setLinkContentNull: Self = StObject.set(x, "linkContent", null)
      
      inline def setLinkContentUndefined: Self = StObject.set(x, "linkContent", js.undefined)
      
      inline def setSplitContainer(value: IStyle): Self = StObject.set(x, "splitContainer", value.asInstanceOf[js.Any])
      
      inline def setSplitContainerNull: Self = StObject.set(x, "splitContainer", null)
      
      inline def setSplitContainerUndefined: Self = StObject.set(x, "splitContainer", js.undefined)
      
      inline def setSplitMenu(value: IStyle): Self = StObject.set(x, "splitMenu", value.asInstanceOf[js.Any])
      
      inline def setSplitMenuNull: Self = StObject.set(x, "splitMenu", null)
      
      inline def setSplitMenuUndefined: Self = StObject.set(x, "splitMenu", js.undefined)
      
      inline def setSplitPrimary(value: IStyle): Self = StObject.set(x, "splitPrimary", value.asInstanceOf[js.Any])
      
      inline def setSplitPrimaryNull: Self = StObject.set(x, "splitPrimary", null)
      
      inline def setSplitPrimaryUndefined: Self = StObject.set(x, "splitPrimary", js.undefined)
      
      inline def setSubMenuIcon(value: IStyle): Self = StObject.set(x, "subMenuIcon", value.asInstanceOf[js.Any])
      
      inline def setSubMenuIconNull: Self = StObject.set(x, "subMenuIcon", null)
      
      inline def setSubMenuIconUndefined: Self = StObject.set(x, "subMenuIcon", js.undefined)
    }
  }
  
  @js.native
  trait IContextualMenuRenderItem extends StObject {
    
    /**
      * Dismiss the menu this item belongs to.
      */
    def dismissMenu(): Unit = js.native
    def dismissMenu(dismissAll: Boolean): Unit = js.native
    
    /**
      * Function to close this item's subMenu, if present.
      */
    def dismissSubMenu(): Unit = js.native
    
    /**
      * Function to open this item's subMenu, if present.
      */
    def openSubMenu(): Unit = js.native
  }
}
