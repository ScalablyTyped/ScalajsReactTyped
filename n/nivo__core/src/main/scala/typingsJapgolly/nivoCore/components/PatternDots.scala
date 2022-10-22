package typingsJapgolly.nivoCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCore.anon.OmitPatternDotsDeftype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PatternDots {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OmitPatternDotsDeftype]))
  }
  
  @JSImport("@nivo/core", "PatternDots")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def stagger(value: Boolean): this.type = set("stagger", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OmitPatternDotsDeftype): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
