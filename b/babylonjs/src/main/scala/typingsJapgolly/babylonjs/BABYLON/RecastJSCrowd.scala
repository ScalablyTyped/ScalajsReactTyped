package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.anon.Destination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecastJSCrowd
  extends StObject
     with ICrowd {
  
  /**
    * agent current target
    */
  /* private */ var _agentDestination: Any
  
  /**
    * true when a destination is active for an agent and notifier hasn't been notified of reach
    */
  /* private */ var _agentDestinationArmed: Any
  
  /**
    * Observer for crowd updates
    */
  /* private */ var _onBeforeAnimationsObserver: Any
  
  /**
    * Link to the scene is kept to unregister the crowd from the scene
    */
  /* private */ var _scene: Any
  
  /**
    * All agents created
    */
  var agents: js.Array[Double]
  
  /**
    * Recast/detour plugin
    */
  var bjsRECASTPlugin: RecastJSPlugin
  
  /**
    * Fires each time an agent is in reach radius of its destination
    */
  var onReachTargetObservable: Observable[Destination]
  
  /**
    * agents reach radius
    */
  var reachRadii: js.Array[Double]
  
  /**
    * Link to the detour crowd
    */
  var recastCrowd: Any
  
  /**
    * One transform per agent
    */
  var transforms: js.Array[TransformNode]
}
object RecastJSCrowd {
  
  inline def apply(
    _agentDestination: Any,
    _agentDestinationArmed: Any,
    _onBeforeAnimationsObserver: Any,
    _scene: Any,
    addAgent: (Vector3, IAgentParameters, TransformNode) => Double,
    agentGoto: (Double, Vector3) => Callback,
    agentTeleport: (Double, Vector3) => Callback,
    agents: js.Array[Double],
    bjsRECASTPlugin: RecastJSPlugin,
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
    onReachTargetObservable: Observable[Destination],
    overOffmeshConnection: Double => Boolean,
    reachRadii: js.Array[Double],
    recastCrowd: Any,
    removeAgent: Double => Callback,
    setDefaultQueryExtent: Vector3 => Callback,
    transforms: js.Array[TransformNode],
    update: Double => Callback,
    updateAgentParameters: (Double, IAgentParameters) => Callback
  ): RecastJSCrowd = {
    val __obj = js.Dynamic.literal(_agentDestination = _agentDestination.asInstanceOf[js.Any], _agentDestinationArmed = _agentDestinationArmed.asInstanceOf[js.Any], _onBeforeAnimationsObserver = _onBeforeAnimationsObserver.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], addAgent = js.Any.fromFunction3(addAgent), agentGoto = js.Any.fromFunction2((t0: Double, t1: Vector3) => (agentGoto(t0, t1)).runNow()), agentTeleport = js.Any.fromFunction2((t0: Double, t1: Vector3) => (agentTeleport(t0, t1)).runNow()), agents = agents.asInstanceOf[js.Any], bjsRECASTPlugin = bjsRECASTPlugin.asInstanceOf[js.Any], dispose = dispose.toJsFn, getAgentNextTargetPath = js.Any.fromFunction1(getAgentNextTargetPath), getAgentNextTargetPathToRef = js.Any.fromFunction2((t0: Double, t1: Vector3) => (getAgentNextTargetPathToRef(t0, t1)).runNow()), getAgentPosition = js.Any.fromFunction1(getAgentPosition), getAgentPositionToRef = js.Any.fromFunction2((t0: Double, t1: Vector3) => (getAgentPositionToRef(t0, t1)).runNow()), getAgentState = js.Any.fromFunction1(getAgentState), getAgentVelocity = js.Any.fromFunction1(getAgentVelocity), getAgentVelocityToRef = js.Any.fromFunction2((t0: Double, t1: Vector3) => (getAgentVelocityToRef(t0, t1)).runNow()), getAgents = getAgents.toJsFn, getCorners = js.Any.fromFunction1(getCorners), getDefaultQueryExtent = getDefaultQueryExtent.toJsFn, getDefaultQueryExtentToRef = js.Any.fromFunction1((t0: Vector3) => getDefaultQueryExtentToRef(t0).runNow()), onReachTargetObservable = onReachTargetObservable.asInstanceOf[js.Any], overOffmeshConnection = js.Any.fromFunction1(overOffmeshConnection), reachRadii = reachRadii.asInstanceOf[js.Any], recastCrowd = recastCrowd.asInstanceOf[js.Any], removeAgent = js.Any.fromFunction1((t0: Double) => removeAgent(t0).runNow()), setDefaultQueryExtent = js.Any.fromFunction1((t0: Vector3) => setDefaultQueryExtent(t0).runNow()), transforms = transforms.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: Double) => update(t0).runNow()), updateAgentParameters = js.Any.fromFunction2((t0: Double, t1: IAgentParameters) => (updateAgentParameters(t0, t1)).runNow()))
    __obj.asInstanceOf[RecastJSCrowd]
  }
  
  extension [Self <: RecastJSCrowd](x: Self) {
    
    inline def setAgents(value: js.Array[Double]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    inline def setAgentsVarargs(value: Double*): Self = StObject.set(x, "agents", js.Array(value*))
    
    inline def setBjsRECASTPlugin(value: RecastJSPlugin): Self = StObject.set(x, "bjsRECASTPlugin", value.asInstanceOf[js.Any])
    
    inline def setOnReachTargetObservable(value: Observable[Destination]): Self = StObject.set(x, "onReachTargetObservable", value.asInstanceOf[js.Any])
    
    inline def setReachRadii(value: js.Array[Double]): Self = StObject.set(x, "reachRadii", value.asInstanceOf[js.Any])
    
    inline def setReachRadiiVarargs(value: Double*): Self = StObject.set(x, "reachRadii", js.Array(value*))
    
    inline def setRecastCrowd(value: Any): Self = StObject.set(x, "recastCrowd", value.asInstanceOf[js.Any])
    
    inline def setTransforms(value: js.Array[TransformNode]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsVarargs(value: TransformNode*): Self = StObject.set(x, "transforms", js.Array(value*))
    
    inline def set_agentDestination(value: Any): Self = StObject.set(x, "_agentDestination", value.asInstanceOf[js.Any])
    
    inline def set_agentDestinationArmed(value: Any): Self = StObject.set(x, "_agentDestinationArmed", value.asInstanceOf[js.Any])
    
    inline def set_onBeforeAnimationsObserver(value: Any): Self = StObject.set(x, "_onBeforeAnimationsObserver", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}
