package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncRefOperationCommitLevelEventNotification
  extends StObject
     with AsyncGitOperationNotification {
  
  var commitId: String
}
object AsyncRefOperationCommitLevelEventNotification {
  
  inline def apply(commitId: String, operationId: Double): AsyncRefOperationCommitLevelEventNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRefOperationCommitLevelEventNotification]
  }
  
  extension [Self <: AsyncRefOperationCommitLevelEventNotification](x: Self) {
    
    inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
  }
}
