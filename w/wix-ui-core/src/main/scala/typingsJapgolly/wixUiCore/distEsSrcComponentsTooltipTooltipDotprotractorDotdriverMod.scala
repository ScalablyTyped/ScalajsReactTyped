package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverDotprotractorDotdriverMod.PopoverDriver
import typingsJapgolly.wixUiTestUtils.distSrcProtractorProtractorHelpersMod.ILocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTooltipTooltipDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/tooltip/Tooltip.protractor.driver", "tooltipDriverFactory")
  @js.native
  val tooltipDriverFactory: DriverFactory[TooltipDriver] = js.native
  
  trait TooltipDriver
    extends StObject
       with PopoverDriver {
    
    def getTooltipLocation(): js.Promise[ILocation]
  }
  object TooltipDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      getContentElement: CallbackTo[ElementFinder],
      getTargetElement: CallbackTo[ElementFinder],
      getTooltipLocation: CallbackTo[js.Promise[ILocation]],
      isContentElementExists: CallbackTo[js.Promise[Boolean]],
      isTargetElementExists: CallbackTo[js.Promise[Boolean]],
      mouseEnter: CallbackTo[js.Promise[Unit]],
      mouseLeave: CallbackTo[js.Promise[Unit]]
    ): TooltipDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, getContentElement = getContentElement.toJsFn, getTargetElement = getTargetElement.toJsFn, getTooltipLocation = getTooltipLocation.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
      __obj.asInstanceOf[TooltipDriver]
    }
    
    extension [Self <: TooltipDriver](x: Self) {
      
      inline def setGetTooltipLocation(value: CallbackTo[js.Promise[ILocation]]): Self = StObject.set(x, "getTooltipLocation", value.toJsFn)
    }
  }
}
