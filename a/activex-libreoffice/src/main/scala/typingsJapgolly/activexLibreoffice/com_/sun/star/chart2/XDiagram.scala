package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDiagram
  extends StObject
     with XInterface {
  
  /** returns an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  var DefaultColorScheme: XColorScheme
  
  /**
    * returns the property set that determines the visual appearance of the floor if any.
    *
    * The floor is the bottom of a 3D diagram. For a 2D diagram NULL is returned.
    */
  val Floor: XPropertySet
  
  /** returns the legend, which may represent data series and other information about a diagram in a separate box. */
  var Legend: XLegend
  
  /**
    * returns the property set that determines the visual appearance of the wall.
    *
    * The wall is the area behind the union of all coordinate systems used in a diagram.
    */
  val Wall: XPropertySet
  
  /** returns an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  def getDefaultColorScheme(): XColorScheme
  
  /**
    * returns the property set that determines the visual appearance of the floor if any.
    *
    * The floor is the bottom of a 3D diagram. For a 2D diagram NULL is returned.
    */
  def getFloor(): XPropertySet
  
  /** returns the legend, which may represent data series and other information about a diagram in a separate box. */
  def getLegend(): XLegend
  
  /**
    * returns the property set that determines the visual appearance of the wall.
    *
    * The wall is the area behind the union of all coordinate systems used in a diagram.
    */
  def getWall(): XPropertySet
  
  /** sets an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  def setDefaultColorScheme(xColorScheme: XColorScheme): Unit
  
  /**
    * sets new data to the diagram.
    * @param xDataSource This data source will be interpreted in a chart-type specific way and the {@link DataSeries} found in `xDiagram` will be adapted to t
    * @param aArguments Arguments tells how to slice the given data.  For standard parameters that may be used, see the service {@link StandardDiagramCreation
    */
  def setDiagramData(xDataSource: XDataSource, aArguments: SeqEquiv[PropertyValue]): Unit
  
  /** sets a new legend. */
  def setLegend(xLegend: XLegend): Unit
}
object XDiagram {
  
  inline def apply(
    DefaultColorScheme: XColorScheme,
    Floor: XPropertySet,
    Legend: XLegend,
    Wall: XPropertySet,
    acquire: Callback,
    getDefaultColorScheme: CallbackTo[XColorScheme],
    getFloor: CallbackTo[XPropertySet],
    getLegend: CallbackTo[XLegend],
    getWall: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback,
    setDefaultColorScheme: XColorScheme => Callback,
    setDiagramData: (XDataSource, SeqEquiv[PropertyValue]) => Callback,
    setLegend: XLegend => Callback
  ): XDiagram = {
    val __obj = js.Dynamic.literal(DefaultColorScheme = DefaultColorScheme.asInstanceOf[js.Any], Floor = Floor.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDefaultColorScheme = getDefaultColorScheme.toJsFn, getFloor = getFloor.toJsFn, getLegend = getLegend.toJsFn, getWall = getWall.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDefaultColorScheme = js.Any.fromFunction1((t0: XColorScheme) => setDefaultColorScheme(t0).runNow()), setDiagramData = js.Any.fromFunction2((t0: XDataSource, t1: SeqEquiv[PropertyValue]) => (setDiagramData(t0, t1)).runNow()), setLegend = js.Any.fromFunction1((t0: XLegend) => setLegend(t0).runNow()))
    __obj.asInstanceOf[XDiagram]
  }
  
  extension [Self <: XDiagram](x: Self) {
    
    inline def setDefaultColorScheme(value: XColorScheme): Self = StObject.set(x, "DefaultColorScheme", value.asInstanceOf[js.Any])
    
    inline def setFloor(value: XPropertySet): Self = StObject.set(x, "Floor", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultColorScheme(value: CallbackTo[XColorScheme]): Self = StObject.set(x, "getDefaultColorScheme", value.toJsFn)
    
    inline def setGetFloor(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getFloor", value.toJsFn)
    
    inline def setGetLegend(value: CallbackTo[XLegend]): Self = StObject.set(x, "getLegend", value.toJsFn)
    
    inline def setGetWall(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getWall", value.toJsFn)
    
    inline def setLegend(value: XLegend): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultColorScheme(value: XColorScheme => Callback): Self = StObject.set(x, "setDefaultColorScheme", js.Any.fromFunction1((t0: XColorScheme) => value(t0).runNow()))
    
    inline def setSetDiagramData(value: (XDataSource, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "setDiagramData", js.Any.fromFunction2((t0: XDataSource, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setSetLegend(value: XLegend => Callback): Self = StObject.set(x, "setLegend", js.Any.fromFunction1((t0: XLegend) => value(t0).runNow()))
    
    inline def setWall(value: XPropertySet): Self = StObject.set(x, "Wall", value.asInstanceOf[js.Any])
  }
}
