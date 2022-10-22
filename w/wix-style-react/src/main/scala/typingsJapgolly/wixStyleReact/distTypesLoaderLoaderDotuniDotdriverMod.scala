package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesLoaderMod.LoaderColor
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoaderLoaderDotuniDotdriverMod {
  
  trait LoaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** @deprecated Should be private */
    def component(): js.Promise[Any]
    
    def getColor(): js.Promise[LoaderColor]
    
    def getStatusMessage(): js.Promise[String]
    
    def getText(): js.Promise[String]
    
    def hasText(): js.Promise[Boolean]
    
    def isError(): js.Promise[Boolean]
    
    def isLarge(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
    
    def isMedium(): js.Promise[Boolean]
    
    def isSmall(): js.Promise[Boolean]
    
    def isSuccess(): js.Promise[Boolean]
    
    def isTiny(): js.Promise[Boolean]
  }
  object LoaderUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      component: CallbackTo[js.Promise[Any]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getColor: CallbackTo[js.Promise[LoaderColor]],
      getStatusMessage: CallbackTo[js.Promise[String]],
      getText: CallbackTo[js.Promise[String]],
      hasText: CallbackTo[js.Promise[Boolean]],
      isError: CallbackTo[js.Promise[Boolean]],
      isLarge: CallbackTo[js.Promise[Boolean]],
      isLoading: CallbackTo[js.Promise[Boolean]],
      isMedium: CallbackTo[js.Promise[Boolean]],
      isSmall: CallbackTo[js.Promise[Boolean]],
      isSuccess: CallbackTo[js.Promise[Boolean]],
      isTiny: CallbackTo[js.Promise[Boolean]]
    ): LoaderUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, component = component.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getColor = getColor.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getText = getText.toJsFn, hasText = hasText.toJsFn, isError = isError.toJsFn, isLarge = isLarge.toJsFn, isLoading = isLoading.toJsFn, isMedium = isMedium.toJsFn, isSmall = isSmall.toJsFn, isSuccess = isSuccess.toJsFn, isTiny = isTiny.toJsFn)
      __obj.asInstanceOf[LoaderUniDriver]
    }
    
    extension [Self <: LoaderUniDriver](x: Self) {
      
      inline def setComponent(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "component", value.toJsFn)
      
      inline def setGetColor(value: CallbackTo[js.Promise[LoaderColor]]): Self = StObject.set(x, "getColor", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setHasText(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasText", value.toJsFn)
      
      inline def setIsError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isError", value.toJsFn)
      
      inline def setIsLarge(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLarge", value.toJsFn)
      
      inline def setIsLoading(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLoading", value.toJsFn)
      
      inline def setIsMedium(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMedium", value.toJsFn)
      
      inline def setIsSmall(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSmall", value.toJsFn)
      
      inline def setIsSuccess(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccess", value.toJsFn)
      
      inline def setIsTiny(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTiny", value.toJsFn)
    }
  }
}
