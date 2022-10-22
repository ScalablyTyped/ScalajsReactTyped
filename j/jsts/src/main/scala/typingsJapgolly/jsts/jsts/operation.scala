package typingsJapgolly.jsts.jsts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsts.jsts.geom.Coordinate
import typingsJapgolly.jsts.jsts.geom.Geometry
import typingsJapgolly.jsts.jsts.geom.IntersectionMatrix
import typingsJapgolly.jsts.jsts.geom.PrecisionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operation {
  
  trait GeometryGraphOperation extends StObject {
    
    def getArgGeometry(i: Double): Geometry
    
    def setComputationPrecision(pm: PrecisionModel): Unit
  }
  object GeometryGraphOperation {
    
    inline def apply(getArgGeometry: Double => Geometry, setComputationPrecision: PrecisionModel => Callback): GeometryGraphOperation = {
      val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), setComputationPrecision = js.Any.fromFunction1((t0: PrecisionModel) => setComputationPrecision(t0).runNow()))
      __obj.asInstanceOf[GeometryGraphOperation]
    }
    
    extension [Self <: GeometryGraphOperation](x: Self) {
      
      inline def setGetArgGeometry(value: Double => Geometry): Self = StObject.set(x, "getArgGeometry", js.Any.fromFunction1(value))
      
      inline def setSetComputationPrecision(value: PrecisionModel => Callback): Self = StObject.set(x, "setComputationPrecision", js.Any.fromFunction1((t0: PrecisionModel) => value(t0).runNow()))
    }
  }
  
  object buffer {
    
    trait BufferOp extends StObject {
      
      /**
        * @param {PrecisionModel}
        *          fixedPM
        */
      def bufferFixedPrecision(fixedPM: PrecisionModel): Unit
      
      /**
        * @param {int}
        *          precisionDigits
        */
      def bufferReducedPrecision2(precisionDigits: Double): Unit
      
      /**
        * Returns the buffer computed for a geometry for a given buffer distance.
        *
        * @param {double}
        *          dist the buffer distance.
        * @return {Geometry} the buffer of the input geometry.
        */
      def getResultGeometry(dist: Double): Geometry
      
      /**
        * Specifies the end cap style of the generated buffer. The styles supported are
        * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
        * default is CAP_ROUND.
        *
        * @param {int}
        *          endCapStyle the end cap style to specify.
        */
      def setEndCapStyle(endCapStyle: Double): Unit
      
      /**
        * Sets the number of segments used to approximate a angle fillet
        *
        * @param {int}
        *          quadrantSegments the number of segments in a fillet for a quadrant.
        */
      def setQuadrantSegments(quadrantSegments: Double): Unit
    }
    object BufferOp {
      
      inline def apply(
        bufferFixedPrecision: PrecisionModel => Callback,
        bufferReducedPrecision2: Double => Callback,
        getResultGeometry: Double => Geometry,
        setEndCapStyle: Double => Callback,
        setQuadrantSegments: Double => Callback
      ): BufferOp = {
        val __obj = js.Dynamic.literal(bufferFixedPrecision = js.Any.fromFunction1((t0: PrecisionModel) => bufferFixedPrecision(t0).runNow()), bufferReducedPrecision2 = js.Any.fromFunction1((t0: Double) => bufferReducedPrecision2(t0).runNow()), getResultGeometry = js.Any.fromFunction1(getResultGeometry), setEndCapStyle = js.Any.fromFunction1((t0: Double) => setEndCapStyle(t0).runNow()), setQuadrantSegments = js.Any.fromFunction1((t0: Double) => setQuadrantSegments(t0).runNow()))
        __obj.asInstanceOf[BufferOp]
      }
      
      extension [Self <: BufferOp](x: Self) {
        
        inline def setBufferFixedPrecision(value: PrecisionModel => Callback): Self = StObject.set(x, "bufferFixedPrecision", js.Any.fromFunction1((t0: PrecisionModel) => value(t0).runNow()))
        
        inline def setBufferReducedPrecision2(value: Double => Callback): Self = StObject.set(x, "bufferReducedPrecision2", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setGetResultGeometry(value: Double => Geometry): Self = StObject.set(x, "getResultGeometry", js.Any.fromFunction1(value))
        
        inline def setSetEndCapStyle(value: Double => Callback): Self = StObject.set(x, "setEndCapStyle", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetQuadrantSegments(value: Double => Callback): Self = StObject.set(x, "setQuadrantSegments", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      }
    }
    
    trait BufferParameters extends StObject {
      
      /**
        * Computes the maximum distance error due to a given level of approximation to
        * a true arc.
        *
        * @param quadSegs
        *          the number of segments used to approximate a quarter-circle.
        * @return the error of approximation.
        */
      def bufferDistanceError(quadSegs: Double): Double
      
      /**
        * Gets the end cap style.
        *
        * @return the end cap style.
        */
      def getEndCapStyle(): Double
      
      /**
        * Gets the join style
        *
        * @return the join style code.
        */
      def getJoinStyle(): Double
      
      /**
        * Gets the mitre ratio limit.
        *
        * @return the limit value.
        */
      def getMitreLimit(): Double
      
      /**
        * Gets the number of quadrant segments which will be used
        *
        * @return the number of quadrant segments.
        */
      def getQuadrantSegments(): Double
      
      /**
        * Tests whether the buffer is to be generated on a single side only.
        *
        * @return true if the generated buffer is to be single-sided.
        */
      def isSingleSided(): Boolean
      
      /**
        * Specifies the end cap style of the generated buffer. The styles supported are
        * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
        * default is CAP_ROUND.
        *
        * @param {int}
        *          endCapStyle the end cap style to specify.
        */
      def setEndCapStyle(endCapStyle: Double): Unit
      
      /**
        * Sets the join style for outside (reflex) corners between line segments.
        * Allowable values are {@link JOIN_ROUND} (which is the default),
        * {@link JOIN_MITRE} and {link JOIN_BEVEL}.
        *
        * @param joinStyle
        *          the code for the join style.
        */
      def setJoinStyle(joinStyle: Double): Unit
      
      /**
        * Sets the limit on the mitre ratio used for very sharp corners. The mitre
        * ratio is the ratio of the distance from the corner to the end of the mitred
        * offset corner. When two line segments meet at a sharp angle, a miter join
        * will extend far beyond the original geometry. (and in the extreme case will
        * be infinitely far.) To prevent unreasonable geometry, the mitre limit allows
        * controlling the maximum length of the join corner. Corners with a ratio which
        * exceed the limit will be beveled.
        *
        * @param mitreLimit
        *          the mitre ratio limit.
        */
      def setMitreLimit(mitreLimit: Double): Unit
      
      /**
        * Sets the number of segments used to approximate a angle fillet
        *
        * @param {int}
        *          quadrantSegments the number of segments in a fillet for a quadrant.
        */
      def setQuadrantSegments(quadrantSegments: Double): Unit
      
      /**
        * Sets whether the computed buffer should be single-sided. A single-sided
        * buffer is constructed on only one side of each input line.
        * <p>
        * The side used is determined by the sign of the buffer distance:
        * <ul>
        * <li>a positive distance indicates the left-hand side
        * <li>a negative distance indicates the right-hand side
        * </ul>
        * The single-sided buffer of point geometries is the same as the regular
        * buffer.
        * <p>
        * The End Cap Style for single-sided buffers is always ignored, and forced to
        * the equivalent of <tt>CAP_FLAT</tt>.
        *
        * @param isSingleSided
        *          true if a single-sided buffer should be constructed.
        */
      def setSingleSided(isSingleSided: Boolean): Unit
    }
    object BufferParameters {
      
      inline def apply(
        bufferDistanceError: Double => Double,
        getEndCapStyle: CallbackTo[Double],
        getJoinStyle: CallbackTo[Double],
        getMitreLimit: CallbackTo[Double],
        getQuadrantSegments: CallbackTo[Double],
        isSingleSided: CallbackTo[Boolean],
        setEndCapStyle: Double => Callback,
        setJoinStyle: Double => Callback,
        setMitreLimit: Double => Callback,
        setQuadrantSegments: Double => Callback,
        setSingleSided: Boolean => Callback
      ): BufferParameters = {
        val __obj = js.Dynamic.literal(bufferDistanceError = js.Any.fromFunction1(bufferDistanceError), getEndCapStyle = getEndCapStyle.toJsFn, getJoinStyle = getJoinStyle.toJsFn, getMitreLimit = getMitreLimit.toJsFn, getQuadrantSegments = getQuadrantSegments.toJsFn, isSingleSided = isSingleSided.toJsFn, setEndCapStyle = js.Any.fromFunction1((t0: Double) => setEndCapStyle(t0).runNow()), setJoinStyle = js.Any.fromFunction1((t0: Double) => setJoinStyle(t0).runNow()), setMitreLimit = js.Any.fromFunction1((t0: Double) => setMitreLimit(t0).runNow()), setQuadrantSegments = js.Any.fromFunction1((t0: Double) => setQuadrantSegments(t0).runNow()), setSingleSided = js.Any.fromFunction1((t0: Boolean) => setSingleSided(t0).runNow()))
        __obj.asInstanceOf[BufferParameters]
      }
      
      extension [Self <: BufferParameters](x: Self) {
        
        inline def setBufferDistanceError(value: Double => Double): Self = StObject.set(x, "bufferDistanceError", js.Any.fromFunction1(value))
        
        inline def setGetEndCapStyle(value: CallbackTo[Double]): Self = StObject.set(x, "getEndCapStyle", value.toJsFn)
        
        inline def setGetJoinStyle(value: CallbackTo[Double]): Self = StObject.set(x, "getJoinStyle", value.toJsFn)
        
        inline def setGetMitreLimit(value: CallbackTo[Double]): Self = StObject.set(x, "getMitreLimit", value.toJsFn)
        
        inline def setGetQuadrantSegments(value: CallbackTo[Double]): Self = StObject.set(x, "getQuadrantSegments", value.toJsFn)
        
        inline def setIsSingleSided(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSingleSided", value.toJsFn)
        
        inline def setSetEndCapStyle(value: Double => Callback): Self = StObject.set(x, "setEndCapStyle", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetJoinStyle(value: Double => Callback): Self = StObject.set(x, "setJoinStyle", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetMitreLimit(value: Double => Callback): Self = StObject.set(x, "setMitreLimit", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetQuadrantSegments(value: Double => Callback): Self = StObject.set(x, "setQuadrantSegments", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetSingleSided(value: Boolean => Callback): Self = StObject.set(x, "setSingleSided", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      }
    }
  }
  
  object distance {
    
    trait DistanceOp extends StObject {
      
      /**
        * Report the distance between the nearest points on the input geometries.
        *
        * @returns {double} the distance between the geometries or 0 if either input geometry is empty
        *
        * @throws {IllegalArgumentException} if either input geometry is null
        */
      def distance(): Double
      
      /**
        * Report the locations of the nearest points in the input geometries.
        * The locations are presented in the same order as the input Geometries.
        *
        * @returns a pair of GeometryLocations for the nearest points
        */
      def nearestLocations(): js.Tuple2[GeometryLocation, GeometryLocation]
      
      /**
        * Report the coordinates of the nearest points in the input geometries.
        * The points are presented in the same order as the input Geometries.
        *
        * @returns a pair of Coordinates of the nearest points
        */
      def nearestPoints(): js.Tuple2[Coordinate, Coordinate]
    }
    object DistanceOp {
      
      inline def apply(
        distance: CallbackTo[Double],
        nearestLocations: CallbackTo[js.Tuple2[GeometryLocation, GeometryLocation]],
        nearestPoints: CallbackTo[js.Tuple2[Coordinate, Coordinate]]
      ): DistanceOp = {
        val __obj = js.Dynamic.literal(distance = distance.toJsFn, nearestLocations = nearestLocations.toJsFn, nearestPoints = nearestPoints.toJsFn)
        __obj.asInstanceOf[DistanceOp]
      }
      
      extension [Self <: DistanceOp](x: Self) {
        
        inline def setDistance(value: CallbackTo[Double]): Self = StObject.set(x, "distance", value.toJsFn)
        
        inline def setNearestLocations(value: CallbackTo[js.Tuple2[GeometryLocation, GeometryLocation]]): Self = StObject.set(x, "nearestLocations", value.toJsFn)
        
        inline def setNearestPoints(value: CallbackTo[js.Tuple2[Coordinate, Coordinate]]): Self = StObject.set(x, "nearestPoints", value.toJsFn)
      }
    }
    
    trait GeometryLocation extends StObject {
      
      /**
        * Returns the Coordinate of this location.
        */
      def getCoordinate(): Coordinate
      
      /**
        * Returns the geometry component on (or in) which this location occurs.
        */
      def getGeometryComponent(): Geometry
      
      /**
        * Returns the segment index for this location.
        * If the location is inside an area, the index will have the value INSIDE_AREA;
        *
        * @returns {int} the segment index for the location, or INSIDE_AREA
        */
      def getSegmentIndex(): Double
      
      /**
        * Tests whether this location represents a point inside an area geometry.
        */
      def isInsideArea(): Boolean
    }
    object GeometryLocation {
      
      inline def apply(
        getCoordinate: CallbackTo[Coordinate],
        getGeometryComponent: CallbackTo[Geometry],
        getSegmentIndex: CallbackTo[Double],
        isInsideArea: CallbackTo[Boolean]
      ): GeometryLocation = {
        val __obj = js.Dynamic.literal(getCoordinate = getCoordinate.toJsFn, getGeometryComponent = getGeometryComponent.toJsFn, getSegmentIndex = getSegmentIndex.toJsFn, isInsideArea = isInsideArea.toJsFn)
        __obj.asInstanceOf[GeometryLocation]
      }
      
      extension [Self <: GeometryLocation](x: Self) {
        
        inline def setGetCoordinate(value: CallbackTo[Coordinate]): Self = StObject.set(x, "getCoordinate", value.toJsFn)
        
        inline def setGetGeometryComponent(value: CallbackTo[Geometry]): Self = StObject.set(x, "getGeometryComponent", value.toJsFn)
        
        inline def setGetSegmentIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getSegmentIndex", value.toJsFn)
        
        inline def setIsInsideArea(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInsideArea", value.toJsFn)
      }
    }
  }
  
  object relate {
    
    trait RelateOp
      extends StObject
         with GeometryGraphOperation {
      
      def getIntersectionMatrix(): IntersectionMatrix
    }
    object RelateOp {
      
      inline def apply(
        getArgGeometry: Double => Geometry,
        getIntersectionMatrix: CallbackTo[IntersectionMatrix],
        setComputationPrecision: PrecisionModel => Callback
      ): RelateOp = {
        val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), getIntersectionMatrix = getIntersectionMatrix.toJsFn, setComputationPrecision = js.Any.fromFunction1((t0: PrecisionModel) => setComputationPrecision(t0).runNow()))
        __obj.asInstanceOf[RelateOp]
      }
      
      extension [Self <: RelateOp](x: Self) {
        
        inline def setGetIntersectionMatrix(value: CallbackTo[IntersectionMatrix]): Self = StObject.set(x, "getIntersectionMatrix", value.toJsFn)
      }
    }
  }
}
