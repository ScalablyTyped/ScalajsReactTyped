package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPhysicsEngine extends StObject {
  
  /**
    * Called by the scene. No need to call it.
    * @param delta defines the timespan between frames
    */
  def _step(delta: Double): Unit
  
  /**
    * Adding a new impostor for the impostor tracking.
    * This will be done by the impostor itself.
    * @param impostor the impostor to add
    */
  def addImpostor(impostor: PhysicsImpostor): Unit
  
  /**
    * Add a joint to the physics engine
    * @param mainImpostor defines the main impostor to which the joint is added.
    * @param connectedImpostor defines the impostor that is connected to the main impostor using this joint
    * @param joint defines the joint that will connect both impostors.
    */
  def addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit
  
  /**
    * Release all resources
    */
  def dispose(): Unit
  
  /**
    * Gets the impostor for a physics enabled object
    * @param object defines the object impersonated by the impostor
    * @returns the PhysicsImpostor or null if not found
    */
  def getImpostorForPhysicsObject(`object`: IPhysicsEnabledObject): Nullable[PhysicsImpostor]
  
  /**
    * Gets the impostor for a physics body object
    * @param body defines physics body used by the impostor
    * @returns the PhysicsImpostor or null if not found
    */
  def getImpostorWithPhysicsBody(body: Any): Nullable[PhysicsImpostor]
  
  /**
    * Gets the list of physic impostors
    * @returns an array of PhysicsImpostor
    */
  def getImpostors(): js.Array[PhysicsImpostor]
  
  /**
    * Gets the current plugin used to run the simulation
    * @returns current plugin
    */
  def getPhysicsPlugin(): IPhysicsEnginePlugin
  
  /**
    * Gets the name of the current physics plugin
    * @returns the name of the plugin
    */
  def getPhysicsPluginName(): String
  
  /**
    * Get the sub time step of the physics engine.
    * @returns the current sub time step
    */
  def getSubTimeStep(): Double
  
  /**
    * Get the time step of the physics engine.
    * @returns the current time step
    */
  def getTimeStep(): Double
  
  /**
    * Gets the gravity vector used by the simulation
    */
  var gravity: Vector3
  
  /**
    * Does a raycast in the physics world
    * @param from when should the ray start?
    * @param to when should the ray end?
    * @returns PhysicsRaycastResult
    */
  def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult
  
  /**
    * Remove an impostor from the engine.
    * This impostor and its mesh will not longer be updated by the physics engine.
    * @param impostor the impostor to remove
    */
  def removeImpostor(impostor: PhysicsImpostor): Unit
  
  /**
    * Removes a joint from the simulation
    * @param mainImpostor defines the impostor used with the joint
    * @param connectedImpostor defines the other impostor connected to the main one by the joint
    * @param joint defines the joint to remove
    */
  def removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit
  
  /**
    * Sets the gravity vector used by the simulation
    * @param gravity defines the gravity vector to use
    */
  def setGravity(gravity: Vector3): Unit
  
  /**
    * Set the sub time step of the physics engine.
    * Default is 0 meaning there is no sub steps
    * To increase physics resolution precision, set a small value (like 1 ms)
    * @param subTimeStep defines the new sub timestep used for physics resolution.
    */
  def setSubTimeStep(subTimeStep: Double): Unit
  
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep the new timestep to apply to this world.
    */
  def setTimeStep(newTimeStep: Double): Unit
}
object IPhysicsEngine {
  
