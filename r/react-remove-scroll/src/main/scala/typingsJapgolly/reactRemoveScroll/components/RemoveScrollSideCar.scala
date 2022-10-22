package typingsJapgolly.reactRemoveScroll.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRemoveScroll.distEs5TypesMod.IRemoveScrollEffectProps
import typingsJapgolly.reactRemoveScroll.distEs5TypesMod.RemoveScrollEffectCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RemoveScrollSideCar {
  
  inline def apply(
    allowPinchZoom: Boolean,
    lockRef: RefHandle[HTMLElement],
    setCallbacks: RemoveScrollEffectCallbacks => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(allowPinchZoom = allowPinchZoom.asInstanceOf[js.Any], lockRef = lockRef.asInstanceOf[js.Any], setCallbacks = js.Any.fromFunction1((t0: RemoveScrollEffectCallbacks) => setCallbacks(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[IRemoveScrollEffectProps]))
  }
  
  @JSImport("react-remove-scroll/dist/es5/SideEffect", "RemoveScrollSideCar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def inert(value: Boolean): this.type = set("inert", value.asInstanceOf[js.Any])
    
    inline def noIsolation(value: Boolean): this.type = set("noIsolation", value.asInstanceOf[js.Any])
    
    inline def removeScrollBar(value: Boolean): this.type = set("removeScrollBar", value.asInstanceOf[js.Any])
    
    inline def shards(value: js.Array[RefHandle[Any] | HTMLElement]): this.type = set("shards", value.asInstanceOf[js.Any])
    
    inline def shardsVarargs(value: (RefHandle[Any] | HTMLElement)*): this.type = set("shards", js.Array(value*))
  }
  
  def withProps(p: IRemoveScrollEffectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
