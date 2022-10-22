package typingsJapgolly.box2d.Box2D

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  object Math {
    
    trait b2Mat22 extends StObject {
      
      /**
        * Sets all internal matrix values to absolute values.
        **/
      def Abs(): Unit
      
      /**
        * Adds the two 2x2 matricies together and stores the result in this matrix.
        * @param m 2x2 matrix to add.
        **/
      def AddM(m: b2Mat22): Unit
      
      /**
        * Creates a copy of the matrix.
        * @return Copy of this 2x2 matrix.
        **/
      def Copy(): b2Mat22
      
      /**
        * Gets the rotation matrix angle.
        * R(theta) = [ cos(theta)  -sin(theta) ]
        *            [ sin(theta)   cos(theta) ]
        * @return The rotation matrix angle (theta).
        **/
      def GetAngle(): Double
      
      /**
        * Compute the inverse of this matrix, such that inv(A) A = identity.
        * @param out Inverse matrix.
        * @return Inverse matrix.
        **/
      def GetInverse(out: b2Mat22): b2Mat22
      
      /**
        * Sets the 2x2 rotation matrix from the given angle.
        * R(theta) = [ cos(theta)  -sin(theta) ]
        *            [ sin(theta)   cos(theta) ]
        * @param angle Matrix angle (theta).
        **/
      def Set(angle: Double): Unit
      
      /**
        * Sets the 2x2 matrix to identity.
        **/
      def SetIdentity(): Unit
      
      /**
        * Sets the 2x2 matrix from a 2x2 matrix.
        * @param m 2x2 matrix values.
        **/
      def SetM(m: b2Mat22): Unit
      
      /**
        * Sets the 2x2 matrix from 2 column vectors.
        * @param c1 Column 1 vector.
        * @param c2 Column 2 vector.
        **/
      def SetVV(c1: b2Vec2, c2: b2Vec2): Unit
      
      /**
        * Sets the 2x2 matrix to all zeros.
        **/
      def SetZero(): Unit
      
      /**
        * TODO, has something to do with the determinant
        * @param out Solved vector
        * @param bX
        * @param bY
        * @return Solved vector
        **/
      def Solve(out: b2Vec2, bX: Double, bY: Double): b2Vec2
      
      /**
        * Column 1
        **/
      var col1: b2Vec2
      
      /**
        * Column 2
        **/
      var col2: b2Vec2
    }
    object b2Mat22 {
      
      inline def apply(
        Abs: Callback,
        AddM: b2Mat22 => Callback,
        Copy: CallbackTo[b2Mat22],
        GetAngle: CallbackTo[Double],
        GetInverse: b2Mat22 => b2Mat22,
        Set: Double => Callback,
        SetIdentity: Callback,
        SetM: b2Mat22 => Callback,
        SetVV: (b2Vec2, b2Vec2) => Callback,
        SetZero: Callback,
        Solve: (b2Vec2, Double, Double) => b2Vec2,
        col1: b2Vec2,
        col2: b2Vec2
      ): b2Mat22 = {
        val __obj = js.Dynamic.literal(Abs = Abs.toJsFn, AddM = js.Any.fromFunction1((t0: b2Mat22) => AddM(t0).runNow()), Copy = Copy.toJsFn, GetAngle = GetAngle.toJsFn, GetInverse = js.Any.fromFunction1(GetInverse), Set = js.Any.fromFunction1((t0: Double) => Set(t0).runNow()), SetIdentity = SetIdentity.toJsFn, SetM = js.Any.fromFunction1((t0: b2Mat22) => SetM(t0).runNow()), SetVV = js.Any.fromFunction2((t0: b2Vec2, t1: b2Vec2) => (SetVV(t0, t1)).runNow()), SetZero = SetZero.toJsFn, Solve = js.Any.fromFunction3(Solve), col1 = col1.asInstanceOf[js.Any], col2 = col2.asInstanceOf[js.Any])
        __obj.asInstanceOf[b2Mat22]
      }
      
      extension [Self <: b2Mat22](x: Self) {
        
        inline def setAbs(value: Callback): Self = StObject.set(x, "Abs", value.toJsFn)
        
        inline def setAddM(value: b2Mat22 => Callback): Self = StObject.set(x, "AddM", js.Any.fromFunction1((t0: b2Mat22) => value(t0).runNow()))
        
        inline def setCol1(value: b2Vec2): Self = StObject.set(x, "col1", value.asInstanceOf[js.Any])
        
        inline def setCol2(value: b2Vec2): Self = StObject.set(x, "col2", value.asInstanceOf[js.Any])
        
        inline def setCopy(value: CallbackTo[b2Mat22]): Self = StObject.set(x, "Copy", value.toJsFn)
        
        inline def setGetAngle(value: CallbackTo[Double]): Self = StObject.set(x, "GetAngle", value.toJsFn)
        
        inline def setGetInverse(value: b2Mat22 => b2Mat22): Self = StObject.set(x, "GetInverse", js.Any.fromFunction1(value))
        
        inline def setSet(value: Double => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetIdentity(value: Callback): Self = StObject.set(x, "SetIdentity", value.toJsFn)
        
        inline def setSetM(value: b2Mat22 => Callback): Self = StObject.set(x, "SetM", js.Any.fromFunction1((t0: b2Mat22) => value(t0).runNow()))
        
        inline def setSetVV(value: (b2Vec2, b2Vec2) => Callback): Self = StObject.set(x, "SetVV", js.Any.fromFunction2((t0: b2Vec2, t1: b2Vec2) => (value(t0, t1)).runNow()))
        
        inline def setSetZero(value: Callback): Self = StObject.set(x, "SetZero", value.toJsFn)
        
        inline def setSolve(value: (b2Vec2, Double, Double) => b2Vec2): Self = StObject.set(x, "Solve", js.Any.fromFunction3(value))
      }
    }
    
    trait b2Mat33 extends StObject {
      
      /**
        * Adds the two 3x3 matricies together and stores the result in this matrix.
        * @param m 3x3 matrix to add.
        **/
      def AddM(m: b2Mat33): Unit
      
      /**
        * Creates a copy of the matrix.
        * @return Copy of this 3x3 matrix.
        **/
      def Copy(): b2Mat33
      
      /**
        * Sets the 3x3 matrix to identity.
        **/
      def SetIdentity(): Unit
      
      /**
        * Sets the 3x3 matrix from a 3x3 matrix.
        * @param m 3x3 matrix values.
        **/
      def SetM(m: b2Mat33): Unit
      
      /**
        * Sets the 3x3 matrix from 3 column vectors.
        * @param c1 Column 1 vector.
        * @param c2 Column 2 vector.
        * @param c3 Column 2 vector.
        **/
      def SetVVV(c1: b2Vec3, c2: b2Vec3, c3: b2Vec3): Unit
      
      /**
        * Sets the 3x3 matrix to all zeros.
        **/
      def SetZero(): Unit
      
      /**
        * TODO, has something to do with the determinant
        * @param out Solved vector
        * @param bX
        * @param bY
        * @return Solved vector
        **/
      def Solve22(out: b2Vec2, bX: Double, bY: Double): b2Vec2
      
      /**
        * TODO, has something to do with the determinant
        * @param out Solved vector
        * @param bX
        * @param bY
        * @param bZ
        * @return Solved vector
        **/
      def Solve33(out: b2Vec3, bX: Double, bY: Double, bZ: Double): b2Vec3
      
      /**
        * Column 1
        **/
      var col1: b2Vec3
      
      /**
        * Column 2
        **/
      var col2: b2Vec3
      
      /**
        * Column 3
        **/
      var col3: b2Vec3
    }
    object b2Mat33 {
      
      inline def apply(
        AddM: b2Mat33 => Callback,
        Copy: CallbackTo[b2Mat33],
        SetIdentity: Callback,
        SetM: b2Mat33 => Callback,
        SetVVV: (b2Vec3, b2Vec3, b2Vec3) => Callback,
        SetZero: Callback,
        Solve22: (b2Vec2, Double, Double) => b2Vec2,
        Solve33: (b2Vec3, Double, Double, Double) => b2Vec3,
        col1: b2Vec3,
        col2: b2Vec3,
        col3: b2Vec3
      ): b2Mat33 = {
        val __obj = js.Dynamic.literal(AddM = js.Any.fromFunction1((t0: b2Mat33) => AddM(t0).runNow()), Copy = Copy.toJsFn, SetIdentity = SetIdentity.toJsFn, SetM = js.Any.fromFunction1((t0: b2Mat33) => SetM(t0).runNow()), SetVVV = js.Any.fromFunction3((t0: b2Vec3, t1: b2Vec3, t2: b2Vec3) => (SetVVV(t0, t1, t2)).runNow()), SetZero = SetZero.toJsFn, Solve22 = js.Any.fromFunction3(Solve22), Solve33 = js.Any.fromFunction4(Solve33), col1 = col1.asInstanceOf[js.Any], col2 = col2.asInstanceOf[js.Any], col3 = col3.asInstanceOf[js.Any])
        __obj.asInstanceOf[b2Mat33]
      }
      
      extension [Self <: b2Mat33](x: Self) {
        
        inline def setAddM(value: b2Mat33 => Callback): Self = StObject.set(x, "AddM", js.Any.fromFunction1((t0: b2Mat33) => value(t0).runNow()))
        
        inline def setCol1(value: b2Vec3): Self = StObject.set(x, "col1", value.asInstanceOf[js.Any])
        
        inline def setCol2(value: b2Vec3): Self = StObject.set(x, "col2", value.asInstanceOf[js.Any])
        
        inline def setCol3(value: b2Vec3): Self = StObject.set(x, "col3", value.asInstanceOf[js.Any])
        
        inline def setCopy(value: CallbackTo[b2Mat33]): Self = StObject.set(x, "Copy", value.toJsFn)
        
        inline def setSetIdentity(value: Callback): Self = StObject.set(x, "SetIdentity", value.toJsFn)
        
        inline def setSetM(value: b2Mat33 => Callback): Self = StObject.set(x, "SetM", js.Any.fromFunction1((t0: b2Mat33) => value(t0).runNow()))
        
        inline def setSetVVV(value: (b2Vec3, b2Vec3, b2Vec3) => Callback): Self = StObject.set(x, "SetVVV", js.Any.fromFunction3((t0: b2Vec3, t1: b2Vec3, t2: b2Vec3) => (value(t0, t1, t2)).runNow()))
        
        inline def setSetZero(value: Callback): Self = StObject.set(x, "SetZero", value.toJsFn)
        
        inline def setSolve22(value: (b2Vec2, Double, Double) => b2Vec2): Self = StObject.set(x, "Solve22", js.Any.fromFunction3(value))
        
        inline def setSolve33(value: (b2Vec3, Double, Double, Double) => b2Vec3): Self = StObject.set(x, "Solve33", js.Any.fromFunction4(value))
      }
    }
    
    trait b2Math extends StObject
    
    trait b2Sweep extends StObject {
      
      /**
        * Advance the sweep forward, yielding a new initial state.
        * @t The new initial time.
        **/
      def Advance(t: Double): Unit
      
      /**
        * Creates a copy of the sweep.
        **/
      def Copy(): b2Sweep
      
      /**
        * Get the interpolated transform at a specific time.
        * @param xf Transform at specified time, this is an out parameter.
        * @param alpha Is a factor in [0,1], where 0 indicates t0.
        **/
      def GetTransform(xf: b2Transform, alpha: Double): Unit
      
      /**
        * Sets the sweep from a sweep.
        * @param other Sweep values to copy from.
        **/
      def Set(other: b2Sweep): Unit
      
      /**
        * World angle.
        **/
      var a: Double
      
      /**
        * World angle.
        **/
      var a0: Double
      
      /**
        * Center world position.
        **/
      var c: b2Vec2
      
      /**
        * Center world position.
        **/
      var c0: b2Vec2
      
      /**
        * Local center of mass position.
        **/
      var localCenter: b2Vec2
      
      /**
        * Time interval = [t0,1], where t0 is in [0,1].
        **/
      var t0: b2Vec2
    }
    object b2Sweep {
      
      inline def apply(
        Advance: Double => Callback,
        Copy: CallbackTo[b2Sweep],
        GetTransform: (b2Transform, Double) => Callback,
        Set: b2Sweep => Callback,
        a: Double,
        a0: Double,
        c: b2Vec2,
        c0: b2Vec2,
        localCenter: b2Vec2,
        t0: b2Vec2
      ): b2Sweep = {
        val __obj = js.Dynamic.literal(Advance = js.Any.fromFunction1((t0: Double) => Advance(t0).runNow()), Copy = Copy.toJsFn, GetTransform = js.Any.fromFunction2((t0: b2Transform, t1: Double) => (GetTransform(t0, t1)).runNow()), Set = js.Any.fromFunction1((t0: b2Sweep) => Set(t0).runNow()), a = a.asInstanceOf[js.Any], a0 = a0.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], c0 = c0.asInstanceOf[js.Any], localCenter = localCenter.asInstanceOf[js.Any], t0 = t0.asInstanceOf[js.Any])
        __obj.asInstanceOf[b2Sweep]
      }
      
      extension [Self <: b2Sweep](x: Self) {
        
        inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setA0(value: Double): Self = StObject.set(x, "a0", value.asInstanceOf[js.Any])
        
        inline def setAdvance(value: Double => Callback): Self = StObject.set(x, "Advance", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setC(value: b2Vec2): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
        
        inline def setC0(value: b2Vec2): Self = StObject.set(x, "c0", value.asInstanceOf[js.Any])
        
        inline def setCopy(value: CallbackTo[b2Sweep]): Self = StObject.set(x, "Copy", value.toJsFn)
        
        inline def setGetTransform(value: (b2Transform, Double) => Callback): Self = StObject.set(x, "GetTransform", js.Any.fromFunction2((t0: b2Transform, t1: Double) => (value(t0, t1)).runNow()))
        
        inline def setLocalCenter(value: b2Vec2): Self = StObject.set(x, "localCenter", value.asInstanceOf[js.Any])
        
        inline def setSet(value: b2Sweep => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction1((t0: b2Sweep) => value(t0).runNow()))
        
        inline def setT0(value: b2Vec2): Self = StObject.set(x, "t0", value.asInstanceOf[js.Any])
      }
    }
    
    trait b2Transform extends StObject {
      
      /**
        * Calculate the angle that the rotation matrix represents.
        * @return Rotation matrix angle.
        **/
      def GetAngle(): Double
      
      /**
        * Initialize using a position vector and rotation matrix.
        * @param pos Position
        * @param r Rotation
        **/
      def Initialize(pos: b2Vec2, r: b2Mat22): Unit
      
      /**
        * Transform rotation.
        **/
      var R: b2Mat22
      
      /**
        * Sets the transfrom from a transfrom.
        * @param x Transform to copy values from.
        **/
      def Set(x: b2Transform): Unit
      
      /**
        * Set this to the identity transform.
        **/
      def SetIdentity(): Unit
      
      /**
        * Transform position.
        **/
      var position: b2Vec2
    }
    object b2Transform {
      
      inline def apply(
        GetAngle: CallbackTo[Double],
        Initialize: (b2Vec2, b2Mat22) => Callback,
        R: b2Mat22,
        Set: b2Transform => Callback,
        SetIdentity: Callback,
        position: b2Vec2
      ): b2Transform = {
        val __obj = js.Dynamic.literal(GetAngle = GetAngle.toJsFn, Initialize = js.Any.fromFunction2((t0: b2Vec2, t1: b2Mat22) => (Initialize(t0, t1)).runNow()), R = R.asInstanceOf[js.Any], Set = js.Any.fromFunction1((t0: b2Transform) => Set(t0).runNow()), SetIdentity = SetIdentity.toJsFn, position = position.asInstanceOf[js.Any])
        __obj.asInstanceOf[b2Transform]
      }
      
      extension [Self <: b2Transform](x: Self) {
        
        inline def setGetAngle(value: CallbackTo[Double]): Self = StObject.set(x, "GetAngle", value.toJsFn)
        
        inline def setInitialize(value: (b2Vec2, b2Mat22) => Callback): Self = StObject.set(x, "Initialize", js.Any.fromFunction2((t0: b2Vec2, t1: b2Mat22) => (value(t0, t1)).runNow()))
        
        inline def setPosition(value: b2Vec2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setR(value: b2Mat22): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
        
        inline def setSet(value: b2Transform => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction1((t0: b2Transform) => value(t0).runNow()))
        
        inline def setSetIdentity(value: Callback): Self = StObject.set(x, "SetIdentity", value.toJsFn)
      }
    }
    
    @js.native
    trait b2Vec2 extends StObject {
      
      /**
        * Sets x and y to absolute values.
        **/
      def Abs(): Unit = js.native
      
      /**
        * Adds the vector 2 to this vector 2.  The result is stored in this vector 2.
        * @param v Vector 2 to add.
        **/
      def Add(v: b2Vec2): Unit = js.native
      
      /**
        * Creates a copy of the vector 2.
        * @return Copy of this vector 2.
        **/
      def Copy(): b2Vec2 = js.native
      
      /**
        * Cross F V
        * @param s
        **/
      def CrossFV(s: Double): Unit = js.native
      
      /**
        * Cross V F
        * @param s
        **/
      def CrossVF(s: Double): Unit = js.native
      
      /**
        * Gets the negative of this vector 2.
        * @return Negative copy of this vector 2.
        **/
      def GetNegative(): b2Vec2 = js.native
      
      /**
        * True if the vector 2 is valid, otherwise false.  A valid vector has finite values.
        * @return True if the vector 2 is valid, otherwise false.
        **/
      def IsValid(): Boolean = js.native
      
      /**
        * Calculates the length of the vector 2.
        * @return The length of the vector 2.
        **/
      def Length(): Double = js.native
      
      /**
        * Calculates the length squared of the vector2.
        * @return The length squared of the vector 2.
        **/
      def LengthSquared(): Double = js.native
      
      /**
        * Calculates which vector has the maximum values and sets this vector to those values.
        * @param b Vector 2 to compare for maximum values.
        **/
      def MaxV(b: b2Vec2): Unit = js.native
      
      /**
        * Calculates which vector has the minimum values and sets this vector to those values.
        * @param b Vector 2 to compare for minimum values.
        **/
      def MinV(b: b2Vec2): Unit = js.native
      
      /**
        * Matrix multiplication.  Stores the result in this vector 2.
        * @param A Matrix to muliply by.
        **/
      def MulM(A: b2Mat22): Unit = js.native
      
      /**
        * Dot product multiplication.  Stores the result in this vector 2.
        * @param A Matrix to multiply by.
        **/
      def MulTM(A: b2Mat22): Unit = js.native
      
      /**
        * Vector multiplication.  Stores the result in this vector 2.
        * @param a Value to multiple the vector's values by.
        **/
      def Multiply(a: Double): Unit = js.native
      
      /**
        * Sets this vector 2 to its negative.
        **/
      def NegativeSelf(): Unit = js.native
      
      /**
        * Normalizes the vector 2 [0,1].
        * @return Length.
        **/
      def Normalize(): Double = js.native
      
      /**
        * Sets the vector 2.
        * @param x x value, default is 0.
        * @param y y value, default is 0.
        **/
      def Set(): Unit = js.native
      def Set(x: Double): Unit = js.native
      def Set(x: Double, y: Double): Unit = js.native
      def Set(x: Unit, y: Double): Unit = js.native
      
      /**
        * Sets the vector 2 from a vector 2.
        * @param v Vector 2 to copy values from.
        **/
      def SetV(v: b2Vec2): Unit = js.native
      
      /**
        * Sets the vector 2 to zero values.
        **/
      def SetZero(): Unit = js.native
      
      /**
        * Subtracts the vector 2 from this vector 2.  The result is stored in this vector 2.
        * @param v Vector 2 to subtract.
        **/
      def Subtract(v: b2Vec2): Unit = js.native
      
      /**
        * x value
        **/
      var x: Double = js.native
      
      /**
        * y value
        **/
      var y: Double = js.native
    }
    
    @js.native
    trait b2Vec3 extends StObject {
      
      /**
        * Adds the vector 3 to this vector 3.  The result is stored in this vector 3.
        * @param v Vector 3 to add.
        **/
      def Add(v: b2Vec3): Unit = js.native
      
      /**
        * Creates a copy of the vector 3.
        * @return Copy of this vector 3.
        **/
      def Copy(): b2Vec3 = js.native
      
      /**
        * Gets the negative of this vector 3.
        * @return Negative copy of this vector 3.
        **/
      def GetNegative(): b2Vec3 = js.native
      
      /**
        * Vector multiplication.  Stores the result in this vector 3.
        * @param a Value to multiple the vector's values by.
        **/
      def Multiply(a: Double): Unit = js.native
      
      /**
        * Sets this vector 3 to its negative.
        **/
      def NegativeSelf(): Unit = js.native
      
      /**
        * Sets the vector 3.
        * @param x x value, default is 0.
        * @param y y value, default is 0.
        * @param z z value, default is 0.
        **/
      def Set(): Unit = js.native
      def Set(x: Double): Unit = js.native
      def Set(x: Double, y: Double): Unit = js.native
      def Set(x: Double, y: Double, z: Double): Unit = js.native
      def Set(x: Double, y: Unit, z: Double): Unit = js.native
      def Set(x: Unit, y: Double): Unit = js.native
      def Set(x: Unit, y: Double, z: Double): Unit = js.native
      def Set(x: Unit, y: Unit, z: Double): Unit = js.native
      
      /**
        * Sets the vector 3 from a vector 3.
        * @param v Vector 3 to copy values from.
        **/
      def SetV(v: b2Vec3): Unit = js.native
      
      /**
        * Sets the vector 3 to zero values.
        **/
      def SetZero(): Unit = js.native
      
      /**
        * Subtracts the vector 3 from this vector 3.  The result is stored in this vector 3.
        * @param v Vector 3 to subtract.
        **/
      def Subtract(v: b2Vec3): Unit = js.native
      
      /**
        * x value.
        **/
      var x: Double = js.native
      
      /**
        * y value.
        **/
      var y: Double = js.native
      
      /**
        * z value.
        **/
      var z: Double = js.native
    }
  }
  
  trait b2Color extends StObject {
    
    /**
      * Sets the Color to new RGB values.
      * @param rr Red value
      * @param gg Green value
      * @param bb Blue value
      **/
    def Set(rr: Double, gg: Double, bb: Double): Unit
    
    /**
      * Blue
      **/
    var b: Double
    
    /**
      * RGB color as hex.
      **/
    var color: Double
    
    /**
      * Green
      **/
    var g: Double
    
    /**
      * Red
      **/
    var r: Double
  }
  object b2Color {
    
    inline def apply(Set: (Double, Double, Double) => Callback, b: Double, color: Double, g: Double, r: Double): b2Color = {
      val __obj = js.Dynamic.literal(Set = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (Set(t0, t1, t2)).runNow()), b = b.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2Color]
    }
    
    extension [Self <: b2Color](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait b2Settings extends StObject
}
