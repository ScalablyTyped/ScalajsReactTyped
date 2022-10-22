package typingsJapgolly.baseui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.anon.AddMenuToNesting
import typingsJapgolly.baseui.anon.StyledPropsitemanyundefin
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.enter_
import typingsJapgolly.baseui.baseuiStrings.h6
import typingsJapgolly.baseui.baseuiStrings.img
import typingsJapgolly.baseui.baseuiStrings.li_
import typingsJapgolly.baseui.baseuiStrings.p
import typingsJapgolly.baseui.baseuiStrings.ul
import typingsJapgolly.baseui.menuNestedMenusMod.default
import typingsJapgolly.baseui.menuStyledComponentsMod.StyledProps
import typingsJapgolly.baseui.menuTypesMod.ArrayItems
import typingsJapgolly.baseui.menuTypesMod.GetRequiredItemPropsFn
import typingsJapgolly.baseui.menuTypesMod.GroupedItems
import typingsJapgolly.baseui.menuTypesMod.Item
import typingsJapgolly.baseui.menuTypesMod.Items
import typingsJapgolly.baseui.menuTypesMod.MenuProps
import typingsJapgolly.baseui.menuTypesMod.NestedMenuContextProps
import typingsJapgolly.baseui.menuTypesMod.OnItemSelectFn
import typingsJapgolly.baseui.menuTypesMod.OptionListProps
import typingsJapgolly.baseui.menuTypesMod.OptionProfileProps
import typingsJapgolly.baseui.menuTypesMod.StateReducerFn
import typingsJapgolly.baseui.menuTypesMod.StatefulContainerProps
import typingsJapgolly.baseui.menuTypesMod.StatelessMenuProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("baseui/menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object KEY_STRINGS {
    
    @JSImport("baseui/menu", "KEY_STRINGS.ArrowDown")
    @js.native
    val ArrowDown: typingsJapgolly.baseui.baseuiStrings.ArrowDown = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.ArrowLeft")
    @js.native
    val ArrowLeft: typingsJapgolly.baseui.baseuiStrings.ArrowLeft = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.ArrowRight")
    @js.native
    val ArrowRight: typingsJapgolly.baseui.baseuiStrings.ArrowRight = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.ArrowUp")
    @js.native
    val ArrowUp: typingsJapgolly.baseui.baseuiStrings.ArrowUp = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Backspace")
    @js.native
    val Backspace: typingsJapgolly.baseui.baseuiStrings.Backspace = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.End")
    @js.native
    val End: typingsJapgolly.baseui.baseuiStrings.End = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Enter")
    @js.native
    val Enter: typingsJapgolly.baseui.baseuiStrings.Enter = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Escape")
    @js.native
    val Escape: typingsJapgolly.baseui.baseuiStrings.Escape = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Home")
    @js.native
    val Home: typingsJapgolly.baseui.baseuiStrings.Home = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Space")
    @js.native
    val Space: typingsJapgolly.baseui.baseuiStrings.Space = js.native
  }
  
  inline def Menu(props: StatelessMenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Menu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/menu", "NestedMenuContext")
  @js.native
  val NestedMenuContext: Context[NestedMenuContextProps] = js.native
  
  @JSImport("baseui/menu", "NestedMenus")
  @js.native
  open class NestedMenus () extends default
  
  @JSImport("baseui/menu", "OptionList")
  @js.native
  val OptionList: NamedExoticComponent[OptionListProps] = js.native
  
  @JSImport("baseui/menu", "OptionProfile")
  @js.native
  val OptionProfile: ForwardRefExoticComponent[OptionProfileProps & RefAttributes[HTMLElement]] = js.native
  
  object STATE_CHANGE_TYPES {
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.character")
    @js.native
    val character: typingsJapgolly.baseui.baseuiStrings.character = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.click")
    @js.native
    val click: typingsJapgolly.baseui.baseuiStrings.click = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.enter")
    @js.native
    val enter: enter_ = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.focus")
    @js.native
    val focus: typingsJapgolly.baseui.baseuiStrings.focus = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.mouseEnter")
    @js.native
    val mouseEnter: typingsJapgolly.baseui.baseuiStrings.mouseEnter = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.mouseLeave")
    @js.native
    val mouseLeave: typingsJapgolly.baseui.baseuiStrings.mouseLeave = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.moveDown")
    @js.native
    val moveDown: typingsJapgolly.baseui.baseuiStrings.moveDown = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.moveUp")
    @js.native
    val moveUp: typingsJapgolly.baseui.baseuiStrings.moveUp = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.reset")
    @js.native
    val reset: typingsJapgolly.baseui.baseuiStrings.reset = js.native
  }
  
  object StatefulContainer {
    
    inline def apply(props: StatefulContainerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/menu", "StatefulContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/menu", "StatefulContainer.defaultProps")
    @js.native
    def defaultProps: AddMenuToNesting = js.native
    inline def defaultProps_=(x: AddMenuToNesting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/menu", "StatefulMenu")
  @js.native
  open class StatefulMenu ()
    extends typingsJapgolly.baseui.menuStatefulMenuMod.default
  
  @JSImport("baseui/menu", "StyledEmptyState")
  @js.native
  val StyledEmptyState: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledList")
  @js.native
  val StyledList: StyletronComponent[ul, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledListItem")
  @js.native
  val StyledListItem: StyletronComponent[li_, StyledPropsitemanyundefin] = js.native
  
  @JSImport("baseui/menu", "StyledListItemProfile")
  @js.native
  val StyledListItemProfile: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledMenuDivider")
  @js.native
  val StyledMenuDivider: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledProfileBody")
  @js.native
  val StyledProfileBody: StyletronComponent[p, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledProfileImg")
  @js.native
  val StyledProfileImg: StyletronComponent[img, js.Object] = js.native
  
  @JSImport("baseui/menu", "StyledProfileImgContainer")
  @js.native
  val StyledProfileImgContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/menu", "StyledProfileLabelsContainer")
  @js.native
  val StyledProfileLabelsContainer: StyletronComponent[div, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledProfileSubtitle")
  @js.native
  val StyledProfileSubtitle: StyletronComponent[p, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledProfileTitle")
  @js.native
  val StyledProfileTitle: StyletronComponent[h6, StyledProps] = js.native
  
  type ArrayItemsT = ArrayItems
  
  type BaseMenuPropsT = MenuProps
  
  type GetRequiredItemProps = GetRequiredItemPropsFn
  
  type GroupedItemsT = GroupedItems
  
  type ItemT = Item
  
  type ItemsT = Items
  
  type OnItemSelect = OnItemSelectFn
  
  type StateReducer = StateReducerFn
}
