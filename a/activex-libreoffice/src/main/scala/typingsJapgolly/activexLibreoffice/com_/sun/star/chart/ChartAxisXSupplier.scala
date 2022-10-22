package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** has to be supported by charts providing the capabilities of a horizontal axis, i.e., an **x** -axis. */
trait ChartAxisXSupplier
  extends StObject
     with XAxisXSupplier {
  
  /**
    * This property determines if the x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasXAxis: Boolean
  
  /** Determines if the description of the x-axis is shown or hidden. */
  var HasXAxisDescription: Boolean
  
  /**
    * Determines if the major grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisGrid: Boolean
  
  /**
    * Determines if the minor grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisHelpGrid: Boolean
  
  /**
    * Determines if the title of the x-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasXAxisTitle: Boolean
}
object ChartAxisXSupplier {
  
  inline def apply(
    HasXAxis: Boolean,
    HasXAxisDescription: Boolean,
    HasXAxisGrid: Boolean,
    HasXAxisHelpGrid: Boolean,
    HasXAxisTitle: Boolean,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: Callback,
    getXAxis: CallbackTo[XPropertySet],
    getXAxisTitle: CallbackTo[XShape],
    getXHelpGrid: CallbackTo[XPropertySet],
    getXMainGrid: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): ChartAxisXSupplier = {
    val __obj = js.Dynamic.literal(HasXAxis = HasXAxis.asInstanceOf[js.Any], HasXAxisDescription = HasXAxisDescription.asInstanceOf[js.Any], HasXAxisGrid = HasXAxisGrid.asInstanceOf[js.Any], HasXAxisHelpGrid = HasXAxisHelpGrid.asInstanceOf[js.Any], HasXAxisTitle = HasXAxisTitle.asInstanceOf[js.Any], XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = acquire.toJsFn, getXAxis = getXAxis.toJsFn, getXAxisTitle = getXAxisTitle.toJsFn, getXHelpGrid = getXHelpGrid.toJsFn, getXMainGrid = getXMainGrid.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[ChartAxisXSupplier]
  }
  
  extension [Self <: ChartAxisXSupplier](x: Self) {
    
    inline def setHasXAxis(value: Boolean): Self = StObject.set(x, "HasXAxis", value.asInstanceOf[js.Any])
    
    inline def setHasXAxisDescription(value: Boolean): Self = StObject.set(x, "HasXAxisDescription", value.asInstanceOf[js.Any])
    
    inline def setHasXAxisGrid(value: Boolean): Self = StObject.set(x, "HasXAxisGrid", value.asInstanceOf[js.Any])
    
    inline def setHasXAxisHelpGrid(value: Boolean): Self = StObject.set(x, "HasXAxisHelpGrid", value.asInstanceOf[js.Any])
    
    inline def setHasXAxisTitle(value: Boolean): Self = StObject.set(x, "HasXAxisTitle", value.asInstanceOf[js.Any])
  }
}
