package typingsJapgolly.elasticElasticsearch.requestParamsMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bulk[T] extends Generic {
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  var body: T
  var index: js.UndefOr[String] = js.undefined
  var pipeline: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
}

object Bulk {
  @scala.inline
  def apply[T](
    body: T,
    _source: String | js.Array[String] = null,
    _source_exclude: String | js.Array[String] = null,
    _source_excludes: String | js.Array[String] = null,
    _source_include: String | js.Array[String] = null,
    _source_includes: String | js.Array[String] = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    index: String = null,
    method: String = null,
    pipeline: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    refresh: `true` | `false` | wait_for = null,
    routing: String = null,
    source: String = null,
    timeout: String = null,
    `type`: String = null,
    wait_for_active_shards: String = null
  ): Bulk[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bulk[T]]
  }
}

