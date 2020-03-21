package typingsJapgolly.detox.mochaAdapterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.detox.mod._Global_.Detox_.Detox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetoxMochaAdapter extends js.Object {
  var detox: Detox
  def afterEach(context: js.Any): js.Promise[Unit]
  def beforeEach(context: js.Any): js.Promise[Unit]
}

object DetoxMochaAdapter {
  @scala.inline
  def apply(
    afterEach: js.Any => CallbackTo[js.Promise[Unit]],
    beforeEach: js.Any => CallbackTo[js.Promise[Unit]],
    detox: Detox
  ): DetoxMochaAdapter = {
    val __obj = js.Dynamic.literal(detox = detox.asInstanceOf[js.Any])
    __obj.updateDynamic("afterEach")(js.Any.fromFunction1((t0: js.Any) => afterEach(t0).runNow()))
    __obj.updateDynamic("beforeEach")(js.Any.fromFunction1((t0: js.Any) => beforeEach(t0).runNow()))
    __obj.asInstanceOf[DetoxMochaAdapter]
  }
}

