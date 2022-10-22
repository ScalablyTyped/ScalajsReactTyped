package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsImageImageDotuniDotdriverMod.ImageDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsMediaImageMediaImageDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/media-image/media-image.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mediaImageDriverFactory(base: UniDriver[Any]): MediaImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaImageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MediaImageDriver]
  
  trait MediaImageDriver
    extends StObject
       with ImageDriver {
    
    def isError(): js.Promise[Boolean]
    
    def isLoaded(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
  }
  object MediaImageDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAlt: CallbackTo[js.Promise[String]],
      getLoadStatus: CallbackTo[js.Promise[String]],
      getSrc: CallbackTo[js.Promise[String | Null]],
      isError: CallbackTo[js.Promise[Boolean]],
      isLoaded: CallbackTo[js.Promise[Boolean]],
      isLoading: CallbackTo[js.Promise[Boolean]]
    ): MediaImageDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAlt = getAlt.toJsFn, getLoadStatus = getLoadStatus.toJsFn, getSrc = getSrc.toJsFn, isError = isError.toJsFn, isLoaded = isLoaded.toJsFn, isLoading = isLoading.toJsFn)
      __obj.asInstanceOf[MediaImageDriver]
    }
    
    extension [Self <: MediaImageDriver](x: Self) {
      
      inline def setIsError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isError", value.toJsFn)
      
      inline def setIsLoaded(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLoaded", value.toJsFn)
      
      inline def setIsLoading(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLoading", value.toJsFn)
    }
  }
}
