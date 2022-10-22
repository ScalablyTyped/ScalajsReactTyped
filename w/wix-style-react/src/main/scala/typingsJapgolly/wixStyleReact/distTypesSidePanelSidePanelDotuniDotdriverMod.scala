package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidePanelSidePanelDotuniDotdriverMod {
  
  trait SidePanelUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Click close the button */
    def clickClose(): js.Promise[Unit]
    
    /** Get subtitle text */
    def getSubtitleText(): js.Promise[String]
    
    /** Get title text */
    def getTitleText(): js.Promise[String]
    
    /** Get tooltip text */
    def getTooltipContent(): js.Promise[String]
    
    /** Check if close button exists */
    def isCloseButtonExists(): js.Promise[Boolean]
    
    /** Check if divider exists */
    def isFooterDividerExists(): js.Promise[Boolean]
    
    /** Check if divider exists */
    def isHeaderDividerExists(): js.Promise[Boolean]
  }
  object SidePanelUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickClose: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSubtitleText: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]],
      getTooltipContent: CallbackTo[js.Promise[String]],
      isCloseButtonExists: CallbackTo[js.Promise[Boolean]],
      isFooterDividerExists: CallbackTo[js.Promise[Boolean]],
      isHeaderDividerExists: CallbackTo[js.Promise[Boolean]]
    ): SidePanelUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickClose = clickClose.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTitleText = getTitleText.toJsFn, getTooltipContent = getTooltipContent.toJsFn, isCloseButtonExists = isCloseButtonExists.toJsFn, isFooterDividerExists = isFooterDividerExists.toJsFn, isHeaderDividerExists = isHeaderDividerExists.toJsFn)
      __obj.asInstanceOf[SidePanelUniDriver]
    }
    
    extension [Self <: SidePanelUniDriver](x: Self) {
      
      inline def setClickClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickClose", value.toJsFn)
      
      inline def setGetSubtitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
      
      inline def setGetTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTooltipContent", value.toJsFn)
      
      inline def setIsCloseButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCloseButtonExists", value.toJsFn)
      
      inline def setIsFooterDividerExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFooterDividerExists", value.toJsFn)
      
      inline def setIsHeaderDividerExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isHeaderDividerExists", value.toJsFn)
    }
  }
}
