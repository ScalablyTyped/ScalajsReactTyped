package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoint extends IRegion {
  /** [Method] Compare this point and another point
  		* @param p Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with left and top properties
  		* @returns Boolean Returns whether they are equivalent
  		*/
  @JSName("equals")
  var equals_FIPoint: js.UndefOr[js.Function1[/* p */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Determins whether this Point contained by the passed Region Component or element
  		* @param region Ext.util.Region/Ext.Component/Ext.dom.Element/HTMLElement The rectangle to check that this Point is within.
  		* @returns Boolean
  		*/
  var isContainedBy: js.UndefOr[js.Function1[/* region */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Whether the given point is not away from this point within the given threshold amount
  		* @param p Ext.util.Point/Object The point to check with, either an instance of Ext.util.Point or an object with left and top properties
  		* @param threshold Object/Number Can be either an object with x and y properties or a number
  		* @returns Boolean
  		*/
  var isWithin: js.UndefOr[
    js.Function2[/* p */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  /** [Method] Compare this point with another point when the x and y values of both points are rounded
  		* @param p Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties
  		* @returns Boolean
  		*/
  var roundedEquals: js.UndefOr[js.Function1[/* p */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns a human eye friendly string that represents this point useful for debugging
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIPoint: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Alias for translateBy
  		* @param x Ext.util.Offset/Object Object containing the x and y properties. Or the x value is using the two argument form.
  		* @param y Number The y value unless using an Offset object.
  		* @returns Ext.util.Region this This Region
  		*/
  var translate: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], IRegion]] = js.undefined
}

object IPoint {
  @scala.inline
  def apply(
    adjust: (/* top */ js.UndefOr[Double], /* right */ js.UndefOr[Double], /* bottom */ js.UndefOr[Double], /* left */ js.UndefOr[Double]) => CallbackTo[IPoint] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    constrainTo: /* targetRegion */ js.UndefOr[IPoint] => CallbackTo[IPoint] = null,
    contains: /* region */ js.UndefOr[IPoint] => CallbackTo[Boolean] = null,
    copy: js.UndefOr[CallbackTo[IPoint]] = js.undefined,
    copyFrom: /* p */ js.UndefOr[IPoint] => CallbackTo[IPoint] = null,
    equals: /* p */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getOutOfBoundOffset: (/* axis */ js.UndefOr[String], /* p */ js.UndefOr[IPoint]) => CallbackTo[IOffset] = null,
    getOutOfBoundOffsetX: /* p */ js.UndefOr[Double] => CallbackTo[Double] = null,
    getOutOfBoundOffsetY: /* p */ js.UndefOr[Double] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IPoint] = null,
    intersect: /* region */ js.UndefOr[IPoint] => CallbackTo[js.Any] = null,
    isContainedBy: /* region */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isOutOfBound: (/* axis */ js.UndefOr[String], /* p */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    isOutOfBoundX: /* p */ js.UndefOr[Double] => CallbackTo[Boolean] = null,
    isOutOfBoundY: /* p */ js.UndefOr[Double] => CallbackTo[Boolean] = null,
    isWithin: (/* p */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    mixins: js.Any = null,
    requires: Array = null,
    round: js.UndefOr[CallbackTo[IPoint]] = js.undefined,
    roundedEquals: /* p */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toString: js.UndefOr[CallbackTo[String]] = js.undefined,
    translate: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => CallbackTo[IRegion] = null,
    translateBy: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => CallbackTo[IPoint] = null,
    union: /* region */ js.UndefOr[IPoint] => CallbackTo[IPoint] = null,
    uses: Array = null
  ): IPoint = {
    val __obj = js.Dynamic.literal()
    if (adjust != null) __obj.updateDynamic("adjust")(js.Any.fromFunction4((t0: /* top */ js.UndefOr[scala.Double], t1: /* right */ js.UndefOr[scala.Double], t2: /* bottom */ js.UndefOr[scala.Double], t3: /* left */ js.UndefOr[scala.Double]) => adjust(t0, t1, t2, t3).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction1((t0: /* targetRegion */ js.UndefOr[typingsJapgolly.extjs.Ext.util.IPoint]) => constrainTo(t0).runNow()))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[typingsJapgolly.extjs.Ext.util.IPoint]) => contains(t0).runNow()))
    copy.foreach(p => __obj.updateDynamic("copy")(p.toJsFn))
    if (copyFrom != null) __obj.updateDynamic("copyFrom")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[typingsJapgolly.extjs.Ext.util.IPoint]) => copyFrom(t0).runNow()))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[js.Any]) => equals(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getOutOfBoundOffset != null) __obj.updateDynamic("getOutOfBoundOffset")(js.Any.fromFunction2((t0: /* axis */ js.UndefOr[java.lang.String], t1: /* p */ js.UndefOr[typingsJapgolly.extjs.Ext.util.IPoint]) => getOutOfBoundOffset(t0, t1).runNow()))
    if (getOutOfBoundOffsetX != null) __obj.updateDynamic("getOutOfBoundOffsetX")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[scala.Double]) => getOutOfBoundOffsetX(t0).runNow()))
    if (getOutOfBoundOffsetY != null) __obj.updateDynamic("getOutOfBoundOffsetY")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[scala.Double]) => getOutOfBoundOffsetY(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (intersect != null) __obj.updateDynamic("intersect")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[typingsJapgolly.extjs.Ext.util.IPoint]) => intersect(t0).runNow()))
    if (isContainedBy != null) __obj.updateDynamic("isContainedBy")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[js.Any]) => isContainedBy(t0).runNow()))
    if (isOutOfBound != null) __obj.updateDynamic("isOutOfBound")(js.Any.fromFunction2((t0: /* axis */ js.UndefOr[java.lang.String], t1: /* p */ js.UndefOr[js.Any]) => isOutOfBound(t0, t1).runNow()))
    if (isOutOfBoundX != null) __obj.updateDynamic("isOutOfBoundX")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[scala.Double]) => isOutOfBoundX(t0).runNow()))
    if (isOutOfBoundY != null) __obj.updateDynamic("isOutOfBoundY")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[scala.Double]) => isOutOfBoundY(t0).runNow()))
    if (isWithin != null) __obj.updateDynamic("isWithin")(js.Any.fromFunction2((t0: /* p */ js.UndefOr[js.Any], t1: /* threshold */ js.UndefOr[js.Any]) => isWithin(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    round.foreach(p => __obj.updateDynamic("round")(p.toJsFn))
    if (roundedEquals != null) __obj.updateDynamic("roundedEquals")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[js.Any]) => roundedEquals(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    if (translate != null) __obj.updateDynamic("translate")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double]) => translate(t0, t1).runNow()))
    if (translateBy != null) __obj.updateDynamic("translateBy")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double]) => translateBy(t0, t1).runNow()))
    if (union != null) __obj.updateDynamic("union")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[typingsJapgolly.extjs.Ext.util.IPoint]) => union(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPoint]
  }
}

