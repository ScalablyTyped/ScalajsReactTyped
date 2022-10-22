package typingsJapgolly.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepresentativeInfoData extends StObject {
  
  /** A map of political geographic divisions that contain the requested address, keyed by the unique Open Civic Data identifier for this division. */
  var divisions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.civicinfo.gapi.client.civicinfo.GeographicDivision} */ js.Any
  ] = js.undefined
  
  /** Elected offices referenced by the divisions listed above. Will only be present if includeOffices was true in the request. */
  var offices: js.UndefOr[js.Array[Office]] = js.undefined
  
  /** Officials holding the offices listed above. Will only be present if includeOffices was true in the request. */
  var officials: js.UndefOr[js.Array[Official]] = js.undefined
}
object RepresentativeInfoData {
  
  inline def apply(): RepresentativeInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepresentativeInfoData]
  }
  
  extension [Self <: RepresentativeInfoData](x: Self) {
    
    inline def setDivisions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.civicinfo.gapi.client.civicinfo.GeographicDivision} */ js.Any
    ): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
    
    inline def setDivisionsUndefined: Self = StObject.set(x, "divisions", js.undefined)
    
    inline def setOffices(value: js.Array[Office]): Self = StObject.set(x, "offices", value.asInstanceOf[js.Any])
    
    inline def setOfficesUndefined: Self = StObject.set(x, "offices", js.undefined)
    
    inline def setOfficesVarargs(value: Office*): Self = StObject.set(x, "offices", js.Array(value*))
    
    inline def setOfficials(value: js.Array[Official]): Self = StObject.set(x, "officials", value.asInstanceOf[js.Any])
    
    inline def setOfficialsUndefined: Self = StObject.set(x, "officials", js.undefined)
    
    inline def setOfficialsVarargs(value: Official*): Self = StObject.set(x, "officials", js.Array(value*))
  }
}
