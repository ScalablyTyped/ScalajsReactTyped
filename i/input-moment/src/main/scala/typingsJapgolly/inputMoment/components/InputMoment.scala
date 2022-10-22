package typingsJapgolly.inputMoment.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.inputMoment.mod.InputMomentProps
import typingsJapgolly.inputMoment.mod.default
import typingsJapgolly.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputMoment {
  
  inline def apply(moment: Moment): Builder = {
    val __props = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InputMomentProps]))
  }
  
  @JSImport("input-moment", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
    
    inline def minStep(value: Double): this.type = set("minStep", value.asInstanceOf[js.Any])
    
    inline def nextMonthIcon(value: String): this.type = set("nextMonthIcon", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* m */ Moment => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* m */ Moment) => value(t0).runNow()))
    
    inline def onSave(value: Callback): this.type = set("onSave", value.toJsFn)
    
    inline def prevMonthIcon(value: String): this.type = set("prevMonthIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputMomentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
