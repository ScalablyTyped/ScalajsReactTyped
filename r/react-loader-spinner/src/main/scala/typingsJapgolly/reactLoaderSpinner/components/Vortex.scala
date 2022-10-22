package typingsJapgolly.reactLoaderSpinner.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLoaderSpinner.distLoaderVortexMod.VortexProps
import typingsJapgolly.reactLoaderSpinner.distTypeMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Vortex {
  
  @JSImport("react-loader-spinner", "Vortex")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Tuple6[String, String, String, String, String, String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wrapperClass(value: String): this.type = set("wrapperClass", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: Style): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Vortex.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VortexProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
