package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.meteorStrings.LoadBalanced
import typingsJapgolly.meteor.meteorStrings.ReplicaSetNoPrimary
import typingsJapgolly.meteor.meteorStrings.ReplicaSetWithPrimary
import typingsJapgolly.meteor.meteorStrings.Sharded
import typingsJapgolly.meteor.meteorStrings.Single
import typingsJapgolly.meteor.meteorStrings.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTopologyType extends StObject {
  
  val LoadBalanced: typingsJapgolly.meteor.meteorStrings.LoadBalanced
  
  val ReplicaSetNoPrimary: typingsJapgolly.meteor.meteorStrings.ReplicaSetNoPrimary
  
  val ReplicaSetWithPrimary: typingsJapgolly.meteor.meteorStrings.ReplicaSetWithPrimary
  
  val Sharded: typingsJapgolly.meteor.meteorStrings.Sharded
  
  val Single: typingsJapgolly.meteor.meteorStrings.Single
  
  val Unknown: typingsJapgolly.meteor.meteorStrings.Unknown
}
object TypeofTopologyType {
  
  inline def apply(): TypeofTopologyType = {
    val __obj = js.Dynamic.literal(LoadBalanced = "LoadBalanced", ReplicaSetNoPrimary = "ReplicaSetNoPrimary", ReplicaSetWithPrimary = "ReplicaSetWithPrimary", Sharded = "Sharded", Single = "Single", Unknown = "Unknown")
    __obj.asInstanceOf[TypeofTopologyType]
  }
  
  extension [Self <: TypeofTopologyType](x: Self) {
    
    inline def setLoadBalanced(value: LoadBalanced): Self = StObject.set(x, "LoadBalanced", value.asInstanceOf[js.Any])
    
    inline def setReplicaSetNoPrimary(value: ReplicaSetNoPrimary): Self = StObject.set(x, "ReplicaSetNoPrimary", value.asInstanceOf[js.Any])
    
    inline def setReplicaSetWithPrimary(value: ReplicaSetWithPrimary): Self = StObject.set(x, "ReplicaSetWithPrimary", value.asInstanceOf[js.Any])
    
    inline def setSharded(value: Sharded): Self = StObject.set(x, "Sharded", value.asInstanceOf[js.Any])
    
    inline def setSingle(value: Single): Self = StObject.set(x, "Single", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
