package typingsJapgolly.elasticElasticsearch.requestParamsMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update[T] extends Generic {
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  var body: T
  var id: String
  var if_primary_term: js.UndefOr[Double] = js.undefined
  var if_seq_no: js.UndefOr[Double] = js.undefined
  var index: String
  var lang: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.undefined
  var retry_on_conflict: js.UndefOr[Double] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
}

object Update {
  @scala.inline
  def apply[T](
    body: T,
    id: String,
    index: String,
    _source: String | js.Array[String] = null,
    _source_exclude: String | js.Array[String] = null,
    _source_excludes: String | js.Array[String] = null,
    _source_include: String | js.Array[String] = null,
    _source_includes: String | js.Array[String] = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    if_primary_term: Int | Double = null,
    if_seq_no: Int | Double = null,
    ignore: Double | js.Array[Double] = null,
    lang: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    refresh: `true` | `false` | wait_for = null,
    retry_on_conflict: Int | Double = null,
    routing: String = null,
    source: String = null,
    timeout: String = null,
    `type`: String = null,
    wait_for_active_shards: String = null
  ): Update[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (if_primary_term != null) __obj.updateDynamic("if_primary_term")(if_primary_term.asInstanceOf[js.Any])
    if (if_seq_no != null) __obj.updateDynamic("if_seq_no")(if_seq_no.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (retry_on_conflict != null) __obj.updateDynamic("retry_on_conflict")(retry_on_conflict.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update[T]]
  }
}

