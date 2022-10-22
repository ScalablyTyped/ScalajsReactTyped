package typingsJapgolly.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManufacturerId extends StObject {
  
  /**
    * 3 character manufacturer code.
    */
  var manufacturerId: String
  
  /**
    * 2 byte manufacturer-assigned code.
    */
  var productId: String
  
  /**
    * Year of manufacturer.
    */
  var yearOfManufacture: js.UndefOr[String] = js.undefined
}
object ManufacturerId {
  
  inline def apply(manufacturerId: String, productId: String): ManufacturerId = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturerId]
  }
  
  extension [Self <: ManufacturerId](x: Self) {
    
    inline def setManufacturerId(value: String): Self = StObject.set(x, "manufacturerId", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setYearOfManufacture(value: String): Self = StObject.set(x, "yearOfManufacture", value.asInstanceOf[js.Any])
    
    inline def setYearOfManufactureUndefined: Self = StObject.set(x, "yearOfManufacture", js.undefined)
  }
}
