package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterPatchBaselineForPatchGroupResult extends StObject {
  
  /**
    * The ID of the patch baseline the patch group was deregistered from.
    */
  var BaselineId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.BaselineId] = js.undefined
  
  /**
    * The name of the patch group deregistered from the patch baseline.
    */
  var PatchGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.PatchGroup] = js.undefined
}
object DeregisterPatchBaselineForPatchGroupResult {
  
  inline def apply(): DeregisterPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupResult]
  }
  
  extension [Self <: DeregisterPatchBaselineForPatchGroupResult](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    inline def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
  }
}
