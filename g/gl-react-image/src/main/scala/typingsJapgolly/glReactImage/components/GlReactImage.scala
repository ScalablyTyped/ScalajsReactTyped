package typingsJapgolly.glReactImage.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.glReactImage.glReactImageStrings.contain
import typingsJapgolly.glReactImage.glReactImageStrings.cover
import typingsJapgolly.glReactImage.glReactImageStrings.free
import typingsJapgolly.glReactImage.glReactImageStrings.stretch
import typingsJapgolly.glReactImage.mod.GLImageProps
import typingsJapgolly.glReactImage.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlReactImage {
  
  inline def apply(source: Any): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GLImageProps]))
  }
  
  @JSImport("gl-react-image", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def center(value: js.Tuple2[Double, Double]): this.type = set("center", value.asInstanceOf[js.Any])
    
    inline def resizeMode(value: cover | free | contain | stretch): this.type = set("resizeMode", value.asInstanceOf[js.Any])
    
    inline def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GLImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
