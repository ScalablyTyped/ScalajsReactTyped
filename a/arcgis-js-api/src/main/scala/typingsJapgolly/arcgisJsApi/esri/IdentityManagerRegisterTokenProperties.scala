package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerRegisterTokenProperties extends Object {
  /**
    * Token expiration time specified as number of milliseconds since 1 January 1970 00:00:00 UTC.
    *
    * [Read more...](properties.html)
    */
  var expires: js.UndefOr[Double] = js.undefined
  /**
    * For ArcGIS Online or Portal, this is https://www.arcgis.com/sharing/rest or similar to https://www.example.com/portal/sharing/rest. For ArcGIS Server this is similar to https://www.example.com/arcgis/rest/services.
    *
    * [Read more...](properties.html)
    */
  var server: String
  /**
    * Set this to `true` if the user has an ArcGIS Online organizational account and the organization is configured to allow access to resources only through SSL.
    *
    * [Read more...](properties.html)
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  /**
    * The access token.
    *
    * [Read more...](properties.html)
    */
  var token: String
  /**
    * The id of the user who owns the access token.
    *
    * [Read more...](properties.html)
    */
  var userId: js.UndefOr[String] = js.undefined
}

object IdentityManagerRegisterTokenProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    server: String,
    token: String,
    expires: Int | Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    userId: String = null
  ): IdentityManagerRegisterTokenProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerRegisterTokenProperties]
  }
}

