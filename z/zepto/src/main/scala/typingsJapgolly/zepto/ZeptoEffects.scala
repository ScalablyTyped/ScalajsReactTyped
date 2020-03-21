package typingsJapgolly.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoEffects extends js.Object {
  /**
  	* (default false in browsers that support CSS transitions): set to true to disable all animate() transitions.
  	**/
  var off: Boolean
  /**
  	* An object with duration settings for animations.
  	* Change existing values or add new properties to affect animations that use a string for setting duration.
  	**/
  var speeds: ZeptoEffectsSpeeds
}

object ZeptoEffects {
  @scala.inline
  def apply(off: Boolean, speeds: ZeptoEffectsSpeeds): ZeptoEffects = {
    val __obj = js.Dynamic.literal(off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZeptoEffects]
  }
}

