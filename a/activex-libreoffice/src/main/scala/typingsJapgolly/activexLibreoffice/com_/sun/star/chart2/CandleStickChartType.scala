package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** chart type service for candlestick charts. */
trait CandleStickChartType
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.ChartType {
  
  /**
    * If the candlestick chart shows Japanese candlesticks, that is the property {@link Japanese} is `TRUE` , the property set given here contains the
    * formatting attributes of the black boxes, i.e. the boxes shown for falling values.
    *
    * The {@link com.sun.star.beans.XPropertySet} given here must support the services {@link com.sun.star.drawing.FillProperties} and {@link
    * com.sun.star.drawing.LineProperties} .
    */
  var BlackDay: XPropertySet
  
  /**
    * If this property is `TRUE` , the candlesticks are shown as Japanese candlesticks. This implies that the property {@link ShowFirst} is also `TRUE` .
    *
    * Japanese candlesticks show the first and last value as boxes. A rising course (i.e. if the last value is greater than the first one) is shown by a
    * white box. A falling course is shown by a black box.
    *
    * Default is `FALSE` .
    * @see WhiteDay
    * @see BlackDay
    */
  var Japanese: Boolean
  
  /**
    * If this property is `TRUE` , the first value (which would be the opening course in a stock chart) is shown in the chart. This also makes the role
    * "values-first" mandatory.
    *
    * This property is only evaluated for non-Japanese candlestick charts, as Japanese candlesticks always require to show the first value.
    *
    * Default is `FALSE` .
    */
  var ShowFirst: Boolean
  
  /**
    * If this property is `TRUE` , the low and high values are shown in the chart. This also makes the roles "values-min" and "values-max" mandatory.
    *
    * Default is `TRUE` .
    */
  var ShowHighLow: Boolean
  
  /**
    * If the candlestick chart shows Japanese candlesticks, that is the property {@link Japanese} is `TRUE` , the property set given here contains the
    * formatting attributes of the white boxes, i.e. the boxes shown for rising values.
    *
    * The {@link com.sun.star.beans.XPropertySet} given here must support the services {@link com.sun.star.drawing.FillProperties} and {@link
    * com.sun.star.drawing.LineProperties} .
    */
  var WhiteDay: XPropertySet
}
object CandleStickChartType {
  
  inline def apply(
    BlackDay: XPropertySet,
    ChartType: String,
    DataSeries: SafeArray[XDataSeries],
    Japanese: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RoleOfSequenceForSeriesLabel: String,
    ShowFirst: Boolean,
    ShowHighLow: Boolean,
    SupportedMandatoryRoles: SafeArray[String],
    SupportedOptionalRoles: SafeArray[String],
    SupportedPropertyRoles: SafeArray[String],
    WhiteDay: XPropertySet,
    acquire: Callback,
    addDataSeries: XDataSeries => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createCoordinateSystem: Double => XCoordinateSystem,
    getChartType: CallbackTo[String],
    getDataSeries: CallbackTo[SafeArray[XDataSeries]],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRoleOfSequenceForSeriesLabel: CallbackTo[String],
    getSupportedMandatoryRoles: CallbackTo[SafeArray[String]],
    getSupportedOptionalRoles: CallbackTo[SafeArray[String]],
    getSupportedPropertyRoles: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    removeDataSeries: XDataSeries => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setDataSeries: SeqEquiv[XDataSeries] => Callback,
    setPropertyValue: (String, Any) => Callback
  ): CandleStickChartType = {
    val __obj = js.Dynamic.literal(BlackDay = BlackDay.asInstanceOf[js.Any], ChartType = ChartType.asInstanceOf[js.Any], DataSeries = DataSeries.asInstanceOf[js.Any], Japanese = Japanese.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RoleOfSequenceForSeriesLabel = RoleOfSequenceForSeriesLabel.asInstanceOf[js.Any], ShowFirst = ShowFirst.asInstanceOf[js.Any], ShowHighLow = ShowHighLow.asInstanceOf[js.Any], SupportedMandatoryRoles = SupportedMandatoryRoles.asInstanceOf[js.Any], SupportedOptionalRoles = SupportedOptionalRoles.asInstanceOf[js.Any], SupportedPropertyRoles = SupportedPropertyRoles.asInstanceOf[js.Any], WhiteDay = WhiteDay.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDataSeries = js.Any.fromFunction1((t0: XDataSeries) => addDataSeries(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createCoordinateSystem = js.Any.fromFunction1(createCoordinateSystem), getChartType = getChartType.toJsFn, getDataSeries = getDataSeries.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRoleOfSequenceForSeriesLabel = getRoleOfSequenceForSeriesLabel.toJsFn, getSupportedMandatoryRoles = getSupportedMandatoryRoles.toJsFn, getSupportedOptionalRoles = getSupportedOptionalRoles.toJsFn, getSupportedPropertyRoles = getSupportedPropertyRoles.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDataSeries = js.Any.fromFunction1((t0: XDataSeries) => removeDataSeries(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setDataSeries = js.Any.fromFunction1((t0: SeqEquiv[XDataSeries]) => setDataSeries(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[CandleStickChartType]
  }
  
  extension [Self <: CandleStickChartType](x: Self) {
    
    inline def setBlackDay(value: XPropertySet): Self = StObject.set(x, "BlackDay", value.asInstanceOf[js.Any])
    
    inline def setJapanese(value: Boolean): Self = StObject.set(x, "Japanese", value.asInstanceOf[js.Any])
    
    inline def setShowFirst(value: Boolean): Self = StObject.set(x, "ShowFirst", value.asInstanceOf[js.Any])
    
    inline def setShowHighLow(value: Boolean): Self = StObject.set(x, "ShowHighLow", value.asInstanceOf[js.Any])
    
    inline def setWhiteDay(value: XPropertySet): Self = StObject.set(x, "WhiteDay", value.asInstanceOf[js.Any])
  }
}
