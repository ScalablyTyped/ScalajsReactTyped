package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisSearch.redisSearchBooleans.`true`
import typingsJapgolly.redisSearch.redisSearchStrings.UNF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NOINDEX extends StObject {
  
  var NOINDEX: js.UndefOr[`true`] = js.undefined
  
  var SORTABLE: js.UndefOr[`true` | UNF] = js.undefined
}
object NOINDEX {
  
  inline def apply(): NOINDEX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NOINDEX]
  }
  
  extension [Self <: NOINDEX](x: Self) {
    
    inline def setNOINDEX(value: `true`): Self = StObject.set(x, "NOINDEX", value.asInstanceOf[js.Any])
    
    inline def setNOINDEXUndefined: Self = StObject.set(x, "NOINDEX", js.undefined)
    
    inline def setSORTABLE(value: `true` | UNF): Self = StObject.set(x, "SORTABLE", value.asInstanceOf[js.Any])
    
    inline def setSORTABLEUndefined: Self = StObject.set(x, "SORTABLE", js.undefined)
  }
}
