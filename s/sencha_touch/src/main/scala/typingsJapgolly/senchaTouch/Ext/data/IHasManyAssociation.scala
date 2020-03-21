package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHasManyAssociation
  extends typingsJapgolly.senchaTouch.Ext.data.association.IAssociation {
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
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
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
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of storeName
  		* @param storeName String The new value.
  		*/
  var setStoreName: js.UndefOr[js.Function1[/* storeName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var storeName: js.UndefOr[String] = js.undefined
}

object IHasManyAssociation {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    associatedModel: String = null,
    associatedName: String = null,
    associationKey: String = null,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    filterProperty: String = null,
    foreignKey: String = null,
    getAssociatedModel: js.UndefOr[CallbackTo[String]] = js.undefined,
    getAssociatedName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getAssociationKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getAutoLoad: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAutoSync: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getFilterProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getForeignKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getName: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOwnerModel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOwnerName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPrimaryKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getReader: js.UndefOr[CallbackTo[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]] = js.undefined,
    getStore: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStoreName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getType: js.UndefOr[CallbackTo[String]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    name: String = null,
    ownerModel: js.Any = null,
    platformConfig: js.Any = null,
    primaryKey: String = null,
    reader: typingsJapgolly.senchaTouch.Ext.data.reader.IReader = null,
    self: IClass = null,
    setAssociatedModel: /* associatedModel */ js.UndefOr[String] => Callback = null,
    setAssociatedName: /* associatedName */ js.UndefOr[String] => Callback = null,
    setAssociationKey: /* associationKey */ js.UndefOr[String] => Callback = null,
    setAutoLoad: /* autoLoad */ js.UndefOr[Boolean] => Callback = null,
    setAutoSync: /* autoSync */ js.UndefOr[Boolean] => Callback = null,
    setFilterProperty: /* filterProperty */ js.UndefOr[String] => Callback = null,
    setForeignKey: /* foreignKey */ js.UndefOr[String] => Callback = null,
    setName: /* name */ js.UndefOr[js.Any] => Callback = null,
    setOwnerModel: /* ownerModel */ js.UndefOr[js.Any] => Callback = null,
    setOwnerName: /* ownerName */ js.UndefOr[String] => Callback = null,
    setPrimaryKey: /* primaryKey */ js.UndefOr[String] => Callback = null,
    setReader: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader] => Callback = null,
    setStore: /* store */ js.UndefOr[js.Any] => Callback = null,
    setStoreName: /* storeName */ js.UndefOr[String] => Callback = null,
    setType: /* type */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    store: js.Any = null,
    storeConfig: js.Any = null,
    storeName: String = null,
    `type`: String = null,
    uses: Array = null
  ): IHasManyAssociation = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel.asInstanceOf[js.Any])
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName.asInstanceOf[js.Any])
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filterProperty != null) __obj.updateDynamic("filterProperty")(filterProperty.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    getAssociatedModel.foreach(p => __obj.updateDynamic("getAssociatedModel")(p.toJsFn))
    getAssociatedName.foreach(p => __obj.updateDynamic("getAssociatedName")(p.toJsFn))
    getAssociationKey.foreach(p => __obj.updateDynamic("getAssociationKey")(p.toJsFn))
    getAutoLoad.foreach(p => __obj.updateDynamic("getAutoLoad")(p.toJsFn))
    getAutoSync.foreach(p => __obj.updateDynamic("getAutoSync")(p.toJsFn))
    getFilterProperty.foreach(p => __obj.updateDynamic("getFilterProperty")(p.toJsFn))
    getForeignKey.foreach(p => __obj.updateDynamic("getForeignKey")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getOwnerModel.foreach(p => __obj.updateDynamic("getOwnerModel")(p.toJsFn))
    getOwnerName.foreach(p => __obj.updateDynamic("getOwnerName")(p.toJsFn))
    getPrimaryKey.foreach(p => __obj.updateDynamic("getPrimaryKey")(p.toJsFn))
    getReader.foreach(p => __obj.updateDynamic("getReader")(p.toJsFn))
    getStore.foreach(p => __obj.updateDynamic("getStore")(p.toJsFn))
    getStoreName.foreach(p => __obj.updateDynamic("getStoreName")(p.toJsFn))
    getType.foreach(p => __obj.updateDynamic("getType")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAssociatedModel != null) __obj.updateDynamic("setAssociatedModel")(js.Any.fromFunction1((t0: /* associatedModel */ js.UndefOr[java.lang.String]) => setAssociatedModel(t0).runNow()))
    if (setAssociatedName != null) __obj.updateDynamic("setAssociatedName")(js.Any.fromFunction1((t0: /* associatedName */ js.UndefOr[java.lang.String]) => setAssociatedName(t0).runNow()))
    if (setAssociationKey != null) __obj.updateDynamic("setAssociationKey")(js.Any.fromFunction1((t0: /* associationKey */ js.UndefOr[java.lang.String]) => setAssociationKey(t0).runNow()))
    if (setAutoLoad != null) __obj.updateDynamic("setAutoLoad")(js.Any.fromFunction1((t0: /* autoLoad */ js.UndefOr[scala.Boolean]) => setAutoLoad(t0).runNow()))
    if (setAutoSync != null) __obj.updateDynamic("setAutoSync")(js.Any.fromFunction1((t0: /* autoSync */ js.UndefOr[scala.Boolean]) => setAutoSync(t0).runNow()))
    if (setFilterProperty != null) __obj.updateDynamic("setFilterProperty")(js.Any.fromFunction1((t0: /* filterProperty */ js.UndefOr[java.lang.String]) => setFilterProperty(t0).runNow()))
    if (setForeignKey != null) __obj.updateDynamic("setForeignKey")(js.Any.fromFunction1((t0: /* foreignKey */ js.UndefOr[java.lang.String]) => setForeignKey(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[js.Any]) => setName(t0).runNow()))
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(js.Any.fromFunction1((t0: /* ownerModel */ js.UndefOr[js.Any]) => setOwnerModel(t0).runNow()))
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(js.Any.fromFunction1((t0: /* ownerName */ js.UndefOr[java.lang.String]) => setOwnerName(t0).runNow()))
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(js.Any.fromFunction1((t0: /* primaryKey */ js.UndefOr[java.lang.String]) => setPrimaryKey(t0).runNow()))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1((t0: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]) => setReader(t0).runNow()))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[js.Any]) => setStore(t0).runNow()))
    if (setStoreName != null) __obj.updateDynamic("setStoreName")(js.Any.fromFunction1((t0: /* storeName */ js.UndefOr[java.lang.String]) => setStoreName(t0).runNow()))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: /* type */ js.UndefOr[java.lang.String]) => setType(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (storeConfig != null) __obj.updateDynamic("storeConfig")(storeConfig.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHasManyAssociation]
  }
}

