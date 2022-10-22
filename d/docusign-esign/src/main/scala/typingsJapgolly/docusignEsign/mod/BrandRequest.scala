package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandRequest extends StObject {
  
  /**
    * The id of the brand.
    */
  var brandId: js.UndefOr[String] = js.undefined
}
object BrandRequest {
  
  inline def apply(): BrandRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandRequest]
  }
  
  extension [Self <: BrandRequest](x: Self) {
    
    inline def setBrandId(value: String): Self = StObject.set(x, "brandId", value.asInstanceOf[js.Any])
    
    inline def setBrandIdUndefined: Self = StObject.set(x, "brandId", js.undefined)
  }
}
