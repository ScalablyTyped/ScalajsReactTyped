package typingsJapgolly.detox.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.detox.mod._Global_.Detox_.Detox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetoxJestAdapter extends js.Object {
  var detox: Detox
  def afterAll(): js.Promise[Unit]
  def beforeEach(): js.Promise[Unit]
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def specDone(): Unit
  def specStarted(): Unit
}

object DetoxJestAdapter {
  @scala.inline
  def apply(
    afterAll: CallbackTo[js.Promise[Unit]],
    beforeEach: CallbackTo[js.Promise[Unit]],
    detox: Detox,
    specDone: Callback,
    specStarted: Callback
  ): DetoxJestAdapter = {
    val __obj = js.Dynamic.literal(detox = detox.asInstanceOf[js.Any])
    __obj.updateDynamic("afterAll")(afterAll.toJsFn)
    __obj.updateDynamic("beforeEach")(beforeEach.toJsFn)
    __obj.updateDynamic("specDone")(specDone.toJsFn)
    __obj.updateDynamic("specStarted")(specStarted.toJsFn)
    __obj.asInstanceOf[DetoxJestAdapter]
  }
}

