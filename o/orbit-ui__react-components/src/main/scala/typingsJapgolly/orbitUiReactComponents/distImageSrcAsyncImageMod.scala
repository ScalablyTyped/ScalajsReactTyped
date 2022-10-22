package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distImageSrcImageMod.InnerImageProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distImageSrcAsyncImageMod {
  
  @JSImport("@orbit-ui/react-components/dist/image/src/AsyncImage", "AsyncImage")
  @js.native
  val AsyncImage: OrbitComponent[HTMLElement, InnerAsyncImageProps] = js.native
  
  type AsyncImageProps = ComponentProps[OrbitComponent[HTMLElement, InnerAsyncImageProps]]
  
  trait InnerAsyncImageProps
    extends StObject
       with InnerImageProps {
    
    /**
      * React children.
      */
    var children: Node
    
    /**
      * The number of milliseconds to delay the rendering of the fallback.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * The allowed number of retry to load the async image.
      */
    var retryCount: js.UndefOr[Double] = js.undefined
  }
  object InnerAsyncImageProps {
    
    inline def apply(alt: String): InnerAsyncImageProps = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerAsyncImageProps]
    }
    
    extension [Self <: InnerAsyncImageProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
    }
  }
}
