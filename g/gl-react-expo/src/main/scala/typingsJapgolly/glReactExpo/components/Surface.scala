package typingsJapgolly.glReactExpo.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.glReact.mod.SurfaceProps
import typingsJapgolly.glReact.mod.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Surface {
  
  @JSImport("gl-react-expo", "Surface")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.glReactExpo.mod.Surface] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
    
    inline def onLoadError(value: /* e */ js.Error => Callback): this.type = set("onLoadError", js.Any.fromFunction1((t0: /* e */ js.Error) => value(t0).runNow()))
    
    inline def preload(value: js.Array[Any]): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def preloadVarargs(value: Any*): this.type = set("preload", js.Array(value*))
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def visitor(value: Visitor): this.type = set("visitor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Surface.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SurfaceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
