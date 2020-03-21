package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
class DoStream protected ()
  extends typingsJapgolly.wonderFrp.doStreamMod.DoStream {
  def this(
    source: typingsJapgolly.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typingsJapgolly.wonderFrp.streamMod.Stream): typingsJapgolly.wonderFrp.doStreamMod.DoStream = js.native
  def create(source: typingsJapgolly.wonderFrp.streamMod.Stream, onNext: js.Function): typingsJapgolly.wonderFrp.doStreamMod.DoStream = js.native
  def create(source: typingsJapgolly.wonderFrp.streamMod.Stream, onNext: js.Function, onError: js.Function): typingsJapgolly.wonderFrp.doStreamMod.DoStream = js.native
  def create(
    source: typingsJapgolly.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typingsJapgolly.wonderFrp.doStreamMod.DoStream = js.native
}

