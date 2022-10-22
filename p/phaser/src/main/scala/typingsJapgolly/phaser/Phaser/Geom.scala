package typingsJapgolly.phaser.Phaser

import typingsJapgolly.phaser.Phaser.Cameras.Scene2D.Camera
import typingsJapgolly.phaser.Phaser.GameObjects.Components.TransformMatrix
import typingsJapgolly.phaser.Phaser.Math.Matrix4
import typingsJapgolly.phaser.Phaser.Math.Vector2
import typingsJapgolly.phaser.Phaser.Math.Vector3
import typingsJapgolly.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geom {
  
  /**
    * A Circle object.
    * 
    * This is a geometry object, containing numerical values and related methods to inspect and modify them.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render a Circle you should look at the capabilities of the Graphics class.
    */
  @js.native
  trait Circle extends StObject {
    
    /**
      * The bottom position of the Circle.
      */
    var bottom: Double = js.native
    
    /**
      * Check to see if the Circle contains the given x / y coordinates.
      * @param x The x coordinate to check within the circle.
      * @param y The y coordinate to check within the circle.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * The diameter of the Circle.
      */
    var diameter: Double = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, out: O): O = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
      * based on the given quantity or stepRate values.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double, output: O): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Unit, output: O): O = js.native
    
    /**
      * Returns a uniformly distributed random point from anywhere within the Circle.
      * @param point A Point or point-like object to set the random `x` and `y` values in.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    
    /**
      * Checks to see if the Circle is empty: has a radius of zero.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * The left position of the Circle.
      */
    var left: Double = js.native
    
    /**
      * The radius of the Circle.
      */
    var radius: Double = js.native
    
    /**
      * The right position of the Circle.
      */
    var right: Double = js.native
    
    /**
      * Sets this Circle to be empty with a radius of zero.
      * Does not change its position.
      */
    def setEmpty(): this.type = js.native
    
    /**
      * Sets the position of this Circle.
      * @param x The x position of the center of the circle. Default 0.
      * @param y The y position of the center of the circle. Default 0.
      */
    def setPosition(): this.type = js.native
    def setPosition(x: Double): this.type = js.native
    def setPosition(x: Double, y: Double): this.type = js.native
    def setPosition(x: Unit, y: Double): this.type = js.native
    
    /**
      * Sets the x, y and radius of this circle.
      * @param x The x position of the center of the circle. Default 0.
      * @param y The y position of the center of the circle. Default 0.
      * @param radius The radius of the circle. Default 0.
      */
    def setTo(): this.type = js.native
    def setTo(x: Double): this.type = js.native
    def setTo(x: Double, y: Double): this.type = js.native
    def setTo(x: Double, y: Double, radius: Double): this.type = js.native
    def setTo(x: Double, y: Unit, radius: Double): this.type = js.native
    def setTo(x: Unit, y: Double): this.type = js.native
    def setTo(x: Unit, y: Double, radius: Double): this.type = js.native
    def setTo(x: Unit, y: Unit, radius: Double): this.type = js.native
    
    /**
      * The top position of the Circle.
      */
    var top: Double = js.native
    
    /**
      * The geometry constant type of this object: `GEOM_CONST.CIRCLE`.
      * Used for fast type comparisons.
      */
    val `type`: Double = js.native
    
    /**
      * The x position of the center of the circle.
      */
    var x: Double = js.native
    
    /**
      * The y position of the center of the circle.
      */
    var y: Double = js.native
  }
  
  /**
    * An Ellipse object.
    * 
    * This is a geometry object, containing numerical values and related methods to inspect and modify them.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render an Ellipse you should look at the capabilities of the Graphics class.
    */
  @js.native
  trait Ellipse extends StObject {
    
    /**
      * The bottom position of the Ellipse.
      */
    var bottom: Double = js.native
    
    /**
      * Check to see if the Ellipse contains the given x / y coordinates.
      * @param x The x coordinate to check within the ellipse.
      * @param y The y coordinate to check within the ellipse.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Returns the major radius of the ellipse. Also known as the Semi Major Axis.
      */
    def getMajorRadius(): Double = js.native
    
    /**
      * Returns the minor radius of the ellipse. Also known as the Semi Minor Axis.
      */
    def getMinorRadius(): Double = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, out: O): O = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
      * based on the given quantity or stepRate values.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double, output: O): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Unit, output: O): O = js.native
    
    /**
      * Returns a uniformly distributed random point from anywhere within the given Ellipse.
      * @param point A Point or point-like object to set the random `x` and `y` values in.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    
    /**
      * The height of the ellipse.
      */
    var height: Double = js.native
    
    /**
      * Checks to see if the Ellipse is empty: has a width or height equal to zero.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * The left position of the Ellipse.
      */
    var left: Double = js.native
    
    /**
      * The right position of the Ellipse.
      */
    var right: Double = js.native
    
    /**
      * Sets this Ellipse to be empty with a width and height of zero.
      * Does not change its position.
      */
    def setEmpty(): this.type = js.native
    
    /**
      * Sets the position of this Ellipse.
      * @param x The x position of the center of the ellipse.
      * @param y The y position of the center of the ellipse.
      */
    def setPosition(x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the size of this Ellipse.
      * Does not change its position.
      * @param width The width of the ellipse.
      * @param height The height of the ellipse. Default width.
      */
    def setSize(width: Double): this.type = js.native
    def setSize(width: Double, height: Double): this.type = js.native
    
    /**
      * Sets the x, y, width and height of this ellipse.
      * @param x The x position of the center of the ellipse.
      * @param y The y position of the center of the ellipse.
      * @param width The width of the ellipse.
      * @param height The height of the ellipse.
      */
    def setTo(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    
    /**
      * The top position of the Ellipse.
      */
    var top: Double = js.native
    
    /**
      * The geometry constant type of this object: `GEOM_CONST.ELLIPSE`.
      * Used for fast type comparisons.
      */
    val `type`: Double = js.native
    
    /**
      * The width of the ellipse.
      */
    var width: Double = js.native
    
    /**
      * The x position of the center of the ellipse.
      */
    var x: Double = js.native
    
    /**
      * The y position of the center of the ellipse.
      */
    var y: Double = js.native
  }
  
  /**
    * Defines a Line segment, a part of a line between two endpoints.
    */
  @js.native
  trait Line extends StObject {
    
    /**
      * The bottom position of the Line.
      */
    var bottom: Double = js.native
    
    /**
      * Get a point on a line that's a given percentage along its length.
      * @param position A value between 0 and 1, where 0 is the start, 0.5 is the middle and 1 is the end of the line.
      * @param output An optional point, or point-like object, to store the coordinates of the point on the line.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, output: O): O = js.native
    
    /**
      * Returns a Vector2 object that corresponds to the start of this Line.
      * @param vec2 A Vector2 object to set the results in. If `undefined` a new Vector2 will be created.
      */
    def getPointA[O /* <: Vector2 */](): O = js.native
    def getPointA[O /* <: Vector2 */](vec2: O): O = js.native
    
    /**
      * Returns a Vector2 object that corresponds to the end of this Line.
      * @param vec2 A Vector2 object to set the results in. If `undefined` a new Vector2 will be created.
      */
    def getPointB[O /* <: Vector2 */](): O = js.native
    def getPointB[O /* <: Vector2 */](vec2: O): O = js.native
    
    /**
      * Get a number of points along a line's length.
      * 
      * Provide a `quantity` to get an exact number of points along the line.
      * 
      * Provide a `stepRate` to ensure a specific distance between each point on the line. Set `quantity` to `0` when
      * providing a `stepRate`.
      * @param quantity The number of points to place on the line. Set to `0` to use `stepRate` instead.
      * @param stepRate The distance between each point on the line. When set, `quantity` is implied and should be set to `0`.
      * @param output An optional array of Points, or point-like objects, to store the coordinates of the points on the line.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double, output: O): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Unit, output: O): O = js.native
    
    /**
      * Get a random Point on the Line.
      * @param point An instance of a Point to be modified.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    
    /**
      * The left position of the Line.
      */
    var left: Double = js.native
    
    /**
      * The right position of the Line.
      */
    var right: Double = js.native
    
    /**
      * Set new coordinates for the line endpoints.
      * @param x1 The x coordinate of the lines starting point. Default 0.
      * @param y1 The y coordinate of the lines starting point. Default 0.
      * @param x2 The x coordinate of the lines ending point. Default 0.
      * @param y2 The y coordinate of the lines ending point. Default 0.
      */
    def setTo(): this.type = js.native
    def setTo(x1: Double): this.type = js.native
    def setTo(x1: Double, y1: Double): this.type = js.native
    def setTo(x1: Double, y1: Double, x2: Double): this.type = js.native
    def setTo(x1: Double, y1: Double, x2: Double, y2: Double): this.type = js.native
    def setTo(x1: Double, y1: Double, x2: Unit, y2: Double): this.type = js.native
    def setTo(x1: Double, y1: Unit, x2: Double): this.type = js.native
    def setTo(x1: Double, y1: Unit, x2: Double, y2: Double): this.type = js.native
    def setTo(x1: Double, y1: Unit, x2: Unit, y2: Double): this.type = js.native
    def setTo(x1: Unit, y1: Double): this.type = js.native
    def setTo(x1: Unit, y1: Double, x2: Double): this.type = js.native
    def setTo(x1: Unit, y1: Double, x2: Double, y2: Double): this.type = js.native
    def setTo(x1: Unit, y1: Double, x2: Unit, y2: Double): this.type = js.native
    def setTo(x1: Unit, y1: Unit, x2: Double): this.type = js.native
    def setTo(x1: Unit, y1: Unit, x2: Double, y2: Double): this.type = js.native
    def setTo(x1: Unit, y1: Unit, x2: Unit, y2: Double): this.type = js.native
    
    /**
      * The top position of the Line.
      */
    var top: Double = js.native
    
    /**
      * The geometry constant type of this object: `GEOM_CONST.LINE`.
      * Used for fast type comparisons.
      */
    val `type`: Double = js.native
    
    /**
      * The x coordinate of the lines starting point.
      */
    var x1: Double = js.native
    
    /**
      * The x coordinate of the lines ending point.
      */
    var x2: Double = js.native
    
    /**
      * The y coordinate of the lines starting point.
      */
    var y1: Double = js.native
    
    /**
      * The y coordinate of the lines ending point.
      */
    var y2: Double = js.native
  }
  
  object Mesh {
    
    /**
      * A Face Geometry Object.
      * 
      * A Face is used by the Mesh Game Object. A Mesh consists of one, or more, faces that are
      * used to render the Mesh Game Objects in WebGL.
      * 
      * A Face consists of 3 Vertex instances, for the 3 corners of the face and methods to help
      * you modify and test them.
      */
    @js.native
    trait Face extends StObject {
      
      /**
        * Set the alpha value of this Face.
        * 
        * Each vertex is given the same value. If you need to adjust the alpha on a per-vertex basis
        * then use the `Vertex.alpha` property instead.
        * 
        * When getting the alpha of this Face, it will return an average of the alpha
        * component of all three vertices.
        */
      var alpha: Double = js.native
      
      /**
        * The bounds of this Face.
        * 
        * Be sure to call the `Face.updateBounds` method _before_ using this property.
        */
      var bounds: Rectangle = js.native
      
      /**
        * Checks if the given coordinates are within this Face.
        * 
        * You can optionally provide a transform matrix. If given, the Face vertices
        * will be transformed first, before being checked against the coordinates.
        * @param x The horizontal position to check.
        * @param y The vertical position to check.
        * @param calcMatrix Optional transform matrix to apply to the vertices before comparison.
        */
      def contains(x: Double, y: Double): Boolean = js.native
      def contains(x: Double, y: Double, calcMatrix: TransformMatrix): Boolean = js.native
      
      /**
        * The depth of this Face, which is an average of the z component of all three vertices.
        * 
        * The depth is calculated based on the transformed z value, not the local one.
        */
      val depth: Double = js.native
      
      /**
        * Destroys this Face and nulls the references to the vertices.
        */
      def destroy(): Unit = js.native
      
      /**
        * Calculates and returns the in-center position of this Face.
        * @param local Return the in center from the un-transformed vertex positions (`true`), or transformed? (`false`) Default true.
        */
      def getInCenter(): Vector2 = js.native
      def getInCenter(local: Boolean): Vector2 = js.native
      
      /**
        * Checks if the vertices in this Face are orientated counter-clockwise, or not.
        * 
        * It checks the transformed position of the vertices, not the local one.
        * @param z The z-axis value to test against. Typically the `Mesh.modelPosition.z`.
        */
      def isCounterClockwise(z: Double): Boolean = js.native
      
      /**
        * Checks if this Face is within the view of the given Camera.
        * 
        * This method is called in the `MeshWebGLRenderer` function. It performs the following tasks:
        * 
        * First, the `Vertex.update` method is called on each of the vertices. This populates them
        * with the new translated values, updating their `tx`, `ty` and `ta` properties.
        * 
        * Then it tests to see if this face is visible due to the alpha values, if not, it returns.
        * 
        * After this, if `hideCCW` is set, it calls `isCounterClockwise` and returns if not.
        * 
        * Finally, it will update the `Face.bounds` based on the newly translated vertex values
        * and return the results of an intersection test between the bounds and the camera world view
        * rectangle.
        * @param camera The Camera to check against.
        * @param hideCCW Test the counter-clockwise orientation of the verts?
        * @param z The Cameras z position, used in the CCW test.
        * @param alpha The alpha of the parent object.
        * @param a The parent transform matrix data a component.
        * @param b The parent transform matrix data b component.
        * @param c The parent transform matrix data c component.
        * @param d The parent transform matrix data d component.
        * @param e The parent transform matrix data e component.
        * @param f The parent transform matrix data f component.
        * @param roundPixels Round the vertex position or not?
        */
      def isInView(
        camera: Camera,
        hideCCW: Boolean,
        z: Double,
        alpha: Double,
        a: Double,
        b: Double,
        c: Double,
        d: Double,
        e: Double,
        f: Double,
        roundPixels: Boolean
      ): Boolean = js.native
      
      /**
        * Loads the data from this Vertex into the given Typed Arrays.
        * @param F32 A Float32 Array to insert the position, UV and unit data in to.
        * @param U32 A Uint32 Array to insert the color and alpha data in to.
        * @param offset The index of the array to insert this Vertex to.
        * @param textureUnit The texture unit currently in use.
        * @param tintEffect The tint effect to use.
        */
      def load(
        F32: js.typedarray.Float32Array,
        U32: js.typedarray.Uint32Array,
        offset: Double,
        textureUnit: Double,
        tintEffect: Double
      ): Double = js.native
      
      /**
        * Transforms all Face vertices by the given matrix, storing the results in their `vx`, `vy` and `vz` properties.
        * @param transformMatrix The transform matrix to apply to this vertex.
        * @param width The width of the parent Mesh.
        * @param height The height of the parent Mesh.
        * @param cameraZ The z position of the MeshCamera.
        */
      def transformCoordinatesLocal(transformMatrix: Matrix4, width: Double, height: Double, cameraZ: Double): this.type = js.native
      
      /**
        * Translates the vertices of this Face by the given amounts.
        * 
        * The actual vertex positions are adjusted, not their transformed position.
        * 
        * Therefore, this updates the vertex data directly.
        * @param x The amount to horizontally translate by.
        * @param y The amount to vertically translate by. Default 0.
        */
      def translate(x: Double): this.type = js.native
      def translate(x: Double, y: Double): this.type = js.native
      
      /**
        * Updates the bounds of this Face, based on the translated values of the vertices.
        * 
        * Call this method prior to accessing the `Face.bounds` property.
        */
      def updateBounds(): this.type = js.native
      
      /**
        * The first vertex in this Face.
        */
      var vertex1: Vertex = js.native
      
      /**
        * The second vertex in this Face.
        */
      var vertex2: Vertex = js.native
      
      /**
        * The third vertex in this Face.
        */
      var vertex3: Vertex = js.native
      
      /**
        * The x coordinate of this Face, based on the in center position of the Face.
        */
      var x: Double = js.native
      
      /**
        * The y coordinate of this Face, based on the in center position of the Face.
        */
      var y: Double = js.native
    }
    
    /**
      * A Vertex Geometry Object.
      * 
      * This class consists of all the information required for a single vertex within a Face Geometry Object.
      * 
      * Faces, and thus Vertex objects, are used by the Mesh Game Object in order to render objects in WebGL.
      */
    @js.native
    trait Vertex
      extends StObject
         with Vector3 {
      
      /**
        * The alpha value of this vertex.
        */
      var alpha: Double = js.native
      
      /**
        * The color value of this vertex.
        */
      var color: Double = js.native
      
      /**
        * Loads the data from this Vertex into the given Typed Arrays.
        * @param F32 A Float32 Array to insert the position, UV and unit data in to.
        * @param U32 A Uint32 Array to insert the color and alpha data in to.
        * @param offset The index of the array to insert this Vertex to.
        * @param textureUnit The texture unit currently in use.
        * @param tintEffect The tint effect to use.
        */
      def load(
        F32: js.typedarray.Float32Array,
        U32: js.typedarray.Uint32Array,
        offset: Double,
        textureUnit: Double,
        tintEffect: Double
      ): Double = js.native
      
      /**
        * The projected x coordinate of this vertex.
        */
      var nx: Double = js.native
      
      /**
        * The projected y coordinate of this vertex.
        */
      var ny: Double = js.native
      
      /**
        * The projected z coordinate of this vertex.
        */
      var nz: Double = js.native
      
      /**
        * Sets the U and V properties.
        * @param u The UV u coordinate of the vertex.
        * @param v The UV v coordinate of the vertex.
        */
      def setUVs(u: Double, v: Double): this.type = js.native
      
      /**
        * The translated alpha value of this vertex.
        */
      var ta: Double = js.native
      
      /**
        * Transforms this vertex by the given matrix, storing the results in `vx`, `vy` and `vz`.
        * @param transformMatrix The transform matrix to apply to this vertex.
        * @param width The width of the parent Mesh.
        * @param height The height of the parent Mesh.
        * @param cameraZ The z position of the MeshCamera.
        */
      def transformCoordinatesLocal(transformMatrix: Matrix4, width: Double, height: Double, cameraZ: Double): Unit = js.native
      
      /**
        * The translated x coordinate of this vertex.
        */
      var tx: Double = js.native
      
      /**
        * The translated y coordinate of this vertex.
        */
      var ty: Double = js.native
      
      /**
        * UV u coordinate of this vertex.
        */
      var u: Double = js.native
      
      /**
        * Updates this Vertex based on the given transform.
        * @param a The parent transform matrix data a component.
        * @param b The parent transform matrix data b component.
        * @param c The parent transform matrix data c component.
        * @param d The parent transform matrix data d component.
        * @param e The parent transform matrix data e component.
        * @param f The parent transform matrix data f component.
        * @param roundPixels Round the vertex position or not?
        * @param alpha The alpha of the parent object.
        */
      def update(
        a: Double,
        b: Double,
        c: Double,
        d: Double,
        e: Double,
        f: Double,
        roundPixels: Boolean,
        alpha: Double
      ): this.type = js.native
      
      /**
        * UV v coordinate of this vertex.
        */
      var v: Double = js.native
      
      /**
        * The projected x coordinate of this vertex.
        */
      var vx: Double = js.native
      
      /**
        * The projected y coordinate of this vertex.
        */
      var vy: Double = js.native
      
      /**
        * The projected z coordinate of this vertex.
        */
      var vz: Double = js.native
    }
  }
  
  /**
    * Defines a Point in 2D space, with an x and y component.
    */
  @js.native
  trait Point extends StObject {
    
    /**
      * Set the x and y coordinates of the point to the given values.
      * @param x The x coordinate of this Point. Default 0.
      * @param y The y coordinate of this Point. Default x.
      */
    def setTo(): this.type = js.native
    def setTo(x: Double): this.type = js.native
    def setTo(x: Double, y: Double): this.type = js.native
    def setTo(x: Unit, y: Double): this.type = js.native
    
    /**
      * The geometry constant type of this object: `GEOM_CONST.POINT`.
      * Used for fast type comparisons.
      */
    val `type`: Double = js.native
    
    /**
      * The x coordinate of this Point.
      */
    var x: Double = js.native
    
    /**
      * The y coordinate of this Point.
      */
    var y: Double = js.native
  }
  
  /**
    * A Polygon object
    * 
    * The polygon is a closed shape consists of a series of connected straight lines defined by list of ordered points.
    * Several formats are supported to define the list of points, check the setTo method for details.
    * This is a geometry object allowing you to define and inspect the shape.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render a Polygon you should look at the capabilities of the Graphics class.
    */
  @js.native
  trait Polygon extends StObject {
    
    /**
      * The area of this Polygon.
      */
    var area: Double = js.native
    
    /**
      * Calculates the area of the Polygon. This is available in the property Polygon.area
      */
    def calculateArea(): Double = js.native
    
    /**
      * Check to see if the Polygon contains the given x / y coordinates.
      * @param x The x coordinate to check within the polygon.
      * @param y The y coordinate to check within the polygon.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
      * based on the given quantity or stepRate values.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double, output: O): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Unit, output: O): O = js.native
    
    /**
      * An array of number pair objects that make up this polygon. I.e. [ {x,y}, {x,y}, {x,y} ]
      */
    var points: js.Array[Point] = js.native
    
    /**
      * Sets this Polygon to the given points.
      * 
      * The points can be set from a variety of formats:
      * 
      * - A string containing paired values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
      * - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
      * - An array of objects with public x/y properties: `[obj1, obj2, ...]`
      * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
      * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
      * 
      * `setTo` may also be called without any arguments to remove all points.
      * @param points Points defining the perimeter of this polygon. Please check function description above for the different supported formats.
      */
    def setTo(): this.type = js.native
    def setTo(points: String): this.type = js.native
    def setTo(points: js.Array[Double | Vector2Like]): this.type = js.native
    
    /**
      * The geometry constant type of this object: `GEOM_CONST.POLYGON`.
      * Used for fast type comparisons.
      */
    val `type`: Double = js.native
  }
  
  /**
    * Encapsulates a 2D rectangle defined by its corner point in the top-left and its extends in x (width) and y (height)
    */
  @js.native
  trait Rectangle extends StObject {
    
    /**
      * The sum of the y and height properties.
      * Changing the bottom property of a Rectangle object has no effect on the x, y and width properties, but does change the height property.
      */
    var bottom: Double = js.native
    
    /**
      * The x coordinate of the center of the Rectangle.
      */
    var centerX: Double = js.native
    
    /**
      * The y coordinate of the center of the Rectangle.
      */
    var centerY: Double = js.native
    
    /**
      * Checks if the given point is inside the Rectangle's bounds.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Returns a Line object that corresponds to the top of this Rectangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineA[O /* <: Line */](): O = js.native
    def getLineA[O /* <: Line */](line: O): O = js.native
    
    /**
      * Returns a Line object that corresponds to the right of this Rectangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineB[O /* <: Line */](): O = js.native
    def getLineB[O /* <: Line */](line: O): O = js.native
    
    /**
      * Returns a Line object that corresponds to the bottom of this Rectangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineC[O /* <: Line */](): O = js.native
    def getLineC[O /* <: Line */](line: O): O = js.native
    
    /**
      * Returns a Line object that corresponds to the left of this Rectangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineD[O /* <: Line */](): O = js.native
    def getLineD[O /* <: Line */](line: O): O = js.native
    
    /**
      * Calculates the coordinates of a point at a certain `position` on the Rectangle's perimeter.
      * 
      * The `position` is a fraction between 0 and 1 which defines how far into the perimeter the point is.
      * 
      * A value of 0 or 1 returns the point at the top left corner of the rectangle, while a value of 0.5 returns the point at the bottom right corner of the rectangle. Values between 0 and 0.5 are on the top or the right side and values between 0.5 and 1 are on the bottom or the left side.
      * @param position The normalized distance into the Rectangle's perimeter to return.
      * @param output An object to update with the `x` and `y` coordinates of the point.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, output: O): O = js.native
    
    /**
      * Returns an array of points from the perimeter of the Rectangle, each spaced out based on the quantity or step required.
      * @param quantity The number of points to return. Set to `false` or 0 to return an arbitrary number of points (`perimeter / stepRate`) evenly spaced around the Rectangle based on the `stepRate`.
      * @param stepRate If `quantity` is 0, determines the normalized distance between each returned point.
      * @param output An array to which to append the points.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double, output: O): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Unit, output: O): O = js.native
    
    /**
      * Returns a random point within the Rectangle's bounds.
      * @param point The object in which to store the `x` and `y` coordinates of the point.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    
    /**
      * The height of the Rectangle, i.e. the distance between its top side (defined by `y`) and its bottom side.
      */
    var height: Double = js.native
    
    /**
      * Determines if the Rectangle is empty. A Rectangle is empty if its width or height is less than or equal to 0.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * The x coordinate of the left of the Rectangle.
      * Changing the left property of a Rectangle object has no effect on the y and height properties. However it does affect the width property, whereas changing the x value does not affect the width property.
      */
    var left: Double = js.native
    
    /**
      * The sum of the x and width properties.
      * Changing the right property of a Rectangle object has no effect on the x, y and height properties, however it does affect the width property.
      */
    var right: Double = js.native
    
    /**
      * Resets the position, width, and height of the Rectangle to 0.
      */
    def setEmpty(): this.type = js.native
    
    /**
      * Sets the position of the Rectangle.
      * @param x The X coordinate of the top left corner of the Rectangle.
      * @param y The Y coordinate of the top left corner of the Rectangle. Default x.
      */
    def setPosition(x: Double): this.type = js.native
    def setPosition(x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the width and height of the Rectangle.
      * @param width The width to set the Rectangle to.
      * @param height The height to set the Rectangle to. Default width.
      */
    def setSize(width: Double): this.type = js.native
    def setSize(width: Double, height: Double): this.type = js.native
    
    /**
      * Sets the position, width, and height of the Rectangle.
      * @param x The X coordinate of the top left corner of the Rectangle.
      * @param y The Y coordinate of the top left corner of the Rectangle.
      * @param width The width of the Rectangle.
      * @param height The height of the Rectangle.
      */
    def setTo(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    
    /**
      * The y coordinate of the top of the Rectangle. Changing the top property of a Rectangle object has no effect on the x and width properties.
      * However it does affect the height property, whereas changing the y value does not affect the height property.
      */
    var top: Double = js.native
    
    /**
      * The geometry constant type of this object: `GEOM_CONST.RECTANGLE`.
      * Used for fast type comparisons.
      */
    val `type`: Double = js.native
    
    /**
      * The width of the Rectangle, i.e. the distance between its left side (defined by `x`) and its right side.
      */
    var width: Double = js.native
    
    /**
      * The X coordinate of the top left corner of the Rectangle.
      */
    var x: Double = js.native
    
    /**
      * The Y coordinate of the top left corner of the Rectangle.
      */
    var y: Double = js.native
  }
  
  /**
    * A triangle is a plane created by connecting three points.
    * The first two arguments specify the first point, the middle two arguments
    * specify the second point, and the last two arguments specify the third point.
    */
  @js.native
  trait Triangle extends StObject {
    
    /**
      * Bottom most Y coordinate of the triangle. Setting it moves the triangle on the Y axis accordingly.
      */
    var bottom: Double = js.native
    
    /**
      * Checks whether a given points lies within the triangle.
      * @param x The x coordinate of the point to check.
      * @param y The y coordinate of the point to check.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Returns a Line object that corresponds to Line A of this Triangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineA[O /* <: Line */](): O = js.native
    def getLineA[O /* <: Line */](line: O): O = js.native
    
    /**
      * Returns a Line object that corresponds to Line B of this Triangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineB[O /* <: Line */](): O = js.native
    def getLineB[O /* <: Line */](line: O): O = js.native
    
    /**
      * Returns a Line object that corresponds to Line C of this Triangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineC[O /* <: Line */](): O = js.native
    def getLineC[O /* <: Line */](line: O): O = js.native
    
    /**
      * Returns a specific point  on the triangle.
      * @param position Position as float within `0` and `1`. `0` equals the first point.
      * @param output Optional Point, or point-like object, that the calculated point will be written to.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, output: O): O = js.native
    
    /**
      * Calculates a list of evenly distributed points on the triangle. It is either possible to pass an amount of points to be generated (`quantity`) or the distance between two points (`stepRate`).
      * @param quantity Number of points to be generated. Can be falsey when `stepRate` should be used. All points have the same distance along the triangle.
      * @param stepRate Distance between two points. Will only be used when `quantity` is falsey.
      * @param output Optional Array for writing the calculated points into. Otherwise a new array will be created.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Double, output: O): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: Double, stepRate: Unit, output: O): O = js.native
    
    /**
      * Returns a random point along the triangle.
      * @param point Optional `Point` that should be modified. Otherwise a new one will be created.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    
    /**
      * Left most X coordinate of the triangle. Setting it moves the triangle on the X axis accordingly.
      */
    var left: Double = js.native
    
    /**
      * Right most X coordinate of the triangle. Setting it moves the triangle on the X axis accordingly.
      */
    var right: Double = js.native
    
    /**
      * Sets all three points of the triangle. Leaving out any coordinate sets it to be `0`.
      * @param x1 `x` coordinate of the first point. Default 0.
      * @param y1 `y` coordinate of the first point. Default 0.
      * @param x2 `x` coordinate of the second point. Default 0.
      * @param y2 `y` coordinate of the second point. Default 0.
      * @param x3 `x` coordinate of the third point. Default 0.
      * @param y3 `y` coordinate of the third point. Default 0.
      */
    def setTo(
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x2: js.UndefOr[Double],
      y2: js.UndefOr[Double],
      x3: js.UndefOr[Double],
      y3: js.UndefOr[Double]
    ): this.type = js.native
    
    /**
      * Top most Y coordinate of the triangle. Setting it moves the triangle on the Y axis accordingly.
      */
    var top: Double = js.native
    
    /**
      * The geometry constant type of this object: `GEOM_CONST.TRIANGLE`.
      * Used for fast type comparisons.
      */
    val `type`: Double = js.native
    
    /**
      * `x` coordinate of the first point.
      */
    var x1: Double = js.native
    
    /**
      * `x` coordinate of the second point.
      */
    var x2: Double = js.native
    
    /**
      * `x` coordinate of the third point.
      */
    var x3: Double = js.native
    
    /**
      * `y` coordinate of the first point.
      */
    var y1: Double = js.native
    
    /**
      * `y` coordinate of the second point.
      */
    var y2: Double = js.native
    
    /**
      * `y` coordinate of the third point.
      */
    var y3: Double = js.native
  }
}
