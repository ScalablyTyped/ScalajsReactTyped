package typingsJapgolly.senchaTouch.Ext.env

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.IVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowser extends IBase {
  /** [Property] (String) */
  var engineName: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Version) */
  var engineVersion: js.UndefOr[IVersion] = js.undefined
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
  		* @param value String The OS name to check.
  		* @returns Boolean
  		*/
  var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isSecure: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isStrict: js.UndefOr[Boolean] = js.undefined
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var userAgent: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Version) */
  var version: js.UndefOr[IVersion] = js.undefined
}

object IBrowser {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    engineName: String = null,
    engineVersion: IVersion = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    is: /* value */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    isStrict: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    name: String = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    userAgent: String = null,
    uses: Array = null,
    version: IVersion = null
  ): IBrowser = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (engineName != null) __obj.updateDynamic("engineName")(engineName.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => is(t0).runNow()))
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.asInstanceOf[js.Any])
    if (!js.isUndefined(isStrict)) __obj.updateDynamic("isStrict")(isStrict.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowser]
  }
}

