package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsImageImageDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/image/image.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imageDriverFactory(base: UniDriver[Any]): ImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ImageDriver]
  
  trait ImageDriver
    extends StObject
       with BaseUniDriver {
    
    def getAlt(): js.Promise[String]
    
    def getLoadStatus(): js.Promise[String]
    
    def getSrc(): js.Promise[String | Null]
  }
  object ImageDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAlt: CallbackTo[js.Promise[String]],
      getLoadStatus: CallbackTo[js.Promise[String]],
      getSrc: CallbackTo[js.Promise[String | Null]]
    ): ImageDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAlt = getAlt.toJsFn, getLoadStatus = getLoadStatus.toJsFn, getSrc = getSrc.toJsFn)
      __obj.asInstanceOf[ImageDriver]
    }
    
    extension [Self <: ImageDriver](x: Self) {
      
      inline def setGetAlt(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAlt", value.toJsFn)
      
      inline def setGetLoadStatus(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLoadStatus", value.toJsFn)
      
      inline def setGetSrc(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getSrc", value.toJsFn)
    }
  }
}
