package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCoordinateSystem
  extends StObject
     with XInterface {
  
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  val CoordinateSystemType: String
  
  /** the dimension of the coordinate-system. */
  val Dimension: Double
  
  /** return a service name from which the view component for this coordinate system can be created */
  val ViewServiceName: String
  
  /**
    * The dimension says whether it is a x, y or z axis. The index indicates whether it is a primary or a secondary axis or maybe more in future. Use nIndex
    * == 0 for a primary axis. An empty Reference will be returned if the given nDimension and nIndex are in the valid range but no axis is set for those
    * values. An IndexOutOfBoundsException will be thrown if nDimension is lower than 0 or greater than the value returned by {@link getDimension()} and/or
    * if nIndex is lower 0 or greater than the value returned by getMaxAxisIndexByDimension(nDimension).
    */
  def getAxisByDimension(nDimension: Double, nIndex: Double): XAxis
  
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  def getCoordinateSystemType(): String
  
  /** the dimension of the coordinate-system. */
  def getDimension(): Double
  
  /**
    * In one dimension there could be several axes to enable main and secondary axis and maybe more in future. This method returns the maximum index at
    * which an axis exists for the given dimension. It is allowed that some indexes in between do not have an axis.
    */
  def getMaximumAxisIndexByDimension(nDimension: Double): Double
  
  /** return a service name from which the view component for this coordinate system can be created */
  def getViewServiceName(): String
  
  /** The dimension says whether it is a x, y or z axis. The index says whether it is a primary or a secondary axis. Use nIndex == 0 for a primary axis. */
  def setAxisByDimension(nDimension: Double, xAxis: XAxis, nIndex: Double): Unit
}
object XCoordinateSystem {
  
  inline def apply(
    CoordinateSystemType: String,
    Dimension: Double,
    ViewServiceName: String,
    acquire: Callback,
    getAxisByDimension: (Double, Double) => XAxis,
    getCoordinateSystemType: CallbackTo[String],
    getDimension: CallbackTo[Double],
    getMaximumAxisIndexByDimension: Double => Double,
    getViewServiceName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setAxisByDimension: (Double, XAxis, Double) => Callback
  ): XCoordinateSystem = {
    val __obj = js.Dynamic.literal(CoordinateSystemType = CoordinateSystemType.asInstanceOf[js.Any], Dimension = Dimension.asInstanceOf[js.Any], ViewServiceName = ViewServiceName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAxisByDimension = js.Any.fromFunction2(getAxisByDimension), getCoordinateSystemType = getCoordinateSystemType.toJsFn, getDimension = getDimension.toJsFn, getMaximumAxisIndexByDimension = js.Any.fromFunction1(getMaximumAxisIndexByDimension), getViewServiceName = getViewServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAxisByDimension = js.Any.fromFunction3((t0: Double, t1: XAxis, t2: Double) => (setAxisByDimension(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XCoordinateSystem]
  }
  
  extension [Self <: XCoordinateSystem](x: Self) {
    
    inline def setCoordinateSystemType(value: String): Self = StObject.set(x, "CoordinateSystemType", value.asInstanceOf[js.Any])
    
    inline def setDimension(value: Double): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    inline def setGetAxisByDimension(value: (Double, Double) => XAxis): Self = StObject.set(x, "getAxisByDimension", js.Any.fromFunction2(value))
    
    inline def setGetCoordinateSystemType(value: CallbackTo[String]): Self = StObject.set(x, "getCoordinateSystemType", value.toJsFn)
    
    inline def setGetDimension(value: CallbackTo[Double]): Self = StObject.set(x, "getDimension", value.toJsFn)
    
    inline def setGetMaximumAxisIndexByDimension(value: Double => Double): Self = StObject.set(x, "getMaximumAxisIndexByDimension", js.Any.fromFunction1(value))
    
    inline def setGetViewServiceName(value: CallbackTo[String]): Self = StObject.set(x, "getViewServiceName", value.toJsFn)
    
    inline def setSetAxisByDimension(value: (Double, XAxis, Double) => Callback): Self = StObject.set(x, "setAxisByDimension", js.Any.fromFunction3((t0: Double, t1: XAxis, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setViewServiceName(value: String): Self = StObject.set(x, "ViewServiceName", value.asInstanceOf[js.Any])
  }
}
