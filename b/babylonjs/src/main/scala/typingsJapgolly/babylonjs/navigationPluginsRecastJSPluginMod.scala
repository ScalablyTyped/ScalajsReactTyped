package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.AgentIndex
import typingsJapgolly.babylonjs.mathsMathMod.Vector3
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.navigationInavigationengineMod.IAgentParameters
import typingsJapgolly.babylonjs.navigationInavigationengineMod.ICrowd
import typingsJapgolly.babylonjs.navigationInavigationengineMod.INavMeshParameters
import typingsJapgolly.babylonjs.navigationInavigationengineMod.INavigationEnginePlugin
import typingsJapgolly.babylonjs.navigationInavigationengineMod.IObstacle
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationPluginsRecastJSPluginMod {
  
  @JSImport("babylonjs/Navigation/Plugins/recastJSPlugin", "RecastJSCrowd")
  @js.native
  open class RecastJSCrowd protected ()
    extends StObject
       with ICrowd {
    /**
      * Constructor
      * @param plugin recastJS plugin
      * @param maxAgents the maximum agent count in the crowd
      * @param maxAgentRadius the maximum radius an agent can have
      * @param scene to attach the crowd to
      * @returns the crowd you can add agents to
      */
    def this(plugin: RecastJSPlugin, maxAgents: Double, maxAgentRadius: Double, scene: Scene) = this()
    
    /**
      * agent current target
      */
    /* private */ var _agentDestination: Any = js.native
    
    /**
      * true when a destination is active for an agent and notifier hasn't been notified of reach
      */
    /* private */ var _agentDestinationArmed: Any = js.native
    
    /**
      * Observer for crowd updates
      */
    /* private */ var _onBeforeAnimationsObserver: Any = js.native
    
    /**
      * Link to the scene is kept to unregister the crowd from the scene
      */
    /* private */ var _scene: Any = js.native
    
    /**
      * Add a new agent to the crowd with the specified parameter a corresponding transformNode.
      * You can attach anything to that node. The node position is updated in the scene update tick.
      * @param pos world position that will be constrained by the navigation mesh
      * @param parameters agent parameters
      * @param transform hooked to the agent that will be update by the scene
      * @returns agent index
      */
    /* CompleteClass */
    override def addAgent(pos: Vector3, parameters: IAgentParameters, transform: TransformNode): Double = js.native
    
    /**
      * Asks a particular agent to go to a destination. That destination is constrained by the navigation mesh
      * @param index agent index returned by addAgent
      * @param destination targeted world position
      */
    /* CompleteClass */
    override def agentGoto(index: Double, destination: Vector3): Unit = js.native
    
    /**
      * Teleport the agent to a new position
      * @param index agent index returned by addAgent
      * @param destination targeted world position
      */
    /* CompleteClass */
    override def agentTeleport(index: Double, destination: Vector3): Unit = js.native
    
    /**
      * All agents created
      */
    var agents: js.Array[Double] = js.native
    
    /**
      * Recast/detour plugin
      */
    var bjsRECASTPlugin: RecastJSPlugin = js.native
    
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
    override def getAgentNextTargetPath(index: Double): Vector3 = js.native
    
    /**
      * Gets the agent next target point on the path
      * @param index agent index returned by addAgent
      * @param result output world space position
      */
    /* CompleteClass */
    override def getAgentNextTargetPathToRef(index: Double, result: Vector3): Unit = js.native
    
    /**
      * Returns the agent position in world space
      * @param index agent index returned by addAgent
      * @returns world space position
      */
    /* CompleteClass */
    override def getAgentPosition(index: Double): Vector3 = js.native
    
    /**
      * Gets the agent position result in world space
      * @param index agent index returned by addAgent
      * @param result output world space position
      */
    /* CompleteClass */
    override def getAgentPositionToRef(index: Double, result: Vector3): Unit = js.native
    
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
    override def getAgentVelocity(index: Double): Vector3 = js.native
    
    /**
      * Gets the agent velocity result in world space
      * @param index agent index returned by addAgent
      * @param result output world space velocity
      */
    /* CompleteClass */
    override def getAgentVelocityToRef(index: Double, result: Vector3): Unit = js.native
    
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
    override def getCorners(index: Double): js.Array[Vector3] = js.native
    
    /**
      * Get the Bounding box extent specified by setDefaultQueryExtent
      * @returns the box extent values
      */
    /* CompleteClass */
    override def getDefaultQueryExtent(): Vector3 = js.native
    
    /**
      * Get the Bounding box extent result specified by setDefaultQueryExtent
      * @param result output the box extent values
      */
    /* CompleteClass */
    override def getDefaultQueryExtentToRef(result: Vector3): Unit = js.native
    
    /**
      * Fires each time an agent is in reach radius of its destination
      */
    var onReachTargetObservable: Observable[AgentIndex] = js.native
    
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
    var reachRadii: js.Array[Double] = js.native
    
    /**
      * Link to the detour crowd
      */
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
    override def setDefaultQueryExtent(extent: Vector3): Unit = js.native
    
    /**
      * One transform per agent
      */
    var transforms: js.Array[TransformNode] = js.native
    
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
  
  @JSImport("babylonjs/Navigation/Plugins/recastJSPlugin", "RecastJSPlugin")
  @js.native
  /**
    * Initializes the recastJS plugin
    * @param recastInjection can be used to inject your own recast reference
    */
  open class RecastJSPlugin ()
    extends StObject
       with INavigationEnginePlugin {
    def this(recastInjection: Any) = this()
    
    /* private */ var _maximumSubStepCount: Any = js.native
    
    /* private */ var _tempVec1: Any = js.native
    
    /* private */ var _tempVec2: Any = js.native
    
    /* private */ var _timeFactor: Any = js.native
    
    /* private */ var _timeStep: Any = js.native
    
    /* private */ var _worker: Any = js.native
    
    /**
      * Creates an oriented box obstacle and add it to the navigation
      * @param position world position
      * @param extent box size
      * @param angle angle in radians of the box orientation on Y axis
      * @returns the obstacle freshly created
      */
    /* CompleteClass */
    override def addBoxObstacle(position: Vector3, extent: Vector3, angle: Double): IObstacle = js.native
    
    /**
      * Creates a cylinder obstacle and add it to the navigation
      * @param position world position
      * @param radius cylinder radius
      * @param height cylinder height
      * @returns the obstacle freshly created
      */
    /* CompleteClass */
    override def addCylinderObstacle(position: Vector3, radius: Double, height: Double): IObstacle = js.native
    
    /**
      * Reference to the Recast library
      */
    var bjsRECAST: Any = js.native
    
    /**
      * build the navmesh from a previously saved state using getNavmeshData
      * @param data the Uint8Array returned by getNavmeshData
      */
    /* CompleteClass */
    override def buildFromNavmeshData(data: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Compute a navigation path from start to end. Returns an empty array if no path can be computed
      * @param start world position
      * @param end world position
      * @returns array containing world position composing the path
      */
    /* CompleteClass */
    override def computePath(start: Vector3, end: Vector3): js.Array[Vector3] = js.native
    
    /**
      * Create a new Crowd so you can add agents
      * @param maxAgents the maximum agent count in the crowd
      * @param maxAgentRadius the maximum radius an agent can have
      * @param scene to attach the crowd to
      * @returns the crowd you can add agents to
      */
    /* CompleteClass */
    override def createCrowd(maxAgents: Double, maxAgentRadius: Double, scene: Scene): ICrowd = js.native
    
    /**
      * Create a navigation mesh debug mesh
      * @param scene is where the mesh will be added
      * @returns debug display mesh
      */
    /* CompleteClass */
    override def createDebugNavMesh(scene: Scene): Mesh = js.native
    
    /**
      * Creates a navigation mesh
      * @param meshes array of all the geometry used to compute the navigation mesh
      * @param parameters bunch of parameters used to filter geometry
      */
    /* CompleteClass */
    override def createNavMesh(meshes: js.Array[Mesh], parameters: INavMeshParameters): Unit = js.native
    def createNavMesh(
      meshes: js.Array[Mesh],
      parameters: INavMeshParameters,
      completion: js.Function1[/* navmeshData */ js.typedarray.Uint8Array, Unit]
    ): Unit = js.native
    
    /**
      * Release all resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Get a navigation mesh constrained position, closest to the parameter position
      * @param position world position
      * @returns the closest point to position constrained by the navigation mesh
      */
    /* CompleteClass */
    override def getClosestPoint(position: Vector3): Vector3 = js.native
    
    /**
      * Get a navigation mesh constrained position, closest to the parameter position
      * @param position world position
      * @param result output the closest point to position constrained by the navigation mesh
      */
    /* CompleteClass */
    override def getClosestPointToRef(position: Vector3, result: Vector3): Unit = js.native
    
    /**
      * Get the Bounding box extent specified by setDefaultQueryExtent
      * @returns the box extent values
      */
    /* CompleteClass */
    override def getDefaultQueryExtent(): Vector3 = js.native
    
    /**
      * Get the Bounding box extent result specified by setDefaultQueryExtent
      * @param result output the box extent values
      */
    /* CompleteClass */
    override def getDefaultQueryExtentToRef(result: Vector3): Unit = js.native
    
    /**
      * Get the maximum number of iterations per navigation tick update
      * @returns the maximum number of iterations
      */
    /* CompleteClass */
    override def getMaximumSubStepCount(): Double = js.native
    
    /**
      * returns the navmesh data that can be used later. The navmesh must be built before retrieving the data
      * @returns data the Uint8Array that can be saved and reused
      */
    /* CompleteClass */
    override def getNavmeshData(): js.typedarray.Uint8Array = js.native
    
    /**
      * Get a navigation mesh constrained position, within a particular radius
      * @param position world position
      * @param maxRadius the maximum distance to the constrained world position
      * @returns the closest point to position constrained by the navigation mesh
      */
    /* CompleteClass */
    override def getRandomPointAround(position: Vector3, maxRadius: Double): Vector3 = js.native
    
    /**
      * Get a navigation mesh constrained position, within a particular radius
      * @param position world position
      * @param maxRadius the maximum distance to the constrained world position
      * @param result output the closest point to position constrained by the navigation mesh
      */
    /* CompleteClass */
    override def getRandomPointAroundToRef(position: Vector3, maxRadius: Double, result: Vector3): Unit = js.native
    
    /**
      * Get the time step of the navigation tick update.
      * @returns the current time step
      */
    /* CompleteClass */
    override def getTimeStep(): Double = js.native
    
    /**
      * If this plugin is supported
      * @returns true if plugin is supported
      */
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /**
      * Compute the final position from a segment made of destination-position
      * @param position world position
      * @param destination world position
      * @returns the resulting point along the navmesh
      */
    /* CompleteClass */
    override def moveAlong(position: Vector3, destination: Vector3): Vector3 = js.native
    
    /**
      * Compute the final position from a segment made of destination-position
      * @param position world position
      * @param destination world position
      * @param result output the resulting point along the navmesh
      */
    /* CompleteClass */
    override def moveAlongToRef(position: Vector3, destination: Vector3, result: Vector3): Unit = js.native
    
    /**
      * plugin name
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * the first navmesh created. We might extend this to support multiple navmeshes
      */
    var navMesh: Any = js.native
    
    /**
      * Removes an obstacle created by addCylinderObstacle or addBoxObstacle
      * @param obstacle obstacle to remove from the navigation
      */
    /* CompleteClass */
    override def removeObstacle(obstacle: IObstacle): Unit = js.native
    
    /**
      * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
      * The queries will try to find a solution within those bounds
      * default is (1,1,1)
      * @param extent x,y,z value that define the extent around the queries point of reference
      */
    /* CompleteClass */
    override def setDefaultQueryExtent(extent: Vector3): Unit = js.native
    
    /**
      * If delta time in navigation tick update is greater than the time step
      * a number of sub iterations are done. If more iterations are need to reach deltatime
      * they will be discarded.
      * A value of 0 will set to no maximum and update will use as many substeps as needed
      * @param newStepCount the maximum number of iterations
      */
    def setMaximumSubStepCount(): Unit = js.native
    /**
      * If delta time in navigation tick update is greater than the time step
      * a number of sub iterations are done. If more iterations are need to reach deltatime
      * they will be discarded.
      * A value of 0 will set to no maximum and update will use as many substeps as needed
      * @param newStepCount the maximum number of iterations
      */
    /* CompleteClass */
    override def setMaximumSubStepCount(newStepCount: Double): Unit = js.native
    
    /**
      * Set the time step of the navigation tick update.
      * Default is 1/60.
      * A value of 0 will disable fixed time update
      * @param newTimeStep the new timestep to apply to this world.
      */
    def setTimeStep(): Unit = js.native
    /**
      * Set the time step of the navigation tick update.
      * Default is 1/60.
      * A value of 0 will disable fixed time update
      * @param newTimeStep the new timestep to apply to this world.
      */
    /* CompleteClass */
    override def setTimeStep(newTimeStep: Double): Unit = js.native
    
    /**
      * Set worker URL to be used when generating a new navmesh
      * @param workerURL url string
      * @returns boolean indicating if worker is created
      */
    def setWorkerURL(workerURL: String): Boolean = js.native
    
    /**
      * Get the time factor used for crowd agent update
      * @returns the time factor
      */
    def timeFactor: Double = js.native
    /**
      * Time factor applied when updating crowd agents (default 1). A value of 0 will pause crowd updates.
      * @param value the time factor applied at update
      */
    def timeFactor_=(value: Double): Unit = js.native
  }
}
