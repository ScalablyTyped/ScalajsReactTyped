package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseLicense
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait License extends StObject {
  
  var license: js.UndefOr[LicenseLicense] = js.undefined
  
  var licenses: js.Array[LicenseLicense]
}
object License {
  
  inline def apply(licenses: js.Array[LicenseLicense]): License = {
    val __obj = js.Dynamic.literal(licenses = licenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[License]
  }
  
  extension [Self <: License](x: Self) {
    
    inline def setLicense(value: LicenseLicense): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setLicenses(value: js.Array[LicenseLicense]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesVarargs(value: LicenseLicense*): Self = StObject.set(x, "licenses", js.Array(value*))
  }
}
