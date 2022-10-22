package typingsJapgolly.tpdirect

import typingsJapgolly.tpdirect.tpdirectInts.`-1`
import typingsJapgolly.tpdirect.tpdirectInts.`0`
import typingsJapgolly.tpdirect.tpdirectInts.`1`
import typingsJapgolly.tpdirect.tpdirectInts.`2`
import typingsJapgolly.tpdirect.tpdirectInts.`3`
import typingsJapgolly.tpdirect.tpdirectInts.`4`
import typingsJapgolly.tpdirect.tpdirectInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardInfoV1
  extends StObject
     with BaseCardInfo {
  
  var bincode: String
  
  var countrycode: String
  
  /**
    * Real Card for Direct Pay
    */
  var lastfour: String
}
object CardInfoV1 {
  
  inline def apply(
    bank_id: String,
    bincode: String,
    country: String,
    countrycode: String,
    funding: `-1` | `0` | `1` | `2`,
    issuer: String,
    issuer_zh_tw: String,
    lastfour: String,
    level: String,
    `type`: `1` | `2` | `3` | `4` | `5`
  ): CardInfoV1 = {
    val __obj = js.Dynamic.literal(bank_id = bank_id.asInstanceOf[js.Any], bincode = bincode.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], countrycode = countrycode.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuer_zh_tw = issuer_zh_tw.asInstanceOf[js.Any], lastfour = lastfour.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardInfoV1]
  }
  
  extension [Self <: CardInfoV1](x: Self) {
    
    inline def setBincode(value: String): Self = StObject.set(x, "bincode", value.asInstanceOf[js.Any])
    
    inline def setCountrycode(value: String): Self = StObject.set(x, "countrycode", value.asInstanceOf[js.Any])
    
    inline def setLastfour(value: String): Self = StObject.set(x, "lastfour", value.asInstanceOf[js.Any])
  }
}
