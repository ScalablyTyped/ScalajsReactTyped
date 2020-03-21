package typingsJapgolly.senchaTouch.Ext.draw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor extends IBase {
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1).
  		* @returns Ext.draw.Color
  		*/
  var createDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1).
  		* @returns Ext.draw.Color
  		*/
  var createLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the equivalent HSL components of the color
  		* @param target Array Optional array to receive the values.
  		* @returns Array
  		*/
  var getHSL: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Array]] = js.undefined
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[Double] = js.undefined
  /** [Method] Parse the string and set current color
  		* @param str String Color in string.
  		* @returns Object this
  		*/
  var setFromString: js.UndefOr[js.Function1[/* str */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Set current color based on the specified HSL values
  		* @param h Number Hue component (0..359)
  		* @param s Number Saturation component (0..1)
  		* @param l Number Lightness component (0..1)
  		* @returns Object this
  		*/
  var setHSL: js.UndefOr[
    js.Function3[/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double], _]
  ] = js.undefined
  /** [Method] Convert a color to hexadecimal format
  		* @param color String/Array The color value (i.e 'rgb(255, 255, 255)', 'color: #ffffff'). Can also be an Array, in this case the function handles the first member.
  		* @returns String The color in hexadecimal format.
  		*/
  var toHex: js.UndefOr[js.Function1[/* color */ js.UndefOr[js.Any], String]] = js.undefined
  /** [Method] Return the color in the hex format i e
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[String]] = js.undefined
}

object IColor {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    createDarker: /* factor */ js.UndefOr[Double] => CallbackTo[IColor] = null,
    createLighter: /* factor */ js.UndefOr[Double] => CallbackTo[IColor] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getGrayscale: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getHSL: /* target */ js.UndefOr[Array] => CallbackTo[Array] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    lightnessFactor: Int | Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setFromString: /* str */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    setHSL: (/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toHex: /* color */ js.UndefOr[js.Any] => CallbackTo[String] = null,
    toString: js.UndefOr[CallbackTo[String]] = js.undefined,
    uses: Array = null
  ): IColor = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (createDarker != null) __obj.updateDynamic("createDarker")(js.Any.fromFunction1((t0: /* factor */ js.UndefOr[scala.Double]) => createDarker(t0).runNow()))
    if (createLighter != null) __obj.updateDynamic("createLighter")(js.Any.fromFunction1((t0: /* factor */ js.UndefOr[scala.Double]) => createLighter(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getGrayscale.foreach(p => __obj.updateDynamic("getGrayscale")(p.toJsFn))
    if (getHSL != null) __obj.updateDynamic("getHSL")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => getHSL(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (lightnessFactor != null) __obj.updateDynamic("lightnessFactor")(lightnessFactor.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFromString != null) __obj.updateDynamic("setFromString")(js.Any.fromFunction1((t0: /* str */ js.UndefOr[java.lang.String]) => setFromString(t0).runNow()))
    if (setHSL != null) __obj.updateDynamic("setHSL")(js.Any.fromFunction3((t0: /* h */ js.UndefOr[scala.Double], t1: /* s */ js.UndefOr[scala.Double], t2: /* l */ js.UndefOr[scala.Double]) => setHSL(t0, t1, t2).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (toHex != null) __obj.updateDynamic("toHex")(js.Any.fromFunction1((t0: /* color */ js.UndefOr[js.Any]) => toHex(t0).runNow()))
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor]
  }
}

