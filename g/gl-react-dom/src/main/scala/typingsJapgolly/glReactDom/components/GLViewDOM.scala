package typingsJapgolly.glReactDom.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLContextAttributes
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.glReactDom.glviewdomMod.GLViewDOMProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GLViewDOM {
  
  inline def apply(height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GLViewDOMProps]))
  }
  
  @JSImport("gl-react-dom/GLViewDOM", "GLViewDOM")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.glReactDom.glviewdomMod.GLViewDOM] {
    
    inline def debug(value: Double): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def onContextCreate(value: /* gl */ WebGLRenderingContext => Callback): this.type = set("onContextCreate", js.Any.fromFunction1((t0: /* gl */ WebGLRenderingContext) => value(t0).runNow()))
    
    inline def onContextFailure(value: /* e */ js.Error => Callback): this.type = set("onContextFailure", js.Any.fromFunction1((t0: /* e */ js.Error) => value(t0).runNow()))
    
    inline def onContextLost(value: Callback): this.type = set("onContextLost", value.toJsFn)
    
    inline def onContextRestored(value: /* gl */ WebGLRenderingContext => Callback): this.type = set("onContextRestored", js.Any.fromFunction1((t0: /* gl */ WebGLRenderingContext) => value(t0).runNow()))
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def webglContextAttributes(value: WebGLContextAttributes): this.type = set("webglContextAttributes", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GLViewDOMProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
