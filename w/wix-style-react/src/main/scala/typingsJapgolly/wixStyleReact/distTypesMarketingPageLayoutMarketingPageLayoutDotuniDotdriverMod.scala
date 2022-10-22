package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingPageLayoutMarketingPageLayoutDotuniDotdriverMod {
  
  trait MarketingPageLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def hasContent(): js.Promise[Boolean]
    
    def hasFooter(): js.Promise[Boolean]
    
    def hasImage(): js.Promise[Boolean]
  }
  object MarketingPageLayoutUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      hasContent: CallbackTo[js.Promise[Boolean]],
      hasFooter: CallbackTo[js.Promise[Boolean]],
      hasImage: CallbackTo[js.Promise[Boolean]]
    ): MarketingPageLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, hasContent = hasContent.toJsFn, hasFooter = hasFooter.toJsFn, hasImage = hasImage.toJsFn)
      __obj.asInstanceOf[MarketingPageLayoutUniDriver]
    }
    
    extension [Self <: MarketingPageLayoutUniDriver](x: Self) {
      
      inline def setHasContent(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasContent", value.toJsFn)
      
      inline def setHasFooter(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasFooter", value.toJsFn)
      
      inline def setHasImage(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasImage", value.toJsFn)
    }
  }
}
