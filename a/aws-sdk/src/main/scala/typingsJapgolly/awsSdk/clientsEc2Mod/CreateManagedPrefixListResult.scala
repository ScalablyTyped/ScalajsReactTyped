package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManagedPrefixListResult extends StObject {
  
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.undefined
}
object CreateManagedPrefixListResult {
  
  inline def apply(): CreateManagedPrefixListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateManagedPrefixListResult]
  }
  
  extension [Self <: CreateManagedPrefixListResult](x: Self) {
    
    inline def setPrefixList(value: ManagedPrefixList): Self = StObject.set(x, "PrefixList", value.asInstanceOf[js.Any])
    
    inline def setPrefixListUndefined: Self = StObject.set(x, "PrefixList", js.undefined)
  }
}
