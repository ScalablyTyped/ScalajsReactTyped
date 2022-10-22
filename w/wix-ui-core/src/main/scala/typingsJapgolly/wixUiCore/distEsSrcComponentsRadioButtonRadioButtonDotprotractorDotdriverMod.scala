package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsRadioButtonRadioButtonDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/radio-button/RadioButton.protractor.driver", "radioButtonDriverFactory")
  @js.native
  val radioButtonDriverFactory: DriverFactory[RadioButtonDriver] = js.native
  
  trait RadioButtonDriver
    extends StObject
       with BaseDriver {
    
    def isSelected(): js.Promise[Boolean]
    
    def select(): js.Promise[Unit]
  }
  object RadioButtonDriver {
    
    inline def apply(
      element: CallbackTo[ElementFinder],
      isSelected: CallbackTo[js.Promise[Boolean]],
      select: CallbackTo[js.Promise[Unit]]
    ): RadioButtonDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, isSelected = isSelected.toJsFn, select = select.toJsFn)
      __obj.asInstanceOf[RadioButtonDriver]
    }
    
    extension [Self <: RadioButtonDriver](x: Self) {
      
      inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
      
      inline def setSelect(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "select", value.toJsFn)
    }
  }
}
