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
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the base service for the diagram of the chart document.
  *
  * The diagram is the object that contains the actual plot.
  *
  * Different {@link Diagram} Types, e.g., {@link PieDiagram} or {@link LineDiagram} , can be instantiated by the {@link
  * com.sun.star.lang.XMultiServiceFactory} of the {@link XChartDocument} .
  */
trait Diagram
  extends StObject
     with XDiagram
     with XAxisSupplier
     with XSecondAxisTitleSupplier
     with XDiagramPositioning
     with XPropertySet
     with UserDefinedAttributesSupplier {
  
  /**
    * If this property is `TRUE` the position is calculated by the application automatically. Setting this property to false will have no effect. Instead
    * use the interface {@link com.sun.star.drawing.XShape} to set a concrete position (note {@link com.sun.star.chart.XDiagram} is derived from {@link
    * com.sun.star.drawing.XShape} ).
    */
  var AutomaticPosition: Boolean
  
  /**
    * If this property is `TRUE` the size is calculated by the application automatically. Setting this property to false will have no effect. Instead use
    * the interface {@link com.sun.star.drawing.XShape} to set a concrete size (note {@link com.sun.star.chart.XDiagram} is derived from {@link
    * com.sun.star.drawing.XShape} ).
    */
  var AutomaticSize: Boolean
  
  /**
    * specifies how the caption of data points is displayed.
    * @see ChartDataCaption
    */
  var DataCaption: Double
  
  /**
    * determines if the data for a data row is contained in the columns or in the rows of the data array.
    * @see ChartDataRowSource
    * @see ChartDataArray
    */
  var DataRowSource: ChartDataRowSource
  
  /**
    * specifies how empty or invalid cells in the provided data should be handled when displayed
    * @see MissingValueTreatment
    */
  var MissingValueTreatment: Double
}
object Diagram {
  
  inline def apply(
    AutomaticPosition: Boolean,
    AutomaticSize: Boolean,
    DataCaption: Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: String,
    MissingValueTreatment: Double,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    ShapeType: String,
    Size: Size,
    UserDefinedAttributes: XNameContainer,
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
    getPosition: CallbackTo[Point],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSecondXAxisTitle: CallbackTo[XShape],
    getSecondYAxisTitle: CallbackTo[XShape],
    getSecondaryAxis: Double => XAxis,
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
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
  ): Diagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition.asInstanceOf[js.Any], AutomaticSize = AutomaticSize.asInstanceOf[js.Any], DataCaption = DataCaption.asInstanceOf[js.Any], DataRowSource = DataRowSource.asInstanceOf[js.Any], DiagramType = DiagramType.asInstanceOf[js.Any], MissingValueTreatment = MissingValueTreatment.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), calculateDiagramPositionExcludingAxes = calculateDiagramPositionExcludingAxes.toJsFn, calculateDiagramPositionIncludingAxes = calculateDiagramPositionIncludingAxes.toJsFn, calculateDiagramPositionIncludingAxesAndAxisTitles = calculateDiagramPositionIncludingAxesAndAxisTitles.toJsFn, getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = getDiagramType.toJsFn, getPosition = getPosition.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = getSecondXAxisTitle.toJsFn, getSecondYAxisTitle = getSecondYAxisTitle.toJsFn, getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, isAutomaticDiagramPositioning = isAutomaticDiagramPositioning.toJsFn, isExcludingDiagramPositioning = isExcludingDiagramPositioning.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setAutomaticDiagramPositioning = setAutomaticDiagramPositioning.toJsFn, setDiagramPositionExcludingAxes = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionExcludingAxes(t0).runNow()), setDiagramPositionIncludingAxes = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionIncludingAxes(t0).runNow()), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionIncludingAxesAndAxisTitles(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[Diagram]
  }
  
  extension [Self <: Diagram](x: Self) {
    
    inline def setAutomaticPosition(value: Boolean): Self = StObject.set(x, "AutomaticPosition", value.asInstanceOf[js.Any])
    
    inline def setAutomaticSize(value: Boolean): Self = StObject.set(x, "AutomaticSize", value.asInstanceOf[js.Any])
    
    inline def setDataCaption(value: Double): Self = StObject.set(x, "DataCaption", value.asInstanceOf[js.Any])
    
    inline def setDataRowSource(value: ChartDataRowSource): Self = StObject.set(x, "DataRowSource", value.asInstanceOf[js.Any])
    
    inline def setMissingValueTreatment(value: Double): Self = StObject.set(x, "MissingValueTreatment", value.asInstanceOf[js.Any])
  }
}
