package typingsJapgolly.phaser.Phaser.Types.Animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAnimations extends js.Object {
  /**
    * An array of all Animations added to the Animation Manager.
    */
  var anims: js.Array[JSONAnimation]
  /**
    * The global time scale of the Animation Manager.
    */
  var globalTimeScale: Double
}

object JSONAnimations {
  @scala.inline
  def apply(anims: js.Array[JSONAnimation], globalTimeScale: Double): JSONAnimations = {
    val __obj = js.Dynamic.literal(anims = anims.asInstanceOf[js.Any], globalTimeScale = globalTimeScale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONAnimations]
  }
}

