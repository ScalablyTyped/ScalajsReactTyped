package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol3DStyleOrigin extends Object {
  /**
    * name of the symbol in the style referenced by styleName or styleUrl
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var name: String
  /**
    * a well-known esri-provided style, such as `EsriThematicShapesStyle`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleName: js.UndefOr[String] = js.undefined
  /**
    * url to a style definition
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleUrl: js.UndefOr[String] = js.undefined
}

object Symbol3DStyleOrigin {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    name: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    styleName: String = null,
    styleUrl: String = null
  ): Symbol3DStyleOrigin = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (styleName != null) __obj.updateDynamic("styleName")(styleName.asInstanceOf[js.Any])
    if (styleUrl != null) __obj.updateDynamic("styleUrl")(styleUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol3DStyleOrigin]
  }
}

