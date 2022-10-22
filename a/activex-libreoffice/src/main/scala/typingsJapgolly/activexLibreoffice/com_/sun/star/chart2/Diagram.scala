package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart.X3DDefaultSetter
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagram
  extends StObject
     with XDiagram
     with XCoordinateSystemContainer
     with XTitled
     with X3DDefaultSetter {
  
  /** Draw connection lines for stacked bar charts. */
  var ConnectBars: Boolean
  
  /** Chart Datatable flags */
  var DataTableHBorder: Boolean
  
  var DataTableOutline: Boolean
  
  var DataTableVBorder: Boolean
  
  var ExternalData: String
  
  /**
    * If bars of a bar or column chart are attached to different axis, this property determines how to display those. If `TRUE` , the bars are grouped
    * together in one block for each axis, thus they are painted one group over the other.
    *
    * If `FALSE` , the bars are displayed side-by-side, as if they were all attached to the same axis.
    *
    * If all data series of a bar or column chart are attached to only one axis, this property has no effect.
    */
  var GroupBarsPerAxis: Boolean
  
  /**
    * specifies how empty or invalid cells in the provided data should be handled when displayed
    * @see com.sun.star.chart.MissingValueTreatment
    */
  var MissingValueTreatment: Double
  
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: Double
  
  /**
    * The attributes {@link RelativePosition} and {@link RelativeSize} should be used for the inner coordinate region without axis labels and without data
    * labels.
    */
  var PosSizeExcludeLabels: Boolean
  
  /**
    * The position is as a relative position on the page.
    *
    * If a relative position is given the diagram is not automatically placed, but instead is placed relative on the page.
    */
  var RelativePosition: typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.RelativePosition
  
  /** The size of the diagram as relative size of the page size. */
  var RelativeSize: typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.RelativeSize
  
  var RightAngledAxes: Boolean
  
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: Double
  
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: Double
  
  /** Sort data points by x values for rendering */
  var SortByXValues: Boolean
  
  /** Starting angle in degrees for pie charts and doughnut charts. */
  var StartingAngle: Double
}
object Diagram {
  
