package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPopoverPopoverDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/popover/Popover.protractor.driver", "popoverDriverFactory")
  @js.native
  val popoverDriverFactory: DriverFactory[PopoverDriver] = js.native
  
  trait PopoverDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def getContentElement(): ElementFinder
    
    def getTargetElement(): ElementFinder
    
    def isContentElementExists(): js.Promise[Boolean]
    
    def isTargetElementExists(): js.Promise[Boolean]
    
    def mouseEnter(): js.Promise[Unit]
    
    def mouseLeave(): js.Promise[Unit]
  }
  object PopoverDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      getContentElement: CallbackTo[ElementFinder],
      getTargetElement: CallbackTo[ElementFinder],
      isContentElementExists: CallbackTo[js.Promise[Boolean]],
      isTargetElementExists: CallbackTo[js.Promise[Boolean]],
      mouseEnter: CallbackTo[js.Promise[Unit]],
      mouseLeave: CallbackTo[js.Promise[Unit]]
    ): PopoverDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, getContentElement = getContentElement.toJsFn, getTargetElement = getTargetElement.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
      __obj.asInstanceOf[PopoverDriver]
    }
    
    extension [Self <: PopoverDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetContentElement(value: CallbackTo[ElementFinder]): Self = StObject.set(x, "getContentElement", value.toJsFn)
      
      inline def setGetTargetElement(value: CallbackTo[ElementFinder]): Self = StObject.set(x, "getTargetElement", value.toJsFn)
      
      inline def setIsContentElementExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isContentElementExists", value.toJsFn)
      
      inline def setIsTargetElementExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTargetElementExists", value.toJsFn)
      
      inline def setMouseEnter(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
      
      inline def setMouseLeave(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    }
  }
}
