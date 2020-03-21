package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.idisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends typingsJapgolly.wonderFrp.singleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): typingsJapgolly.wonderFrp.singleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): typingsJapgolly.wonderFrp.singleDisposableMod.SingleDisposable = js.native
  def create(dispose: IDisposable): typingsJapgolly.wonderFrp.singleDisposableMod.SingleDisposable = js.native
}

