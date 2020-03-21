package typingsJapgolly.senchaTouch.Ext.data.association

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.data.reader.IReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBelongsTo extends IAssociation {
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
  var getInstanceName: js.UndefOr[js.Function0[_]] = js.undefined
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
  var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of setterName
  		* @param setterName String The new value.
  		*/
  var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.undefined
}

object IBelongsTo {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    associatedModel: String = null,
    associatedName: String = null,
    associationKey: String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    foreignKey: String = null,
    getAssociatedModel: js.UndefOr[CallbackTo[String]] = js.undefined,
    getAssociatedName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getAssociationKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getForeignKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getGetterName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getInstanceName: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getName: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOwnerModel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOwnerName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPrimaryKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getReader: js.UndefOr[CallbackTo[IReader]] = js.undefined,
    getSetterName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getType: js.UndefOr[CallbackTo[String]] = js.undefined,
    getterName: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    ownerModel: js.Any = null,
    platformConfig: js.Any = null,
    primaryKey: String = null,
    reader: IReader = null,
    self: IClass = null,
    setAssociatedModel: /* associatedModel */ js.UndefOr[String] => Callback = null,
    setAssociatedName: /* associatedName */ js.UndefOr[String] => Callback = null,
    setAssociationKey: /* associationKey */ js.UndefOr[String] => Callback = null,
    setForeignKey: /* foreignKey */ js.UndefOr[String] => Callback = null,
    setGetterName: /* getterName */ js.UndefOr[String] => Callback = null,
    setInstanceName: /* instanceName */ js.UndefOr[js.Any] => Callback = null,
    setName: /* name */ js.UndefOr[js.Any] => Callback = null,
    setOwnerModel: /* ownerModel */ js.UndefOr[js.Any] => Callback = null,
    setOwnerName: /* ownerName */ js.UndefOr[String] => Callback = null,
    setPrimaryKey: /* primaryKey */ js.UndefOr[String] => Callback = null,
    setReader: /* reader */ js.UndefOr[IReader] => Callback = null,
    setSetterName: /* setterName */ js.UndefOr[String] => Callback = null,
    setType: /* type */ js.UndefOr[String] => Callback = null,
    setterName: String = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: String = null,
    uses: Array = null
  ): IBelongsTo = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel.asInstanceOf[js.Any])
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName.asInstanceOf[js.Any])
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    getAssociatedModel.foreach(p => __obj.updateDynamic("getAssociatedModel")(p.toJsFn))
    getAssociatedName.foreach(p => __obj.updateDynamic("getAssociatedName")(p.toJsFn))
    getAssociationKey.foreach(p => __obj.updateDynamic("getAssociationKey")(p.toJsFn))
    getForeignKey.foreach(p => __obj.updateDynamic("getForeignKey")(p.toJsFn))
    getGetterName.foreach(p => __obj.updateDynamic("getGetterName")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getInstanceName.foreach(p => __obj.updateDynamic("getInstanceName")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getOwnerModel.foreach(p => __obj.updateDynamic("getOwnerModel")(p.toJsFn))
    getOwnerName.foreach(p => __obj.updateDynamic("getOwnerName")(p.toJsFn))
    getPrimaryKey.foreach(p => __obj.updateDynamic("getPrimaryKey")(p.toJsFn))
    getReader.foreach(p => __obj.updateDynamic("getReader")(p.toJsFn))
    getSetterName.foreach(p => __obj.updateDynamic("getSetterName")(p.toJsFn))
    getType.foreach(p => __obj.updateDynamic("getType")(p.toJsFn))
    if (getterName != null) __obj.updateDynamic("getterName")(getterName.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAssociatedModel != null) __obj.updateDynamic("setAssociatedModel")(js.Any.fromFunction1((t0: /* associatedModel */ js.UndefOr[java.lang.String]) => setAssociatedModel(t0).runNow()))
    if (setAssociatedName != null) __obj.updateDynamic("setAssociatedName")(js.Any.fromFunction1((t0: /* associatedName */ js.UndefOr[java.lang.String]) => setAssociatedName(t0).runNow()))
    if (setAssociationKey != null) __obj.updateDynamic("setAssociationKey")(js.Any.fromFunction1((t0: /* associationKey */ js.UndefOr[java.lang.String]) => setAssociationKey(t0).runNow()))
    if (setForeignKey != null) __obj.updateDynamic("setForeignKey")(js.Any.fromFunction1((t0: /* foreignKey */ js.UndefOr[java.lang.String]) => setForeignKey(t0).runNow()))
    if (setGetterName != null) __obj.updateDynamic("setGetterName")(js.Any.fromFunction1((t0: /* getterName */ js.UndefOr[java.lang.String]) => setGetterName(t0).runNow()))
    if (setInstanceName != null) __obj.updateDynamic("setInstanceName")(js.Any.fromFunction1((t0: /* instanceName */ js.UndefOr[js.Any]) => setInstanceName(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[js.Any]) => setName(t0).runNow()))
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(js.Any.fromFunction1((t0: /* ownerModel */ js.UndefOr[js.Any]) => setOwnerModel(t0).runNow()))
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(js.Any.fromFunction1((t0: /* ownerName */ js.UndefOr[java.lang.String]) => setOwnerName(t0).runNow()))
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(js.Any.fromFunction1((t0: /* primaryKey */ js.UndefOr[java.lang.String]) => setPrimaryKey(t0).runNow()))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1((t0: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]) => setReader(t0).runNow()))
    if (setSetterName != null) __obj.updateDynamic("setSetterName")(js.Any.fromFunction1((t0: /* setterName */ js.UndefOr[java.lang.String]) => setSetterName(t0).runNow()))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: /* type */ js.UndefOr[java.lang.String]) => setType(t0).runNow()))
    if (setterName != null) __obj.updateDynamic("setterName")(setterName.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBelongsTo]
  }
}

