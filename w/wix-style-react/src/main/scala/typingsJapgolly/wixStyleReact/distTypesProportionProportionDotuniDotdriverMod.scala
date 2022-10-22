package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProportionProportionDotuniDotdriverMod {
  
  trait ProportionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAspectRatio(): js.Promise[Double]
    
    def isAspectRatioDisabled(): js.Promise[Boolean]
  }
  object ProportionUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAspectRatio: CallbackTo[js.Promise[Double]],
      isAspectRatioDisabled: CallbackTo[js.Promise[Boolean]]
    ): ProportionUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAspectRatio = getAspectRatio.toJsFn, isAspectRatioDisabled = isAspectRatioDisabled.toJsFn)
      __obj.asInstanceOf[ProportionUniDriver]
    }
    
    extension [Self <: ProportionUniDriver](x: Self) {
      
      inline def setGetAspectRatio(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getAspectRatio", value.toJsFn)
      
      inline def setIsAspectRatioDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isAspectRatioDisabled", value.toJsFn)
    }
  }
}
