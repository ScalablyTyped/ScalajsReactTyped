package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegion extends IBase {
  /** [Method] Modifies the current region to be adjusted by offsets
  		* @param top Number Top offset
  		* @param right Number Right offset
  		* @param bottom Number Bottom offset
  		* @param left Number Left offset
  		* @returns Ext.util.Region this
  		*/
  var adjust: js.UndefOr[
    js.Function4[
      /* top */ js.UndefOr[Double], 
      /* right */ js.UndefOr[Double], 
      /* bottom */ js.UndefOr[Double], 
      /* left */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Modifies the current region to be constrained to the targetRegion
  		* @param targetRegion Ext.util.Region
  		* @returns Ext.util.Region this
  		*/
  var constrainTo: js.UndefOr[js.Function1[/* targetRegion */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Checks if this region completely contains the region that is passed in
  		* @param region Ext.util.Region
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.undefined
  /** [Method] Copy a new instance
  		* @returns Ext.util.Region
  		*/
  var copy: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Check whether this region is equivalent to the given region
  		* @param region Ext.util.Region The region to compare with.
  		* @returns Boolean
  		*/
  @JSName("equals")
  var equals_FIRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.undefined
  /** [Method] Get the offset amount of a point outside the region
  		* @param axis String/Object optional.
  		* @param p Ext.util.Point The point.
  		* @returns Ext.util.Region
  		*/
  var getOutOfBoundOffset: js.UndefOr[
    js.Function2[/* axis */ js.UndefOr[js.Any], /* p */ js.UndefOr[IPoint], this.type]
  ] = js.undefined
  /** [Method] Get the offset amount on the x axis
  		* @param p Number The offset.
  		* @returns Number
  		*/
  var getOutOfBoundOffsetX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Get the offset amount on the y axis
  		* @param p Number The offset.
  		* @returns Number
  		*/
  var getOutOfBoundOffsetY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Checks if this region intersects the region passed in
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region/Boolean Returns the intersected region or false if there is no intersection.
  		*/
  var intersect: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], _]] = js.undefined
  /** [Method] Check whether the point  offset is out of bounds
  		* @param axis String optional
  		* @param p Ext.util.Point/Number The point / offset.
  		* @returns Boolean
  		*/
  var isOutOfBound: js.UndefOr[js.Function2[/* axis */ js.UndefOr[String], /* p */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Check whether the offset is out of bound in the x axis
  		* @param p Number The offset.
  		* @returns Boolean
  		*/
  var isOutOfBoundX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.undefined
  /** [Method] Check whether the offset is out of bound in the y axis
  		* @param p Number The offset.
  		* @returns Boolean
  		*/
  var isOutOfBoundY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.undefined
  /** [Method] Round all the properties of this region
  		* @returns Ext.util.Region This Region.
  		*/
  var round: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Dump this to an eye friendly string great for debugging
  		* @returns String For example Region[0,1,3,2].
  		*/
  @JSName("toString")
  var toString_FIRegion: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Translate this region by the given offset amount
  		* @param offset Object
  		* @returns Ext.util.Region This Region.
  		*/
  var translateBy: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Returns the smallest region that contains the current AND targetRegion
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region
  		*/
  var union: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], this.type]] = js.undefined
}

object IRegion {
  @scala.inline
  def apply(
    adjust: (/* top */ js.UndefOr[Double], /* right */ js.UndefOr[Double], /* bottom */ js.UndefOr[Double], /* left */ js.UndefOr[Double]) => CallbackTo[IRegion] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    constrainTo: /* targetRegion */ js.UndefOr[IRegion] => CallbackTo[IRegion] = null,
    contains: /* region */ js.UndefOr[IRegion] => CallbackTo[Boolean] = null,
    copy: js.UndefOr[CallbackTo[IRegion]] = js.undefined,
    destroy: js.UndefOr[Callback] = js.undefined,
    equals: /* region */ js.UndefOr[IRegion] => CallbackTo[Boolean] = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getOutOfBoundOffset: (/* axis */ js.UndefOr[js.Any], /* p */ js.UndefOr[IPoint]) => CallbackTo[IRegion] = null,
    getOutOfBoundOffsetX: /* p */ js.UndefOr[Double] => CallbackTo[Double] = null,
    getOutOfBoundOffsetY: /* p */ js.UndefOr[Double] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    intersect: /* region */ js.UndefOr[IRegion] => CallbackTo[js.Any] = null,
    isOutOfBound: (/* axis */ js.UndefOr[String], /* p */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    isOutOfBoundX: /* p */ js.UndefOr[Double] => CallbackTo[Boolean] = null,
    isOutOfBoundY: /* p */ js.UndefOr[Double] => CallbackTo[Boolean] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    round: js.UndefOr[CallbackTo[IRegion]] = js.undefined,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toString: js.UndefOr[CallbackTo[String]] = js.undefined,
    translateBy: /* offset */ js.UndefOr[js.Any] => CallbackTo[IRegion] = null,
    union: /* region */ js.UndefOr[IRegion] => CallbackTo[IRegion] = null,
    uses: Array = null
  ): IRegion = {
    val __obj = js.Dynamic.literal()
    if (adjust != null) __obj.updateDynamic("adjust")(js.Any.fromFunction4((t0: /* top */ js.UndefOr[scala.Double], t1: /* right */ js.UndefOr[scala.Double], t2: /* bottom */ js.UndefOr[scala.Double], t3: /* left */ js.UndefOr[scala.Double]) => adjust(t0, t1, t2, t3).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction1((t0: /* targetRegion */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IRegion]) => constrainTo(t0).runNow()))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IRegion]) => contains(t0).runNow()))
    copy.foreach(p => __obj.updateDynamic("copy")(p.toJsFn))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IRegion]) => equals(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getOutOfBoundOffset != null) __obj.updateDynamic("getOutOfBoundOffset")(js.Any.fromFunction2((t0: /* axis */ js.UndefOr[js.Any], t1: /* p */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IPoint]) => getOutOfBoundOffset(t0, t1).runNow()))
    if (getOutOfBoundOffsetX != null) __obj.updateDynamic("getOutOfBoundOffsetX")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[scala.Double]) => getOutOfBoundOffsetX(t0).runNow()))
    if (getOutOfBoundOffsetY != null) __obj.updateDynamic("getOutOfBoundOffsetY")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[scala.Double]) => getOutOfBoundOffsetY(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (intersect != null) __obj.updateDynamic("intersect")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IRegion]) => intersect(t0).runNow()))
    if (isOutOfBound != null) __obj.updateDynamic("isOutOfBound")(js.Any.fromFunction2((t0: /* axis */ js.UndefOr[java.lang.String], t1: /* p */ js.UndefOr[js.Any]) => isOutOfBound(t0, t1).runNow()))
    if (isOutOfBoundX != null) __obj.updateDynamic("isOutOfBoundX")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[scala.Double]) => isOutOfBoundX(t0).runNow()))
    if (isOutOfBoundY != null) __obj.updateDynamic("isOutOfBoundY")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[scala.Double]) => isOutOfBoundY(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    round.foreach(p => __obj.updateDynamic("round")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    if (translateBy != null) __obj.updateDynamic("translateBy")(js.Any.fromFunction1((t0: /* offset */ js.UndefOr[js.Any]) => translateBy(t0).runNow()))
    if (union != null) __obj.updateDynamic("union")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IRegion]) => union(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegion]
  }
}

