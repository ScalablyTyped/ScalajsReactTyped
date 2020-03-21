package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
class MapStream protected ()
  extends typingsJapgolly.wonderFrp.mapStreamMod.MapStream {
  def this(source: typingsJapgolly.wonderFrp.streamMod.Stream, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: typingsJapgolly.wonderFrp.streamMod.Stream, selector: js.Function): typingsJapgolly.wonderFrp.mapStreamMod.MapStream = js.native
}

