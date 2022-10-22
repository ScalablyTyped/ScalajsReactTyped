package typingsJapgolly.ionicCore.anon

import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeParts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxParts extends StObject {
  
  var maxParts: js.UndefOr[DatetimeParts] = js.undefined
  
  var minParts: js.UndefOr[DatetimeParts] = js.undefined
}
object MaxParts {
  
  inline def apply(): MaxParts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxParts]
  }
  
  extension [Self <: MaxParts](x: Self) {
    
    inline def setMaxParts(value: DatetimeParts): Self = StObject.set(x, "maxParts", value.asInstanceOf[js.Any])
    
    inline def setMaxPartsUndefined: Self = StObject.set(x, "maxParts", js.undefined)
    
    inline def setMinParts(value: DatetimeParts): Self = StObject.set(x, "minParts", value.asInstanceOf[js.Any])
    
    inline def setMinPartsUndefined: Self = StObject.set(x, "minParts", js.undefined)
  }
}
