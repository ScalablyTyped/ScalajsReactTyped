package typingsJapgolly.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchJobsRequest extends StObject {
  
  /** Controls over how job documents get ranked on top of existing relevance score (determined by API algorithm). */
  var customRankingInfo: js.UndefOr[CustomRankingInfo] = js.undefined
  
  /**
    * This field is deprecated. Please use SearchJobsRequest.keyword_match_mode going forward. To migrate, disable_keyword_match set to false maps to KeywordMatchMode.KEYWORD_MATCH_ALL,
    * and disable_keyword_match set to true maps to KeywordMatchMode.KEYWORD_MATCH_DISABLED. If SearchJobsRequest.keyword_match_mode is set, this field is ignored. Controls whether to
    * disable exact keyword match on Job.title, Job.description, Job.company_display_name, Job.addresses, Job.qualifications. When disable keyword match is turned off, a keyword match
    * returns jobs that do not match given category filters when there are matching keywords. For example, for the query "program manager," a result is returned even if the job posting
    * has the title "software developer," which doesn't fall into "program manager" ontology, but does have "program manager" appearing in its description. For queries like "cloud" that
    * don't contain title or location specific ontology, jobs with "cloud" keyword matches are returned regardless of this flag's value. Use
    * Company.keyword_searchable_job_custom_attributes if company-specific globally matched custom field/attribute string values are needed. Enabling keyword match improves recall of
    * subsequent search requests. Defaults to false.
    */
  var disableKeywordMatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether highly similar jobs are returned next to each other in the search results. Jobs are identified as highly similar based on their titles, job categories, and
    * locations. Highly similar results are clustered so that only one representative job of the cluster is displayed to the job seeker higher up in the results, with the other jobs being
    * displayed lower down in the results. Defaults to DiversificationLevel.SIMPLE if no value is specified.
    */
  var diversificationLevel: js.UndefOr[String] = js.undefined
  
  /** Controls whether to broaden the search when it produces sparse results. Broadened queries append results to the end of the matching results list. Defaults to false. */
  var enableBroadening: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An expression specifies a histogram request against matching jobs. Expression syntax is an aggregation function call with histogram facets and other options. Available aggregation
    * function calls are: * `count(string_histogram_facet)`: Count the number of matching entities, for each distinct attribute value. * `count(numeric_histogram_facet, list of buckets)`:
    * Count the number of matching entities within each bucket. A maximum of 200 histogram buckets are supported. Data types: * Histogram facet: facet names with format `a-zA-Z+`. *
    * String: string like "any string with backslash escape for quote(\")." * Number: whole number and floating point number like 10, -1 and -0.01. * List: list of elements with comma(,)
    * separator surrounded by square brackets, for example, [1, 2, 3] and ["one", "two", "three"]. Built-in constants: * MIN (minimum number similar to java Double.MIN_VALUE) * MAX
    * (maximum number similar to java Double.MAX_VALUE) Built-in functions: * bucket(start, end[, label]): bucket built-in function creates a bucket with range of start, end). Note that
    * the end is exclusive, for example, bucket(1, MAX, "positive number") or bucket(1, 10). Job histogram facets: * company_display_name: histogram by [Job.company_display_name. *
    * employment_type: histogram by Job.employment_types, for example, "FULL_TIME", "PART_TIME". * company_size: histogram by CompanySize, for example, "SMALL", "MEDIUM", "BIG". *
    * publish_time_in_day: histogram by the Job.posting_publish_time in days. Must specify list of numeric buckets in spec. * publish_time_in_month: histogram by the
    * Job.posting_publish_time in months. Must specify list of numeric buckets in spec. * publish_time_in_year: histogram by the Job.posting_publish_time in years. Must specify list of
    * numeric buckets in spec. * degree_types: histogram by the Job.degree_types, for example, "Bachelors", "Masters". * job_level: histogram by the Job.job_level, for example, "Entry
    * Level". * country: histogram by the country code of jobs, for example, "US", "FR". * admin1: histogram by the admin1 code of jobs, which is a global placeholder referring to the
    * state, province, or the particular term a country uses to define the geographic structure below the country level, for example, "CA", "IL". * city: histogram by a combination of the
    * "city name, admin1 code". For example, "Mountain View, CA", "New York, NY". * admin1_country: histogram by a combination of the "admin1 code, country", for example, "CA, US", "IL,
    * US". * city_coordinate: histogram by the city center's GPS coordinates (latitude and longitude), for example, 37.4038522,-122.0987765. Since the coordinates of a city center can
    * change, customers may need to refresh them periodically. * locale: histogram by the Job.language_code, for example, "en-US", "fr-FR". * language: histogram by the language subtag of
    * the Job.language_code, for example, "en", "fr". * category: histogram by the JobCategory, for example, "COMPUTER_AND_IT", "HEALTHCARE". * base_compensation_unit: histogram by the
    * CompensationInfo.CompensationUnit of base salary, for example, "WEEKLY", "MONTHLY". * base_compensation: histogram by the base salary. Must specify list of numeric buckets to group
    * results by. * annualized_base_compensation: histogram by the base annualized salary. Must specify list of numeric buckets to group results by. * annualized_total_compensation:
    * histogram by the total annualized salary. Must specify list of numeric buckets to group results by. * string_custom_attribute: histogram by string Job.custom_attributes. Values can
    * be accessed via square bracket notations like string_custom_attribute["key1"]. * numeric_custom_attribute: histogram by numeric Job.custom_attributes. Values can be accessed via
    * square bracket notations like numeric_custom_attribute["key1"]. Must specify list of numeric buckets to group results by. Example expressions: * `count(admin1)` *
    * `count(base_compensation, [bucket(1000, 10000), bucket(10000, 100000), bucket(100000, MAX)])` * `count(string_custom_attribute["some-string-custom-attribute"])` *
    * `count(numeric_custom_attribute["some-numeric-custom-attribute"], [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])`
    */
  var histogramQueries: js.UndefOr[js.Array[HistogramQuery]] = js.undefined
  
  /** Query used to search against jobs, such as keyword, location filters, etc. */
  var jobQuery: js.UndefOr[JobQuery] = js.undefined
  
  /** The desired job attributes returned for jobs in the search response. Defaults to JobView.JOB_VIEW_SMALL if no value is specified. */
  var jobView: js.UndefOr[String] = js.undefined
  
  /**
    * Controls what keyword match options to use. If both keyword_match_mode and disable_keyword_match are set, keyword_match_mode will take precedence. Defaults to
    * KeywordMatchMode.KEYWORD_MATCH_ALL if no value is specified.
    */
  var keywordMatchMode: js.UndefOr[String] = js.undefined
  
  /**
    * A limit on the number of jobs returned in the search results. Increasing this value above the default value of 10 can increase search response time. The value can be between 1 and
    * 100.
    */
  var maxPageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * An integer that specifies the current offset (that is, starting result location, amongst the jobs deemed by the API as relevant) in search results. This field is only considered if
    * page_token is unset. The maximum allowed value is 5000. Otherwise an error is thrown. For example, 0 means to return results starting from the first matching job, and 10 means to
    * return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and offset = 10 means to return from the second page).
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The criteria determining how search results are sorted. Default is `"relevance desc"`. Supported options are: * `"relevance desc"`: By relevance descending, as determined by the API
    * algorithms. Relevance thresholding of query results is only available with this ordering. * `"posting_publish_time desc"`: By Job.posting_publish_time descending. *
    * `"posting_update_time desc"`: By Job.posting_update_time descending. * `"title"`: By Job.title ascending. * `"title desc"`: By Job.title descending. *
    * `"annualized_base_compensation"`: By job's CompensationInfo.annualized_base_compensation_range ascending. Jobs whose annualized base compensation is unspecified are put at the end
    * of search results. * `"annualized_base_compensation desc"`: By job's CompensationInfo.annualized_base_compensation_range descending. Jobs whose annualized base compensation is
    * unspecified are put at the end of search results. * `"annualized_total_compensation"`: By job's CompensationInfo.annualized_total_compensation_range ascending. Jobs whose annualized
    * base compensation is unspecified are put at the end of search results. * `"annualized_total_compensation desc"`: By job's CompensationInfo.annualized_total_compensation_range
    * descending. Jobs whose annualized base compensation is unspecified are put at the end of search results. * `"custom_ranking desc"`: By the relevance score adjusted to the
    * SearchJobsRequest.CustomRankingInfo.ranking_expression with weight factor assigned by SearchJobsRequest.CustomRankingInfo.importance_level in descending order. * Location sorting:
    * Use the special syntax to order jobs by distance: `"distance_from('Hawaii')"`: Order by distance from Hawaii. `"distance_from(19.89, 155.5)"`: Order by distance from a coordinate.
    * `"distance_from('Hawaii'), distance_from('Puerto Rico')"`: Order by multiple locations. See details below. `"distance_from('Hawaii'), distance_from(19.89, 155.5)"`: Order by
    * multiple locations. See details below. The string can have a maximum of 256 characters. When multiple distance centers are provided, a job that is close to any of the distance
    * centers would have a high rank. When a job has multiple locations, the job location closest to one of the distance centers will be used. Jobs that don't have locations will be
    * ranked at the bottom. Distance is calculated with a precision of 11.3 meters (37.4 feet). Diversification strategy is still applied unless explicitly disabled in
    * diversification_level.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /** The token specifying the current offset within search results. See SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query results. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The meta information collected about the job searcher, used to improve the search quality of the service. The identifiers (such as `user_id`) are provided by users, and
    * must be unique and consistent.
    */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.undefined
  
  /** Mode of a search. Defaults to SearchMode.JOB_SEARCH. */
  var searchMode: js.UndefOr[String] = js.undefined
}
object SearchJobsRequest {
  
