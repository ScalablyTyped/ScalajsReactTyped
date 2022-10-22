package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFilter
  extends StObject
     with IBase {
  
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of anyMatch
    * @returns Boolean
    */
  var getAnyMatch: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of caseSensitive
    * @returns Boolean
    */
  var getCaseSensitive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of exactMatch
    * @returns Boolean
    */
  var getExactMatch: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of filterFn
    * @returns Function
    */
  var getFilterFn: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of id
    * @returns String
    */
  var getId: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of property
    * @returns String
    */
  var getProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of root
    * @returns String
    */
  var getRoot: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of value
    * @returns RegExp/Mixed
    */
  var getValue: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of anyMatch
    * @param anyMatch Boolean The new value.
    */
  var setAnyMatch: js.UndefOr[js.Function1[/* anyMatch */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of caseSensitive
    * @param caseSensitive Boolean The new value.
    */
  var setCaseSensitive: js.UndefOr[js.Function1[/* caseSensitive */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of exactMatch
    * @param exactMatch Boolean The new value.
    */
  var setExactMatch: js.UndefOr[js.Function1[/* exactMatch */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of filterFn
    * @param filterFn Function The new value.
    */
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of id
    * @param id String The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of property
    * @param property String The new value.
    */
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of root
    * @param root String The new value.
    */
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of value
    * @param value RegExp/Mixed The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (RegExp/Mixed) */
  var value: js.UndefOr[Any] = js.undefined
}
object IFilter {
  
  inline def apply(): IFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilter]
  }
  
  extension [Self <: IFilter](x: Self) {
    
    inline def setAnyMatch(value: Boolean): Self = StObject.set(x, "anyMatch", value.asInstanceOf[js.Any])
    
    inline def setAnyMatchUndefined: Self = StObject.set(x, "anyMatch", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setExactMatch(value: Boolean): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    inline def setFilterFn(value: Any): Self = StObject.set(x, "filterFn", value.asInstanceOf[js.Any])
    
    inline def setFilterFnUndefined: Self = StObject.set(x, "filterFn", js.undefined)
    
    inline def setGetAnyMatch(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAnyMatch", value.toJsFn)
    
    inline def setGetAnyMatchUndefined: Self = StObject.set(x, "getAnyMatch", js.undefined)
    
    inline def setGetCaseSensitive(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCaseSensitive", value.toJsFn)
    
    inline def setGetCaseSensitiveUndefined: Self = StObject.set(x, "getCaseSensitive", js.undefined)
    
    inline def setGetExactMatch(value: CallbackTo[Boolean]): Self = StObject.set(x, "getExactMatch", value.toJsFn)
    
    inline def setGetExactMatchUndefined: Self = StObject.set(x, "getExactMatch", js.undefined)
    
    inline def setGetFilterFn(value: CallbackTo[Any]): Self = StObject.set(x, "getFilterFn", value.toJsFn)
    
    inline def setGetFilterFnUndefined: Self = StObject.set(x, "getFilterFn", js.undefined)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    inline def setGetProperty(value: CallbackTo[String]): Self = StObject.set(x, "getProperty", value.toJsFn)
    
    inline def setGetPropertyUndefined: Self = StObject.set(x, "getProperty", js.undefined)
    
    inline def setGetRoot(value: CallbackTo[String]): Self = StObject.set(x, "getRoot", value.toJsFn)
    
    inline def setGetRootUndefined: Self = StObject.set(x, "getRoot", js.undefined)
    
    inline def setGetScope(value: CallbackTo[Any]): Self = StObject.set(x, "getScope", value.toJsFn)
    
    inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSetAnyMatch(value: /* anyMatch */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAnyMatch", js.Any.fromFunction1((t0: /* anyMatch */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAnyMatchUndefined: Self = StObject.set(x, "setAnyMatch", js.undefined)
    
    inline def setSetCaseSensitive(value: /* caseSensitive */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setCaseSensitive", js.Any.fromFunction1((t0: /* caseSensitive */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetCaseSensitiveUndefined: Self = StObject.set(x, "setCaseSensitive", js.undefined)
    
    inline def setSetExactMatch(value: /* exactMatch */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setExactMatch", js.Any.fromFunction1((t0: /* exactMatch */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetExactMatchUndefined: Self = StObject.set(x, "setExactMatch", js.undefined)
    
    inline def setSetFilterFn(value: /* filterFn */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setFilterFn", js.Any.fromFunction1((t0: /* filterFn */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetFilterFnUndefined: Self = StObject.set(x, "setFilterFn", js.undefined)
    
    inline def setSetId(value: /* id */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setId", js.Any.fromFunction1((t0: /* id */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    inline def setSetProperty(value: /* property */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setProperty", js.Any.fromFunction1((t0: /* property */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetPropertyUndefined: Self = StObject.set(x, "setProperty", js.undefined)
    
    inline def setSetRoot(value: /* root */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setRoot", js.Any.fromFunction1((t0: /* root */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetRootUndefined: Self = StObject.set(x, "setRoot", js.undefined)
    
    inline def setSetScope(value: /* scope */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setScope", js.Any.fromFunction1((t0: /* scope */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
