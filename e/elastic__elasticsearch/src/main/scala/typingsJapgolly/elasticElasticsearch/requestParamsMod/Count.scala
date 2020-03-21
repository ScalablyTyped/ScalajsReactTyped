package typingsJapgolly.elasticElasticsearch.requestParamsMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.AND
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.OR
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.all
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.closed
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  var analyzer: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var default_operator: js.UndefOr[AND | OR] = js.undefined
  var df: js.UndefOr[String] = js.undefined
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.undefined
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var lenient: js.UndefOr[Boolean] = js.undefined
  var min_score: js.UndefOr[Double] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var routing: js.UndefOr[String | js.Array[String]] = js.undefined
  var terminate_after: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Count {
  @scala.inline
  def apply[T](
    allow_no_indices: js.UndefOr[Boolean] = js.undefined,
    analyze_wildcard: js.UndefOr[Boolean] = js.undefined,
    analyzer: String = null,
    body: T = null,
    default_operator: AND | OR = null,
    df: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | none | all = null,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_throttled: js.UndefOr[Boolean] = js.undefined,
    ignore_unavailable: js.UndefOr[Boolean] = js.undefined,
    index: String | js.Array[String] = null,
    lenient: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    min_score: Int | Double = null,
    preference: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    q: String = null,
    routing: String | js.Array[String] = null,
    source: String = null,
    terminate_after: Int | Double = null,
    `type`: String | js.Array[String] = null
  ): Count[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices.asInstanceOf[js.Any])
    if (!js.isUndefined(analyze_wildcard)) __obj.updateDynamic("analyze_wildcard")(analyze_wildcard.asInstanceOf[js.Any])
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (default_operator != null) __obj.updateDynamic("default_operator")(default_operator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_throttled)) __obj.updateDynamic("ignore_throttled")(ignore_throttled.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min_score != null) __obj.updateDynamic("min_score")(min_score.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (terminate_after != null) __obj.updateDynamic("terminate_after")(terminate_after.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count[T]]
  }
}

