package typingsJapgolly.glReactExpo.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.glReactExpo.glviewnativeMod.GLViewNativeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GLViewNative {
  
  @JSImport("gl-react-expo/GLViewNative", "GLViewNative")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.glReactExpo.glviewnativeMod.GLViewNative] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def onContextCreate(value: /* gl */ WebGLRenderingContext => Callback): this.type = set("onContextCreate", js.Any.fromFunction1((t0: /* gl */ WebGLRenderingContext) => value(t0).runNow()))
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GLViewNative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GLViewNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
