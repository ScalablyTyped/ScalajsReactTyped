package typingsJapgolly.jestCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestChangedFiles.typesMod.ChangedFiles
import typingsJapgolly.jestCore.failedTestsCacheMod.default
import typingsJapgolly.jestCore.typesMod.Filter
import typingsJapgolly.jestRuntime.typesMod.Context
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangedFilesPromise extends js.Object {
  var changedFilesPromise: js.UndefOr[js.Promise[ChangedFiles]] = js.undefined
  var contexts: js.Array[Context]
  var failedTestsCache: js.UndefOr[default] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  var globalConfig: GlobalConfig
  var jestHooks: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookEmitter */ js.Any
  ] = js.undefined
  var outputStream: WritableStream
  var testWatcher: typingsJapgolly.jestCore.testWatcherMod.default
  def onComplete(testResults: AggregatedResult): Unit
  def startRun(globalConfig: GlobalConfig): Unit
}

object AnonChangedFilesPromise {
  @scala.inline
  def apply(
    contexts: js.Array[Context],
    globalConfig: GlobalConfig,
    onComplete: AggregatedResult => Callback,
    outputStream: WritableStream,
    startRun: GlobalConfig => Callback,
    testWatcher: typingsJapgolly.jestCore.testWatcherMod.default,
    changedFilesPromise: js.Promise[ChangedFiles] = null,
    failedTestsCache: default = null,
    filter: /* testPaths */ js.Array[String] => CallbackTo[js.Promise[AnonFiltered]] = null,
    jestHooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookEmitter */ js.Any = null
  ): AnonChangedFilesPromise = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any], testWatcher = testWatcher.asInstanceOf[js.Any])
    __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onComplete(t0).runNow()))
    __obj.updateDynamic("startRun")(js.Any.fromFunction1((t0: typingsJapgolly.jestTypes.configMod.GlobalConfig) => startRun(t0).runNow()))
    if (changedFilesPromise != null) __obj.updateDynamic("changedFilesPromise")(changedFilesPromise.asInstanceOf[js.Any])
    if (failedTestsCache != null) __obj.updateDynamic("failedTestsCache")(failedTestsCache.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* testPaths */ js.Array[java.lang.String]) => filter(t0).runNow()))
    if (jestHooks != null) __obj.updateDynamic("jestHooks")(jestHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedFilesPromise]
  }
}

