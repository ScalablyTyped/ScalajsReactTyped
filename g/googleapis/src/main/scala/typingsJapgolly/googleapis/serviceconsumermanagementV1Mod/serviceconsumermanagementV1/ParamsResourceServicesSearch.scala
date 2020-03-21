package typingsJapgolly.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of results returned by this request. Currently, the
    * default maximum is set to 1000. If `page_size` isn't provided or the size
    * provided is a number larger than 1000, it's automatically set to 1000.
    * Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.  Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Service for which search is performed. services/{service} {service} the
    * name of a service, for example 'service.googleapis.com'.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Set a query `{expression}` for querying tenancy units. Your
    * `{expression}` must be in the format: `field_name=literal_string`. The
    * `field_name` is the name of the field you want to compare. Supported
    * fields are `tenant_resources.tag` and `tenant_resources.resource`.  For
    * example, to search tenancy units that contain at least one tenant
    * resource with a given tag 'xyz', use the query
    * `tenant_resources.tag=xyz`. To search tenancy units that contain at least
    * one tenant resource with a given resource name 'projects/123456', use the
    * query `tenant_resources.resource=projects/123456`.  Multiple expressions
    * can be joined with `AND`s. Tenancy units must match all expressions to be
    * included in the result set. For example, `tenant_resources.tag=xyz AND
    * tenant_resources.resource=projects/123456`  Optional.
    */
  var query: js.UndefOr[String] = js.native
}

