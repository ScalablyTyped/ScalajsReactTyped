package typingsJapgolly.catalog.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.catalog.catalogInts.`1`
import typingsJapgolly.catalog.catalogInts.`2`
import typingsJapgolly.catalog.catalogInts.`3`
import typingsJapgolly.catalog.catalogInts.`4`
import typingsJapgolly.catalog.catalogInts.`5`
import typingsJapgolly.catalog.catalogInts.`6`
import typingsJapgolly.catalog.mod.SpecimenProps
import typingsJapgolly.catalog.mod.VideoSpecimenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VideoSpecimen {
  
  inline def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpecimenProps & VideoSpecimenProps]))
  }
  
  @JSImport("catalog", "VideoSpecimen")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.catalog.mod.VideoSpecimen] {
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    inline def rawBody(value: String): this.type = set("rawBody", value.asInstanceOf[js.Any])
    
    inline def rawOptions(value: String): this.type = set("rawOptions", value.asInstanceOf[js.Any])
    
    inline def span(value: `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("span", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpecimenProps & VideoSpecimenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
