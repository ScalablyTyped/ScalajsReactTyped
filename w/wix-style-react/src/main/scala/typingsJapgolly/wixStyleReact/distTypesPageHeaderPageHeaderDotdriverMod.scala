package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageHeaderPageHeaderDotdriverMod {
  
  trait PageHeaderDriver
    extends StObject
       with BaseDriver {
    
    def breadcrumbsText(): String
    
    def clickBackButton(): Unit
    
    def hasClass(className: String): Boolean
    
    def isActionBarExists(): Boolean
    
    def isBackButtonExists(): Boolean
    
    def isBreadcrumbsExists(): Boolean
    
    def isSubtitleExists(): Boolean
    
    def isTitleExists(): Boolean
    
    def subtitleText(): String
    
    def titleText(): String
  }
  object PageHeaderDriver {
    
    inline def apply(
      breadcrumbsText: CallbackTo[String],
      clickBackButton: Callback,
      exists: CallbackTo[Boolean],
      hasClass: String => Boolean,
      isActionBarExists: CallbackTo[Boolean],
      isBackButtonExists: CallbackTo[Boolean],
      isBreadcrumbsExists: CallbackTo[Boolean],
      isSubtitleExists: CallbackTo[Boolean],
      isTitleExists: CallbackTo[Boolean],
      subtitleText: CallbackTo[String],
      titleText: CallbackTo[String]
    ): PageHeaderDriver = {
      val __obj = js.Dynamic.literal(breadcrumbsText = breadcrumbsText.toJsFn, clickBackButton = clickBackButton.toJsFn, exists = exists.toJsFn, hasClass = js.Any.fromFunction1(hasClass), isActionBarExists = isActionBarExists.toJsFn, isBackButtonExists = isBackButtonExists.toJsFn, isBreadcrumbsExists = isBreadcrumbsExists.toJsFn, isSubtitleExists = isSubtitleExists.toJsFn, isTitleExists = isTitleExists.toJsFn, subtitleText = subtitleText.toJsFn, titleText = titleText.toJsFn)
      __obj.asInstanceOf[PageHeaderDriver]
    }
    
    extension [Self <: PageHeaderDriver](x: Self) {
      
      inline def setBreadcrumbsText(value: CallbackTo[String]): Self = StObject.set(x, "breadcrumbsText", value.toJsFn)
      
      inline def setClickBackButton(value: Callback): Self = StObject.set(x, "clickBackButton", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsActionBarExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActionBarExists", value.toJsFn)
      
      inline def setIsBackButtonExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBackButtonExists", value.toJsFn)
      
      inline def setIsBreadcrumbsExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBreadcrumbsExists", value.toJsFn)
      
      inline def setIsSubtitleExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSubtitleExists", value.toJsFn)
      
      inline def setIsTitleExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTitleExists", value.toJsFn)
      
      inline def setSubtitleText(value: CallbackTo[String]): Self = StObject.set(x, "subtitleText", value.toJsFn)
      
      inline def setTitleText(value: CallbackTo[String]): Self = StObject.set(x, "titleText", value.toJsFn)
    }
  }
}
