package typingsJapgolly.jenkins

import typingsJapgolly.jenkins.jenkinsStrings.html
import typingsJapgolly.jenkins.jenkinsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[text | html] = js.undefined
}

object AnonDelay {
  @scala.inline
  def apply(delay: Int | Double = null, `type`: text | html = null): AnonDelay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
}

