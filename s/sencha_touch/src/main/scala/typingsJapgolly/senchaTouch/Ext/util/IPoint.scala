package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoint extends IBase {
  /** [Method] Copy a new instance of this point
  		* @returns Ext.util.Point The new point.
  		*/
  @JSName("clone")
  var clone_FIPoint: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Clones this Point
  		* @returns Ext.util.Point The new point.
  		*/
  var copy: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Copy the x and y values of another point  object to this point itself
  		* @param point Ext.util.Point/Object .
  		* @returns Ext.util.Point This point.
  		*/
  var copyFrom: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Compare this point and another point
  		* @param point Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties.
  		* @returns Boolean Returns whether they are equivalent.
  		*/
  @JSName("equals")
  var equals_FIPoint: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Whether the given point is not away from this point within the given threshold amount
  		* @param point Ext.util.Point/Object The point to check with, either an instance of Ext.util.Point or an object with x and y properties.
  		* @param threshold Object/Number Can be either an object with x and y properties or a number.
  		* @returns Boolean
  		*/
  var isCloseTo: js.UndefOr[
    js.Function2[/* point */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  /** [Method] Returns true if this point is close to another one
  		* @returns Boolean
  		*/
  var isWithin: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Compare this point with another point when the x and y values of both points are rounded
  		* @param point Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties.
  		* @returns Boolean
  		*/
  var roundedEquals: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns a human eye friendly string that represents this point useful for debugging
  		* @returns String For example Point[12,8].
  		*/
  @JSName("toString")
  var toString_FIPoint: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Translate this point by the given amounts
  		* @param x Number Amount to translate in the x-axis.
  		* @param y Number Amount to translate in the y-axis.
  		* @returns Boolean
  		*/
  var translate: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.undefined
}

object IPoint {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clone: js.UndefOr[CallbackTo[IPoint]] = js.undefined,
    config: js.Any = null,
    copy: js.UndefOr[CallbackTo[IPoint]] = js.undefined,
    copyFrom: /* point */ js.UndefOr[js.Any] => CallbackTo[IPoint] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    equals: /* point */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    isCloseTo: (/* point */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    isWithin: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    roundedEquals: /* point */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toString: js.UndefOr[CallbackTo[String]] = js.undefined,
    translate: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => CallbackTo[Boolean] = null,
    uses: Array = null
  ): IPoint = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clone.foreach(p => __obj.updateDynamic("clone")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    copy.foreach(p => __obj.updateDynamic("copy")(p.toJsFn))
    if (copyFrom != null) __obj.updateDynamic("copyFrom")(js.Any.fromFunction1((t0: /* point */ js.UndefOr[js.Any]) => copyFrom(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: /* point */ js.UndefOr[js.Any]) => equals(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (isCloseTo != null) __obj.updateDynamic("isCloseTo")(js.Any.fromFunction2((t0: /* point */ js.UndefOr[js.Any], t1: /* threshold */ js.UndefOr[js.Any]) => isCloseTo(t0, t1).runNow()))
    isWithin.foreach(p => __obj.updateDynamic("isWithin")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (roundedEquals != null) __obj.updateDynamic("roundedEquals")(js.Any.fromFunction1((t0: /* point */ js.UndefOr[js.Any]) => roundedEquals(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    if (translate != null) __obj.updateDynamic("translate")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => translate(t0, t1).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPoint]
  }
}

