package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHasManyAssociation
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.data.association.IAssociation {
  
  /** [Config Option] (Boolean) */
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var filterProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of autoLoad
    * @returns Boolean
    */
  var getAutoLoad: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of autoSync
    * @returns Boolean
    */
  var getAutoSync: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of filterProperty
    * @returns String
    */
  var getFilterProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of foreignKey
    * @returns String
    */
  var getForeignKey: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of store
    * @returns Object
    */
  var getStore: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of storeName
    * @returns String
    */
  var getStoreName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of autoLoad
    * @param autoLoad Boolean The new value.
    */
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoSync
    * @param autoSync Boolean The new value.
    */
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of filterProperty
    * @param filterProperty String The new value.
    */
  var setFilterProperty: js.UndefOr[js.Function1[/* filterProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of foreignKey
    * @param foreignKey String The new value.
    */
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of store
    * @param store Object The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of storeName
    * @param storeName String The new value.
    */
  var setStoreName: js.UndefOr[js.Function1[/* storeName */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var store: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var storeName: js.UndefOr[String] = js.undefined
}
object IHasManyAssociation {
  
  inline def apply(): IHasManyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasManyAssociation]
  }
  
  extension [Self <: IHasManyAssociation](x: Self) {
    
    inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setAutoSync(value: Boolean): Self = StObject.set(x, "autoSync", value.asInstanceOf[js.Any])
    
    inline def setAutoSyncUndefined: Self = StObject.set(x, "autoSync", js.undefined)
    
    inline def setFilterProperty(value: String): Self = StObject.set(x, "filterProperty", value.asInstanceOf[js.Any])
    
    inline def setFilterPropertyUndefined: Self = StObject.set(x, "filterProperty", js.undefined)
    
    inline def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    inline def setGetAutoLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoLoad", value.toJsFn)
    
    inline def setGetAutoLoadUndefined: Self = StObject.set(x, "getAutoLoad", js.undefined)
    
    inline def setGetAutoSync(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoSync", value.toJsFn)
    
    inline def setGetAutoSyncUndefined: Self = StObject.set(x, "getAutoSync", js.undefined)
    
    inline def setGetFilterProperty(value: CallbackTo[String]): Self = StObject.set(x, "getFilterProperty", value.toJsFn)
    
    inline def setGetFilterPropertyUndefined: Self = StObject.set(x, "getFilterProperty", js.undefined)
    
    inline def setGetForeignKey(value: CallbackTo[String]): Self = StObject.set(x, "getForeignKey", value.toJsFn)
    
    inline def setGetForeignKeyUndefined: Self = StObject.set(x, "getForeignKey", js.undefined)
    
    inline def setGetStore(value: CallbackTo[Any]): Self = StObject.set(x, "getStore", value.toJsFn)
    
    inline def setGetStoreName(value: CallbackTo[String]): Self = StObject.set(x, "getStoreName", value.toJsFn)
    
    inline def setGetStoreNameUndefined: Self = StObject.set(x, "getStoreName", js.undefined)
    
    inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSetAutoLoad(value: /* autoLoad */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoLoad", js.Any.fromFunction1((t0: /* autoLoad */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAutoLoadUndefined: Self = StObject.set(x, "setAutoLoad", js.undefined)
    
    inline def setSetAutoSync(value: /* autoSync */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoSync", js.Any.fromFunction1((t0: /* autoSync */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAutoSyncUndefined: Self = StObject.set(x, "setAutoSync", js.undefined)
    
    inline def setSetFilterProperty(value: /* filterProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setFilterProperty", js.Any.fromFunction1((t0: /* filterProperty */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetFilterPropertyUndefined: Self = StObject.set(x, "setFilterProperty", js.undefined)
    
    inline def setSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setForeignKey", js.Any.fromFunction1((t0: /* foreignKey */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetForeignKeyUndefined: Self = StObject.set(x, "setForeignKey", js.undefined)
    
    inline def setSetStore(value: /* store */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setStore", js.Any.fromFunction1((t0: /* store */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetStoreName(value: /* storeName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setStoreName", js.Any.fromFunction1((t0: /* storeName */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetStoreNameUndefined: Self = StObject.set(x, "setStoreName", js.undefined)
    
    inline def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreConfig(value: Any): Self = StObject.set(x, "storeConfig", value.asInstanceOf[js.Any])
    
    inline def setStoreConfigUndefined: Self = StObject.set(x, "storeConfig", js.undefined)
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
