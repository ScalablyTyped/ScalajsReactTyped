package typingsJapgolly.reactFocusOn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFocusOn.distEs5TypesMod.EffectProps
import typingsJapgolly.reactFocusOn.distEs5TypesMod.LockProps
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarHOC
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sidecar {
  
  inline def apply(setLockProps: LockProps => Callback, sideCar: SideCarMedium[EffectProps]): Builder = {
    val __props = js.Dynamic.literal(setLockProps = js.Any.fromFunction1((t0: LockProps) => setLockProps(t0).runNow()), sideCar = sideCar.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EffectProps & SideCarHOC[EffectProps]]))
  }
  
  @JSImport("react-focus-on/dist/es5/sidecar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowPinchZoom(value: Boolean): this.type = set("allowPinchZoom", value.asInstanceOf[js.Any])
    
    inline def inert(value: Boolean): this.type = set("inert", value.asInstanceOf[js.Any])
    
    inline def noIsolation(value: Boolean): this.type = set("noIsolation", value.asInstanceOf[js.Any])
    
    inline def onActivation(value: /* node */ HTMLElement => Callback): this.type = set("onActivation", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onClickOutside(value: /* event */ MouseEvent | TouchEvent => Callback): this.type = set("onClickOutside", js.Any.fromFunction1((t0: /* event */ MouseEvent | TouchEvent) => value(t0).runNow()))
    
    inline def onDeactivation(value: Callback): this.type = set("onDeactivation", value.toJsFn)
    
    inline def onEscapeKey(value: /* event */ Event => Callback): this.type = set("onEscapeKey", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def shards(value: js.Array[RefHandle[Any] | HTMLElement]): this.type = set("shards", value.asInstanceOf[js.Any])
    
    inline def shardsVarargs(value: (RefHandle[Any] | HTMLElement)*): this.type = set("shards", js.Array(value*))
  }
  
  def withProps(p: EffectProps & SideCarHOC[EffectProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
