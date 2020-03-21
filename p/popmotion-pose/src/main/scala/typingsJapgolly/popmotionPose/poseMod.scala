package typingsJapgolly.popmotionPose

import org.scalajs.dom.raw.Element
import typingsJapgolly.popmotion.valueMod.ValueProps
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/pose", JSImport.Namespace)
@js.native
object poseMod extends js.Object {
  @js.native
  class Action ()
    extends typingsJapgolly.popmotion.actionMod.Action
  
  @js.native
  class ValueReaction protected ()
    extends typingsJapgolly.popmotion.mod.ValueReaction {
    def this(props: ValueProps) = this()
  }
  
  def default(element: Element, config: DomPopmotionConfig): DomPopmotionPoser = js.native
}

