package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.util.IMixedCollection
import typingsJapgolly.extjs.Ext.util.ISorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.util.IObservable because var conflicts: addEvents, addListener, addManagedListener, clearListeners, clearManagedListeners, enableBubble, fireEvent, fireEventArgs, hasListener, mon, mun, on, relayEvents, removeListener, removeManagedListener, resumeEvent, resumeEvents, suspendEvent, suspendEvents, un. Inlined listeners, hasListeners, isObservable
- typingsJapgolly.extjs.Ext.util.ISortable because var conflicts: generateComparator, getFirstSorter, initSortable, sort. Inlined defaultSortDirection, sortRoot, sorters, isSortable
- typingsJapgolly.extjs.Ext.util.IAbstractMixedCollection because var conflicts: allowFunctions, clone. Inlined isMixedCollection, add, addAll, addEvents, addListener, addManagedListener, clear, clearListeners, clearManagedListeners, collect, contains, containsKey, each, eachKey, enableBubble, filter, filterBy, find, findBy, findIndex, findIndexBy, fireEvent, fireEventArgs, first, get, getAt, getByKey, getCount, getKey, getRange, hasListener, indexOf, indexOfKey, insert, last, mon, mun, on, relayEvents, remove, removeAll, removeAt, removeAtKey, removeListener, removeManagedListener, removeRange, replace, resumeEvent, resumeEvents, sum, suspendEvent, suspendEvents, un, updateKey
- typingsJapgolly.extjs.Ext.util.IMixedCollection because var conflicts: clone. Inlined allowFunctions, findInsertionIndex, generateComparator, getFirstSorter, initSortable, reorder, sort, sortBy, sortByKey */ trait IErrors
  extends StObject
     with IBase {
  
  /** [Method] Adds an item to the collection
    * @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param obj Object The item to add.
    * @returns Object The item added.
    */
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[Any], /* obj */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
    */
  var addAll: js.UndefOr[js.Function1[/* objs */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var addListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[Any], 
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var addManagedListener: js.UndefOr[
    js.Function5[
      /* item */ js.UndefOr[Any], 
      /* ename */ js.UndefOr[Any], 
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowFunctions: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Removes all listeners for this object including the managed listeners */
  var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Removes all managed listeners for this object  */
  var clearManagedListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Collects unique values of a particular property in this MixedCollection
    * @param property String The property to collect on
    * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
    * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
    * @returns Array The unique values
    */
  var collect: js.UndefOr[
    js.Function3[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* allowBlank */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.undefined
  
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param o Object The Object to look for in the collection.
    * @returns Boolean True if the collection contains the Object as an item.
    */
  var contains: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean True if the collection contains the Object as a key.
    */
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.undefined
  
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  var eachKey: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  var enableBubble: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
    * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
    * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
    * @param anyMatch Boolean True to match any part of the string, not just the beginning
    * @param caseSensitive Boolean True for case sensitive comparison.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  var filter: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[Any], 
      /* value */ js.UndefOr[Any], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.undefined
  
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], IMixedCollection]
  ] = js.undefined
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
  var find: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
    */
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Finds the index of the first matching object in this collection by a specific property value
    * @param property String The name of a property on your objects.
    * @param value String/RegExp A string that the property values should start with or a RegExp to test against the property.
    * @param start Number The index to start searching at.
    * @param anyMatch Boolean True to match any part of the string, not just the beginning.
    * @param caseSensitive Boolean True for case sensitive comparison.
    * @returns Number The matched index or -1
    */
  var findIndex: js.UndefOr[
    js.Function5[
      /* property */ js.UndefOr[String], 
      /* value */ js.UndefOr[Any], 
      /* start */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index or -1
    */
  var findIndexBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* start */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  
  /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
    * @param newItem Object The new object to find the insertion position of.
    * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
    * @returns Number The insertion point to add the new item into this MixedCollection at using insert
    */
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* newItem */ js.UndefOr[Any], /* sorterFn */ js.UndefOr[Any], Double]
  ] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ Any, Boolean]] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  var fireEventArgs: js.UndefOr[
    js.Function2[/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], Boolean]
  ] = js.undefined
  
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection..
    */
  var first: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Any]] = js.undefined
  
  /** [Method] Returns all of the errors for the given field
    * @param fieldName String The field to get errors for
    * @returns Object[] All errors for the given field
    */
  var getByField: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Array]] = js.undefined
  
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
    * @returns Ext.util.Sorter The sorter, null if none exist
    */
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.undefined
  
  /** [Method] A function which will be called passing a newly added object when the object is added without a separate id
    * @param item Object The item for which to find the key.
    * @returns Object The key for the passed item.
    */
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns a range of items in this collection
    * @param startIndex Number The starting index. Defaults to 0.
    * @param endIndex Number The ending index. Defaults to the last item.
    * @returns Array An array of items
    */
  var getRange: js.UndefOr[
    js.Function2[/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double], Array]
  ] = js.undefined
  
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Property] (Object) */
  var hasListeners: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns index within the collection of the passed Object
    * @param o Object The item to find the index of.
    * @returns Number index of the item. Returns -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], Double]] = js.undefined
  
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number index of the key.
    */
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Double]] = js.undefined
  
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
    * @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
    * @returns Object The item inserted or an array of items inserted.
    */
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* key */ js.UndefOr[Any], 
      /* o */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  /** [Property] (Boolean) */
  var isMixedCollection: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isObservable: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns true if there are no errors in the collection
    * @returns Boolean
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection..
    */
  var last: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[Any] = js.undefined
  
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var mon: js.UndefOr[
    js.Function5[
      /* item */ js.UndefOr[Any], 
      /* ename */ js.UndefOr[Any], 
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  var mun: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[Any], 
      /* ename */ js.UndefOr[Any], 
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var on: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[Any], 
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  var relayEvents: js.UndefOr[
    js.Function3[
      /* origin */ js.UndefOr[Any], 
      /* events */ js.UndefOr[Array], 
      /* prefix */ js.UndefOr[String], 
      Any
    ]
  ] = js.undefined
  
  /** [Method] Remove an item from the collection
    * @param o Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Remove all items in the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.undefined
  
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Any]] = js.undefined
  
  /** [Method] Removes an item associated with the passed key fom the collection
    * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
    * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
    */
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Any]] = js.undefined
  
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  var removeListener: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  var removeManagedListener: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[Any], 
      /* ename */ js.UndefOr[Any], 
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Remove a range of items starting at a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @param removeCount Number The nuber of items to remove beginning at the specified index.
    * @returns Object The last item removed or false if no item was removed.
    */
  var removeRange: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double], Any]
  ] = js.undefined
  
  /** [Method] Reorders each of the items based on a mapping from old index to new index
    * @param mapping Object Mapping from old item index to new item index
    */
  var reorder: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Replaces an item in the collection
    * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* o */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  var resumeEvent: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  /** [Method] Resumes firing events see suspendEvents */
  var resumeEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  var sort: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[Any], /* direction */ js.UndefOr[String], Array]
  ] = js.undefined
  
  /** [Method] Sorts the collection by a single sorter function
    * @param sorterFn Function The function to sort by
    */
  var sortBy: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sorts this collection by keys
    * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
    * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
    */
  var sortByKey: js.UndefOr[js.Function2[/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[Any] = js.undefined
  
  /** [Method] Collects all of the values of the given property and returns their sum
    * @param property String The property to sum by
    * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
    * @param start Number The record index to start at
    * @param end Number The record index to end at
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
  
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  var suspendEvent: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  var suspendEvents: js.UndefOr[js.Function1[/* queueSuspended */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  var un: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Change the key for an existing item in the collection
    * @param oldKey Object The old key
    * @param newKey Object The new key
    */
  var updateKey: js.UndefOr[js.Function2[/* oldKey */ js.UndefOr[Any], /* newKey */ js.UndefOr[Any], Unit]] = js.undefined
}
object IErrors {
  
  inline def apply(): IErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrors]
  }
  
  extension [Self <: IErrors](x: Self) {
    
    inline def setAdd(value: (/* key */ js.UndefOr[Any], /* obj */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setAddAll(value: /* objs */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "addAll", js.Any.fromFunction1((t0: /* objs */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setAddAllUndefined: Self = StObject.set(x, "addAll", js.undefined)
    
    inline def setAddEvents(value: /* eventNames */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "addEvents", js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
    
    inline def setAddListener(
      value: (/* eventName */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
    
    inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    inline def setAddManagedListener(
      value: (/* item */ js.UndefOr[Any], /* ename */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
    
    inline def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAllowFunctions(value: Boolean): Self = StObject.set(x, "allowFunctions", value.asInstanceOf[js.Any])
    
    inline def setAllowFunctionsUndefined: Self = StObject.set(x, "allowFunctions", js.undefined)
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setClearListeners(value: Callback): Self = StObject.set(x, "clearListeners", value.toJsFn)
    
    inline def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
    
    inline def setClearManagedListeners(value: Callback): Self = StObject.set(x, "clearManagedListeners", value.toJsFn)
    
    inline def setClearManagedListenersUndefined: Self = StObject.set(x, "clearManagedListeners", js.undefined)
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setCollect(
      value: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* allowBlank */ js.UndefOr[Boolean]) => Array
    ): Self = StObject.set(x, "collect", js.Any.fromFunction3(value))
    
    inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
    
    inline def setContains(value: /* o */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
    
    inline def setContainsKeyUndefined: Self = StObject.set(x, "containsKey", js.undefined)
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setDefaultSortDirection(value: String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    inline def setEach(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "each", js.Any.fromFunction2((t0: /* fn */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setEachKey(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "eachKey", js.Any.fromFunction2((t0: /* fn */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setEachKeyUndefined: Self = StObject.set(x, "eachKey", js.undefined)
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setEnableBubble(value: /* eventNames */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
    
    inline def setFilter(
      value: (/* property */ js.UndefOr[Any], /* value */ js.UndefOr[Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => IMixedCollection
    ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
    
    inline def setFilterBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => IMixedCollection): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
    
    inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFind(value: Callback): Self = StObject.set(x, "find", value.toJsFn)
    
    inline def setFindBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "findBy", js.Any.fromFunction2(value))
    
    inline def setFindByUndefined: Self = StObject.set(x, "findBy", js.undefined)
    
    inline def setFindIndex(
      value: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[Any], /* start */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction5(value))
    
    inline def setFindIndexBy(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* start */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "findIndexBy", js.Any.fromFunction3(value))
    
    inline def setFindIndexByUndefined: Self = StObject.set(x, "findIndexBy", js.undefined)
    
    inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
    
    inline def setFindInsertionIndex(value: (/* newItem */ js.UndefOr[Any], /* sorterFn */ js.UndefOr[Any]) => Double): Self = StObject.set(x, "findInsertionIndex", js.Any.fromFunction2(value))
    
    inline def setFindInsertionIndexUndefined: Self = StObject.set(x, "findInsertionIndex", js.undefined)
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    inline def setFireEvent(value: (/* eventName */ String, /* repeated */ Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
    
    inline def setFireEventArgs(value: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean): Self = StObject.set(x, "fireEventArgs", js.Any.fromFunction2(value))
    
    inline def setFireEventArgsUndefined: Self = StObject.set(x, "fireEventArgs", js.undefined)
    
    inline def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
    
    inline def setFirst(value: CallbackTo[Any]): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setGenerateComparator(value: Callback): Self = StObject.set(x, "generateComparator", value.toJsFn)
    
    inline def setGenerateComparatorUndefined: Self = StObject.set(x, "generateComparator", js.undefined)
    
    inline def setGet(value: /* key */ js.UndefOr[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAt(value: /* index */ js.UndefOr[Double] => Any): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
    
    inline def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
    
    inline def setGetByField(value: /* fieldName */ js.UndefOr[String] => Array): Self = StObject.set(x, "getByField", js.Any.fromFunction1(value))
    
    inline def setGetByFieldUndefined: Self = StObject.set(x, "getByField", js.undefined)
    
    inline def setGetByKey(value: /* key */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getByKey", js.Any.fromFunction1(value))
    
    inline def setGetByKeyUndefined: Self = StObject.set(x, "getByKey", js.undefined)
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setGetFirstSorter(value: CallbackTo[ISorter]): Self = StObject.set(x, "getFirstSorter", value.toJsFn)
    
    inline def setGetFirstSorterUndefined: Self = StObject.set(x, "getFirstSorter", js.undefined)
    
    inline def setGetKey(value: /* item */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    inline def setGetRange(value: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "getRange", js.Any.fromFunction2(value))
    
    inline def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setHasListener(value: /* eventName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    inline def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
    
    inline def setHasListeners(value: Any): Self = StObject.set(x, "hasListeners", value.asInstanceOf[js.Any])
    
    inline def setHasListenersUndefined: Self = StObject.set(x, "hasListeners", js.undefined)
    
    inline def setIndexOf(value: /* o */ js.UndefOr[Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfKey(value: /* key */ js.UndefOr[String] => Double): Self = StObject.set(x, "indexOfKey", js.Any.fromFunction1(value))
    
    inline def setIndexOfKeyUndefined: Self = StObject.set(x, "indexOfKey", js.undefined)
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setInitSortable(value: Callback): Self = StObject.set(x, "initSortable", value.toJsFn)
    
    inline def setInitSortableUndefined: Self = StObject.set(x, "initSortable", js.undefined)
    
    inline def setInsert(value: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[Any], /* o */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setIsMixedCollection(value: Boolean): Self = StObject.set(x, "isMixedCollection", value.asInstanceOf[js.Any])
    
    inline def setIsMixedCollectionUndefined: Self = StObject.set(x, "isMixedCollection", js.undefined)
    
    inline def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
    
    inline def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setLast(value: CallbackTo[Any]): Self = StObject.set(x, "last", value.toJsFn)
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setListeners(value: Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setMon(
      value: (/* item */ js.UndefOr[Any], /* ename */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
    
    inline def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
    
    inline def setMun(
      value: (/* item */ js.UndefOr[Any], /* ename */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "mun", js.Any.fromFunction4((t0: /* item */ js.UndefOr[Any], t1: /* ename */ js.UndefOr[Any], t2: /* fn */ js.UndefOr[Any], t3: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
    
    inline def setOn(
      value: (/* eventName */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setRelayEvents(
      value: (/* origin */ js.UndefOr[Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => Any
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction3(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRemove(value: /* o */ js.UndefOr[Any] => Any): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveAll(value: /* items */ js.UndefOr[Array] => IMixedCollection): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveAt(value: /* index */ js.UndefOr[Double] => Any): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    
    inline def setRemoveAtKey(value: /* key */ js.UndefOr[String] => Any): Self = StObject.set(x, "removeAtKey", js.Any.fromFunction1(value))
    
    inline def setRemoveAtKeyUndefined: Self = StObject.set(x, "removeAtKey", js.undefined)
    
    inline def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
    
    inline def setRemoveListener(
      value: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "removeListener", js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[String], t1: /* fn */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    
    inline def setRemoveManagedListener(
      value: (/* item */ js.UndefOr[Any], /* ename */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4((t0: /* item */ js.UndefOr[Any], t1: /* ename */ js.UndefOr[Any], t2: /* fn */ js.UndefOr[Any], t3: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
    
    inline def setRemoveRange(value: (/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => Any): Self = StObject.set(x, "removeRange", js.Any.fromFunction2(value))
    
    inline def setRemoveRangeUndefined: Self = StObject.set(x, "removeRange", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setReorder(value: /* mapping */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "reorder", js.Any.fromFunction1((t0: /* mapping */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
    
    inline def setReplace(value: (/* key */ js.UndefOr[String], /* o */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setResumeEvent(value: /* repeated */ Any => Callback): Self = StObject.set(x, "resumeEvent", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setResumeEventUndefined: Self = StObject.set(x, "resumeEvent", js.undefined)
    
    inline def setResumeEvents(value: Callback): Self = StObject.set(x, "resumeEvents", value.toJsFn)
    
    inline def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
    
    inline def setSort(value: (/* sorters */ js.UndefOr[Any], /* direction */ js.UndefOr[String]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setSortBy(value: /* sorterFn */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "sortBy", js.Any.fromFunction1((t0: /* sorterFn */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSortByKey(value: (/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "sortByKey", js.Any.fromFunction2((t0: /* direction */ js.UndefOr[String], t1: /* fn */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setSortByKeyUndefined: Self = StObject.set(x, "sortByKey", js.undefined)
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortRoot(value: String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
    
    inline def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSorters(value: Any): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    inline def setSum(
      value: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "sum", js.Any.fromFunction4(value))
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    inline def setSuspendEvent(value: /* repeated */ Any => Callback): Self = StObject.set(x, "suspendEvent", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setSuspendEventUndefined: Self = StObject.set(x, "suspendEvent", js.undefined)
    
    inline def setSuspendEvents(value: /* queueSuspended */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
    
    inline def setUn(
      value: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "un", js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[String], t1: /* fn */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
    
    inline def setUpdateKey(value: (/* oldKey */ js.UndefOr[Any], /* newKey */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateKey", js.Any.fromFunction2((t0: /* oldKey */ js.UndefOr[Any], t1: /* newKey */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUpdateKeyUndefined: Self = StObject.set(x, "updateKey", js.undefined)
  }
}
