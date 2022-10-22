package typingsJapgolly.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IServiceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITooltipProvider
  extends StObject
     with IServiceProvider {
  
  /**
    * Provide a set of defaults for certain tooltip and popover attributes.
    */
  def options(value: ITooltipOptions): Unit
  
  /**
    * Extends the default trigger mappings with mappings of your own. E.g. `{ 'openTrigger': 'closeTrigger' }`.
    */
  def setTriggers(triggers: js.Object): Unit
}
object ITooltipProvider {
  
  inline def apply($get: Any, options: ITooltipOptions => Callback, setTriggers: js.Object => Callback): ITooltipProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], options = js.Any.fromFunction1((t0: ITooltipOptions) => options(t0).runNow()), setTriggers = js.Any.fromFunction1((t0: js.Object) => setTriggers(t0).runNow()))
    __obj.asInstanceOf[ITooltipProvider]
  }
  
  extension [Self <: ITooltipProvider](x: Self) {
    
    inline def setOptions(value: ITooltipOptions => Callback): Self = StObject.set(x, "options", js.Any.fromFunction1((t0: ITooltipOptions) => value(t0).runNow()))
    
    inline def setSetTriggers(value: js.Object => Callback): Self = StObject.set(x, "setTriggers", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
