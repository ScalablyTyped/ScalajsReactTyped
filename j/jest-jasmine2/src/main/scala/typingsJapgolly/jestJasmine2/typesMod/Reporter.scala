package typingsJapgolly.jestJasmine2.typesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jestJasmine2.specMod.SpecResult
import typingsJapgolly.jestJasmine2.suiteMod.SuiteResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def jasmineDone(runDetails: RunDetails): Unit
  def jasmineStarted(runDetails: RunDetails): Unit
  def specDone(result: SpecResult): Unit
  def specStarted(spec: SpecResult): Unit
  def suiteDone(result: SuiteResult): Unit
  def suiteStarted(result: SuiteResult): Unit
}

object Reporter {
  @scala.inline
  def apply(
    jasmineDone: RunDetails => Callback,
    jasmineStarted: RunDetails => Callback,
    specDone: SpecResult => Callback,
    specStarted: SpecResult => Callback,
    suiteDone: SuiteResult => Callback,
    suiteStarted: SuiteResult => Callback
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jasmineDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.RunDetails) => jasmineDone(t0).runNow()))
    __obj.updateDynamic("jasmineStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.RunDetails) => jasmineStarted(t0).runNow()))
    __obj.updateDynamic("specDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => specDone(t0).runNow()))
    __obj.updateDynamic("specStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => specStarted(t0).runNow()))
    __obj.updateDynamic("suiteDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.suiteMod.SuiteResult) => suiteDone(t0).runNow()))
    __obj.updateDynamic("suiteStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.suiteMod.SuiteResult) => suiteStarted(t0).runNow()))
    __obj.asInstanceOf[Reporter]
  }
}

