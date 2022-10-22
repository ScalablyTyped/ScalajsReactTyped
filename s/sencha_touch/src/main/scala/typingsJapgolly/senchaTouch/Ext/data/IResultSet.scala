package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResultSet
  extends StObject
     with IBase {
  
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns the value of count
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of loaded
    * @returns Boolean
    */
  var getLoaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of message
    * @returns String
    */
  var getMessage: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of records
    * @returns Ext.data.Model[]
    */
  var getRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of success
    * @returns Boolean
    */
  var getSuccess: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of total
    * @returns Number
    */
  var getTotal: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var message: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.undefined
  
  /** [Method] Sets the value of count
    * @param count Number The new value.
    */
  var setCount: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of loaded
    * @param loaded Boolean The new value.
    */
  var setLoaded: js.UndefOr[js.Function1[/* loaded */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of records
    * @param records Ext.data.Model[] The new value.
    */
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of success
    * @param success Boolean The new value.
    */
  var setSuccess: js.UndefOr[js.Function1[/* success */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of total
    * @param total Number The new value.
    */
  var setTotal: js.UndefOr[js.Function1[/* total */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.undefined
}
object IResultSet {
  
  inline def apply(): IResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSet]
  }
  
  extension [Self <: IResultSet](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setGetLoaded(value: CallbackTo[Boolean]): Self = StObject.set(x, "getLoaded", value.toJsFn)
    
    inline def setGetLoadedUndefined: Self = StObject.set(x, "getLoaded", js.undefined)
    
    inline def setGetMessage(value: CallbackTo[String]): Self = StObject.set(x, "getMessage", value.toJsFn)
    
    inline def setGetMessageUndefined: Self = StObject.set(x, "getMessage", js.undefined)
    
    inline def setGetRecords(value: CallbackTo[Array]): Self = StObject.set(x, "getRecords", value.toJsFn)
    
    inline def setGetRecordsUndefined: Self = StObject.set(x, "getRecords", js.undefined)
    
    inline def setGetSuccess(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSuccess", value.toJsFn)
    
    inline def setGetSuccessUndefined: Self = StObject.set(x, "getSuccess", js.undefined)
    
    inline def setGetTotal(value: CallbackTo[Double]): Self = StObject.set(x, "getTotal", value.toJsFn)
    
    inline def setGetTotalUndefined: Self = StObject.set(x, "getTotal", js.undefined)
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRecords(value: Array): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setSetCount(value: /* count */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setCount", js.Any.fromFunction1((t0: /* count */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetCountUndefined: Self = StObject.set(x, "setCount", js.undefined)
    
    inline def setSetLoaded(value: /* loaded */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setLoaded", js.Any.fromFunction1((t0: /* loaded */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetLoadedUndefined: Self = StObject.set(x, "setLoaded", js.undefined)
    
    inline def setSetMessage(value: /* message */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setMessage", js.Any.fromFunction1((t0: /* message */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetMessageUndefined: Self = StObject.set(x, "setMessage", js.undefined)
    
    inline def setSetRecords(value: /* records */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setRecords", js.Any.fromFunction1((t0: /* records */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetRecordsUndefined: Self = StObject.set(x, "setRecords", js.undefined)
    
    inline def setSetSuccess(value: /* success */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setSuccess", js.Any.fromFunction1((t0: /* success */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetSuccessUndefined: Self = StObject.set(x, "setSuccess", js.undefined)
    
    inline def setSetTotal(value: /* total */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setTotal", js.Any.fromFunction1((t0: /* total */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetTotalUndefined: Self = StObject.set(x, "setTotal", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
