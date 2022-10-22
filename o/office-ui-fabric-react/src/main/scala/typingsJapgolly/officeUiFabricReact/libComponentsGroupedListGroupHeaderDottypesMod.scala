package typingsJapgolly.officeUiFabricReact

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupDividerProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGroupedListGroupHeaderDottypesMod {
  
  trait IGroupHeaderCheckboxProps extends StObject {
    
    var checked: Boolean
    
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IGroupHeaderCheckboxProps {
    
    inline def apply(checked: Boolean): IGroupHeaderCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupHeaderCheckboxProps]
    }
    
    extension [Self <: IGroupHeaderCheckboxProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IGroupHeaderProps
    extends StObject
       with IGroupDividerProps {
    
    /** Defines the name of a custom icon to be used for group headers. If not set, the default icon will be used */
    var expandButtonIcon: js.UndefOr[String] = js.undefined
    
    /** GroupedList id for aria-controls */
    var groupedListId: js.UndefOr[String] = js.undefined
    
    /**
      * If provided, can be used to render a custom checkbox
      */
    var onRenderGroupHeaderCheckbox: js.UndefOr[IRenderFunction[IGroupHeaderCheckboxProps]] = js.undefined
    
    /** Native props for the GroupHeader select all button */
    var selectAllButtonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.undefined
    
    /** Style function to be passed in to override the themed or default styles */
    var styles: js.UndefOr[IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]] = js.undefined
    
    /**
      * Whether to use fast icon and check components. The icons can't be targeted by customization
      * but are still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.undefined
  }
  object IGroupHeaderProps {
    
    inline def apply(): IGroupHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupHeaderProps]
    }
    
    extension [Self <: IGroupHeaderProps](x: Self) {
      
      inline def setExpandButtonIcon(value: String): Self = StObject.set(x, "expandButtonIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandButtonIconUndefined: Self = StObject.set(x, "expandButtonIcon", js.undefined)
      
      inline def setGroupedListId(value: String): Self = StObject.set(x, "groupedListId", value.asInstanceOf[js.Any])
      
      inline def setGroupedListIdUndefined: Self = StObject.set(x, "groupedListId", js.undefined)
      
      inline def setOnRenderGroupHeaderCheckbox(
        value: (/* props */ js.UndefOr[IGroupHeaderCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderCheckboxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderGroupHeaderCheckbox", js.Any.fromFunction2(value))
      
      inline def setOnRenderGroupHeaderCheckboxUndefined: Self = StObject.set(x, "onRenderGroupHeaderCheckbox", js.undefined)
      
      inline def setSelectAllButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = StObject.set(x, "selectAllButtonProps", value.asInstanceOf[js.Any])
      
      inline def setSelectAllButtonPropsUndefined: Self = StObject.set(x, "selectAllButtonProps", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IGroupHeaderStyleProps => DeepPartial[IGroupHeaderStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      inline def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupHeader.types.IGroupHeaderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupHeader.types.IGroupHeaderProps, 'selected' | 'className'> & {  isCollapsed :boolean | undefined,   compact :boolean | undefined} */
  trait IGroupHeaderStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Whether the group header is in compact mode or not */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Is Header collapsed */
    var isCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IGroupHeaderStyleProps {
    
    inline def apply(theme: ITheme): IGroupHeaderStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupHeaderStyleProps]
    }
    
    extension [Self <: IGroupHeaderStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGroupHeaderStyles extends StObject {
    
    var check: IStyle
    
    var dropIcon: IStyle
    
    var expand: IStyle
    
    var expandIsCollapsed: IStyle
    
    var groupHeaderContainer: IStyle
    
    var headerCount: IStyle
    
    var root: IStyle
    
    var title: IStyle
  }
  object IGroupHeaderStyles {
    
    inline def apply(): IGroupHeaderStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupHeaderStyles]
    }
    
    extension [Self <: IGroupHeaderStyles](x: Self) {
      
      inline def setCheck(value: IStyle): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckNull: Self = StObject.set(x, "check", null)
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setDropIcon(value: IStyle): Self = StObject.set(x, "dropIcon", value.asInstanceOf[js.Any])
      
      inline def setDropIconNull: Self = StObject.set(x, "dropIcon", null)
      
      inline def setDropIconUndefined: Self = StObject.set(x, "dropIcon", js.undefined)
      
      inline def setExpand(value: IStyle): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandIsCollapsed(value: IStyle): Self = StObject.set(x, "expandIsCollapsed", value.asInstanceOf[js.Any])
      
      inline def setExpandIsCollapsedNull: Self = StObject.set(x, "expandIsCollapsed", null)
      
      inline def setExpandIsCollapsedUndefined: Self = StObject.set(x, "expandIsCollapsed", js.undefined)
      
      inline def setExpandNull: Self = StObject.set(x, "expand", null)
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setGroupHeaderContainer(value: IStyle): Self = StObject.set(x, "groupHeaderContainer", value.asInstanceOf[js.Any])
      
      inline def setGroupHeaderContainerNull: Self = StObject.set(x, "groupHeaderContainer", null)
      
      inline def setGroupHeaderContainerUndefined: Self = StObject.set(x, "groupHeaderContainer", js.undefined)
      
      inline def setHeaderCount(value: IStyle): Self = StObject.set(x, "headerCount", value.asInstanceOf[js.Any])
      
      inline def setHeaderCountNull: Self = StObject.set(x, "headerCount", null)
      
      inline def setHeaderCountUndefined: Self = StObject.set(x, "headerCount", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTitle(value: IStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
