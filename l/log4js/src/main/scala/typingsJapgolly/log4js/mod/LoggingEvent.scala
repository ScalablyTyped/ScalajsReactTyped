package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.AnonWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingEvent extends js.Object {
  var categoryName: String
  var cluster: js.UndefOr[AnonWorker] = js.undefined
  var context: js.Any
  	// level of message
  var data: js.Array[_]
  	// name of category
  var level: Level
  var pid: Double
  	// objects to log
  var startTime: js.Date
}

object LoggingEvent {
  @scala.inline
  def apply(
    categoryName: String,
    context: js.Any,
    data: js.Array[_],
    level: Level,
    pid: Double,
    startTime: js.Date,
    cluster: AnonWorker = null
  ): LoggingEvent = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEvent]
  }
}

