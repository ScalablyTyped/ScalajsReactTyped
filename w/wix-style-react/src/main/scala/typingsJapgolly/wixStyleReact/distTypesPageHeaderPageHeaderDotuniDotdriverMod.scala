package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageHeaderPageHeaderDotuniDotdriverMod {
  
  trait PageHeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def breadcrumbsText(): js.Promise[String]
    
    def clickBackButton(): js.Promise[Unit]
    
    def hasClass(name: String): js.Promise[Boolean]
    
    def isActionBarExists(): js.Promise[Boolean]
    
    def isBackButtonExists(): js.Promise[Boolean]
    
    def isBreadcrumbsExists(): js.Promise[Boolean]
    
    def isSubtitleExists(): js.Promise[Boolean]
    
    def isTitleExists(): js.Promise[Boolean]
    
    def subtitleText(): js.Promise[String]
    
    def titleText(): js.Promise[String]
  }
  object PageHeaderUniDriver {
    
    inline def apply(
      breadcrumbsText: CallbackTo[js.Promise[String]],
      click: CallbackTo[js.Promise[Unit]],
      clickBackButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      hasClass: String => js.Promise[Boolean],
      isActionBarExists: CallbackTo[js.Promise[Boolean]],
      isBackButtonExists: CallbackTo[js.Promise[Boolean]],
      isBreadcrumbsExists: CallbackTo[js.Promise[Boolean]],
      isSubtitleExists: CallbackTo[js.Promise[Boolean]],
      isTitleExists: CallbackTo[js.Promise[Boolean]],
      subtitleText: CallbackTo[js.Promise[String]],
      titleText: CallbackTo[js.Promise[String]]
    ): PageHeaderUniDriver = {
      val __obj = js.Dynamic.literal(breadcrumbsText = breadcrumbsText.toJsFn, click = click.toJsFn, clickBackButton = clickBackButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, hasClass = js.Any.fromFunction1(hasClass), isActionBarExists = isActionBarExists.toJsFn, isBackButtonExists = isBackButtonExists.toJsFn, isBreadcrumbsExists = isBreadcrumbsExists.toJsFn, isSubtitleExists = isSubtitleExists.toJsFn, isTitleExists = isTitleExists.toJsFn, subtitleText = subtitleText.toJsFn, titleText = titleText.toJsFn)
      __obj.asInstanceOf[PageHeaderUniDriver]
    }
    
    extension [Self <: PageHeaderUniDriver](x: Self) {
      
      inline def setBreadcrumbsText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "breadcrumbsText", value.toJsFn)
      
      inline def setClickBackButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickBackButton", value.toJsFn)
      
      inline def setHasClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsActionBarExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isActionBarExists", value.toJsFn)
      
      inline def setIsBackButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isBackButtonExists", value.toJsFn)
      
      inline def setIsBreadcrumbsExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isBreadcrumbsExists", value.toJsFn)
      
      inline def setIsSubtitleExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSubtitleExists", value.toJsFn)
      
      inline def setIsTitleExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTitleExists", value.toJsFn)
      
      inline def setSubtitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "subtitleText", value.toJsFn)
      
      inline def setTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "titleText", value.toJsFn)
    }
  }
}
