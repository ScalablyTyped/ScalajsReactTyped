package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalPreviewLayoutModalPreviewLayoutDotuniDotdriverMod {
  
  trait ModalPreviewLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickClose(): js.Promise[Unit]
    
    def clickOverlay(): js.Promise[Unit]
    
    def getPreviewActions(): UniDriver[Any]
    
    def getPreviewContent(): UniDriver[Any]
    
    def getPreviewTitle(): UniDriver[Any]
  }
  object ModalPreviewLayoutUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickClose: CallbackTo[js.Promise[Unit]],
      clickOverlay: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getPreviewActions: CallbackTo[UniDriver[Any]],
      getPreviewContent: CallbackTo[UniDriver[Any]],
      getPreviewTitle: CallbackTo[UniDriver[Any]]
    ): ModalPreviewLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickClose = clickClose.toJsFn, clickOverlay = clickOverlay.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getPreviewActions = getPreviewActions.toJsFn, getPreviewContent = getPreviewContent.toJsFn, getPreviewTitle = getPreviewTitle.toJsFn)
      __obj.asInstanceOf[ModalPreviewLayoutUniDriver]
    }
    
    extension [Self <: ModalPreviewLayoutUniDriver](x: Self) {
      
      inline def setClickClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickClose", value.toJsFn)
      
      inline def setClickOverlay(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOverlay", value.toJsFn)
      
      inline def setGetPreviewActions(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getPreviewActions", value.toJsFn)
      
      inline def setGetPreviewContent(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getPreviewContent", value.toJsFn)
      
      inline def setGetPreviewTitle(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getPreviewTitle", value.toJsFn)
    }
  }
}
