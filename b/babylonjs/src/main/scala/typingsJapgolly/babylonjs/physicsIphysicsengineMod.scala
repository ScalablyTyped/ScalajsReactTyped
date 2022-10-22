package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Quaternion
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.physicsPhysicsImpostorMod.IPhysicsEnabledObject
import typingsJapgolly.babylonjs.physicsPhysicsImpostorMod.PhysicsImpostor
import typingsJapgolly.babylonjs.physicsPhysicsJointMod.IMotorEnabledJoint
import typingsJapgolly.babylonjs.physicsPhysicsJointMod.PhysicsJoint
import typingsJapgolly.babylonjs.physicsPhysicsRaycastResultMod.PhysicsRaycastResult
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsIphysicsengineMod {
  
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
  
  @js.native
  trait IPhysicsEnginePlugin extends StObject {
    
    var appendAnchor: js.UndefOr[
        js.Function6[
          /* impostor */ PhysicsImpostor, 
          /* otherImpostor */ PhysicsImpostor, 
          /* width */ Double, 
          /* height */ Double, 
          /* influence */ Double, 
          /* noCollisionBetweenLinkedBodies */ Boolean, 
          Unit
        ]
      ] = js.native
    
    var appendHook: js.UndefOr[
        js.Function5[
          /* impostor */ PhysicsImpostor, 
          /* otherImpostor */ PhysicsImpostor, 
          /* length */ Double, 
          /* influence */ Double, 
          /* noCollisionBetweenLinkedBodies */ Boolean, 
          Unit
        ]
      ] = js.native
    
    def applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = js.native
    
    def applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def executeStep(delta: Double, impostors: js.Array[PhysicsImpostor]): Unit = js.native
    
    def generateJoint(joint: PhysicsImpostorJoint): Unit = js.native
    
    def generatePhysicsBody(impostor: PhysicsImpostor): Unit = js.native
    
    def getAngularVelocity(impostor: PhysicsImpostor): Nullable[Vector3] = js.native
    
    def getBodyFriction(impostor: PhysicsImpostor): Double = js.native
    
    def getBodyMass(impostor: PhysicsImpostor): Double = js.native
    
    var getBodyPositionIterations: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
    
    var getBodyPressure: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
    
    def getBodyRestitution(impostor: PhysicsImpostor): Double = js.native
    
    var getBodyStiffness: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
    
    var getBodyVelocityIterations: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
    
    def getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3): Unit = js.native
    
    def getLinearVelocity(impostor: PhysicsImpostor): Nullable[Vector3] = js.native
    
    def getRadius(impostor: PhysicsImpostor): Double = js.native
    
    def getTimeStep(): Double = js.native
    
    def isSupported(): Boolean = js.native
    
    var name: String = js.native
    
    def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult = js.native
    
    def removeJoint(joint: PhysicsImpostorJoint): Unit = js.native
    
    def removePhysicsBody(impostor: PhysicsImpostor): Unit = js.native
    
    def setAngularVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): Unit = js.native
    
    def setBodyFriction(impostor: PhysicsImpostor, friction: Double): Unit = js.native
    
    def setBodyMass(impostor: PhysicsImpostor, mass: Double): Unit = js.native
    
    var setBodyPositionIterations: js.UndefOr[
        js.Function2[/* impostor */ PhysicsImpostor, /* positionIterations */ Double, Unit]
      ] = js.native
    
    var setBodyPressure: js.UndefOr[js.Function2[/* impostor */ PhysicsImpostor, /* pressure */ Double, Unit]] = js.native
    
    def setBodyRestitution(impostor: PhysicsImpostor, restitution: Double): Unit = js.native
    
    var setBodyStiffness: js.UndefOr[js.Function2[/* impostor */ PhysicsImpostor, /* stiffness */ Double, Unit]] = js.native
    
    var setBodyVelocityIterations: js.UndefOr[
        js.Function2[/* impostor */ PhysicsImpostor, /* velocityIterations */ Double, Unit]
      ] = js.native
    
    def setGravity(gravity: Vector3): Unit = js.native
    
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double): Unit = js.native
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double): Unit = js.native
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double, motorIndex: Double): Unit = js.native
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Unit, motorIndex: Double): Unit = js.native
    
    def setLinearVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): Unit = js.native
    
    def setMotor(joint: IMotorEnabledJoint, speed: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double, motorIndex: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Unit, motorIndex: Double): Unit = js.native
    
    def setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): Unit = js.native
    
    def setTimeStep(timeStep: Double): Unit = js.native
    
    def setTransformationFromPhysicsBody(impostor: PhysicsImpostor): Unit = js.native
    
    def sleepBody(impostor: PhysicsImpostor): Unit = js.native
    
    def syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): Unit = js.native
    
    def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double): Unit = js.native
    def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double, minDistance: Double): Unit = js.native
    
    def wakeUpBody(impostor: PhysicsImpostor): Unit = js.native
    
    var world: Any = js.native
  }
  
  trait PhysicsImpostorJoint extends StObject {
    
    /** Defines the impostor that is connected to the main impostor using this joint */
    var connectedImpostor: PhysicsImpostor
    
    /** Defines the joint itself */
    var joint: PhysicsJoint
    
    /** Defines the main impostor to which the joint is linked */
    var mainImpostor: PhysicsImpostor
  }
  object PhysicsImpostorJoint {
    
    inline def apply(connectedImpostor: PhysicsImpostor, joint: PhysicsJoint, mainImpostor: PhysicsImpostor): PhysicsImpostorJoint = {
      val __obj = js.Dynamic.literal(connectedImpostor = connectedImpostor.asInstanceOf[js.Any], joint = joint.asInstanceOf[js.Any], mainImpostor = mainImpostor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsImpostorJoint]
    }
    
    extension [Self <: PhysicsImpostorJoint](x: Self) {
      
      inline def setConnectedImpostor(value: PhysicsImpostor): Self = StObject.set(x, "connectedImpostor", value.asInstanceOf[js.Any])
      
      inline def setJoint(value: PhysicsJoint): Self = StObject.set(x, "joint", value.asInstanceOf[js.Any])
      
      inline def setMainImpostor(value: PhysicsImpostor): Self = StObject.set(x, "mainImpostor", value.asInstanceOf[js.Any])
    }
  }
}
