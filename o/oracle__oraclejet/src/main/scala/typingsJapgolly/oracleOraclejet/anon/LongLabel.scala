package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongLabel extends StObject {
  
  var id: String
  
  var longLabel: js.UndefOr[String] = js.undefined
  
  var shortLabel: js.UndefOr[String] = js.undefined
}
object LongLabel {
  
  inline def apply(id: String): LongLabel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongLabel]
  }
  
  extension [Self <: LongLabel](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLongLabel(value: String): Self = StObject.set(x, "longLabel", value.asInstanceOf[js.Any])
    
    inline def setLongLabelUndefined: Self = StObject.set(x, "longLabel", js.undefined)
    
    inline def setShortLabel(value: String): Self = StObject.set(x, "shortLabel", value.asInstanceOf[js.Any])
    
    inline def setShortLabelUndefined: Self = StObject.set(x, "shortLabel", js.undefined)
  }
}
