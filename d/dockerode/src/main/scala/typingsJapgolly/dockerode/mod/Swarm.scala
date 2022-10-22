package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Swarm
  extends StObject
     with ClusterInfo {
  
  var JoinTokens: typingsJapgolly.dockerode.mod.JoinTokens
}
object Swarm {
  
  inline def apply(
    DataPathPort: Double,
    DefaultAddrPool: js.Array[String],
    ID: String,
    JoinTokens: JoinTokens,
    RootRotationInProgress: Boolean,
    Spec: Spec,
    SubnetSize: Double,
    TLSInfo: TLSInfo
  ): Swarm = {
    val __obj = js.Dynamic.literal(DataPathPort = DataPathPort.asInstanceOf[js.Any], DefaultAddrPool = DefaultAddrPool.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], JoinTokens = JoinTokens.asInstanceOf[js.Any], RootRotationInProgress = RootRotationInProgress.asInstanceOf[js.Any], Spec = Spec.asInstanceOf[js.Any], SubnetSize = SubnetSize.asInstanceOf[js.Any], TLSInfo = TLSInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swarm]
  }
  
  extension [Self <: Swarm](x: Self) {
    
    inline def setJoinTokens(value: JoinTokens): Self = StObject.set(x, "JoinTokens", value.asInstanceOf[js.Any])
  }
}
