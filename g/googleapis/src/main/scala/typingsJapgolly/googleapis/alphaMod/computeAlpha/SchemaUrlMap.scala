package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A UrlMap resource. This resource defines the mapping from URL to the
  * BackendService resource, based on the &quot;longest-match&quot; of the
  * URL&#39;s host and path.
  */
@js.native
trait SchemaUrlMap extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * defaultRouteAction takes effect when none of the  hostRules match. The
    * load balancer performs advanced routing actions like URL rewrites, header
    * transformations, etc. prior to forwarding the request to the selected
    * backend. If defaultRouteAction specifies any weightedBackendServices,
    * defaultService must not be set. Conversely if defaultService is set,
    * defaultRouteAction cannot contain any  weightedBackendServices. Only one
    * of defaultRouteAction or defaultUrlRedirect must be set.
    */
  var defaultRouteAction: js.UndefOr[SchemaHttpRouteAction] = js.native
  /**
    * The full or partial URL of the defaultService resource to which traffic
    * is directed if none of the hostRules match. If defaultRouteAction is
    * additionally specified, advanced routing actions like URL Rewrites, etc.
    * take effect prior to sending the request to the backend. However, if
    * defaultService is specified, defaultRouteAction cannot contain any
    * weightedBackendServices. Conversely, if routeAction specifies any
    * weightedBackendServices, service must not be specified. Only one of
    * defaultService, defaultUrlRedirect  or
    * defaultRouteAction.weightedBackendService must be set.
    */
  var defaultService: js.UndefOr[String] = js.native
  /**
    * When none of the specified hostRules match, the request is redirected to
    * a URL specified by defaultUrlRedirect. If defaultUrlRedirect is
    * specified, defaultService or defaultRouteAction must not be set.
    */
  var defaultUrlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a UrlMap. An up-to-date fingerprint must be
    * provided in order to update the UrlMap, otherwise the request will fail
    * with error 412 conditionNotMet.  To see the latest fingerprint, make a
    * get() request to retrieve a UrlMap.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Specifies changes to request and response headers that need to take
    * effect for the selected backendService. The headerAction specified here
    * take effect after headerAction specified under pathMatcher.
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.native
  /**
    * The list of HostRules to use against the URL.
    */
  var hostRules: js.UndefOr[js.Array[SchemaHostRule]] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of named PathMatchers to use against the URL.
    */
  var pathMatchers: js.UndefOr[js.Array[SchemaPathMatcher]] = js.native
  /**
    * [Output Only] URL of the region where the regional URL map resides. This
    * field is not applicable to global URL maps. You must specify this field
    * as part of the HTTP request URL. It is not settable as a field in the
    * request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The list of expected URL mapping tests. Request to update this UrlMap
    * will succeed only if all of the test cases pass. You can specify a
    * maximum of 100 tests per UrlMap.
    */
  var tests: js.UndefOr[js.Array[SchemaUrlMapTest]] = js.native
}

object SchemaUrlMap {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    defaultRouteAction: SchemaHttpRouteAction = null,
    defaultService: String = null,
    defaultUrlRedirect: SchemaHttpRedirectAction = null,
    description: String = null,
    fingerprint: String = null,
    headerAction: SchemaHttpHeaderAction = null,
    hostRules: js.Array[SchemaHostRule] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    pathMatchers: js.Array[SchemaPathMatcher] = null,
    region: String = null,
    selfLink: String = null,
    tests: js.Array[SchemaUrlMapTest] = null
  ): SchemaUrlMap = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (defaultRouteAction != null) __obj.updateDynamic("defaultRouteAction")(defaultRouteAction.asInstanceOf[js.Any])
    if (defaultService != null) __obj.updateDynamic("defaultService")(defaultService.asInstanceOf[js.Any])
    if (defaultUrlRedirect != null) __obj.updateDynamic("defaultUrlRedirect")(defaultUrlRedirect.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (headerAction != null) __obj.updateDynamic("headerAction")(headerAction.asInstanceOf[js.Any])
    if (hostRules != null) __obj.updateDynamic("hostRules")(hostRules.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pathMatchers != null) __obj.updateDynamic("pathMatchers")(pathMatchers.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (tests != null) __obj.updateDynamic("tests")(tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlMap]
  }
}

