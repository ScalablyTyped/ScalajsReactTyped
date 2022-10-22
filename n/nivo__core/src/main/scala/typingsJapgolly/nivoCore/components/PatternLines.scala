package typingsJapgolly.nivoCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCore.anon.OmitPatternLinesDeftype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PatternLines {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OmitPatternLinesDeftype]))
  }
  
  @JSImport("@nivo/core", "PatternLines")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def lineWidth(value: Double): this.type = set("lineWidth", value.asInstanceOf[js.Any])
    
    inline def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    inline def spacing(value: Double): this.type = set("spacing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OmitPatternLinesDeftype): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
