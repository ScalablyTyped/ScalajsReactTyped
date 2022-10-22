package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import typingsJapgolly.baseui.anon.ChildMenuPopover
import typingsJapgolly.baseui.menuTypesMod.Item
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMaybeChildMenuMod extends Shortcut {
  
  @JSImport("baseui/menu/maybe-child-menu", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    var getChildMenu: js.UndefOr[(js.Function1[/* item */ Item, Node]) | Null] = js.undefined
    
    var isOpen: Boolean
    
    var item: Item
    
    var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[Element], Any]] = js.undefined
    
    var overrides: js.UndefOr[ChildMenuPopover] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    def resetParentMenu(): Unit
  }
  object Props {
    
    inline def apply(isOpen: Boolean, item: Item, resetParentMenu: Callback): Props = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], resetParentMenu = resetParentMenu.toJsFn)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setGetChildMenu(value: /* item */ Item => Node): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
      
      inline def setGetChildMenuNull: Self = StObject.set(x, "getChildMenu", null)
      
      inline def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ ReactMouseEventFrom[Element] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverrides(value: ChildMenuPopover): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setResetParentMenu(value: Callback): Self = StObject.set(x, "resetParentMenu", value.toJsFn)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `menuMaybeChildMenuMod.foo` */
  override def _to: FC[Props] = default
}
