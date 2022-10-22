package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antdMobile.esUtilsRenderToContainerMod.GetContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.MultiImageViewerProps, 'visible'> */
trait OmitMultiImageViewerProps extends StObject {
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var defaultIndex: js.UndefOr[Double] = js.undefined
  
  var getContainer: js.UndefOr[GetContainer] = js.undefined
  
  var images: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var renderFooter: js.UndefOr[js.Function2[/* image */ String, /* index */ Double, Node]] = js.undefined
}
object OmitMultiImageViewerProps {
  
  inline def apply(): OmitMultiImageViewerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitMultiImageViewerProps]
  }
  
  extension [Self <: OmitMultiImageViewerProps](x: Self) {
    
    inline def setAfterClose(value: Callback): Self = StObject.set(x, "afterClose", value.toJsFn)
    
    inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultIndexUndefined: Self = StObject.set(x, "defaultIndex", js.undefined)
    
    inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    inline def setGetContainerCallbackTo(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContainer", value.toJsFn)
    
    inline def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
    
    inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnIndexChange(value: /* index */ Double => Callback): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
    
    inline def setRenderFooter(value: (/* image */ String, /* index */ Double) => Node): Self = StObject.set(x, "renderFooter", js.Any.fromFunction2(value))
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
  }
}
