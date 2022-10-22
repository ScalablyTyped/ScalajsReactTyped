package typingsJapgolly.reactSvgPanZoomLoader.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSvgPanZoomLoader.mod.ReactSvgPanZoomLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSvgPanZoomLoader {
  
  inline def apply(render: Node => Node, src: String): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render), src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactSvgPanZoomLoaderProps]))
  }
  
  @JSImport("react-svg-pan-zoom-loader", "ReactSvgPanZoomLoader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def proxy(value: VdomNode): this.type = set("proxy", value.rawNode.asInstanceOf[js.Any])
    
    inline def proxyNull: this.type = set("proxy", null)
    
    inline def proxyVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("proxy", js.Array(value*))
    
    inline def proxyVdomElement(value: VdomElement): this.type = set("proxy", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactSvgPanZoomLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
