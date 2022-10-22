package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedLabelLabelDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/label/Label.protractor.driver", "labelDriverFactory")
  @js.native
  val labelDriverFactory: DriverFactory[LabelDriver] = js.native
  
  trait LabelDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def getLabelText(): js.Promise[String]
  }
  object LabelDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      getLabelText: CallbackTo[js.Promise[String]]
    ): LabelDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, getLabelText = getLabelText.toJsFn)
      __obj.asInstanceOf[LabelDriver]
    }
    
    extension [Self <: LabelDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetLabelText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelText", value.toJsFn)
    }
  }
}
