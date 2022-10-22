package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarChartRadarChartDotuniDotdriverMod {
  
  trait RadarChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getScaleLinesCount(): js.Promise[Double]
  }
  object RadarChartUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getScaleLinesCount: CallbackTo[js.Promise[Double]]
    ): RadarChartUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getScaleLinesCount = getScaleLinesCount.toJsFn)
      __obj.asInstanceOf[RadarChartUniDriver]
    }
    
    extension [Self <: RadarChartUniDriver](x: Self) {
      
      inline def setGetScaleLinesCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getScaleLinesCount", value.toJsFn)
    }
  }
}
