package typingsJapgolly.reactSparklines.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSparklines.mod.Point
import typingsJapgolly.reactSparklines.mod.SparklinesTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SparklinesText {
  
  @JSImport("react-sparklines", "SparklinesText")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSparklines.mod.SparklinesText] {
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def point(value: Point): this.type = set("point", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SparklinesText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SparklinesTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
