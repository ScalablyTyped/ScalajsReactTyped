package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedDividerDividerDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/divider/Divider.protractor.driver", "dividerDriverFactory")
  @js.native
  val dividerDriverFactory: DriverFactory[DividerDriver] = js.native
  
  trait DividerDriver
    extends StObject
       with BaseDriver {
    
    def exists(): js.Promise[Boolean]
  }
  object DividerDriver {
    
    inline def apply(element: CallbackTo[ElementFinder], exists: CallbackTo[js.Promise[Boolean]]): DividerDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, exists = exists.toJsFn)
      __obj.asInstanceOf[DividerDriver]
    }
    
    extension [Self <: DividerDriver](x: Self) {
      
      inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    }
  }
}
