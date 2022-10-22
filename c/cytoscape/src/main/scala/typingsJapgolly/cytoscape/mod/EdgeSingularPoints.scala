package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/edge-points
  */
trait EdgeSingularPoints extends StObject {
  
  /**
    * Get an array of control point model positions for a {@code curve-style: bezier) or {@code curve-style: unbundled-bezier} edge.
    *
    * While the control points may be specified relatively in the CSS,
    * this function returns the absolute model positions of the control points.
    * The points are specified in the order of source-to-target direction.
    * This function works for bundled beziers, but it is not applicable to the middle, straight-line edge in the bundle.
    */
  def controlPoints(): js.Array[Position]
  
  /**
    * Get the model position of the midpoint of the edge.
    *
    * The midpoint is, by default, where the edge’s label is centred. It is also the position towards which mid arrows point.
    * For curve-style: unbundled-bezier edges, the midpoint is the middle extremum if the number of control points is odd.
    * For an even number of control points, the midpoint is where the two middle-most control points meet.
    * This is the middle inflection point for bilaterally symmetric or skew symmetric edges, for example.
    * For curve-style: segments edges, the midpoint is the middle segment point if the number of segment points is odd.
    * For an even number of segment points, the overall midpoint is the midpoint of the middle-most line segment (i.e. the mean of the middle two segment points).
    */
  def midpoint(): Position
  
  /**
    * Get an array of segment point model positions (i.e. bend points) for a {@code curve-style: segments} edge.
    *
    * While the segment points may be specified relatively in the stylesheet,
    * this function returns the absolute model positions of the segment points.
    * The points are specified in the order of source-to-target direction.
    */
  def segmentPoints(): js.Array[Position]
  
  /**
    * Get the model position of where the edge ends, towards the source node.
    */
  def sourceEndpoint(): Position
  
  /**
    * Get the model position of where the edge ends, towards the target node.
    */
  def targetEndpoint(): Position
}
object EdgeSingularPoints {
  
  inline def apply(
    controlPoints: CallbackTo[js.Array[Position]],
    midpoint: CallbackTo[Position],
    segmentPoints: CallbackTo[js.Array[Position]],
    sourceEndpoint: CallbackTo[Position],
    targetEndpoint: CallbackTo[Position]
  ): EdgeSingularPoints = {
    val __obj = js.Dynamic.literal(controlPoints = controlPoints.toJsFn, midpoint = midpoint.toJsFn, segmentPoints = segmentPoints.toJsFn, sourceEndpoint = sourceEndpoint.toJsFn, targetEndpoint = targetEndpoint.toJsFn)
    __obj.asInstanceOf[EdgeSingularPoints]
  }
  
  extension [Self <: EdgeSingularPoints](x: Self) {
    
    inline def setControlPoints(value: CallbackTo[js.Array[Position]]): Self = StObject.set(x, "controlPoints", value.toJsFn)
    
    inline def setMidpoint(value: CallbackTo[Position]): Self = StObject.set(x, "midpoint", value.toJsFn)
    
    inline def setSegmentPoints(value: CallbackTo[js.Array[Position]]): Self = StObject.set(x, "segmentPoints", value.toJsFn)
    
    inline def setSourceEndpoint(value: CallbackTo[Position]): Self = StObject.set(x, "sourceEndpoint", value.toJsFn)
    
    inline def setTargetEndpoint(value: CallbackTo[Position]): Self = StObject.set(x, "targetEndpoint", value.toJsFn)
  }
}
