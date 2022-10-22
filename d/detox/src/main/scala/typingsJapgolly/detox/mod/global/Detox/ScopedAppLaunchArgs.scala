package typingsJapgolly.detox.mod.global.Detox

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shared (global) arguments that are not specific to a particular application.
  */
trait ScopedAppLaunchArgs extends StObject {
  
  /** @see AppLaunchArgs#get */
  def get(): js.Object
  
  /** @see AppLaunchArgs#modify */
  def modify(modifier: js.Object): this.type
  
  /** @see AppLaunchArgs#reset */
  def reset(): this.type
}
object ScopedAppLaunchArgs {
  
  inline def apply(
    get: CallbackTo[js.Object],
    modify: js.Object => ScopedAppLaunchArgs,
    reset: CallbackTo[ScopedAppLaunchArgs]
  ): ScopedAppLaunchArgs = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, modify = js.Any.fromFunction1(modify), reset = reset.toJsFn)
    __obj.asInstanceOf[ScopedAppLaunchArgs]
  }
  
  extension [Self <: ScopedAppLaunchArgs](x: Self) {
    
    inline def setGet(value: CallbackTo[js.Object]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setModify(value: js.Object => ScopedAppLaunchArgs): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
    
    inline def setReset(value: CallbackTo[ScopedAppLaunchArgs]): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
