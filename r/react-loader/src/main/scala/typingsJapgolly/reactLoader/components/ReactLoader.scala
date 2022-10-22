package typingsJapgolly.reactLoader.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLoader.mod.LoaderOptions
import typingsJapgolly.reactLoader.mod.LoaderProps
import typingsJapgolly.reactLoader.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLoader {
  
  inline def apply(loaded: Boolean): Builder = {
    val __props = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LoaderProps]))
  }
  
  @JSImport("react-loader", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def corners(value: Double): this.type = set("corners", value.asInstanceOf[js.Any])
    
    inline def direction(value: Double): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def fps(value: Double): this.type = set("fps", value.asInstanceOf[js.Any])
    
    inline def hwaccel(value: Boolean): this.type = set("hwaccel", value.asInstanceOf[js.Any])
    
    inline def left(value: String): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    
    inline def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    
    inline def loadedClassName(value: String): this.type = set("loadedClassName", value.asInstanceOf[js.Any])
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def options(value: LoaderOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def shadow(value: Boolean): this.type = set("shadow", value.asInstanceOf[js.Any])
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def top(value: String): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def trail(value: Double): this.type = set("trail", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
