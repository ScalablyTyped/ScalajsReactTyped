package typingsJapgolly.reactImageFallback

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.ImgHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image-fallback", JSImport.Default)
  @js.native
  open class default () extends Component[
          ReactImageFallbackProps & (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]), 
          Any, 
          Any
        ]
  
  type ReactImageFallback = japgolly.scalajs.react.facade.React.Component[
    ReactImageFallbackProps & (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]) & js.Object, 
    js.Object
  ]
  
  trait ReactImageFallbackProps extends StObject {
    
    var fallbackImage: String | Element | (js.Array[js.UndefOr[Element | String]])
    
    var initialImage: js.UndefOr[String | Element] = js.undefined
    
    var initialTimeout: js.UndefOr[Double] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object ReactImageFallbackProps {
    
    inline def apply(fallbackImage: String | Element | (js.Array[js.UndefOr[Element | String]])): ReactImageFallbackProps = {
      val __obj = js.Dynamic.literal(fallbackImage = fallbackImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageFallbackProps]
    }
    
    extension [Self <: ReactImageFallbackProps](x: Self) {
      
      inline def setFallbackImage(value: String | Element | (js.Array[js.UndefOr[Element | String]])): Self = StObject.set(x, "fallbackImage", value.asInstanceOf[js.Any])
      
      inline def setFallbackImageVarargs(value: (js.UndefOr[Element | String])*): Self = StObject.set(x, "fallbackImage", js.Array(value*))
      
      inline def setFallbackImageVdomElement(value: VdomElement): Self = StObject.set(x, "fallbackImage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitialImage(value: String | Element): Self = StObject.set(x, "initialImage", value.asInstanceOf[js.Any])
      
      inline def setInitialImageUndefined: Self = StObject.set(x, "initialImage", js.undefined)
      
      inline def setInitialImageVdomElement(value: VdomElement): Self = StObject.set(x, "initialImage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitialTimeout(value: Double): Self = StObject.set(x, "initialTimeout", value.asInstanceOf[js.Any])
      
      inline def setInitialTimeoutUndefined: Self = StObject.set(x, "initialTimeout", js.undefined)
      
      inline def setOnError(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
