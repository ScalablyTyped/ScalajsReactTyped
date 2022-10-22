package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.reactMdFormStrings.checkbox
import typingsJapgolly.reactMdForm.reactMdFormStrings.radio
import typingsJapgolly.reactMdForm.reactMdFormStrings.switch
import typingsJapgolly.reactMdList.typesGetListItemHeightMod.ListItemHeight
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonPosition
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuMenuItemInputToggleMod {
  
  @JSImport("@react-md/form/types/menu/MenuItemInputToggle", "MenuItemInputToggle")
  @js.native
  val MenuItemInputToggle: ForwardRefExoticComponent[StrictMenuItemInputToggleProps & RefAttributes[HTMLLIElement]] = js.native
  
  /**
    * @remarks \@since 2.8.0
    * @internal
    */
  /* Inlined std.Pick<@react-md/list.@react-md/list.SimpleListItemProps, 'disabledOpacity' | 'threeLines' | 'height' | 'children' | 'textChildren' | 'textClassName' | 'primaryText' | 'secondaryText' | 'secondaryTextClassName' | 'forceAddonWrap'> */
  trait AllowedListItemProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disabledOpacity: js.UndefOr[Boolean] = js.undefined
    
    var forceAddonWrap: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[ListItemHeight] = js.undefined
    
    var primaryText: js.UndefOr[Node] = js.undefined
    
    var secondaryText: js.UndefOr[Node] = js.undefined
    
    var secondaryTextClassName: js.UndefOr[String] = js.undefined
    
    var textChildren: js.UndefOr[Boolean] = js.undefined
    
    var textClassName: js.UndefOr[String] = js.undefined
    
    var threeLines: js.UndefOr[Boolean] = js.undefined
  }
  object AllowedListItemProps {
    
    inline def apply(): AllowedListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowedListItemProps]
    }
    
    extension [Self <: AllowedListItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabledOpacity(value: Boolean): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
      
      inline def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
      
      inline def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      inline def setHeight(value: ListItemHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPrimaryText(value: VdomNode): Self = StObject.set(x, "primaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrimaryTextNull: Self = StObject.set(x, "primaryText", null)
      
      inline def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      inline def setPrimaryTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "primaryText", js.Array(value*))
      
      inline def setPrimaryTextVdomElement(value: VdomElement): Self = StObject.set(x, "primaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSecondaryText(value: VdomNode): Self = StObject.set(x, "secondaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      inline def setSecondaryTextNull: Self = StObject.set(x, "secondaryText", null)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setSecondaryTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "secondaryText", js.Array(value*))
      
      inline def setSecondaryTextVdomElement(value: VdomElement): Self = StObject.set(x, "secondaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTextChildren(value: Boolean): Self = StObject.set(x, "textChildren", value.asInstanceOf[js.Any])
      
      inline def setTextChildrenUndefined: Self = StObject.set(x, "textChildren", js.undefined)
      
      inline def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      inline def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      inline def setThreeLines(value: Boolean): Self = StObject.set(x, "threeLines", value.asInstanceOf[js.Any])
      
      inline def setThreeLinesUndefined: Self = StObject.set(x, "threeLines", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.reactMdForm.typesMenuMenuItemInputToggleMod.AllowedListItemProps because var conflicts: children. Inlined threeLines, height, textChildren, textClassName, secondaryTextClassName, secondaryText, disabledOpacity, primaryText, forceAddonWrap */ trait BaseMenuItemInputToggleProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    /**
      * An optional {@link ListItem} addon to display on the opposite side of the
      * `icon`. So if the `iconAfter` prop is `false`, the `addon` will appear to
      * the `right` while setting `iconAfter` to `true` will render the `addon` to
      * the `left` instead.
      */
    var addon: js.UndefOr[Node] = js.undefined
    
    /**
      * The {@link ListItemAddonPosition} for the `addon`.
      */
    var addonPosition: js.UndefOr[ListItemAddonPosition] = js.undefined
    
    /**
      * The {@link ListItemAddonType} for the `addon`.
      */
    var addonType: js.UndefOr[ListItemAddonType] = js.undefined
    
    /**
      * Boolean if the element is currently checked.
      */
    var checked: Boolean
    
    /**
      * Boolean if the element should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledOpacity: js.UndefOr[Boolean] = js.undefined
    
    var forceAddonWrap: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[ListItemHeight] = js.undefined
    
    /**
      * The icon will default to:
      * - {@link ConfigurableIcons.radio} when the `type` is set to `"radio"`
      * - {@link ConfigurableIcons.checkbox} when the `type` is set to `"checkbox"`
      * - {@link SwitchTrack} when the `type` is set to `"switch"`
      *
      * If this behavior isn't preferred, you can provide your own icon with this
      * prop.
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * Boolean if the `icon` prop should appear as the `rightAddon` instead of the
      * `leftAddon` for the `ListItem`
      */
    var iconAfter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An id required for a11y.
      */
    @JSName("id")
    var id_BaseMenuItemInputToggleProps: String
    
    /**
      * A function to call that should updated the `checked` state to the new
      * value.
      */
    def onCheckedChange(checked: Boolean, event: ReactMouseEventFrom[HTMLLIElement]): Unit
    
    var primaryText: js.UndefOr[Node] = js.undefined
    
    var secondaryText: js.UndefOr[Node] = js.undefined
    
    var secondaryTextClassName: js.UndefOr[String] = js.undefined
    
    var textChildren: js.UndefOr[Boolean] = js.undefined
    
    var textClassName: js.UndefOr[String] = js.undefined
    
    var threeLines: js.UndefOr[Boolean] = js.undefined
  }
  object BaseMenuItemInputToggleProps {
    
    inline def apply(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, ReactMouseEventFrom[HTMLLIElement]) => Callback
    ): BaseMenuItemInputToggleProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2((t0: Boolean, t1: ReactMouseEventFrom[HTMLLIElement]) => (onCheckedChange(t0, t1)).runNow()))
      __obj.asInstanceOf[BaseMenuItemInputToggleProps]
    }
    
    extension [Self <: BaseMenuItemInputToggleProps](x: Self) {
      
      inline def setAddon(value: VdomNode): Self = StObject.set(x, "addon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAddonNull: Self = StObject.set(x, "addon", null)
      
      inline def setAddonPosition(value: ListItemAddonPosition): Self = StObject.set(x, "addonPosition", value.asInstanceOf[js.Any])
      
      inline def setAddonPositionUndefined: Self = StObject.set(x, "addonPosition", js.undefined)
      
      inline def setAddonType(value: ListItemAddonType): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
      
      inline def setAddonTypeUndefined: Self = StObject.set(x, "addonType", js.undefined)
      
      inline def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      inline def setAddonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "addon", js.Array(value*))
      
      inline def setAddonVdomElement(value: VdomElement): Self = StObject.set(x, "addon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledOpacity(value: Boolean): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
      
      inline def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      inline def setHeight(value: ListItemHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnCheckedChange(value: (Boolean, ReactMouseEventFrom[HTMLLIElement]) => Callback): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction2((t0: Boolean, t1: ReactMouseEventFrom[HTMLLIElement]) => (value(t0, t1)).runNow()))
      
      inline def setPrimaryText(value: VdomNode): Self = StObject.set(x, "primaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrimaryTextNull: Self = StObject.set(x, "primaryText", null)
      
      inline def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      inline def setPrimaryTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "primaryText", js.Array(value*))
      
      inline def setPrimaryTextVdomElement(value: VdomElement): Self = StObject.set(x, "primaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSecondaryText(value: VdomNode): Self = StObject.set(x, "secondaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      inline def setSecondaryTextNull: Self = StObject.set(x, "secondaryText", null)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setSecondaryTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "secondaryText", js.Array(value*))
      
      inline def setSecondaryTextVdomElement(value: VdomElement): Self = StObject.set(x, "secondaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTextChildren(value: Boolean): Self = StObject.set(x, "textChildren", value.asInstanceOf[js.Any])
      
      inline def setTextChildrenUndefined: Self = StObject.set(x, "textChildren", js.undefined)
      
      inline def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      inline def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      inline def setThreeLines(value: Boolean): Self = StObject.set(x, "threeLines", value.asInstanceOf[js.Any])
      
      inline def setThreeLinesUndefined: Self = StObject.set(x, "threeLines", js.undefined)
    }
  }
  
  trait MenuItemInputToggleProps
    extends StObject
       with BaseMenuItemInputToggleProps {
    
    /**
      * The input toggle type to render.
      *
      * Note for the `radio` type:
      * If a `menu` or `menubar` contains more than one group of `menuitemradio`
      * elements, or if the `menu` contains one group and other, unrelated menu
      * items, authors **SHOULD** nest each set of related `menuitemradio` elements
      * in an element using the `group` role, and authors **SHOULD** delimit the
      * group from other menu items with an element using the separator role.
      *
      * @see {@link https://www.w3.org/TR/wai-aria-1.1/#menuitemradio}
      */
    var `type`: checkbox | radio | switch
  }
  object MenuItemInputToggleProps {
    
    inline def apply(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, ReactMouseEventFrom[HTMLLIElement]) => Callback,
      `type`: checkbox | radio | switch
    ): MenuItemInputToggleProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2((t0: Boolean, t1: ReactMouseEventFrom[HTMLLIElement]) => (onCheckedChange(t0, t1)).runNow()))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemInputToggleProps]
    }
    
    extension [Self <: MenuItemInputToggleProps](x: Self) {
      
      inline def setType(value: checkbox | radio | switch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdForm.anon.typecheckboxIndeterminate_
    - typingsJapgolly.reactMdForm.anon.typeradioswitchindetermin
  */
  trait StrictMenuItemInputToggleProps extends StObject
  object StrictMenuItemInputToggleProps {
    
    inline def typecheckboxIndeterminate_(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, ReactMouseEventFrom[HTMLLIElement]) => Callback
    ): typingsJapgolly.reactMdForm.anon.typecheckboxIndeterminate_ = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2((t0: Boolean, t1: ReactMouseEventFrom[HTMLLIElement]) => (onCheckedChange(t0, t1)).runNow()))
      __obj.updateDynamic("type")("checkbox")
      __obj.asInstanceOf[typingsJapgolly.reactMdForm.anon.typecheckboxIndeterminate_]
    }
    
    inline def typeradioswitchindetermin(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, ReactMouseEventFrom[HTMLLIElement]) => Callback,
      `type`: radio | switch
    ): typingsJapgolly.reactMdForm.anon.typeradioswitchindetermin = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2((t0: Boolean, t1: ReactMouseEventFrom[HTMLLIElement]) => (onCheckedChange(t0, t1)).runNow()))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdForm.anon.typeradioswitchindetermin]
    }
  }
}
