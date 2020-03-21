package typingsJapgolly.elasticsearch.mod

import typingsJapgolly.elasticsearch.elasticsearchStrings.always
import typingsJapgolly.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typingsJapgolly.elasticsearch.elasticsearchStrings.missing
import typingsJapgolly.elasticsearch.elasticsearchStrings.popular
import typingsJapgolly.elasticsearch.elasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentByQueryParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var analyzeWildcard: js.UndefOr[Boolean] = js.undefined
  var analyzer: js.UndefOr[String] = js.undefined
  var conflicts: js.UndefOr[Conflicts] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[String] = js.undefined
  var docvalueFields: js.UndefOr[NameList] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var index: NameList
  var lenient: js.UndefOr[Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined
  var pipeline: js.UndefOr[String] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var requestCache: js.UndefOr[Boolean] = js.undefined
  var requestsPerSecond: js.UndefOr[Double] = js.undefined
  var routing: js.UndefOr[NameList] = js.undefined
  var scroll: js.UndefOr[TimeSpan] = js.undefined
  var scrollSize: js.UndefOr[Double] = js.undefined
  var searchTimeout: js.UndefOr[TimeSpan] = js.undefined
  var searchType: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[NameList] = js.undefined
  var stats: js.UndefOr[NameList] = js.undefined
  var storedFields: js.UndefOr[NameList] = js.undefined
  var suggestField: js.UndefOr[String] = js.undefined
  var suggestMode: js.UndefOr[missing | popular | always] = js.undefined
  var suggestSize: js.UndefOr[Double] = js.undefined
  var suggestText: js.UndefOr[String] = js.undefined
  var terminateAfter: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var trackScores: js.UndefOr[Boolean] = js.undefined
  var `type`: NameList
  var version: js.UndefOr[Boolean] = js.undefined
  var versionType: js.UndefOr[Boolean] = js.undefined
  var waitForActiveShards: js.UndefOr[String] = js.undefined
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}

object UpdateDocumentByQueryParams {
  @scala.inline
  def apply(
    index: NameList,
    `type`: NameList,
    _source: NameList = null,
    _sourceExclude: NameList = null,
    _sourceInclude: NameList = null,
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    analyzeWildcard: js.UndefOr[Boolean] = js.undefined,
    analyzer: String = null,
    body: js.Any = null,
    conflicts: Conflicts = null,
    defaultOperator: DefaultOperator = null,
    df: String = null,
    docvalueFields: NameList = null,
    expandWildcards: ExpandWildcards = null,
    explain: js.UndefOr[Boolean] = js.undefined,
    fielddataFields: NameList = null,
    filterPath: String | js.Array[String] = null,
    from: Int | Double = null,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    lenient: js.UndefOr[Boolean] = js.undefined,
    lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined,
    maxRetries: Int | Double = null,
    method: String = null,
    pipeline: String = null,
    preference: String = null,
    q: String = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    requestCache: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null,
    requestsPerSecond: Int | Double = null,
    routing: NameList = null,
    scroll: TimeSpan = null,
    scrollSize: Int | Double = null,
    searchTimeout: TimeSpan = null,
    searchType: query_then_fetch | dfs_query_then_fetch = null,
    size: Int | Double = null,
    slices: Int | Double = null,
    sort: NameList = null,
    stats: NameList = null,
    storedFields: NameList = null,
    suggestField: String = null,
    suggestMode: missing | popular | always = null,
    suggestSize: Int | Double = null,
    suggestText: String = null,
    terminateAfter: Int | Double = null,
    timeout: TimeSpan = null,
    trackScores: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Boolean] = js.undefined,
    versionType: js.UndefOr[Boolean] = js.undefined,
    waitForActiveShards: String = null,
    waitForCompletion: js.UndefOr[Boolean] = js.undefined
  ): UpdateDocumentByQueryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_sourceExclude != null) __obj.updateDynamic("_sourceExclude")(_sourceExclude.asInstanceOf[js.Any])
    if (_sourceInclude != null) __obj.updateDynamic("_sourceInclude")(_sourceInclude.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices.asInstanceOf[js.Any])
    if (!js.isUndefined(analyzeWildcard)) __obj.updateDynamic("analyzeWildcard")(analyzeWildcard.asInstanceOf[js.Any])
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (defaultOperator != null) __obj.updateDynamic("defaultOperator")(defaultOperator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df.asInstanceOf[js.Any])
    if (docvalueFields != null) __obj.updateDynamic("docvalueFields")(docvalueFields.asInstanceOf[js.Any])
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain.asInstanceOf[js.Any])
    if (fielddataFields != null) __obj.updateDynamic("fielddataFields")(fielddataFields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercaseExpandedTerms)) __obj.updateDynamic("lowercaseExpandedTerms")(lowercaseExpandedTerms.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCache)) __obj.updateDynamic("requestCache")(requestCache.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (requestsPerSecond != null) __obj.updateDynamic("requestsPerSecond")(requestsPerSecond.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollSize != null) __obj.updateDynamic("scrollSize")(scrollSize.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (searchType != null) __obj.updateDynamic("searchType")(searchType.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (storedFields != null) __obj.updateDynamic("storedFields")(storedFields.asInstanceOf[js.Any])
    if (suggestField != null) __obj.updateDynamic("suggestField")(suggestField.asInstanceOf[js.Any])
    if (suggestMode != null) __obj.updateDynamic("suggestMode")(suggestMode.asInstanceOf[js.Any])
    if (suggestSize != null) __obj.updateDynamic("suggestSize")(suggestSize.asInstanceOf[js.Any])
    if (suggestText != null) __obj.updateDynamic("suggestText")(suggestText.asInstanceOf[js.Any])
    if (terminateAfter != null) __obj.updateDynamic("terminateAfter")(terminateAfter.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trackScores)) __obj.updateDynamic("trackScores")(trackScores.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(versionType)) __obj.updateDynamic("versionType")(versionType.asInstanceOf[js.Any])
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForCompletion)) __obj.updateDynamic("waitForCompletion")(waitForCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentByQueryParams]
  }
}

