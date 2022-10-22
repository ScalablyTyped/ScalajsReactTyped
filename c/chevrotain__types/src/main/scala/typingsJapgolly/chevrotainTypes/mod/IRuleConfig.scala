package typingsJapgolly.chevrotainTypes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRuleConfig[T] extends StObject {
  
  /**
    * The function which will be invoked to produce the returned value for a production that have not been
    * successfully executed and the parser recovered from.
    */
  var recoveryValueFunc: js.UndefOr[js.Function0[T]] = js.undefined
  
  /**
    * Enable/Disable re-sync error recovery for this specific production.
    */
  var resyncEnabled: js.UndefOr[Boolean] = js.undefined
}
object IRuleConfig {
  
  inline def apply[T](): IRuleConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRuleConfig[T]]
  }
  
  extension [Self <: IRuleConfig[?], T](x: Self & IRuleConfig[T]) {
    
    inline def setRecoveryValueFunc(value: CallbackTo[T]): Self = StObject.set(x, "recoveryValueFunc", value.toJsFn)
    
    inline def setRecoveryValueFuncUndefined: Self = StObject.set(x, "recoveryValueFunc", js.undefined)
    
    inline def setResyncEnabled(value: Boolean): Self = StObject.set(x, "resyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setResyncEnabledUndefined: Self = StObject.set(x, "resyncEnabled", js.undefined)
  }
}
