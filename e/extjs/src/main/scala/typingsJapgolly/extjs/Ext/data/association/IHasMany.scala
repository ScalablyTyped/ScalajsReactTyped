package typingsJapgolly.extjs.Ext.data.association

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.data.reader.IReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHasMany extends IAssociation {
  /** [Config Option] (Boolean) */
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var filterProperty: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}

object IHasMany {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    associatedModel: String = null,
    associatedName: String = null,
    associationKey: String = null,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    filterProperty: String = null,
    foreignKey: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getReader: js.UndefOr[CallbackTo[IReader]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IHasMany] = null,
    mixins: js.Any = null,
    model: String = null,
    name: String = null,
    ownerModel: String = null,
    ownerName: String = null,
    primaryKey: String = null,
    reader: IReader = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    storeConfig: js.Any = null,
    `type`: String = null,
    uses: Array = null
  ): IHasMany = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel.asInstanceOf[js.Any])
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName.asInstanceOf[js.Any])
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filterProperty != null) __obj.updateDynamic("filterProperty")(filterProperty.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getReader.foreach(p => __obj.updateDynamic("getReader")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel.asInstanceOf[js.Any])
    if (ownerName != null) __obj.updateDynamic("ownerName")(ownerName.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (storeConfig != null) __obj.updateDynamic("storeConfig")(storeConfig.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHasMany]
  }
}

