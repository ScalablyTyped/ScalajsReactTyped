package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.tuyaPanelKit.anon.BatteryColor
import typingsJapgolly.tuyaPanelKit.mod.BatteryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Battery {
  
  @JSImport("tuya-panel-kit", "Battery")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Battery] {
    
    inline def batteryColor(value: String): this.type = set("batteryColor", value.asInstanceOf[js.Any])
    
    inline def highColor(value: String): this.type = set("highColor", value.asInstanceOf[js.Any])
    
    inline def lowColor(value: String): this.type = set("lowColor", value.asInstanceOf[js.Any])
    
    inline def middleColor(value: String): this.type = set("middleColor", value.asInstanceOf[js.Any])
    
    inline def onCalcColor(value: /* repeated */ Any => Callback): this.type = set("onCalcColor", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def theme(value: BatteryColor): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Battery.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BatteryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
