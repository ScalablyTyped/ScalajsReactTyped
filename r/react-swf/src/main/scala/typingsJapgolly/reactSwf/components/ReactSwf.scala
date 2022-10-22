package typingsJapgolly.reactSwf.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSwf.mod.^
import typingsJapgolly.reactSwf.mod.rswf.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSwf {
  
  inline def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-swf", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def allowFullScreen(value: Boolean): this.type = set("allowFullScreen", value.asInstanceOf[js.Any])
    
    inline def base(value: String): this.type = set("base", value.asInstanceOf[js.Any])
    
    inline def bgcolor(value: String): this.type = set("bgcolor", value.asInstanceOf[js.Any])
    
    inline def flashVars(value: js.Object | String): this.type = set("flashVars", value.asInstanceOf[js.Any])
    
    inline def fullScreenAspectRatio(value: String): this.type = set("fullScreenAspectRatio", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def menu(value: Boolean): this.type = set("menu", value.asInstanceOf[js.Any])
    
    inline def play(value: Boolean): this.type = set("play", value.asInstanceOf[js.Any])
    
    inline def pluginspage(value: String): this.type = set("pluginspage", value.asInstanceOf[js.Any])
    
    inline def quality(value: String): this.type = set("quality", value.asInstanceOf[js.Any])
    
    inline def salign(value: String): this.type = set("salign", value.asInstanceOf[js.Any])
    
    inline def scale(value: String): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wmode(value: String): this.type = set("wmode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
