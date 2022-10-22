package typingsJapgolly.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.dnsMod.AnyARecord
  - typingsJapgolly.node.dnsMod.AnyAaaaRecord
  - typingsJapgolly.node.dnsMod.AnyCnameRecord
  - typingsJapgolly.node.dnsMod.AnyMxRecord
  - typingsJapgolly.node.dnsMod.AnyNaptrRecord
  - typingsJapgolly.node.dnsMod.AnyNsRecord
  - typingsJapgolly.node.dnsMod.AnyPtrRecord
  - typingsJapgolly.node.dnsMod.AnySoaRecord
  - typingsJapgolly.node.dnsMod.AnySrvRecord
  - typingsJapgolly.node.dnsMod.AnyTxtRecord
*/
trait AnyRecord extends StObject
object AnyRecord {
  
  inline def AnyARecord(address: String, ttl: Double): typingsJapgolly.node.dnsMod.AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("A")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnyARecord]
  }
  
  inline def AnyAaaaRecord(address: String, ttl: Double): typingsJapgolly.node.dnsMod.AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AAAA")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnyAaaaRecord]
  }
  
  inline def AnyCnameRecord(value: String): typingsJapgolly.node.dnsMod.AnyCnameRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CNAME")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnyCnameRecord]
  }
  
  inline def AnyMxRecord(exchange: String, priority: Double): typingsJapgolly.node.dnsMod.AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MX")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnyMxRecord]
  }
  
  inline def AnyNaptrRecord(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String
  ): typingsJapgolly.node.dnsMod.AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NAPTR")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnyNaptrRecord]
  }
  
  inline def AnyNsRecord(value: String): typingsJapgolly.node.dnsMod.AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NS")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnyNsRecord]
  }
  
  inline def AnyPtrRecord(value: String): typingsJapgolly.node.dnsMod.AnyPtrRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PTR")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnyPtrRecord]
  }
  
  inline def AnySoaRecord(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double
  ): typingsJapgolly.node.dnsMod.AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SOA")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnySoaRecord]
  }
  
  inline def AnySrvRecord(name: String, port: Double, priority: Double, weight: Double): typingsJapgolly.node.dnsMod.AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SRV")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnySrvRecord]
  }
  
  inline def AnyTxtRecord(entries: js.Array[String]): typingsJapgolly.node.dnsMod.AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TXT")
    __obj.asInstanceOf[typingsJapgolly.node.dnsMod.AnyTxtRecord]
  }
}
