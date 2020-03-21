package typingsJapgolly.reactPose.typesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildRegistration extends js.Object {
  var element: Element
  var poseConfig: DomPopmotionConfig
  def onRegistered(poser: DomPopmotionPoser): Unit
}

object ChildRegistration {
  @scala.inline
  def apply(element: Element, onRegistered: DomPopmotionPoser => Callback, poseConfig: DomPopmotionConfig): ChildRegistration = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("onRegistered")(js.Any.fromFunction1((t0: typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser) => onRegistered(t0).runNow()))
    __obj.asInstanceOf[ChildRegistration]
  }
}

