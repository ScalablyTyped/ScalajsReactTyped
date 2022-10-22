package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPersonUpdateParams extends StObject {
  
  val Documents: Any
  
  val Verification: Any
}
object TypeofPersonUpdateParams {
  
  inline def apply(Documents: Any, Verification: Any): TypeofPersonUpdateParams = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPersonUpdateParams]
  }
  
  extension [Self <: TypeofPersonUpdateParams](x: Self) {
    
    inline def setDocuments(value: Any): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
