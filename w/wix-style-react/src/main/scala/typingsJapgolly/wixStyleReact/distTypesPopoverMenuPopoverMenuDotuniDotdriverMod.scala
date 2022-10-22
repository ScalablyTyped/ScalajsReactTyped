package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverMenuPopoverMenuDotuniDotdriverMod {
  
  trait PopoverMenuUniDriver
    extends StObject
       with BaseUniDriver {
    
    def childrenCount(): js.Promise[Double]
    
    def clickAtChild(index: Double): js.Promise[Unit]
    
    def clickAtChildByDataHook(dataHook: String): js.Promise[Unit]
    
    def getTriggerElement(dataHook: String): UniDriver[Any]
    
    def isMenuOpen(): js.Promise[Boolean]
    
    def itemContentAt(id: Double): js.Promise[String]
  }
  object PopoverMenuUniDriver {
    
    inline def apply(
      childrenCount: CallbackTo[js.Promise[Double]],
      click: CallbackTo[js.Promise[Unit]],
      clickAtChild: Double => js.Promise[Unit],
      clickAtChildByDataHook: String => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getTriggerElement: String => UniDriver[Any],
      isMenuOpen: CallbackTo[js.Promise[Boolean]],
      itemContentAt: Double => js.Promise[String]
    ): PopoverMenuUniDriver = {
      val __obj = js.Dynamic.literal(childrenCount = childrenCount.toJsFn, click = click.toJsFn, clickAtChild = js.Any.fromFunction1(clickAtChild), clickAtChildByDataHook = js.Any.fromFunction1(clickAtChildByDataHook), element = element.toJsFn, exists = exists.toJsFn, getTriggerElement = js.Any.fromFunction1(getTriggerElement), isMenuOpen = isMenuOpen.toJsFn, itemContentAt = js.Any.fromFunction1(itemContentAt))
      __obj.asInstanceOf[PopoverMenuUniDriver]
    }
    
    extension [Self <: PopoverMenuUniDriver](x: Self) {
      
      inline def setChildrenCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "childrenCount", value.toJsFn)
      
      inline def setClickAtChild(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtChild", js.Any.fromFunction1(value))
      
      inline def setClickAtChildByDataHook(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickAtChildByDataHook", js.Any.fromFunction1(value))
      
      inline def setGetTriggerElement(value: String => UniDriver[Any]): Self = StObject.set(x, "getTriggerElement", js.Any.fromFunction1(value))
      
      inline def setIsMenuOpen(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMenuOpen", value.toJsFn)
      
      inline def setItemContentAt(value: Double => js.Promise[String]): Self = StObject.set(x, "itemContentAt", js.Any.fromFunction1(value))
    }
  }
}
