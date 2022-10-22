package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryQuerySpec extends StObject {
  
  /** The raw query string. */
  var rawQuery: js.UndefOr[String] = js.undefined
}
object BigQueryQuerySpec {
  
  inline def apply(): BigQueryQuerySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryQuerySpec]
  }
  
  extension [Self <: BigQueryQuerySpec](x: Self) {
    
    inline def setRawQuery(value: String): Self = StObject.set(x, "rawQuery", value.asInstanceOf[js.Any])
    
    inline def setRawQueryUndefined: Self = StObject.set(x, "rawQuery", js.undefined)
  }
}
