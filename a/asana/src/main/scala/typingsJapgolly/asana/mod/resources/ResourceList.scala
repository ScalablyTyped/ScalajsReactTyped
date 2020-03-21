package typingsJapgolly.asana.mod.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asana.AnonAsanaBaseUrl
import typingsJapgolly.asana.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceList[T /* <: Resource */] extends js.Object {
  var _dispatcher: AnonAsanaBaseUrl
  var _response: AnonData[T]
  var data: js.Array[T]
  /**
    * Get the next page of results in a collection.
    *
    * @returns {Promise<Collection?>} Resolves to either a collection representing
    *     the next page of results, or null if no more pages.
    */
  def nextPage(): typingsJapgolly.bluebird.mod.^[ResourceList[T] | Null]
}

object ResourceList {
  @scala.inline
  def apply[T /* <: Resource */](
    _dispatcher: AnonAsanaBaseUrl,
    _response: AnonData[T],
    data: js.Array[T],
    nextPage: CallbackTo[typingsJapgolly.bluebird.mod.^[ResourceList[T] | Null]]
  ): ResourceList[T] = {
    val __obj = js.Dynamic.literal(_dispatcher = _dispatcher.asInstanceOf[js.Any], _response = _response.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("nextPage")(nextPage.toJsFn)
    __obj.asInstanceOf[ResourceList[T]]
  }
}

