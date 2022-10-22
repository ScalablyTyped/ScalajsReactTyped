package typingsJapgolly.formatjsEcma402Abstract.anon

import typingsJapgolly.formatjsEcma402Abstract.typesDateTimeMod.EraData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongEraData extends StObject {
  
  var long: EraData
  
  var narrow: EraData
  
  var short: EraData
}
object LongEraData {
  
  inline def apply(long: EraData, narrow: EraData, short: EraData): LongEraData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongEraData]
  }
  
  extension [Self <: LongEraData](x: Self) {
    
    inline def setLong(value: EraData): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: EraData): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: EraData): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
