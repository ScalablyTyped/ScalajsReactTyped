package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICrowd extends StObject {
  
  /**
    * Add a new agent to the crowd with the specified parameter a corresponding transformNode.
    * You can attach anything to that node. The node position is updated in the scene update tick.
    * @param pos world position that will be constrained by the navigation mesh
    * @param parameters agent parameters
    * @param transform hooked to the agent that will be update by the scene
    * @returns agent index
    */
  def addAgent(pos: Vector3, parameters: IAgentParameters, transform: TransformNode): Double
  
  /**
    * Asks a particular agent to go to a destination. That destination is constrained by the navigation mesh
    * @param index agent index returned by addAgent
    * @param destination targeted world position
    */
  def agentGoto(index: Double, destination: Vector3): Unit
  
  /**
    * Teleport the agent to a new position
    * @param index agent index returned by addAgent
    * @param destination targeted world position
    */
  def agentTeleport(index: Double, destination: Vector3): Unit
  
  /**
    * Release all resources
    */
  def dispose(): Unit
  
  /**
    * Gets the agent next target point on the path
    * @param index agent index returned by addAgent
    * @returns world space position
    */
  def getAgentNextTargetPath(index: Double): Vector3
  
  /**
    * Gets the agent next target point on the path
    * @param index agent index returned by addAgent
    * @param result output world space position
    */
  def getAgentNextTargetPathToRef(index: Double, result: Vector3): Unit
  
  /**
    * Returns the agent position in world space
    * @param index agent index returned by addAgent
    * @returns world space position
    */
  def getAgentPosition(index: Double): Vector3
  
  /**
    * Gets the agent position result in world space
    * @param index agent index returned by addAgent
    * @param result output world space position
    */
  def getAgentPositionToRef(index: Double, result: Vector3): Unit
  
  /**
    * Gets the agent state
    * @param index agent index returned by addAgent
    * @returns agent state
    */
  def getAgentState(index: Double): Double
  
  /**
    * Gets the agent velocity in world space
    * @param index agent index returned by addAgent
    * @returns world space velocity
    */
  def getAgentVelocity(index: Double): Vector3
  
  /**
    * Gets the agent velocity result in world space
    * @param index agent index returned by addAgent
    * @param result output world space velocity
    */
  def getAgentVelocityToRef(index: Double, result: Vector3): Unit
  
  /**
    * get the list of all agents attached to this crowd
    * @returns list of agent indices
    */
  def getAgents(): js.Array[Double]
  
  /**
    * Get the next corner points composing the path (max 4 points)
    * @param index agent index returned by addAgent
    * @returns array containing world position composing the path
    */
  def getCorners(index: Double): js.Array[Vector3]
  
  /**
    * Get the Bounding box extent specified by setDefaultQueryExtent
    * @returns the box extent values
    */
  def getDefaultQueryExtent(): Vector3
  
  /**
    * Get the Bounding box extent result specified by setDefaultQueryExtent
    * @param result output the box extent values
    */
  def getDefaultQueryExtentToRef(result: Vector3): Unit
  
  /**
    * returns true if the agent in over an off mesh link connection
    * @param index agent index returned by addAgent
    * @returns true if over an off mesh link connection
    */
  def overOffmeshConnection(index: Double): Boolean
  
  /**
    * remove a particular agent previously created
    * @param index agent index returned by addAgent
    */
  def removeAgent(index: Double): Unit
  
  /**
    * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
    * The queries will try to find a solution within those bounds
    * default is (1,1,1)
    * @param extent x,y,z value that define the extent around the queries point of reference
    */
  def setDefaultQueryExtent(extent: Vector3): Unit
  
  /**
    * Tick update done by the Scene. Agent position/velocity/acceleration is updated by this function
    * @param deltaTime in seconds
    */
  def update(deltaTime: Double): Unit
  
  /**
    * Update agent parameters
    * @param index agent index returned by addAgent
    * @param parameters agent parameters
    */
  def updateAgentParameters(index: Double, parameters: IAgentParameters): Unit
}
object ICrowd {
  
