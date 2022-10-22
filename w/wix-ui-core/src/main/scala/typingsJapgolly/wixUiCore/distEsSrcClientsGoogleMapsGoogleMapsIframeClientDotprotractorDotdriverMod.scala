package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsGoogleMapsGoogleMapsIframeClientDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/GoogleMapsIframeClient.protractor.driver", "googleMapsIframeClientDriverFactory")
  @js.native
  val googleMapsIframeClientDriverFactory: DriverFactory[GoogleMapsIframeClientDriver] = js.native
  
  trait GoogleMapsIframeClientDriver
    extends StObject
       with BaseDriver {
    
    def enterText(text: String): js.Promise[Unit]
    
    def getParsedResults(): js.Promise[Any]
    
    def getResultsElementWrapper(): ElementFinder
    
    def selectByValue(value: String): js.Promise[Unit]
  }
  object GoogleMapsIframeClientDriver {
    
    inline def apply(
      element: CallbackTo[ElementFinder],
      enterText: String => js.Promise[Unit],
      getParsedResults: CallbackTo[js.Promise[Any]],
      getResultsElementWrapper: CallbackTo[ElementFinder],
      selectByValue: String => js.Promise[Unit]
    ): GoogleMapsIframeClientDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), getParsedResults = getParsedResults.toJsFn, getResultsElementWrapper = getResultsElementWrapper.toJsFn, selectByValue = js.Any.fromFunction1(selectByValue))
      __obj.asInstanceOf[GoogleMapsIframeClientDriver]
    }
    
    extension [Self <: GoogleMapsIframeClientDriver](x: Self) {
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetParsedResults(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getParsedResults", value.toJsFn)
      
      inline def setGetResultsElementWrapper(value: CallbackTo[ElementFinder]): Self = StObject.set(x, "getResultsElementWrapper", value.toJsFn)
      
      inline def setSelectByValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "selectByValue", js.Any.fromFunction1(value))
    }
  }
}
