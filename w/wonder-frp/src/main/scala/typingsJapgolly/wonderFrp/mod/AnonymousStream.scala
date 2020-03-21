package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "AnonymousStream")
@js.native
class AnonymousStream protected ()
  extends typingsJapgolly.wonderFrp.anonymousStreamMod.AnonymousStream {
  def this(subscribeFunc: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "AnonymousStream")
@js.native
object AnonymousStream extends js.Object {
  def create(subscribeFunc: js.Function): typingsJapgolly.wonderFrp.anonymousStreamMod.AnonymousStream = js.native
}

