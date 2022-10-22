package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.anon.OmitImageViewerPropsvisib
import typingsJapgolly.antdMobile.anon.OmitMultiImageViewerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsImageViewerMethodsMod {
  
  @JSImport("antd-mobile/es/components/image-viewer/methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearImageViewer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImageViewer")().asInstanceOf[Unit]
  
  inline def showImageViewer(props: OmitImageViewerPropsvisib): ImageViewerShowHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("showImageViewer")(props.asInstanceOf[js.Any]).asInstanceOf[ImageViewerShowHandler]
  
  inline def showMultiImageViewer(props: OmitMultiImageViewerProps): ImageViewerShowHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("showMultiImageViewer")(props.asInstanceOf[js.Any]).asInstanceOf[ImageViewerShowHandler]
  
  trait ImageViewerShowHandler extends StObject {
    
    def close(): Unit
  }
  object ImageViewerShowHandler {
    
    inline def apply(close: Callback): ImageViewerShowHandler = {
      val __obj = js.Dynamic.literal(close = close.toJsFn)
      __obj.asInstanceOf[ImageViewerShowHandler]
    }
    
    extension [Self <: ImageViewerShowHandler](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    }
  }
}
