package typingsJapgolly.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlFlushJob[T] extends Generic {
  var advance_time: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var calc_interim: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var job_id: String
  var skip_time: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object MlFlushJob {
  @scala.inline
  def apply[T](
    job_id: String,
    advance_time: String = null,
    body: T = null,
    calc_interim: js.UndefOr[Boolean] = js.undefined,
    end: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    skip_time: String = null,
    source: String = null,
    start: String = null
  ): MlFlushJob[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    if (advance_time != null) __obj.updateDynamic("advance_time")(advance_time.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(calc_interim)) __obj.updateDynamic("calc_interim")(calc_interim.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (skip_time != null) __obj.updateDynamic("skip_time")(skip_time.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFlushJob[T]]
  }
}

