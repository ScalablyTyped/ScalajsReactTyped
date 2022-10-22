package typingsJapgolly.reactSvgPanZoomLoader

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-pan-zoom-loader", "ReactSvgPanZoomLoader")
  @js.native
  val ReactSvgPanZoomLoader: ComponentType[ReactSvgPanZoomLoaderProps] = js.native
  
  @JSImport("react-svg-pan-zoom-loader", "SvgLoaderSelectElement")
  @js.native
  val SvgLoaderSelectElement: ComponentType[SvgLoaderSelectElementProps] = js.native
  
  trait ReactSvgPanZoomLoaderProps extends StObject {
    
    var proxy: js.UndefOr[Node] = js.undefined
    
    def render(content: Node): Node
    
    var src: String
  }
  object ReactSvgPanZoomLoaderProps {
    
    inline def apply(render: Node => Node, src: String): ReactSvgPanZoomLoaderProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactSvgPanZoomLoaderProps]
    }
    
    extension [Self <: ReactSvgPanZoomLoaderProps](x: Self) {
      
      inline def setProxy(value: VdomNode): Self = StObject.set(x, "proxy", value.rawNode.asInstanceOf[js.Any])
      
      inline def setProxyNull: Self = StObject.set(x, "proxy", null)
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setProxyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "proxy", js.Array(value*))
      
      inline def setProxyVdomElement(value: VdomElement): Self = StObject.set(x, "proxy", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRender(value: Node => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait SvgLoaderSelectElementProps
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    var children: js.UndefOr[String] = js.undefined
    
    var selector: String
  }
  object SvgLoaderSelectElementProps {
    
    inline def apply(selector: String): SvgLoaderSelectElementProps = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgLoaderSelectElementProps]
    }
    
    extension [Self <: SvgLoaderSelectElementProps](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
