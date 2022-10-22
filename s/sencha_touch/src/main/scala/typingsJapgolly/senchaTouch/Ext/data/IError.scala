package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IError
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of field
    * @returns String
    */
  var getField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of message
    * @returns String
    */
  var getMessage: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var message: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of field
    * @param field String The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.undefined
}
object IError {
  
  inline def apply(): IError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IError]
  }
  
  extension [Self <: IError](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGetField(value: CallbackTo[String]): Self = StObject.set(x, "getField", value.toJsFn)
    
    inline def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
    
    inline def setGetMessage(value: CallbackTo[String]): Self = StObject.set(x, "getMessage", value.toJsFn)
    
    inline def setGetMessageUndefined: Self = StObject.set(x, "getMessage", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSetField(value: /* field */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setField", js.Any.fromFunction1((t0: /* field */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
    
    inline def setSetMessage(value: /* message */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setMessage", js.Any.fromFunction1((t0: /* message */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetMessageUndefined: Self = StObject.set(x, "setMessage", js.undefined)
  }
}
