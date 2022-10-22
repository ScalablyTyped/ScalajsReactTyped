package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesImageImageDotuniDotdriverMod {
  
  trait ImageUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isTransparent(): js.Promise[Boolean]
  }
  object ImageUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isTransparent: CallbackTo[js.Promise[Boolean]]
    ): ImageUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isTransparent = isTransparent.toJsFn)
      __obj.asInstanceOf[ImageUniDriver]
    }
    
    extension [Self <: ImageUniDriver](x: Self) {
      
      inline def setIsTransparent(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTransparent", value.toJsFn)
    }
  }
}
