package typingsJapgolly.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBranchResult extends StObject {
  
  var branch: Branch
}
object GetBranchResult {
  
  inline def apply(branch: Branch): GetBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBranchResult]
  }
  
  extension [Self <: GetBranchResult](x: Self) {
    
    inline def setBranch(value: Branch): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
  }
}
