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

/** specifies line, spline and symbol diagrams. */
trait LineDiagram
  extends StObject
     with Diagram
     with ChartStatistics
     with ChartAxisXSupplier
     with ChartTwoAxisYSupplier
     with ChartAxisZSupplier
     with Dim3DDiagram
     with StackableDiagram {
  
  /** determines if the chart type has lines connecting the data points or contains just symbols. */
  var Lines: Boolean
  
  /**
    * specifies the power of the polynomials used for spline calculation
    *
    * This property is only valid for B-splines
    */
  var SplineOrder: Double
  
  /** determines the number of sampling points of a spline */
  var SplineResolution: Double
  
  /**
    * determines if the chart is a spline-chart type and specifies the type of splines.
    * @see CurveStyle You can set the following values: {{table here, see documentation}}
    */
  var SplineType: Double
  
  /**
    * Set this property to any valid URL that points to a graphic file. This graphic is then used as symbol for all series.
    *
    * When you query this value you get an internal URL of the embedded graphic.
    * @deprecated Deprecated
    * @see ChartSymbolType
    */
  var SymbolBitmapURL: String
  
  /** specifies the size of symbols in 1/100th of a millimeter. */
  var SymbolSize: Size
  
  /**
    * determines which type of symbols are displayed.
    *
    * In this interface, only the two values {@link ChartSymbolType.NONE} and {@link ChartSymbolType.AUTO} are supported. Later versions may support the
    * selection of the symbols shape.
    *
    * If you set this property to {@link ChartSymbolType.AUTO} , you can change the symbol shape for objects supporting the service {@link
    * ChartDataPointProperties} or {@link ChartDataRowProperties} .
    * @see ChartDataPointProperties
    * @see ChartDataRowProperties
    */
  var SymbolType: Double
}
object LineDiagram {
  
