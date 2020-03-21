package typingsJapgolly.algoliasearch.mod

import typingsJapgolly.algoliasearch.algoliasearchStrings.all
import typingsJapgolly.algoliasearch.algoliasearchStrings.allOptional
import typingsJapgolly.algoliasearch.algoliasearchStrings.alpha
import typingsJapgolly.algoliasearch.algoliasearchStrings.attribute
import typingsJapgolly.algoliasearch.algoliasearchStrings.count
import typingsJapgolly.algoliasearch.algoliasearchStrings.firstWords
import typingsJapgolly.algoliasearch.algoliasearchStrings.ignorePlurals
import typingsJapgolly.algoliasearch.algoliasearchStrings.lastWords
import typingsJapgolly.algoliasearch.algoliasearchStrings.multiWordsSynonym
import typingsJapgolly.algoliasearch.algoliasearchStrings.none
import typingsJapgolly.algoliasearch.algoliasearchStrings.prefixAll
import typingsJapgolly.algoliasearch.algoliasearchStrings.prefixLast
import typingsJapgolly.algoliasearch.algoliasearchStrings.prefixNone
import typingsJapgolly.algoliasearch.algoliasearchStrings.singleWordSynonym
import typingsJapgolly.algoliasearch.algoliasearchStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined algoliasearch.algoliasearch.Omit<algoliasearch.algoliasearch.QueryParameters, 'typoTolerance' | 'distinct' | 'facets' | 'getRankingInfo' | 'attributesToHighlight' | 'attributesToSnippet'> */
trait BrowseParameters extends js.Object {
  var advancedSyntax: js.UndefOr[Boolean] = js.undefined
  var allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined
  var alternativesAsExact: js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.undefined
  var analytics: js.UndefOr[Boolean] = js.undefined
  var analyticsTags: js.UndefOr[js.Array[String]] = js.undefined
  var aroundLatLng: js.UndefOr[String] = js.undefined
  var aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined
  var aroundPrecision: js.UndefOr[Double] = js.undefined
  var aroundRadius: js.UndefOr[Double | all] = js.undefined
  var attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
  var clickAnalytics: js.UndefOr[Boolean] = js.undefined
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var enableABTest: js.UndefOr[Boolean] = js.undefined
  var exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.undefined
  var facetFilters: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  var facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined
  var filters: js.UndefOr[String] = js.undefined
  var highlightPostTag: js.UndefOr[String] = js.undefined
  var highlightPreTag: js.UndefOr[String] = js.undefined
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  var ignorePlurals: js.UndefOr[Boolean] = js.undefined
  var insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var maxValuesPerFacet: js.UndefOr[Double] = js.undefined
  var minProximity: js.UndefOr[Double] = js.undefined
  var minWordSizefor1Typo: js.UndefOr[Double] = js.undefined
  var minWordSizefor2Typos: js.UndefOr[Double] = js.undefined
  var minimumAroundRadius: js.UndefOr[Double] = js.undefined
  var nbShards: js.UndefOr[Double] = js.undefined
  var numericAttributesForFiltering: js.UndefOr[js.Array[String]] = js.undefined
  var numericAttributesToIndex: js.UndefOr[js.Array[String]] = js.undefined
  var numericFilters: js.UndefOr[js.Array[String]] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var optionalWords: js.UndefOr[js.Array[String]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var queryType: js.UndefOr[prefixAll | prefixLast | prefixNone] = js.undefined
  var removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.undefined
  var replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined
  var restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined
  var restrictSearchableAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var ruleContexts: js.UndefOr[js.Array[String]] = js.undefined
  var snippetEllipsisText: js.UndefOr[String] = js.undefined
  var sortFacetValuesBy: js.UndefOr[count | alpha] = js.undefined
  var sumOrFiltersScores: js.UndefOr[Boolean] = js.undefined
  var synonyms: js.UndefOr[Boolean] = js.undefined
  var tagFilters: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  var userData: js.UndefOr[String | js.Object] = js.undefined
  var userToken: js.UndefOr[String] = js.undefined
}

object BrowseParameters {
  @scala.inline
  def apply(
    advancedSyntax: js.UndefOr[Boolean] = js.undefined,
    allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined,
    alternativesAsExact: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym] = null,
    analytics: js.UndefOr[Boolean] = js.undefined,
    analyticsTags: js.Array[String] = null,
    aroundLatLng: String = null,
    aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined,
    aroundPrecision: Int | Double = null,
    aroundRadius: Double | all = null,
    attributesToRetrieve: js.Array[String] = null,
    clickAnalytics: js.UndefOr[Boolean] = js.undefined,
    disableExactOnAttributes: js.Array[String] = null,
    disableTypoToleranceOnAttributes: js.Array[String] = null,
    enableABTest: js.UndefOr[Boolean] = js.undefined,
    exactOnSingleWordQuery: attribute | none | word = null,
    facetFilters: js.Array[String | js.Array[String]] = null,
    facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined,
    filters: String = null,
    highlightPostTag: String = null,
    highlightPreTag: String = null,
    hitsPerPage: Int | Double = null,
    ignorePlurals: js.UndefOr[Boolean] = js.undefined,
    insideBoundingBox: js.Array[js.Array[Double]] = null,
    insidePolygon: js.Array[js.Array[Double]] = null,
    length: Int | Double = null,
    maxValuesPerFacet: Int | Double = null,
    minProximity: Int | Double = null,
    minWordSizefor1Typo: Int | Double = null,
    minWordSizefor2Typos: Int | Double = null,
    minimumAroundRadius: Int | Double = null,
    nbShards: Int | Double = null,
    numericAttributesForFiltering: js.Array[String] = null,
    numericAttributesToIndex: js.Array[String] = null,
    numericFilters: js.Array[String] = null,
    offset: Int | Double = null,
    optionalWords: js.Array[String] = null,
    page: Int | Double = null,
    query: String = null,
    queryType: prefixAll | prefixLast | prefixNone = null,
    removeStopWords: Boolean | js.Array[String] = null,
    removeWordsIfNoResults: none | lastWords | firstWords | allOptional = null,
    replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined,
    restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined,
    restrictSearchableAttributes: js.Array[String] = null,
    ruleContexts: js.Array[String] = null,
    snippetEllipsisText: String = null,
    sortFacetValuesBy: count | alpha = null,
    sumOrFiltersScores: js.UndefOr[Boolean] = js.undefined,
    synonyms: js.UndefOr[Boolean] = js.undefined,
    tagFilters: js.Array[String | js.Array[String]] = null,
    userData: String | js.Object = null,
    userToken: String = null
  ): BrowseParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTyposOnNumericTokens)) __obj.updateDynamic("allowTyposOnNumericTokens")(allowTyposOnNumericTokens.asInstanceOf[js.Any])
    if (alternativesAsExact != null) __obj.updateDynamic("alternativesAsExact")(alternativesAsExact.asInstanceOf[js.Any])
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (analyticsTags != null) __obj.updateDynamic("analyticsTags")(analyticsTags.asInstanceOf[js.Any])
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng.asInstanceOf[js.Any])
    if (!js.isUndefined(aroundLatLngViaIP)) __obj.updateDynamic("aroundLatLngViaIP")(aroundLatLngViaIP.asInstanceOf[js.Any])
    if (aroundPrecision != null) __obj.updateDynamic("aroundPrecision")(aroundPrecision.asInstanceOf[js.Any])
    if (aroundRadius != null) __obj.updateDynamic("aroundRadius")(aroundRadius.asInstanceOf[js.Any])
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve.asInstanceOf[js.Any])
    if (!js.isUndefined(clickAnalytics)) __obj.updateDynamic("clickAnalytics")(clickAnalytics.asInstanceOf[js.Any])
    if (disableExactOnAttributes != null) __obj.updateDynamic("disableExactOnAttributes")(disableExactOnAttributes.asInstanceOf[js.Any])
    if (disableTypoToleranceOnAttributes != null) __obj.updateDynamic("disableTypoToleranceOnAttributes")(disableTypoToleranceOnAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(enableABTest)) __obj.updateDynamic("enableABTest")(enableABTest.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(facetingAfterDistinct)) __obj.updateDynamic("facetingAfterDistinct")(facetingAfterDistinct.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag.asInstanceOf[js.Any])
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag.asInstanceOf[js.Any])
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePlurals)) __obj.updateDynamic("ignorePlurals")(ignorePlurals.asInstanceOf[js.Any])
    if (insideBoundingBox != null) __obj.updateDynamic("insideBoundingBox")(insideBoundingBox.asInstanceOf[js.Any])
    if (insidePolygon != null) __obj.updateDynamic("insidePolygon")(insidePolygon.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxValuesPerFacet != null) __obj.updateDynamic("maxValuesPerFacet")(maxValuesPerFacet.asInstanceOf[js.Any])
    if (minProximity != null) __obj.updateDynamic("minProximity")(minProximity.asInstanceOf[js.Any])
    if (minWordSizefor1Typo != null) __obj.updateDynamic("minWordSizefor1Typo")(minWordSizefor1Typo.asInstanceOf[js.Any])
    if (minWordSizefor2Typos != null) __obj.updateDynamic("minWordSizefor2Typos")(minWordSizefor2Typos.asInstanceOf[js.Any])
    if (minimumAroundRadius != null) __obj.updateDynamic("minimumAroundRadius")(minimumAroundRadius.asInstanceOf[js.Any])
    if (nbShards != null) __obj.updateDynamic("nbShards")(nbShards.asInstanceOf[js.Any])
    if (numericAttributesForFiltering != null) __obj.updateDynamic("numericAttributesForFiltering")(numericAttributesForFiltering.asInstanceOf[js.Any])
    if (numericAttributesToIndex != null) __obj.updateDynamic("numericAttributesToIndex")(numericAttributesToIndex.asInstanceOf[js.Any])
    if (numericFilters != null) __obj.updateDynamic("numericFilters")(numericFilters.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (optionalWords != null) __obj.updateDynamic("optionalWords")(optionalWords.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceSynonymsInHighlight)) __obj.updateDynamic("replaceSynonymsInHighlight")(replaceSynonymsInHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays.asInstanceOf[js.Any])
    if (restrictSearchableAttributes != null) __obj.updateDynamic("restrictSearchableAttributes")(restrictSearchableAttributes.asInstanceOf[js.Any])
    if (ruleContexts != null) __obj.updateDynamic("ruleContexts")(ruleContexts.asInstanceOf[js.Any])
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText.asInstanceOf[js.Any])
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (!js.isUndefined(sumOrFiltersScores)) __obj.updateDynamic("sumOrFiltersScores")(sumOrFiltersScores.asInstanceOf[js.Any])
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (userToken != null) __obj.updateDynamic("userToken")(userToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseParameters]
  }
}

