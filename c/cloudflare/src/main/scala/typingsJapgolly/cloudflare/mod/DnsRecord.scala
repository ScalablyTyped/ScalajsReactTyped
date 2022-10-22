package typingsJapgolly.cloudflare.mod

import typingsJapgolly.cloudflare.anon.Name
import typingsJapgolly.cloudflare.cloudflareStrings.MX
import typingsJapgolly.cloudflare.cloudflareStrings.SRV
import typingsJapgolly.cloudflare.cloudflareStrings.URI
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cloudflare.mod.DnsRecordWithPriority
  - typingsJapgolly.cloudflare.mod.DnsRecordWithoutPriority
  - typingsJapgolly.cloudflare.mod.SrvDnsRecord
*/
trait DnsRecord extends StObject
object DnsRecord {
  
  inline def DnsRecordWithPriority(
    content: String,
    name: String,
    priority: Double,
    ttl: Double,
    `type`: Extract[RecordTypes, MX | URI]
  ): typingsJapgolly.cloudflare.mod.DnsRecordWithPriority = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudflare.mod.DnsRecordWithPriority]
  }
  
  inline def DnsRecordWithoutPriority(content: String, name: String, ttl: Double, `type`: Exclude[RecordTypes, MX | SRV | URI]): typingsJapgolly.cloudflare.mod.DnsRecordWithoutPriority = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cloudflare.mod.DnsRecordWithoutPriority]
  }
  
  inline def SrvDnsRecord(data: Name): typingsJapgolly.cloudflare.mod.SrvDnsRecord = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SRV")
    __obj.asInstanceOf[typingsJapgolly.cloudflare.mod.SrvDnsRecord]
  }
}
