package typingsJapgolly.box2d.global.Box2D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  object Math {
    
    @JSGlobal("Box2D.Common.Math.b2Mat22")
    @js.native
    /**
      * Empty constructor
      **/
    open class b2Mat22 ()
      extends StObject
         with typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 {
      
      /**
        * Sets all internal matrix values to absolute values.
        **/
      /* CompleteClass */
      override def Abs(): Unit = js.native
      
      /**
        * Adds the two 2x2 matricies together and stores the result in this matrix.
        * @param m 2x2 matrix to add.
        **/
      /* CompleteClass */
      override def AddM(m: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22): Unit = js.native
      
      /**
        * Creates a copy of the matrix.
        * @return Copy of this 2x2 matrix.
        **/
      /* CompleteClass */
      override def Copy(): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = js.native
      
      /**
        * Gets the rotation matrix angle.
        * R(theta) = [ cos(theta)  -sin(theta) ]
        *            [ sin(theta)   cos(theta) ]
        * @return The rotation matrix angle (theta).
        **/
      /* CompleteClass */
      override def GetAngle(): Double = js.native
      
      /**
        * Compute the inverse of this matrix, such that inv(A) A = identity.
        * @param out Inverse matrix.
        * @return Inverse matrix.
        **/
      /* CompleteClass */
      override def GetInverse(out: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = js.native
      
      /**
        * Sets the 2x2 rotation matrix from the given angle.
        * R(theta) = [ cos(theta)  -sin(theta) ]
        *            [ sin(theta)   cos(theta) ]
        * @param angle Matrix angle (theta).
        **/
      /* CompleteClass */
      override def Set(angle: Double): Unit = js.native
      
      /**
        * Sets the 2x2 matrix to identity.
        **/
      /* CompleteClass */
      override def SetIdentity(): Unit = js.native
      
      /**
        * Sets the 2x2 matrix from a 2x2 matrix.
        * @param m 2x2 matrix values.
        **/
      /* CompleteClass */
      override def SetM(m: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22): Unit = js.native
      
      /**
        * Sets the 2x2 matrix from 2 column vectors.
        * @param c1 Column 1 vector.
        * @param c2 Column 2 vector.
        **/
      /* CompleteClass */
      override def SetVV(
        c1: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        c2: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): Unit = js.native
      
      /**
        * Sets the 2x2 matrix to all zeros.
        **/
      /* CompleteClass */
      override def SetZero(): Unit = js.native
      
      /**
        * TODO, has something to do with the determinant
        * @param out Solved vector
        * @param bX
        * @param bY
        * @return Solved vector
        **/
      /* CompleteClass */
      override def Solve(out: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2, bX: Double, bY: Double): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Column 1
        **/
      /* CompleteClass */
      var col1: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Column 2
        **/
      /* CompleteClass */
      var col2: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
    }
    /* static members */
    object b2Mat22 {
      
      @JSGlobal("Box2D.Common.Math.b2Mat22")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a rotation 2x2 matrix from the given angle.
        * R(theta) = [ cos(theta)  -sin(theta) ]
        *            [ sin(theta)   cos(theta) ]
        * @param angle Matrix angle (theta).
        * @return 2x2 matrix.
        **/
      inline def FromAngle(angle: Double): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22]
      
      /**
        * Creates a 2x2 matrix from two columns.
        * @param c1 Column 1 vector.
        * @param c2 Column 2 vector.
        * @return 2x2 matrix.
        **/
      inline def FromVV(
        c1: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        c2: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVV")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22]
    }
    
    @JSGlobal("Box2D.Common.Math.b2Mat33")
    @js.native
    open class b2Mat33 protected ()
      extends StObject
         with typingsJapgolly.box2d.Box2D.Common.Math.b2Mat33 {
      /**
        * Constructor
        * @param c1 Column 1
        * @param c2 Column 2
        * @param c3 Column 3
        **/
      def this(
        c1: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3,
        c2: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3,
        c3: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3
      ) = this()
      
      /**
        * Adds the two 3x3 matricies together and stores the result in this matrix.
        * @param m 3x3 matrix to add.
        **/
      /* CompleteClass */
      override def AddM(m: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat33): Unit = js.native
      
      /**
        * Creates a copy of the matrix.
        * @return Copy of this 3x3 matrix.
        **/
      /* CompleteClass */
      override def Copy(): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat33 = js.native
      
      /**
        * Sets the 3x3 matrix to identity.
        **/
      /* CompleteClass */
      override def SetIdentity(): Unit = js.native
      
      /**
        * Sets the 3x3 matrix from a 3x3 matrix.
        * @param m 3x3 matrix values.
        **/
      /* CompleteClass */
      override def SetM(m: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat33): Unit = js.native
      
      /**
        * Sets the 3x3 matrix from 3 column vectors.
        * @param c1 Column 1 vector.
        * @param c2 Column 2 vector.
        * @param c3 Column 2 vector.
        **/
      /* CompleteClass */
      override def SetVVV(
        c1: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3,
        c2: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3,
        c3: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3
      ): Unit = js.native
      
      /**
        * Sets the 3x3 matrix to all zeros.
        **/
      /* CompleteClass */
      override def SetZero(): Unit = js.native
      
      /**
        * TODO, has something to do with the determinant
        * @param out Solved vector
        * @param bX
        * @param bY
        * @return Solved vector
        **/
      /* CompleteClass */
      override def Solve22(out: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2, bX: Double, bY: Double): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * TODO, has something to do with the determinant
        * @param out Solved vector
        * @param bX
        * @param bY
        * @param bZ
        * @return Solved vector
        **/
      /* CompleteClass */
      override def Solve33(out: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3, bX: Double, bY: Double, bZ: Double): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3 = js.native
      
      /**
        * Column 1
        **/
      /* CompleteClass */
      var col1: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3 = js.native
      
      /**
        * Column 2
        **/
      /* CompleteClass */
      var col2: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3 = js.native
      
      /**
        * Column 3
        **/
      /* CompleteClass */
      var col3: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3 = js.native
    }
    
    @JSGlobal("Box2D.Common.Math.b2Math")
    @js.native
    open class b2Math ()
      extends StObject
         with typingsJapgolly.box2d.Box2D.Common.Math.b2Math
    /* static members */
    object b2Math {
      
      @JSGlobal("Box2D.Common.Math.b2Math")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates an ABS number.
        * @param a Number to ABS.
        * @return Absolute value of a.
        **/
      inline def Abs(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Abs")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Creates an ABS matrix.
        * @param A Matrix to ABS all values.
        * @return Matrix with all positive values.
        **/
      inline def AbsM(A: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = ^.asInstanceOf[js.Dynamic].applyDynamic("AbsM")(A.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22]
      
      /**
        * Creates an ABS vector.
        * @param a Vector to ABS all values.
        * @return Vector with all positive values.
        **/
      inline def AbsV(a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("AbsV")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      inline def AddMM(
        A: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22,
        B: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = (^.asInstanceOf[js.Dynamic].applyDynamic("AddMM")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22]
      
      /**
        * Adds two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return a + b.
        **/
      inline def AddVV(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        b: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("AddVV")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        * Clamp a number to the range of low to high.
        * @param a Number to clamp.
        * @param low Low range.
        * @param high High range.
        * @return Number a clamped to range of low to high.
        **/
      inline def Clamp(a: Double, low: Double, high: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(a.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Clamps a vector to the range of low to high.
        * @param a Vector to clamp.
        * @param low Low range.
        * @param high High range.
        * @return Vector a clamped to range of low to high.
        **/
      inline def ClampV(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        low: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        high: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("ClampV")(a.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        * Cross product of s and vector 2.
        * @param s s value.
        * @param a Vector 2 to use in cross product.
        * @return Cross product of s and a.
        **/
      inline def CrossFV(s: Double, a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("CrossFV")(s.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        * Cross product of vector 2 and s.
        * @param a Vector 2 to use in cross product.
        * @param s s value.
        * @return Cross product of a and s.
        **/
      inline def CrossVF(a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2, s: Double): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("CrossVF")(a.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        * Cross product of two vector 2s.
        * @param a Vector 2 to use in cross product.
        * @param b Vector 2 to use in cross product.
        * @return Cross product of a and b.
        **/
      inline def CrossVV(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        b: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CrossVV")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Calculates the distance between two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return Distance between a and b.
        **/
      inline def Distance(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        b: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Calculates the squared distance between two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return dist^2 between a and b.
        **/
      inline def DistanceSquared(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        b: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Dot product of two vector 2s.
        * @param a Vector 2 to use in dot product.
        * @param b Vector 2 to use in dot product.
        * @return Dot product of a and b.
        **/
      inline def Dot(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        b: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Check if a number is a power of 2.
        * @param x Number to check if it is a power of 2.
        * @return True if x is a power of 2, otherwise false.
        **/
      inline def IsPowerOfTwo(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPowerOfTwo")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Determines if a number is valid.  A number is valid if it is finite.
        * @param x Number to check for validity.
        * @return True if x is valid, otherwise false.
        **/
      inline def IsValid(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsValid")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Determines the max number.
        * @param a First number.
        * @param b Second number.
        * @return a or b depending on which is the maximum.
        **/
      inline def Max(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Max")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Determines the max vector.
        * @param a First vector.
        * @param b Second vector.
        * @return a or b depending on which is the maximum.
        **/
      inline def MaxV(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        b: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxV")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        * Determines the minimum number.
        * @param a First number.
        * @param b Second number.
        * @return a or b depending on which is the minimum.
        **/
      inline def Min(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Min")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Determines the minimum vector.
        * @param a First vector.
        * @param b Second vector.
        * @return a or b depending on which is the minimum.
        **/
      inline def MinV(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        b: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("MinV")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        *
        * @param s
        * @param a
        * @return
        **/
      inline def MulFV(s: Double, a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("MulFV")(s.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      inline def MulMM(
        A: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22,
        B: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = (^.asInstanceOf[js.Dynamic].applyDynamic("MulMM")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22]
      
      /**
        * Multiply matrix and vector.
        * @param A Matrix.
        * @param v Vector.
        * @return Result.
        **/
      inline def MulMV(
        A: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22,
        v: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("MulMV")(A.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        *
        * @param A
        * @param B
        * @return
        **/
      inline def MulTMM(
        A: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22,
        B: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = (^.asInstanceOf[js.Dynamic].applyDynamic("MulTMM")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22]
      
      /**
        *
        * @param A
        * @param v
        * @return
        **/
      inline def MulTMV(
        A: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22,
        v: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("MulTMV")(A.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        *
        * @param T
        * @param v
        * @return
        **/
      inline def MulX(
        T: typingsJapgolly.box2d.Box2D.Common.Math.b2Transform,
        v: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("MulX")(T.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        *
        * @param T
        * @param v
        * @return
        **/
      inline def MulXT(
        T: typingsJapgolly.box2d.Box2D.Common.Math.b2Transform,
        v: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("MulXT")(T.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        * Calculates the next power of 2 after the given number.
        * @param x Number to start search for the next power of 2.
        * @return The next number that is a power of 2.
        **/
      inline def NextPowerOfTwo(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("NextPowerOfTwo")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Generates a random number.
        * @param return Random number.
        **/
      inline def Random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")().asInstanceOf[Double]
      
      /**
        * Returns a random number between lo and hi.
        * @param lo Lowest random number.
        * @param hi Highest random number.
        * @return Number between lo and hi.
        **/
      inline def RandomRange(lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomRange")(lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Subtracts two vectors.
        * @param a First vector.
        * @param b Second vector.
        * @return a - b.
        **/
      inline def SubtractVV(
        a: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        b: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
      ): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("SubtractVV")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
      
      /**
        * Swaps a and b objects.
        * @param a a -> b.
        * @param b b -> a.
        **/
      inline def Swap(a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Swap")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Global instance of a 2x2 identity matrix.  Use as read-only.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.b2Mat22_identity")
      @js.native
      def b2Mat22_identity: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = js.native
      inline def b2Mat22_identity_=(x: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2Mat22_identity")(x.asInstanceOf[js.Any])
      
      /**
        * Global instance of an identity transform.  Use as read-only.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.b2Transform_identity")
      @js.native
      def b2Transform_identity: typingsJapgolly.box2d.Box2D.Common.Math.b2Transform = js.native
      inline def b2Transform_identity_=(x: typingsJapgolly.box2d.Box2D.Common.Math.b2Transform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2Transform_identity")(x.asInstanceOf[js.Any])
      
      /**
        * Global instance of a zero'ed vector.  Use as read-only.
        **/
      @JSGlobal("Box2D.Common.Math.b2Math.b2Vec2_zero")
      @js.native
      def b2Vec2_zero: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
      inline def b2Vec2_zero_=(x: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2Vec2_zero")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Box2D.Common.Math.b2Sweep")
    @js.native
    open class b2Sweep ()
      extends StObject
         with typingsJapgolly.box2d.Box2D.Common.Math.b2Sweep {
      
      /**
        * Advance the sweep forward, yielding a new initial state.
        * @t The new initial time.
        **/
      /* CompleteClass */
      override def Advance(t: Double): Unit = js.native
      
      /**
        * Creates a copy of the sweep.
        **/
      /* CompleteClass */
      override def Copy(): typingsJapgolly.box2d.Box2D.Common.Math.b2Sweep = js.native
      
      /**
        * Get the interpolated transform at a specific time.
        * @param xf Transform at specified time, this is an out parameter.
        * @param alpha Is a factor in [0,1], where 0 indicates t0.
        **/
      /* CompleteClass */
      override def GetTransform(xf: typingsJapgolly.box2d.Box2D.Common.Math.b2Transform, alpha: Double): Unit = js.native
      
      /**
        * Sets the sweep from a sweep.
        * @param other Sweep values to copy from.
        **/
      /* CompleteClass */
      override def Set(other: typingsJapgolly.box2d.Box2D.Common.Math.b2Sweep): Unit = js.native
      
      /**
        * World angle.
        **/
      /* CompleteClass */
      var a: Double = js.native
      
      /**
        * World angle.
        **/
      /* CompleteClass */
      var a0: Double = js.native
      
      /**
        * Center world position.
        **/
      /* CompleteClass */
      var c: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Center world position.
        **/
      /* CompleteClass */
      var c0: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Local center of mass position.
        **/
      /* CompleteClass */
      var localCenter: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
      
      /**
        * Time interval = [t0,1], where t0 is in [0,1].
        **/
      /* CompleteClass */
      var t0: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
    }
    
    @JSGlobal("Box2D.Common.Math.b2Transform")
    @js.native
    open class b2Transform protected ()
      extends StObject
         with typingsJapgolly.box2d.Box2D.Common.Math.b2Transform {
      /**
        * The default constructor does nothing (for performance).
        * @param pos Position
        * @param r Rotation
        **/
      def this(
        pos: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        r: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22
      ) = this()
      
      /**
        * Calculate the angle that the rotation matrix represents.
        * @return Rotation matrix angle.
        **/
      /* CompleteClass */
      override def GetAngle(): Double = js.native
      
      /**
        * Initialize using a position vector and rotation matrix.
        * @param pos Position
        * @param r Rotation
        **/
      /* CompleteClass */
      override def Initialize(
        pos: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2,
        r: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22
      ): Unit = js.native
      
      /**
        * Transform rotation.
        **/
      /* CompleteClass */
      var R: typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22 = js.native
      
      /**
        * Sets the transfrom from a transfrom.
        * @param x Transform to copy values from.
        **/
      /* CompleteClass */
      override def Set(x: typingsJapgolly.box2d.Box2D.Common.Math.b2Transform): Unit = js.native
      
      /**
        * Set this to the identity transform.
        **/
      /* CompleteClass */
      override def SetIdentity(): Unit = js.native
      
      /**
        * Transform position.
        **/
      /* CompleteClass */
      var position: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = js.native
    }
    
    @JSGlobal("Box2D.Common.Math.b2Vec2")
    @js.native
    /**
      * Creates a new vector 2.
      * @param x x value, default = 0.
      * @param y y value, default = 0.
      **/
    open class b2Vec2 ()
      extends StObject
         with typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
      def this(x: Unit, y: Double) = this()
    }
    /* static members */
    object b2Vec2 {
      
      @JSGlobal("Box2D.Common.Math.b2Vec2")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new vector 2 from the given values.
        * @param x x value.
        * @param y y value.
        **/
      inline def Make(x: Double, y: Double): typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Make")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2]
    }
    
    @JSGlobal("Box2D.Common.Math.b2Vec3")
    @js.native
    /**
      * Construct using coordinates x,y,z.
      * @param x x value, default = 0.
      * @param y y value, default = 0.
      * @param z z value, default = 0.
      **/
    open class b2Vec3 ()
      extends StObject
         with typingsJapgolly.box2d.Box2D.Common.Math.b2Vec3 {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
      def this(x: Unit, y: Double) = this()
      def this(x: Double, y: Double, z: Double) = this()
      def this(x: Double, y: Unit, z: Double) = this()
      def this(x: Unit, y: Double, z: Double) = this()
      def this(x: Unit, y: Unit, z: Double) = this()
    }
  }
  
  @JSGlobal("Box2D.Common.b2Color")
  @js.native
  open class b2Color protected ()
    extends StObject
       with typingsJapgolly.box2d.Box2D.Common.b2Color {
    /**
      * Constructor
      * @param rr Red value
      * @param gg Green value
      * @param bb Blue value
      **/
    def this(rr: Double, gg: Double, bb: Double) = this()
    
    /**
      * Sets the Color to new RGB values.
      * @param rr Red value
      * @param gg Green value
      * @param bb Blue value
      **/
    /* CompleteClass */
    override def Set(rr: Double, gg: Double, bb: Double): Unit = js.native
    
    /**
      * Blue
      **/
    /* CompleteClass */
    var b: Double = js.native
    
    /**
      * RGB color as hex.
      **/
    /* CompleteClass */
    var color: Double = js.native
    
    /**
      * Green
      **/
    /* CompleteClass */
    var g: Double = js.native
    
    /**
      * Red
      **/
    /* CompleteClass */
    var r: Double = js.native
  }
  
  @JSGlobal("Box2D.Common.b2Settings")
  @js.native
  open class b2Settings ()
    extends StObject
       with typingsJapgolly.box2d.Box2D.Common.b2Settings
  /* static members */
  object b2Settings {
    
    @JSGlobal("Box2D.Common.b2Settings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Maximum unsigned short value.
      **/
    @JSGlobal("Box2D.Common.b2Settings.USHRT_MAX")
    @js.native
    def USHRT_MAX: Double = js.native
    inline def USHRT_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USHRT_MAX")(x.asInstanceOf[js.Any])
    
    /**
      * The current version of Box2D.
      **/
    @JSGlobal("Box2D.Common.b2Settings.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    /**
      * b2Assert is used internally to handle assertions. By default, calls are commented out to save performance, so they serve more as documentation than anything else.
      * @param a Asset an expression is true.
      **/
    inline def b2Assert(a: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("b2Assert")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Friction mixing law. Feel free to customize this.
      * Friction values are usually set between 0 and 1. (0 = no friction, 1 = high friction)
      * By default this is `return Math.sqrt(friction1, friction2);`
      * @param friction1 Friction 1 to mix.
      * @param friction2 Friction 2 to mix.
      * @return The two frictions mixed as one value.
      **/
    inline def b2MixFriction(friction1: Double, friction2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("b2MixFriction")(friction1.asInstanceOf[js.Any], friction2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Restitution mixing law. Feel free to customize this.  Restitution is used to make objects bounce.
      * Restitution values are usually set between 0 and 1. (0 = no bounce (inelastic), 1 = perfect bounce (perfectly elastic))
      * By default this is `return Math.Max(restitution1, restitution2);`
      * @param restitution1 Restitution 1 to mix.
      * @param restitution2 Restitution 2 to mix.
      * @return The two restitutions mixed as one value.
      **/
    inline def b2MixRestitution(restitution1: Double, restitution2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("b2MixRestitution")(restitution1.asInstanceOf[js.Any], restitution2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * This is used to fatten AABBs in the dynamic tree. This allows proxies to move by a small amount without triggering a tree adjustment. This is in meters.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_aabbExtension")
    @js.native
    def b2_aabbExtension: Double = js.native
    inline def b2_aabbExtension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_aabbExtension")(x.asInstanceOf[js.Any])
    
    /**
      * This is used to fatten AABBs in the dynamic tree. This is used to predict the future position based on the current displacement. This is a dimensionless multiplier.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_aabbMultiplier")
    @js.native
    def b2_aabbMultiplier: Double = js.native
    inline def b2_aabbMultiplier_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_aabbMultiplier")(x.asInstanceOf[js.Any])
    
    /**
      * A body cannot sleep if its angular velocity is above this tolerance.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_angularSleepTolerance")
    @js.native
    def b2_angularSleepTolerance: Double = js.native
    inline def b2_angularSleepTolerance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_angularSleepTolerance")(x.asInstanceOf[js.Any])
    
    /**
      * A small angle used as a collision and constraint tolerance. Usually it is chosen to be numerically significant, but visually insignificant.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_angularSlop")
    @js.native
    def b2_angularSlop: Double = js.native
    inline def b2_angularSlop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_angularSlop")(x.asInstanceOf[js.Any])
    
    /**
      * This scale factor controls how fast overlap is resolved. Ideally this would be 1 so that overlap is removed in one time step. However using values close to 1 often lead to overshoot.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_contactBaumgarte")
    @js.native
    def b2_contactBaumgarte: Double = js.native
    inline def b2_contactBaumgarte_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_contactBaumgarte")(x.asInstanceOf[js.Any])
    
    /**
      * A body cannot sleep if its linear velocity is above this tolerance.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_linearSleepTolerance")
    @js.native
    def b2_linearSleepTolerance: Double = js.native
    inline def b2_linearSleepTolerance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_linearSleepTolerance")(x.asInstanceOf[js.Any])
    
    /**
      * A small length used as a collision and constraint tolerance. Usually it is chosen to be numerically significant, but visually insignificant.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_linearSlop")
    @js.native
    def b2_linearSlop: Double = js.native
    inline def b2_linearSlop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_linearSlop")(x.asInstanceOf[js.Any])
    
    /**
      * The maximum angular position correction used when solving constraints. This helps to prevent overshoot.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxAngularCorrection")
    @js.native
    def b2_maxAngularCorrection: Double = js.native
    inline def b2_maxAngularCorrection_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxAngularCorrection")(x.asInstanceOf[js.Any])
    
    /**
      * The maximum linear position correction used when solving constraints. This helps to prevent overshoot.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxLinearCorrection")
    @js.native
    def b2_maxLinearCorrection: Double = js.native
    inline def b2_maxLinearCorrection_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxLinearCorrection")(x.asInstanceOf[js.Any])
    
    /**
      * Number of manifold points in a b2Manifold. This should NEVER change.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxManifoldPoints")
    @js.native
    def b2_maxManifoldPoints: Double = js.native
    inline def b2_maxManifoldPoints_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxManifoldPoints")(x.asInstanceOf[js.Any])
    
    /**
      * The maximum angular velocity of a body. This limit is very large and is used to prevent numerical problems. You shouldn't need to adjust this.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxRotation")
    @js.native
    def b2_maxRotation: Double = js.native
    
    /**
      * b2_maxRotation squared
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxRotationSquared")
    @js.native
    def b2_maxRotationSquared: Double = js.native
    inline def b2_maxRotationSquared_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxRotationSquared")(x.asInstanceOf[js.Any])
    
    inline def b2_maxRotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxRotation")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of contacts to be handled to solve a TOI island.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxTOIContactsPerIsland")
    @js.native
    def b2_maxTOIContactsPerIsland: Double = js.native
    inline def b2_maxTOIContactsPerIsland_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxTOIContactsPerIsland")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of joints to be handled to solve a TOI island.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxTOIJointsPerIsland")
    @js.native
    def b2_maxTOIJointsPerIsland: Double = js.native
    inline def b2_maxTOIJointsPerIsland_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxTOIJointsPerIsland")(x.asInstanceOf[js.Any])
    
    /**
      * The maximum linear velocity of a body. This limit is very large and is used to prevent numerical problems. You shouldn't need to adjust this.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxTranslation")
    @js.native
    def b2_maxTranslation: Double = js.native
    
    /**
      * b2_maxTranslation squared
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_maxTranslationSquared")
    @js.native
    def b2_maxTranslationSquared: Double = js.native
    inline def b2_maxTranslationSquared_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxTranslationSquared")(x.asInstanceOf[js.Any])
    
    inline def b2_maxTranslation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_maxTranslation")(x.asInstanceOf[js.Any])
    
    /**
      * 3.141592653589793
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_pi")
    @js.native
    def b2_pi: Double = js.native
    inline def b2_pi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_pi")(x.asInstanceOf[js.Any])
    
    /**
      * The radius of the polygon/edge shape skin. This should not be modified. Making this smaller means polygons will have and insufficient for continuous collision. Making it larger may create artifacts for vertex collision.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_polygonRadius")
    @js.native
    def b2_polygonRadius: Double = js.native
    inline def b2_polygonRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_polygonRadius")(x.asInstanceOf[js.Any])
    
    /**
      * The time that a body must be still before it will go to sleep.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_timeToSleep")
    @js.native
    def b2_timeToSleep: Double = js.native
    inline def b2_timeToSleep_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_timeToSleep")(x.asInstanceOf[js.Any])
    
    /**
      * Continuous collision detection (CCD) works with core, shrunken shapes. This is the amount by which shapes are automatically shrunk to work with CCD. This must be larger than b2_linearSlop.
      * @see also b2_linearSlop
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_toiSlop")
    @js.native
    def b2_toiSlop: Double = js.native
    inline def b2_toiSlop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_toiSlop")(x.asInstanceOf[js.Any])
    
    /**
      * A velocity threshold for elastic collisions. Any collision with a relative linear velocity below this threshold will be treated as inelastic.
      **/
    @JSGlobal("Box2D.Common.b2Settings.b2_velocityThreshold")
    @js.native
    def b2_velocityThreshold: Double = js.native
    inline def b2_velocityThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_velocityThreshold")(x.asInstanceOf[js.Any])
  }
}
