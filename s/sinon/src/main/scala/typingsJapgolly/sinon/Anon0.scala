package typingsJapgolly.sinon

import typingsJapgolly.sinon.mod.SinonSandbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  /**
    * @deprecated Since 5.0, use `sinon.createSandbox` instead
    */
  def create(): SinonSandbox = js.native
  def create(config: PartialSinonSandboxConfig): SinonSandbox = js.native
}

