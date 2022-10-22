package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSelect.distDeclarationsSrcInternalScrollManagerMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollManager {
  
  inline def apply(captureEnabled: Boolean, children: RefFn[HTMLElement] => Element, lockEnabled: Boolean): Builder = {
    val __props = js.Dynamic.literal(captureEnabled = captureEnabled.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), lockEnabled = lockEnabled.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-select/dist/declarations/src/internal", "ScrollManager")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onBottomArrive(value: /* event */ WheelEvent | TouchEvent => Callback): this.type = set("onBottomArrive", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
    
    inline def onBottomLeave(value: /* event */ WheelEvent | TouchEvent => Callback): this.type = set("onBottomLeave", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
    
    inline def onTopArrive(value: /* event */ WheelEvent | TouchEvent => Callback): this.type = set("onTopArrive", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
    
    inline def onTopLeave(value: /* event */ WheelEvent | TouchEvent => Callback): this.type = set("onTopLeave", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
