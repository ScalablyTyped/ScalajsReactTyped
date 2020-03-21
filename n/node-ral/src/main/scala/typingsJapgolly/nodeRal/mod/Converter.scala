package typingsJapgolly.nodeRal.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodeRal.nodeRalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Converter")
@js.native
abstract class Converter () extends RalModule {
  var isStreamify: `false` = js.native
  def pack(config: Service, data: js.Any): Buffer = js.native
  def unpack(config: Service, data: js.Any): js.Any = js.native
}

