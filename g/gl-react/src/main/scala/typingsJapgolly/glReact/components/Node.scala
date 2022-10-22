package typingsJapgolly.glReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.glReact.anon.Color
import typingsJapgolly.glReact.anon.Dst
import typingsJapgolly.glReact.mod.NodeProps
import typingsJapgolly.glReact.mod.ShaderDefinition
import typingsJapgolly.glReact.mod.ShaderIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Node {
  
  inline def apply(shader: ShaderIdentifier | ShaderDefinition): Builder = {
    val __props = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NodeProps]))
  }
  
  @JSImport("gl-react", "Node")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.glReact.mod.Node] {
    
    inline def backbuffering(value: Boolean): this.type = set("backbuffering", value.asInstanceOf[js.Any])
    
    inline def blendFunc(value: Dst): this.type = set("blendFunc", value.asInstanceOf[js.Any])
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def clear(value: Color): this.type = set("clear", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def ignoreUnusedUniforms(value: js.Array[String] | Boolean): this.type = set("ignoreUnusedUniforms", value.asInstanceOf[js.Any])
    
    inline def ignoreUnusedUniformsVarargs(value: String*): this.type = set("ignoreUnusedUniforms", js.Array(value*))
    
    inline def onDraw(value: Callback): this.type = set("onDraw", value.toJsFn)
    
    inline def sync(value: Boolean): this.type = set("sync", value.asInstanceOf[js.Any])
    
    inline def uniformsOptions(value: Any): this.type = set("uniformsOptions", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
