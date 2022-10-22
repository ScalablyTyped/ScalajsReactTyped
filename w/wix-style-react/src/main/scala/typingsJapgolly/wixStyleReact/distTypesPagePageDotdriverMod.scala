package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPagePageDotdriverMod {
  
  trait PageDriver
    extends StObject
       with BaseDriver {
    
    def backgroundImageExists(): Boolean
    
    def getPageHtml(): String
    
    def gradientClassNameExists(): Boolean
    
    def gradientContainerHeight(): String
    
    def hasClass(className: String): Boolean
    
    def tailExists(): Boolean
  }
  object PageDriver {
    
    inline def apply(
      backgroundImageExists: CallbackTo[Boolean],
      exists: CallbackTo[Boolean],
      getPageHtml: CallbackTo[String],
      gradientClassNameExists: CallbackTo[Boolean],
      gradientContainerHeight: CallbackTo[String],
      hasClass: String => Boolean,
      tailExists: CallbackTo[Boolean]
    ): PageDriver = {
      val __obj = js.Dynamic.literal(backgroundImageExists = backgroundImageExists.toJsFn, exists = exists.toJsFn, getPageHtml = getPageHtml.toJsFn, gradientClassNameExists = gradientClassNameExists.toJsFn, gradientContainerHeight = gradientContainerHeight.toJsFn, hasClass = js.Any.fromFunction1(hasClass), tailExists = tailExists.toJsFn)
      __obj.asInstanceOf[PageDriver]
    }
    
    extension [Self <: PageDriver](x: Self) {
      
      inline def setBackgroundImageExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "backgroundImageExists", value.toJsFn)
      
      inline def setGetPageHtml(value: CallbackTo[String]): Self = StObject.set(x, "getPageHtml", value.toJsFn)
      
      inline def setGradientClassNameExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "gradientClassNameExists", value.toJsFn)
      
      inline def setGradientContainerHeight(value: CallbackTo[String]): Self = StObject.set(x, "gradientContainerHeight", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setTailExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "tailExists", value.toJsFn)
    }
  }
}
