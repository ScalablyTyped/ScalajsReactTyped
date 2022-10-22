package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelChartDotuniDotdriverMod {
  
  trait FunnelChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDifferenceFromDataAt(index: Double): js.Promise[String]
    
    def getDifferenceTooltipFromDataAt(index: Double): js.Promise[String]
    
    def getItemsCount(): js.Promise[Double]
    
    def getLabelAt(index: Double): js.Promise[String]
    
    def getValueAt(index: Double): js.Promise[String]
    
    def isDisplayingBadges(): js.Promise[Boolean]
  }
  object FunnelChartUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getDifferenceFromDataAt: Double => js.Promise[String],
      getDifferenceTooltipFromDataAt: Double => js.Promise[String],
      getItemsCount: CallbackTo[js.Promise[Double]],
      getLabelAt: Double => js.Promise[String],
      getValueAt: Double => js.Promise[String],
      isDisplayingBadges: CallbackTo[js.Promise[Boolean]]
    ): FunnelChartUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getDifferenceFromDataAt = js.Any.fromFunction1(getDifferenceFromDataAt), getDifferenceTooltipFromDataAt = js.Any.fromFunction1(getDifferenceTooltipFromDataAt), getItemsCount = getItemsCount.toJsFn, getLabelAt = js.Any.fromFunction1(getLabelAt), getValueAt = js.Any.fromFunction1(getValueAt), isDisplayingBadges = isDisplayingBadges.toJsFn)
      __obj.asInstanceOf[FunnelChartUniDriver]
    }
    
    extension [Self <: FunnelChartUniDriver](x: Self) {
      
      inline def setGetDifferenceFromDataAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getDifferenceFromDataAt", js.Any.fromFunction1(value))
      
      inline def setGetDifferenceTooltipFromDataAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getDifferenceTooltipFromDataAt", js.Any.fromFunction1(value))
      
      inline def setGetItemsCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getItemsCount", value.toJsFn)
      
      inline def setGetLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getLabelAt", js.Any.fromFunction1(value))
      
      inline def setGetValueAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getValueAt", js.Any.fromFunction1(value))
      
      inline def setIsDisplayingBadges(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisplayingBadges", value.toJsFn)
    }
  }
}
