package typingsJapgolly.node.dnsMod

import typingsJapgolly.node.Anon_Hostname
import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "lookupService")
@js.native
object lookupService extends js.Object {
  def apply(
    address: java.lang.String,
    port: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* hostname */ java.lang.String, 
      /* service */ java.lang.String, 
      Unit
    ]
  ): Unit = js.native
  def __promisify__(address: java.lang.String, port: Double): js.Promise[Anon_Hostname] = js.native
}

