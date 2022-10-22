package typingsJapgolly.reactCoinhive.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCoinhive.mod.CoinHiveProps
import typingsJapgolly.reactCoinhive.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCoinhive {
  
  inline def apply(siteKey: String): Builder = {
    val __props = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CoinHiveProps]))
  }
  
  @JSImport("react-coinhive", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoThreads(value: Boolean): this.type = set("autoThreads", value.asInstanceOf[js.Any])
    
    inline def onInit(value: /* callback */ Any => Callback): this.type = set("onInit", js.Any.fromFunction1((t0: /* callback */ Any) => value(t0).runNow()))
    
    inline def onStart(value: /* callback */ Any => Callback): this.type = set("onStart", js.Any.fromFunction1((t0: /* callback */ Any) => value(t0).runNow()))
    
    inline def onStop(value: /* callback */ Any => Callback): this.type = set("onStop", js.Any.fromFunction1((t0: /* callback */ Any) => value(t0).runNow()))
    
    inline def run(value: Boolean): this.type = set("run", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def threads(value: Double): this.type = set("threads", value.asInstanceOf[js.Any])
    
    inline def throttle(value: Double): this.type = set("throttle", value.asInstanceOf[js.Any])
    
    inline def userName(value: String): this.type = set("userName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CoinHiveProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
