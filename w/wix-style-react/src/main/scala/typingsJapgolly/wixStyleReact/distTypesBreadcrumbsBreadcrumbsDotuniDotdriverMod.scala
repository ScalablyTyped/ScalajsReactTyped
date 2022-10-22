package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBreadcrumbsBreadcrumbsDotuniDotdriverMod {
  
  trait BreadcrumbsUniDriver
    extends StObject
       with BaseUniDriver {
    
    def breadcrumbContentAt(position: Double): js.Promise[String | Null]
    
    def breadcrumbsLength(): js.Promise[Double]
    
    def clickBreadcrumbAt(position: Double): js.Promise[Any]
    
    def getActiveItemId(): js.Promise[Double | Null]
    
    def isActiveLinkAt(index: Double): js.Promise[Boolean]
    
    def isLarge(): js.Promise[Boolean]
    
    def isMedium(): js.Promise[Boolean]
    
    def isOnDarkBackground(): js.Promise[Boolean]
    
    def isOnGrayBackground(): js.Promise[Boolean]
    
    def isOnWhiteBackground(): js.Promise[Boolean]
  }
  object BreadcrumbsUniDriver {
    
    inline def apply(
      breadcrumbContentAt: Double => js.Promise[String | Null],
      breadcrumbsLength: CallbackTo[js.Promise[Double]],
      click: CallbackTo[js.Promise[Unit]],
      clickBreadcrumbAt: Double => js.Promise[Any],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getActiveItemId: CallbackTo[js.Promise[Double | Null]],
      isActiveLinkAt: Double => js.Promise[Boolean],
      isLarge: CallbackTo[js.Promise[Boolean]],
      isMedium: CallbackTo[js.Promise[Boolean]],
      isOnDarkBackground: CallbackTo[js.Promise[Boolean]],
      isOnGrayBackground: CallbackTo[js.Promise[Boolean]],
      isOnWhiteBackground: CallbackTo[js.Promise[Boolean]]
    ): BreadcrumbsUniDriver = {
      val __obj = js.Dynamic.literal(breadcrumbContentAt = js.Any.fromFunction1(breadcrumbContentAt), breadcrumbsLength = breadcrumbsLength.toJsFn, click = click.toJsFn, clickBreadcrumbAt = js.Any.fromFunction1(clickBreadcrumbAt), element = element.toJsFn, exists = exists.toJsFn, getActiveItemId = getActiveItemId.toJsFn, isActiveLinkAt = js.Any.fromFunction1(isActiveLinkAt), isLarge = isLarge.toJsFn, isMedium = isMedium.toJsFn, isOnDarkBackground = isOnDarkBackground.toJsFn, isOnGrayBackground = isOnGrayBackground.toJsFn, isOnWhiteBackground = isOnWhiteBackground.toJsFn)
      __obj.asInstanceOf[BreadcrumbsUniDriver]
    }
    
    extension [Self <: BreadcrumbsUniDriver](x: Self) {
      
      inline def setBreadcrumbContentAt(value: Double => js.Promise[String | Null]): Self = StObject.set(x, "breadcrumbContentAt", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbsLength(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "breadcrumbsLength", value.toJsFn)
      
      inline def setClickBreadcrumbAt(value: Double => js.Promise[Any]): Self = StObject.set(x, "clickBreadcrumbAt", js.Any.fromFunction1(value))
      
      inline def setGetActiveItemId(value: CallbackTo[js.Promise[Double | Null]]): Self = StObject.set(x, "getActiveItemId", value.toJsFn)
      
      inline def setIsActiveLinkAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isActiveLinkAt", js.Any.fromFunction1(value))
      
      inline def setIsLarge(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLarge", value.toJsFn)
      
      inline def setIsMedium(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMedium", value.toJsFn)
      
      inline def setIsOnDarkBackground(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isOnDarkBackground", value.toJsFn)
      
      inline def setIsOnGrayBackground(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isOnGrayBackground", value.toJsFn)
      
      inline def setIsOnWhiteBackground(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isOnWhiteBackground", value.toJsFn)
    }
  }
}
