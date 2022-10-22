package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesLoaderMod.LoaderColor
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoaderLoaderDotdriverMod {
  
  trait LoaderDriver
    extends StObject
       with BaseDriver {
    
    def component(): HTMLElement
    
    def getColor(): LoaderColor
    
    def getStatusMessage(): js.Promise[String]
    
    def getText(): String
    
    def hasText(): Boolean
    
    def isError(): Boolean
    
    def isLarge(): Boolean
    
    def isLoading(): Boolean
    
    def isMedium(): Boolean
    
    def isSmall(): Boolean
    
    def isSuccess(): Boolean
    
    def isTiny(): Boolean
  }
  object LoaderDriver {
    
    inline def apply(
      component: CallbackTo[HTMLElement],
      exists: CallbackTo[Boolean],
      getColor: CallbackTo[LoaderColor],
      getStatusMessage: CallbackTo[js.Promise[String]],
      getText: CallbackTo[String],
      hasText: CallbackTo[Boolean],
      isError: CallbackTo[Boolean],
      isLarge: CallbackTo[Boolean],
      isLoading: CallbackTo[Boolean],
      isMedium: CallbackTo[Boolean],
      isSmall: CallbackTo[Boolean],
      isSuccess: CallbackTo[Boolean],
      isTiny: CallbackTo[Boolean]
    ): LoaderDriver = {
      val __obj = js.Dynamic.literal(component = component.toJsFn, exists = exists.toJsFn, getColor = getColor.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getText = getText.toJsFn, hasText = hasText.toJsFn, isError = isError.toJsFn, isLarge = isLarge.toJsFn, isLoading = isLoading.toJsFn, isMedium = isMedium.toJsFn, isSmall = isSmall.toJsFn, isSuccess = isSuccess.toJsFn, isTiny = isTiny.toJsFn)
      __obj.asInstanceOf[LoaderDriver]
    }
    
    extension [Self <: LoaderDriver](x: Self) {
      
      inline def setComponent(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "component", value.toJsFn)
      
      inline def setGetColor(value: CallbackTo[LoaderColor]): Self = StObject.set(x, "getColor", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setHasText(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasText", value.toJsFn)
      
      inline def setIsError(value: CallbackTo[Boolean]): Self = StObject.set(x, "isError", value.toJsFn)
      
      inline def setIsLarge(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLarge", value.toJsFn)
      
      inline def setIsLoading(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoading", value.toJsFn)
      
      inline def setIsMedium(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMedium", value.toJsFn)
      
      inline def setIsSmall(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSmall", value.toJsFn)
      
      inline def setIsSuccess(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccess", value.toJsFn)
      
      inline def setIsTiny(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTiny", value.toJsFn)
    }
  }
}
