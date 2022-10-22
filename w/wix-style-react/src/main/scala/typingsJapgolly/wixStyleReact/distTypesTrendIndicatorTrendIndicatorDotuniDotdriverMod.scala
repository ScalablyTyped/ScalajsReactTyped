package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTrendIndicatorTrendIndicatorDotuniDotdriverMod {
  
  trait TrendIndicatorUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTrendValue(): js.Promise[Double]
    
    def hasTrendIndicatorIcon(): js.Promise[Boolean]
    
    def isTrendIndicatorDown(): js.Promise[Boolean]
    
    def isTrendIndicatorUp(): js.Promise[Boolean]
  }
  object TrendIndicatorUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getTrendValue: CallbackTo[js.Promise[Double]],
      hasTrendIndicatorIcon: CallbackTo[js.Promise[Boolean]],
      isTrendIndicatorDown: CallbackTo[js.Promise[Boolean]],
      isTrendIndicatorUp: CallbackTo[js.Promise[Boolean]]
    ): TrendIndicatorUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getTrendValue = getTrendValue.toJsFn, hasTrendIndicatorIcon = hasTrendIndicatorIcon.toJsFn, isTrendIndicatorDown = isTrendIndicatorDown.toJsFn, isTrendIndicatorUp = isTrendIndicatorUp.toJsFn)
      __obj.asInstanceOf[TrendIndicatorUniDriver]
    }
    
    extension [Self <: TrendIndicatorUniDriver](x: Self) {
      
      inline def setGetTrendValue(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getTrendValue", value.toJsFn)
      
      inline def setHasTrendIndicatorIcon(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasTrendIndicatorIcon", value.toJsFn)
      
      inline def setIsTrendIndicatorDown(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTrendIndicatorDown", value.toJsFn)
      
      inline def setIsTrendIndicatorUp(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTrendIndicatorUp", value.toJsFn)
    }
  }
}
