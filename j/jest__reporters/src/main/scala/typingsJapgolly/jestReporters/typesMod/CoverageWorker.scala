package typingsJapgolly.jestReporters.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestReporters.coverageWorkerMod.CoverageWorkerData
import typingsJapgolly.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageWorker extends js.Object {
  var worker: js.Function1[
    /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData, 
    CoverageWorkerResult | Null
  ]
}

object CoverageWorker {
  @scala.inline
  def apply(
    worker: /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData => CallbackTo[CoverageWorkerResult | Null]
  ): CoverageWorker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("worker")(js.Any.fromFunction1((t0: /* hasConfigGlobalConfigPathOptions */ typingsJapgolly.jestReporters.coverageWorkerMod.CoverageWorkerData) => worker(t0).runNow()))
    __obj.asInstanceOf[CoverageWorker]
  }
}

