package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows easier access to the different subelements of an axis.
  * @since OOo 3.4
  */
trait XAxis
  extends StObject
     with XInterface {
  
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  val AxisTitle: XPropertySet
  
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MajorGrid: XPropertySet
  
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MinorGrid: XPropertySet
  
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  def getAxisTitle(): XPropertySet
  
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMajorGrid(): XPropertySet
  
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMinorGrid(): XPropertySet
}
object XAxis {
  
  inline def apply(
    AxisTitle: XPropertySet,
    MajorGrid: XPropertySet,
    MinorGrid: XPropertySet,
    acquire: Callback,
    getAxisTitle: CallbackTo[XPropertySet],
    getMajorGrid: CallbackTo[XPropertySet],
    getMinorGrid: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XAxis = {
    val __obj = js.Dynamic.literal(AxisTitle = AxisTitle.asInstanceOf[js.Any], MajorGrid = MajorGrid.asInstanceOf[js.Any], MinorGrid = MinorGrid.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAxisTitle = getAxisTitle.toJsFn, getMajorGrid = getMajorGrid.toJsFn, getMinorGrid = getMinorGrid.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAxis]
  }
  
  extension [Self <: XAxis](x: Self) {
    
    inline def setAxisTitle(value: XPropertySet): Self = StObject.set(x, "AxisTitle", value.asInstanceOf[js.Any])
    
    inline def setGetAxisTitle(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getAxisTitle", value.toJsFn)
    
    inline def setGetMajorGrid(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getMajorGrid", value.toJsFn)
    
    inline def setGetMinorGrid(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getMinorGrid", value.toJsFn)
    
    inline def setMajorGrid(value: XPropertySet): Self = StObject.set(x, "MajorGrid", value.asInstanceOf[js.Any])
    
    inline def setMinorGrid(value: XPropertySet): Self = StObject.set(x, "MinorGrid", value.asInstanceOf[js.Any])
  }
}
