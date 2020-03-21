package typingsJapgolly.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IlmExplainLifecycle extends Generic {
  var index: String
  var only_errors: js.UndefOr[Boolean] = js.undefined
  var only_managed: js.UndefOr[Boolean] = js.undefined
}

object IlmExplainLifecycle {
  @scala.inline
  def apply(
    index: String,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    only_errors: js.UndefOr[Boolean] = js.undefined,
    only_managed: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): IlmExplainLifecycle = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(only_errors)) __obj.updateDynamic("only_errors")(only_errors.asInstanceOf[js.Any])
    if (!js.isUndefined(only_managed)) __obj.updateDynamic("only_managed")(only_managed.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycle]
  }
}

