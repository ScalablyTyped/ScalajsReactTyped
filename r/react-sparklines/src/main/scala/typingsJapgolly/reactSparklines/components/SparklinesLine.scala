package typingsJapgolly.reactSparklines.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSparklines.mod.Point
import typingsJapgolly.reactSparklines.mod.SparklinesLineProps
import typingsJapgolly.reactSparklines.reactSparklinesStrings.click
import typingsJapgolly.reactSparklines.reactSparklinesStrings.enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SparklinesLine {
  
  @JSImport("react-sparklines", "SparklinesLine")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSparklines.mod.SparklinesLine] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: (/* event */ enter | click, /* value */ Double, /* point */ Point) => Callback): this.type = set("onMouseMove", js.Any.fromFunction3((t0: /* event */ enter | click, t1: /* value */ Double, t2: /* point */ Point) => (value(t0, t1, t2)).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SparklinesLine.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SparklinesLineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
