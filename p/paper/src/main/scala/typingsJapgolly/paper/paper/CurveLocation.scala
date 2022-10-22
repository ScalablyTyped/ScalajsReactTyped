package typingsJapgolly.paper.paper

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * CurveLocation objects describe a location on {@link Curve} objects, as
  *     defined by the curve-time {@link #time}, a value between `0` (beginning
  *     of the curve) and `1` (end of the curve). If the curve is part of a
  *     {@link Path} item, its {@link #index} inside the {@link Path#curves}
  *     array is also provided.
  * 
  * The class is in use in many places, such as
  * {@link Path#getLocationAt},
  * {@link Path#getLocationOf},
  * {@link PathItem#getNearestLocation},
  * {@link PathItem#getIntersections},
  * etc.
  */
trait CurveLocation extends StObject {
  
  /** 
    * The curvature of the {@link #curve} at the given location.
    */
  val curvature: Double
  
  /** 
    * The curve that this location belongs to.
    */
  val curve: Curve
  
  /** 
    * The length of the curve from its beginning up to the location described
    * by this object.
    */
  val curveOffset: Double
  
  /** 
    * The distance from the queried point to the returned location.
    * 
    * @see Curve#getNearestLocation(point)
    * @see PathItem#getNearestLocation(point)
    */
  val distance: Double
  
  /** 
    * Checks whether tow CurveLocation objects are describing the same location
    * on a path, by applying the same tolerances as elsewhere when dealing with
    * curve-time parameters.
    * 
    * @return true if the locations are equal
    */
  def equals(location: CurveLocation): Boolean
  
  /** 
    * Checks if the location is an intersection with another curve and is
    * part of an overlap between the two involved paths.
    * 
    * @see #isCrossing()
    * @see #isTouching()
    * 
    * @return true if the location is an intersection that is
    * part of an overlap between the two involved paths
    */
  def hasOverlap(): Boolean
  
  /** 
    * The index of the {@link #curve} within the {@link Path#curves} list, if
    * it is part of a {@link Path} item.
    */
  val index: Double
  
  /** 
    * The curve location on the intersecting curve, if this location is the
    * result of a call to {@link PathItem#getIntersections} /
    * {@link Curve#getIntersections}.
    */
  val intersection: CurveLocation
  
  /** 
    * Checks if the location is an intersection with another curve and is
    * crossing the other curve, as opposed to just touching it.
    * 
    * @see #isTouching()
    * 
    * @return true if the location is an intersection that is
    * crossing another curve
    */
  def isCrossing(): Boolean
  
  /** 
    * Checks if the location is an intersection with another curve and is
    * merely touching the other curve, as opposed to crossing it.
    * 
    * @see #isCrossing()
    * 
    * @return true if the location is an intersection that is
    * merely touching another curve
    */
  def isTouching(): Boolean
  
  /** 
    * The normal vector to the {@link #curve} at the given location.
    */
  val normal: Point
  
  /** 
    * The length of the path from its beginning up to the location described
    * by this object. If the curve is not part of a path, then the length
    * within the curve is returned instead.
    */
  val offset: Double
  
  /** 
    * The path that this locations is situated on.
    */
  val path: Path
  
  /** 
    * The point which is defined by the {@link #curve} and
    * {@link #time}.
    */
  val point: Point
  
  /** 
    * The segment of the curve which is closer to the described location.
    */
  val segment: Segment
  
  /** 
    * The tangential vector to the {@link #curve} at the given location.
    */
  val tangent: Point
  
  /** 
    * The curve-time parameter, as used by various bezier curve calculations.
    * It is value between `0` (beginning of the curve) and `1` (end of the
    * curve).
    */
  val time: Double
}
object CurveLocation {
  
  inline def apply(
    curvature: Double,
    curve: Curve,
    curveOffset: Double,
    distance: Double,
    equals_ : CurveLocation => Boolean,
    hasOverlap: CallbackTo[Boolean],
    index: Double,
    intersection: CurveLocation,
    isCrossing: CallbackTo[Boolean],
    isTouching: CallbackTo[Boolean],
    normal: Point,
    offset: Double,
    path: Path,
    point: Point,
    segment: Segment,
    tangent: Point,
    time: Double
  ): CurveLocation = {
    val __obj = js.Dynamic.literal(curvature = curvature.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], curveOffset = curveOffset.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasOverlap = hasOverlap.toJsFn, index = index.asInstanceOf[js.Any], intersection = intersection.asInstanceOf[js.Any], isCrossing = isCrossing.toJsFn, isTouching = isTouching.toJsFn, normal = normal.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], tangent = tangent.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[CurveLocation]
  }
  
  extension [Self <: CurveLocation](x: Self) {
    
    inline def setCurvature(value: Double): Self = StObject.set(x, "curvature", value.asInstanceOf[js.Any])
    
    inline def setCurve(value: Curve): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveOffset(value: Double): Self = StObject.set(x, "curveOffset", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: CurveLocation => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setHasOverlap(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasOverlap", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIntersection(value: CurveLocation): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
    
    inline def setIsCrossing(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCrossing", value.toJsFn)
    
    inline def setIsTouching(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTouching", value.toJsFn)
    
    inline def setNormal(value: Point): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setSegment(value: Segment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setTangent(value: Point): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
