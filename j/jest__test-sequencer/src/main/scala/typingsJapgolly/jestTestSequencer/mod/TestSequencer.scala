package typingsJapgolly.jestTestSequencer.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestRuntime.mod.Context
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSequencer extends js.Object {
  var _cache: js.Any
  def _getCache(
    test: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ js.Any
  ): Cache
  def _getCachePath(context: Context): String
  def cacheResults(
    tests: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ],
    results: AggregatedResult
  ): Unit
  /**
    * Sorting tests is very important because it has a great impact on the
    * user-perceived responsiveness and speed of the test run.
    *
    * If such information is on cache, tests are sorted based on:
    * -> Has it failed during the last run ?
    * Since it's important to provide the most expected feedback as quickly
    * as possible.
    * -> How long it took to run ?
    * Because running long tests first is an effort to minimize worker idle
    * time at the end of a long test run.
    * And if that information is not available they are sorted based on file size
    * since big test files usually take longer to complete.
    *
    * Note that a possible improvement would be to analyse other information
    * from the file other than its size.
    *
    */
  def sort(
    tests: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ]
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
  ]
}

object TestSequencer {
  @scala.inline
  def apply(
    _cache: js.Any,
    _getCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ js.Any => CallbackTo[Cache],
    _getCachePath: Context => CallbackTo[String],
    cacheResults: (js.Array[js.Any], AggregatedResult) => Callback,
    sort: js.Array[js.Any] => CallbackTo[js.Array[js.Any]]
  ): TestSequencer = {
    val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any])
    __obj.updateDynamic("_getCache")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ js.Any) => _getCache(t0).runNow()))
    __obj.updateDynamic("_getCachePath")(js.Any.fromFunction1((t0: typingsJapgolly.jestRuntime.mod.Context) => _getCachePath(t0).runNow()))
    __obj.updateDynamic("cacheResults")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => cacheResults(t0, t1).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: js.Array[js.Any]) => sort(t0).runNow()))
    __obj.asInstanceOf[TestSequencer]
  }
}