  inline def apply(
    addAgent: (Vector3, IAgentParameters, TransformNode) => Double,
    agentGoto: (Double, Vector3) => Callback,
    agentTeleport: (Double, Vector3) => Callback,
    dispose: Callback,
    getAgentNextTargetPath: Double => Vector3,
    getAgentNextTargetPathToRef: (Double, Vector3) => Callback,
    getAgentPosition: Double => Vector3,
    getAgentPositionToRef: (Double, Vector3) => Callback,
    getAgentState: Double => Double,
    getAgentVelocity: Double => Vector3,
    getAgentVelocityToRef: (Double, Vector3) => Callback,
    getAgents: CallbackTo[js.Array[Double]],
    getCorners: Double => js.Array[Vector3],
    getDefaultQueryExtent: CallbackTo[Vector3],
    getDefaultQueryExtentToRef: Vector3 => Callback,
    overOffmeshConnection: Double => Boolean,
    removeAgent: Double => Callback,
    setDefaultQueryExtent: Vector3 => Callback,
    update: Double => Callback,
    updateAgentParameters: (Double, IAgentParameters) => Callback
  ): ICrowd = {
    val __obj = js.Dynamic.literal(addAgent = js.Any.fromFunction3(addAgent), agentGoto = js.Any.fromFunction2((t0: Double, t1: Vector3) => (agentGoto(t0, t1)).runNow()), agentTeleport = js.Any.fromFunction2((t0: Double, t1: Vector3) => (agentTeleport(t0, t1)).runNow()), dispose = dispose.toJsFn, getAgentNextTargetPath = js.Any.fromFunction1(getAgentNextTargetPath), getAgentNextTargetPathToRef = js.Any.fromFunction2((t0: Double, t1: Vector3) => (getAgentNextTargetPathToRef(t0, t1)).runNow()), getAgentPosition = js.Any.fromFunction1(getAgentPosition), getAgentPositionToRef = js.Any.fromFunction2((t0: Double, t1: Vector3) => (getAgentPositionToRef(t0, t1)).runNow()), getAgentState = js.Any.fromFunction1(getAgentState), getAgentVelocity = js.Any.fromFunction1(getAgentVelocity), getAgentVelocityToRef = js.Any.fromFunction2((t0: Double, t1: Vector3) => (getAgentVelocityToRef(t0, t1)).runNow()), getAgents = getAgents.toJsFn, getCorners = js.Any.fromFunction1(getCorners), getDefaultQueryExtent = getDefaultQueryExtent.toJsFn, getDefaultQueryExtentToRef = js.Any.fromFunction1((t0: Vector3) => getDefaultQueryExtentToRef(t0).runNow()), overOffmeshConnection = js.Any.fromFunction1(overOffmeshConnection), removeAgent = js.Any.fromFunction1((t0: Double) => removeAgent(t0).runNow()), setDefaultQueryExtent = js.Any.fromFunction1((t0: Vector3) => setDefaultQueryExtent(t0).runNow()), update = js.Any.fromFunction1((t0: Double) => update(t0).runNow()), updateAgentParameters = js.Any.fromFunction2((t0: Double, t1: IAgentParameters) => (updateAgentParameters(t0, t1)).runNow()))
    __obj.asInstanceOf[ICrowd]
  }
  
  extension [Self <: ICrowd](x: Self) {
    
    inline def setAddAgent(value: (Vector3, IAgentParameters, TransformNode) => Double): Self = StObject.set(x, "addAgent", js.Any.fromFunction3(value))
    
    inline def setAgentGoto(value: (Double, Vector3) => Callback): Self = StObject.set(x, "agentGoto", js.Any.fromFunction2((t0: Double, t1: Vector3) => (value(t0, t1)).runNow()))
    
    inline def setAgentTeleport(value: (Double, Vector3) => Callback): Self = StObject.set(x, "agentTeleport", js.Any.fromFunction2((t0: Double, t1: Vector3) => (value(t0, t1)).runNow()))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGetAgentNextTargetPath(value: Double => Vector3): Self = StObject.set(x, "getAgentNextTargetPath", js.Any.fromFunction1(value))
    
    inline def setGetAgentNextTargetPathToRef(value: (Double, Vector3) => Callback): Self = StObject.set(x, "getAgentNextTargetPathToRef", js.Any.fromFunction2((t0: Double, t1: Vector3) => (value(t0, t1)).runNow()))
    
    inline def setGetAgentPosition(value: Double => Vector3): Self = StObject.set(x, "getAgentPosition", js.Any.fromFunction1(value))
    
    inline def setGetAgentPositionToRef(value: (Double, Vector3) => Callback): Self = StObject.set(x, "getAgentPositionToRef", js.Any.fromFunction2((t0: Double, t1: Vector3) => (value(t0, t1)).runNow()))
    
    inline def setGetAgentState(value: Double => Double): Self = StObject.set(x, "getAgentState", js.Any.fromFunction1(value))
    
    inline def setGetAgentVelocity(value: Double => Vector3): Self = StObject.set(x, "getAgentVelocity", js.Any.fromFunction1(value))
    
    inline def setGetAgentVelocityToRef(value: (Double, Vector3) => Callback): Self = StObject.set(x, "getAgentVelocityToRef", js.Any.fromFunction2((t0: Double, t1: Vector3) => (value(t0, t1)).runNow()))
    
    inline def setGetAgents(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getAgents", value.toJsFn)
    
    inline def setGetCorners(value: Double => js.Array[Vector3]): Self = StObject.set(x, "getCorners", js.Any.fromFunction1(value))
    
    inline def setGetDefaultQueryExtent(value: CallbackTo[Vector3]): Self = StObject.set(x, "getDefaultQueryExtent", value.toJsFn)
    
    inline def setGetDefaultQueryExtentToRef(value: Vector3 => Callback): Self = StObject.set(x, "getDefaultQueryExtentToRef", js.Any.fromFunction1((t0: Vector3) => value(t0).runNow()))
    
    inline def setOverOffmeshConnection(value: Double => Boolean): Self = StObject.set(x, "overOffmeshConnection", js.Any.fromFunction1(value))
    
    inline def setRemoveAgent(value: Double => Callback): Self = StObject.set(x, "removeAgent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDefaultQueryExtent(value: Vector3 => Callback): Self = StObject.set(x, "setDefaultQueryExtent", js.Any.fromFunction1((t0: Vector3) => value(t0).runNow()))
    
    inline def setUpdate(value: Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateAgentParameters(value: (Double, IAgentParameters) => Callback): Self = StObject.set(x, "updateAgentParameters", js.Any.fromFunction2((t0: Double, t1: IAgentParameters) => (value(t0, t1)).runNow()))
  }
}
