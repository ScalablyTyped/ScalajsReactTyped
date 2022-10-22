package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionDropdownOptionDotprotractorDotdriverMod.DropdownOptionDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDropdownContentDropdownContentDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/dropdown-content/DropdownContent.protractor.driver", "dropdownContentDriverFactory")
  @js.native
  val dropdownContentDriverFactory: DriverFactory[DropdownContentDriver] = js.native
  
  trait DropdownContentDriver
    extends StObject
       with BaseDriver {
    
    def getOptionsCount(): js.Promise[Double]
    
    def optionAt(index: Double): DropdownOptionDriver
  }
  object DropdownContentDriver {
    
    inline def apply(
      element: CallbackTo[ElementFinder],
      getOptionsCount: CallbackTo[js.Promise[Double]],
      optionAt: Double => DropdownOptionDriver
    ): DropdownContentDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, getOptionsCount = getOptionsCount.toJsFn, optionAt = js.Any.fromFunction1(optionAt))
      __obj.asInstanceOf[DropdownContentDriver]
    }
    
    extension [Self <: DropdownContentDriver](x: Self) {
      
      inline def setGetOptionsCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getOptionsCount", value.toJsFn)
      
      inline def setOptionAt(value: Double => DropdownOptionDriver): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    }
  }
}
