package typingsJapgolly.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetails extends StObject {
  
  val field: String
  
  val issue: String
}
object ErrorDetails {
  
  inline def apply(field: String, issue: String): ErrorDetails = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  
  extension [Self <: ErrorDetails](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
  }
}
