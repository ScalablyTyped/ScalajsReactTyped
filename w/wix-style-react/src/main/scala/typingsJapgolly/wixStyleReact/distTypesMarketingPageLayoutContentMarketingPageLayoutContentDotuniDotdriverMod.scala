package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingPageLayoutContentMarketingPageLayoutContentDotuniDotdriverMod {
  
  trait MarketingPageLayoutContentUniDriver
    extends StObject
       with BaseUniDriver {
    
    def childExists(): js.Promise[Boolean]
    
    def getContentText(): js.Promise[String]
    
    def getOverlineText(): js.Promise[String]
    
    def getSubtitleText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def hasActions(): js.Promise[Boolean]
    
    def hasContent(): js.Promise[Boolean]
    
    def hasOverline(): js.Promise[Boolean]
    
    def hasSubtitle(): js.Promise[Boolean]
    
    def hasTitle(): js.Promise[Boolean]
  }
  object MarketingPageLayoutContentUniDriver {
    
    inline def apply(
      childExists: CallbackTo[js.Promise[Boolean]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getContentText: CallbackTo[js.Promise[String]],
      getOverlineText: CallbackTo[js.Promise[String]],
      getSubtitleText: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]],
      hasActions: CallbackTo[js.Promise[Boolean]],
      hasContent: CallbackTo[js.Promise[Boolean]],
      hasOverline: CallbackTo[js.Promise[Boolean]],
      hasSubtitle: CallbackTo[js.Promise[Boolean]],
      hasTitle: CallbackTo[js.Promise[Boolean]]
    ): MarketingPageLayoutContentUniDriver = {
      val __obj = js.Dynamic.literal(childExists = childExists.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getContentText = getContentText.toJsFn, getOverlineText = getOverlineText.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTitleText = getTitleText.toJsFn, hasActions = hasActions.toJsFn, hasContent = hasContent.toJsFn, hasOverline = hasOverline.toJsFn, hasSubtitle = hasSubtitle.toJsFn, hasTitle = hasTitle.toJsFn)
      __obj.asInstanceOf[MarketingPageLayoutContentUniDriver]
    }
    
    extension [Self <: MarketingPageLayoutContentUniDriver](x: Self) {
      
      inline def setChildExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "childExists", value.toJsFn)
      
      inline def setGetContentText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getContentText", value.toJsFn)
      
      inline def setGetOverlineText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getOverlineText", value.toJsFn)
      
      inline def setGetSubtitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
      
      inline def setHasActions(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasActions", value.toJsFn)
      
      inline def setHasContent(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasContent", value.toJsFn)
      
      inline def setHasOverline(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasOverline", value.toJsFn)
      
      inline def setHasSubtitle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasSubtitle", value.toJsFn)
      
      inline def setHasTitle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasTitle", value.toJsFn)
    }
  }
}
