package typingsJapgolly.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortTransactionResult extends StObject {
  
  /**
    * Contains server-side performance information for the command.
    */
  var TimingInformation: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbsessionMod.TimingInformation] = js.undefined
}
object AbortTransactionResult {
  
  inline def apply(): AbortTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortTransactionResult]
  }
  
  extension [Self <: AbortTransactionResult](x: Self) {
    
    inline def setTimingInformation(value: TimingInformation): Self = StObject.set(x, "TimingInformation", value.asInstanceOf[js.Any])
    
    inline def setTimingInformationUndefined: Self = StObject.set(x, "TimingInformation", js.undefined)
  }
}
