package typingsJapgolly.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotRestore[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var master_timeout: js.UndefOr[String] = js.undefined
  var repository: String
  var snapshot: String
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}

object SnapshotRestore {
  @scala.inline
  def apply[T](
    repository: String,
    snapshot: String,
    body: T = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    master_timeout: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    wait_for_completion: js.UndefOr[Boolean] = js.undefined
  ): SnapshotRestore[T] = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(wait_for_completion)) __obj.updateDynamic("wait_for_completion")(wait_for_completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotRestore[T]]
  }
}

