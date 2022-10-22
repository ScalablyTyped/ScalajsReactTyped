package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.wordpressComponents.dateTimeTimeMod.TimePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  inline def apply(onChange: String => Callback): SharedBuilder_Props_1613178153 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()))
    new SharedBuilder_Props_1613178153(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components/date-time", "TimePicker")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props_1613178153 = new SharedBuilder_Props_1613178153(js.Array(this.component, p.asInstanceOf[js.Any]))
}
