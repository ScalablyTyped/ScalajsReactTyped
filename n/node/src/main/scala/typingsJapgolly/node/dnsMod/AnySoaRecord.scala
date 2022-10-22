package typingsJapgolly.node.dnsMod

import typingsJapgolly.node.nodeStrings.SOA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnySoaRecord
  extends StObject
     with SoaRecord
     with AnyRecord {
  
  var `type`: SOA
}
object AnySoaRecord {
  
  inline def apply(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double
  ): AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SOA")
    __obj.asInstanceOf[AnySoaRecord]
  }
  
  extension [Self <: AnySoaRecord](x: Self) {
    
    inline def setType(value: SOA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
