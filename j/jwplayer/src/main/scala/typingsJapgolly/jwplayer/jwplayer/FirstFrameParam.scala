package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerNumbers.`0`
import typingsJapgolly.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstFrameParam extends js.Object {
  var loadTime: Double
  var viewable: `0` | `1`
}

object FirstFrameParam {
  @scala.inline
  def apply(loadTime: Double, viewable: `0` | `1`): FirstFrameParam = {
    val __obj = js.Dynamic.literal(loadTime = loadTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirstFrameParam]
  }
}

