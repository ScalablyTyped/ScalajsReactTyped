package typingsJapgolly.intercomClient.anon

import typingsJapgolly.intercomClient.companyMod.CompanyIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Companyid
  extends StObject
     with CompanyIdentifier {
  
  var company_id: String
}
object Companyid {
  
  inline def apply(company_id: String): Companyid = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Companyid]
  }
  
  extension [Self <: Companyid](x: Self) {
    
    inline def setCompany_id(value: String): Self = StObject.set(x, "company_id", value.asInstanceOf[js.Any])
  }
}
