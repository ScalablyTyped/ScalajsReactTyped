package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a specialized interface for a 2D poly-polygon containing straight line and Bezier segments.
  *
  * This poly-polygon can contain polygons consisting of a mixture of cubic Bezier curves and straight lines. As the straight line is a special case of a
  * cubic Bezier curve (control points collinear with the line through start and end point), this can be expressed uniformly with a sequence of
  * RealBezierSegment2Ds.
  *
  * By convention, a RealBezierSegment2D is a straight line segment, if all three contained points are strictly equal.
  * @since OOo 2.0
  */
trait XBezierPolyPolygon2D
  extends StObject
     with XPolyPolygon2D {
  
  /**
    * Get a single point from the poly-polygon.
    * @param nPolygonIndex The index of the polygon where the point to be extract is contained within. This index must be in the range [0,numPolygons-1].
    * @param nPointIndex The index of the point in the polygon specified by nPolygonIndex, which is to be retrieved. This value must not exceed the number of
    * @returns the requested point.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def getBezierSegment(nPolygonIndex: Double, nPointIndex: Double): RealBezierSegment2D
  
  /**
    * Query subset of this poly-polygon.
    *
    * Query subset of this poly-polygon, starting at the given polygon and the given point within that polygon, and containing the specified number of
    * polygons and points in the last polygon.
    * @param nPolygonIndex The index of the polygon to start point retrieval with. This index must be in the range [0,numPolygons-1].
    * @param nNumberOfPolygons The number of polygons to extract. This value must not exceed numPolygons-nPolygonIndex.
    * @param nPointIndex The index of the first point in the first polygon to extract. This value must not exceed the number of points in this polygon minus one.
    * @param nNumberOfPoints The number of points to extract from the last polygon. This value must not exceed the number of points in this last polygon minus one.
    * @returns the sequence of extracted points.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def getBezierSegments(nPolygonIndex: Double, nNumberOfPolygons: Double, nPointIndex: Double, nNumberOfPoints: Double): SafeArray[SafeArray[RealBezierSegment2D]]
  
  /**
    * Set a single point on the poly-polygon.
    *
    * The remaining points of the poly-polygon will not be changed by this method. Use {@link XBezierPolyPolygon2D.getNumberOfPolygons()} or {@link
    * XBezierPolyPolygon2D.getNumberOfPolygonPoints()} to append points or polygons, respectively.
    * @param point The point to be set at the poly-polygon.
    * @param nPolygonIndex The index of the polygon to insert the point in. This index must be in the range [0,numPolygons].
    * @param nPointIndex The index of the point in the polygon specified by nPolygonIndex, which is to be set. This value must not exceed the number of points
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def setBezierSegment(point: RealBezierSegment2D, nPolygonIndex: Double, nPointIndex: Double): Unit
  
  /**
    * Set the specified sequence of Bezier segments to the poly-polygon.
    *
    * This method can either set the whole poly-polygon to the new data, or insert the segments at the given index
    * @param points the points.
    * @param nPolygonIndex The index of the polygon to start segment insertion with. This index must be in the range [0,numPolygons], and the insertion will t
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def setBezierSegments(points: SeqEquiv[SeqEquiv[RealBezierSegment2D]], nPolygonIndex: Double): Unit
}
object XBezierPolyPolygon2D {
  
  inline def apply(
    FillRule: FillRule,
    NumberOfPolygons: Double,
    acquire: Callback,
    addPolyPolygon: (RealPoint2D, XPolyPolygon2D) => Callback,
    getBezierSegment: (Double, Double) => RealBezierSegment2D,
    getBezierSegments: (Double, Double, Double, Double) => SafeArray[SafeArray[RealBezierSegment2D]],
    getFillRule: CallbackTo[FillRule],
    getNumberOfPolygonPoints: Double => Double,
    getNumberOfPolygons: CallbackTo[Double],
    isClosed: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    setBezierSegment: (RealBezierSegment2D, Double, Double) => Callback,
    setBezierSegments: (SeqEquiv[SeqEquiv[RealBezierSegment2D]], Double) => Callback,
    setClosed: (Double, Boolean) => Callback,
    setFillRule: FillRule => Callback
  ): XBezierPolyPolygon2D = {
    val __obj = js.Dynamic.literal(FillRule = FillRule.asInstanceOf[js.Any], NumberOfPolygons = NumberOfPolygons.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPolyPolygon = js.Any.fromFunction2((t0: RealPoint2D, t1: XPolyPolygon2D) => (addPolyPolygon(t0, t1)).runNow()), getBezierSegment = js.Any.fromFunction2(getBezierSegment), getBezierSegments = js.Any.fromFunction4(getBezierSegments), getFillRule = getFillRule.toJsFn, getNumberOfPolygonPoints = js.Any.fromFunction1(getNumberOfPolygonPoints), getNumberOfPolygons = getNumberOfPolygons.toJsFn, isClosed = js.Any.fromFunction1(isClosed), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setBezierSegment = js.Any.fromFunction3((t0: RealBezierSegment2D, t1: Double, t2: Double) => (setBezierSegment(t0, t1, t2)).runNow()), setBezierSegments = js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[RealBezierSegment2D]], t1: Double) => (setBezierSegments(t0, t1)).runNow()), setClosed = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setClosed(t0, t1)).runNow()), setFillRule = js.Any.fromFunction1((t0: FillRule) => setFillRule(t0).runNow()))
    __obj.asInstanceOf[XBezierPolyPolygon2D]
  }
  
  extension [Self <: XBezierPolyPolygon2D](x: Self) {
    
    inline def setGetBezierSegment(value: (Double, Double) => RealBezierSegment2D): Self = StObject.set(x, "getBezierSegment", js.Any.fromFunction2(value))
    
    inline def setGetBezierSegments(value: (Double, Double, Double, Double) => SafeArray[SafeArray[RealBezierSegment2D]]): Self = StObject.set(x, "getBezierSegments", js.Any.fromFunction4(value))
    
    inline def setSetBezierSegment(value: (RealBezierSegment2D, Double, Double) => Callback): Self = StObject.set(x, "setBezierSegment", js.Any.fromFunction3((t0: RealBezierSegment2D, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetBezierSegments(value: (SeqEquiv[SeqEquiv[RealBezierSegment2D]], Double) => Callback): Self = StObject.set(x, "setBezierSegments", js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[RealBezierSegment2D]], t1: Double) => (value(t0, t1)).runNow()))
  }
}
