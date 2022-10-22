package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.anon.ClickMenuItem
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsHorizontalMenuHorizontalMenuDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/HorizontalMenu.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def horizontalMenuUniDriverFactory(base: UniDriver[Any]): ClickMenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("horizontalMenuUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ClickMenuItem]
  
  trait HorizontalMenuDriver
    extends StObject
       with BaseUniDriver {
    
    /** Click on menu item by label */
    def clickMenuItem(menuItemLabel: String): js.Promise[Unit]
    
    def getElementByDataHook(dataHook: String): UniDriver[Any]
    
    /** Get main <ul> */
    def getMenuContainer(): UniDriver[Any]
    
    /** Get a menu item by label */
    def getMenuItem(menuItemLabel: String): UniDriver[Any]
    
    /** Get column layout by menu label */
    def getMenuItemColumnsLayout(menuItemLabel: String): UniDriver[Any]
    
    /** Get grid layout by menu label */
    def getMenuItemGridLayout(menuItemLabel: String): UniDriver[Any]
    
    /** Get main <nav> */
    def getMenuNavigation(): UniDriver[Any]
    
    /** Hover a menu item by label */
    def hoverMenuItem(menuItemLabel: String): js.Promise[Unit]
  }
  object HorizontalMenuDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickMenuItem: String => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getElementByDataHook: String => UniDriver[Any],
      getMenuContainer: CallbackTo[UniDriver[Any]],
      getMenuItem: String => UniDriver[Any],
      getMenuItemColumnsLayout: String => UniDriver[Any],
      getMenuItemGridLayout: String => UniDriver[Any],
      getMenuNavigation: CallbackTo[UniDriver[Any]],
      hoverMenuItem: String => js.Promise[Unit]
    ): HorizontalMenuDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickMenuItem = js.Any.fromFunction1(clickMenuItem), element = element.toJsFn, exists = exists.toJsFn, getElementByDataHook = js.Any.fromFunction1(getElementByDataHook), getMenuContainer = getMenuContainer.toJsFn, getMenuItem = js.Any.fromFunction1(getMenuItem), getMenuItemColumnsLayout = js.Any.fromFunction1(getMenuItemColumnsLayout), getMenuItemGridLayout = js.Any.fromFunction1(getMenuItemGridLayout), getMenuNavigation = getMenuNavigation.toJsFn, hoverMenuItem = js.Any.fromFunction1(hoverMenuItem))
      __obj.asInstanceOf[HorizontalMenuDriver]
    }
    
    extension [Self <: HorizontalMenuDriver](x: Self) {
      
      inline def setClickMenuItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickMenuItem", js.Any.fromFunction1(value))
      
      inline def setGetElementByDataHook(value: String => UniDriver[Any]): Self = StObject.set(x, "getElementByDataHook", js.Any.fromFunction1(value))
      
      inline def setGetMenuContainer(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getMenuContainer", value.toJsFn)
      
      inline def setGetMenuItem(value: String => UniDriver[Any]): Self = StObject.set(x, "getMenuItem", js.Any.fromFunction1(value))
      
      inline def setGetMenuItemColumnsLayout(value: String => UniDriver[Any]): Self = StObject.set(x, "getMenuItemColumnsLayout", js.Any.fromFunction1(value))
      
      inline def setGetMenuItemGridLayout(value: String => UniDriver[Any]): Self = StObject.set(x, "getMenuItemGridLayout", js.Any.fromFunction1(value))
      
      inline def setGetMenuNavigation(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getMenuNavigation", value.toJsFn)
      
      inline def setHoverMenuItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "hoverMenuItem", js.Any.fromFunction1(value))
    }
  }
}
