package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.forward
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reverse
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemFetchRelatedItemsParams extends Object {
  /**
    * The direction of the relationship. Can either be `forward` (from origin to destination) or `reverse` (from destination to origin).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var direction: forward | reverse
  /**
    * The type of relationship between the two items. See [Relationship types](https://developers.arcgis.com/rest/users-groups-and-items/relationship-types.htm) for a complete listing of types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var relationshipType: String
}

object PortalItemFetchRelatedItemsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    direction: forward | reverse,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    relationshipType: String
  ): PortalItemFetchRelatedItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], relationshipType = relationshipType.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[PortalItemFetchRelatedItemsParams]
  }
}

