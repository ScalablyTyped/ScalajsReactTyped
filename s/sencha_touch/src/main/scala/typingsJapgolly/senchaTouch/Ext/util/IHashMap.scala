package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashMap
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.mixin.IObservable {
  
  /** [Method] Add a new item to the hash
    * @param key String The key of the new item.
    * @param value Object The value of the new item.
    * @returns Object The value of the new item added.
    */
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* value */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Removes all items from the hash
    * @param initial Object
    * @returns Ext.util.HashMap this
    */
  var clear: js.UndefOr[js.Function1[/* initial */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Method] Performs a shallow copy on this hash
    * @returns Ext.util.HashMap The new hash object.
    */
  @JSName("clone")
  var clone_FIHashMap: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Checks whether a value exists in the hash
    * @param value Object The value to check for.
    * @returns Boolean true if the value exists in the dictionary.
    */
  var contains: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Checks whether a key exists in the hash
    * @param key String The key to check for.
    * @returns Boolean true if they key exists in the hash.
    */
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Method] Executes the specified function once for each item in the hash
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in.
    * @returns Ext.util.HashMap this
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Method] Retrieves an item with a particular key
    * @param key String The key to lookup.
    * @returns Object The value at that key. If it doesn't exist, undefined is returned.
    */
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Any]] = js.undefined
  
  /** [Method] Gets the number of items in the hash
    * @returns Number The number of items in the hash.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Return all of the keys in the hash
    * @returns Array An array of keys.
    */
  var getKeys: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Return all of the values in the hash
    * @returns Array An array of values.
    */
  var getValues: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Config Option] (Function) */
  var keyFn: js.UndefOr[Any] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IHashMap: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[Any], 
      /* events */ js.UndefOr[Any], 
      typingsJapgolly.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.undefined
  
  /** [Method] Remove an item from the hash
    * @param o Object The value of the item to remove.
    * @returns Boolean true if the item was successfully removed.
    */
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Remove an item from the hash
    * @param key String The key to remove.
    * @returns Boolean true if the item was successfully removed.
    */
  var removeByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Method] Replaces an item in the hash
    * @param key String The key of the item.
    * @param value Object The new value for the item.
    * @returns Object The new value of the item.
    */
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* value */ js.UndefOr[Any], Any]] = js.undefined
}
object IHashMap {
  
  inline def apply(): IHashMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHashMap]
  }
  
  extension [Self <: IHashMap](x: Self) {
    
    inline def setAdd(value: (/* key */ js.UndefOr[String], /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setClear(value: /* initial */ js.UndefOr[Any] => IHashMap): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setClone_(value: CallbackTo[IHashMap]): Self = StObject.set(x, "clone", value.toJsFn)
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setContains(value: /* value */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
    
    inline def setContainsKeyUndefined: Self = StObject.set(x, "containsKey", js.undefined)
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setEach(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => IHashMap): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setGet(value: /* key */ js.UndefOr[String] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setGetKeys(value: CallbackTo[Array]): Self = StObject.set(x, "getKeys", value.toJsFn)
    
    inline def setGetKeysUndefined: Self = StObject.set(x, "getKeys", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setGetValues(value: CallbackTo[Array]): Self = StObject.set(x, "getValues", value.toJsFn)
    
    inline def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    inline def setKeyFn(value: Any): Self = StObject.set(x, "keyFn", value.asInstanceOf[js.Any])
    
    inline def setKeyFnUndefined: Self = StObject.set(x, "keyFn", js.undefined)
    
    inline def setRelayEvents(
      value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => typingsJapgolly.senchaTouch.Ext.mixin.IObservable
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRemove(value: /* o */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveByKey(value: /* key */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "removeByKey", js.Any.fromFunction1(value))
    
    inline def setRemoveByKeyUndefined: Self = StObject.set(x, "removeByKey", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setReplace(value: (/* key */ js.UndefOr[String], /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
