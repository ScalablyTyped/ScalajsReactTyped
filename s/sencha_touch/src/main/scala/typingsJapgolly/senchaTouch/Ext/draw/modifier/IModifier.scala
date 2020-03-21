package typingsJapgolly.senchaTouch.Ext.draw.modifier

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModifier extends IBase {
  /** [Method] Returns the value of next
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getNext: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of previous
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getPrevious: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of sprite
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var getSprite: js.UndefOr[js.Function0[ISprite]] = js.undefined
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var next: js.UndefOr[IModifier] = js.undefined
  /** [Method] Invoked when changes need to be popped up to the top
  		* @param attributes Object The source attributes.
  		* @param changes Object The changes to be popped up.
  		*/
  var popUp: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Validate attribute set before use
  		* @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
  		*/
  var prepareAttributes: js.UndefOr[js.Function1[/* attr */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var previous: js.UndefOr[IModifier] = js.undefined
  /** [Method] Invoked when changes need to be pushed down to the sprite
  		* @param attr Object The source attributes.
  		* @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
  		* @returns Mixed
  		*/
  var pushDown: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of next
  		* @param next Ext.draw.modifier.Modifier The new value.
  		*/
  var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], Unit]] = js.undefined
  /** [Method] Sets the value of previous
  		* @param previous Ext.draw.modifier.Modifier The new value.
  		*/
  var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], Unit]] = js.undefined
  /** [Method] Sets the value of sprite
  		* @param sprite Ext.draw.sprite.Sprite The new value.
  		*/
  var setSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.undefined
  /** [Config Option] (Ext.draw.sprite.Sprite) */
  var sprite: js.UndefOr[ISprite] = js.undefined
}

object IModifier {
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
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getNext: js.UndefOr[CallbackTo[IModifier]] = js.undefined,
    getPrevious: js.UndefOr[CallbackTo[IModifier]] = js.undefined,
    getSprite: js.UndefOr[CallbackTo[ISprite]] = js.undefined,
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
    setNext: /* next */ js.UndefOr[IModifier] => Callback = null,
    setPrevious: /* previous */ js.UndefOr[IModifier] => Callback = null,
    setSprite: /* sprite */ js.UndefOr[ISprite] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sprite: ISprite = null,
    statics: js.Any = null,
    uses: Array = null
  ): IModifier = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getNext.foreach(p => __obj.updateDynamic("getNext")(p.toJsFn))
    getPrevious.foreach(p => __obj.updateDynamic("getPrevious")(p.toJsFn))
    getSprite.foreach(p => __obj.updateDynamic("getSprite")(p.toJsFn))
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
    if (setNext != null) __obj.updateDynamic("setNext")(js.Any.fromFunction1((t0: /* next */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.modifier.IModifier]) => setNext(t0).runNow()))
    if (setPrevious != null) __obj.updateDynamic("setPrevious")(js.Any.fromFunction1((t0: /* previous */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.modifier.IModifier]) => setPrevious(t0).runNow()))
    if (setSprite != null) __obj.updateDynamic("setSprite")(js.Any.fromFunction1((t0: /* sprite */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.sprite.ISprite]) => setSprite(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModifier]
  }
}

