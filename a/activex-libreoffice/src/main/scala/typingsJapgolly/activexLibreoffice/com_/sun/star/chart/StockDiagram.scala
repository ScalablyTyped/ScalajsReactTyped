package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a diagram which can be used for presenting stock quotes.
  *
  * Note that the data must have a specific structure for stock diagrams. Let us assume that data is interpreted, such that series are taken from columns
  * (see property {@link Diagram.DataRowSource} ). Then you need tables of the following structures for different types:
  *
  * **StockDiagram::Volume is FALSEStockDiagram::UpDown is FALSE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is TRUEStockDiagram::UpDown is FALSE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is FALSEStockDiagram::UpDown is TRUE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is TRUEStockDiagram::UpDown is TRUE**{{table here, see documentation}}
  */
trait StockDiagram
  extends StObject
     with XStatisticDisplay
     with ChartStatistics
     with Diagram
     with ChartAxisXSupplier
     with ChartTwoAxisYSupplier {
  
  /**
    * indicates if a stock chart contains data representing the value of stocks on the opening and closing date.
    *
    * The difference will be indicated by bars. The color of the bar will be significant for positive or negative differences between open and closed data.
    *
    * If this property is `FALSE` , the values of the first series (or second if {@link StockDiagram.Volume} is `TRUE` ) of the chart data are interpreted
    * as the day's lowest value. The next series is interpreted as the day's highest value, and the last series is interpreted as the closing value.
    *
    * If this property is set to `TRUE` , one additional series is needed with the opening value of the stocks. It is assumed as the series before the
    * series with the day's lowest value.
    */
  var UpDown: Boolean
  
  /**
    * indicates if a stock chart contains data representing the volume of stocks.
    *
    * The values of the volume are represented as columns like those of a {@link BarDiagram} .
    *
    * If this property is set to `TRUE` , the values of the first series of the chart data are interpreted as volume.
    */
  var Volume: Boolean
}
object StockDiagram {
  