  inline def apply(): SearchJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchJobsRequest]
  }
  
  extension [Self <: SearchJobsRequest](x: Self) {
    
    inline def setCustomRankingInfo(value: CustomRankingInfo): Self = StObject.set(x, "customRankingInfo", value.asInstanceOf[js.Any])
    
    inline def setCustomRankingInfoUndefined: Self = StObject.set(x, "customRankingInfo", js.undefined)
    
    inline def setDisableKeywordMatch(value: Boolean): Self = StObject.set(x, "disableKeywordMatch", value.asInstanceOf[js.Any])
    
    inline def setDisableKeywordMatchUndefined: Self = StObject.set(x, "disableKeywordMatch", js.undefined)
    
    inline def setDiversificationLevel(value: String): Self = StObject.set(x, "diversificationLevel", value.asInstanceOf[js.Any])
    
    inline def setDiversificationLevelUndefined: Self = StObject.set(x, "diversificationLevel", js.undefined)
    
    inline def setEnableBroadening(value: Boolean): Self = StObject.set(x, "enableBroadening", value.asInstanceOf[js.Any])
    
    inline def setEnableBroadeningUndefined: Self = StObject.set(x, "enableBroadening", js.undefined)
    
    inline def setHistogramQueries(value: js.Array[HistogramQuery]): Self = StObject.set(x, "histogramQueries", value.asInstanceOf[js.Any])
    
    inline def setHistogramQueriesUndefined: Self = StObject.set(x, "histogramQueries", js.undefined)
    
    inline def setHistogramQueriesVarargs(value: HistogramQuery*): Self = StObject.set(x, "histogramQueries", js.Array(value*))
    
    inline def setJobQuery(value: JobQuery): Self = StObject.set(x, "jobQuery", value.asInstanceOf[js.Any])
    
    inline def setJobQueryUndefined: Self = StObject.set(x, "jobQuery", js.undefined)
    
    inline def setJobView(value: String): Self = StObject.set(x, "jobView", value.asInstanceOf[js.Any])
    
    inline def setJobViewUndefined: Self = StObject.set(x, "jobView", js.undefined)
    
    inline def setKeywordMatchMode(value: String): Self = StObject.set(x, "keywordMatchMode", value.asInstanceOf[js.Any])
    
    inline def setKeywordMatchModeUndefined: Self = StObject.set(x, "keywordMatchMode", js.undefined)
    
    inline def setMaxPageSize(value: Double): Self = StObject.set(x, "maxPageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxPageSizeUndefined: Self = StObject.set(x, "maxPageSize", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRequestMetadata(value: RequestMetadata): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
    
    inline def setSearchMode(value: String): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
  }
}
