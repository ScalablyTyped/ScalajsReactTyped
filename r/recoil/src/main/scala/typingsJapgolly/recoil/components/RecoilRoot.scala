package typingsJapgolly.recoil.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.recoil.mod.MutableSnapshot
import typingsJapgolly.recoil.recoilBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RecoilRoot {
  
  object InitializeState {
    
    @JSImport("recoil", "RecoilRoot")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def initializeState(value: /* mutableSnapshot */ MutableSnapshot => Callback): this.type = set("initializeState", js.Any.fromFunction1((t0: /* mutableSnapshot */ MutableSnapshot) => value(t0).runNow()))
      
      inline def `override`(value: `true`): this.type = set("override", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: InitializeState.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.recoil.anon.InitializeState): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Override {
    
    inline def apply(): Default[js.Object] = {
      val __props = js.Dynamic.literal()
      __props.updateDynamic("override")(false)
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.recoil.anon.Override]))
    }
    
    @JSImport("recoil", "RecoilRoot")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: typingsJapgolly.recoil.anon.Override): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
