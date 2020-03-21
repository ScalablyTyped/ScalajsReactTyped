package typingsJapgolly.reactTracking.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingProp[P] extends js.Object {
  /**
    * This method returns all of the contextual tracking data up until this point in the component hierarchy.
    */
  def getTrackingData(): js.Object
  def trackEvent(data: Partial[P]): js.Any
}

object TrackingProp {
  @scala.inline
  def apply[P](getTrackingData: CallbackTo[js.Object], trackEvent: Partial[P] => CallbackTo[js.Any]): TrackingProp[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTrackingData")(getTrackingData.toJsFn)
    __obj.updateDynamic("trackEvent")(js.Any.fromFunction1((t0: typingsJapgolly.std.Partial[P]) => trackEvent(t0).runNow()))
    __obj.asInstanceOf[TrackingProp[P]]
  }
}

