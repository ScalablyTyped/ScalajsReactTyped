package typingsJapgolly.senchaTouch.Ext.draw.modifier

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlight extends IModifier {
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Filter modifier changes if overriding source attributes
  		* @param attr Object The source attributes.
  		* @param changes Object The modifier changes.
  		* @returns * The filtered changes.
  		*/
  var filterChanges: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of enabled
  		* @returns Boolean
  		*/
  var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of highlightStyle
  		* @returns Object
  		*/
  var getHighlightStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object) */
  var highlightStyle: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of enabled
  		* @param enabled Boolean The new value.
  		*/
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of highlightStyle
  		* @param highlightStyle Object The new value.
  		*/
  var setHighlightStyle: js.UndefOr[js.Function1[/* highlightStyle */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IHighlight {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    filterChanges: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    getEnabled: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getHighlightStyle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getNext: js.UndefOr[CallbackTo[IHighlight]] = js.undefined,
    getPrevious: js.UndefOr[CallbackTo[IHighlight]] = js.undefined,
    getSprite: js.UndefOr[CallbackTo[ISprite]] = js.undefined,
    highlightStyle: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    next: IModifier = null,
    platformConfig: js.Any = null,
    popUp: (/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => Callback = null,
    prepareAttributes: /* attr */ js.UndefOr[js.Any] => Callback = null,
    previous: IModifier = null,
    pushDown: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    self: IClass = null,
    setEnabled: /* enabled */ js.UndefOr[Boolean] => Callback = null,
    setHighlightStyle: /* highlightStyle */ js.UndefOr[js.Any] => Callback = null,
    setNext: /* next */ js.UndefOr[IHighlight] => Callback = null,
    setPrevious: /* previous */ js.UndefOr[IHighlight] => Callback = null,
    setSprite: /* sprite */ js.UndefOr[ISprite] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sprite: ISprite = null,
    statics: js.Any = null,
    uses: Array = null
  ): IHighlight = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filterChanges != null) __obj.updateDynamic("filterChanges")(js.Any.fromFunction2((t0: /* attr */ js.UndefOr[js.Any], t1: /* changes */ js.UndefOr[js.Any]) => filterChanges(t0, t1).runNow()))
    getEnabled.foreach(p => __obj.updateDynamic("getEnabled")(p.toJsFn))
    getHighlightStyle.foreach(p => __obj.updateDynamic("getHighlightStyle")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getNext.foreach(p => __obj.updateDynamic("getNext")(p.toJsFn))
    getPrevious.foreach(p => __obj.updateDynamic("getPrevious")(p.toJsFn))
    getSprite.foreach(p => __obj.updateDynamic("getSprite")(p.toJsFn))
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (popUp != null) __obj.updateDynamic("popUp")(js.Any.fromFunction2((t0: /* attributes */ js.UndefOr[js.Any], t1: /* changes */ js.UndefOr[js.Any]) => popUp(t0, t1).runNow()))
    if (prepareAttributes != null) __obj.updateDynamic("prepareAttributes")(js.Any.fromFunction1((t0: /* attr */ js.UndefOr[js.Any]) => prepareAttributes(t0).runNow()))
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (pushDown != null) __obj.updateDynamic("pushDown")(js.Any.fromFunction2((t0: /* attr */ js.UndefOr[js.Any], t1: /* changes */ js.UndefOr[js.Any]) => pushDown(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setEnabled != null) __obj.updateDynamic("setEnabled")(js.Any.fromFunction1((t0: /* enabled */ js.UndefOr[scala.Boolean]) => setEnabled(t0).runNow()))
    if (setHighlightStyle != null) __obj.updateDynamic("setHighlightStyle")(js.Any.fromFunction1((t0: /* highlightStyle */ js.UndefOr[js.Any]) => setHighlightStyle(t0).runNow()))
    if (setNext != null) __obj.updateDynamic("setNext")(js.Any.fromFunction1((t0: /* next */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.modifier.IHighlight]) => setNext(t0).runNow()))
    if (setPrevious != null) __obj.updateDynamic("setPrevious")(js.Any.fromFunction1((t0: /* previous */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.modifier.IHighlight]) => setPrevious(t0).runNow()))
    if (setSprite != null) __obj.updateDynamic("setSprite")(js.Any.fromFunction1((t0: /* sprite */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.sprite.ISprite]) => setSprite(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighlight]
  }
}

