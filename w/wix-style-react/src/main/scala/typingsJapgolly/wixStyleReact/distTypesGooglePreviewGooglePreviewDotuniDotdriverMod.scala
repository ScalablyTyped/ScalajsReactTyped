package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGooglePreviewGooglePreviewDotuniDotdriverMod {
  
  trait GooglePreviewUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDescription(): js.Promise[String]
    
    def getPreviewUrl(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object GooglePreviewUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getDescription: CallbackTo[js.Promise[String]],
      getPreviewUrl: CallbackTo[js.Promise[String]],
      getTitle: CallbackTo[js.Promise[String]]
    ): GooglePreviewUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getDescription = getDescription.toJsFn, getPreviewUrl = getPreviewUrl.toJsFn, getTitle = getTitle.toJsFn)
      __obj.asInstanceOf[GooglePreviewUniDriver]
    }
    
    extension [Self <: GooglePreviewUniDriver](x: Self) {
      
      inline def setGetDescription(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDescription", value.toJsFn)
      
      inline def setGetPreviewUrl(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPreviewUrl", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
    }
  }
}