  inline def apply(
    AutomaticPosition: Boolean,
    AutomaticSize: Boolean,
    ConstantErrorHigh: Double,
    ConstantErrorLow: Double,
    DataCaption: Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: String,
    DownBar: XPropertySet,
    ErrorBarRangeNegative: String,
    ErrorBarRangePositive: String,
    ErrorBarStyle: Double,
    ErrorCategory: ChartErrorCategory,
    ErrorIndicator: ChartErrorIndicatorType,
    ErrorMargin: Double,
    HasSecondaryYAxis: Boolean,
    HasSecondaryYAxisDescription: Boolean,
    HasSecondaryYAxisTitle: Boolean,
    HasXAxis: Boolean,
    HasXAxisDescription: Boolean,
    HasXAxisGrid: Boolean,
    HasXAxisHelpGrid: Boolean,
    HasXAxisTitle: Boolean,
    HasYAxis: Boolean,
    HasYAxisDescription: Boolean,
    HasYAxisGrid: Boolean,
    HasYAxisHelpGrid: Boolean,
    HasYAxisTitle: Boolean,
    MeanValue: Boolean,
    MinMaxLine: XPropertySet,
    MissingValueTreatment: Double,
    PercentageError: Double,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    RegressionCurves: ChartRegressionCurveType,
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    SecondaryYAxis: XPropertySet,
    ShapeType: String,
    Size: Size,
    UpBar: XPropertySet,
    UpDown: Boolean,
    UserDefinedAttributes: XNameContainer,
    Volume: Boolean,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    calculateDiagramPositionExcludingAxes: CallbackTo[Rectangle],
    calculateDiagramPositionIncludingAxes: CallbackTo[Rectangle],
    calculateDiagramPositionIncludingAxesAndAxisTitles: CallbackTo[Rectangle],
    getAxis: Double => XAxis,
    getDataPointProperties: (Double, Double) => XPropertySet,
    getDataRowProperties: Double => XPropertySet,
    getDiagramType: CallbackTo[String],
    getDownBar: CallbackTo[XPropertySet],
    getMinMaxLine: CallbackTo[XPropertySet],
    getPosition: CallbackTo[Point],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSecondXAxisTitle: CallbackTo[XShape],
    getSecondYAxisTitle: CallbackTo[XShape],
    getSecondaryAxis: Double => XAxis,
    getSecondaryYAxis: CallbackTo[XPropertySet],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    getUpBar: CallbackTo[XPropertySet],
    getXAxis: CallbackTo[XPropertySet],
    getXAxisTitle: CallbackTo[XShape],
    getXHelpGrid: CallbackTo[XPropertySet],
    getXMainGrid: CallbackTo[XPropertySet],
    getYAxis: CallbackTo[XPropertySet],
    getYAxisTitle: CallbackTo[XShape],
    getYHelpGrid: CallbackTo[XPropertySet],
    getYMainGrid: CallbackTo[XPropertySet],
    isAutomaticDiagramPositioning: CallbackTo[Boolean],
    isExcludingDiagramPositioning: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setAutomaticDiagramPositioning: Callback,
    setDiagramPositionExcludingAxes: Rectangle => Callback,
    setDiagramPositionIncludingAxes: Rectangle => Callback,
    setDiagramPositionIncludingAxesAndAxisTitles: Rectangle => Callback,
    setPosition: Point => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSize: Size => Callback
  ): StockDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition.asInstanceOf[js.Any], AutomaticSize = AutomaticSize.asInstanceOf[js.Any], ConstantErrorHigh = ConstantErrorHigh.asInstanceOf[js.Any], ConstantErrorLow = ConstantErrorLow.asInstanceOf[js.Any], DataCaption = DataCaption.asInstanceOf[js.Any], DataRowSource = DataRowSource.asInstanceOf[js.Any], DiagramType = DiagramType.asInstanceOf[js.Any], DownBar = DownBar.asInstanceOf[js.Any], ErrorBarRangeNegative = ErrorBarRangeNegative.asInstanceOf[js.Any], ErrorBarRangePositive = ErrorBarRangePositive.asInstanceOf[js.Any], ErrorBarStyle = ErrorBarStyle.asInstanceOf[js.Any], ErrorCategory = ErrorCategory.asInstanceOf[js.Any], ErrorIndicator = ErrorIndicator.asInstanceOf[js.Any], ErrorMargin = ErrorMargin.asInstanceOf[js.Any], HasSecondaryYAxis = HasSecondaryYAxis.asInstanceOf[js.Any], HasSecondaryYAxisDescription = HasSecondaryYAxisDescription.asInstanceOf[js.Any], HasSecondaryYAxisTitle = HasSecondaryYAxisTitle.asInstanceOf[js.Any], HasXAxis = HasXAxis.asInstanceOf[js.Any], HasXAxisDescription = HasXAxisDescription.asInstanceOf[js.Any], HasXAxisGrid = HasXAxisGrid.asInstanceOf[js.Any], HasXAxisHelpGrid = HasXAxisHelpGrid.asInstanceOf[js.Any], HasXAxisTitle = HasXAxisTitle.asInstanceOf[js.Any], HasYAxis = HasYAxis.asInstanceOf[js.Any], HasYAxisDescription = HasYAxisDescription.asInstanceOf[js.Any], HasYAxisGrid = HasYAxisGrid.asInstanceOf[js.Any], HasYAxisHelpGrid = HasYAxisHelpGrid.asInstanceOf[js.Any], HasYAxisTitle = HasYAxisTitle.asInstanceOf[js.Any], MeanValue = MeanValue.asInstanceOf[js.Any], MinMaxLine = MinMaxLine.asInstanceOf[js.Any], MissingValueTreatment = MissingValueTreatment.asInstanceOf[js.Any], PercentageError = PercentageError.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegressionCurves = RegressionCurves.asInstanceOf[js.Any], SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], SecondaryYAxis = SecondaryYAxis.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], UpBar = UpBar.asInstanceOf[js.Any], UpDown = UpDown.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Volume = Volume.asInstanceOf[js.Any], XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), calculateDiagramPositionExcludingAxes = calculateDiagramPositionExcludingAxes.toJsFn, calculateDiagramPositionIncludingAxes = calculateDiagramPositionIncludingAxes.toJsFn, calculateDiagramPositionIncludingAxesAndAxisTitles = calculateDiagramPositionIncludingAxesAndAxisTitles.toJsFn, getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = getDiagramType.toJsFn, getDownBar = getDownBar.toJsFn, getMinMaxLine = getMinMaxLine.toJsFn, getPosition = getPosition.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = getSecondXAxisTitle.toJsFn, getSecondYAxisTitle = getSecondYAxisTitle.toJsFn, getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getSecondaryYAxis = getSecondaryYAxis.toJsFn, getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, getUpBar = getUpBar.toJsFn, getXAxis = getXAxis.toJsFn, getXAxisTitle = getXAxisTitle.toJsFn, getXHelpGrid = getXHelpGrid.toJsFn, getXMainGrid = getXMainGrid.toJsFn, getYAxis = getYAxis.toJsFn, getYAxisTitle = getYAxisTitle.toJsFn, getYHelpGrid = getYHelpGrid.toJsFn, getYMainGrid = getYMainGrid.toJsFn, isAutomaticDiagramPositioning = isAutomaticDiagramPositioning.toJsFn, isExcludingDiagramPositioning = isExcludingDiagramPositioning.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setAutomaticDiagramPositioning = setAutomaticDiagramPositioning.toJsFn, setDiagramPositionExcludingAxes = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionExcludingAxes(t0).runNow()), setDiagramPositionIncludingAxes = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionIncludingAxes(t0).runNow()), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionIncludingAxesAndAxisTitles(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[StockDiagram]
  }
  
  extension [Self <: StockDiagram](x: Self) {
    
    inline def setUpDown(value: Boolean): Self = StObject.set(x, "UpDown", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Boolean): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
  }
}
