package typingsJapgolly.fundamentalReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`10`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`1`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`6`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`7`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`8`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`9`
import typingsJapgolly.fundamentalReact.libIconIconMod.IconGlyph
import typingsJapgolly.fundamentalReact.libInfoLabelInfoLabelMod.InfoLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InfoLabel {
  
  @JSImport("fundamental-react", "InfoLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def glyph(value: IconGlyph): this.type = set("glyph", value.asInstanceOf[js.Any])
    
    inline def numeric(value: Boolean): this.type = set("numeric", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InfoLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InfoLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
