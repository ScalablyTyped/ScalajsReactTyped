package typingsJapgolly.activexPowerpoint

import typingsJapgolly.activexPowerpoint.PowerPoint.Effect
import typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNEffect extends js.Object {
  val Wn: SlideShowWindow
  val nEffect: Effect
}

object AnonNEffect {
  @scala.inline
  def apply(Wn: SlideShowWindow, nEffect: Effect): AnonNEffect = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any], nEffect = nEffect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNEffect]
  }
}

