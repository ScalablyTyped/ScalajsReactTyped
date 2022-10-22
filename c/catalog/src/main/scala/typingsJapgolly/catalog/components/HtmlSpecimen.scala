package typingsJapgolly.catalog.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.catalog.catalogInts.`1`
import typingsJapgolly.catalog.catalogInts.`2`
import typingsJapgolly.catalog.catalogInts.`3`
import typingsJapgolly.catalog.catalogInts.`4`
import typingsJapgolly.catalog.catalogInts.`5`
import typingsJapgolly.catalog.catalogInts.`6`
import typingsJapgolly.catalog.mod.HtmlSpecimenProps
import typingsJapgolly.catalog.mod.SpecimenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HtmlSpecimen {
  
  inline def apply(children: String): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpecimenProps & HtmlSpecimenProps]))
  }
  
  @JSImport("catalog", "HtmlSpecimen")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.catalog.mod.HtmlSpecimen] {
    
    inline def dark(value: Boolean): this.type = set("dark", value.asInstanceOf[js.Any])
    
    inline def frame(value: Boolean): this.type = set("frame", value.asInstanceOf[js.Any])
    
    inline def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
    
    inline def noSource(value: Boolean): this.type = set("noSource", value.asInstanceOf[js.Any])
    
    inline def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    
    inline def rawBody(value: String): this.type = set("rawBody", value.asInstanceOf[js.Any])
    
    inline def rawOptions(value: String): this.type = set("rawOptions", value.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean | String | js.Array[String]): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def responsiveVarargs(value: String*): this.type = set("responsive", js.Array(value*))
    
    inline def showSource(value: Boolean): this.type = set("showSource", value.asInstanceOf[js.Any])
    
    inline def span(value: `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("span", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpecimenProps & HtmlSpecimenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
