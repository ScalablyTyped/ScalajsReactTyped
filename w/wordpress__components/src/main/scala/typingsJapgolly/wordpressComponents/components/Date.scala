package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.wordpressComponents.dateTimeDateMod.DatePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Date {
  
  inline def apply(onChange: String => Callback): SharedBuilder_Props_2048664264 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()))
    new SharedBuilder_Props_2048664264(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components/date-time/date", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props_2048664264 = new SharedBuilder_Props_2048664264(js.Array(this.component, p.asInstanceOf[js.Any]))
}
