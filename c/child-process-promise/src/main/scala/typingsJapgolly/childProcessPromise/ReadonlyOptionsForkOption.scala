package typingsJapgolly.childProcessPromise

import typingsJapgolly.childProcessPromise.childProcessPromiseStrings.stderr
import typingsJapgolly.childProcessPromise.childProcessPromiseStrings.stdout
import typingsJapgolly.node.NodeJS.ProcessEnv
import typingsJapgolly.node.childProcessMod.SerializationType
import typingsJapgolly.node.childProcessMod.StdioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ForkOptions> */
trait ReadonlyOptionsForkOption extends js.Object {
  val capture: js.UndefOr[
    (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
  ] = js.undefined
  val cwd: js.UndefOr[String] = js.undefined
  val detached: js.UndefOr[Boolean] = js.undefined
  val env: js.UndefOr[ProcessEnv] = js.undefined
  val execArgv: js.UndefOr[js.Array[String]] = js.undefined
  val execPath: js.UndefOr[String] = js.undefined
  val gid: js.UndefOr[Double] = js.undefined
  val serialization: js.UndefOr[SerializationType] = js.undefined
  val silent: js.UndefOr[Boolean] = js.undefined
  val stdio: js.UndefOr[StdioOptions] = js.undefined
  val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
  val uid: js.UndefOr[Double] = js.undefined
  val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyOptionsForkOption {
  @scala.inline
  def apply(
    capture: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout]) = null,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: ProcessEnv = null,
    execArgv: js.Array[String] = null,
    execPath: String = null,
    gid: Int | Double = null,
    serialization: SerializationType = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stdio: StdioOptions = null,
    successfulExitCodes: js.Array[Double] = null,
    uid: Int | Double = null,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): ReadonlyOptionsForkOption = {
    val __obj = js.Dynamic.literal()
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv.asInstanceOf[js.Any])
    if (execPath != null) __obj.updateDynamic("execPath")(execPath.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (successfulExitCodes != null) __obj.updateDynamic("successfulExitCodes")(successfulExitCodes.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyOptionsForkOption]
  }
}

