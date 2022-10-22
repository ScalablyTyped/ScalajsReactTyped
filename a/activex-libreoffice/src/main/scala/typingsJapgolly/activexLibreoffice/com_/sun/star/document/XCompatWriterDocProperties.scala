package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCompatWriterDocProperties extends StObject {
  
  var Category: String
  
  var Company: String
  
  var Manager: String
}
object XCompatWriterDocProperties {
  
  inline def apply(Category: String, Company: String, Manager: String): XCompatWriterDocProperties = {
    val __obj = js.Dynamic.literal(Category = Category.asInstanceOf[js.Any], Company = Company.asInstanceOf[js.Any], Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCompatWriterDocProperties]
  }
  
  extension [Self <: XCompatWriterDocProperties](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: String): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    inline def setManager(value: String): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
  }
}
