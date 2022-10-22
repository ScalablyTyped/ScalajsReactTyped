package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.data.proxy.IAjax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRestProxy
  extends StObject
     with IAjax {
  
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of actionMethods
    * @returns Object
    */
  var getActionMethods: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of appendId
    * @returns Boolean
    */
  var getAppendId: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of format
    * @returns String
    */
  var getFormat: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Sets the value of actionMethods
    * @param actionMethods Object The new value.
    */
  var setActionMethods: js.UndefOr[js.Function1[/* actionMethods */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of appendId
    * @param appendId Boolean The new value.
    */
  var setAppendId: js.UndefOr[js.Function1[/* appendId */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of format
    * @param format String The new value.
    */
  var setFormat: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], Unit]] = js.undefined
}
object IRestProxy {
  
  inline def apply(): IRestProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestProxy]
  }
  
  extension [Self <: IRestProxy](x: Self) {
    
    inline def setAppendId(value: Boolean): Self = StObject.set(x, "appendId", value.asInstanceOf[js.Any])
    
    inline def setAppendIdUndefined: Self = StObject.set(x, "appendId", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGetActionMethods(value: CallbackTo[Any]): Self = StObject.set(x, "getActionMethods", value.toJsFn)
    
    inline def setGetActionMethodsUndefined: Self = StObject.set(x, "getActionMethods", js.undefined)
    
    inline def setGetAppendId(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAppendId", value.toJsFn)
    
    inline def setGetAppendIdUndefined: Self = StObject.set(x, "getAppendId", js.undefined)
    
    inline def setGetFormat(value: CallbackTo[String]): Self = StObject.set(x, "getFormat", value.toJsFn)
    
    inline def setGetFormatUndefined: Self = StObject.set(x, "getFormat", js.undefined)
    
    inline def setSetActionMethods(value: /* actionMethods */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setActionMethods", js.Any.fromFunction1((t0: /* actionMethods */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetActionMethodsUndefined: Self = StObject.set(x, "setActionMethods", js.undefined)
    
    inline def setSetAppendId(value: /* appendId */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAppendId", js.Any.fromFunction1((t0: /* appendId */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAppendIdUndefined: Self = StObject.set(x, "setAppendId", js.undefined)
    
    inline def setSetFormat(value: /* format */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setFormat", js.Any.fromFunction1((t0: /* format */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetFormatUndefined: Self = StObject.set(x, "setFormat", js.undefined)
  }
}
