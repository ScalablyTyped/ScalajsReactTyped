package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.`100`
import typingsJapgolly.gestalt.gestaltStrings.`200`
import typingsJapgolly.gestalt.gestaltStrings.`300`
import typingsJapgolly.gestalt.gestaltStrings.`400`
import typingsJapgolly.gestalt.gestaltStrings.`500`
import typingsJapgolly.gestalt.gestaltStrings.`600`
import typingsJapgolly.gestalt.gestaltStrings.bold
import typingsJapgolly.gestalt.gestaltStrings.breakWord
import typingsJapgolly.gestalt.gestaltStrings.center
import typingsJapgolly.gestalt.gestaltStrings.dark
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.end
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.forceLeft
import typingsJapgolly.gestalt.gestaltStrings.forceRight
import typingsJapgolly.gestalt.gestaltStrings.inverse
import typingsJapgolly.gestalt.gestaltStrings.justify
import typingsJapgolly.gestalt.gestaltStrings.light
import typingsJapgolly.gestalt.gestaltStrings.link
import typingsJapgolly.gestalt.gestaltStrings.noWrap
import typingsJapgolly.gestalt.gestaltStrings.normal
import typingsJapgolly.gestalt.gestaltStrings.shopping
import typingsJapgolly.gestalt.gestaltStrings.start
import typingsJapgolly.gestalt.gestaltStrings.subtle
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import typingsJapgolly.gestalt.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("gestalt", "Text")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def align(value: start | end | center | justify | forceLeft | forceRight): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def color(value: default | subtle | success | error | warning | shopping | link | inverse | light | dark): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
    
    inline def lineClamp(value: Double): this.type = set("lineClamp", value.asInstanceOf[js.Any])
    
    inline def overflow(value: normal | breakWord | noWrap): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def size(value: `100` | `200` | `300` | `400` | `500` | `600`): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
    
    inline def weight(value: bold | normal): this.type = set("weight", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Text.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
