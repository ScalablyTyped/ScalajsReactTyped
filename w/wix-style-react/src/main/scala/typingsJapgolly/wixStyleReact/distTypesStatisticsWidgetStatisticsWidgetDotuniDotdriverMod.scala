package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStatisticsWidgetStatisticsWidgetDotuniDotdriverMod {
  
  trait StatisticsWidgetUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickStatistics(index: Double): js.Promise[Unit]
    
    def getChildren(index: Double, hook: String): UniDriver[Any]
    
    def getDescription(index: Double): js.Promise[String | Null]
    
    def getDescriptionInfo(index: Double): js.Promise[String]
    
    def getItemsCount(): js.Promise[Double]
    
    def getPercentage(index: Double): js.Promise[Double | Null]
    
    def getValue(index: Double): js.Promise[String | Null]
    
    def getValueInShort(index: Double): js.Promise[String | Null]
    
    def isLoading(index: Double): js.Promise[Boolean]
  }
  object StatisticsWidgetUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickStatistics: Double => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getChildren: (Double, String) => UniDriver[Any],
      getDescription: Double => js.Promise[String | Null],
      getDescriptionInfo: Double => js.Promise[String],
      getItemsCount: CallbackTo[js.Promise[Double]],
      getPercentage: Double => js.Promise[Double | Null],
      getValue: Double => js.Promise[String | Null],
      getValueInShort: Double => js.Promise[String | Null],
      isLoading: Double => js.Promise[Boolean]
    ): StatisticsWidgetUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickStatistics = js.Any.fromFunction1(clickStatistics), element = element.toJsFn, exists = exists.toJsFn, getChildren = js.Any.fromFunction2(getChildren), getDescription = js.Any.fromFunction1(getDescription), getDescriptionInfo = js.Any.fromFunction1(getDescriptionInfo), getItemsCount = getItemsCount.toJsFn, getPercentage = js.Any.fromFunction1(getPercentage), getValue = js.Any.fromFunction1(getValue), getValueInShort = js.Any.fromFunction1(getValueInShort), isLoading = js.Any.fromFunction1(isLoading))
      __obj.asInstanceOf[StatisticsWidgetUniDriver]
    }
    
    extension [Self <: StatisticsWidgetUniDriver](x: Self) {
      
      inline def setClickStatistics(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickStatistics", js.Any.fromFunction1(value))
      
      inline def setGetChildren(value: (Double, String) => UniDriver[Any]): Self = StObject.set(x, "getChildren", js.Any.fromFunction2(value))
      
      inline def setGetDescription(value: Double => js.Promise[String | Null]): Self = StObject.set(x, "getDescription", js.Any.fromFunction1(value))
      
      inline def setGetDescriptionInfo(value: Double => js.Promise[String]): Self = StObject.set(x, "getDescriptionInfo", js.Any.fromFunction1(value))
      
      inline def setGetItemsCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getItemsCount", value.toJsFn)
      
      inline def setGetPercentage(value: Double => js.Promise[Double | Null]): Self = StObject.set(x, "getPercentage", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: Double => js.Promise[String | Null]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGetValueInShort(value: Double => js.Promise[String | Null]): Self = StObject.set(x, "getValueInShort", js.Any.fromFunction1(value))
      
      inline def setIsLoading(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
    }
  }
}
