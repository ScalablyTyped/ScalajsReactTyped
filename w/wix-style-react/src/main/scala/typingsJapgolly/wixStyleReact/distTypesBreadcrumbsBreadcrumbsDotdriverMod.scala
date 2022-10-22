package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBreadcrumbsBreadcrumbsDotdriverMod {
  
  trait BreadcrumbsDriver
    extends StObject
       with BaseDriver {
    
    def breadcrumbContentAt(position: Double): String | Null
    
    def breadcrumbsLength(): Double
    
    def clickBreadcrumbAt(position: Double): Any
    
    def getActiveItemId(): Double | Null
    
    def isActiveLinkAt(index: Double): Boolean
    
    def isLarge(): Boolean
    
    def isMedium(): Boolean
    
    def isOnDarkBackground(): Boolean
    
    def isOnGrayBackground(): Boolean
    
    def isOnWhiteBackground(): Boolean
  }
  object BreadcrumbsDriver {
    
    inline def apply(
      breadcrumbContentAt: Double => String | Null,
      breadcrumbsLength: CallbackTo[Double],
      clickBreadcrumbAt: Double => Any,
      exists: CallbackTo[Boolean],
      getActiveItemId: CallbackTo[Double | Null],
      isActiveLinkAt: Double => Boolean,
      isLarge: CallbackTo[Boolean],
      isMedium: CallbackTo[Boolean],
      isOnDarkBackground: CallbackTo[Boolean],
      isOnGrayBackground: CallbackTo[Boolean],
      isOnWhiteBackground: CallbackTo[Boolean]
    ): BreadcrumbsDriver = {
      val __obj = js.Dynamic.literal(breadcrumbContentAt = js.Any.fromFunction1(breadcrumbContentAt), breadcrumbsLength = breadcrumbsLength.toJsFn, clickBreadcrumbAt = js.Any.fromFunction1(clickBreadcrumbAt), exists = exists.toJsFn, getActiveItemId = getActiveItemId.toJsFn, isActiveLinkAt = js.Any.fromFunction1(isActiveLinkAt), isLarge = isLarge.toJsFn, isMedium = isMedium.toJsFn, isOnDarkBackground = isOnDarkBackground.toJsFn, isOnGrayBackground = isOnGrayBackground.toJsFn, isOnWhiteBackground = isOnWhiteBackground.toJsFn)
      __obj.asInstanceOf[BreadcrumbsDriver]
    }
    
    extension [Self <: BreadcrumbsDriver](x: Self) {
      
      inline def setBreadcrumbContentAt(value: Double => String | Null): Self = StObject.set(x, "breadcrumbContentAt", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbsLength(value: CallbackTo[Double]): Self = StObject.set(x, "breadcrumbsLength", value.toJsFn)
      
      inline def setClickBreadcrumbAt(value: Double => Any): Self = StObject.set(x, "clickBreadcrumbAt", js.Any.fromFunction1(value))
      
      inline def setGetActiveItemId(value: CallbackTo[Double | Null]): Self = StObject.set(x, "getActiveItemId", value.toJsFn)
      
      inline def setIsActiveLinkAt(value: Double => Boolean): Self = StObject.set(x, "isActiveLinkAt", js.Any.fromFunction1(value))
      
      inline def setIsLarge(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLarge", value.toJsFn)
      
      inline def setIsMedium(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMedium", value.toJsFn)
      
      inline def setIsOnDarkBackground(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOnDarkBackground", value.toJsFn)
      
      inline def setIsOnGrayBackground(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOnGrayBackground", value.toJsFn)
      
      inline def setIsOnWhiteBackground(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOnWhiteBackground", value.toJsFn)
    }
  }
}
