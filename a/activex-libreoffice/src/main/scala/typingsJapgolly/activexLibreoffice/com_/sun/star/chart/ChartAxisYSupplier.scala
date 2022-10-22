package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper service for the y-axis. */
trait ChartAxisYSupplier
  extends StObject
     with XAxisYSupplier {
  
  /**
    * Determines if the y-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasYAxis: Boolean
  
  /** Determines if the description of the y-axis is shown or hidden. */
  var HasYAxisDescription: Boolean
  
  /**
    * Determines if the major grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisGrid: Boolean
  
  /**
    * Determines if the minor grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisHelpGrid: Boolean
  
  /**
    * Determines if the title of the y-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasYAxisTitle: Boolean
}
object ChartAxisYSupplier {
  
  inline def apply(
    HasYAxis: Boolean,
    HasYAxisDescription: Boolean,
    HasYAxisGrid: Boolean,
    HasYAxisHelpGrid: Boolean,
    HasYAxisTitle: Boolean,
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: Callback,
    getYAxis: CallbackTo[XPropertySet],
    getYAxisTitle: CallbackTo[XShape],
    getYHelpGrid: CallbackTo[XPropertySet],
    getYMainGrid: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): ChartAxisYSupplier = {
    val __obj = js.Dynamic.literal(HasYAxis = HasYAxis.asInstanceOf[js.Any], HasYAxisDescription = HasYAxisDescription.asInstanceOf[js.Any], HasYAxisGrid = HasYAxisGrid.asInstanceOf[js.Any], HasYAxisHelpGrid = HasYAxisHelpGrid.asInstanceOf[js.Any], HasYAxisTitle = HasYAxisTitle.asInstanceOf[js.Any], YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], acquire = acquire.toJsFn, getYAxis = getYAxis.toJsFn, getYAxisTitle = getYAxisTitle.toJsFn, getYHelpGrid = getYHelpGrid.toJsFn, getYMainGrid = getYMainGrid.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[ChartAxisYSupplier]
  }
  
  extension [Self <: ChartAxisYSupplier](x: Self) {
    
    inline def setHasYAxis(value: Boolean): Self = StObject.set(x, "HasYAxis", value.asInstanceOf[js.Any])
    
    inline def setHasYAxisDescription(value: Boolean): Self = StObject.set(x, "HasYAxisDescription", value.asInstanceOf[js.Any])
    
    inline def setHasYAxisGrid(value: Boolean): Self = StObject.set(x, "HasYAxisGrid", value.asInstanceOf[js.Any])
    
    inline def setHasYAxisHelpGrid(value: Boolean): Self = StObject.set(x, "HasYAxisHelpGrid", value.asInstanceOf[js.Any])
    
    inline def setHasYAxisTitle(value: Boolean): Self = StObject.set(x, "HasYAxisTitle", value.asInstanceOf[js.Any])
  }
}
