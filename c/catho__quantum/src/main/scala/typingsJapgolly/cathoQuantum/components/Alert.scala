package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.alertMod.AlertProps
import typingsJapgolly.cathoQuantum.alertMod.default
import typingsJapgolly.cathoQuantum.anon.Colors
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.cathoQuantum.iconMod.IconNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Alert {
  
  @JSImport("@catho/quantum/Alert", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def icon(value: IconNames | String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def onClose(
      value: (ReactMouseEventFrom[HTMLButtonElement & Element]) | (ReactTouchEventFrom[HTMLButtonElement & Element]) => Callback
    ): this.type = set("onClose", js.Any.fromFunction1((t0: (ReactMouseEventFrom[HTMLButtonElement & Element]) | (ReactTouchEventFrom[HTMLButtonElement & Element])) => value(t0).runNow()))
    
    inline def skin(value: primary | success | error | neutral | warning): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def theme(value: Colors): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Alert.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
