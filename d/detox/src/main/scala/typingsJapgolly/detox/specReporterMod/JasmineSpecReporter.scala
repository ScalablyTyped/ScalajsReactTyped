package typingsJapgolly.detox.specReporterMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineSpecReporter extends js.Object {
  def specDone(): Unit
  def specStarted(): Unit
  def suiteDone(): Unit
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def suiteStarted(): Unit
}

object JasmineSpecReporter {
  @scala.inline
  def apply(specDone: Callback, specStarted: Callback, suiteDone: Callback, suiteStarted: Callback): JasmineSpecReporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("specDone")(specDone.toJsFn)
    __obj.updateDynamic("specStarted")(specStarted.toJsFn)
    __obj.updateDynamic("suiteDone")(suiteDone.toJsFn)
    __obj.updateDynamic("suiteStarted")(suiteStarted.toJsFn)
    __obj.asInstanceOf[JasmineSpecReporter]
  }
}

