package typingsJapgolly.elasticElasticsearch.requestParamsMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.external
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.internal
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create[T] extends Generic {
  var body: T
  var id: String
  var index: String
  var pipeline: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
  var version_type: js.UndefOr[internal | external | external_gte] = js.undefined
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
}

object Create {
  @scala.inline
  def apply[T](
    body: T,
    id: String,
    index: String,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pipeline: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    refresh: `true` | `false` | wait_for = null,
    routing: String = null,
    source: String = null,
    timeout: String = null,
    `type`: String = null,
    version: Int | Double = null,
    version_type: internal | external | external_gte = null,
    wait_for_active_shards: String = null
  ): Create[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (version_type != null) __obj.updateDynamic("version_type")(version_type.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create[T]]
  }
}

