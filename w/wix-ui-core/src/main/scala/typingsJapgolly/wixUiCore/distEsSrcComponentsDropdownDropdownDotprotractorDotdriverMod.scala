package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownContentDropdownContentDotprotractorDotdriverMod.DropdownContentDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverDotprotractorDotdriverMod.PopoverDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDropdownDropdownDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/dropdown/Dropdown.protractor.driver", "dropdownDriverFactory")
  @js.native
  val dropdownDriverFactory: DriverFactory[DropdownDriver] = js.native
  
  trait DropdownDriver
    extends StObject
       with PopoverDriver {
    
    def dropdownContent(): DropdownContentDriver
  }
  object DropdownDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      dropdownContent: CallbackTo[DropdownContentDriver],
      element: CallbackTo[ElementFinder],
      getContentElement: CallbackTo[ElementFinder],
      getTargetElement: CallbackTo[ElementFinder],
      isContentElementExists: CallbackTo[js.Promise[Boolean]],
      isTargetElementExists: CallbackTo[js.Promise[Boolean]],
      mouseEnter: CallbackTo[js.Promise[Unit]],
      mouseLeave: CallbackTo[js.Promise[Unit]]
    ): DropdownDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, dropdownContent = dropdownContent.toJsFn, element = element.toJsFn, getContentElement = getContentElement.toJsFn, getTargetElement = getTargetElement.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
      __obj.asInstanceOf[DropdownDriver]
    }
    
    extension [Self <: DropdownDriver](x: Self) {
      
      inline def setDropdownContent(value: CallbackTo[DropdownContentDriver]): Self = StObject.set(x, "dropdownContent", value.toJsFn)
    }
  }
}
