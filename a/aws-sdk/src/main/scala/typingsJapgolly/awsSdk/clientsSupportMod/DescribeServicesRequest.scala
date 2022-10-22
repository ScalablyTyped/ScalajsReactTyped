package typingsJapgolly.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServicesRequest extends StObject {
  
  /**
    * The ISO 639-1 code for the language in which Amazon Web Services provides support. Amazon Web Services Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /**
    * A JSON-formatted list of service codes available for Amazon Web Services services.
    */
  var serviceCodeList: js.UndefOr[ServiceCodeList] = js.undefined
}
object DescribeServicesRequest {
  
  inline def apply(): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesRequest]
  }
  
  extension [Self <: DescribeServicesRequest](x: Self) {
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setServiceCodeList(value: ServiceCodeList): Self = StObject.set(x, "serviceCodeList", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeListUndefined: Self = StObject.set(x, "serviceCodeList", js.undefined)
    
    inline def setServiceCodeListVarargs(value: ServiceCode*): Self = StObject.set(x, "serviceCodeList", js.Array(value*))
  }
}
