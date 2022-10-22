package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarChartBarChartDotuniDotdriverMod {
  
  trait BarChartUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDescription(index: Double): js.Promise[String]
    
    def getDescriptionInfo(index: Double): js.Promise[String]
    
    def getItemsCount(): js.Promise[Double]
    
    def getValue(index: Double): js.Promise[String]
    
    def getValueInShort(index: Double): js.Promise[String]
  }
  object BarChartUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getDescription: Double => js.Promise[String],
      getDescriptionInfo: Double => js.Promise[String],
      getItemsCount: CallbackTo[js.Promise[Double]],
      getValue: Double => js.Promise[String],
      getValueInShort: Double => js.Promise[String]
    ): BarChartUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getDescription = js.Any.fromFunction1(getDescription), getDescriptionInfo = js.Any.fromFunction1(getDescriptionInfo), getItemsCount = getItemsCount.toJsFn, getValue = js.Any.fromFunction1(getValue), getValueInShort = js.Any.fromFunction1(getValueInShort))
      __obj.asInstanceOf[BarChartUniDriver]
    }
    
    extension [Self <: BarChartUniDriver](x: Self) {
      
      inline def setGetDescription(value: Double => js.Promise[String]): Self = StObject.set(x, "getDescription", js.Any.fromFunction1(value))
      
      inline def setGetDescriptionInfo(value: Double => js.Promise[String]): Self = StObject.set(x, "getDescriptionInfo", js.Any.fromFunction1(value))
      
      inline def setGetItemsCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getItemsCount", value.toJsFn)
      
      inline def setGetValue(value: Double => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGetValueInShort(value: Double => js.Promise[String]): Self = StObject.set(x, "getValueInShort", js.Any.fromFunction1(value))
    }
  }
}
