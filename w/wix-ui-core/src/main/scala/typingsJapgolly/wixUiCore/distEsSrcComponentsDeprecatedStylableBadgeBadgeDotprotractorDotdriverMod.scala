package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedStylableBadgeBadgeDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/stylable-badge/Badge.protractor.driver", "badgeDriverFactory")
  @js.native
  val badgeDriverFactory: DriverFactory[BadgeDriver] = js.native
  
  trait BadgeDriver
    extends StObject
       with BaseDriver {
    
    def text(): js.Promise[String]
  }
  object BadgeDriver {
    
    inline def apply(element: CallbackTo[ElementFinder], text: CallbackTo[js.Promise[String]]): BadgeDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, text = text.toJsFn)
      __obj.asInstanceOf[BadgeDriver]
    }
    
    extension [Self <: BadgeDriver](x: Self) {
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
}
