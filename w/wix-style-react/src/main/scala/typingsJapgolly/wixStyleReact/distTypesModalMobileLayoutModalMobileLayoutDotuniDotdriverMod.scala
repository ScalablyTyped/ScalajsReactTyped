package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalMobileLayoutModalMobileLayoutDotuniDotdriverMod {
  
  trait ModalMobileLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickCloseButton(): js.Promise[Unit]
    
    def clickOverlay(): js.Promise[Unit]
    
    def closeButtonExists(): js.Promise[Boolean]
    
    def getContent(): UniDriver[Any]
    
    def getFooter(): UniDriver[Any]
    
    def getTitle(): UniDriver[Any]
  }
  object ModalMobileLayoutUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickCloseButton: CallbackTo[js.Promise[Unit]],
      clickOverlay: CallbackTo[js.Promise[Unit]],
      closeButtonExists: CallbackTo[js.Promise[Boolean]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getContent: CallbackTo[UniDriver[Any]],
      getFooter: CallbackTo[UniDriver[Any]],
      getTitle: CallbackTo[UniDriver[Any]]
    ): ModalMobileLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickCloseButton = clickCloseButton.toJsFn, clickOverlay = clickOverlay.toJsFn, closeButtonExists = closeButtonExists.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getContent = getContent.toJsFn, getFooter = getFooter.toJsFn, getTitle = getTitle.toJsFn)
      __obj.asInstanceOf[ModalMobileLayoutUniDriver]
    }
    
    extension [Self <: ModalMobileLayoutUniDriver](x: Self) {
      
      inline def setClickCloseButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickCloseButton", value.toJsFn)
      
      inline def setClickOverlay(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOverlay", value.toJsFn)
      
      inline def setCloseButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "closeButtonExists", value.toJsFn)
      
      inline def setGetContent(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setGetFooter(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getFooter", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getTitle", value.toJsFn)
    }
  }
}