  inline def apply(
    ConnectBars: Boolean,
    CoordinateSystems: SafeArray[XCoordinateSystem],
    DataTableHBorder: Boolean,
    DataTableOutline: Boolean,
    DataTableVBorder: Boolean,
    DefaultColorScheme: XColorScheme,
    ExternalData: String,
    Floor: XPropertySet,
    GroupBarsPerAxis: Boolean,
    Legend: XLegend,
    MissingValueTreatment: Double,
    Perspective: Double,
    PosSizeExcludeLabels: Boolean,
    RelativePosition: RelativePosition,
    RelativeSize: RelativeSize,
    RightAngledAxes: Boolean,
    RotationHorizontal: Double,
    RotationVertical: Double,
    SortByXValues: Boolean,
    StartingAngle: Double,
    TitleObject: XTitle,
    Wall: XPropertySet,
    acquire: Callback,
    addCoordinateSystem: XCoordinateSystem => Callback,
    getCoordinateSystems: CallbackTo[SafeArray[XCoordinateSystem]],
    getDefaultColorScheme: CallbackTo[XColorScheme],
    getFloor: CallbackTo[XPropertySet],
    getLegend: CallbackTo[XLegend],
    getTitleObject: CallbackTo[XTitle],
    getWall: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback,
    removeCoordinateSystem: XCoordinateSystem => Callback,
    set3DSettingsToDefault: Callback,
    setCoordinateSystems: SeqEquiv[XCoordinateSystem] => Callback,
    setDefaultColorScheme: XColorScheme => Callback,
    setDefaultIllumination: Callback,
    setDefaultRotation: Callback,
    setDiagramData: (XDataSource, SeqEquiv[PropertyValue]) => Callback,
    setLegend: XLegend => Callback,
    setTitleObject: XTitle => Callback
  ): Diagram = {
    val __obj = js.Dynamic.literal(ConnectBars = ConnectBars.asInstanceOf[js.Any], CoordinateSystems = CoordinateSystems.asInstanceOf[js.Any], DataTableHBorder = DataTableHBorder.asInstanceOf[js.Any], DataTableOutline = DataTableOutline.asInstanceOf[js.Any], DataTableVBorder = DataTableVBorder.asInstanceOf[js.Any], DefaultColorScheme = DefaultColorScheme.asInstanceOf[js.Any], ExternalData = ExternalData.asInstanceOf[js.Any], Floor = Floor.asInstanceOf[js.Any], GroupBarsPerAxis = GroupBarsPerAxis.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], MissingValueTreatment = MissingValueTreatment.asInstanceOf[js.Any], Perspective = Perspective.asInstanceOf[js.Any], PosSizeExcludeLabels = PosSizeExcludeLabels.asInstanceOf[js.Any], RelativePosition = RelativePosition.asInstanceOf[js.Any], RelativeSize = RelativeSize.asInstanceOf[js.Any], RightAngledAxes = RightAngledAxes.asInstanceOf[js.Any], RotationHorizontal = RotationHorizontal.asInstanceOf[js.Any], RotationVertical = RotationVertical.asInstanceOf[js.Any], SortByXValues = SortByXValues.asInstanceOf[js.Any], StartingAngle = StartingAngle.asInstanceOf[js.Any], TitleObject = TitleObject.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], acquire = acquire.toJsFn, addCoordinateSystem = js.Any.fromFunction1((t0: XCoordinateSystem) => addCoordinateSystem(t0).runNow()), getCoordinateSystems = getCoordinateSystems.toJsFn, getDefaultColorScheme = getDefaultColorScheme.toJsFn, getFloor = getFloor.toJsFn, getLegend = getLegend.toJsFn, getTitleObject = getTitleObject.toJsFn, getWall = getWall.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeCoordinateSystem = js.Any.fromFunction1((t0: XCoordinateSystem) => removeCoordinateSystem(t0).runNow()), set3DSettingsToDefault = set3DSettingsToDefault.toJsFn, setCoordinateSystems = js.Any.fromFunction1((t0: SeqEquiv[XCoordinateSystem]) => setCoordinateSystems(t0).runNow()), setDefaultColorScheme = js.Any.fromFunction1((t0: XColorScheme) => setDefaultColorScheme(t0).runNow()), setDefaultIllumination = setDefaultIllumination.toJsFn, setDefaultRotation = setDefaultRotation.toJsFn, setDiagramData = js.Any.fromFunction2((t0: XDataSource, t1: SeqEquiv[PropertyValue]) => (setDiagramData(t0, t1)).runNow()), setLegend = js.Any.fromFunction1((t0: XLegend) => setLegend(t0).runNow()), setTitleObject = js.Any.fromFunction1((t0: XTitle) => setTitleObject(t0).runNow()))
    __obj.asInstanceOf[Diagram]
  }
  
  extension [Self <: Diagram](x: Self) {
    
    inline def setConnectBars(value: Boolean): Self = StObject.set(x, "ConnectBars", value.asInstanceOf[js.Any])
    
    inline def setDataTableHBorder(value: Boolean): Self = StObject.set(x, "DataTableHBorder", value.asInstanceOf[js.Any])
    
    inline def setDataTableOutline(value: Boolean): Self = StObject.set(x, "DataTableOutline", value.asInstanceOf[js.Any])
    
    inline def setDataTableVBorder(value: Boolean): Self = StObject.set(x, "DataTableVBorder", value.asInstanceOf[js.Any])
    
    inline def setExternalData(value: String): Self = StObject.set(x, "ExternalData", value.asInstanceOf[js.Any])
    
    inline def setGroupBarsPerAxis(value: Boolean): Self = StObject.set(x, "GroupBarsPerAxis", value.asInstanceOf[js.Any])
    
    inline def setMissingValueTreatment(value: Double): Self = StObject.set(x, "MissingValueTreatment", value.asInstanceOf[js.Any])
    
    inline def setPerspective(value: Double): Self = StObject.set(x, "Perspective", value.asInstanceOf[js.Any])
    
    inline def setPosSizeExcludeLabels(value: Boolean): Self = StObject.set(x, "PosSizeExcludeLabels", value.asInstanceOf[js.Any])
    
    inline def setRelativePosition(value: RelativePosition): Self = StObject.set(x, "RelativePosition", value.asInstanceOf[js.Any])
    
    inline def setRelativeSize(value: RelativeSize): Self = StObject.set(x, "RelativeSize", value.asInstanceOf[js.Any])
    
    inline def setRightAngledAxes(value: Boolean): Self = StObject.set(x, "RightAngledAxes", value.asInstanceOf[js.Any])
    
    inline def setRotationHorizontal(value: Double): Self = StObject.set(x, "RotationHorizontal", value.asInstanceOf[js.Any])
    
    inline def setRotationVertical(value: Double): Self = StObject.set(x, "RotationVertical", value.asInstanceOf[js.Any])
    
    inline def setSortByXValues(value: Boolean): Self = StObject.set(x, "SortByXValues", value.asInstanceOf[js.Any])
    
    inline def setStartingAngle(value: Double): Self = StObject.set(x, "StartingAngle", value.asInstanceOf[js.Any])
  }
}
