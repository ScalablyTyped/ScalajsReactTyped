package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltInts.`0`
import typingsJapgolly.gestalt.gestaltInts.`1`
import typingsJapgolly.gestalt.gestaltInts.`2`
import typingsJapgolly.gestalt.gestaltInts.`3`
import typingsJapgolly.gestalt.gestaltInts.`4`
import typingsJapgolly.gestalt.gestaltInts.`5`
import typingsJapgolly.gestalt.gestaltInts.`6`
import typingsJapgolly.gestalt.gestaltInts.`7`
import typingsJapgolly.gestalt.gestaltInts.`8`
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.mod.MaskProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mask {
  
  @JSImport("gestalt", "Mask")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def rounding(value: circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): this.type = set("rounding", value.asInstanceOf[js.Any])
    
    inline def wash(value: Boolean): this.type = set("wash", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def willChangeTransform(value: Boolean): this.type = set("willChangeTransform", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Mask.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MaskProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
