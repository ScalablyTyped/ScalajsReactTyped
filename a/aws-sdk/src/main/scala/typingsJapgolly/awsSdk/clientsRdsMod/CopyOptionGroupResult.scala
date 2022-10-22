package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptionGroupResult extends StObject {
  
  var OptionGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.OptionGroup] = js.undefined
}
object CopyOptionGroupResult {
  
  inline def apply(): CopyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptionGroupResult]
  }
  
  extension [Self <: CopyOptionGroupResult](x: Self) {
    
    inline def setOptionGroup(value: OptionGroup): Self = StObject.set(x, "OptionGroup", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupUndefined: Self = StObject.set(x, "OptionGroup", js.undefined)
  }
}
