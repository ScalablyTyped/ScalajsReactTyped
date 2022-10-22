package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltInts.`1`
import typingsJapgolly.gestalt.gestaltInts.`2`
import typingsJapgolly.gestalt.gestaltInts.`3`
import typingsJapgolly.gestalt.gestaltInts.`4`
import typingsJapgolly.gestalt.gestaltInts.`5`
import typingsJapgolly.gestalt.gestaltInts.`6`
import typingsJapgolly.gestalt.gestaltStrings.`100`
import typingsJapgolly.gestalt.gestaltStrings.`200`
import typingsJapgolly.gestalt.gestaltStrings.`300`
import typingsJapgolly.gestalt.gestaltStrings.`400`
import typingsJapgolly.gestalt.gestaltStrings.`500`
import typingsJapgolly.gestalt.gestaltStrings.`600`
import typingsJapgolly.gestalt.gestaltStrings.breakWord
import typingsJapgolly.gestalt.gestaltStrings.center
import typingsJapgolly.gestalt.gestaltStrings.dark
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.end
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.forceLeft
import typingsJapgolly.gestalt.gestaltStrings.forceRight
import typingsJapgolly.gestalt.gestaltStrings.inverse
import typingsJapgolly.gestalt.gestaltStrings.light
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.normal
import typingsJapgolly.gestalt.gestaltStrings.shopping
import typingsJapgolly.gestalt.gestaltStrings.start
import typingsJapgolly.gestalt.gestaltStrings.subtle
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import typingsJapgolly.gestalt.mod.HeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Heading {
  
  @JSImport("gestalt", "Heading")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | none): this.type = set("accessibilityLevel", value.asInstanceOf[js.Any])
    
    inline def align(value: start | end | center | forceLeft | forceRight): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def color(value: default | subtle | success | error | warning | shopping | inverse | light | dark): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def lineClamp(value: Double): this.type = set("lineClamp", value.asInstanceOf[js.Any])
    
    inline def overflow(value: normal | breakWord): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def size(value: `100` | `200` | `300` | `400` | `500` | `600`): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def truncate(value: Boolean): this.type = set("truncate", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Heading.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
