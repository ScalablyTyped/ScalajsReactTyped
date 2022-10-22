package typingsJapgolly.intercomClient.anon

import typingsJapgolly.intercomClient.companyMod.CompanyIdentifier
import typingsJapgolly.intercomClient.userMod.UserIdIdentifier
import typingsJapgolly.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdString
  extends StObject
     with CompanyIdentifier
     with UserIdIdentifier
     with VisitorIdentifier {
  
  var id: String
}
object IdString {
  
  inline def apply(id: String): IdString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdString]
  }
  
  extension [Self <: IdString](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
