package typingsJapgolly.foreverMonitor.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.foreverMonitor.AnonArgs
import typingsJapgolly.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: js.UndefOr[String] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
  var errFile: js.UndefOr[String] = js.undefined
  var killTree: js.UndefOr[Boolean] = js.undefined
  var logFile: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var minUptime: js.UndefOr[Double] = js.undefined
  var outFile: js.UndefOr[String] = js.undefined
  var parser: js.UndefOr[js.Function2[/* command */ String, /* args */ js.Array[String], AnonArgs]] = js.undefined
  var pidFile: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var sourceDir: js.UndefOr[String] = js.undefined
  var spawnWith: js.UndefOr[SpawnWith] = js.undefined
  var spinSleepTime: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[String] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchDirectory: js.UndefOr[String] = js.undefined
  var watchIgnoreDotFiles: js.UndefOr[Boolean] = js.undefined
  var watchIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    command: String = null,
    cwd: String = null,
    env: ProcessEnv = null,
    errFile: String = null,
    killTree: js.UndefOr[Boolean] = js.undefined,
    logFile: String = null,
    max: Int | Double = null,
    minUptime: Int | Double = null,
    outFile: String = null,
    parser: (/* command */ String, /* args */ js.Array[String]) => CallbackTo[AnonArgs] = null,
    pidFile: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    sourceDir: String = null,
    spawnWith: SpawnWith = null,
    spinSleepTime: Int | Double = null,
    uid: String = null,
    watch: js.UndefOr[Boolean] = js.undefined,
    watchDirectory: String = null,
    watchIgnoreDotFiles: js.UndefOr[Boolean] = js.undefined,
    watchIgnorePatterns: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (errFile != null) __obj.updateDynamic("errFile")(errFile.asInstanceOf[js.Any])
    if (!js.isUndefined(killTree)) __obj.updateDynamic("killTree")(killTree.asInstanceOf[js.Any])
    if (logFile != null) __obj.updateDynamic("logFile")(logFile.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (minUptime != null) __obj.updateDynamic("minUptime")(minUptime.asInstanceOf[js.Any])
    if (outFile != null) __obj.updateDynamic("outFile")(outFile.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction2((t0: /* command */ java.lang.String, t1: /* args */ js.Array[java.lang.String]) => parser(t0, t1).runNow()))
    if (pidFile != null) __obj.updateDynamic("pidFile")(pidFile.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (sourceDir != null) __obj.updateDynamic("sourceDir")(sourceDir.asInstanceOf[js.Any])
    if (spawnWith != null) __obj.updateDynamic("spawnWith")(spawnWith.asInstanceOf[js.Any])
    if (spinSleepTime != null) __obj.updateDynamic("spinSleepTime")(spinSleepTime.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (watchDirectory != null) __obj.updateDynamic("watchDirectory")(watchDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(watchIgnoreDotFiles)) __obj.updateDynamic("watchIgnoreDotFiles")(watchIgnoreDotFiles.asInstanceOf[js.Any])
    if (watchIgnorePatterns != null) __obj.updateDynamic("watchIgnorePatterns")(watchIgnorePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

