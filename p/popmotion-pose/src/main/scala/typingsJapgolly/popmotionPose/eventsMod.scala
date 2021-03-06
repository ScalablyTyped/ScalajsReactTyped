package typingsJapgolly.popmotionPose

import org.scalajs.dom.raw.Element
import typingsJapgolly.popmotion.typesMod.ColdSubscription
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
import typingsJapgolly.poseCore.typesMod.ActiveActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  def default(
    element: Element,
    activeActions: ActiveActions[ColdSubscription],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = js.native
}

