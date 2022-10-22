package typingsJapgolly.reactSparklines.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSparklines.mod.SparklinesReferenceLineProps
import typingsJapgolly.reactSparklines.reactSparklinesStrings.avg
import typingsJapgolly.reactSparklines.reactSparklinesStrings.custom
import typingsJapgolly.reactSparklines.reactSparklinesStrings.max
import typingsJapgolly.reactSparklines.reactSparklinesStrings.mean
import typingsJapgolly.reactSparklines.reactSparklinesStrings.median
import typingsJapgolly.reactSparklines.reactSparklinesStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SparklinesReferenceLine {
  
  @JSImport("react-sparklines", "SparklinesReferenceLine")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSparklines.mod.SparklinesReferenceLine] {
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def `type`(value: max | min | mean | avg | median | custom): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SparklinesReferenceLine.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SparklinesReferenceLineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
