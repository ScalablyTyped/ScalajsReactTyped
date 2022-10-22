package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsMenuItemMenuItemDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/menu-item/menu-item.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def menuItemDriverFactory(base: UniDriver[Any]): MenuItemDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("menuItemDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MenuItemDriver]
  
  trait MenuItemDriver
    extends StObject
       with BaseUniDriver {
    
    /** return children for inspection */
    def getText(): js.Promise[String]
    
    /** checks if the item is disabled */
    def isDisabled(): js.Promise[Boolean]
    
    /** checks if the item is highlighted */
    def isHighlighted(): js.Promise[Boolean]
    
    /** checks if the item is selected */
    def isSelected(): js.Promise[Boolean]
  }
  object MenuItemDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getText: CallbackTo[js.Promise[String]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isHighlighted: CallbackTo[js.Promise[Boolean]],
      isSelected: CallbackTo[js.Promise[Boolean]]
    ): MenuItemDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getText = getText.toJsFn, isDisabled = isDisabled.toJsFn, isHighlighted = isHighlighted.toJsFn, isSelected = isSelected.toJsFn)
      __obj.asInstanceOf[MenuItemDriver]
    }
    
    extension [Self <: MenuItemDriver](x: Self) {
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsHighlighted(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isHighlighted", value.toJsFn)
      
      inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
    }
  }
}
