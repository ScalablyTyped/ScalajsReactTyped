package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomReporter extends js.Object {
  var jasmineDone: js.UndefOr[js.Function1[/* runDetails */ RunDetails, Unit]] = js.undefined
  var jasmineStarted: js.UndefOr[js.Function1[/* suiteInfo */ SuiteInfo, Unit]] = js.undefined
  var specDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  var specStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  var suiteDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  var suiteStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
}

object CustomReporter {
  @scala.inline
  def apply(
    jasmineDone: /* runDetails */ RunDetails => Callback = null,
    jasmineStarted: /* suiteInfo */ SuiteInfo => Callback = null,
    specDone: /* result */ CustomReporterResult => Callback = null,
    specStarted: /* result */ CustomReporterResult => Callback = null,
    suiteDone: /* result */ CustomReporterResult => Callback = null,
    suiteStarted: /* result */ CustomReporterResult => Callback = null
  ): CustomReporter = {
    val __obj = js.Dynamic.literal()
    if (jasmineDone != null) __obj.updateDynamic("jasmineDone")(js.Any.fromFunction1((t0: /* runDetails */ typingsJapgolly.jasmine.jasmine.RunDetails) => jasmineDone(t0).runNow()))
    if (jasmineStarted != null) __obj.updateDynamic("jasmineStarted")(js.Any.fromFunction1((t0: /* suiteInfo */ typingsJapgolly.jasmine.jasmine.SuiteInfo) => jasmineStarted(t0).runNow()))
    if (specDone != null) __obj.updateDynamic("specDone")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.jasmine.jasmine.CustomReporterResult) => specDone(t0).runNow()))
    if (specStarted != null) __obj.updateDynamic("specStarted")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.jasmine.jasmine.CustomReporterResult) => specStarted(t0).runNow()))
    if (suiteDone != null) __obj.updateDynamic("suiteDone")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.jasmine.jasmine.CustomReporterResult) => suiteDone(t0).runNow()))
    if (suiteStarted != null) __obj.updateDynamic("suiteStarted")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.jasmine.jasmine.CustomReporterResult) => suiteStarted(t0).runNow()))
    __obj.asInstanceOf[CustomReporter]
  }
}

