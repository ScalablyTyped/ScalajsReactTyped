package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDefaultPatchBaselineResult extends StObject {
  
  /**
    * The ID of the default patch baseline.
    */
  var BaselineId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.BaselineId] = js.undefined
}
object RegisterDefaultPatchBaselineResult {
  
  inline def apply(): RegisterDefaultPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDefaultPatchBaselineResult]
  }
  
  extension [Self <: RegisterDefaultPatchBaselineResult](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
  }
}
