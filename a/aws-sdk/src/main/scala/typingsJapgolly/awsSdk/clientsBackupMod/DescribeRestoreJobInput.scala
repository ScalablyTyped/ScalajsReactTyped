package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRestoreJobInput extends StObject {
  
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: typingsJapgolly.awsSdk.clientsBackupMod.RestoreJobId
}
object DescribeRestoreJobInput {
  
  inline def apply(RestoreJobId: RestoreJobId): DescribeRestoreJobInput = {
    val __obj = js.Dynamic.literal(RestoreJobId = RestoreJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRestoreJobInput]
  }
  
  extension [Self <: DescribeRestoreJobInput](x: Self) {
    
    inline def setRestoreJobId(value: RestoreJobId): Self = StObject.set(x, "RestoreJobId", value.asInstanceOf[js.Any])
  }
}
