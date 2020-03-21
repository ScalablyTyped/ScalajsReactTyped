package typingsJapgolly.extjs.Ext.draw

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor extends IBase {
  /** [Method] Get the blue component of the color in the range 0 255
  		* @returns Number
  		*/
  var getBlue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the green component of the color in the range 0 255
  		* @returns Number
  		*/
  var getGreen: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the equivalent HSL components of the color
  		* @returns Number[]
  		*/
  var getHSL: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Get the RGB values
  		* @returns Number[]
  		*/
  var getRGB: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Get the red component of the color in the range 0 255
  		* @returns Number
  		*/
  var getRed: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[Double] = js.undefined
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
    extend: String = null,
    getBlue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getDarker: /* factor */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    getGrayscale: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getGreen: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getHSL: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLighter: /* factor */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    getRGB: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getRed: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IColor] = null,
    lightnessFactor: Int | Double = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
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
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getBlue.foreach(p => __obj.updateDynamic("getBlue")(p.toJsFn))
    if (getDarker != null) __obj.updateDynamic("getDarker")(js.Any.fromFunction1((t0: /* factor */ js.UndefOr[scala.Double]) => getDarker(t0).runNow()))
    getGrayscale.foreach(p => __obj.updateDynamic("getGrayscale")(p.toJsFn))
    getGreen.foreach(p => __obj.updateDynamic("getGreen")(p.toJsFn))
    getHSL.foreach(p => __obj.updateDynamic("getHSL")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getLighter != null) __obj.updateDynamic("getLighter")(js.Any.fromFunction1((t0: /* factor */ js.UndefOr[scala.Double]) => getLighter(t0).runNow()))
    getRGB.foreach(p => __obj.updateDynamic("getRGB")(p.toJsFn))
    getRed.foreach(p => __obj.updateDynamic("getRed")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (lightnessFactor != null) __obj.updateDynamic("lightnessFactor")(lightnessFactor.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor]
  }
}

