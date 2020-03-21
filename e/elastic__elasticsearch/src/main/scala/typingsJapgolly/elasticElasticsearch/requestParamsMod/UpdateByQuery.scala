package typingsJapgolly.elasticElasticsearch.requestParamsMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.AND
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.OR
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.abort
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.all
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.closed
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.open
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.proceed
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateByQuery[T] extends Generic {
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  var analyzer: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var conflicts: js.UndefOr[abort | proceed] = js.undefined
  var default_operator: js.UndefOr[AND | OR] = js.undefined
  var df: js.UndefOr[String] = js.undefined
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  var index: String | js.Array[String]
  var lenient: js.UndefOr[Boolean] = js.undefined
  var max_docs: js.UndefOr[Double] = js.undefined
  var pipeline: js.UndefOr[String] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var request_cache: js.UndefOr[Boolean] = js.undefined
  var requests_per_second: js.UndefOr[Double] = js.undefined
  var routing: js.UndefOr[String | js.Array[String]] = js.undefined
  var scroll: js.UndefOr[String] = js.undefined
  var scroll_size: js.UndefOr[Double] = js.undefined
  var search_timeout: js.UndefOr[String] = js.undefined
  var search_type: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[String | js.Array[String]] = js.undefined
  var stats: js.UndefOr[String | js.Array[String]] = js.undefined
  var terminate_after: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  var version: js.UndefOr[Boolean] = js.undefined
  var version_type: js.UndefOr[Boolean] = js.undefined
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}

object UpdateByQuery {
  @scala.inline
  def apply[T](
    index: String | js.Array[String],
    _source: String | js.Array[String] = null,
    _source_exclude: String | js.Array[String] = null,
    _source_excludes: String | js.Array[String] = null,
    _source_include: String | js.Array[String] = null,
    _source_includes: String | js.Array[String] = null,
    allow_no_indices: js.UndefOr[Boolean] = js.undefined,
    analyze_wildcard: js.UndefOr[Boolean] = js.undefined,
    analyzer: String = null,
    body: T = null,
    conflicts: abort | proceed = null,
    default_operator: AND | OR = null,
    df: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | none | all = null,
    filter_path: String | js.Array[String] = null,
    from: Int | Double = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_unavailable: js.UndefOr[Boolean] = js.undefined,
    lenient: js.UndefOr[Boolean] = js.undefined,
    max_docs: Int | Double = null,
    method: String = null,
    pipeline: String = null,
    preference: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    q: String = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    request_cache: js.UndefOr[Boolean] = js.undefined,
    requests_per_second: Int | Double = null,
    routing: String | js.Array[String] = null,
    scroll: String = null,
    scroll_size: Int | Double = null,
    search_timeout: String = null,
    search_type: query_then_fetch | dfs_query_then_fetch = null,
    size: Int | Double = null,
    slices: Int | Double = null,
    sort: String | js.Array[String] = null,
    source: String = null,
    stats: String | js.Array[String] = null,
    terminate_after: Int | Double = null,
    timeout: String = null,
    `type`: String | js.Array[String] = null,
    version: js.UndefOr[Boolean] = js.undefined,
    version_type: js.UndefOr[Boolean] = js.undefined,
    wait_for_active_shards: String = null,
    wait_for_completion: js.UndefOr[Boolean] = js.undefined
  ): UpdateByQuery[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices.asInstanceOf[js.Any])
    if (!js.isUndefined(analyze_wildcard)) __obj.updateDynamic("analyze_wildcard")(analyze_wildcard.asInstanceOf[js.Any])
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (default_operator != null) __obj.updateDynamic("default_operator")(default_operator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient.asInstanceOf[js.Any])
    if (max_docs != null) __obj.updateDynamic("max_docs")(max_docs.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (!js.isUndefined(request_cache)) __obj.updateDynamic("request_cache")(request_cache.asInstanceOf[js.Any])
    if (requests_per_second != null) __obj.updateDynamic("requests_per_second")(requests_per_second.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scroll_size != null) __obj.updateDynamic("scroll_size")(scroll_size.asInstanceOf[js.Any])
    if (search_timeout != null) __obj.updateDynamic("search_timeout")(search_timeout.asInstanceOf[js.Any])
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (terminate_after != null) __obj.updateDynamic("terminate_after")(terminate_after.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(version_type)) __obj.updateDynamic("version_type")(version_type.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards.asInstanceOf[js.Any])
    if (!js.isUndefined(wait_for_completion)) __obj.updateDynamic("wait_for_completion")(wait_for_completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByQuery[T]]
  }
}

