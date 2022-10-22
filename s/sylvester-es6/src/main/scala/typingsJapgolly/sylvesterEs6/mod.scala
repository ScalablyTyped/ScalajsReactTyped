package typingsJapgolly.sylvesterEs6

import typingsJapgolly.sylvesterEs6.sylvesterEs6Strings.convex
import typingsJapgolly.sylvesterEs6.sylvesterEs6Strings.reflex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sylvester-es6", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sylvester-es6", "CircularLinkedList")
  @js.native
  /**
    * Constructor function.
    */
  open class CircularLinkedList () extends LinkedList {
    
    /**
      * Appends a node into the list.
      */
    def append(node: LinkedListNode): Unit = js.native
    
    /**
      * Inserts a node before another node.
      */
    def insertAfter(node: LinkedListNode, newNode: LinkedListNode): Unit = js.native
    
    /**
      * Inserts a node after another node.
      */
    def insertBefore(node: LinkedListNode, newNode: LinkedListNode): Unit = js.native
    
    /**
      * Prepend a node into the list.
      */
    def prepend(node: LinkedListNode): Unit = js.native
    
    /**
      * Removes the given node.
      */
    def remove(node: LinkedListNode): Unit = js.native
    
    /**
      * Retrieves a node given a data. Returns `null` upon no matches.
      */
    def withData(data: Any): LinkedListNode | Null = js.native
  }
  /* static members */
  object CircularLinkedList {
    
    @JSImport("sylvester-es6", "CircularLinkedList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a linked list from an array
      */
    inline def fromArray(list: js.Array[Any], useNodes: Boolean): CircularLinkedList = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(list.asInstanceOf[js.Any], useNodes.asInstanceOf[js.Any])).asInstanceOf[CircularLinkedList]
  }
  
  @JSImport("sylvester-es6", "Line")
  @js.native
  open class Line protected () extends StObject {
    /**
      * Constructor function.
      */
    def this(anchor: js.Array[Double], direction: js.Array[Double]) = this()
    def this(anchor: js.Array[Double], direction: Vector) = this()
    def this(anchor: Vector, direction: js.Array[Double]) = this()
    def this(anchor: Vector, direction: Vector) = this()
    
    /**
      * Gets the 3D vector corresponding to a point on the line.
      */
    var anchor: Vector = js.native
    
    /**
      * Returns true if the argument is a point on the line.
      */
    def contains(point: Vector): Boolean = js.native
    
    /**
      * Gets a normalized 3D vector representing the line's direction.
      */
    var direction: Vector = js.native
    
    def distanceFrom(obj: Line): Double = js.native
    def distanceFrom(obj: Plane): Double = js.native
    /**
      * Returns the line's perpendicular distance from the argument, which can be a point, a line or a plane.
      */
    def distanceFrom(obj: Vector): Double = js.native
    
    /**
      * Returns a copy of the line.
      */
    def dup(): Line = js.native
    
    /**
      * Returns true if the argument occupies the same space as the line.
      */
    def eql(line: Line): Boolean = js.native
    
    /**
      * Returns the unique intersection point with the argument, if one exists.
      */
    def intersectionWith(obj: Line): Vector = js.native
    def intersectionWith(obj: Plane): Vector = js.native
    
    /**
      * Returns true if the line has a unique point of intersection with the argument.
      */
    def intersects(obj: Line): Boolean = js.native
    def intersects(obj: Plane): Boolean = js.native
    
    /**
      * Returns true if the line is parallel to the argument. Here, 'parallel to' means that the argument's
      * direction is either parallel or antiparallel to the line's own direction. A line is parallel to a
      * plane if the two do not have a unique intersection.
      */
    def isParallelTo(obj: Line): Boolean = js.native
    def isParallelTo(obj: Plane): Boolean = js.native
    
    /**
      * Returns true if the line lies in the given plane.
      */
    def liesIn(plane: Plane): Boolean = js.native
    
    def pointClosestTo(obj: js.Array[Double]): Vector = js.native
    def pointClosestTo(obj: Line): Vector = js.native
    /**
      * Returns the point on the line that is closest to the given point or line.
      */
    def pointClosestTo(obj: Vector): Vector = js.native
    
    def reflectionIn(obj: Line): Line = js.native
    def reflectionIn(obj: Plane): Line = js.native
    /**
      * Returns the line's reflection in the given point or line.
      */
    def reflectionIn(obj: Vector): Line = js.native
    
    def rotate(t: Double, axis: Line): Line = js.native
    /**
      * Returns a copy of the line rotated by t radians about the given line. Works by finding the argument's
      * closest point to this line's anchor point (call this C) and rotating the anchor about C. Also rotates
      * the line's direction about the argument's. Be careful with this - the rotation axis' direction
      * affects the outcome!
      */
    def rotate(t: Double, axis: Vector): Line = js.native
    
    /**
      * Set the line's anchor point and direction.
      */
    def setVectors(anchor: js.Array[Double], direction: js.Array[Double]): Line = js.native
    def setVectors(anchor: js.Array[Double], direction: Vector): Line = js.native
    def setVectors(anchor: Vector, direction: js.Array[Double]): Line = js.native
    def setVectors(anchor: Vector, direction: Vector): Line = js.native
    
    def translate(vector: js.Array[Double]): Line = js.native
    /**
      * Returns the result of translating the line by the given vector/array.
      */
    def translate(vector: Vector): Line = js.native
  }
  /* static members */
  object Line {
    
    @JSImport("sylvester-es6", "Line")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sylvester-es6", "Line.X")
    @js.native
    def X: Line = js.native
    inline def X_=(x: Line): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
    
    @JSImport("sylvester-es6", "Line.Y")
    @js.native
    def Y: Line = js.native
    inline def Y_=(x: Line): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
    
    @JSImport("sylvester-es6", "Line.Z")
    @js.native
    def Z: Line = js.native
    inline def Z_=(x: Line): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sylvester-es6", "LineSegment")
  @js.native
  open class LineSegment protected () extends StObject {
    def this(v1: js.Array[Double], v2: js.Array[Double]) = this()
    def this(v1: js.Array[Double], v2: Vector) = this()
    def this(v1: Vector, v2: js.Array[Double]) = this()
    /**
      * Constructor function.
      */
    def this(v1: Vector, v2: Vector) = this()
    
    /**
      * Returns the plane that bisects this segment.
      */
    def bisectingPlane(): Plane = js.native
    
    def contains(point: Line): Boolean = js.native
    def contains(point: Plane): Boolean = js.native
    /**
      * Returns true if the argument is a point on the line.
      */
    def contains(point: Vector): Boolean = js.native
    
    def distanceFrom(obj: Line): Double = js.native
    def distanceFrom(obj: Plane): Double = js.native
    /**
      * Returns the vector's distance from the argument, when considered as a point in space.
      */
    def distanceFrom(obj: Vector): Double = js.native
    
    /**
      * Returns a duplicate of this segment.
      */
    def dup(): LineSegment = js.native
    
    /**
      * Whether a segment is equal to this segment.
      */
    def eql(segment: LineSegment): Boolean = js.native
    
    /**
      * Returns the unique intersection point with the argument, if one exists.
      */
    def intersectionWith(obj: Line): Vector = js.native
    def intersectionWith(obj: Plane): Vector = js.native
    
    /**
      * Returns true if the line has a unique point of intersection with the argument.
      */
    def intersects(obj: Line): Boolean = js.native
    def intersects(obj: Plane): Boolean = js.native
    
    /**
      * Returns true if the line is parallel to the argument. Here, 'parallel to' means that the argument's
      * direction is either parallel or antiparallel to the line's own direction. A line is parallel to a
      * plane if the two do not have a unique intersection.
      */
    def isParallelTo(obj: Line): Boolean = js.native
    def isParallelTo(obj: Plane): Boolean = js.native
    
    /**
      * Returns the length of this segment.
      */
    def length(): Double = js.native
    
    /**
      * Returns the midpoint of this segment as a vector.
      */
    def midpoint(): Vector = js.native
    
    def pointClosestTo(obj: js.Array[Double]): Vector = js.native
    def pointClosestTo(obj: Line): Vector = js.native
    /**
      * Returns the point on the line that is closest to the given point or line.
      */
    def pointClosestTo(obj: Vector): Vector = js.native
    
    def setPoints(startPoint: js.Array[Double], endPoint: js.Array[Double]): LineSegment | Null = js.native
    def setPoints(startPoint: js.Array[Double], endPoint: Vector): LineSegment | Null = js.native
    def setPoints(startPoint: Vector, endPoint: js.Array[Double]): LineSegment | Null = js.native
    /**
      * Sets the initial point of the line segments
      */
    def setPoints(startPoint: Vector, endPoint: Vector): LineSegment | Null = js.native
    
    /**
      * Converts this segment into a single vector.
      */
    def toVector(): Vector = js.native
    
    def translate(vector: js.Array[Double]): LineSegment = js.native
    /**
      * Translates this segment given a vector.
      */
    def translate(vector: Vector): LineSegment = js.native
  }
  
  @JSImport("sylvester-es6", "LinkedList")
  @js.native
  /**
    * Constructor function.
    */
  open class LinkedList () extends StObject {
    
    /**
      * Get the node at a given index.
      */
    def at(i: Double): LinkedListNode = js.native
    
    def each(fn: js.Function2[/* node */ LinkedListNode, /* i */ Double, Any], context: Any): Unit = js.native
    
    /**
      * The first element in the linked list.
      */
    var first: LinkedListNode = js.native
    
    /**
      * Executes a function to each of the node.
      */
    def forEach(fn: js.Function2[/* node */ LinkedListNode, /* i */ Double, Any], context: Any): Unit = js.native
    
    /**
      * The last element in the linked list.
      */
    var last: LinkedListNode = js.native
    
    /**
      * The length of the linked list.
      */
    var length: Double = js.native
    
    /**
      * Get a random node in the list.
      */
    def randomNode(): LinkedListNode = js.native
    
    /**
      * Convert this linked list into an array.
      */
    def toArray(): js.Array[Any] = js.native
  }
  /* static members */
  object LinkedList {
    
    @JSImport("sylvester-es6", "LinkedList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a circular linked list
      */
    inline def Circular(data: Any): CircularLinkedList = ^.asInstanceOf[js.Dynamic].applyDynamic("Circular")(data.asInstanceOf[js.Any]).asInstanceOf[CircularLinkedList]
    
    /**
      * Creates a node given the data.
      */
    inline def Node(data: Any): LinkedListNode = ^.asInstanceOf[js.Dynamic].applyDynamic("Node")(data.asInstanceOf[js.Any]).asInstanceOf[LinkedListNode]
  }
  
  @JSImport("sylvester-es6", "LinkedListNode")
  @js.native
  open class LinkedListNode protected () extends StObject {
    /**
      * Constructor function.
      */
    def this(data: Any) = this()
    
    /**
      * Current data.
      */
    var data: Any = js.native
    
    /**
      * Next data.
      */
    var next: Any = js.native
    
    /**
      * Previous data.
      */
    var prev: Any = js.native
  }
  
  @JSImport("sylvester-es6", "Matrix")
  @js.native
  open class Matrix protected () extends StObject {
    /**
      * Constructor function.
      */
    def this(elements: js.Array[js.Array[Double] | Double]) = this()
    def this(elements: Matrix) = this()
    def this(elements: Vector) = this()
    
    /**
      * Returns the result of adding another matrix to the matrix.
      */
    def add(matrix: Matrix): Matrix = js.native
    /**
      * Returns the result of adding a vector to the matrix.
      */
    def add(vector: Vector): Vector = js.native
    
    def augment(matrix: js.Array[js.Array[Double] | Double]): Matrix = js.native
    def augment(matrix: Matrix): Matrix = js.native
    /**
      * Returns the result of attaching the given argument to the right-hand side of the matrix.
      */
    def augment(matrix: Vector): Matrix = js.native
    
    /**
      * Returns true iff the matrix can multiply the argument from the left.
      */
    def canMultiplyFromLeft(matrix: Matrix): Boolean = js.native
    
    /**
      * Returns column k of the matrix as a vector.
      */
    def col(j: Double): Vector = js.native
    
    /**
      * Returns the number of columns in the matrix.
      */
    def cols(): Double = js.native
    
    def det(): Double = js.native
    
    /**
      * Returns the determinant for square matrices.
      */
    def determinant(): Double = js.native
    
    /**
      * If the matrix is square, returns the diagonal elements as a vector; otherwise, returns null.
      */
    def diagonal(): Vector = js.native
    
    /**
      * Returns the number of rows/columns the matrix has.
      */
    def dimensions(): Any = js.native
    
    /**
      * Returns a copy of the matrix.
      */
    def dup(): Matrix = js.native
    
    /**
      * Returns element (i,j) of the matrix.
      */
    def e(i: Double, j: Double): Any = js.native
    
    /**
      * Gets a nested array containing the matrix's elements.
      */
    var elements: js.Array[js.Array[Double]] = js.native
    
    def eql(matrix: js.Array[js.Array[Double] | Double]): Boolean = js.native
    def eql(matrix: Matrix): Boolean = js.native
    /**
      * Returns true if the matrix is equal to the argument. You can supply a vector as the argument,
      * in which case the receiver must be a one-column matrix equal to the vector.
      */
    def eql(matrix: Vector): Boolean = js.native
    
    /**
      * Returns the indices of the first match found by reading row-by-row from left to right.
      */
    def indexOf(x: Double): Any = js.native
    
    /**
      * Returns a string representation of the matrix.
      */
    def inspect(): String = js.native
    
    def inv(): Matrix = js.native
    
    /**
      * Returns the inverse (if one exists) using Gauss-Jordan.
      */
    def inverse(): Matrix = js.native
    
    /**
      * Returns true iff the argument has the same dimensions as the matrix.
      */
    def isSameSizeAs(matrix: Matrix): Boolean = js.native
    
    /**
      * Returns true if the matrix is singular.
      */
    def isSingular(): Boolean = js.native
    
    /**
      * Returns true if the matrix is square.
      */
    def isSquare(): Boolean = js.native
    
    /**
      * Maps the matrix to another matrix (of the same dimensions) according to the given function.
      */
    def map(fn: js.Function3[/* x */ Double, /* i */ Double, /* j */ Double, Any]): Matrix = js.native
    
    /**
      * Returns the (absolute) largest element of the matrix.
      */
    def max(): Double = js.native
    
    /**
      * Returns a submatrix taken from the matrix. Argument order is: start row, start col, nrows, ncols.
      * Element selection wraps if the required index is outside the matrix's bounds, so you could use
      * this to perform row/column cycling or copy-augmenting.
      */
    def minor(a: Double, b: Double, c: Double, d: Double): Matrix = js.native
    
    /**
      * Returns the result of multiplying the matrix from the right by the argument. If the argument is a scalar
      * then just multiply all the elements. If the argument is a vector, a vector is returned, which saves you
      * having to remember calling col(1) on the result.
      */
    def multiply(matrix: Double): Matrix = js.native
    def multiply(matrix: Matrix): Matrix = js.native
    /**
      * Returns the result of multiplying the matrix from the right by the argument. If the argument is a scalar
      * then just multiply all the elements. If the argument is a vector, a vector is returned, which saves you
      * having to remember calling col(1) on the result.
      */
    def multiply(vector: Vector): Vector = js.native
    
    /**
      * Returns the rank of the matrix.
      */
    def rank(): Double = js.native
    
    def rk(): Double = js.native
    
    /**
      * Returns the result of rounding all the elements.
      */
    def round(): Matrix = js.native
    
    /**
      * Returns row k of the matrix as a vector.
      */
    def row(i: Double): Vector = js.native
    
    /**
      * Returns the number of rows in the matrix.
      */
    def rows(): Double = js.native
    
    /**
      * Set the matrix's elements from an array. If the argument passed is a vector, the resulting matrix
      * will be a single column.
      */
    def setElements(matrix: js.Array[js.Array[Double] | Double]): Matrix = js.native
    def setElements(matrix: Matrix): Matrix = js.native
    def setElements(matrix: Vector): Matrix = js.native
    
    /**
      * Returns a copy of the matrix with elements set to the given value if they differ from it
      * by less than Sylvester.precision.
      */
    def snapTo(x: Double): Matrix = js.native
    
    /**
      * Returns the result of subtracting the argument from the matrix.
      */
    def subtract(matrix: Matrix): Matrix = js.native
    
    /**
      * Make the matrix upper (right) triangular by Gaussian elimination. This method only adds multiples
      * of rows to other rows. No rows are scaled up or switched, and the determinant is preserved.
      */
    def toRightTriangular(): Matrix = js.native
    
    def toUpperTriangular(): Matrix = js.native
    
    def tr(): Double = js.native
    
    /**
      * Returns the trace for square matrices.
      */
    def trace(): Double = js.native
    
    /**
      * Returns the transpose of the matrix.
      */
    def transpose(): Matrix = js.native
    
    def x(matrix: Double): Matrix = js.native
    def x(matrix: Matrix): Matrix = js.native
    def x(vector: Vector): Vector = js.native
  }
  /* static members */
  object Matrix {
    
    @JSImport("sylvester-es6", "Matrix")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Diagonal matrix - all off-diagonal elements are zero
      */
    inline def Diagonal(elements: js.Array[js.Array[Double] | Double]): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Diagonal")(elements.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    inline def Diagonal(elements: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Diagonal")(elements.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    inline def Diagonal(elements: Vector): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Diagonal")(elements.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    /**
      * Identity matrix of size n.
      */
    inline def I(n: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("I")(n.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    /**
      * Random matrix of n rows, m columns.
      */
    inline def Random(n: Double, m: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Rotation matrix about some axis. If no axis is supplied, assume we're after a 2D transform.
      */
    inline def Rotation(theta: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Rotation")(theta.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    inline def Rotation(theta: Double, a: Vector): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotation")(theta.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    inline def RotationX(t: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationX")(t.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    inline def RotationY(t: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationY")(t.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    inline def RotationZ(t: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationZ")(t.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    /**
      * Matrix filled with zeros.
      */
    inline def Zero(n: Double, m: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Zero")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  }
  
  @JSImport("sylvester-es6", "PRECISION")
  @js.native
  val PRECISION: Double = js.native
  
  @JSImport("sylvester-es6", "Plane")
  @js.native
  open class Plane protected () extends StObject {
    /**
      * Constructor function.
      */
    def this(anchor: js.Array[Double], v1: js.Array[Double]) = this()
    def this(anchor: js.Array[Double], v1: Vector) = this()
    def this(anchor: Vector, v1: js.Array[Double]) = this()
    def this(anchor: Vector, v1: Vector) = this()
    def this(anchor: js.Array[Double], v1: js.Array[Double], v2: js.Array[Double]) = this()
    def this(anchor: js.Array[Double], v1: js.Array[Double], v2: Vector) = this()
    def this(anchor: js.Array[Double], v1: Vector, v2: js.Array[Double]) = this()
    def this(anchor: js.Array[Double], v1: Vector, v2: Vector) = this()
    def this(anchor: Vector, v1: js.Array[Double], v2: js.Array[Double]) = this()
    def this(anchor: Vector, v1: js.Array[Double], v2: Vector) = this()
    def this(anchor: Vector, v1: Vector, v2: js.Array[Double]) = this()
    def this(anchor: Vector, v1: Vector, v2: Vector) = this()
    
    /**
      * Gets the 3D vector corresponding to a point in the plane.
      */
    var anchor: Vector = js.native
    
    def contains(obj: Line): Boolean = js.native
    /**
      * Returns true if the plane contains the given point or line.
      */
    def contains(obj: Vector): Boolean = js.native
    
    def distanceFrom(obj: Line): Double = js.native
    def distanceFrom(obj: Plane): Double = js.native
    /**
      * Returns the plane's distance from the given object (point, line or plane).
      *
      * @parm {Vector|Line|Plane} obj The object.
      */
    def distanceFrom(obj: Vector): Double = js.native
    
    /**
      * Returns a copy of the plane.
      */
    def dup(): Plane = js.native
    
    /**
      * Returns true if the plane occupies the same space as the argument.
      */
    def eql(plane: Plane): Boolean = js.native
    
    /**
      * Returns the unique intersection with the argument, if one exists.
      */
    def intersectionWith(line: Line): Vector = js.native
    /**
      * Returns the unique intersection with the argument, if one exists.
      */
    def intersectionWith(plane: Plane): Line = js.native
    
    /**
      * Returns true if the plane has a unique point/line of intersection with the argument.
      */
    def intersects(obj: Line): Boolean = js.native
    def intersects(obj: Plane): Boolean = js.native
    
    /**
      * Returns true if the plane is parallel to the argument. Will return true if the planes are equal,
      * or if you give a line and it lies in the plane.
      */
    def isParallelTo(obj: Line): Boolean = js.native
    def isParallelTo(obj: Plane): Boolean = js.native
    
    /**
      * Returns true if the receiver is perpendicular to the argument.
      */
    def isPerpendicularTo(plane: Plane): Boolean = js.native
    
    /**
      * Gets a normalized 3D vector perpendicular to the plane.
      */
    var normal: Vector = js.native
    
    def pointClosestTo(point: js.Array[Double]): Vector = js.native
    /**
      * Returns the point in the plane closest to the given point.
      */
    def pointClosestTo(point: Vector): Vector = js.native
    
    def reflectionIn(obj: Line): Plane = js.native
    def reflectionIn(obj: Plane): Plane = js.native
    /**
      * Returns the reflection of the plane in the given point, line or plane.
      */
    def reflectionIn(obj: Vector): Plane = js.native
    
    /**
      * Returns a copy of the plane, rotated by t radians about the given line. See notes on Line#rotate.
      */
    def rotate(t: Double, axis: Line): Plane = js.native
    
    /**
      * Sets the anchor point and normal to the plane. The normal is calculated by assuming the three points
      * should lie in the same plane. Normal vector is normalised before storage.
      */
    def setVectors(anchor: js.Array[Double], v1: js.Array[Double]): Plane = js.native
    def setVectors(anchor: js.Array[Double], v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
    def setVectors(anchor: js.Array[Double], v1: js.Array[Double], v2: Vector): Plane = js.native
    def setVectors(anchor: js.Array[Double], v1: Vector): Plane = js.native
    def setVectors(anchor: js.Array[Double], v1: Vector, v2: js.Array[Double]): Plane = js.native
    def setVectors(anchor: js.Array[Double], v1: Vector, v2: Vector): Plane = js.native
    def setVectors(anchor: Vector, v1: js.Array[Double]): Plane = js.native
    def setVectors(anchor: Vector, v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
    def setVectors(anchor: Vector, v1: js.Array[Double], v2: Vector): Plane = js.native
    def setVectors(anchor: Vector, v1: Vector): Plane = js.native
    def setVectors(anchor: Vector, v1: Vector, v2: js.Array[Double]): Plane = js.native
    def setVectors(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
    
    /**
      * Returns the result of translating the plane by the given vector.
      */
    def translate(vector: js.Array[Double]): Plane = js.native
    def translate(vector: Vector): Plane = js.native
  }
  /* static members */
  object Plane {
    
    @JSImport("sylvester-es6", "Plane")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sylvester-es6", "Plane.XY")
    @js.native
    def XY: Plane = js.native
    inline def XY_=(x: Plane): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XY")(x.asInstanceOf[js.Any])
    
    @JSImport("sylvester-es6", "Plane.YX")
    @js.native
    def YX: Plane = js.native
    inline def YX_=(x: Plane): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YX")(x.asInstanceOf[js.Any])
    
    @JSImport("sylvester-es6", "Plane.YZ")
    @js.native
    def YZ: Plane = js.native
    inline def YZ_=(x: Plane): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YZ")(x.asInstanceOf[js.Any])
    
    @JSImport("sylvester-es6", "Plane.ZX")
    @js.native
    def ZX: Plane = js.native
    inline def ZX_=(x: Plane): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZX")(x.asInstanceOf[js.Any])
    
    /**
      * Constructs a plane from a list of points.
      */
    inline def fromPoints(points: js.Array[js.Array[Double] | Vector]): Plane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[Plane]
  }
  
  @JSImport("sylvester-es6", "Polygon")
  @js.native
  open class Polygon protected () extends StObject {
    /**
      * Constructor function.
      */
    def this(points: js.Array[js.Array[Double] | Vector], plane: Plane) = this()
    
    /**
      * Retursn the area of the polygon.
      */
    def area(): Double = js.native
    
    /**
      * Returns the centroid of the polygon.
      */
    def centroid(): Vector = js.native
    
    /**
      * Clears the vertices caches.
      */
    def clearCache(): Unit = js.native
    
    def contains(point: js.Array[Double]): Boolean = js.native
    /**
      * Whether the polygon contains a point.
      */
    def contains(point: Vector): Boolean = js.native
    
    def containsByWindingNumber(point: js.Array[Double]): Boolean = js.native
    /**
      * Whether the polygon contains a point.
      */
    def containsByWindingNumber(point: Vector): Boolean = js.native
    
    /**
      * Copies the vertices into the cache.
      */
    def copyVertices(): Unit = js.native
    
    /**
      * Returns a duplicate of this polygon.
      */
    def dup(): Polygon = js.native
    
    def hasEdgeContaining(point: js.Array[Double]): Boolean = js.native
    /**
      * Whether the point is an edge in the polygon.
      */
    def hasEdgeContaining(point: Vector): Boolean = js.native
    
    /**
      * Inspect the points on all vertices in the polygon.
      */
    def inspect(): String = js.native
    
    /**
      * Whether this polygon is a triangle or not.
      */
    def isTriangle(): Boolean = js.native
    
    /**
      * Gets the node given the vertex.
      */
    def nodeFor(vertex: Any): LinkedListNode = js.native
    
    /**
      * Populates the vertex type lists.
      */
    def populateVertexTypeLists(): Unit = js.native
    
    /**
      * Returns a projection of the polygon given the plane.
      */
    def projectionOn(plane: Plane): Polygon = js.native
    
    /**
      * Removes a vertex from the polygon.
      */
    def removeVertex(vertex: Any): Polygon | Null = js.native
    
    /**
      * Rotates the polygon.
      */
    def rotate(t: Double, line: Line): Polygon = js.native
    
    /**
      * Scale the polygon.
      */
    def scale(k: Double, point: js.Array[Double]): Polygon = js.native
    
    /**
      * Sets the cache of this polygon.
      */
    def setCache(key: String, value: Any): Any = js.native
    
    /**
      * Set the vertices of the polygon.
      */
    def setVertices(points: js.Array[js.Array[Double] | Vector], plane: Plane): Polygon = js.native
    
    /**
      * Converts the polygon into triangles.
      */
    def toTriangles(): js.Array[Polygon] = js.native
    
    def translate(vector: js.Array[Double]): Polygon = js.native
    /**
      * Translate the polygon given a vector.
      */
    def translate(vector: Vector): Polygon = js.native
    
    /**
      * Returns a collection of triangles used for calculating area and center of mass.
      */
    def trianglesForSurfaceIntegral(): js.Array[Polygon] = js.native
    
    /**
      * Implementation of ear clipping algorithm
      * Found in 'Triangulation by ear clipping', by David Eberly.
      * at http://www.geometrictools.com
      *
      * This will not deal with overlapping sections - contruct your polygons sensibly
      */
    def triangulateByEarClipping(): js.Array[Polygon] = js.native
    
    /**
      * Updates the plane properties of all the cached triangles belonging to the
      * polygon according to the given function.
      */
    def updateTrianglePlanes(fn: js.Function1[/* plane */ Plane, Any]): Unit = js.native
    
    /**
      * Gets the data of the vertex given the index.
      */
    def v(i: Double): LinkedListNode = js.native
    
    /**
      * The vertices of the polygon.
      */
    var vertices: CircularLinkedList = js.native
  }
  
  @JSImport("sylvester-es6", "Vector")
  @js.native
  open class Vector protected () extends StObject {
    def this(elements: js.Array[Double]) = this()
    /**
      * Constructor function.
      */
    def this(elements: Vector) = this()
    
    def add(vector: js.Array[Double]): Vector = js.native
    /**
      * Returns the result of adding the argument to the vector.
      */
    def add(vector: Vector): Vector = js.native
    
    /**
      * Returns the angle between the vector and the argument (also a vector).
      */
    def angleFrom(vector: Vector): Double = js.native
    
    def cross(vector: js.Array[Double]): Vector = js.native
    /**
      * Returns the vector product of the vector with the argument. Both vectors must have dimensionality 3.
      */
    def cross(vector: Vector): Vector = js.native
    
    /**
      * Returns the number of elements the vector has.
      */
    def dimensions(): Double = js.native
    
    def distanceFrom(obj: Line): Double = js.native
    def distanceFrom(obj: Plane): Double = js.native
    /**
      * Returns the vector's distance from the argument, when considered as a point in space.
      */
    def distanceFrom(obj: Vector): Double = js.native
    
    def dot(vector: js.Array[Double]): Double = js.native
    /**
      * Returns the scalar product of the vector with the argument. Both vectors must have equal dimensionality.
      *
      * @param: {Vector|number[]} vector The other vector.
      */
    def dot(vector: Vector): Double = js.native
    
    /**
      * Returns a copy of the vector.
      */
    def dup(): Vector = js.native
    
    /**
      * Returns element i of the vector.
      */
    def e(i: Double): Double = js.native
    
    /**
      * Calls the iterator for each element of the vector in turn.
      */
    def each(fn: js.Function2[/* x */ Double, /* i */ Double, Any]): Unit = js.native
    
    /**
      * Gets an array containing the vector's elements.
      */
    var elements: js.Array[Double] = js.native
    
    def eql(vector: js.Array[Double]): Boolean = js.native
    /**
      * Returns true if the vector is equal to the argument.
      */
    def eql(vector: Vector): Boolean = js.native
    
    /**
      * Returns the index of the first match found.
      */
    def indexOf(x: Double): Double = js.native
    
    /**
      * Returns a string representation of the vector.
      */
    def inspect(): String = js.native
    
    /**
      * Returns true if the vector is antiparallel to the argument.
      */
    def isAntiparallelTo(vector: Vector): Boolean = js.native
    
    /**
      * Returns true if the vector is parallel to the argument.
      */
    def isParallelTo(vector: Vector): Boolean = js.native
    
    /**
      * Returns true iff the vector is perpendicular to the argument.
      */
    def isPerpendicularTo(vector: Vector): Boolean = js.native
    
    /**
      * Return true if the vector is a point in the given plane.
      */
    def liesIn(plane: Plane): Boolean = js.native
    
    /**
      * Returns true if the vector is point on the given line.
      */
    def liesOn(line: Line): Boolean = js.native
    
    /**
      * Maps the vector to another vector according to the given function.
      */
    def map(fn: js.Function2[/* x */ Double, /* i */ Double, Any]): Vector = js.native
    
    /**
      * Returns the (absolute) largest element of the vector.
      */
    def max(): Double = js.native
    
    /**
      * Returns the modulus ('length') of the vector.
      */
    def modulus(): Double = js.native
    
    /**
      * Returns the result of multiplying the elements of the vector by the argument.
      */
    def multiply(k: Double): Vector = js.native
    
    def reflectionIn(obj: Line): Vector = js.native
    def reflectionIn(obj: Plane): Vector = js.native
    /**
      * Returns the result of reflecting the point in the given point, line or plane.
      */
    def reflectionIn(obj: Vector): Vector = js.native
    
    def rotate(t: Double, obj: Line): Vector = js.native
    /**
      * Rotates the vector about the given object. The object should be a point if the vector is 2D,
      * and a line if it is 3D. Be careful with line directions!
      */
    def rotate(t: Double, obj: Vector): Vector = js.native
    def rotate(t: Matrix, obj: Line): Vector = js.native
    def rotate(t: Matrix, obj: Vector): Vector = js.native
    
    /**
      * Returns the result of rounding the elements of the vector.
      */
    def round(): Vector = js.native
    
    def setElements(els: js.Array[Double]): Vector = js.native
    /**
      * Set vector's elements from an array.
      */
    def setElements(els: Vector): Vector = js.native
    
    /**
      * Returns a copy of the vector with elements set to the given value if they differ from
      * it by less than Sylvester.precision.
      */
    def snapTo(x: Double): Vector = js.native
    
    def subtract(vector: js.Array[Double]): Vector = js.native
    /**
      * Returns the result of subtracting the argument from the vector.
      */
    def subtract(vector: Vector): Vector = js.native
    
    /**
      * Utility to make sure vectors are 3D. If they are 2D, a zero z-component is added.
      */
    def to3D(): Vector = js.native
    
    /**
      * Returns a diagonal matrix with the vector's elements as its diagonal elements.
      */
    def toDiagonalMatrix(): Matrix = js.native
    
    /**
      * Returns a new vector created by normalizing the receiver.
      */
    def toUnitVector(): Vector = js.native
    
    /**
      * Returns the result of multiplying the elements of the vector by the argument (Alias for multiply(k)).
      */
    def x(k: Double): Vector = js.native
  }
  /* static members */
  object Vector {
    
    @JSImport("sylvester-es6", "Vector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Random vector of size n.
      */
    inline def Random(n: Double): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")(n.asInstanceOf[js.Any]).asInstanceOf[Vector]
    
    /**
      * Vector filled with zeros.
      */
    inline def Zero(n: Double): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")(n.asInstanceOf[js.Any]).asInstanceOf[Vector]
    
    @JSImport("sylvester-es6", "Vector.i")
    @js.native
    def i: Vector = js.native
    inline def i_=(x: Vector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i")(x.asInstanceOf[js.Any])
    
    @JSImport("sylvester-es6", "Vector.j")
    @js.native
    def j: Vector = js.native
    inline def j_=(x: Vector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("j")(x.asInstanceOf[js.Any])
    
    @JSImport("sylvester-es6", "Vector.k")
    @js.native
    def k: Vector = js.native
    inline def k_=(x: Vector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("k")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sylvester-es6", "Vertex")
  @js.native
  open class Vertex protected () extends Vector {
    def this(point: js.Array[Double]) = this()
    /**
      * The constructor function.
      */
    def this(point: Vector) = this()
    
    /**
      * Returns true iff the vertex's internal angle is 0 <= x < 180
      * in the context of the given polygon object. Returns null if the
      * vertex does not exist in the polygon.
      */
    def isConvex(polygon: Polygon): Boolean | Null = js.native
    
    /**
      * Returns true iff the vertex's internal angle is 180 <= x < 360.
      */
    def isReflex(polygon: Polygon): Boolean | Null = js.native
    
    /**
      * Returns the type of the vertex.
      */
    def `type`(polygon: Polygon): convex | reflex | Null = js.native
  }
  /* static members */
  object Vertex {
    
    @JSImport("sylvester-es6", "Vertex")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert points into an array of Vertex.
      */
    inline def convert(points: js.Array[js.Array[Double] | Vector]): js.Array[Vertex] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Vertex]]
  }
  
  inline def makeFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFrustum")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def makeLookAt(
    ex: Double,
    ey: Double,
    ez: Double,
    cx: Double,
    cy: Double,
    cz: Double,
    ux: Double,
    uy: Double,
    uz: Double
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLookAt")(ex.asInstanceOf[js.Any], ey.asInstanceOf[js.Any], ez.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], cz.asInstanceOf[js.Any], ux.asInstanceOf[js.Any], uy.asInstanceOf[js.Any], uz.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def makeOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOrtho")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def makePerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("makePerspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def mht(m: Matrix): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mht")(m.asInstanceOf[js.Any]).asInstanceOf[String]
}
