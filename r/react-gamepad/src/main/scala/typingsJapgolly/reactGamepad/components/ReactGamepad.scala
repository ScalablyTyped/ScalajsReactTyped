package typingsJapgolly.reactGamepad.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactGamepad.mod.Axis
import typingsJapgolly.reactGamepad.mod.Button
import typingsJapgolly.reactGamepad.mod.Layout
import typingsJapgolly.reactGamepad.mod.Props
import typingsJapgolly.reactGamepad.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGamepad {
  
  @JSImport("react-gamepad", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def deadZone(value: Double): this.type = set("deadZone", value.asInstanceOf[js.Any])
    
    inline def gamepadIndex(value: Double): this.type = set("gamepadIndex", value.asInstanceOf[js.Any])
    
    inline def layout(value: Layout): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def onA(value: Callback): this.type = set("onA", value.toJsFn)
    
    inline def onAxisChange(value: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Callback): this.type = set("onAxisChange", js.Any.fromFunction3((t0: /* axisName */ Axis, t1: /* value */ Double, t2: /* previousValue */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onB(value: Callback): this.type = set("onB", value.toJsFn)
    
    inline def onBack(value: Callback): this.type = set("onBack", value.toJsFn)
    
    inline def onButtonChange(value: (/* buttonName */ Button, /* pressed */ Boolean) => Callback): this.type = set("onButtonChange", js.Any.fromFunction2((t0: /* buttonName */ Button, t1: /* pressed */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onButtonDown(value: /* buttonName */ Button => Callback): this.type = set("onButtonDown", js.Any.fromFunction1((t0: /* buttonName */ Button) => value(t0).runNow()))
    
    inline def onButtonUp(value: /* buttonName */ Button => Callback): this.type = set("onButtonUp", js.Any.fromFunction1((t0: /* buttonName */ Button) => value(t0).runNow()))
    
    inline def onConnect(value: /* gamepadIndex */ Double => Callback): this.type = set("onConnect", js.Any.fromFunction1((t0: /* gamepadIndex */ Double) => value(t0).runNow()))
    
    inline def onDisconnect(value: /* gamepadIndex */ Double => Callback): this.type = set("onDisconnect", js.Any.fromFunction1((t0: /* gamepadIndex */ Double) => value(t0).runNow()))
    
    inline def onDown(value: Callback): this.type = set("onDown", value.toJsFn)
    
    inline def onLB(value: Callback): this.type = set("onLB", value.toJsFn)
    
    inline def onLS(value: Callback): this.type = set("onLS", value.toJsFn)
    
    inline def onLT(value: Callback): this.type = set("onLT", value.toJsFn)
    
    inline def onLeft(value: Callback): this.type = set("onLeft", value.toJsFn)
    
    inline def onRB(value: Callback): this.type = set("onRB", value.toJsFn)
    
    inline def onRS(value: Callback): this.type = set("onRS", value.toJsFn)
    
    inline def onRT(value: Callback): this.type = set("onRT", value.toJsFn)
    
    inline def onRight(value: Callback): this.type = set("onRight", value.toJsFn)
    
    inline def onStart(value: Callback): this.type = set("onStart", value.toJsFn)
    
    inline def onUp(value: Callback): this.type = set("onUp", value.toJsFn)
    
    inline def onX(value: Callback): this.type = set("onX", value.toJsFn)
    
    inline def onY(value: Callback): this.type = set("onY", value.toJsFn)
    
    inline def stickThreshold(value: Double): this.type = set("stickThreshold", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactGamepad.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
