package typingsJapgolly.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  The query required to perform a search query or histogram.
  */
@js.native
trait SchemaJobQuery extends js.Object {
  /**
    * Optional.  The category filter specifies the categories of jobs to search
    * against. See Category for more information.  If a value is not specified,
    * jobs from any category are searched against.  If multiple values are
    * specified, jobs from any of the specified categories are searched
    * against.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.   Allows filtering jobs by commute time with different travel
    * methods (for  example, driving or public transit). Note: This only works
    * with COMMUTE  MODE. When specified, [JobQuery.location_filters] is
    * ignored.   Currently we don&#39;t support sorting by commute time.
    */
  var commuteFilter: js.UndefOr[SchemaCommutePreference] = js.native
  /**
    * Optional.  This filter specifies the exact company display name of the
    * jobs to search against.  If a value isn&#39;t specified, jobs within the
    * search results are associated with any company.  If multiple values are
    * specified, jobs within the search results may be associated with any of
    * the specified companies.  At most 20 company display name filters are
    * allowed.
    */
  var companyDisplayNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  This filter specifies the company entities to search against.
    * If a value isn&#39;t specified, jobs are searched for against all
    * companies.  If multiple values are specified, jobs are searched against
    * the companies specified.  At most 20 company filters are allowed.
    */
  var companyNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  This search filter is applied only to Job.compensation_info.
    * For example, if the filter is specified as &quot;Hourly job with per-hour
    * compensation &gt; $15&quot;, only jobs meeting these criteria are
    * searched. If a filter isn&#39;t defined, all open jobs are searched.
    */
  var compensationFilter: js.UndefOr[SchemaCompensationFilter] = js.native
  /**
    * Optional.  This filter specifies a structured syntax to match against the
    * Job.custom_attributes marked as `filterable`.  The syntax for this
    * expression is a subset of Google SQL syntax.  Supported operators are: =,
    * !=, &lt;, &lt;=, &gt;, &gt;= where the left of the operator is a custom
    * field key and the right of the operator is a number or string (surrounded
    * by quotes) value.  Supported functions are LOWER(&lt;field_name&gt;) to
    * perform case insensitive match and EMPTY(&lt;field_name&gt;) to filter on
    * the existence of a key.  Boolean expressions (AND/OR/NOT) are supported
    * up to 3 levels of nesting (for example, &quot;((A AND B AND C) OR NOT D)
    * AND E&quot;), a maximum of 50 comparisons/functions are allowed in the
    * expression. The expression must be &lt; 2000 characters in length. Sample
    * Query: (key1 = &quot;TEST&quot; OR LOWER(key1)=&quot;test&quot; OR NOT
    * EMPTY(key1)) AND key2 &gt; 100
    */
  var customAttributeFilter: js.UndefOr[String] = js.native
  /**
    * Optional.  This flag controls the spell-check feature. If false, the
    * service attempts to correct a misspelled query, for example,
    * &quot;enginee&quot; is corrected to &quot;engineer&quot;.  Defaults to
    * false: a spell check is performed.
    */
  var disableSpellCheck: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  The employment type filter specifies the employment type of
    * jobs to search against, such as EmploymentType.FULL_TIME.  If a value is
    * not specified, jobs in the search results include any employment type. If
    * multiple values are specified, jobs in the search results include any of
    * the specified employment types.
    */
  var employmentTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  This filter specifies the locale of jobs to search against,
    * for example, &quot;en-US&quot;.  If a value isn&#39;t specified, the
    * search results can contain jobs in any locale.   Language codes should be
    * in BCP-47 format, such as &quot;en-US&quot; or &quot;sr-Latn&quot;. For
    * more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47).  At most 10 language code
    * filters are allowed.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The location filter specifies geo-regions containing the jobs
    * to search against. See LocationFilter for more information.  If a
    * location value isn&#39;t specified, jobs fitting the other search
    * criteria are retrieved regardless of where they&#39;re located.  If
    * multiple values are specified, jobs are retrieved from any of the
    * specified locations. If different values are specified for the
    * LocationFilter.distance_in_miles parameter, the maximum provided distance
    * is used for all locations.  At most 5 location filters are allowed.
    */
  var locationFilters: js.UndefOr[js.Array[SchemaLocationFilter]] = js.native
  /**
    * Optional.  Jobs published within a range specified by this filter are
    * searched against, for example, DateRange.PAST_MONTH. If a value isn&#39;t
    * specified, all open jobs are searched against regardless of their
    * published date.
    */
  var publishDateRange: js.UndefOr[String] = js.native
  /**
    * Optional.  The query string that matches against the job title,
    * description, and location fields.  The maximum query size is 255 bytes.
    */
  var query: js.UndefOr[String] = js.native
}

object SchemaJobQuery {
  @scala.inline
  def apply(
    categories: js.Array[String] = null,
    commuteFilter: SchemaCommutePreference = null,
    companyDisplayNames: js.Array[String] = null,
    companyNames: js.Array[String] = null,
    compensationFilter: SchemaCompensationFilter = null,
    customAttributeFilter: String = null,
    disableSpellCheck: js.UndefOr[Boolean] = js.undefined,
    employmentTypes: js.Array[String] = null,
    languageCodes: js.Array[String] = null,
    locationFilters: js.Array[SchemaLocationFilter] = null,
    publishDateRange: String = null,
    query: String = null
  ): SchemaJobQuery = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (commuteFilter != null) __obj.updateDynamic("commuteFilter")(commuteFilter.asInstanceOf[js.Any])
    if (companyDisplayNames != null) __obj.updateDynamic("companyDisplayNames")(companyDisplayNames.asInstanceOf[js.Any])
    if (companyNames != null) __obj.updateDynamic("companyNames")(companyNames.asInstanceOf[js.Any])
    if (compensationFilter != null) __obj.updateDynamic("compensationFilter")(compensationFilter.asInstanceOf[js.Any])
    if (customAttributeFilter != null) __obj.updateDynamic("customAttributeFilter")(customAttributeFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSpellCheck)) __obj.updateDynamic("disableSpellCheck")(disableSpellCheck.asInstanceOf[js.Any])
    if (employmentTypes != null) __obj.updateDynamic("employmentTypes")(employmentTypes.asInstanceOf[js.Any])
    if (languageCodes != null) __obj.updateDynamic("languageCodes")(languageCodes.asInstanceOf[js.Any])
    if (locationFilters != null) __obj.updateDynamic("locationFilters")(locationFilters.asInstanceOf[js.Any])
    if (publishDateRange != null) __obj.updateDynamic("publishDateRange")(publishDateRange.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobQuery]
  }
}

