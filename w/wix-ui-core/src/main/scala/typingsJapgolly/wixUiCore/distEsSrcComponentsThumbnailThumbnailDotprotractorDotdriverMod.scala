package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsThumbnailThumbnailDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/thumbnail/Thumbnail.protractor.driver", "thumbnailDriverFactory")
  @js.native
  val thumbnailDriverFactory: DriverFactory[ThumbnailDriver] = js.native
  
  trait ThumbnailDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def mouseEnter(): js.Promise[Unit]
  }
  object ThumbnailDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      mouseEnter: CallbackTo[js.Promise[Unit]]
    ): ThumbnailDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, mouseEnter = mouseEnter.toJsFn)
      __obj.asInstanceOf[ThumbnailDriver]
    }
    
    extension [Self <: ThumbnailDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setMouseEnter(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    }
  }
}
