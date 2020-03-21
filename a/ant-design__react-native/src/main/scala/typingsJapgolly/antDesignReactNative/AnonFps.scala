package typingsJapgolly.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFps extends js.Object {
  var fps: Double
  var leading: Double
  var loop: Boolean
  var maxWidth: Double
  var text: String
  var trailing: Double
}

object AnonFps {
  @scala.inline
  def apply(fps: Double, leading: Double, loop: Boolean, maxWidth: Double, text: String, trailing: Double): AnonFps = {
    val __obj = js.Dynamic.literal(fps = fps.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFps]
  }
}

