package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsMediaImageMediaImageDotprivateDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/media-image/media-image.private.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mediaImageDriverFactory(base: UniDriver[Any]): MediaImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaImageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MediaImageDriver]
  
  trait MediaImageDriver
    extends StObject
       with typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageDotuniDotdriverMod.MediaImageDriver {
    
    def getHeightAttribute(): js.Promise[Double]
    
    def getTagName(): js.Promise[String]
    
    def getWidthAttribute(): js.Promise[Double]
    
    def hasClass(className: String): js.Promise[Boolean]
  }
  object MediaImageDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAlt: CallbackTo[js.Promise[String]],
      getHeightAttribute: CallbackTo[js.Promise[Double]],
      getLoadStatus: CallbackTo[js.Promise[String]],
      getSrc: CallbackTo[js.Promise[String | Null]],
      getTagName: CallbackTo[js.Promise[String]],
      getWidthAttribute: CallbackTo[js.Promise[Double]],
      hasClass: String => js.Promise[Boolean],
      isError: CallbackTo[js.Promise[Boolean]],
      isLoaded: CallbackTo[js.Promise[Boolean]],
      isLoading: CallbackTo[js.Promise[Boolean]]
    ): MediaImageDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAlt = getAlt.toJsFn, getHeightAttribute = getHeightAttribute.toJsFn, getLoadStatus = getLoadStatus.toJsFn, getSrc = getSrc.toJsFn, getTagName = getTagName.toJsFn, getWidthAttribute = getWidthAttribute.toJsFn, hasClass = js.Any.fromFunction1(hasClass), isError = isError.toJsFn, isLoaded = isLoaded.toJsFn, isLoading = isLoading.toJsFn)
      __obj.asInstanceOf[MediaImageDriver]
    }
    
    extension [Self <: MediaImageDriver](x: Self) {
      
      inline def setGetHeightAttribute(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getHeightAttribute", value.toJsFn)
      
      inline def setGetTagName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTagName", value.toJsFn)
      
      inline def setGetWidthAttribute(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getWidthAttribute", value.toJsFn)
      
      inline def setHasClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
    }
  }
}
