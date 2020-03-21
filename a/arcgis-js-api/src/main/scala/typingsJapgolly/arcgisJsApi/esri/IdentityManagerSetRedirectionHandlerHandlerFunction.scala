package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerSetRedirectionHandlerHandlerFunction extends Object {
  /**
    * The URL of the secure resource that triggers the redirection to the ArcGIS.com sign-in page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var resourceUrl: String
  /**
    * The application URL where the sign-in page redirects after a successful login. To create the return URL, append the application's URL to signInPage as a parameter. The *returnUrlParamName* contains the name of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var returnUrlParamName: String
  /**
    * The ServerInfo object describing the server where the secure resource is hosted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var serverInfo: ServerInfo
  /**
    * URL of the sign-in page where users will be redirected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var signInPage: String
}

object IdentityManagerSetRedirectionHandlerHandlerFunction {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    resourceUrl: String,
    returnUrlParamName: String,
    serverInfo: ServerInfo,
    signInPage: String
  ): IdentityManagerSetRedirectionHandlerHandlerFunction = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], resourceUrl = resourceUrl.asInstanceOf[js.Any], returnUrlParamName = returnUrlParamName.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any], signInPage = signInPage.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[IdentityManagerSetRedirectionHandlerHandlerFunction]
  }
}

