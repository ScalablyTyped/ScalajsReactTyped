package typingsJapgolly.nivoScales.distTypesTypesMod

import typingsJapgolly.nivoScales.nivoScalesStrings.band
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleBandSpec extends StObject {
  
  var round: js.UndefOr[Boolean] = js.undefined
  
  var `type`: band
}
object ScaleBandSpec {
  
  inline def apply(): ScaleBandSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("band")
    __obj.asInstanceOf[ScaleBandSpec]
  }
  
  extension [Self <: ScaleBandSpec](x: Self) {
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setType(value: band): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
