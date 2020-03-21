package typingsJapgolly.senchaTouch.Ext.draw.sprite

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttributeDefinition extends IBase {
  /** [Config Option] (Object) */
  var aliases: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var animationProcessors: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var dirty: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of aliases
  		* @returns Object
  		*/
  var getAliases: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of animationProcessors
  		* @returns Object
  		*/
  var getAnimationProcessors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of processors
  		* @returns Object
  		*/
  var getProcessors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of updaters
  		* @returns Object
  		*/
  var getUpdaters: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Normalizes the changes given via their processors before they are applied as attributes
  		* @param changes Object The changes given.
  		* @returns Object The normalized values.
  		*/
  var normalize: js.UndefOr[js.Function1[/* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Object) */
  var processors: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of aliases
  		* @param aliases Object The new value.
  		*/
  var setAliases: js.UndefOr[js.Function1[/* aliases */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of animationProcessors
  		* @param animationProcessors Object The new value.
  		*/
  var setAnimationProcessors: js.UndefOr[js.Function1[/* animationProcessors */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of processors
  		* @param processors Object The new value.
  		*/
  var setProcessors: js.UndefOr[js.Function1[/* processors */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of updaters
  		* @param updaters Object The new value.
  		*/
  var setUpdaters: js.UndefOr[js.Function1[/* updaters */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var updaters: js.UndefOr[js.Any] = js.undefined
}

object IAttributeDefinition {
  @scala.inline
  def apply(
    alias: Array = null,
    aliases: js.Any = null,
    alternateClassName: js.Any = null,
    animationProcessors: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    defaults: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dirty: js.Any = null,
    extend: String = null,
    getAliases: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getAnimationProcessors: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDefaults: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getProcessors: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getUpdaters: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    normalize: /* changes */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    platformConfig: js.Any = null,
    processors: js.Any = null,
    self: IClass = null,
    setAliases: /* aliases */ js.UndefOr[js.Any] => Callback = null,
    setAnimationProcessors: /* animationProcessors */ js.UndefOr[js.Any] => Callback = null,
    setDefaults: /* defaults */ js.UndefOr[js.Any] => Callback = null,
    setProcessors: /* processors */ js.UndefOr[js.Any] => Callback = null,
    setUpdaters: /* updaters */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    updaters: js.Any = null,
    uses: Array = null
  ): IAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (animationProcessors != null) __obj.updateDynamic("animationProcessors")(animationProcessors.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dirty != null) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAliases.foreach(p => __obj.updateDynamic("getAliases")(p.toJsFn))
    getAnimationProcessors.foreach(p => __obj.updateDynamic("getAnimationProcessors")(p.toJsFn))
    getDefaults.foreach(p => __obj.updateDynamic("getDefaults")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getProcessors.foreach(p => __obj.updateDynamic("getProcessors")(p.toJsFn))
    getUpdaters.foreach(p => __obj.updateDynamic("getUpdaters")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1((t0: /* changes */ js.UndefOr[js.Any]) => normalize(t0).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAliases != null) __obj.updateDynamic("setAliases")(js.Any.fromFunction1((t0: /* aliases */ js.UndefOr[js.Any]) => setAliases(t0).runNow()))
    if (setAnimationProcessors != null) __obj.updateDynamic("setAnimationProcessors")(js.Any.fromFunction1((t0: /* animationProcessors */ js.UndefOr[js.Any]) => setAnimationProcessors(t0).runNow()))
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(js.Any.fromFunction1((t0: /* defaults */ js.UndefOr[js.Any]) => setDefaults(t0).runNow()))
    if (setProcessors != null) __obj.updateDynamic("setProcessors")(js.Any.fromFunction1((t0: /* processors */ js.UndefOr[js.Any]) => setProcessors(t0).runNow()))
    if (setUpdaters != null) __obj.updateDynamic("setUpdaters")(js.Any.fromFunction1((t0: /* updaters */ js.UndefOr[js.Any]) => setUpdaters(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (updaters != null) __obj.updateDynamic("updaters")(updaters.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttributeDefinition]
  }
}

