package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
class DoStream protected ()
  extends typingsJapgolly.wonderFrp.streamDoStreamMod.DoStream {
  def this(
    source: typingsJapgolly.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typingsJapgolly.wonderFrp.coreStreamMod.Stream): typingsJapgolly.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(source: typingsJapgolly.wonderFrp.coreStreamMod.Stream, onNext: js.Function): typingsJapgolly.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(source: typingsJapgolly.wonderFrp.coreStreamMod.Stream, onNext: js.Function, onError: js.Function): typingsJapgolly.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(
    source: typingsJapgolly.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typingsJapgolly.wonderFrp.streamDoStreamMod.DoStream = js.native
}

