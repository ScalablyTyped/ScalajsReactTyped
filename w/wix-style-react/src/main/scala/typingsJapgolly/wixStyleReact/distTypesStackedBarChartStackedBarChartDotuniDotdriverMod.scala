package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStackedBarChartStackedBarChartDotuniDotdriverMod {
  
  trait StackedBarChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDataLength(): js.Promise[Double]
    
    def getTooltipContentAt(index: Double): js.Promise[Any]
  }
  object StackedBarChartUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getDataLength: CallbackTo[js.Promise[Double]],
      getTooltipContentAt: Double => js.Promise[Any]
    ): StackedBarChartUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getDataLength = getDataLength.toJsFn, getTooltipContentAt = js.Any.fromFunction1(getTooltipContentAt))
      __obj.asInstanceOf[StackedBarChartUniDriver]
    }
    
    extension [Self <: StackedBarChartUniDriver](x: Self) {
      
      inline def setGetDataLength(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getDataLength", value.toJsFn)
      
      inline def setGetTooltipContentAt(value: Double => js.Promise[Any]): Self = StObject.set(x, "getTooltipContentAt", js.Any.fromFunction1(value))
    }
  }
}
