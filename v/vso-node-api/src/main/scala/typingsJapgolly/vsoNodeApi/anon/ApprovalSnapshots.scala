package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalSnapshots extends StObject {
  
  var all: scala.Double
  
  var approvalSnapshots: scala.Double
  
  var automatedApprovals: scala.Double
  
  var manualApprovals: scala.Double
  
  var none: scala.Double
}
object ApprovalSnapshots {
  
  inline def apply(
    all: scala.Double,
    approvalSnapshots: scala.Double,
    automatedApprovals: scala.Double,
    manualApprovals: scala.Double,
    none: scala.Double
  ): ApprovalSnapshots = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvalSnapshots = approvalSnapshots.asInstanceOf[js.Any], automatedApprovals = automatedApprovals.asInstanceOf[js.Any], manualApprovals = manualApprovals.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalSnapshots]
  }
  
  extension [Self <: ApprovalSnapshots](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setApprovalSnapshots(value: scala.Double): Self = StObject.set(x, "approvalSnapshots", value.asInstanceOf[js.Any])
    
    inline def setAutomatedApprovals(value: scala.Double): Self = StObject.set(x, "automatedApprovals", value.asInstanceOf[js.Any])
    
    inline def setManualApprovals(value: scala.Double): Self = StObject.set(x, "manualApprovals", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
