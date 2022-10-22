package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPagePageDotuniDotdriverMod {
  
  trait PageUniDriver
    extends StObject
       with BaseUniDriver {
    
    def backgroundImageExists(): js.Promise[Boolean]
    
    def getPageHtml(): js.Promise[Any]
    
    def gradientClassNameExists(): js.Promise[Boolean]
    
    def gradientContainerHeight(): js.Promise[String]
    
    def hasClass(name: String): js.Promise[Boolean]
    
    def tailExists(): js.Promise[Boolean]
  }
  object PageUniDriver {
    
    inline def apply(
      backgroundImageExists: CallbackTo[js.Promise[Boolean]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getPageHtml: CallbackTo[js.Promise[Any]],
      gradientClassNameExists: CallbackTo[js.Promise[Boolean]],
      gradientContainerHeight: CallbackTo[js.Promise[String]],
      hasClass: String => js.Promise[Boolean],
      tailExists: CallbackTo[js.Promise[Boolean]]
    ): PageUniDriver = {
      val __obj = js.Dynamic.literal(backgroundImageExists = backgroundImageExists.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getPageHtml = getPageHtml.toJsFn, gradientClassNameExists = gradientClassNameExists.toJsFn, gradientContainerHeight = gradientContainerHeight.toJsFn, hasClass = js.Any.fromFunction1(hasClass), tailExists = tailExists.toJsFn)
      __obj.asInstanceOf[PageUniDriver]
    }
    
    extension [Self <: PageUniDriver](x: Self) {
      
      inline def setBackgroundImageExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "backgroundImageExists", value.toJsFn)
      
      inline def setGetPageHtml(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getPageHtml", value.toJsFn)
      
      inline def setGradientClassNameExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "gradientClassNameExists", value.toJsFn)
      
      inline def setGradientContainerHeight(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "gradientContainerHeight", value.toJsFn)
      
      inline def setHasClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setTailExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "tailExists", value.toJsFn)
    }
  }
}
