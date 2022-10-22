package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.data.IAbstractStore
import typingsJapgolly.extjs.Ext.data.IStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBindable
  extends StObject
     with IBase {
  
  /** [Method] Binds a store to this instance
    * @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
    */
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[/* store */ js.UndefOr[IAbstractStore], Unit]] = js.undefined
  
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.undefined
  
  /** [Method] Gets the listeners to bind to a new store
    * @param store Ext.data.Store The Store which is being bound to for which a listeners object should be returned.
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Any]] = js.undefined
  
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[/* store */ js.UndefOr[IAbstractStore], Unit]] = js.undefined
}
object IBindable {
  
  inline def apply(): IBindable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBindable]
  }
  
  extension [Self <: IBindable](x: Self) {
    
    inline def setBindStore(value: /* store */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "bindStore", js.Any.fromFunction1((t0: /* store */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setBindStoreListeners(value: /* store */ js.UndefOr[IAbstractStore] => Callback): Self = StObject.set(x, "bindStoreListeners", js.Any.fromFunction1((t0: /* store */ js.UndefOr[IAbstractStore]) => value(t0).runNow()))
    
    inline def setBindStoreListenersUndefined: Self = StObject.set(x, "bindStoreListeners", js.undefined)
    
    inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    inline def setGetStore(value: CallbackTo[IAbstractStore]): Self = StObject.set(x, "getStore", value.toJsFn)
    
    inline def setGetStoreListeners(value: /* store */ js.UndefOr[IStore] => Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
    
    inline def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
    
    inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    inline def setOnBindStore(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2((t0: /* store */ js.UndefOr[IAbstractStore], t1: /* initial */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
    
    inline def setOnUnbindStore(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2((t0: /* store */ js.UndefOr[IAbstractStore], t1: /* initial */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
    
    inline def setUnbindStoreListeners(value: /* store */ js.UndefOr[IAbstractStore] => Callback): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1((t0: /* store */ js.UndefOr[IAbstractStore]) => value(t0).runNow()))
    
    inline def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
  }
}
