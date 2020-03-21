package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MapStream")
@js.native
class MapStream protected ()
  extends typingsJapgolly.wonderFrp.streamMapStreamMod.MapStream {
  def this(source: typingsJapgolly.wonderFrp.coreStreamMod.Stream, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: typingsJapgolly.wonderFrp.coreStreamMod.Stream, selector: js.Function): typingsJapgolly.wonderFrp.streamMapStreamMod.MapStream = js.native
}

