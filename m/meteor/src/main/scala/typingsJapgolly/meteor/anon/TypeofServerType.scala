package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.meteorStrings.LoadBalancer
import typingsJapgolly.meteor.meteorStrings.Mongos
import typingsJapgolly.meteor.meteorStrings.PossiblePrimary
import typingsJapgolly.meteor.meteorStrings.RSArbiter
import typingsJapgolly.meteor.meteorStrings.RSGhost
import typingsJapgolly.meteor.meteorStrings.RSOther
import typingsJapgolly.meteor.meteorStrings.RSPrimary
import typingsJapgolly.meteor.meteorStrings.RSSecondary
import typingsJapgolly.meteor.meteorStrings.Standalone
import typingsJapgolly.meteor.meteorStrings.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofServerType extends StObject {
  
  val LoadBalancer: typingsJapgolly.meteor.meteorStrings.LoadBalancer
  
  val Mongos: typingsJapgolly.meteor.meteorStrings.Mongos
  
  val PossiblePrimary: typingsJapgolly.meteor.meteorStrings.PossiblePrimary
  
  val RSArbiter: typingsJapgolly.meteor.meteorStrings.RSArbiter
  
  val RSGhost: typingsJapgolly.meteor.meteorStrings.RSGhost
  
  val RSOther: typingsJapgolly.meteor.meteorStrings.RSOther
  
  val RSPrimary: typingsJapgolly.meteor.meteorStrings.RSPrimary
  
  val RSSecondary: typingsJapgolly.meteor.meteorStrings.RSSecondary
  
  val Standalone: typingsJapgolly.meteor.meteorStrings.Standalone
  
  val Unknown: typingsJapgolly.meteor.meteorStrings.Unknown
}
object TypeofServerType {
  
  inline def apply(): TypeofServerType = {
    val __obj = js.Dynamic.literal(LoadBalancer = "LoadBalancer", Mongos = "Mongos", PossiblePrimary = "PossiblePrimary", RSArbiter = "RSArbiter", RSGhost = "RSGhost", RSOther = "RSOther", RSPrimary = "RSPrimary", RSSecondary = "RSSecondary", Standalone = "Standalone", Unknown = "Unknown")
    __obj.asInstanceOf[TypeofServerType]
  }
  
  extension [Self <: TypeofServerType](x: Self) {
    
    inline def setLoadBalancer(value: LoadBalancer): Self = StObject.set(x, "LoadBalancer", value.asInstanceOf[js.Any])
    
    inline def setMongos(value: Mongos): Self = StObject.set(x, "Mongos", value.asInstanceOf[js.Any])
    
    inline def setPossiblePrimary(value: PossiblePrimary): Self = StObject.set(x, "PossiblePrimary", value.asInstanceOf[js.Any])
    
    inline def setRSArbiter(value: RSArbiter): Self = StObject.set(x, "RSArbiter", value.asInstanceOf[js.Any])
    
    inline def setRSGhost(value: RSGhost): Self = StObject.set(x, "RSGhost", value.asInstanceOf[js.Any])
    
    inline def setRSOther(value: RSOther): Self = StObject.set(x, "RSOther", value.asInstanceOf[js.Any])
    
    inline def setRSPrimary(value: RSPrimary): Self = StObject.set(x, "RSPrimary", value.asInstanceOf[js.Any])
    
    inline def setRSSecondary(value: RSSecondary): Self = StObject.set(x, "RSSecondary", value.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Standalone): Self = StObject.set(x, "Standalone", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
