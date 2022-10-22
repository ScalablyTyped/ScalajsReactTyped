package typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetStatus represents the current state of a StatefulSet.
  */
trait StatefulSetStatus extends StObject {
  
  /**
    * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset.
    */
  var availableReplicas: Double
  
  /**
    * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
    */
  var collisionCount: Double
  
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  var conditions: js.Array[StatefulSetCondition]
  
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
    */
  var currentReplicas: Double
  
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
    */
  var currentRevision: String
  
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
    */
  var observedGeneration: Double
  
  /**
    * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
    */
  var readyReplicas: Double
  
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  var replicas: Double
  
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  var updateRevision: String
  
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
    */
  var updatedReplicas: Double
}
object StatefulSetStatus {
  
  inline def apply(
    availableReplicas: Double,
    collisionCount: Double,
    conditions: js.Array[StatefulSetCondition],
    currentReplicas: Double,
    currentRevision: String,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double,
    updateRevision: String,
    updatedReplicas: Double
  ): StatefulSetStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas.asInstanceOf[js.Any], collisionCount = collisionCount.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], currentRevision = currentRevision.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], updateRevision = updateRevision.asInstanceOf[js.Any], updatedReplicas = updatedReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetStatus]
  }
  
  extension [Self <: StatefulSetStatus](x: Self) {
    
    inline def setAvailableReplicas(value: Double): Self = StObject.set(x, "availableReplicas", value.asInstanceOf[js.Any])
    
    inline def setCollisionCount(value: Double): Self = StObject.set(x, "collisionCount", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[StatefulSetCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: StatefulSetCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setCurrentReplicas(value: Double): Self = StObject.set(x, "currentReplicas", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevision(value: String): Self = StObject.set(x, "currentRevision", value.asInstanceOf[js.Any])
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setReadyReplicas(value: Double): Self = StObject.set(x, "readyReplicas", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setUpdateRevision(value: String): Self = StObject.set(x, "updateRevision", value.asInstanceOf[js.Any])
    
    inline def setUpdatedReplicas(value: Double): Self = StObject.set(x, "updatedReplicas", value.asInstanceOf[js.Any])
  }
}
