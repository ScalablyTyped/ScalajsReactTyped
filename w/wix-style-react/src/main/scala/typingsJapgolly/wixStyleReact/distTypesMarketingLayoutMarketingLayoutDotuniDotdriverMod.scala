package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingLayoutMarketingLayoutDotuniDotdriverMod {
  
  trait MarketingLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDescriptionText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
  }
  object MarketingLayoutUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getDescriptionText: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]]
    ): MarketingLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getDescriptionText = getDescriptionText.toJsFn, getTitleText = getTitleText.toJsFn)
      __obj.asInstanceOf[MarketingLayoutUniDriver]
    }
    
    extension [Self <: MarketingLayoutUniDriver](x: Self) {
      
      inline def setGetDescriptionText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDescriptionText", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
    }
  }
}
