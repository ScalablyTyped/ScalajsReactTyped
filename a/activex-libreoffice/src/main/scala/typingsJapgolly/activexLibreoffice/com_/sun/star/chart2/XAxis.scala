package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAxis
  extends StObject
     with XInterface {
  
  /** the returned property set must support the service {@link GridProperties} */
  val GridProperties: XPropertySet
  
  var ScaleData: typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.ScaleData
  
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  val SubGridProperties: SafeArray[XPropertySet]
  
  /** the returned property sets must support the service TickProperties */
  val SubTickProperties: SafeArray[XPropertySet]
  
  /** the returned property set must support the service {@link GridProperties} */
  def getGridProperties(): XPropertySet
  
  def getScaleData(): ScaleData
  
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  def getSubGridProperties(): SafeArray[XPropertySet]
  
  /** the returned property sets must support the service TickProperties */
  def getSubTickProperties(): SafeArray[XPropertySet]
  
  def setScaleData(aScale: ScaleData): Unit
}
object XAxis {
  
  inline def apply(
    GridProperties: XPropertySet,
    ScaleData: ScaleData,
    SubGridProperties: SafeArray[XPropertySet],
    SubTickProperties: SafeArray[XPropertySet],
    acquire: Callback,
    getGridProperties: CallbackTo[XPropertySet],
    getScaleData: CallbackTo[ScaleData],
    getSubGridProperties: CallbackTo[SafeArray[XPropertySet]],
    getSubTickProperties: CallbackTo[SafeArray[XPropertySet]],
    queryInterface: `type` => Any,
    release: Callback,
    setScaleData: ScaleData => Callback
  ): XAxis = {
    val __obj = js.Dynamic.literal(GridProperties = GridProperties.asInstanceOf[js.Any], ScaleData = ScaleData.asInstanceOf[js.Any], SubGridProperties = SubGridProperties.asInstanceOf[js.Any], SubTickProperties = SubTickProperties.asInstanceOf[js.Any], acquire = acquire.toJsFn, getGridProperties = getGridProperties.toJsFn, getScaleData = getScaleData.toJsFn, getSubGridProperties = getSubGridProperties.toJsFn, getSubTickProperties = getSubTickProperties.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setScaleData = js.Any.fromFunction1((t0: ScaleData) => setScaleData(t0).runNow()))
    __obj.asInstanceOf[XAxis]
  }
  
  extension [Self <: XAxis](x: Self) {
    
    inline def setGetGridProperties(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getGridProperties", value.toJsFn)
    
    inline def setGetScaleData(value: CallbackTo[ScaleData]): Self = StObject.set(x, "getScaleData", value.toJsFn)
    
    inline def setGetSubGridProperties(value: CallbackTo[SafeArray[XPropertySet]]): Self = StObject.set(x, "getSubGridProperties", value.toJsFn)
    
    inline def setGetSubTickProperties(value: CallbackTo[SafeArray[XPropertySet]]): Self = StObject.set(x, "getSubTickProperties", value.toJsFn)
    
    inline def setGridProperties(value: XPropertySet): Self = StObject.set(x, "GridProperties", value.asInstanceOf[js.Any])
    
    inline def setScaleData(value: ScaleData): Self = StObject.set(x, "ScaleData", value.asInstanceOf[js.Any])
    
    inline def setSetScaleData(value: ScaleData => Callback): Self = StObject.set(x, "setScaleData", js.Any.fromFunction1((t0: ScaleData) => value(t0).runNow()))
    
    inline def setSubGridProperties(value: SafeArray[XPropertySet]): Self = StObject.set(x, "SubGridProperties", value.asInstanceOf[js.Any])
    
    inline def setSubTickProperties(value: SafeArray[XPropertySet]): Self = StObject.set(x, "SubTickProperties", value.asInstanceOf[js.Any])
  }
}
