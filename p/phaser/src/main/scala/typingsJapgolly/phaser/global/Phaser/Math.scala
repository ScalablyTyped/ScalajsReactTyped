package typingsJapgolly.phaser.global.Phaser

import typingsJapgolly.phaser.Phaser.Geom.Point
import typingsJapgolly.phaser.Phaser.Types.Math.SinCosTable
import typingsJapgolly.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Math {
  
  @JSGlobal("Phaser.Math")
  @js.native
  val ^ : js.Any = js.native
  
  object Angle {
    
    @JSGlobal("Phaser.Math.Angle")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Find the angle of a segment from (x1, y1) -> (x2, y2).
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    inline def Between(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Between")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).
      * 
      * Calculates the angle of the vector from the first point to the second point.
      * @param point1 The first point.
      * @param point2 The second point.
      */
    inline def BetweenPoints(point1: Vector2Like, point2: Vector2Like): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("BetweenPoints")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).
      * 
      * The difference between this method and {@link Phaser.Math.Angle.BetweenPoints} is that this assumes the y coordinate
      * travels down the screen.
      * @param point1 The first point.
      * @param point2 The second point.
      */
    inline def BetweenPointsY(point1: Vector2Like, point2: Vector2Like): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("BetweenPointsY")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the angle of a segment from (x1, y1) -> (x2, y2).
      * 
      * The difference between this method and {@link Phaser.Math.Angle.Between} is that this assumes the y coordinate
      * travels down the screen.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    inline def BetweenY(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("BetweenY")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Takes an angle in Phasers default clockwise format and converts it so that
      * 0 is North, 90 is West, 180 is South and 270 is East,
      * therefore running counter-clockwise instead of clockwise.
      * 
      * You can pass in the angle from a Game Object using:
      * 
      * ```javascript
      * var converted = CounterClockwise(gameobject.rotation);
      * ```
      * 
      * All values for this function are in radians.
      * @param angle The angle to convert, in radians.
      */
    inline def CounterClockwise(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CounterClockwise")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Normalize an angle to the [0, 2pi] range.
      * @param angle The angle to normalize, in radians.
      */
    inline def Normalize(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns a random angle in the range [-pi, pi].
      */
    inline def Random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")().asInstanceOf[Double]
    
    /**
      * Returns a random angle in the range [-180, 180].
      */
    inline def RandomDegrees(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomDegrees")().asInstanceOf[Double]
    
    /**
      * Reverse the given angle.
      * @param angle The angle to reverse, in radians.
      */
    inline def Reverse(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Reverse")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Rotates `currentAngle` towards `targetAngle`, taking the shortest rotation distance. The `lerp` argument is the amount to rotate by in this call.
      * @param currentAngle The current angle, in radians.
      * @param targetAngle The target angle to rotate to, in radians.
      * @param lerp The lerp value to add to the current angle. Default 0.05.
      */
    inline def RotateTo(currentAngle: Double, targetAngle: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateTo")(currentAngle.asInstanceOf[js.Any], targetAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def RotateTo(currentAngle: Double, targetAngle: Double, lerp: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateTo")(currentAngle.asInstanceOf[js.Any], targetAngle.asInstanceOf[js.Any], lerp.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Gets the shortest angle between `angle1` and `angle2`.
      * 
      * Both angles must be in the range -180 to 180, which is the same clamped
      * range that `sprite.angle` uses, so you can pass in two sprite angles to
      * this method and get the shortest angle back between the two of them.
      * 
      * The angle returned will be in the same range. If the returned angle is
      * greater than 0 then it's a counter-clockwise rotation, if < 0 then it's
      * a clockwise rotation.
      * @param angle1 The first angle in the range -180 to 180.
      * @param angle2 The second angle in the range -180 to 180.
      */
    inline def ShortestBetween(angle1: Double, angle2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ShortestBetween")(angle1.asInstanceOf[js.Any], angle2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Wrap an angle.
      * 
      * Wraps the angle to a value in the range of -PI to PI.
      * @param angle The angle to wrap, in radians.
      */
    inline def Wrap(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Wrap")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Wrap an angle in degrees.
      * 
      * Wraps the angle to a value in the range of -180 to 180.
      * @param angle The angle to wrap, in degrees.
      */
    inline def WrapDegrees(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("WrapDegrees")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  /**
    * Calculate the mean average of the given values.
    * @param values The values to average.
    */
  inline def Average(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Average")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the Bernstein basis from the three factorial coefficients.
    * @param n The first value.
    * @param i The second value.
    */
  inline def Bernstein(n: Double, i: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Bernstein")(n.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Compute a random integer between the `min` and `max` values, inclusive.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  inline def Between(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Between")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Calculates a Catmull-Rom value from the given points, based on an alpha of 0.5.
    * @param t The amount to interpolate by.
    * @param p0 The first control point.
    * @param p1 The second control point.
    * @param p2 The third control point.
    * @param p3 The fourth control point.
    */
  inline def CatmullRom(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Ceils to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  inline def CeilTo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CeilTo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def CeilTo(value: Double, place: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CeilTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def CeilTo(value: Double, place: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CeilTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def CeilTo(value: Double, place: Unit, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CeilTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Force a value within the boundaries by clamping it to the range `min`, `max`.
    * @param value The value to be clamped.
    * @param min The minimum bounds.
    * @param max The maximum bounds.
    */
  inline def Clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * For converting degrees to radians (PI / 180)
    */
  @JSGlobal("Phaser.Math.DEG_TO_RAD")
  @js.native
  def DEG_TO_RAD: Double = js.native
  inline def DEG_TO_RAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEG_TO_RAD")(x.asInstanceOf[js.Any])
  
  /**
    * Convert the given angle from degrees, to the equivalent angle in radians.
    * @param degrees The angle (in degrees) to convert to radians.
    */
  inline def DegToRad(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DegToRad")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the positive difference of two given numbers.
    * @param a The first number in the calculation.
    * @param b The second number in the calculation.
    */
  inline def Difference(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Difference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object Distance {
    
    @JSGlobal("Phaser.Math.Distance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculate the distance between two sets of coordinates (points).
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    inline def Between(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Between")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculate the distance between two points.
      * @param a The first point.
      * @param b The second point.
      */
    inline def BetweenPoints(a: Vector2Like, b: Vector2Like): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("BetweenPoints")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculate the squared distance between two points.
      * @param a The first point.
      * @param b The second point.
      */
    inline def BetweenPointsSquared(a: Vector2Like, b: Vector2Like): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("BetweenPointsSquared")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculate the Chebyshev distance between two sets of coordinates (points).
      * 
      * Chebyshev distance (or chessboard distance) is the maximum of the horizontal and vertical distances.
      * It's the effective distance when movement can be horizontal, vertical, or diagonal.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    inline def Chebyshev(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Chebyshev")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculate the distance between two sets of coordinates (points) to the power of `pow`.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      * @param pow The exponent.
      */
    inline def Power(x1: Double, y1: Double, x2: Double, y2: Double, pow: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Power")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], pow.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculate the snake distance between two sets of coordinates (points).
      * 
      * Snake distance (rectilinear distance, Manhattan distance) is the sum of the horizontal and vertical distances.
      * It's the effective distance when movement is allowed only horizontally or vertically (but not both).
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    inline def Snake(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Snake")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculate the distance between two sets of coordinates (points), squared.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    inline def Squared(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Squared")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  /**
    * An epsilon value (1.0e-6)
    */
  @JSGlobal("Phaser.Math.EPSILON")
  @js.native
  def EPSILON: Double = js.native
  inline def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
  
  object Easing {
    
    @JSGlobal("Phaser.Math.Easing")
    @js.native
    val ^ : js.Any = js.native
    
    object Back {
      
      @JSGlobal("Phaser.Math.Easing.Back")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Back ease-in.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def In(v: Double, overshoot: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any], overshoot.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Back ease-in/out.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def InOut(v: Double, overshoot: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any], overshoot.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Back ease-out.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def Out(v: Double, overshoot: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any], overshoot.asInstanceOf[js.Any])).asInstanceOf[Double]
    }
    
    object Bounce {
      
      @JSGlobal("Phaser.Math.Easing.Bounce")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Bounce ease-in.
        * @param v The value to be tweened.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Bounce ease-in/out.
        * @param v The value to be tweened.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Bounce ease-out.
        * @param v The value to be tweened.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    object Circular {
      
      @JSGlobal("Phaser.Math.Easing.Circular")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Circular ease-in.
        * @param v The value to be tweened.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Circular ease-in/out.
        * @param v The value to be tweened.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Circular ease-out.
        * @param v The value to be tweened.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    object Cubic {
      
      @JSGlobal("Phaser.Math.Easing.Cubic")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Cubic ease-in.
        * @param v The value to be tweened.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Cubic ease-in/out.
        * @param v The value to be tweened.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Cubic ease-out.
        * @param v The value to be tweened.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    object Elastic {
      
      @JSGlobal("Phaser.Math.Easing.Elastic")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Elastic ease-in.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def In(v: Double, amplitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def In(v: Double, amplitude: Double, period: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def In(v: Double, amplitude: Unit, period: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Elastic ease-in/out.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def InOut(v: Double, amplitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def InOut(v: Double, amplitude: Double, period: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def InOut(v: Double, amplitude: Unit, period: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Elastic ease-out.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def Out(v: Double, amplitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def Out(v: Double, amplitude: Double, period: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def Out(v: Double, amplitude: Unit, period: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any], amplitude.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Double]
    }
    
    object Expo {
      
      @JSGlobal("Phaser.Math.Easing.Expo")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Exponential ease-in.
        * @param v The value to be tweened.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Exponential ease-in/out.
        * @param v The value to be tweened.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Exponential ease-out.
        * @param v The value to be tweened.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    /**
      * Linear easing (no variation).
      * @param v The value to be tweened.
      */
    inline def Linear(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Linear")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    object Quadratic {
      
      @JSGlobal("Phaser.Math.Easing.Quadratic")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Quadratic ease-in.
        * @param v The value to be tweened.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Quadratic ease-in/out.
        * @param v The value to be tweened.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Quadratic ease-out.
        * @param v The value to be tweened.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    object Quartic {
      
      @JSGlobal("Phaser.Math.Easing.Quartic")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Quartic ease-in.
        * @param v The value to be tweened.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Quartic ease-in/out.
        * @param v The value to be tweened.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Quartic ease-out.
        * @param v The value to be tweened.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    object Quintic {
      
      @JSGlobal("Phaser.Math.Easing.Quintic")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Quintic ease-in.
        * @param v The value to be tweened.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Quintic ease-in/out.
        * @param v The value to be tweened.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Quintic ease-out.
        * @param v The value to be tweened.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    object Sine {
      
      @JSGlobal("Phaser.Math.Easing.Sine")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Sinusoidal ease-in.
        * @param v The value to be tweened.
        */
      inline def In(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Sinusoidal ease-in/out.
        * @param v The value to be tweened.
        */
      inline def InOut(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("InOut")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Sinusoidal ease-out.
        * @param v The value to be tweened.
        */
      inline def Out(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Out")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    /**
      * Stepped easing.
      * @param v The value to be tweened.
      * @param steps The number of steps in the ease. Default 1.
      */
    inline def Stepped(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Stepped")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def Stepped(v: Double, steps: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Stepped")(v.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSGlobal("Phaser.Math.Euler")
  @js.native
  /**
    * 
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  open class Euler ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Math.Euler {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
  }
  
  /**
    * Calculates the factorial of a given number for integer values greater than 0.
    * @param value A positive integer to calculate the factorial of.
    */
  inline def Factorial(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Factorial")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Generate a random floating point number between the two given bounds, minimum inclusive, maximum exclusive.
    * @param min The lower bound for the float, inclusive.
    * @param max The upper bound for the float exclusive.
    */
  inline def FloatBetween(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FloatBetween")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Floors to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  inline def FloorTo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("FloorTo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def FloorTo(value: Double, place: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FloorTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def FloorTo(value: Double, place: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FloorTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def FloorTo(value: Double, place: Unit, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FloorTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Return a value based on the range between `min` and `max` and the percentage given.
    * @param percent A value between 0 and 1 representing the percentage.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  inline def FromPercent(percent: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPercent")(percent.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def FromPercent(percent: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPercent")(percent.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object Fuzzy {
    
    @JSGlobal("Phaser.Math.Fuzzy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculate the fuzzy ceiling of the given value.
      * @param value The value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    inline def Ceil(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Ceil")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def Ceil(value: Double, epsilon: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Ceil")(value.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Check whether the given values are fuzzily equal.
      * 
      * Two numbers are fuzzily equal if their difference is less than `epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    inline def Equal(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def Equal(a: Double, b: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Calculate the fuzzy floor of the given value.
      * @param value The value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    inline def Floor(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Floor")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def Floor(value: Double, epsilon: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Floor")(value.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Check whether `a` is fuzzily greater than `b`.
      * 
      * `a` is fuzzily greater than `b` if it is more than `b - epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    inline def GreaterThan(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("GreaterThan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def GreaterThan(a: Double, b: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("GreaterThan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check whether `a` is fuzzily less than `b`.
      * 
      * `a` is fuzzily less than `b` if it is less than `b + epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    inline def LessThan(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LessThan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def LessThan(a: Double, b: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LessThan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * Calculate a per-ms speed from a distance and time (given in seconds).
    * @param distance The distance.
    * @param time The time, in seconds.
    */
  inline def GetSpeed(distance: Double, time: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetSpeed")(distance.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object Interpolation {
    
    @JSGlobal("Phaser.Math.Interpolation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A bezier interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    inline def Bezier(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Bezier")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * A Catmull-Rom interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    inline def CatmullRom(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * A cubic bezier interpolation method.
      * 
      * https://medium.com/@adrian_cooney/bezier-interpolation-13b68563313a
      * @param t The percentage of interpolation, between 0 and 1.
      * @param p0 The start point.
      * @param p1 The first control point.
      * @param p2 The second control point.
      * @param p3 The end point.
      */
    inline def CubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CubicBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * A linear interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    inline def Linear(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Linear")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * A quadratic bezier interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param p0 The start point.
      * @param p1 The control point.
      * @param p2 The end point.
      */
    inline def QuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("QuadraticBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * A Smooth Step interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
      * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
      */
    inline def SmoothStep(t: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothStep")(t.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * A Smoother Step interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
      * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
      */
    inline def SmootherStep(t: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SmootherStep")(t.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  /**
    * Check if a given value is an even number.
    * @param value The number to perform the check with.
    */
  inline def IsEven(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEven")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Check if a given value is an even number using a strict type check.
    * @param value The number to perform the check with.
    */
  inline def IsEvenStrict(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEvenStrict")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Calculates a linear (interpolation) value over t.
    * @param p0 The first point.
    * @param p1 The second point.
    * @param t The percentage between p0 and p1 to return, represented as a number between 0 and 1.
    */
  inline def Linear(p0: Double, p1: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Linear")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * The maximum safe integer this browser supports.
    * We use a const for backward compatibility with Internet Explorer.
    */
  @JSGlobal("Phaser.Math.MAX_SAFE_INTEGER")
  @js.native
  def MAX_SAFE_INTEGER: Double = js.native
  inline def MAX_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SAFE_INTEGER")(x.asInstanceOf[js.Any])
  
  /**
    * The minimum safe integer this browser supports.
    * We use a const for backward compatibility with Internet Explorer.
    */
  @JSGlobal("Phaser.Math.MIN_SAFE_INTEGER")
  @js.native
  def MIN_SAFE_INTEGER: Double = js.native
  inline def MIN_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SAFE_INTEGER")(x.asInstanceOf[js.Any])
  
  /**
    * A three-dimensional matrix.
    * 
    * Defaults to the identity matrix when instantiated.
    */
  @JSGlobal("Phaser.Math.Matrix3")
  @js.native
  /**
    * 
    * @param m Optional Matrix3 to copy values from.
    */
  open class Matrix3 ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Math.Matrix3 {
    def this(m: typingsJapgolly.phaser.Phaser.Math.Matrix3) = this()
  }
  
  /**
    * A four-dimensional matrix.
    * 
    * Adapted from [gl-matrix](https://github.com/toji/gl-matrix) by toji
    * and [vecmath](https://github.com/mattdesl/vecmath) by mattdesl
    */
  @JSGlobal("Phaser.Math.Matrix4")
  @js.native
  /**
    * 
    * @param m Optional Matrix4 to copy values from.
    */
  open class Matrix4 ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Math.Matrix4 {
    def this(m: typingsJapgolly.phaser.Phaser.Math.Matrix4) = this()
  }
  
  /**
    * Add an `amount` to a `value`, limiting the maximum result to `max`.
    * @param value The value to add to.
    * @param amount The amount to add.
    * @param max The maximum value to return.
    */
  inline def MaxAdd(value: Double, amount: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxAdd")(value.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Calculate the median of the given values. The values are sorted and the middle value is returned.
    * In case of an even number of values, the average of the two middle values is returned.
    * @param values The values to average.
    */
  inline def Median(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Median")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Subtract an `amount` from `value`, limiting the minimum result to `min`.
    * @param value The value to subtract from.
    * @param amount The amount to subtract.
    * @param min The minimum value to return.
    */
  inline def MinSub(value: Double, amount: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("MinSub")(value.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * The value of PI * 2.
    */
  @JSGlobal("Phaser.Math.PI2")
  @js.native
  def PI2: Double = js.native
  inline def PI2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI2")(x.asInstanceOf[js.Any])
  
  /**
    * Work out what percentage `value` is of the range between `min` and `max`.
    * If `max` isn't given then it will return the percentage of `value` to `min`.
    * 
    * You can optionally specify an `upperMax` value, which is a mid-way point in the range that represents 100%, after which the % starts to go down to zero again.
    * @param value The value to determine the percentage of.
    * @param min The minimum value.
    * @param max The maximum value.
    * @param upperMax The mid-way point in the range that represents 100%.
    */
  inline def Percent(value: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Percent")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def Percent(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Percent")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def Percent(value: Double, min: Double, max: Double, upperMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Percent")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], upperMax.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def Percent(value: Double, min: Double, max: Unit, upperMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Percent")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], upperMax.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object Pow2 {
    
    @JSGlobal("Phaser.Math.Pow2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the nearest power of 2 to the given `value`.
      * @param value The value.
      */
    inline def GetNext(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNext")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Checks if the given `width` and `height` are a power of two.
      * Useful for checking texture dimensions.
      * @param width The width.
      * @param height The height.
      */
    inline def IsSize(width: Double, height: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Tests the value and returns `true` if it is a power of two.
      * @param value The value to check if it's a power of two.
      */
    inline def IsValue(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * A quaternion.
    */
  @JSGlobal("Phaser.Math.Quaternion")
  @js.native
  /**
    * 
    * @param x The x component. Default 0.
    * @param y The y component. Default 0.
    * @param z The z component. Default 0.
    * @param w The w component. Default 1.
    */
  open class Quaternion ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Math.Quaternion {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: Unit, w: Double) = this()
    def this(x: Double, y: Unit, z: Double, w: Double) = this()
    def this(x: Double, y: Unit, z: Unit, w: Double) = this()
    def this(x: Unit, y: Double, z: Double, w: Double) = this()
    def this(x: Unit, y: Double, z: Unit, w: Double) = this()
    def this(x: Unit, y: Unit, z: Double, w: Double) = this()
    def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
  }
  
  /**
    * For converting radians to degrees (180 / PI)
    */
  @JSGlobal("Phaser.Math.RAD_TO_DEG")
  @js.native
  def RAD_TO_DEG: Double = js.native
  inline def RAD_TO_DEG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAD_TO_DEG")(x.asInstanceOf[js.Any])
  
  /**
    * An instance of the Random Number Generator.
    * This is not set until the Game boots.
    */
  @JSGlobal("Phaser.Math.RND")
  @js.native
  def RND: typingsJapgolly.phaser.Phaser.Math.RandomDataGenerator = js.native
  inline def RND_=(x: typingsJapgolly.phaser.Phaser.Math.RandomDataGenerator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RND")(x.asInstanceOf[js.Any])
  
  /**
    * Convert the given angle in radians, to the equivalent angle in degrees.
    * @param radians The angle in radians to convert ot degrees.
    */
  inline def RadToDeg(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("RadToDeg")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * A seeded Random Data Generator.
    * 
    * Access via `Phaser.Math.RND` which is an instance of this class pre-defined
    * by Phaser. Or, create your own instance to use as you require.
    * 
    * The `Math.RND` generator is seeded by the Game Config property value `seed`.
    * If no such config property exists, a random number is used.
    * 
    * If you create your own instance of this class you should provide a seed for it.
    * If no seed is given it will use a 'random' one based on Date.now.
    */
  @JSGlobal("Phaser.Math.RandomDataGenerator")
  @js.native
  /**
    * 
    * @param seeds The seeds to use for the random number generator.
    */
  open class RandomDataGenerator ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Math.RandomDataGenerator {
    def this(seeds: String) = this()
    def this(seeds: js.Array[String]) = this()
  }
  
  /**
    * Compute a random unit vector.
    * 
    * Computes random values for the given vector between -1 and 1 that can be used to represent a direction.
    * 
    * Optionally accepts a scale value to scale the resulting vector by.
    * @param vector The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  inline def RandomXY(vector: typingsJapgolly.phaser.Phaser.Math.Vector2): typingsJapgolly.phaser.Phaser.Math.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomXY")(vector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector2]
  inline def RandomXY(vector: typingsJapgolly.phaser.Phaser.Math.Vector2, scale: Double): typingsJapgolly.phaser.Phaser.Math.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomXY")(vector.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector2]
  
  /**
    * Compute a random position vector in a spherical area, optionally defined by the given radius.
    * @param vec3 The Vector to compute random values for.
    * @param radius The radius. Default 1.
    */
  inline def RandomXYZ(vec3: typingsJapgolly.phaser.Phaser.Math.Vector3): typingsJapgolly.phaser.Phaser.Math.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomXYZ")(vec3.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector3]
  inline def RandomXYZ(vec3: typingsJapgolly.phaser.Phaser.Math.Vector3, radius: Double): typingsJapgolly.phaser.Phaser.Math.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomXYZ")(vec3.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector3]
  
  /**
    * Compute a random four-dimensional vector.
    * @param vec4 The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  inline def RandomXYZW(vec4: typingsJapgolly.phaser.Phaser.Math.Vector4): typingsJapgolly.phaser.Phaser.Math.Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomXYZW")(vec4.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector4]
  inline def RandomXYZW(vec4: typingsJapgolly.phaser.Phaser.Math.Vector4, scale: Double): typingsJapgolly.phaser.Phaser.Math.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomXYZW")(vec4.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector4]
  
  inline def Rotate(point: js.Object, angle: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Point]
  /**
    * Rotate a given point by a given angle around the origin (0, 0), in an anti-clockwise direction.
    * @param point The point to be rotated.
    * @param angle The angle to be rotated by in an anticlockwise direction.
    */
  inline def Rotate(point: Point, angle: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  /**
    * Rotate a `point` around `x` and `y` to the given `angle`, at the same distance.
    * 
    * In polar notation, this maps a point from (r, t) to (r, angle), vs. the origin (x, y).
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    */
  inline def RotateAround[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAround")(point.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Rotate a `point` around `x` and `y` by the given `angle` and `distance`.
    * 
    * In polar notation, this maps a point from (r, t) to (distance, t + angle), vs. the origin (x, y).
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  inline def RotateAroundDistance[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double, distance: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAroundDistance")(point.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Position a `point` at the given `angle` and `distance` to (`x`, `y`).
    * @param point The point to be positioned.
    * @param x The horizontal coordinate to position from.
    * @param y The vertical coordinate to position from.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  inline def RotateTo[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double, distance: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateTo")(point.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Rotates a vector in place by axis angle.
    * 
    * This is the same as transforming a point by an
    * axis-angle quaternion, but it has higher precision.
    * @param vec The vector to be rotated.
    * @param axis The axis to rotate around.
    * @param radians The angle of rotation in radians.
    */
  inline def RotateVec3(
    vec: typingsJapgolly.phaser.Phaser.Math.Vector3,
    axis: typingsJapgolly.phaser.Phaser.Math.Vector3,
    radians: Double
  ): typingsJapgolly.phaser.Phaser.Math.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateVec3")(vec.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], radians.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector3]
  
  /**
    * Round a given number so it is further away from zero. That is, positive numbers are rounded up, and negative numbers are rounded down.
    * @param value The number to round.
    */
  inline def RoundAwayFromZero(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("RoundAwayFromZero")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Round a value to the given precision.
    * 
    * For example:
    * 
    * ```javascript
    * RoundTo(123.456, 0) = 123
    * RoundTo(123.456, 1) = 120
    * RoundTo(123.456, 2) = 100
    * ```
    * 
    * To round the decimal, i.e. to round to precision, pass in a negative `place`:
    * 
    * ```javascript
    * RoundTo(123.456789, 0) = 123
    * RoundTo(123.456789, -1) = 123.5
    * RoundTo(123.456789, -2) = 123.46
    * RoundTo(123.456789, -3) = 123.457
    * ```
    * @param value The value to round.
    * @param place The place to round to. Positive to round the units, negative to round the decimal. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  inline def RoundTo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("RoundTo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def RoundTo(value: Double, place: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RoundTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def RoundTo(value: Double, place: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RoundTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def RoundTo(value: Double, place: Unit, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RoundTo")(value.asInstanceOf[js.Any], place.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Generate a series of sine and cosine values.
    * @param length The number of values to generate.
    * @param sinAmp The sine value amplitude. Default 1.
    * @param cosAmp The cosine value amplitude. Default 1.
    * @param frequency The frequency of the values. Default 1.
    */
  inline def SinCosTableGenerator(length: Double): SinCosTable = ^.asInstanceOf[js.Dynamic].applyDynamic("SinCosTableGenerator")(length.asInstanceOf[js.Any]).asInstanceOf[SinCosTable]
  inline def SinCosTableGenerator(length: Double, sinAmp: Double): SinCosTable = (^.asInstanceOf[js.Dynamic].applyDynamic("SinCosTableGenerator")(length.asInstanceOf[js.Any], sinAmp.asInstanceOf[js.Any])).asInstanceOf[SinCosTable]
  inline def SinCosTableGenerator(length: Double, sinAmp: Double, cosAmp: Double): SinCosTable = (^.asInstanceOf[js.Dynamic].applyDynamic("SinCosTableGenerator")(length.asInstanceOf[js.Any], sinAmp.asInstanceOf[js.Any], cosAmp.asInstanceOf[js.Any])).asInstanceOf[SinCosTable]
  inline def SinCosTableGenerator(length: Double, sinAmp: Double, cosAmp: Double, frequency: Double): SinCosTable = (^.asInstanceOf[js.Dynamic].applyDynamic("SinCosTableGenerator")(length.asInstanceOf[js.Any], sinAmp.asInstanceOf[js.Any], cosAmp.asInstanceOf[js.Any], frequency.asInstanceOf[js.Any])).asInstanceOf[SinCosTable]
  inline def SinCosTableGenerator(length: Double, sinAmp: Double, cosAmp: Unit, frequency: Double): SinCosTable = (^.asInstanceOf[js.Dynamic].applyDynamic("SinCosTableGenerator")(length.asInstanceOf[js.Any], sinAmp.asInstanceOf[js.Any], cosAmp.asInstanceOf[js.Any], frequency.asInstanceOf[js.Any])).asInstanceOf[SinCosTable]
  inline def SinCosTableGenerator(length: Double, sinAmp: Unit, cosAmp: Double): SinCosTable = (^.asInstanceOf[js.Dynamic].applyDynamic("SinCosTableGenerator")(length.asInstanceOf[js.Any], sinAmp.asInstanceOf[js.Any], cosAmp.asInstanceOf[js.Any])).asInstanceOf[SinCosTable]
  inline def SinCosTableGenerator(length: Double, sinAmp: Unit, cosAmp: Double, frequency: Double): SinCosTable = (^.asInstanceOf[js.Dynamic].applyDynamic("SinCosTableGenerator")(length.asInstanceOf[js.Any], sinAmp.asInstanceOf[js.Any], cosAmp.asInstanceOf[js.Any], frequency.asInstanceOf[js.Any])).asInstanceOf[SinCosTable]
  inline def SinCosTableGenerator(length: Double, sinAmp: Unit, cosAmp: Unit, frequency: Double): SinCosTable = (^.asInstanceOf[js.Dynamic].applyDynamic("SinCosTableGenerator")(length.asInstanceOf[js.Any], sinAmp.asInstanceOf[js.Any], cosAmp.asInstanceOf[js.Any], frequency.asInstanceOf[js.Any])).asInstanceOf[SinCosTable]
  
  /**
    * Calculate a smooth interpolation percentage of `x` between `min` and `max`.
    * 
    * The function receives the number `x` as an argument and returns 0 if `x` is less than or equal to the left edge,
    * 1 if `x` is greater than or equal to the right edge, and smoothly interpolates, using a Hermite polynomial,
    * between 0 and 1 otherwise.
    * @param x The input value.
    * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
    * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
    */
  inline def SmoothStep(x: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothStep")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Calculate a smoother interpolation percentage of `x` between `min` and `max`.
    * 
    * The function receives the number `x` as an argument and returns 0 if `x` is less than or equal to the left edge,
    * 1 if `x` is greater than or equal to the right edge, and smoothly interpolates, using a Hermite polynomial,
    * between 0 and 1 otherwise.
    * 
    * Produces an even smoother interpolation than {@link Phaser.Math.SmoothStep}.
    * @param x The input value.
    * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
    * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
    */
  inline def SmootherStep(x: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SmootherStep")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object Snap {
    
    @JSGlobal("Phaser.Math.Snap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Snap a value to nearest grid slice, using ceil.
      * 
      * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `15`.
      * As will `14` snap to `15`... but `16` will snap to `20`.
      * @param value The value to snap.
      * @param gap The interval gap of the grid.
      * @param start Optional starting offset for gap. Default 0.
      * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
      */
    inline def Ceil(value: Double, gap: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Ceil")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def Ceil(value: Double, gap: Double, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Ceil")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def Ceil(value: Double, gap: Double, start: Double, divide: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Ceil")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any], divide.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def Ceil(value: Double, gap: Double, start: Unit, divide: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Ceil")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any], divide.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Snap a value to nearest grid slice, using floor.
      * 
      * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `10`.
      * As will `14` snap to `10`... but `16` will snap to `15`.
      * @param value The value to snap.
      * @param gap The interval gap of the grid.
      * @param start Optional starting offset for gap. Default 0.
      * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
      */
    inline def Floor(value: Double, gap: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Floor")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def Floor(value: Double, gap: Double, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Floor")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def Floor(value: Double, gap: Double, start: Double, divide: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Floor")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any], divide.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def Floor(value: Double, gap: Double, start: Unit, divide: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Floor")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any], divide.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Snap a value to nearest grid slice, using rounding.
      * 
      * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `10` whereas `14` will snap to `15`.
      * @param value The value to snap.
      * @param gap The interval gap of the grid.
      * @param start Optional starting offset for gap. Default 0.
      * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
      */
    inline def To(value: Double, gap: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("To")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def To(value: Double, gap: Double, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("To")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def To(value: Double, gap: Double, start: Double, divide: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("To")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any], divide.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def To(value: Double, gap: Double, start: Unit, divide: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("To")(value.asInstanceOf[js.Any], gap.asInstanceOf[js.Any], start.asInstanceOf[js.Any], divide.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  /**
    * The value of PI * 0.5.
    */
  @JSGlobal("Phaser.Math.TAU")
  @js.native
  def TAU: Double = js.native
  inline def TAU_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAU")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Vector2 containing the x and y position of the given index in a `width` x `height` sized grid.
    * 
    * For example, in a 6 x 4 grid, index 16 would equal x: 4 y: 2.
    * 
    * If the given index is out of range an empty Vector2 is returned.
    * @param index The position within the grid to get the x/y value for.
    * @param width The width of the grid.
    * @param height The height of the grid.
    * @param out An optional Vector2 to store the result in. If not given, a new Vector2 instance will be created.
    */
  inline def ToXY(index: Double, width: Double, height: Double): typingsJapgolly.phaser.Phaser.Math.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("ToXY")(index.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector2]
  inline def ToXY(index: Double, width: Double, height: Double, out: typingsJapgolly.phaser.Phaser.Math.Vector2): typingsJapgolly.phaser.Phaser.Math.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("ToXY")(index.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector2]
  
  /**
    * Takes the `x` and `y` coordinates and transforms them into the same space as
    * defined by the position, rotation and scale values.
    * @param x The x coordinate to be transformed.
    * @param y The y coordinate to be transformed.
    * @param positionX Horizontal position of the transform point.
    * @param positionY Vertical position of the transform point.
    * @param rotation Rotation of the transform point, in radians.
    * @param scaleX Horizontal scale of the transform point.
    * @param scaleY Vertical scale of the transform point.
    * @param output The output vector, point or object for the translated coordinates.
    */
  inline def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double
  ): typingsJapgolly.phaser.Phaser.Math.Vector2 | Point | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformXY")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], positionX.asInstanceOf[js.Any], positionY.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector2 | Point | js.Object]
  inline def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: js.Object
  ): typingsJapgolly.phaser.Phaser.Math.Vector2 | Point | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformXY")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], positionX.asInstanceOf[js.Any], positionY.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector2 | Point | js.Object]
  inline def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: Point
  ): typingsJapgolly.phaser.Phaser.Math.Vector2 | Point | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformXY")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], positionX.asInstanceOf[js.Any], positionY.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector2 | Point | js.Object]
  inline def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: typingsJapgolly.phaser.Phaser.Math.Vector2
  ): typingsJapgolly.phaser.Phaser.Math.Vector2 | Point | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformXY")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], positionX.asInstanceOf[js.Any], positionY.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.Phaser.Math.Vector2 | Point | js.Object]
  
  /**
    * A representation of a vector in 2D space.
    * 
    * A two-component vector.
    */
  @JSGlobal("Phaser.Math.Vector2")
  @js.native
  /**
    * 
    * @param x The x component, or an object with `x` and `y` properties.
    * @param y The y component.
    */
  open class Vector2 ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Math.Vector2 {
    def this(x: Double) = this()
    def this(x: Vector2Like) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Vector2Like, y: Double) = this()
  }
  object Vector2 {
    
    /**
      * A static down Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.DOWN")
    @js.native
    val DOWN: typingsJapgolly.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static left Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.LEFT")
    @js.native
    val LEFT: typingsJapgolly.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static one Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.ONE")
    @js.native
    val ONE: typingsJapgolly.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static right Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.RIGHT")
    @js.native
    val RIGHT: typingsJapgolly.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static up Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.UP")
    @js.native
    val UP: typingsJapgolly.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static zero Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.ZERO")
    @js.native
    val ZERO: typingsJapgolly.phaser.Phaser.Math.Vector2 = js.native
  }
  
  /**
    * A representation of a vector in 3D space.
    * 
    * A three-component vector.
    */
  @JSGlobal("Phaser.Math.Vector3")
  @js.native
  /**
    * 
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  open class Vector3 ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Math.Vector3 {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
  }
  object Vector3 {
    
    /**
      * A static back Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.BACK")
    @js.native
    val BACK: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static down Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.DOWN")
    @js.native
    val DOWN: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static forward Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.FORWARD")
    @js.native
    val FORWARD: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static left Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.LEFT")
    @js.native
    val LEFT: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static one Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.ONE")
    @js.native
    val ONE: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static right Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.RIGHT")
    @js.native
    val RIGHT: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static up Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.UP")
    @js.native
    val UP: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static zero Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.ZERO")
    @js.native
    val ZERO: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
  }
  
  /**
    * A representation of a vector in 4D space.
    * 
    * A four-component vector.
    */
  @JSGlobal("Phaser.Math.Vector4")
  @js.native
  /**
    * 
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    * @param w The w component.
    */
  open class Vector4 ()
    extends StObject
       with typingsJapgolly.phaser.Phaser.Math.Vector4 {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: Unit, w: Double) = this()
    def this(x: Double, y: Unit, z: Double, w: Double) = this()
    def this(x: Double, y: Unit, z: Unit, w: Double) = this()
    def this(x: Unit, y: Double, z: Double, w: Double) = this()
    def this(x: Unit, y: Double, z: Unit, w: Double) = this()
    def this(x: Unit, y: Unit, z: Double, w: Double) = this()
    def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
  }
  
  /**
    * Checks if the two values are within the given `tolerance` of each other.
    * @param a The first value to use in the calculation.
    * @param b The second value to use in the calculation.
    * @param tolerance The tolerance. Anything equal to or less than this value is considered as being within range.
    */
  inline def Within(a: Double, b: Double, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Within")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Wrap the given `value` between `min` and `max.
    * @param value The value to wrap.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  inline def Wrap(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Wrap")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
