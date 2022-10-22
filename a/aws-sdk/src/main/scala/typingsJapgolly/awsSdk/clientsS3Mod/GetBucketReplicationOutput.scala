package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketReplicationOutput extends StObject {
  
  var ReplicationConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ReplicationConfiguration] = js.undefined
}
object GetBucketReplicationOutput {
  
  inline def apply(): GetBucketReplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketReplicationOutput]
  }
  
  extension [Self <: GetBucketReplicationOutput](x: Self) {
    
    inline def setReplicationConfiguration(value: ReplicationConfiguration): Self = StObject.set(x, "ReplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigurationUndefined: Self = StObject.set(x, "ReplicationConfiguration", js.undefined)
  }
}
