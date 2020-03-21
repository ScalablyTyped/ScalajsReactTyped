package typingsJapgolly.breeze

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.breeze.breeze.DataService
import typingsJapgolly.breeze.breeze.EntityQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataService extends js.Object {
  var dataService: DataService
  var query: EntityQuery
  def getUrl(): String
}

object AnonDataService {
  @scala.inline
  def apply(dataService: DataService, getUrl: CallbackTo[String], query: EntityQuery): AnonDataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.asInstanceOf[AnonDataService]
  }
}

