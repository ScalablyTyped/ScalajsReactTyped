package typingsJapgolly.atom

import typingsJapgolly.atom.anon.ReadonlyRange
import typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.PointLike
import typingsJapgolly.atom.dependenciesTextBufferSrcTextBufferMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesTextBufferSrcRangeMod {
  
  @JSImport("atom/dependencies/text-buffer/src/range", "Range")
  @js.native
  /** Construct a Range object. */
  open class Range () extends StObject {
    def this(pointA: PointCompatible) = this()
    def this(pointA: Unit, pointB: PointCompatible) = this()
    def this(pointA: PointCompatible, pointB: PointCompatible) = this()
    
    // Comparison
    /**
      *  Compare two Ranges.
      *  Returns -1 if this range starts before the argument or contains it.
      *  Returns 0 if this range is equivalent to the argument.
      *  Returns 1 if this range starts after the argument or is contained by it.
      */
    def compare(otherRange: RangeCompatible): Double = js.native
    
    /** Returns a boolean indicating whether this range contains the given point. */
    def containsPoint(point: PointCompatible): Boolean = js.native
    def containsPoint(point: PointCompatible, exclusive: Boolean): Boolean = js.native
    
    /** Returns a boolean indicating whether this range contains the given range. */
    def containsRange(otherRange: RangeCompatible): Boolean = js.native
    def containsRange(otherRange: RangeCompatible, exclusive: Boolean): Boolean = js.native
    
    /** Returns a new range with the same start and end positions. */
    def copy(): Range = js.native
    
    // NOTE: this function doesn't actually take a range-compatible parameter.
    /**
      *  Returns a Boolean indicating whether this range starts and ends on the
      *  same row as the argument.
      */
    def coversSameRows(otherRange: RangeLike): Boolean = js.native
    
    /** A Point representing the end of the Range. */
    var end: Point = js.native
    
    // Operations
    /**
      *  Freezes the range and its start and end point so it becomes immutable
      *  and returns itself.
      */
    def freeze(): ReadonlyRange = js.native
    
    /** Get the number of rows in this range. */
    def getRowCount(): Double = js.native
    
    /** Returns an array of all rows in the range. */
    def getRows(): js.Array[Double] = js.native
    
    /**
      *  Returns a boolean indicating whether this range intersects the given
      *  row number.
      */
    def intersectsRow(row: Double): Boolean = js.native
    
    /**
      *  Returns a boolean indicating whether this range intersects the row range
      *  indicated by the given startRow and endRow numbers.
      */
    def intersectsRowRange(startRow: Double, endRow: Double): Boolean = js.native
    
    // NOTE: this function doesn't actually take a range-compatible parameter.
    /** Determines whether this range intersects with the argument. */
    def intersectsWith(otherRange: RangeLike): Boolean = js.native
    def intersectsWith(otherRange: RangeLike, exclusive: Boolean): Boolean = js.native
    
    // Range Details
    /** Is the start position of this range equal to the end position? */
    def isEmpty(): Boolean = js.native
    
    /**
      *  Returns a Boolean indicating whether this range has the same start and
      *  end points as the given Range.
      */
    def isEqual(otherRange: RangeCompatible): Boolean = js.native
    
    /**
      *  Returns a boolean indicating whether this range starts and ends on the
      *  same row.
      */
    def isSingleLine(): Boolean = js.native
    
    /** Returns a new range with the start and end positions negated. */
    def negate(): Range = js.native
    
    // Serialization and Deserialization
    /** Returns a plain javascript object representation of the Range. */
    def serialize(): js.Array[js.Array[Double]] = js.native
    
    // Properties
    /** A Point representing the start of the Range. */
    var start: Point = js.native
    
    /**
      *  Build and return a new range by translating this range's start and end
      *  points by the given delta(s).
      */
    def translate(startDelta: PointCompatible): Range = js.native
    def translate(startDelta: PointCompatible, endDelta: PointCompatible): Range = js.native
    
    /**
      *  Build and return a new range by traversing this range's start and end
      *  points by the given delta.
      */
    def traverse(delta: PointCompatible): Range = js.native
    
    // NOTE: this function doesn't actually take a range-compatible parameter.
    /** Returns a new range that contains this range and the given range. */
    def union(other: RangeLike): Range = js.native
  }
  /* static members */
  object Range {
    
    @JSImport("atom/dependencies/text-buffer/src/range", "Range")
    @js.native
    val ^ : js.Any = js.native
    
    /** Call this with the result of Range::serialize to construct a new Range. */
    inline def deserialize(array: js.Object): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(array.asInstanceOf[js.Any]).asInstanceOf[Range]
    
    // Construction
    /** Convert any range-compatible object to a Range. */
    inline def fromObject(`object`: RangeCompatible): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Range]
    inline def fromObject(`object`: RangeCompatible, copy: Boolean): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[Range]
  }
  
  type RangeCompatible = RangeLike | (js.Tuple2[PointLike | (js.Tuple2[Double, Double]), PointLike | (js.Tuple2[Double, Double])])
  
  trait RangeLike extends StObject {
    
    /** A Point representing the end of the Range. */
    var end: PointLike
    
    /** A Point representing the start of the Range. */
    var start: PointLike
  }
  object RangeLike {
    
    inline def apply(end: PointLike, start: PointLike): RangeLike = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeLike]
    }
    
    extension [Self <: RangeLike](x: Self) {
      
      inline def setEnd(value: PointLike): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: PointLike): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
