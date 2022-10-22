package typingsJapgolly.reactIcofont.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactIcofont.mod.IcofontProps
import typingsJapgolly.reactIcofont.mod.default
import typingsJapgolly.reactIcofont.reactIcofontStrings.`10`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`180`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`1`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`270`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`2`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`3`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`4`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`5`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`6`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`7`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`8`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`90`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`9`
import typingsJapgolly.reactIcofont.reactIcofontStrings.h
import typingsJapgolly.reactIcofont.reactIcofontStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactIcofont {
  
  inline def apply(icon: String): Builder = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IcofontProps]))
  }
  
  @JSImport("react-icofont", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def flip(value: h | v): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def rotate(value: `90` | `180` | `270`): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def size(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def spin(value: Boolean): this.type = set("spin", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IcofontProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
