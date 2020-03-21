package typingsJapgolly.nodeRal.mod

import typingsJapgolly.nodeRal.AnonApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerFactory extends js.Object {
  var options: AnonApp = js.native
  def apply(prefix: String): RalLogger = js.native
}

