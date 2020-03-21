package typingsJapgolly.node

import typingsJapgolly.node.dnsMod.AnyRecord
import typingsJapgolly.node.dnsMod.MxRecord
import typingsJapgolly.node.dnsMod.NaptrRecord
import typingsJapgolly.node.dnsMod.SoaRecord
import typingsJapgolly.node.dnsMod.SrvRecord
import typingsJapgolly.node.nodeStrings.A
import typingsJapgolly.node.nodeStrings.AAAA
import typingsJapgolly.node.nodeStrings.ANY
import typingsJapgolly.node.nodeStrings.CNAME
import typingsJapgolly.node.nodeStrings.MX
import typingsJapgolly.node.nodeStrings.NAPTR
import typingsJapgolly.node.nodeStrings.NS
import typingsJapgolly.node.nodeStrings.PTR
import typingsJapgolly.node.nodeStrings.SOA
import typingsJapgolly.node.nodeStrings.SRV
import typingsJapgolly.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
    ]) | SoaRecord
  ] = js.native
  def apply(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  def apply(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

