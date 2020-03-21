package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResponse extends Object {
  /**
    * The requested data. Should match the `responseType` with the data return type. Possible types are: [json](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object), [xml](https://developer.mozilla.org/en-US/docs/Web/API/XMLDocument), [text](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String), [blob](https://developer.mozilla.org/en-US/docs/Web/API/Blob), [array-buffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [document](https://developer.mozilla.org/en-US/docs/Web/API/HTMLDocument), and [image](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Method for getting a header sent from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var getHeader: js.UndefOr[GetHeader] = js.undefined
  /**
    * The options specified by the user in the data request. See [RequestOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions) for available properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  /**
    * Indicates if the request required https.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  /**
    * The URL used to request the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var url: js.UndefOr[String] = js.undefined
}

object RequestResponse {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    data: js.Any = null,
    getHeader: /* headerName */ String => CallbackTo[String] = null,
    requestOptions: RequestOptions = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): RequestResponse = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (getHeader != null) __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: /* headerName */ java.lang.String) => getHeader(t0).runNow()))
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponse]
  }
}

