package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReader
  extends StObject
     with IObservable {
  
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of clientIdProperty
    * @returns String
    */
  var getClientIdProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of idProperty
    * @returns String
    */
  var getIdProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of implicitIncludes
    * @returns Boolean
    */
  var getImplicitIncludes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of messageProperty
    * @returns String
    */
  var getMessageProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of model
    * @returns Object
    */
  var getModel: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Takes a raw response object as passed to this read and returns the useful data segment of it
    * @param response Object The response object
    * @returns Object The useful data from the response
    */
  var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns the value of rootProperty
    * @returns String
    */
  var getRootProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of successProperty
    * @returns any
    */
  var getSuccessProperty: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of totalProperty
    * @returns any
    */
  var getTotalProperty: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[String] = js.undefined
  
  /** [Property] (Object) */
  var metaData: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var rawData: js.UndefOr[Any] = js.undefined
  
  /** [Method] Reads the given response object
    * @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
    * @returns Ext.data.ResultSet The parsed ResultSet object
    */
  var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[Any], IResultSet]] = js.undefined
  
  /** [Method] Abstracts common functionality used by all Reader subclasses
    * @param data Object The raw data object
    * @returns Ext.data.ResultSet A ResultSet object
    */
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], IResultSet]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IReader: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of clientIdProperty
    * @param clientIdProperty String The new value.
    */
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of idProperty
    * @param idProperty String The new value.
    */
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of implicitIncludes
    * @param implicitIncludes Boolean The new value.
    */
  var setImplicitIncludes: js.UndefOr[js.Function1[/* implicitIncludes */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of messageProperty
    * @param messageProperty String The new value.
    */
  var setMessageProperty: js.UndefOr[js.Function1[/* messageProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of model
    * @param model Object The new value.
    */
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of rootProperty
    * @param rootProperty String The new value.
    */
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of successProperty
    * @param successProperty String The new value.
    */
  var setSuccessProperty: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of totalProperty
    * @param totalProperty String The new value.
    */
  var setTotalProperty: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[String] = js.undefined
}
object IReader {
  
  inline def apply(): IReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReader]
  }
  
  extension [Self <: IReader](x: Self) {
    
    inline def setClientIdProperty(value: String): Self = StObject.set(x, "clientIdProperty", value.asInstanceOf[js.Any])
    
    inline def setClientIdPropertyUndefined: Self = StObject.set(x, "clientIdProperty", js.undefined)
    
    inline def setGetClientIdProperty(value: CallbackTo[String]): Self = StObject.set(x, "getClientIdProperty", value.toJsFn)
    
    inline def setGetClientIdPropertyUndefined: Self = StObject.set(x, "getClientIdProperty", js.undefined)
    
    inline def setGetIdProperty(value: CallbackTo[String]): Self = StObject.set(x, "getIdProperty", value.toJsFn)
    
    inline def setGetIdPropertyUndefined: Self = StObject.set(x, "getIdProperty", js.undefined)
    
    inline def setGetImplicitIncludes(value: CallbackTo[Boolean]): Self = StObject.set(x, "getImplicitIncludes", value.toJsFn)
    
    inline def setGetImplicitIncludesUndefined: Self = StObject.set(x, "getImplicitIncludes", js.undefined)
    
    inline def setGetMessageProperty(value: CallbackTo[String]): Self = StObject.set(x, "getMessageProperty", value.toJsFn)
    
    inline def setGetMessagePropertyUndefined: Self = StObject.set(x, "getMessageProperty", js.undefined)
    
    inline def setGetModel(value: CallbackTo[Any]): Self = StObject.set(x, "getModel", value.toJsFn)
    
    inline def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
    
    inline def setGetResponseData(value: /* response */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getResponseData", js.Any.fromFunction1(value))
    
    inline def setGetResponseDataUndefined: Self = StObject.set(x, "getResponseData", js.undefined)
    
    inline def setGetRootProperty(value: CallbackTo[String]): Self = StObject.set(x, "getRootProperty", value.toJsFn)
    
    inline def setGetRootPropertyUndefined: Self = StObject.set(x, "getRootProperty", js.undefined)
    
    inline def setGetSuccessProperty(value: CallbackTo[Any]): Self = StObject.set(x, "getSuccessProperty", value.toJsFn)
    
    inline def setGetSuccessPropertyUndefined: Self = StObject.set(x, "getSuccessProperty", js.undefined)
    
    inline def setGetTotalProperty(value: CallbackTo[Any]): Self = StObject.set(x, "getTotalProperty", value.toJsFn)
    
    inline def setGetTotalPropertyUndefined: Self = StObject.set(x, "getTotalProperty", js.undefined)
    
    inline def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
    
    inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
    
    inline def setImplicitIncludes(value: Boolean): Self = StObject.set(x, "implicitIncludes", value.asInstanceOf[js.Any])
    
    inline def setImplicitIncludesUndefined: Self = StObject.set(x, "implicitIncludes", js.undefined)
    
    inline def setMessageProperty(value: String): Self = StObject.set(x, "messageProperty", value.asInstanceOf[js.Any])
    
    inline def setMessagePropertyUndefined: Self = StObject.set(x, "messageProperty", js.undefined)
    
    inline def setMetaData(value: Any): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    inline def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
    
    inline def setRawData(value: Any): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
    
    inline def setRead(value: /* response */ js.UndefOr[Any] => IResultSet): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setReadRecords(value: /* data */ js.UndefOr[Any] => IResultSet): Self = StObject.set(x, "readRecords", js.Any.fromFunction1(value))
    
    inline def setReadRecordsUndefined: Self = StObject.set(x, "readRecords", js.undefined)
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootProperty(value: String): Self = StObject.set(x, "rootProperty", value.asInstanceOf[js.Any])
    
    inline def setRootPropertyUndefined: Self = StObject.set(x, "rootProperty", js.undefined)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSetClientIdProperty(value: /* clientIdProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setClientIdProperty", js.Any.fromFunction1((t0: /* clientIdProperty */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetClientIdPropertyUndefined: Self = StObject.set(x, "setClientIdProperty", js.undefined)
    
    inline def setSetIdProperty(value: /* idProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setIdProperty", js.Any.fromFunction1((t0: /* idProperty */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetIdPropertyUndefined: Self = StObject.set(x, "setIdProperty", js.undefined)
    
    inline def setSetImplicitIncludes(value: /* implicitIncludes */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setImplicitIncludes", js.Any.fromFunction1((t0: /* implicitIncludes */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetImplicitIncludesUndefined: Self = StObject.set(x, "setImplicitIncludes", js.undefined)
    
    inline def setSetMessageProperty(value: /* messageProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setMessageProperty", js.Any.fromFunction1((t0: /* messageProperty */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetMessagePropertyUndefined: Self = StObject.set(x, "setMessageProperty", js.undefined)
    
    inline def setSetModel(value: /* model */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setModel", js.Any.fromFunction1((t0: /* model */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
    
    inline def setSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setRootProperty", js.Any.fromFunction1((t0: /* rootProperty */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetRootPropertyUndefined: Self = StObject.set(x, "setRootProperty", js.undefined)
    
    inline def setSetSuccessProperty(value: /* successProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setSuccessProperty", js.Any.fromFunction1((t0: /* successProperty */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetSuccessPropertyUndefined: Self = StObject.set(x, "setSuccessProperty", js.undefined)
    
    inline def setSetTotalProperty(value: /* totalProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setTotalProperty", js.Any.fromFunction1((t0: /* totalProperty */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetTotalPropertyUndefined: Self = StObject.set(x, "setTotalProperty", js.undefined)
    
    inline def setSuccessProperty(value: String): Self = StObject.set(x, "successProperty", value.asInstanceOf[js.Any])
    
    inline def setSuccessPropertyUndefined: Self = StObject.set(x, "successProperty", js.undefined)
    
    inline def setTotalProperty(value: String): Self = StObject.set(x, "totalProperty", value.asInstanceOf[js.Any])
    
    inline def setTotalPropertyUndefined: Self = StObject.set(x, "totalProperty", js.undefined)
  }
}
