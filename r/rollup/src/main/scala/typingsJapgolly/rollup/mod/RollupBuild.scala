package typingsJapgolly.rollup.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupBuild extends js.Object {
  var cache: RollupCache
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.undefined
  var watchFiles: js.Array[String]
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput]
  def write(options: OutputOptions): js.Promise[RollupOutput]
}

object RollupBuild {
  @scala.inline
  def apply(
    cache: RollupCache,
    generate: OutputOptions => CallbackTo[js.Promise[RollupOutput]],
    watchFiles: js.Array[String],
    write: OutputOptions => CallbackTo[js.Promise[RollupOutput]],
    getTimings: js.UndefOr[CallbackTo[SerializedTimings]] = js.undefined
  ): RollupBuild = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], watchFiles = watchFiles.asInstanceOf[js.Any])
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: typingsJapgolly.rollup.mod.OutputOptions) => generate(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: typingsJapgolly.rollup.mod.OutputOptions) => write(t0).runNow()))
    getTimings.foreach(p => __obj.updateDynamic("getTimings")(p.toJsFn))
    __obj.asInstanceOf[RollupBuild]
  }
}

