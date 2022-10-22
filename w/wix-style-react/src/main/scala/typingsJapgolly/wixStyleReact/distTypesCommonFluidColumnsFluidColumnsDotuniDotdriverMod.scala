package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonFluidColumnsFluidColumnsDotuniDotdriverMod {
  
  trait FluidColumnsUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getNumberOfItems(): js.Promise[Double]
  }
  object FluidColumnsUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getNumberOfItems: CallbackTo[js.Promise[Double]]
    ): FluidColumnsUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getNumberOfItems = getNumberOfItems.toJsFn)
      __obj.asInstanceOf[FluidColumnsUniDriver]
    }
    
    extension [Self <: FluidColumnsUniDriver](x: Self) {
      
      inline def setGetNumberOfItems(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getNumberOfItems", value.toJsFn)
    }
  }
}
