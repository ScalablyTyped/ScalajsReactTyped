package typingsJapgolly.redisInfo.mod

import typingsJapgolly.redisInfo.redisInfoStrings.master
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationMasterInfo extends StObject {
  
  var role: master
}
object ReplicationMasterInfo {
  
  inline def apply(): ReplicationMasterInfo = {
    val __obj = js.Dynamic.literal(role = "master")
    __obj.asInstanceOf[ReplicationMasterInfo]
  }
  
  extension [Self <: ReplicationMasterInfo](x: Self) {
    
    inline def setRole(value: master): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
