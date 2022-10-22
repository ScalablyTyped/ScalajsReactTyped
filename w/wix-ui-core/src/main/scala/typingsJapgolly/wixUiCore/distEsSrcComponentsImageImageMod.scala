package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.wixUiCore.anon.Status
import typingsJapgolly.wixUiCore.distEsSrcComponentsImageConstsMod.ImageStatus
import typingsJapgolly.wixUiCore.wixUiCoreStrings.contain
import typingsJapgolly.wixUiCore.wixUiCoreStrings.cover
import typingsJapgolly.wixUiCore.wixUiCoreStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsImageImageMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/image/image", "Image")
  @js.native
  open class Image protected () extends PureComponent[ImageProps, ImageState, Any] {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: Any) = this()
    
    /* private */ val getErrorImage: Any = js.native
    
    /* private */ val getErrorSrc: Any = js.native
    
    /* private */ var getImageProps: Any = js.native
    
    /* private */ val getSrc: Any = js.native
    
    /* private */ val getSrcSet: Any = js.native
    
    /* private */ val handleOnError: Any = js.native
    
    /* private */ val handleOnLoad: Any = js.native
    
    /* private */ val isErrorState: Any = js.native
    
    /* private */ val isResized: Any = js.native
    
    @JSName("state")
    var state_Image: Status = js.native
  }
  
  trait ImageProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    /** A class name to be applied on the root element */
    var className: js.UndefOr[String] = js.undefined
    
    var errorImage: js.UndefOr[String] = js.undefined
    
    var nativeProps: js.UndefOr[ImgHTMLAttributes[HTMLImageElement]] = js.undefined
    
    /** A reference to be passed to the native image element */
    var nativeRef: js.UndefOr[Ref[HTMLImageElement]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.undefined
    
    var resizeMode: js.UndefOr[fill | contain | cover] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
  }
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setErrorImage(value: String): Self = StObject.set(x, "errorImage", value.asInstanceOf[js.Any])
      
      inline def setErrorImageUndefined: Self = StObject.set(x, "errorImage", js.undefined)
      
      inline def setNativeProps(value: ImgHTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "nativeProps", value.asInstanceOf[js.Any])
      
      inline def setNativePropsUndefined: Self = StObject.set(x, "nativeProps", js.undefined)
      
      inline def setNativeRef(value: Ref[HTMLImageElement]): Self = StObject.set(x, "nativeRef", value.asInstanceOf[js.Any])
      
      inline def setNativeRefFunction1(value: HTMLImageElement | Null => Callback): Self = StObject.set(x, "nativeRef", js.Any.fromFunction1((t0: HTMLImageElement | Null) => value(t0).runNow()))
      
      inline def setNativeRefNull: Self = StObject.set(x, "nativeRef", null)
      
      inline def setNativeRefUndefined: Self = StObject.set(x, "nativeRef", js.undefined)
      
      inline def setOnError(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setResizeMode(value: fill | contain | cover): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait ImageState extends StObject {
    
    var src: js.UndefOr[String] = js.undefined
    
    var status: ImageStatus
  }
  object ImageState {
    
    inline def apply(status: ImageStatus): ImageState = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageState]
    }
    
    extension [Self <: ImageState](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStatus(value: ImageStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
