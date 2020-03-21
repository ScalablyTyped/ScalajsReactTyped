package typingsJapgolly.nodeLogglyBulk.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.loggly.mod.LogglyInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-loggly-bulk", "Loggly")
@js.native
class Loggly protected () extends LogglyInstance {
  def this(options: LogglyBulkOptions) = this()
}

@JSImport("node-loggly-bulk", "Loggly")
@js.native
object Loggly extends TopLevel[LogglyBulkConstructor]

