package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractMixedCollection
  extends typingsJapgolly.senchaTouch.Ext.mixin.IObservable {
  /** [Method] Adds an item to the collection
  		* @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
  		* @param obj Object The item to add.
  		* @returns Object The item added.
  		*/
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* obj */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Adds all elements of an Array or an Object to the collection
  		* @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
  		*/
  var addAll: js.UndefOr[js.Function1[/* objs */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var allowFunctions: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Creates a shallow copy of this collection
  		* @returns Ext.util.MixedCollection
  		*/
  @JSName("clone")
  var clone_FIAbstractMixedCollection: js.UndefOr[js.Function0[IMixedCollection]] = js.undefined
  /** [Method] Collects unique values of a particular property in this MixedCollection
  		* @param property String The property to collect on.
  		* @param root String Optional 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the data object.
  		* @param allowNull Boolean Pass true to allow null, undefined, or empty string values.
  		* @returns Array The unique values.
  		*/
  var collect: js.UndefOr[
    js.Function3[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* allowNull */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.undefined
  /** [Method] Returns true if the collection contains the passed Object as an item
  		* @param o Object The Object to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as an item.
  		*/
  var contains: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns true if the collection contains the passed Object as a key
  		* @param key String The key to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as a key.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Executes the specified function once for every item in the collection
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  var eachKey: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
  		* @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
  		* @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @returns Ext.util.MixedCollection The new filtered collection
  		*/
  var filter: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.undefined
  /** [Method] Filter by a function
  		* @param fn Function The function to be called, it will receive the args o (the object), k (the key)
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @returns Ext.util.MixedCollection The new filtered collection.
  		*/
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.undefined
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		* @returns Object The first item in the collection which returned true from the selection function.
  		*/
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Finds the index of the first matching object in this collection by a specific property value
  		* @param property String The name of a property on your objects.
  		* @param value String/RegExp A string that the property values. should start with or a RegExp to test against the property.
  		* @param start Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @returns Number The matched index or -1.
  		*/
  var findIndex: js.UndefOr[
    js.Function5[
      /* property */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  /** [Method] Find the index of the first matching object in this collection by a function
  		* @param fn Function The function to be called, it will receive the args o (the object), k (the key).
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @param start Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findIndexBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  /** [Method] Returns the first item in the collection
  		* @returns Object the first item in the collection..
  		*/
  var first: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the item associated with the passed key OR index
  		* @param key String/Number The key or index of the item.
  		* @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
  		*/
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the item at the specified index
  		* @param index Number The index of the item.
  		* @returns Object The item at the specified index.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns the item associated with the passed key
  		* @param key String/Number The key of the item.
  		* @returns Object The item associated with the passed key.
  		*/
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the number of items in the collection
  		* @returns Number the number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] MixedCollection has a generic way to fetch keys if you implement getKey
  		* @param item Object The item for which to find the key.
  		* @returns Object The key for the passed item.
  		*/
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns a range of items in this collection
  		* @param start Number The starting index.
  		* @param end Number The ending index.
  		* @returns Array An array of items
  		*/
  var getRange: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.undefined
  /** [Method] Returns index within the collection of the passed Object
  		* @param o Object The item to find the index of.
  		* @returns Number index of the item. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Returns index within the collection of the passed key
  		* @param key String The key to find the index of.
  		* @returns Number The index of the key.
  		*/
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Inserts an item at the specified index in the collection
  		* @param index Number The index to insert the item at.
  		* @param key String The key to associate with the new item, or the item itself.
  		* @param obj Object If the second parameter was a key, the new item.
  		* @returns Object The item inserted.
  		*/
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* key */ js.UndefOr[String], 
      /* obj */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the last item in the collection
  		* @returns Object the last item in the collection..
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAbstractMixedCollection: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      typingsJapgolly.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.undefined
  /** [Method] Remove an item from the collection
  		* @param o Object The item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Remove all items in the passed array from the collection
  		* @param items Array An array of items to be removed.
  		* @returns Ext.util.MixedCollection this object
  		*/
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.undefined
  /** [Method] Remove an item from a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @returns Object/Boolean The item removed or false if no item was removed.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Removed an item associated with the passed key from the collection
  		* @param key String The key of the item to remove.
  		* @returns Object/Boolean The item removed or false if no item was removed.
  		*/
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Replaces an item in the collection
  		* @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
  		* @param o Object If the first parameter passed was a key, the item to associate with that key.
  		* @returns Object The new item.
  		*/
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Collects all of the values of the given property and returns their sum
  		* @param property String The property to sum by.
  		* @param root String Optional 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the data object
  		* @param start Number The record index to start at.
  		* @param end Number The record index to end at.
  		* @returns Number The total
  		*/
  var sum: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* start */ js.UndefOr[Double], 
      /* end */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
}

object IAbstractMixedCollection {
  @scala.inline
  def apply(
    add: (/* key */ js.UndefOr[String], /* obj */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addAll: /* objs */ js.UndefOr[js.Any] => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    allowFunctions: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clear: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clone: js.UndefOr[CallbackTo[IMixedCollection]] = js.undefined,
    collect: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* allowNull */ js.UndefOr[Boolean]) => CallbackTo[Array] = null,
    config: js.Any = null,
    contains: /* o */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    containsKey: /* key */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    eachKey: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    filter: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => CallbackTo[IMixedCollection] = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMixedCollection] = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    findIndex: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    findIndexBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    first: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    get: /* key */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getAt: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getByKey: /* key */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getKey: /* item */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getRange: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => CallbackTo[Array] = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    indexOf: /* o */ js.UndefOr[js.Any] => CallbackTo[Double] = null,
    indexOfKey: /* key */ js.UndefOr[String] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    insert: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[String], /* obj */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    last: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.mixin.IObservable] = null,
    remove: /* o */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeAll: /* items */ js.UndefOr[Array] => CallbackTo[IMixedCollection] = null,
    removeAt: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    removeAtKey: /* key */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    replace: (/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    sum: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IAbstractMixedCollection = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2((t0: /* key */ js.UndefOr[java.lang.String], t1: /* obj */ js.UndefOr[js.Any]) => add(t0, t1).runNow()))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1((t0: /* objs */ js.UndefOr[js.Any]) => addAll(t0).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFunctions)) __obj.updateDynamic("allowFunctions")(allowFunctions.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clone.foreach(p => __obj.updateDynamic("clone")(p.toJsFn))
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction3((t0: /* property */ js.UndefOr[java.lang.String], t1: /* root */ js.UndefOr[java.lang.String], t2: /* allowNull */ js.UndefOr[scala.Boolean]) => collect(t0, t1, t2).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* o */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (containsKey != null) __obj.updateDynamic("containsKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => containsKey(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (eachKey != null) __obj.updateDynamic("eachKey")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => eachKey(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* property */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[js.Any], t2: /* anyMatch */ js.UndefOr[scala.Boolean], t3: /* caseSensitive */ js.UndefOr[scala.Boolean]) => filter(t0, t1, t2, t3).runNow()))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => filterBy(t0, t1).runNow()))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => findBy(t0, t1).runNow()))
    if (findIndex != null) __obj.updateDynamic("findIndex")(js.Any.fromFunction5((t0: /* property */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* start */ js.UndefOr[scala.Double], t3: /* anyMatch */ js.UndefOr[scala.Boolean], t4: /* caseSensitive */ js.UndefOr[scala.Boolean]) => findIndex(t0, t1, t2, t3, t4).runNow()))
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* start */ js.UndefOr[scala.Double]) => findIndexBy(t0, t1, t2).runNow()))
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    first.foreach(p => __obj.updateDynamic("first")(p.toJsFn))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[js.Any]) => get(t0).runNow()))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getAt(t0).runNow()))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    if (getByKey != null) __obj.updateDynamic("getByKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[js.Any]) => getByKey(t0).runNow()))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => getKey(t0).runNow()))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2((t0: /* start */ js.UndefOr[scala.Double], t1: /* end */ js.UndefOr[scala.Double]) => getRange(t0, t1).runNow()))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* o */ js.UndefOr[js.Any]) => indexOf(t0).runNow()))
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => indexOfKey(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction3((t0: /* index */ js.UndefOr[scala.Double], t1: /* key */ js.UndefOr[java.lang.String], t2: /* obj */ js.UndefOr[js.Any]) => insert(t0, t1, t2).runNow()))
    last.foreach(p => __obj.updateDynamic("last")(p.toJsFn))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* o */ js.UndefOr[js.Any]) => remove(t0).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => removeAll(t0).runNow()))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => removeAt(t0).runNow()))
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => removeAtKey(t0).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: /* key */ js.UndefOr[java.lang.String], t1: /* o */ js.UndefOr[js.Any]) => replace(t0, t1).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction4((t0: /* property */ js.UndefOr[java.lang.String], t1: /* root */ js.UndefOr[java.lang.String], t2: /* start */ js.UndefOr[scala.Double], t3: /* end */ js.UndefOr[scala.Double]) => sum(t0, t1, t2, t3).runNow()))
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractMixedCollection]
  }
}

