package typingsJapgolly.sinonMongoose.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonStub extends js.Object {
  /**
    * When called, the stub will create a new stub to represent a mongoose chained function.
    */
  def chain(name: String): SinonStub
}

object SinonStub {
  @scala.inline
  def apply(chain: String => CallbackTo[SinonStub]): SinonStub = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chain")(js.Any.fromFunction1((t0: java.lang.String) => chain(t0).runNow()))
    __obj.asInstanceOf[SinonStub]
  }
}

