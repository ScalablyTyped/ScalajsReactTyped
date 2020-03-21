package typingsJapgolly.popmotionPose.typesMod

import typingsJapgolly.popmotion.mod.Action_
import typingsJapgolly.popmotion.typesMod.ColdSubscription
import typingsJapgolly.popmotionPose.AnonElementStyler
import typingsJapgolly.poseCore.typesMod.ExtendAPI
import typingsJapgolly.poseCore.typesMod.Poser
import typingsJapgolly.poseCore.typesMod.PoserConfig
import typingsJapgolly.poseCore.typesMod.ReadValueFromSource
import typingsJapgolly.poseCore.typesMod.TransformPose
import typingsJapgolly.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopmotionPoserFactoryConfig[P, TD] extends js.Object {
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[Value, Action_, ColdSubscription, P] = js.native
  var posePriority: js.UndefOr[js.Array[String]] = js.native
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
  @JSName("transformPose")
  var transformPose_Original: TransformPose[Value, Action_, ColdSubscription, P, TD] = js.native
  def addListenerToValue(key: String, styler: Styler): js.Function1[/* v */ js.Any, Unit] = js.native
  def extendAPI(
    api: Poser[Value, Action_, ColdSubscription, P],
    state: typingsJapgolly.poseCore.typesMod.PoserState[Value, Action_, ColdSubscription, P],
    config: PoserConfig[Value]
  ): Poser[Value, Action_, ColdSubscription, P] = js.native
  def forceRender(props: AnonElementStyler): Unit = js.native
  def setValueNative(key: String, to: js.Any, props: AnonElementStyler): Unit = js.native
  def transformPose(
    pose: typingsJapgolly.poseCore.typesMod.Pose[Action_, TD],
    key: String,
    state: typingsJapgolly.poseCore.typesMod.PoserState[Value, Action_, ColdSubscription, P]
  ): typingsJapgolly.poseCore.typesMod.Pose[Action_, TD] = js.native
}

