package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic interface for poly-polygons in 2D.
  * @since OOo 2.0
  */
trait XPolyPolygon2D
  extends StObject
     with XInterface {
  
  /** Query the rule used to determine inside and outside of the poly-polygon. */
  var FillRule: typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.FillRule
  
  /** Query number of polygons inside this poly-polygon */
  val NumberOfPolygons: Double
  
  /**
    * Add the specified poly-polygon at the given position.
    *
    * One can do symbolic path construction with this method. The poly-polygons added by this method are not joined in the sense that they participate in
    * mutual fill rule calculations like the polygons inside a single poly-polygon do. When rendering such a poly-polygon without transparency, it will look
    * like the constituting poly-polygons rendered separately on top of another. Alas, when rendering with transparency, separate rendering will combine the
    * alpha of overlapping areas, whereas addPolyPolygon results in constant alpha, regardless how many internal poly-polygons overlap at a single place.
    * @param position The poly-polygon will be added at the given position, i.e. the upper, left edge of the referenced poly-polygon will be at this position
    * @param polyPolygon The poly-polygon to add. Note that the content of this poly-polygon is copied, later changes to polyPolygon will have no effect on th
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the {@link XPolyPolygon2D} parameter does not support one of the data-providing derivat
    */
  def addPolyPolygon(position: RealPoint2D, polyPolygon: XPolyPolygon2D): Unit
  
  /** Query the rule used to determine inside and outside of the poly-polygon. */
  def getFillRule(): FillRule
  
  /**
    * Query number of points inside given polygon
    * @param polygon The index of the polygon to query the number of points for. Must be in the range [0, {@link getNumberOfPolygons()} -1].
    */
  def getNumberOfPolygonPoints(polygon: Double): Double
  
  /** Query number of polygons inside this poly-polygon */
  def getNumberOfPolygons(): Double
  
  /** Query whether the specified polygon outline is closed. */
  def isClosed(index: Double): Boolean
  
  /** Set the close state of the specified polygon outline. Use -1 as the index to affect all polygons of this poly-polygon. */
  def setClosed(index: Double, closedState: Boolean): Unit
  
  /** Set the rule used to determine inside and outside of the poly-polygon. */
  def setFillRule(fillRule: FillRule): Unit
}
object XPolyPolygon2D {
  
  inline def apply(
    FillRule: FillRule,
    NumberOfPolygons: Double,
    acquire: Callback,
    addPolyPolygon: (RealPoint2D, XPolyPolygon2D) => Callback,
    getFillRule: CallbackTo[FillRule],
    getNumberOfPolygonPoints: Double => Double,
    getNumberOfPolygons: CallbackTo[Double],
    isClosed: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    setClosed: (Double, Boolean) => Callback,
    setFillRule: FillRule => Callback
  ): XPolyPolygon2D = {
    val __obj = js.Dynamic.literal(FillRule = FillRule.asInstanceOf[js.Any], NumberOfPolygons = NumberOfPolygons.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPolyPolygon = js.Any.fromFunction2((t0: RealPoint2D, t1: XPolyPolygon2D) => (addPolyPolygon(t0, t1)).runNow()), getFillRule = getFillRule.toJsFn, getNumberOfPolygonPoints = js.Any.fromFunction1(getNumberOfPolygonPoints), getNumberOfPolygons = getNumberOfPolygons.toJsFn, isClosed = js.Any.fromFunction1(isClosed), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setClosed = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setClosed(t0, t1)).runNow()), setFillRule = js.Any.fromFunction1((t0: FillRule) => setFillRule(t0).runNow()))
    __obj.asInstanceOf[XPolyPolygon2D]
  }
  
  extension [Self <: XPolyPolygon2D](x: Self) {
    
    inline def setAddPolyPolygon(value: (RealPoint2D, XPolyPolygon2D) => Callback): Self = StObject.set(x, "addPolyPolygon", js.Any.fromFunction2((t0: RealPoint2D, t1: XPolyPolygon2D) => (value(t0, t1)).runNow()))
    
    inline def setFillRule(value: FillRule): Self = StObject.set(x, "FillRule", value.asInstanceOf[js.Any])
    
    inline def setGetFillRule(value: CallbackTo[FillRule]): Self = StObject.set(x, "getFillRule", value.toJsFn)
    
    inline def setGetNumberOfPolygonPoints(value: Double => Double): Self = StObject.set(x, "getNumberOfPolygonPoints", js.Any.fromFunction1(value))
    
    inline def setGetNumberOfPolygons(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfPolygons", value.toJsFn)
    
    inline def setIsClosed(value: Double => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction1(value))
    
    inline def setNumberOfPolygons(value: Double): Self = StObject.set(x, "NumberOfPolygons", value.asInstanceOf[js.Any])
    
    inline def setSetClosed(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setClosed", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetFillRule(value: FillRule => Callback): Self = StObject.set(x, "setFillRule", js.Any.fromFunction1((t0: FillRule) => value(t0).runNow()))
  }
}
