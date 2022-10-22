package typingsJapgolly.senchaTouch.Ext.chart.series

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGauge
  extends StObject
     with ISeries {
  
  /** [Config Option] (String) */
  var angleField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var donut: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of angleField
    * @returns String
    */
  var getAngleField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of center
    * @returns Array
    */
  var getCenter: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of donut
    * @returns Number
    */
  var getDonut: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of field
    * @returns String
    */
  var getField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of maximum
    * @returns Number
    */
  var getMaximum: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of minimum
    * @returns Number
    */
  var getMinimum: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of needle
    * @returns Boolean
    */
  var getNeedle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of needleLength
    * @returns Number
    */
  var getNeedleLength: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of needleLengthRatio
    * @returns Number
    */
  var getNeedleLengthRatio: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of needleWidth
    * @returns Number
    */
  var getNeedleWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of radius
    * @returns Number
    */
  var getRadius: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of region
    * @returns Array
    */
  var getRegion: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of rotation
    * @returns Number
    */
  var getRotation: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of sectors
    * @returns Array
    */
  var getSectors: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of totalAngle
    * @returns Object
    */
  var getTotalAngle: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of value
    * @returns Number
    */
  var getValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of wholeDisk
    * @returns Boolean
    */
  var getWholeDisk: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var needle: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var needleLength: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var needleLengthRatio: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var needleWidth: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Array) */
  var sectors: js.UndefOr[Array] = js.undefined
  
  /** [Method] Sets the value of angleField
    * @param angleField String The new value.
    */
  var setAngleField: js.UndefOr[js.Function1[/* angleField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of center
    * @param center Array The new value.
    */
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of donut
    * @param donut Number The new value.
    */
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of field
    * @param field String The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of maximum
    * @param maximum Number The new value.
    */
  var setMaximum: js.UndefOr[js.Function1[/* maximum */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of minimum
    * @param minimum Number The new value.
    */
  var setMinimum: js.UndefOr[js.Function1[/* minimum */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of needle
    * @param needle Boolean The new value.
    */
  var setNeedle: js.UndefOr[js.Function1[/* needle */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of needleLength
    * @param needleLength Number The new value.
    */
  var setNeedleLength: js.UndefOr[js.Function1[/* needleLength */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of needleLengthRatio
    * @param needleLengthRatio Number The new value.
    */
  var setNeedleLengthRatio: js.UndefOr[js.Function1[/* needleLengthRatio */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of needleWidth
    * @param needleWidth Number The new value.
    */
  var setNeedleWidth: js.UndefOr[js.Function1[/* needleWidth */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of radius
    * @param radius Number The new value.
    */
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of region
    * @param region Array The new value.
    */
  var setRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of rotation
    * @param rotation Number The new value.
    */
  var setRotation: js.UndefOr[js.Function1[/* rotation */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of sectors
    * @param sectors Array The new value.
    */
  var setSectors: js.UndefOr[js.Function1[/* sectors */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of totalAngle
    * @param totalAngle Object The new value.
    */
  var setTotalAngle: js.UndefOr[js.Function1[/* totalAngle */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of value
    * @param value Number The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of wholeDisk
    * @param wholeDisk Boolean The new value.
    */
  var setWholeDisk: js.UndefOr[js.Function1[/* wholeDisk */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var wholeDisk: js.UndefOr[Boolean] = js.undefined
}
object IGauge {
  
  inline def apply(): IGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGauge]
  }
  
  extension [Self <: IGauge](x: Self) {
    
    inline def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
    
    inline def setAngleFieldUndefined: Self = StObject.set(x, "angleField", js.undefined)
    
    inline def setDonut(value: Double): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
    
    inline def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGetAngleField(value: CallbackTo[String]): Self = StObject.set(x, "getAngleField", value.toJsFn)
    
    inline def setGetAngleFieldUndefined: Self = StObject.set(x, "getAngleField", js.undefined)
    
    inline def setGetCenter(value: CallbackTo[Array]): Self = StObject.set(x, "getCenter", value.toJsFn)
    
    inline def setGetCenterUndefined: Self = StObject.set(x, "getCenter", js.undefined)
    
    inline def setGetDonut(value: CallbackTo[Double]): Self = StObject.set(x, "getDonut", value.toJsFn)
    
    inline def setGetDonutUndefined: Self = StObject.set(x, "getDonut", js.undefined)
    
    inline def setGetField(value: CallbackTo[String]): Self = StObject.set(x, "getField", value.toJsFn)
    
    inline def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
    
    inline def setGetMaximum(value: CallbackTo[Double]): Self = StObject.set(x, "getMaximum", value.toJsFn)
    
    inline def setGetMaximumUndefined: Self = StObject.set(x, "getMaximum", js.undefined)
    
    inline def setGetMinimum(value: CallbackTo[Double]): Self = StObject.set(x, "getMinimum", value.toJsFn)
    
    inline def setGetMinimumUndefined: Self = StObject.set(x, "getMinimum", js.undefined)
    
    inline def setGetNeedle(value: CallbackTo[Boolean]): Self = StObject.set(x, "getNeedle", value.toJsFn)
    
    inline def setGetNeedleLength(value: CallbackTo[Double]): Self = StObject.set(x, "getNeedleLength", value.toJsFn)
    
    inline def setGetNeedleLengthRatio(value: CallbackTo[Double]): Self = StObject.set(x, "getNeedleLengthRatio", value.toJsFn)
    
    inline def setGetNeedleLengthRatioUndefined: Self = StObject.set(x, "getNeedleLengthRatio", js.undefined)
    
    inline def setGetNeedleLengthUndefined: Self = StObject.set(x, "getNeedleLength", js.undefined)
    
    inline def setGetNeedleUndefined: Self = StObject.set(x, "getNeedle", js.undefined)
    
    inline def setGetNeedleWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getNeedleWidth", value.toJsFn)
    
    inline def setGetNeedleWidthUndefined: Self = StObject.set(x, "getNeedleWidth", js.undefined)
    
    inline def setGetRadius(value: CallbackTo[Double]): Self = StObject.set(x, "getRadius", value.toJsFn)
    
    inline def setGetRadiusUndefined: Self = StObject.set(x, "getRadius", js.undefined)
    
    inline def setGetRegion(value: CallbackTo[Array]): Self = StObject.set(x, "getRegion", value.toJsFn)
    
    inline def setGetRegionUndefined: Self = StObject.set(x, "getRegion", js.undefined)
    
    inline def setGetRotation(value: CallbackTo[Double]): Self = StObject.set(x, "getRotation", value.toJsFn)
    
    inline def setGetRotationUndefined: Self = StObject.set(x, "getRotation", js.undefined)
    
    inline def setGetSectors(value: CallbackTo[Array]): Self = StObject.set(x, "getSectors", value.toJsFn)
    
    inline def setGetSectorsUndefined: Self = StObject.set(x, "getSectors", js.undefined)
    
    inline def setGetTotalAngle(value: CallbackTo[Any]): Self = StObject.set(x, "getTotalAngle", value.toJsFn)
    
    inline def setGetTotalAngleUndefined: Self = StObject.set(x, "getTotalAngle", js.undefined)
    
    inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setGetWholeDisk(value: CallbackTo[Boolean]): Self = StObject.set(x, "getWholeDisk", value.toJsFn)
    
    inline def setGetWholeDiskUndefined: Self = StObject.set(x, "getWholeDisk", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setNeedle(value: Boolean): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    inline def setNeedleLength(value: Double): Self = StObject.set(x, "needleLength", value.asInstanceOf[js.Any])
    
    inline def setNeedleLengthRatio(value: Double): Self = StObject.set(x, "needleLengthRatio", value.asInstanceOf[js.Any])
    
    inline def setNeedleLengthRatioUndefined: Self = StObject.set(x, "needleLengthRatio", js.undefined)
    
    inline def setNeedleLengthUndefined: Self = StObject.set(x, "needleLength", js.undefined)
    
    inline def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
    
    inline def setNeedleWidth(value: Double): Self = StObject.set(x, "needleWidth", value.asInstanceOf[js.Any])
    
    inline def setNeedleWidthUndefined: Self = StObject.set(x, "needleWidth", js.undefined)
    
    inline def setSectors(value: Array): Self = StObject.set(x, "sectors", value.asInstanceOf[js.Any])
    
    inline def setSectorsUndefined: Self = StObject.set(x, "sectors", js.undefined)
    
    inline def setSetAngleField(value: /* angleField */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAngleField", js.Any.fromFunction1((t0: /* angleField */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetAngleFieldUndefined: Self = StObject.set(x, "setAngleField", js.undefined)
    
    inline def setSetCenter(value: /* center */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setCenter", js.Any.fromFunction1((t0: /* center */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetCenterUndefined: Self = StObject.set(x, "setCenter", js.undefined)
    
    inline def setSetDonut(value: /* donut */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setDonut", js.Any.fromFunction1((t0: /* donut */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetDonutUndefined: Self = StObject.set(x, "setDonut", js.undefined)
    
    inline def setSetField(value: /* field */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setField", js.Any.fromFunction1((t0: /* field */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
    
    inline def setSetMaximum(value: /* maximum */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMaximum", js.Any.fromFunction1((t0: /* maximum */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMaximumUndefined: Self = StObject.set(x, "setMaximum", js.undefined)
    
    inline def setSetMinimum(value: /* minimum */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMinimum", js.Any.fromFunction1((t0: /* minimum */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMinimumUndefined: Self = StObject.set(x, "setMinimum", js.undefined)
    
    inline def setSetNeedle(value: /* needle */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setNeedle", js.Any.fromFunction1((t0: /* needle */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetNeedleLength(value: /* needleLength */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setNeedleLength", js.Any.fromFunction1((t0: /* needleLength */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetNeedleLengthRatio(value: /* needleLengthRatio */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setNeedleLengthRatio", js.Any.fromFunction1((t0: /* needleLengthRatio */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetNeedleLengthRatioUndefined: Self = StObject.set(x, "setNeedleLengthRatio", js.undefined)
    
    inline def setSetNeedleLengthUndefined: Self = StObject.set(x, "setNeedleLength", js.undefined)
    
    inline def setSetNeedleUndefined: Self = StObject.set(x, "setNeedle", js.undefined)
    
    inline def setSetNeedleWidth(value: /* needleWidth */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setNeedleWidth", js.Any.fromFunction1((t0: /* needleWidth */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetNeedleWidthUndefined: Self = StObject.set(x, "setNeedleWidth", js.undefined)
    
    inline def setSetRadius(value: /* radius */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setRadius", js.Any.fromFunction1((t0: /* radius */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetRadiusUndefined: Self = StObject.set(x, "setRadius", js.undefined)
    
    inline def setSetRegion(value: /* region */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setRegion", js.Any.fromFunction1((t0: /* region */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetRegionUndefined: Self = StObject.set(x, "setRegion", js.undefined)
    
    inline def setSetRotation(value: /* rotation */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setRotation", js.Any.fromFunction1((t0: /* rotation */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetRotationUndefined: Self = StObject.set(x, "setRotation", js.undefined)
    
    inline def setSetSectors(value: /* sectors */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setSectors", js.Any.fromFunction1((t0: /* sectors */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetSectorsUndefined: Self = StObject.set(x, "setSectors", js.undefined)
    
    inline def setSetTotalAngle(value: /* totalAngle */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setTotalAngle", js.Any.fromFunction1((t0: /* totalAngle */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetTotalAngleUndefined: Self = StObject.set(x, "setTotalAngle", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setSetWholeDisk(value: /* wholeDisk */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setWholeDisk", js.Any.fromFunction1((t0: /* wholeDisk */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetWholeDiskUndefined: Self = StObject.set(x, "setWholeDisk", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWholeDisk(value: Boolean): Self = StObject.set(x, "wholeDisk", value.asInstanceOf[js.Any])
    
    inline def setWholeDiskUndefined: Self = StObject.set(x, "wholeDisk", js.undefined)
  }
}
