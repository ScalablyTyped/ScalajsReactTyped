package typingsJapgolly.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineModel extends js.Object {
  var timeline: ITimeLine
}

object ITimelineModel {
  @scala.inline
  def apply(timeline: ITimeLine): ITimelineModel = {
    val __obj = js.Dynamic.literal(timeline = timeline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITimelineModel]
  }
}

