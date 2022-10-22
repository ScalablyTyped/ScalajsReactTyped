package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickMenuItem extends StObject {
  
  def click(): js.Promise[Unit]
  
  def clickMenuItem(menuItemLabel: String): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  def getElementByDataHook(dataHook: String): js.Promise[UniDriver[Any]]
  
  def getMenuContainer(): js.Promise[UniDriver[Any]]
  
  def getMenuItem(menuItemLabel: String): js.Promise[UniDriver[Any]]
  
  def getMenuItemColumnsLayout(menuItemLabel: String): js.Promise[UniDriver[Any]]
  
  def getMenuItemGridLayout(menuItemLabel: String): js.Promise[UniDriver[Any]]
  
  def getMenuNavigation(): js.Promise[UniDriver[Any]]
  
  def hoverMenuItem(menuItemLabel: String): js.Promise[Unit]
}
object ClickMenuItem {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    clickMenuItem: String => js.Promise[Unit],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getElementByDataHook: String => js.Promise[UniDriver[Any]],
    getMenuContainer: CallbackTo[js.Promise[UniDriver[Any]]],
    getMenuItem: String => js.Promise[UniDriver[Any]],
    getMenuItemColumnsLayout: String => js.Promise[UniDriver[Any]],
    getMenuItemGridLayout: String => js.Promise[UniDriver[Any]],
    getMenuNavigation: CallbackTo[js.Promise[UniDriver[Any]]],
    hoverMenuItem: String => js.Promise[Unit]
  ): ClickMenuItem = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, clickMenuItem = js.Any.fromFunction1(clickMenuItem), element = element.toJsFn, exists = exists.toJsFn, getElementByDataHook = js.Any.fromFunction1(getElementByDataHook), getMenuContainer = getMenuContainer.toJsFn, getMenuItem = js.Any.fromFunction1(getMenuItem), getMenuItemColumnsLayout = js.Any.fromFunction1(getMenuItemColumnsLayout), getMenuItemGridLayout = js.Any.fromFunction1(getMenuItemGridLayout), getMenuNavigation = getMenuNavigation.toJsFn, hoverMenuItem = js.Any.fromFunction1(hoverMenuItem))
    __obj.asInstanceOf[ClickMenuItem]
  }
  
  extension [Self <: ClickMenuItem](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickMenuItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickMenuItem", js.Any.fromFunction1(value))
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetElementByDataHook(value: String => js.Promise[UniDriver[Any]]): Self = StObject.set(x, "getElementByDataHook", js.Any.fromFunction1(value))
    
    inline def setGetMenuContainer(value: CallbackTo[js.Promise[UniDriver[Any]]]): Self = StObject.set(x, "getMenuContainer", value.toJsFn)
    
    inline def setGetMenuItem(value: String => js.Promise[UniDriver[Any]]): Self = StObject.set(x, "getMenuItem", js.Any.fromFunction1(value))
    
    inline def setGetMenuItemColumnsLayout(value: String => js.Promise[UniDriver[Any]]): Self = StObject.set(x, "getMenuItemColumnsLayout", js.Any.fromFunction1(value))
    
    inline def setGetMenuItemGridLayout(value: String => js.Promise[UniDriver[Any]]): Self = StObject.set(x, "getMenuItemGridLayout", js.Any.fromFunction1(value))
    
    inline def setGetMenuNavigation(value: CallbackTo[js.Promise[UniDriver[Any]]]): Self = StObject.set(x, "getMenuNavigation", value.toJsFn)
    
    inline def setHoverMenuItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "hoverMenuItem", js.Any.fromFunction1(value))
  }
}
