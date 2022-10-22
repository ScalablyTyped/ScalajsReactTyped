package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.anon.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterTime extends StObject {
  
  var clusterTime: typingsJapgolly.bson.mod.Timestamp
  
  var signature: Hash
}
object ClusterTime {
  
  inline def apply(clusterTime: typingsJapgolly.bson.mod.Timestamp, signature: Hash): ClusterTime = {
    val __obj = js.Dynamic.literal(clusterTime = clusterTime.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterTime]
  }
  
  extension [Self <: ClusterTime](x: Self) {
    
    inline def setClusterTime(value: typingsJapgolly.bson.mod.Timestamp): Self = StObject.set(x, "clusterTime", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: Hash): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
