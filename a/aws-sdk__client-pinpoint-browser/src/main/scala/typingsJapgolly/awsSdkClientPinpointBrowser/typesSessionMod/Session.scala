package typingsJapgolly.awsSdkClientPinpointBrowser.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  /**
    * The duration of the session, in milliseconds.
    */
  var Duration: js.UndefOr[Double] = js.undefined
  /**
    * A unique identifier for the session.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the session began.
    */
  var StartTimestamp: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the session ended.
    */
  var StopTimestamp: js.UndefOr[String] = js.undefined
}

object Session {
  @scala.inline
  def apply(
    Duration: Int | Double = null,
    Id: String = null,
    StartTimestamp: String = null,
    StopTimestamp: String = null
  ): Session = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (StartTimestamp != null) __obj.updateDynamic("StartTimestamp")(StartTimestamp.asInstanceOf[js.Any])
    if (StopTimestamp != null) __obj.updateDynamic("StopTimestamp")(StopTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

