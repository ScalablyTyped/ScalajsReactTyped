package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object association {
  
  trait IAssociation
    extends StObject
       with IBase {
    
    /** [Config Option] (String) */
    var associatedModel: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var associatedName: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var associationKey: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of associatedModel
      * @returns String
      */
    var getAssociatedModel: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of associatedName
      * @returns String
      */
    var getAssociatedName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of associationKey
      * @returns String
      */
    var getAssociationKey: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of name
      * @returns Object
      */
    var getName: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of ownerModel
      * @returns Ext.data.Model/String
      */
    var getOwnerModel: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of ownerName
      * @returns String
      */
    var getOwnerName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of primaryKey
      * @returns String
      */
    var getPrimaryKey: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of reader
      * @returns Ext.data.reader.Reader
      */
    var getReader: js.UndefOr[js.Function0[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]] = js.undefined
    
    /** [Method] Returns the value of type
      * @returns String
      */
    var getType: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Config Option] (Ext.data.Model/String) */
    var ownerModel: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Ext.data.reader.Reader) */
    var reader: js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader] = js.undefined
    
    /** [Method] Sets the value of associatedModel
      * @param associatedModel String The new value.
      */
    var setAssociatedModel: js.UndefOr[js.Function1[/* associatedModel */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of associatedName
      * @param associatedName String The new value.
      */
    var setAssociatedName: js.UndefOr[js.Function1[/* associatedName */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of associationKey
      * @param associationKey String The new value.
      */
    var setAssociationKey: js.UndefOr[js.Function1[/* associationKey */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of name
      * @param name Object The new value.
      */
    var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of ownerModel
      * @param ownerModel Ext.data.Model/String The new value.
      */
    var setOwnerModel: js.UndefOr[js.Function1[/* ownerModel */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of ownerName
      * @param ownerName String The new value.
      */
    var setOwnerName: js.UndefOr[js.Function1[/* ownerName */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of primaryKey
      * @param primaryKey String The new value.
      */
    var setPrimaryKey: js.UndefOr[js.Function1[/* primaryKey */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of reader
      * @param reader Ext.data.reader.Reader The new value.
      */
    var setReader: js.UndefOr[
        js.Function1[/* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader], Unit]
      ] = js.undefined
    
    /** [Method] Sets the value of type
      * @param type String The new value.
      */
    var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IAssociation {
    
    inline def apply(): typingsJapgolly.senchaTouch.Ext.data.association.IAssociation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.senchaTouch.Ext.data.association.IAssociation]
    }
    
    extension [Self <: typingsJapgolly.senchaTouch.Ext.data.association.IAssociation](x: Self) {
      
      inline def setAssociatedModel(value: String): Self = StObject.set(x, "associatedModel", value.asInstanceOf[js.Any])
      
      inline def setAssociatedModelUndefined: Self = StObject.set(x, "associatedModel", js.undefined)
      
      inline def setAssociatedName(value: String): Self = StObject.set(x, "associatedName", value.asInstanceOf[js.Any])
      
      inline def setAssociatedNameUndefined: Self = StObject.set(x, "associatedName", js.undefined)
      
      inline def setAssociationKey(value: String): Self = StObject.set(x, "associationKey", value.asInstanceOf[js.Any])
      
      inline def setAssociationKeyUndefined: Self = StObject.set(x, "associationKey", js.undefined)
      
      inline def setGetAssociatedModel(value: CallbackTo[String]): Self = StObject.set(x, "getAssociatedModel", value.toJsFn)
      
      inline def setGetAssociatedModelUndefined: Self = StObject.set(x, "getAssociatedModel", js.undefined)
      
      inline def setGetAssociatedName(value: CallbackTo[String]): Self = StObject.set(x, "getAssociatedName", value.toJsFn)
      
      inline def setGetAssociatedNameUndefined: Self = StObject.set(x, "getAssociatedName", js.undefined)
      
      inline def setGetAssociationKey(value: CallbackTo[String]): Self = StObject.set(x, "getAssociationKey", value.toJsFn)
      
      inline def setGetAssociationKeyUndefined: Self = StObject.set(x, "getAssociationKey", js.undefined)
      
      inline def setGetName(value: CallbackTo[Any]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      inline def setGetOwnerModel(value: CallbackTo[Any]): Self = StObject.set(x, "getOwnerModel", value.toJsFn)
      
      inline def setGetOwnerModelUndefined: Self = StObject.set(x, "getOwnerModel", js.undefined)
      
      inline def setGetOwnerName(value: CallbackTo[String]): Self = StObject.set(x, "getOwnerName", value.toJsFn)
      
      inline def setGetOwnerNameUndefined: Self = StObject.set(x, "getOwnerName", js.undefined)
      
      inline def setGetPrimaryKey(value: CallbackTo[String]): Self = StObject.set(x, "getPrimaryKey", value.toJsFn)
      
      inline def setGetPrimaryKeyUndefined: Self = StObject.set(x, "getPrimaryKey", js.undefined)
      
      inline def setGetReader(value: CallbackTo[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]): Self = StObject.set(x, "getReader", value.toJsFn)
      
      inline def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
      
      inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
      
      inline def setOwnerModel(value: Any): Self = StObject.set(x, "ownerModel", value.asInstanceOf[js.Any])
      
      inline def setOwnerModelUndefined: Self = StObject.set(x, "ownerModel", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setReader(value: typingsJapgolly.senchaTouch.Ext.data.reader.IReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
      
      inline def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
      
      inline def setSetAssociatedModel(value: /* associatedModel */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAssociatedModel", js.Any.fromFunction1((t0: /* associatedModel */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetAssociatedModelUndefined: Self = StObject.set(x, "setAssociatedModel", js.undefined)
      
      inline def setSetAssociatedName(value: /* associatedName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAssociatedName", js.Any.fromFunction1((t0: /* associatedName */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetAssociatedNameUndefined: Self = StObject.set(x, "setAssociatedName", js.undefined)
      
      inline def setSetAssociationKey(value: /* associationKey */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAssociationKey", js.Any.fromFunction1((t0: /* associationKey */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetAssociationKeyUndefined: Self = StObject.set(x, "setAssociationKey", js.undefined)
      
      inline def setSetName(value: /* name */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: /* name */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
      
      inline def setSetOwnerModel(value: /* ownerModel */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setOwnerModel", js.Any.fromFunction1((t0: /* ownerModel */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetOwnerModelUndefined: Self = StObject.set(x, "setOwnerModel", js.undefined)
      
      inline def setSetOwnerName(value: /* ownerName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setOwnerName", js.Any.fromFunction1((t0: /* ownerName */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetOwnerNameUndefined: Self = StObject.set(x, "setOwnerName", js.undefined)
      
      inline def setSetPrimaryKey(value: /* primaryKey */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setPrimaryKey", js.Any.fromFunction1((t0: /* primaryKey */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetPrimaryKeyUndefined: Self = StObject.set(x, "setPrimaryKey", js.undefined)
      
      inline def setSetReader(value: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader] => Callback): Self = StObject.set(x, "setReader", js.Any.fromFunction1((t0: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]) => value(t0).runNow()))
      
      inline def setSetReaderUndefined: Self = StObject.set(x, "setReader", js.undefined)
      
      inline def setSetType(value: /* type */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: /* type */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IBelongsTo
    extends StObject
       with typingsJapgolly.senchaTouch.Ext.data.association.IAssociation {
    
    /** [Config Option] (String) */
    var foreignKey: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of foreignKey
      * @returns String
      */
    var getForeignKey: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of getterName
      * @returns String
      */
    var getGetterName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of instanceName
      * @returns Object
      */
    var getInstanceName: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of setterName
      * @returns String
      */
    var getSetterName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Config Option] (String) */
    var getterName: js.UndefOr[String] = js.undefined
    
    /** [Method] Sets the value of foreignKey
      * @param foreignKey String The new value.
      */
    var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of getterName
      * @param getterName String The new value.
      */
    var setGetterName: js.UndefOr[js.Function1[/* getterName */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of instanceName
      * @param instanceName Object The new value.
      */
    var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of setterName
      * @param setterName String The new value.
      */
    var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var setterName: js.UndefOr[String] = js.undefined
  }
  object IBelongsTo {
    
    inline def apply(): IBelongsTo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBelongsTo]
    }
    
    extension [Self <: IBelongsTo](x: Self) {
      
      inline def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
      
      inline def setGetForeignKey(value: CallbackTo[String]): Self = StObject.set(x, "getForeignKey", value.toJsFn)
      
      inline def setGetForeignKeyUndefined: Self = StObject.set(x, "getForeignKey", js.undefined)
      
      inline def setGetGetterName(value: CallbackTo[String]): Self = StObject.set(x, "getGetterName", value.toJsFn)
      
      inline def setGetGetterNameUndefined: Self = StObject.set(x, "getGetterName", js.undefined)
      
      inline def setGetInstanceName(value: CallbackTo[Any]): Self = StObject.set(x, "getInstanceName", value.toJsFn)
      
      inline def setGetInstanceNameUndefined: Self = StObject.set(x, "getInstanceName", js.undefined)
      
      inline def setGetSetterName(value: CallbackTo[String]): Self = StObject.set(x, "getSetterName", value.toJsFn)
      
      inline def setGetSetterNameUndefined: Self = StObject.set(x, "getSetterName", js.undefined)
      
      inline def setGetterName(value: String): Self = StObject.set(x, "getterName", value.asInstanceOf[js.Any])
      
      inline def setGetterNameUndefined: Self = StObject.set(x, "getterName", js.undefined)
      
      inline def setSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setForeignKey", js.Any.fromFunction1((t0: /* foreignKey */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetForeignKeyUndefined: Self = StObject.set(x, "setForeignKey", js.undefined)
      
      inline def setSetGetterName(value: /* getterName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setGetterName", js.Any.fromFunction1((t0: /* getterName */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetGetterNameUndefined: Self = StObject.set(x, "setGetterName", js.undefined)
      
      inline def setSetInstanceName(value: /* instanceName */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setInstanceName", js.Any.fromFunction1((t0: /* instanceName */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetInstanceNameUndefined: Self = StObject.set(x, "setInstanceName", js.undefined)
      
      inline def setSetSetterName(value: /* setterName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setSetterName", js.Any.fromFunction1((t0: /* setterName */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetSetterNameUndefined: Self = StObject.set(x, "setSetterName", js.undefined)
      
      inline def setSetterName(value: String): Self = StObject.set(x, "setterName", value.asInstanceOf[js.Any])
      
      inline def setSetterNameUndefined: Self = StObject.set(x, "setterName", js.undefined)
    }
  }
  
  trait IHasMany
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
  object IHasMany {
    
    inline def apply(): IHasMany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHasMany]
    }
    
    extension [Self <: IHasMany](x: Self) {
      
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
  
  trait IHasOne
    extends StObject
       with typingsJapgolly.senchaTouch.Ext.data.association.IAssociation {
    
    /** [Config Option] (String) */
    var foreignKey: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of foreignKey
      * @returns String
      */
    var getForeignKey: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of getterName
      * @returns String
      */
    var getGetterName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of instanceName
      * @returns Object
      */
    var getInstanceName: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of setterName
      * @returns String
      */
    var getSetterName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Config Option] (String) */
    var getterName: js.UndefOr[String] = js.undefined
    
    /** [Method] Sets the value of foreignKey
      * @param foreignKey String The new value.
      */
    var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of getterName
      * @param getterName String The new value.
      */
    var setGetterName: js.UndefOr[js.Function1[/* getterName */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of instanceName
      * @param instanceName Object The new value.
      */
    var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of setterName
      * @param setterName String The new value.
      */
    var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var setterName: js.UndefOr[String] = js.undefined
  }
  object IHasOne {
    
    inline def apply(): IHasOne = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHasOne]
    }
    
    extension [Self <: IHasOne](x: Self) {
      
      inline def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
      
      inline def setGetForeignKey(value: CallbackTo[String]): Self = StObject.set(x, "getForeignKey", value.toJsFn)
      
      inline def setGetForeignKeyUndefined: Self = StObject.set(x, "getForeignKey", js.undefined)
      
      inline def setGetGetterName(value: CallbackTo[String]): Self = StObject.set(x, "getGetterName", value.toJsFn)
      
      inline def setGetGetterNameUndefined: Self = StObject.set(x, "getGetterName", js.undefined)
      
      inline def setGetInstanceName(value: CallbackTo[Any]): Self = StObject.set(x, "getInstanceName", value.toJsFn)
      
      inline def setGetInstanceNameUndefined: Self = StObject.set(x, "getInstanceName", js.undefined)
      
      inline def setGetSetterName(value: CallbackTo[String]): Self = StObject.set(x, "getSetterName", value.toJsFn)
      
      inline def setGetSetterNameUndefined: Self = StObject.set(x, "getSetterName", js.undefined)
      
      inline def setGetterName(value: String): Self = StObject.set(x, "getterName", value.asInstanceOf[js.Any])
      
      inline def setGetterNameUndefined: Self = StObject.set(x, "getterName", js.undefined)
      
      inline def setSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setForeignKey", js.Any.fromFunction1((t0: /* foreignKey */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetForeignKeyUndefined: Self = StObject.set(x, "setForeignKey", js.undefined)
      
      inline def setSetGetterName(value: /* getterName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setGetterName", js.Any.fromFunction1((t0: /* getterName */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetGetterNameUndefined: Self = StObject.set(x, "setGetterName", js.undefined)
      
      inline def setSetInstanceName(value: /* instanceName */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setInstanceName", js.Any.fromFunction1((t0: /* instanceName */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetInstanceNameUndefined: Self = StObject.set(x, "setInstanceName", js.undefined)
      
      inline def setSetSetterName(value: /* setterName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setSetterName", js.Any.fromFunction1((t0: /* setterName */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetSetterNameUndefined: Self = StObject.set(x, "setSetterName", js.undefined)
      
      inline def setSetterName(value: String): Self = StObject.set(x, "setterName", value.asInstanceOf[js.Any])
      
      inline def setSetterNameUndefined: Self = StObject.set(x, "setterName", js.undefined)
    }
  }
}
