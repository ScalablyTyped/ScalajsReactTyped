package typingsJapgolly.systeminformation.mod

import typingsJapgolly.systeminformation.mod.Systeminformation.InetChecksiteData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "inetChecksite")
@js.native
object inetChecksite extends js.Object {
  def apply(url: String): js.Promise[InetChecksiteData] = js.native
  def apply(url: String, cb: js.Function1[/* data */ InetChecksiteData, _]): js.Promise[InetChecksiteData] = js.native
}