  inline def apply(
    _step: Double => Callback,
    addImpostor: PhysicsImpostor => Callback,
    addJoint: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Callback,
    dispose: Callback,
    getImpostorForPhysicsObject: IPhysicsEnabledObject => Nullable[PhysicsImpostor],
    getImpostorWithPhysicsBody: Any => Nullable[PhysicsImpostor],
    getImpostors: CallbackTo[js.Array[PhysicsImpostor]],
    getPhysicsPlugin: CallbackTo[IPhysicsEnginePlugin],
    getPhysicsPluginName: CallbackTo[String],
    getSubTimeStep: CallbackTo[Double],
    getTimeStep: CallbackTo[Double],
    gravity: Vector3,
    raycast: (Vector3, Vector3) => PhysicsRaycastResult,
    removeImpostor: PhysicsImpostor => Callback,
    removeJoint: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Callback,
    setGravity: Vector3 => Callback,
    setSubTimeStep: Double => Callback,
    setTimeStep: Double => Callback
  ): IPhysicsEngine = {
    val __obj = js.Dynamic.literal(_step = js.Any.fromFunction1((t0: Double) => _step(t0).runNow()), addImpostor = js.Any.fromFunction1((t0: PhysicsImpostor) => addImpostor(t0).runNow()), addJoint = js.Any.fromFunction3((t0: PhysicsImpostor, t1: PhysicsImpostor, t2: PhysicsJoint) => (addJoint(t0, t1, t2)).runNow()), dispose = dispose.toJsFn, getImpostorForPhysicsObject = js.Any.fromFunction1(getImpostorForPhysicsObject), getImpostorWithPhysicsBody = js.Any.fromFunction1(getImpostorWithPhysicsBody), getImpostors = getImpostors.toJsFn, getPhysicsPlugin = getPhysicsPlugin.toJsFn, getPhysicsPluginName = getPhysicsPluginName.toJsFn, getSubTimeStep = getSubTimeStep.toJsFn, getTimeStep = getTimeStep.toJsFn, gravity = gravity.asInstanceOf[js.Any], raycast = js.Any.fromFunction2(raycast), removeImpostor = js.Any.fromFunction1((t0: PhysicsImpostor) => removeImpostor(t0).runNow()), removeJoint = js.Any.fromFunction3((t0: PhysicsImpostor, t1: PhysicsImpostor, t2: PhysicsJoint) => (removeJoint(t0, t1, t2)).runNow()), setGravity = js.Any.fromFunction1((t0: Vector3) => setGravity(t0).runNow()), setSubTimeStep = js.Any.fromFunction1((t0: Double) => setSubTimeStep(t0).runNow()), setTimeStep = js.Any.fromFunction1((t0: Double) => setTimeStep(t0).runNow()))
    __obj.asInstanceOf[IPhysicsEngine]
  }
  
  extension [Self <: IPhysicsEngine](x: Self) {
    
    inline def setAddImpostor(value: PhysicsImpostor => Callback): Self = StObject.set(x, "addImpostor", js.Any.fromFunction1((t0: PhysicsImpostor) => value(t0).runNow()))
    
    inline def setAddJoint(value: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Callback): Self = StObject.set(x, "addJoint", js.Any.fromFunction3((t0: PhysicsImpostor, t1: PhysicsImpostor, t2: PhysicsJoint) => (value(t0, t1, t2)).runNow()))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGetImpostorForPhysicsObject(value: IPhysicsEnabledObject => Nullable[PhysicsImpostor]): Self = StObject.set(x, "getImpostorForPhysicsObject", js.Any.fromFunction1(value))
    
    inline def setGetImpostorWithPhysicsBody(value: Any => Nullable[PhysicsImpostor]): Self = StObject.set(x, "getImpostorWithPhysicsBody", js.Any.fromFunction1(value))
    
    inline def setGetImpostors(value: CallbackTo[js.Array[PhysicsImpostor]]): Self = StObject.set(x, "getImpostors", value.toJsFn)
    
    inline def setGetPhysicsPlugin(value: CallbackTo[IPhysicsEnginePlugin]): Self = StObject.set(x, "getPhysicsPlugin", value.toJsFn)
    
    inline def setGetPhysicsPluginName(value: CallbackTo[String]): Self = StObject.set(x, "getPhysicsPluginName", value.toJsFn)
    
    inline def setGetSubTimeStep(value: CallbackTo[Double]): Self = StObject.set(x, "getSubTimeStep", value.toJsFn)
    
    inline def setGetTimeStep(value: CallbackTo[Double]): Self = StObject.set(x, "getTimeStep", value.toJsFn)
    
    inline def setGravity(value: Vector3): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setRaycast(value: (Vector3, Vector3) => PhysicsRaycastResult): Self = StObject.set(x, "raycast", js.Any.fromFunction2(value))
    
    inline def setRemoveImpostor(value: PhysicsImpostor => Callback): Self = StObject.set(x, "removeImpostor", js.Any.fromFunction1((t0: PhysicsImpostor) => value(t0).runNow()))
    
    inline def setRemoveJoint(value: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Callback): Self = StObject.set(x, "removeJoint", js.Any.fromFunction3((t0: PhysicsImpostor, t1: PhysicsImpostor, t2: PhysicsJoint) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetGravity(value: Vector3 => Callback): Self = StObject.set(x, "setGravity", js.Any.fromFunction1((t0: Vector3) => value(t0).runNow()))
    
    inline def setSetSubTimeStep(value: Double => Callback): Self = StObject.set(x, "setSubTimeStep", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTimeStep(value: Double => Callback): Self = StObject.set(x, "setTimeStep", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def set_step(value: Double => Callback): Self = StObject.set(x, "_step", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
