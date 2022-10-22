package typingsJapgolly.node.anon

import typingsJapgolly.node.dnsMod.AnyRecord
import typingsJapgolly.node.dnsMod.CaaRecord
import typingsJapgolly.node.dnsMod.MxRecord
import typingsJapgolly.node.dnsMod.NaptrRecord
import typingsJapgolly.node.dnsMod.SoaRecord
import typingsJapgolly.node.dnsMod.SrvRecord
import typingsJapgolly.node.nodeStrings.A
import typingsJapgolly.node.nodeStrings.AAAA
import typingsJapgolly.node.nodeStrings.ANY
import typingsJapgolly.node.nodeStrings.CAA
import typingsJapgolly.node.nodeStrings.CNAME
import typingsJapgolly.node.nodeStrings.MX
import typingsJapgolly.node.nodeStrings.NAPTR
import typingsJapgolly.node.nodeStrings.NS
import typingsJapgolly.node.nodeStrings.PTR
import typingsJapgolly.node.nodeStrings.SOA
import typingsJapgolly.node.nodeStrings.SRV
import typingsJapgolly.node.nodeStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostnameRrtype extends StObject {
  
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  def apply(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  def apply(hostname: String, rrtype: CAA): js.Promise[js.Array[CaaRecord]] = js.native
  def apply(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  def apply(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  def apply(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  def apply(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  def apply(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
}
