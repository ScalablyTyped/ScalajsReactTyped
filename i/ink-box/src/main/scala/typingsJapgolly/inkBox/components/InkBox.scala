package typingsJapgolly.inkBox.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.inkBox.anon.BottomLeft
import typingsJapgolly.inkBox.inkBoxStrings.classic
import typingsJapgolly.inkBox.inkBoxStrings.double
import typingsJapgolly.inkBox.inkBoxStrings.doubleSingle
import typingsJapgolly.inkBox.inkBoxStrings.round
import typingsJapgolly.inkBox.inkBoxStrings.single
import typingsJapgolly.inkBox.inkBoxStrings.singleDouble
import typingsJapgolly.inkBox.mod.Alignment
import typingsJapgolly.inkBox.mod.BoxProps
import typingsJapgolly.inkBox.mod.Spacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkBox {
  
  @JSImport("ink-box", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def align(value: Alignment): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderStyle(value: single | double | round | singleDouble | doubleSingle | classic | BottomLeft): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    inline def dimBorder(value: Boolean): this.type = set("dimBorder", value.asInstanceOf[js.Any])
    
    inline def float(value: Alignment): this.type = set("float", value.asInstanceOf[js.Any])
    
    inline def margin(value: Spacing): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def padding(value: Spacing): this.type = set("padding", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InkBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
