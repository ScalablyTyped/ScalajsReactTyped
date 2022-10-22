package typingsJapgolly.reactImageloader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-imageloader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ImageLoaderProps, js.Object, Any]
  
  type ImageLoader = japgolly.scalajs.react.facade.React.Component[ImageLoaderProps & js.Object, js.Object]
  
  trait ImageLoaderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    /** An optional class name for the wrapper component. */
    var className: js.UndefOr[String] = js.undefined
    
    /** An optional object containing props for the underlying img component. */
    var imgProps: js.UndefOr[Any] = js.undefined
    
    /** An optional handler for the error event. */
    var onError: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    /** An optional handler for the load event. */
    var onLoad: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    /** An optional function that returns a React element to be shown while the image loads. */
    var preloader: js.UndefOr[js.Function1[/* params */ Any, Element]] = js.undefined
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[ImageLoaderProps & js.Object, js.Object]
        ]
      ] = js.undefined
    
    /** The URL of the image to be loaded. */
    var src: String
    
    /** An optional object containing styles for the wrapper component. */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** A function that takes a props argument and returns a React element to be used as the wrapper component. Defaults to React.DOM.span. */
    var wrapper: js.UndefOr[js.Function1[/* props */ Any, Element]] = js.undefined
  }
  object ImageLoaderProps {
    
    inline def apply(src: String): ImageLoaderProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageLoaderProps]
    }
    
    extension [Self <: ImageLoaderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setImgProps(value: Any): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
      
      inline def setImgPropsUndefined: Self = StObject.set(x, "imgProps", js.undefined)
      
      inline def setOnError(value: /* event */ Any => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* event */ Any => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setPreloader(value: /* params */ Any => Element): Self = StObject.set(x, "preloader", js.Any.fromFunction1(value))
      
      inline def setPreloaderUndefined: Self = StObject.set(x, "preloader", js.undefined)
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[ImageLoaderProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[ImageLoaderProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[ImageLoaderProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrapper(value: /* props */ Any => Element): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
