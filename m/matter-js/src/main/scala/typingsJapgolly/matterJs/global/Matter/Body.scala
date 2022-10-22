package typingsJapgolly.matterJs.global.Matter

import typingsJapgolly.matterJs.mod.IBodyDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Body")
@js.native
open class Body ()
  extends typingsJapgolly.matterJs.mod.Body
/* static members */
object Body {
  
  @JSGlobal("Matter.Body")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Applies a force to a body from a given world-space position, including resulting torque.
    * @method applyForce
    * @param {Body} body
    * @param {Vector} position
    * @param {Vector} force
    */
  inline def applyForce(
    body: typingsJapgolly.matterJs.mod.Body,
    position: typingsJapgolly.matterJs.mod.Vector,
    force: typingsJapgolly.matterJs.mod.Vector
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyForce")(body.asInstanceOf[js.Any], position.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new rigid body model. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @returns {Body} body
    */
  inline def create(options: IBodyDefinition): typingsJapgolly.matterJs.mod.Body = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matterJs.mod.Body]
  
  /**
    * Returns the next unique category bitfield (starting after the initial default category `0x0001`).
    * There are 32 available. See `body.collisionFilter` for more information.
    * @method nextCategory
    * @returns {Number} Unique category bitfield
    */
  inline def nextCategory(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextCategory")().asInstanceOf[Double]
  
  /**
    * Returns the next unique group index for which bodies will collide.
    * If `isNonColliding` is `true`, returns the next unique group index for which bodies will _not_ collide.
    * See `body.collisionFilter` for more information.
    * @method nextGroup
    * @param {boolean} [isNonColliding=false]
    * @returns {Number} Unique group index
    */
  inline def nextGroup(isNonColliding: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextGroup")(isNonColliding.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Rotates a body by a given angle relative to its current angle, without imparting any angular velocity.
    * @method rotate
    * @param {Body} body
    * @param {number} rotation
    */
  inline def rotate(body: typingsJapgolly.matterJs.mod.Body, rotation: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(body.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Scales the body, including updating physical properties (mass, area, axes, inertia), from a world-space point (default is body centre).
    * @method scale
    * @param {Body} body
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {Vector} [point]
    */
  inline def scale(body: typingsJapgolly.matterJs.mod.Body, scaleX: Double, scaleY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(body.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scale(
    body: typingsJapgolly.matterJs.mod.Body,
    scaleX: Double,
    scaleY: Double,
    point: typingsJapgolly.matterJs.mod.Vector
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(body.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Given a property and a value (or map of), sets the property(s) on the body, using the appropriate setter functions if they exist.
    * Prefer to use the actual setter functions in performance critical situations.
    * @method set
    * @param {Body} body
    * @param {} settings A property name (or map of properties and values) to set on the body.
    * @param {} value The value to set if `settings` is a single property name.
    */
  inline def set(body: typingsJapgolly.matterJs.mod.Body, settings: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(body: typingsJapgolly.matterJs.mod.Body, settings: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the angle of the body instantly. Angular velocity, position, force etc. are unchanged.
    * @method setAngle
    * @param {Body} body
    * @param {number} angle
    */
  inline def setAngle(body: typingsJapgolly.matterJs.mod.Body, angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAngle")(body.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the angular velocity of the body instantly. Position, angle, force etc. are unchanged. See also `Body.applyForce`.
    * @method setAngularVelocity
    * @param {Body} body
    * @param {number} velocity
    */
  inline def setAngularVelocity(body: typingsJapgolly.matterJs.mod.Body, velocity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAngularVelocity")(body.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Set the centre of mass of the body.
    * The `centre` is a vector in world-space unless `relative` is set, in which case it is a translation.
    * The centre of mass is the point the body rotates about and can be used to simulate non-uniform density.
    * This is equal to moving `body.position` but not the `body.vertices`.
    * Invalid if the `centre` falls outside the body's convex hull.
    * @method setCentre
    * @param body
    * @param centre
    * @param relative
    */
  inline def setCentre(body: typingsJapgolly.matterJs.mod.Body, centre: typingsJapgolly.matterJs.mod.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCentre")(body.asInstanceOf[js.Any], centre.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCentre(
    body: typingsJapgolly.matterJs.mod.Body,
    centre: typingsJapgolly.matterJs.mod.Vector,
    relative: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCentre")(body.asInstanceOf[js.Any], centre.asInstanceOf[js.Any], relative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the density of the body. Mass is automatically updated to reflect the change.
    * @method setDensity
    * @param {Body} body
    * @param {number} density
    */
  inline def setDensity(body: typingsJapgolly.matterJs.mod.Body, density: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDensity")(body.asInstanceOf[js.Any], density.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the moment of inertia (i.e. second moment of area) of the body of the body.
    * Inverse inertia is automatically updated to reflect the change. Mass is not changed.
    * @method setInertia
    * @param {Body} body
    * @param {number} inertia
    */
  inline def setInertia(body: typingsJapgolly.matterJs.mod.Body, interna: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInertia")(body.asInstanceOf[js.Any], interna.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the mass of the body. Inverse mass and density are automatically updated to reflect the change.
    * @method setMass
    * @param {Body} body
    * @param {number} mass
    */
  inline def setMass(body: typingsJapgolly.matterJs.mod.Body, mass: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMass")(body.asInstanceOf[js.Any], mass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the parts of the `body` and updates mass, inertia and centroid.
    * Each part will have its parent set to `body`.
    * By default the convex hull will be automatically computed and set on `body`, unless `autoHull` is set to `false.`
    * Note that this method will ensure that the first part in `body.parts` will always be the `body`.
    * @method setParts
    * @param {Body} body
    * @param [body] parts
    * @param {boolean} [autoHull=true]
    */
  inline def setParts(body: typingsJapgolly.matterJs.mod.Body, parts: js.Array[typingsJapgolly.matterJs.mod.Body]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParts")(body.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setParts(
    body: typingsJapgolly.matterJs.mod.Body,
    parts: js.Array[typingsJapgolly.matterJs.mod.Body],
    autoHull: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParts")(body.asInstanceOf[js.Any], parts.asInstanceOf[js.Any], autoHull.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the position of the body instantly. Velocity, angle, force etc. are unchanged.
    * @method setPosition
    * @param {Body} body
    * @param {Vector} position
    */
  inline def setPosition(body: typingsJapgolly.matterJs.mod.Body, position: typingsJapgolly.matterJs.mod.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(body.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the body as static, including isStatic flag and setting mass and inertia to Infinity.
    * @method setStatic
    * @param {Body} body
    * @param {boolean} isStatic
    */
  inline def setStatic(body: typingsJapgolly.matterJs.mod.Body, isStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatic")(body.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the linear velocity of the body instantly. Position, angle, force etc. are unchanged. See also `Body.applyForce`.
    * @method setVelocity
    * @param {Body} body
    * @param {Vector} velocity
    */
  inline def setVelocity(body: typingsJapgolly.matterJs.mod.Body, velocity: typingsJapgolly.matterJs.mod.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVelocity")(body.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the body's vertices and updates body properties accordingly, including inertia, area and mass (with respect to `body.density`).
    * Vertices will be automatically transformed to be orientated around their centre of mass as the origin.
    * They are then automatically translated to world space based on `body.position`.
    *
    * The `vertices` argument should be passed as an array of `Matter.Vector` points (or a `Matter.Vertices` array).
    * Vertices must form a convex hull, concave hulls are not supported.
    *
    * @method setVertices
    * @param {Body} body
    * @param {Vector[]} vertices
    */
  inline def setVertices(body: typingsJapgolly.matterJs.mod.Body, vertices: js.Array[typingsJapgolly.matterJs.mod.Vector]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVertices")(body.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Moves a body by a given vector relative to its current position, without imparting any velocity.
    * @method translate
    * @param {Body} body
    * @param {Vector} translation
    */
  inline def translate(body: typingsJapgolly.matterJs.mod.Body, translation: typingsJapgolly.matterJs.mod.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(body.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Performs a simulation step for the given `body`, including updating position and angle using Verlet integration.
    * @method update
    * @param {Body} body
    * @param {number} deltaTime
    * @param {number} timeScale
    * @param {number} correction
    */
  inline def update(body: typingsJapgolly.matterJs.mod.Body, deltaTime: Double, timeScale: Double, correction: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(body.asInstanceOf[js.Any], deltaTime.asInstanceOf[js.Any], timeScale.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
