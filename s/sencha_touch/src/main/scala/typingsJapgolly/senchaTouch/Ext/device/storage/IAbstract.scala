package typingsJapgolly.senchaTouch.Ext.device.storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract extends IBase {
  /** [Method] Returns the value of databaseDisplayName
  		* @returns String
  		*/
  var getDatabaseDisplayName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of databaseName
  		* @returns String
  		*/
  var getDatabaseName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of databaseSize
  		* @returns Object
  		*/
  var getDatabaseSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of databaseVersion
  		* @returns String
  		*/
  var getDatabaseVersion: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Sets the value of databaseDisplayName
  		* @param databaseDisplayName String The new value.
  		*/
  var setDatabaseDisplayName: js.UndefOr[js.Function1[/* databaseDisplayName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of databaseName
  		* @param databaseName String The new value.
  		*/
  var setDatabaseName: js.UndefOr[js.Function1[/* databaseName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of databaseSize
  		* @param databaseSize Object The new value.
  		*/
  var setDatabaseSize: js.UndefOr[js.Function1[/* databaseSize */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of databaseVersion
  		* @param databaseVersion String The new value.
  		*/
  var setDatabaseVersion: js.UndefOr[js.Function1[/* databaseVersion */ js.UndefOr[String], Unit]] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getDatabaseDisplayName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDatabaseName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDatabaseSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDatabaseVersion: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setDatabaseDisplayName: /* databaseDisplayName */ js.UndefOr[String] => Callback = null,
    setDatabaseName: /* databaseName */ js.UndefOr[String] => Callback = null,
    setDatabaseSize: /* databaseSize */ js.UndefOr[js.Any] => Callback = null,
    setDatabaseVersion: /* databaseVersion */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getDatabaseDisplayName.foreach(p => __obj.updateDynamic("getDatabaseDisplayName")(p.toJsFn))
    getDatabaseName.foreach(p => __obj.updateDynamic("getDatabaseName")(p.toJsFn))
    getDatabaseSize.foreach(p => __obj.updateDynamic("getDatabaseSize")(p.toJsFn))
    getDatabaseVersion.foreach(p => __obj.updateDynamic("getDatabaseVersion")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDatabaseDisplayName != null) __obj.updateDynamic("setDatabaseDisplayName")(js.Any.fromFunction1((t0: /* databaseDisplayName */ js.UndefOr[java.lang.String]) => setDatabaseDisplayName(t0).runNow()))
    if (setDatabaseName != null) __obj.updateDynamic("setDatabaseName")(js.Any.fromFunction1((t0: /* databaseName */ js.UndefOr[java.lang.String]) => setDatabaseName(t0).runNow()))
    if (setDatabaseSize != null) __obj.updateDynamic("setDatabaseSize")(js.Any.fromFunction1((t0: /* databaseSize */ js.UndefOr[js.Any]) => setDatabaseSize(t0).runNow()))
    if (setDatabaseVersion != null) __obj.updateDynamic("setDatabaseVersion")(js.Any.fromFunction1((t0: /* databaseVersion */ js.UndefOr[java.lang.String]) => setDatabaseVersion(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstract]
  }
}

