package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnalyticsSummaryCardAnalyticsSummaryCardDotuniDotdriverMod {
  
  trait AnalyticsSummaryCardUniDriver
    extends StObject
       with BaseUniDriver {
    
    def CTAExists(): js.Promise[Boolean]
    
    def clickCTA(): js.Promise[Unit]
    
    def getTitle(): js.Promise[String]
    
    def getTitleTooltipText(): js.Promise[String]
    
    def getTrendvalue(): js.Promise[Double]
    
    def getValue(): js.Promise[String]
    
    def getValueTooltipText(): js.Promise[String]
    
    def isLoading(): js.Promise[Boolean]
    
    def trendExists(): js.Promise[Boolean]
  }
  object AnalyticsSummaryCardUniDriver {
    
    inline def apply(
      CTAExists: CallbackTo[js.Promise[Boolean]],
      click: CallbackTo[js.Promise[Unit]],
      clickCTA: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getTitle: CallbackTo[js.Promise[String]],
      getTitleTooltipText: CallbackTo[js.Promise[String]],
      getTrendvalue: CallbackTo[js.Promise[Double]],
      getValue: CallbackTo[js.Promise[String]],
      getValueTooltipText: CallbackTo[js.Promise[String]],
      isLoading: CallbackTo[js.Promise[Boolean]],
      trendExists: CallbackTo[js.Promise[Boolean]]
    ): AnalyticsSummaryCardUniDriver = {
      val __obj = js.Dynamic.literal(CTAExists = CTAExists.toJsFn, click = click.toJsFn, clickCTA = clickCTA.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getTitle = getTitle.toJsFn, getTitleTooltipText = getTitleTooltipText.toJsFn, getTrendvalue = getTrendvalue.toJsFn, getValue = getValue.toJsFn, getValueTooltipText = getValueTooltipText.toJsFn, isLoading = isLoading.toJsFn, trendExists = trendExists.toJsFn)
      __obj.asInstanceOf[AnalyticsSummaryCardUniDriver]
    }
    
    extension [Self <: AnalyticsSummaryCardUniDriver](x: Self) {
      
      inline def setCTAExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "CTAExists", value.toJsFn)
      
      inline def setClickCTA(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickCTA", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setGetTitleTooltipText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleTooltipText", value.toJsFn)
      
      inline def setGetTrendvalue(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getTrendvalue", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setGetValueTooltipText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValueTooltipText", value.toJsFn)
      
      inline def setIsLoading(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLoading", value.toJsFn)
      
      inline def setTrendExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "trendExists", value.toJsFn)
    }
  }
}