  inline def apply(
    AutomaticPosition: Boolean,
    AutomaticSize: Boolean,
    ConstantErrorHigh: Double,
    ConstantErrorLow: Double,
    DataCaption: Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: String,
    Dim3D: Boolean,
    ErrorBarRangeNegative: String,
    ErrorBarRangePositive: String,
    ErrorBarStyle: Double,
    ErrorCategory: ChartErrorCategory,
    ErrorIndicator: ChartErrorIndicatorType,
    ErrorMargin: Double,
    Floor: XPropertySet,
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
    HasZAxis: Boolean,
    HasZAxisDescription: Boolean,
    HasZAxisGrid: Boolean,
    HasZAxisHelpGrid: Boolean,
    HasZAxisTitle: Boolean,
    Lines: Boolean,
    MeanValue: Boolean,
    MissingValueTreatment: Double,
    Percent: Boolean,
    PercentageError: Double,
    Perspective: Double,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    RegressionCurves: ChartRegressionCurveType,
    RotationHorizontal: Double,
    RotationVertical: Double,
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    SecondaryYAxis: XPropertySet,
    ShapeType: String,
    Size: Size,
    SplineOrder: Double,
    SplineResolution: Double,
    SplineType: Double,
    Stacked: Boolean,
    SymbolBitmapURL: String,
    SymbolSize: Size,
    SymbolType: Double,
    UserDefinedAttributes: XNameContainer,
    Wall: XPropertySet,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    ZAxis: XPropertySet,
    ZAxisTitle: XShape,
    ZHelpGrid: XPropertySet,
    ZMainGrid: XPropertySet,
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
    getFloor: CallbackTo[XPropertySet],
    getPosition: CallbackTo[Point],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSecondXAxisTitle: CallbackTo[XShape],
    getSecondYAxisTitle: CallbackTo[XShape],
    getSecondaryAxis: Double => XAxis,
    getSecondaryYAxis: CallbackTo[XPropertySet],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    getWall: CallbackTo[XPropertySet],
    getXAxis: CallbackTo[XPropertySet],
    getXAxisTitle: CallbackTo[XShape],
    getXHelpGrid: CallbackTo[XPropertySet],
    getXMainGrid: CallbackTo[XPropertySet],
    getYAxis: CallbackTo[XPropertySet],
    getYAxisTitle: CallbackTo[XShape],
    getYHelpGrid: CallbackTo[XPropertySet],
    getYMainGrid: CallbackTo[XPropertySet],
    getZAxis: CallbackTo[XPropertySet],
    getZAxisTitle: CallbackTo[XShape],
    getZHelpGrid: CallbackTo[XPropertySet],
    getZMainGrid: CallbackTo[XPropertySet],
    isAutomaticDiagramPositioning: CallbackTo[Boolean],
    isExcludingDiagramPositioning: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    set3DSettingsToDefault: Callback,
    setAutomaticDiagramPositioning: Callback,
    setDefaultIllumination: Callback,
    setDefaultRotation: Callback,
    setDiagramPositionExcludingAxes: Rectangle => Callback,
    setDiagramPositionIncludingAxes: Rectangle => Callback,
    setDiagramPositionIncludingAxesAndAxisTitles: Rectangle => Callback,
    setPosition: Point => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSize: Size => Callback
  ): LineDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition.asInstanceOf[js.Any], AutomaticSize = AutomaticSize.asInstanceOf[js.Any], ConstantErrorHigh = ConstantErrorHigh.asInstanceOf[js.Any], ConstantErrorLow = ConstantErrorLow.asInstanceOf[js.Any], DataCaption = DataCaption.asInstanceOf[js.Any], DataRowSource = DataRowSource.asInstanceOf[js.Any], DiagramType = DiagramType.asInstanceOf[js.Any], Dim3D = Dim3D.asInstanceOf[js.Any], ErrorBarRangeNegative = ErrorBarRangeNegative.asInstanceOf[js.Any], ErrorBarRangePositive = ErrorBarRangePositive.asInstanceOf[js.Any], ErrorBarStyle = ErrorBarStyle.asInstanceOf[js.Any], ErrorCategory = ErrorCategory.asInstanceOf[js.Any], ErrorIndicator = ErrorIndicator.asInstanceOf[js.Any], ErrorMargin = ErrorMargin.asInstanceOf[js.Any], Floor = Floor.asInstanceOf[js.Any], HasSecondaryYAxis = HasSecondaryYAxis.asInstanceOf[js.Any], HasSecondaryYAxisDescription = HasSecondaryYAxisDescription.asInstanceOf[js.Any], HasSecondaryYAxisTitle = HasSecondaryYAxisTitle.asInstanceOf[js.Any], HasXAxis = HasXAxis.asInstanceOf[js.Any], HasXAxisDescription = HasXAxisDescription.asInstanceOf[js.Any], HasXAxisGrid = HasXAxisGrid.asInstanceOf[js.Any], HasXAxisHelpGrid = HasXAxisHelpGrid.asInstanceOf[js.Any], HasXAxisTitle = HasXAxisTitle.asInstanceOf[js.Any], HasYAxis = HasYAxis.asInstanceOf[js.Any], HasYAxisDescription = HasYAxisDescription.asInstanceOf[js.Any], HasYAxisGrid = HasYAxisGrid.asInstanceOf[js.Any], HasYAxisHelpGrid = HasYAxisHelpGrid.asInstanceOf[js.Any], HasYAxisTitle = HasYAxisTitle.asInstanceOf[js.Any], HasZAxis = HasZAxis.asInstanceOf[js.Any], HasZAxisDescription = HasZAxisDescription.asInstanceOf[js.Any], HasZAxisGrid = HasZAxisGrid.asInstanceOf[js.Any], HasZAxisHelpGrid = HasZAxisHelpGrid.asInstanceOf[js.Any], HasZAxisTitle = HasZAxisTitle.asInstanceOf[js.Any], Lines = Lines.asInstanceOf[js.Any], MeanValue = MeanValue.asInstanceOf[js.Any], MissingValueTreatment = MissingValueTreatment.asInstanceOf[js.Any], Percent = Percent.asInstanceOf[js.Any], PercentageError = PercentageError.asInstanceOf[js.Any], Perspective = Perspective.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegressionCurves = RegressionCurves.asInstanceOf[js.Any], RotationHorizontal = RotationHorizontal.asInstanceOf[js.Any], RotationVertical = RotationVertical.asInstanceOf[js.Any], SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], SecondaryYAxis = SecondaryYAxis.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SplineOrder = SplineOrder.asInstanceOf[js.Any], SplineResolution = SplineResolution.asInstanceOf[js.Any], SplineType = SplineType.asInstanceOf[js.Any], Stacked = Stacked.asInstanceOf[js.Any], SymbolBitmapURL = SymbolBitmapURL.asInstanceOf[js.Any], SymbolSize = SymbolSize.asInstanceOf[js.Any], SymbolType = SymbolType.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], ZAxis = ZAxis.asInstanceOf[js.Any], ZAxisTitle = ZAxisTitle.asInstanceOf[js.Any], ZHelpGrid = ZHelpGrid.asInstanceOf[js.Any], ZMainGrid = ZMainGrid.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), calculateDiagramPositionExcludingAxes = calculateDiagramPositionExcludingAxes.toJsFn, calculateDiagramPositionIncludingAxes = calculateDiagramPositionIncludingAxes.toJsFn, calculateDiagramPositionIncludingAxesAndAxisTitles = calculateDiagramPositionIncludingAxesAndAxisTitles.toJsFn, getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = getDiagramType.toJsFn, getFloor = getFloor.toJsFn, getPosition = getPosition.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = getSecondXAxisTitle.toJsFn, getSecondYAxisTitle = getSecondYAxisTitle.toJsFn, getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getSecondaryYAxis = getSecondaryYAxis.toJsFn, getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, getWall = getWall.toJsFn, getXAxis = getXAxis.toJsFn, getXAxisTitle = getXAxisTitle.toJsFn, getXHelpGrid = getXHelpGrid.toJsFn, getXMainGrid = getXMainGrid.toJsFn, getYAxis = getYAxis.toJsFn, getYAxisTitle = getYAxisTitle.toJsFn, getYHelpGrid = getYHelpGrid.toJsFn, getYMainGrid = getYMainGrid.toJsFn, getZAxis = getZAxis.toJsFn, getZAxisTitle = getZAxisTitle.toJsFn, getZHelpGrid = getZHelpGrid.toJsFn, getZMainGrid = getZMainGrid.toJsFn, isAutomaticDiagramPositioning = isAutomaticDiagramPositioning.toJsFn, isExcludingDiagramPositioning = isExcludingDiagramPositioning.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), set3DSettingsToDefault = set3DSettingsToDefault.toJsFn, setAutomaticDiagramPositioning = setAutomaticDiagramPositioning.toJsFn, setDefaultIllumination = setDefaultIllumination.toJsFn, setDefaultRotation = setDefaultRotation.toJsFn, setDiagramPositionExcludingAxes = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionExcludingAxes(t0).runNow()), setDiagramPositionIncludingAxes = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionIncludingAxes(t0).runNow()), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionIncludingAxesAndAxisTitles(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[LineDiagram]
  }
  
  extension [Self <: LineDiagram](x: Self) {
    
    inline def setLines(value: Boolean): Self = StObject.set(x, "Lines", value.asInstanceOf[js.Any])
    
    inline def setSplineOrder(value: Double): Self = StObject.set(x, "SplineOrder", value.asInstanceOf[js.Any])
    
    inline def setSplineResolution(value: Double): Self = StObject.set(x, "SplineResolution", value.asInstanceOf[js.Any])
    
    inline def setSplineType(value: Double): Self = StObject.set(x, "SplineType", value.asInstanceOf[js.Any])
    
    inline def setSymbolBitmapURL(value: String): Self = StObject.set(x, "SymbolBitmapURL", value.asInstanceOf[js.Any])
    
    inline def setSymbolSize(value: Size): Self = StObject.set(x, "SymbolSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolType(value: Double): Self = StObject.set(x, "SymbolType", value.asInstanceOf[js.Any])
  }
}
