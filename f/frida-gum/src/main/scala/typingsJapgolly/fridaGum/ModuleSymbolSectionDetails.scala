package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSymbolSectionDetails extends StObject {
  
  /**
    * Section index, segment name (if applicable) and section name – same format as r2’s section IDs.
    */
  var id: String
  
  /**
    * Section's memory protection.
    */
  var protection: PageProtection
}
object ModuleSymbolSectionDetails {
  
  inline def apply(id: String, protection: PageProtection): ModuleSymbolSectionDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSymbolSectionDetails]
  }
  
  extension [Self <: ModuleSymbolSectionDetails](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProtection(value: PageProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
  }
}
