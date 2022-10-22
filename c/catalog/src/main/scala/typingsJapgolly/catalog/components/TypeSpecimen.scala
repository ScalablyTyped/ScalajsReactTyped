package typingsJapgolly.catalog.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.catalog.catalogInts.`1`
import typingsJapgolly.catalog.catalogInts.`2`
import typingsJapgolly.catalog.catalogInts.`3`
import typingsJapgolly.catalog.catalogInts.`4`
import typingsJapgolly.catalog.catalogInts.`5`
import typingsJapgolly.catalog.catalogInts.`6`
import typingsJapgolly.catalog.mod.SpecimenProps
import typingsJapgolly.catalog.mod.TypeSpecimenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeSpecimen {
  
  inline def apply(font: String, headings: js.Array[Double | String], weight: String): Builder = {
    val __props = js.Dynamic.literal(font = font.asInstanceOf[js.Any], headings = headings.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpecimenProps & TypeSpecimenProps]))
  }
  
  @JSImport("catalog", "TypeSpecimen")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.catalog.mod.TypeSpecimen] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def rawBody(value: String): this.type = set("rawBody", value.asInstanceOf[js.Any])
    
    inline def rawOptions(value: String): this.type = set("rawOptions", value.asInstanceOf[js.Any])
    
    inline def span(value: `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("span", value.asInstanceOf[js.Any])
    
    inline def style(value: String): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpecimenProps & TypeSpecimenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
