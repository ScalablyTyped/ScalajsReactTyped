package typingsJapgolly.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteOptions extends StObject {
  
  /**
    * Whether to allow stdin requests.
    * The default is `true`.
    */
  var allow_stdin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to execute the code as quietly as possible.
    * The default is `false`.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to the abort execution queue on an error.
    * The default is `false`.
    */
  var stop_on_error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to store history of the execution.
    * The default `true` if silent is False.
    * It is forced to  `false ` if silent is `true`.
    */
  var store_history: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A mapping of names to expressions to be evaluated in the
    * kernel's interactive namespace.
    */
  var user_expressions: js.UndefOr[js.Object] = js.undefined
}
object IExecuteOptions {
  
  inline def apply(): IExecuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExecuteOptions]
  }
  
  extension [Self <: IExecuteOptions](x: Self) {
    
    inline def setAllow_stdin(value: Boolean): Self = StObject.set(x, "allow_stdin", value.asInstanceOf[js.Any])
    
    inline def setAllow_stdinUndefined: Self = StObject.set(x, "allow_stdin", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setStop_on_error(value: Boolean): Self = StObject.set(x, "stop_on_error", value.asInstanceOf[js.Any])
    
    inline def setStop_on_errorUndefined: Self = StObject.set(x, "stop_on_error", js.undefined)
    
    inline def setStore_history(value: Boolean): Self = StObject.set(x, "store_history", value.asInstanceOf[js.Any])
    
    inline def setStore_historyUndefined: Self = StObject.set(x, "store_history", js.undefined)
    
    inline def setUser_expressions(value: js.Object): Self = StObject.set(x, "user_expressions", value.asInstanceOf[js.Any])
    
    inline def setUser_expressionsUndefined: Self = StObject.set(x, "user_expressions", js.undefined)
  }
}
