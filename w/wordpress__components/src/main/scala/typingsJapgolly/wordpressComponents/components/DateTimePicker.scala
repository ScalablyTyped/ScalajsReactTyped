package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.dateTimeMod.DateTimePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateTimePicker {
  
  inline def apply(onChange: /* currentDate */ String => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: /* currentDate */ String) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "DateTimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def currentDate(value: String): this.type = set("currentDate", value.asInstanceOf[js.Any])
    
    inline def is12Hour(value: Boolean): this.type = set("is12Hour", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
