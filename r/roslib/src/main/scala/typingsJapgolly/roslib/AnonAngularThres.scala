package typingsJapgolly.roslib

import typingsJapgolly.roslib.mod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAngularThres extends js.Object {
  var angularThres: js.UndefOr[Double] = js.undefined
  var fixedFrame: js.UndefOr[String] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var repubServiceName: js.UndefOr[String] = js.undefined
  var ros: Ros
  var serverName: js.UndefOr[String] = js.undefined
  var topicTimeout: js.UndefOr[Double] = js.undefined
  var transThres: js.UndefOr[Double] = js.undefined
  var updateDelay: js.UndefOr[Double] = js.undefined
}

object AnonAngularThres {
  @scala.inline
  def apply(
    ros: Ros,
    angularThres: Int | Double = null,
    fixedFrame: String = null,
    rate: Int | Double = null,
    repubServiceName: String = null,
    serverName: String = null,
    topicTimeout: Int | Double = null,
    transThres: Int | Double = null,
    updateDelay: Int | Double = null
  ): AnonAngularThres = {
    val __obj = js.Dynamic.literal(ros = ros.asInstanceOf[js.Any])
    if (angularThres != null) __obj.updateDynamic("angularThres")(angularThres.asInstanceOf[js.Any])
    if (fixedFrame != null) __obj.updateDynamic("fixedFrame")(fixedFrame.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (repubServiceName != null) __obj.updateDynamic("repubServiceName")(repubServiceName.asInstanceOf[js.Any])
    if (serverName != null) __obj.updateDynamic("serverName")(serverName.asInstanceOf[js.Any])
    if (topicTimeout != null) __obj.updateDynamic("topicTimeout")(topicTimeout.asInstanceOf[js.Any])
    if (transThres != null) __obj.updateDynamic("transThres")(transThres.asInstanceOf[js.Any])
    if (updateDelay != null) __obj.updateDynamic("updateDelay")(updateDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngularThres]
  }
}

