package typingsJapgolly.makerjs.global.MakerJs

import typingsJapgolly.makerjs.MakerJs.IBoundingHex
import typingsJapgolly.makerjs.MakerJs.IChain
import typingsJapgolly.makerjs.MakerJs.IIsPointOnPathOptions
import typingsJapgolly.makerjs.MakerJs.IMeasure
import typingsJapgolly.makerjs.MakerJs.IMeasureMap
import typingsJapgolly.makerjs.MakerJs.IMeasurePointInsideOptions
import typingsJapgolly.makerjs.MakerJs.IMeasureWithCenter
import typingsJapgolly.makerjs.MakerJs.IModel
import typingsJapgolly.makerjs.MakerJs.IPath
import typingsJapgolly.makerjs.MakerJs.IPathArc
import typingsJapgolly.makerjs.MakerJs.IPathBezierSeed
import typingsJapgolly.makerjs.MakerJs.IPathCircle
import typingsJapgolly.makerjs.MakerJs.IPathLine
import typingsJapgolly.makerjs.MakerJs.IPoint
import typingsJapgolly.makerjs.MakerJs.ISlope
import typingsJapgolly.makerjs.anon.HullPoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measure {
  
  @JSGlobal("MakerJs.measure")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A list of maps of measurements.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  @JSGlobal("MakerJs.measure.Atlas")
  @js.native
  open class Atlas protected ()
    extends StObject
       with typingsJapgolly.makerjs.MakerJs.measure.Atlas {
    /**
      * Constructor.
      * @param modelContext The model to measure.
      */
    def this(modelContext: IModel) = this()
    
    /* CompleteClass */
    override def measureModels(): Unit = js.native
    
    /* CompleteClass */
    var modelContext: IModel = js.native
    
    /**
      * Map of model measurements, mapped by routeKey.
      */
    /* CompleteClass */
    var modelMap: IMeasureMap = js.native
    
    /**
      * Flag that models have been measured.
      */
    /* CompleteClass */
    var modelsMeasured: Boolean = js.native
    
    /**
      * Map of path measurements, mapped by routeKey.
      */
    /* CompleteClass */
    var pathMap: IMeasureMap = js.native
  }
  
  /**
    * Augment a measurement - add more properties such as center point, height and width.
    *
    * @param measureToAugment The measurement to augment.
    * @returns Measurement object with augmented properties.
    */
  inline def augment(measureToAugment: IMeasure): IMeasureWithCenter = ^.asInstanceOf[js.Dynamic].applyDynamic("augment")(measureToAugment.asInstanceOf[js.Any]).asInstanceOf[IMeasureWithCenter]
  
  /**
    * Measures the minimum bounding hexagon surrounding a model. The hexagon is oriented such that the right and left sides are vertical, and the top and bottom are pointed.
    *
    * @param modelToMeasure The model to measure.
    * @returns IBoundingHex object which is a hexagon model, with an additional radius property.
    */
  inline def boundingHexagon(modelToMeasure: IModel): IBoundingHex = ^.asInstanceOf[js.Dynamic].applyDynamic("boundingHexagon")(modelToMeasure.asInstanceOf[js.Any]).asInstanceOf[IBoundingHex]
  
  /**
    * Increase a measurement by an additional measurement.
    *
    * @param baseMeasure The measurement to increase.
    * @param addMeasure The additional measurement.
    * @param augmentBaseMeasure Optional flag to call measure.augment on the measurement.
    * @returns The increased original measurement (for cascading).
    */
  inline def increase(baseMeasure: IMeasure, addMeasure: IMeasure): IMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("increase")(baseMeasure.asInstanceOf[js.Any], addMeasure.asInstanceOf[js.Any])).asInstanceOf[IMeasure]
  inline def increase(baseMeasure: IMeasure, addMeasure: IMeasure, augmentBaseMeasure: Boolean): IMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("increase")(baseMeasure.asInstanceOf[js.Any], addMeasure.asInstanceOf[js.Any], augmentBaseMeasure.asInstanceOf[js.Any])).asInstanceOf[IMeasure]
  
  /**
    * Find out if two angles are equal.
    *
    * @param angleA First angle.
    * @param angleB Second angle.
    * @returns true if angles are the same, false if they are not
    */
  inline def isAngleEqual(angleA: Double, angleB: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngleEqual")(angleA.asInstanceOf[js.Any], angleB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isAngleEqual(angleA: Double, angleB: Double, accuracy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngleEqual")(angleA.asInstanceOf[js.Any], angleB.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for arc being concave or convex towards a given point.
    *
    * @param arc The arc to test.
    * @param towardsPoint The point to test.
    * @returns Boolean true if arc is concave towards point.
    */
  inline def isArcConcaveTowardsPoint(arc: IPathArc, towardsPoint: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArcConcaveTowardsPoint")(arc.asInstanceOf[js.Any], towardsPoint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * DEPRECATED - use isArcSpanOverlapping() instead.
    */
  inline def isArcOverlapping(arcA: IPathArc, arcB: IPathArc, excludeTangents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArcOverlapping")(arcA.asInstanceOf[js.Any], arcB.asInstanceOf[js.Any], excludeTangents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for arc overlapping another arc.
    *
    * @param arcA The arc to test.
    * @param arcB The arc to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if arcA is overlapped with arcB.
    */
  inline def isArcSpanOverlapping(arcA: IPathArc, arcB: IPathArc, excludeTangents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArcSpanOverlapping")(arcA.asInstanceOf[js.Any], arcB.asInstanceOf[js.Any], excludeTangents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a given number is between two given limits.
    *
    * @param valueInQuestion The number to test.
    * @param limitA First limit.
    * @param limitB Second limit.
    * @param exclusive Flag to exclude equaling the limits.
    * @returns Boolean true if value is between (or equal to) the limits.
    */
  inline def isBetween(valueInQuestion: Double, limitA: Double, limitB: Double, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetween")(valueInQuestion.asInstanceOf[js.Any], limitA.asInstanceOf[js.Any], limitB.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a given angle is between an arc's start and end angles.
    *
    * @param angleInQuestion The angle to test.
    * @param arc Arc to test against.
    * @param exclusive Flag to exclude equaling the start or end angles.
    * @returns Boolean true if angle is between (or equal to) the arc's start and end angles.
    */
  inline def isBetweenArcAngles(angleInQuestion: Double, arc: IPathArc, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetweenArcAngles")(angleInQuestion.asInstanceOf[js.Any], arc.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a given point is between a line's end points.
    *
    * @param pointInQuestion The point to test.
    * @param line Line to test against.
    * @param exclusive Flag to exclude equaling the origin or end points.
    * @returns Boolean true if point is between (or equal to) the line's origin and end points.
    */
  inline def isBetweenPoints(pointInQuestion: IPoint, line: IPathLine, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetweenPoints")(pointInQuestion.asInstanceOf[js.Any], line.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a given bezier seed has all points on the same slope.
    *
    * @param seed The bezier seed to test.
    * @param exclusive Optional boolean to test only within the boundary of the endpoints.
    * @returns Boolean true if bezier seed has control points on the line slope and between the line endpoints.
    */
  inline def isBezierSeedLinear(seed: IPathBezierSeed): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBezierSeedLinear")(seed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBezierSeedLinear(seed: IPathBezierSeed, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBezierSeedLinear")(seed.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for flow of paths in a chain being clockwise or not.
    *
    * @param chainContext The chain to test.
    * @param out_result Optional output object, if provided, will be populated with convex hull results.
    * @returns Boolean true if paths in the chain flow clockwise.
    */
  inline def isChainClockwise(chainContext: IChain): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChainClockwise")(chainContext.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isChainClockwise(chainContext: IChain, out_result: HullPoints): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isChainClockwise")(chainContext.asInstanceOf[js.Any], out_result.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for line overlapping another line.
    *
    * @param lineA The line to test.
    * @param lineB The line to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if lineA is overlapped with lineB.
    */
  inline def isLineOverlapping(lineA: IPathLine, lineB: IPathLine, excludeTangents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLineOverlapping")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any], excludeTangents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for measurement overlapping another measurement.
    *
    * @param measureA The measurement to test.
    * @param measureB The measurement to check for overlap.
    * @returns Boolean true if measureA is overlapped with measureB.
    */
  inline def isMeasurementOverlapping(measureA: IMeasure, measureB: IMeasure): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMeasurementOverlapping")(measureA.asInstanceOf[js.Any], measureB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if two paths are equal.
    *
    * @param pathA First path.
    * @param pathB Second path.
    * @returns true if paths are the same, false if they are not
    */
  inline def isPathEqual(pathA: IPath, pathB: IPath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: Unit, pathBOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any], pathBOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: IPoint, pathBOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any], pathBOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Unit, pathAOffset: Unit, pathBOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any], pathBOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Unit, pathAOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Unit, pathAOffset: IPoint, pathBOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any], pathBOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for array of points being clockwise or not.
    *
    * @param points The array of points to test.
    * @param out_result Optional output object, if provided, will be populated with convex hull results.
    * @returns Boolean true if points flow clockwise.
    */
  inline def isPointArrayClockwise(points: js.Array[IPoint]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPointArrayClockwise")(points.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPointArrayClockwise(points: js.Array[IPoint], out_result: HullPoints): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointArrayClockwise")(points.asInstanceOf[js.Any], out_result.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if a point is distinct among an array of points.
    *
    * @param pointToCheck point to check.
    * @param pointArray array of points.
    * @param withinDistance Optional distance to consider points equal.
    * @returns false if point is equal to any point in the array.
    */
  inline def isPointDistinct(pointToCheck: IPoint, pointArray: js.Array[IPoint]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointDistinct")(pointToCheck.asInstanceOf[js.Any], pointArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointDistinct(pointToCheck: IPoint, pointArray: js.Array[IPoint], withinDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointDistinct")(pointToCheck.asInstanceOf[js.Any], pointArray.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if two points are equal.
    *
    * @param a First point.
    * @param b Second point.
    * @param withinDistance Optional distance to consider points equal.
    * @returns true if points are the same, false if they are not
    */
  inline def isPointEqual(a: IPoint, b: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointEqual(a: IPoint, b: IPoint, withinDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check to see if a point is inside of a model.
    *
    * @param pointToCheck The point to check.
    * @param modelContext The model to check against.
    * @param options Optional IMeasurePointInsideOptions object.
    * @returns Boolean true if the path is inside of the modelContext.
    */
  inline def isPointInsideModel(pointToCheck: IPoint, modelContext: IModel): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInsideModel")(pointToCheck.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointInsideModel(pointToCheck: IPoint, modelContext: IModel, options: IMeasurePointInsideOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInsideModel")(pointToCheck.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if point is on a circle.
    *
    * @param p Point to check.
    * @param circle Circle.
    * @param withinDistance Optional distance of tolerance.
    * @returns true if point is on the circle
    */
  inline def isPointOnCircle(p: IPoint, circle: IPathCircle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnCircle")(p.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnCircle(p: IPoint, circle: IPathCircle, withinDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnCircle")(p.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if a point lies on a path.
    * @param pointToCheck point to check.
    * @param onPath path to check against.
    * @param withinDistance Optional distance to consider point on the path.
    * @param pathOffset Optional offset of path from [0, 0].
    * @param options Optional IIsPointOnPathOptions to cache computation.
    */
  inline def isPointOnPath(pointToCheck: IPoint, onPath: IPath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPath")(pointToCheck.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnPath(pointToCheck: IPoint, onPath: IPath, withinDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPath")(pointToCheck.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnPath(
    pointToCheck: IPoint,
    onPath: IPath,
    withinDistance: Double,
    pathOffset: Unit,
    options: IIsPointOnPathOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPath")(pointToCheck.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnPath(pointToCheck: IPoint, onPath: IPath, withinDistance: Double, pathOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPath")(pointToCheck.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnPath(
    pointToCheck: IPoint,
    onPath: IPath,
    withinDistance: Double,
    pathOffset: IPoint,
    options: IIsPointOnPathOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPath")(pointToCheck.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnPath(
    pointToCheck: IPoint,
    onPath: IPath,
    withinDistance: Unit,
    pathOffset: Unit,
    options: IIsPointOnPathOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPath")(pointToCheck.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnPath(pointToCheck: IPoint, onPath: IPath, withinDistance: Unit, pathOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPath")(pointToCheck.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnPath(
    pointToCheck: IPoint,
    onPath: IPath,
    withinDistance: Unit,
    pathOffset: IPoint,
    options: IIsPointOnPathOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnPath")(pointToCheck.asInstanceOf[js.Any], onPath.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if point is on a slope.
    *
    * @param p Point to check.
    * @param b Slope.
    * @param withinDistance Optional distance of tolerance.
    * @returns true if point is on the slope
    */
  inline def isPointOnSlope(p: IPoint, slope: ISlope): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnSlope")(p.asInstanceOf[js.Any], slope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnSlope(p: IPoint, slope: ISlope, withinDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnSlope")(p.asInstanceOf[js.Any], slope.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for slope equality.
    *
    * @param slopeA The ISlope to test.
    * @param slopeB The ISlope to check for equality.
    * @returns Boolean true if slopes are equal.
    */
  inline def isSlopeEqual(slopeA: ISlope, slopeB: ISlope): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSlopeEqual")(slopeA.asInstanceOf[js.Any], slopeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for parallel slopes.
    *
    * @param slopeA The ISlope to test.
    * @param slopeB The ISlope to check for parallel.
    * @returns Boolean true if slopes are parallel.
    */
  inline def isSlopeParallel(slopeA: ISlope, slopeB: ISlope): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSlopeParallel")(slopeA.asInstanceOf[js.Any], slopeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Gets the slope of a line.
    */
  inline def lineSlope(line: IPathLine): ISlope = ^.asInstanceOf[js.Dynamic].applyDynamic("lineSlope")(line.asInstanceOf[js.Any]).asInstanceOf[ISlope]
  
  /**
    * Measures the smallest rectangle which contains a model.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  inline def modelExtents(modelToMeasure: IModel): IMeasureWithCenter = ^.asInstanceOf[js.Dynamic].applyDynamic("modelExtents")(modelToMeasure.asInstanceOf[js.Any]).asInstanceOf[IMeasureWithCenter]
  inline def modelExtents(modelToMeasure: IModel, atlas: typingsJapgolly.makerjs.MakerJs.measure.Atlas): IMeasureWithCenter = (^.asInstanceOf[js.Dynamic].applyDynamic("modelExtents")(modelToMeasure.asInstanceOf[js.Any], atlas.asInstanceOf[js.Any])).asInstanceOf[IMeasureWithCenter]
  
  /**
    * Measures the length of all paths in a model.
    *
    * @param modelToMeasure The model containing paths to measure.
    * @returns Length of all paths in the model.
    */
  inline def modelPathLength(modelToMeasure: IModel): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("modelPathLength")(modelToMeasure.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the smallest rectangle which contains a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns object with low and high points.
    */
  inline def pathExtents(pathToMeasure: IPath): IMeasure = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExtents")(pathToMeasure.asInstanceOf[js.Any]).asInstanceOf[IMeasure]
  inline def pathExtents(pathToMeasure: IPath, addOffset: IPoint): IMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("pathExtents")(pathToMeasure.asInstanceOf[js.Any], addOffset.asInstanceOf[js.Any])).asInstanceOf[IMeasure]
  
  /**
    * Measures the length of a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns Length of the path.
    */
  inline def pathLength(pathToMeasure: IPath): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pathLength")(pathToMeasure.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the distance between two points.
    *
    * @param a First point.
    * @param b Second point.
    * @returns Distance between points.
    */
  inline def pointDistance(a: IPoint, b: IPoint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
