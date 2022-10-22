package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageSectionPageSectionDotuniDotdriverMod {
  
  trait PageSectionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSubtitleText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def isActionsBarExists(): js.Promise[Boolean]
    
    def isSubtitleExists(): js.Promise[Boolean]
    
    def isTitleExists(): js.Promise[Boolean]
  }
  object PageSectionUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSubtitleText: CallbackTo[js.Promise[String]],
      getTitleText: CallbackTo[js.Promise[String]],
      isActionsBarExists: CallbackTo[js.Promise[Boolean]],
      isSubtitleExists: CallbackTo[js.Promise[Boolean]],
      isTitleExists: CallbackTo[js.Promise[Boolean]]
    ): PageSectionUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTitleText = getTitleText.toJsFn, isActionsBarExists = isActionsBarExists.toJsFn, isSubtitleExists = isSubtitleExists.toJsFn, isTitleExists = isTitleExists.toJsFn)
      __obj.asInstanceOf[PageSectionUniDriver]
    }
    
    extension [Self <: PageSectionUniDriver](x: Self) {
      
      inline def setGetSubtitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
      
      inline def setGetTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleText", value.toJsFn)
      
      inline def setIsActionsBarExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isActionsBarExists", value.toJsFn)
      
      inline def setIsSubtitleExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSubtitleExists", value.toJsFn)
      
      inline def setIsTitleExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTitleExists", value.toJsFn)
    }
  }
}
