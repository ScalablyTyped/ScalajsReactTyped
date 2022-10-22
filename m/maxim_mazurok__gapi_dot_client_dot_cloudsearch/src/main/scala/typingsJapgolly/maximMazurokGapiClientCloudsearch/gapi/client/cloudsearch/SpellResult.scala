package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpellResult extends StObject {
  
  /** The suggested spelling of the query. */
  var suggestedQuery: js.UndefOr[String] = js.undefined
}
object SpellResult {
  
  inline def apply(): SpellResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpellResult]
  }
  
  extension [Self <: SpellResult](x: Self) {
    
    inline def setSuggestedQuery(value: String): Self = StObject.set(x, "suggestedQuery", value.asInstanceOf[js.Any])
    
    inline def setSuggestedQueryUndefined: Self = StObject.set(x, "suggestedQuery", js.undefined)
  }
}
