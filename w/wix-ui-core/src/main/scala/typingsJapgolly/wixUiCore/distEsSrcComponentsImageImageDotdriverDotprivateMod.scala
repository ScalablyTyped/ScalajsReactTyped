package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsImageImageDotdriverDotprivateMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/image/image.driver.private", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imageDriverFactory(base: UniDriver[Any]): ImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ImageDriver]
  
  trait ImageDriver
    extends StObject
       with typingsJapgolly.wixUiCore.distEsSrcComponentsImageImageDotuniDotdriverMod.ImageDriver {
    
    def getResizeMode(): js.Promise[String | Boolean]
    
    def getSrcSet(): js.Promise[String]
    
    def getTagName(): js.Promise[String]
    
    def hasClass(className: String): js.Promise[Boolean]
  }
  object ImageDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAlt: CallbackTo[js.Promise[String]],
      getLoadStatus: CallbackTo[js.Promise[String]],
      getResizeMode: CallbackTo[js.Promise[String | Boolean]],
      getSrc: CallbackTo[js.Promise[String | Null]],
      getSrcSet: CallbackTo[js.Promise[String]],
      getTagName: CallbackTo[js.Promise[String]],
      hasClass: String => js.Promise[Boolean]
    ): ImageDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAlt = getAlt.toJsFn, getLoadStatus = getLoadStatus.toJsFn, getResizeMode = getResizeMode.toJsFn, getSrc = getSrc.toJsFn, getSrcSet = getSrcSet.toJsFn, getTagName = getTagName.toJsFn, hasClass = js.Any.fromFunction1(hasClass))
      __obj.asInstanceOf[ImageDriver]
    }
    
    extension [Self <: ImageDriver](x: Self) {
      
      inline def setGetResizeMode(value: CallbackTo[js.Promise[String | Boolean]]): Self = StObject.set(x, "getResizeMode", value.toJsFn)
      
      inline def setGetSrcSet(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSrcSet", value.toJsFn)
      
      inline def setGetTagName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTagName", value.toJsFn)
      
      inline def setHasClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
    }
  }
}
