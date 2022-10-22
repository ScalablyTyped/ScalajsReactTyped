package typingsJapgolly.mangopay2NodejsSdk.typingsEnumsMod.enums

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeclaredUboStatus extends StObject {
  
  var Created: CREATED
  
  var Refused: REFUSED
  
  var Validated: VALIDATED
}
object IDeclaredUboStatus {
  
  inline def apply(): IDeclaredUboStatus = {
    val __obj = js.Dynamic.literal(Created = "CREATED", Refused = "REFUSED", Validated = "VALIDATED")
    __obj.asInstanceOf[IDeclaredUboStatus]
  }
  
  extension [Self <: IDeclaredUboStatus](x: Self) {
    
    inline def setCreated(value: CREATED): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setRefused(value: REFUSED): Self = StObject.set(x, "Refused", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: VALIDATED): Self = StObject.set(x, "Validated", value.asInstanceOf[js.Any])
  }
}
