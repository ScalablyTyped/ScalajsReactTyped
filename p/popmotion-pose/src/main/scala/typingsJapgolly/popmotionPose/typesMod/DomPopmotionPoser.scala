package typingsJapgolly.popmotionPose.typesMod

import org.scalajs.dom.raw.Element
import typingsJapgolly.popmotion.mod.Action_
import typingsJapgolly.popmotion.typesMod.ColdSubscription
import typingsJapgolly.poseCore.typesMod.Poser
import typingsJapgolly.poseCore.typesMod.PoserConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomPopmotionPoser extends Poser[Value, Action_, ColdSubscription, DomPopmotionPoser] {
  def addChild(element: Element, config: PoserConfig[Value]): DomPopmotionPoser = js.native
  def flip(op: js.Function): js.Promise[_] = js.native
  def measure(): BoundingBox = js.native
}

