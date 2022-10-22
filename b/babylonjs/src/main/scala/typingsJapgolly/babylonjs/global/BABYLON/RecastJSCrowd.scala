package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IAgentParameters
import typingsJapgolly.babylonjs.anon.Destination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RecastJSCrowd")
@js.native
open class RecastJSCrowd protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.RecastJSCrowd {
  /**
    * Constructor
    * @param plugin recastJS plugin
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  def this(
    plugin: typingsJapgolly.babylonjs.BABYLON.RecastJSPlugin,
    maxAgents: Double,
    maxAgentRadius: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
  ) = this()
  
  /**
    * agent current target
    */
  /* private */ /* CompleteClass */
  var _agentDestination: Any = js.native
  
  /**
    * true when a destination is active for an agent and notifier hasn't been notified of reach
    */
  /* private */ /* CompleteClass */
  var _agentDestinationArmed: Any = js.native
  
  /**
    * Observer for crowd updates
    */
  /* private */ /* CompleteClass */
  var _onBeforeAnimationsObserver: Any = js.native
  
  /**
    * Link to the scene is kept to unregister the crowd from the scene
    */
  /* private */ /* CompleteClass */
  var _scene: Any = js.native
  
  /**
    * Add a new agent to the crowd with the specified parameter a corresponding transformNode.
    * You can attach anything to that node. The node position is updated in the scene update tick.
    * @param pos world position that will be constrained by the navigation mesh
    * @param parameters agent parameters
    * @param transform hooked to the agent that will be update by the scene
    * @returns agent index
    */
  /* CompleteClass */
  override def addAgent(
    pos: typingsJapgolly.babylonjs.BABYLON.Vector3,
    parameters: IAgentParameters,
    transform: typingsJapgolly.babylonjs.BABYLON.TransformNode
  ): Double = js.native
  
  /**
    * Asks a particular agent to go to a destination. That destination is constrained by the navigation mesh
    * @param index agent index returned by addAgent
    * @param destination targeted world position
    */
  /* CompleteClass */
  override def agentGoto(index: Double, destination: typingsJapgolly.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * Teleport the agent to a new position
    * @param index agent index returned by addAgent
    * @param destination targeted world position
    */
  /* CompleteClass */
  override def agentTeleport(index: Double, destination: typingsJapgolly.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * All agents created
    */
  /* CompleteClass */
  var agents: js.Array[Double] = js.native
  
  /**
    * Recast/detour plugin
    */
  /* CompleteClass */
  var bjsRECASTPlugin: typingsJapgolly.babylonjs.BABYLON.RecastJSPlugin = js.native
  
  /**
    * Release all resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets the agent next target point on the path
    * @param index agent index returned by addAgent
    * @returns world space position
    */
  /* CompleteClass */
  override def getAgentNextTargetPath(index: Double): typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Gets the agent next target point on the path
    * @param index agent index returned by addAgent
    * @param result output world space position
    */
  /* CompleteClass */
  override def getAgentNextTargetPathToRef(index: Double, result: typingsJapgolly.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * Returns the agent position in world space
    * @param index agent index returned by addAgent
    * @returns world space position
    */
  /* CompleteClass */
  override def getAgentPosition(index: Double): typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Gets the agent position result in world space
    * @param index agent index returned by addAgent
    * @param result output world space position
    */
  /* CompleteClass */
  override def getAgentPositionToRef(index: Double, result: typingsJapgolly.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * Gets the agent state
    * @param index agent index returned by addAgent
    * @returns agent state
    */
  /* CompleteClass */
  override def getAgentState(index: Double): Double = js.native
  
  /**
    * Gets the agent velocity in world space
    * @param index agent index returned by addAgent
    * @returns world space velocity
    */
  /* CompleteClass */
  override def getAgentVelocity(index: Double): typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Gets the agent velocity result in world space
    * @param index agent index returned by addAgent
    * @param result output world space velocity
    */
  /* CompleteClass */
  override def getAgentVelocityToRef(index: Double, result: typingsJapgolly.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * get the list of all agents attached to this crowd
    * @returns list of agent indices
    */
  /* CompleteClass */
  override def getAgents(): js.Array[Double] = js.native
  
  /**
    * Get the next corner points composing the path (max 4 points)
    * @param index agent index returned by addAgent
    * @returns array containing world position composing the path
    */
  /* CompleteClass */
  override def getCorners(index: Double): js.Array[typingsJapgolly.babylonjs.BABYLON.Vector3] = js.native
  
  /**
    * Get the Bounding box extent specified by setDefaultQueryExtent
    * @returns the box extent values
    */
  /* CompleteClass */
  override def getDefaultQueryExtent(): typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Get the Bounding box extent result specified by setDefaultQueryExtent
    * @param result output the box extent values
    */
  /* CompleteClass */
  override def getDefaultQueryExtentToRef(result: typingsJapgolly.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * Fires each time an agent is in reach radius of its destination
    */
  /* CompleteClass */
  var onReachTargetObservable: typingsJapgolly.babylonjs.BABYLON.Observable[Destination] = js.native
  
  /**
    * returns true if the agent in over an off mesh link connection
    * @param index agent index returned by addAgent
    * @returns true if over an off mesh link connection
    */
  /* CompleteClass */
  override def overOffmeshConnection(index: Double): Boolean = js.native
  
  /**
    * agents reach radius
    */
  /* CompleteClass */
  var reachRadii: js.Array[Double] = js.native
  
  /**
    * Link to the detour crowd
    */
  /* CompleteClass */
  var recastCrowd: Any = js.native
  
  /**
    * remove a particular agent previously created
    * @param index agent index returned by addAgent
    */
  /* CompleteClass */
  override def removeAgent(index: Double): Unit = js.native
  
  /**
    * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
    * The queries will try to find a solution within those bounds
    * default is (1,1,1)
    * @param extent x,y,z value that define the extent around the queries point of reference
    */
  /* CompleteClass */
  override def setDefaultQueryExtent(extent: typingsJapgolly.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * One transform per agent
    */
  /* CompleteClass */
  var transforms: js.Array[typingsJapgolly.babylonjs.BABYLON.TransformNode] = js.native
  
  /**
    * Tick update done by the Scene. Agent position/velocity/acceleration is updated by this function
    * @param deltaTime in seconds
    */
  /* CompleteClass */
  override def update(deltaTime: Double): Unit = js.native
  
  /**
    * Update agent parameters
    * @param index agent index returned by addAgent
    * @param parameters agent parameters
    */
  /* CompleteClass */
  override def updateAgentParameters(index: Double, parameters: IAgentParameters): Unit = js.native
}
