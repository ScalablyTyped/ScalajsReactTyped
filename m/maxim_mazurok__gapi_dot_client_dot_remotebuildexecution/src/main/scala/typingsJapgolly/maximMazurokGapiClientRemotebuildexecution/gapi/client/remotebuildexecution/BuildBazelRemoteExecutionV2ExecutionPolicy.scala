package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2ExecutionPolicy extends StObject {
  
  /**
    * The priority (relative importance) of this action. Generally, a lower value means that the action should be run sooner than actions having a greater priority value, but the
    * interpretation of a given value is server- dependent. A priority of 0 means the *default* priority. Priorities may be positive or negative, and such actions should run later or
    * sooner than actions having the default priority, respectively. The particular semantics of this field is up to the server. In particular, every server will have their own supported
    * range of priorities, and will decide how these map into scheduling policy.
    */
  var priority: js.UndefOr[Double] = js.undefined
}
object BuildBazelRemoteExecutionV2ExecutionPolicy {
  
  inline def apply(): BuildBazelRemoteExecutionV2ExecutionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecutionPolicy]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2ExecutionPolicy](x: Self) {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
