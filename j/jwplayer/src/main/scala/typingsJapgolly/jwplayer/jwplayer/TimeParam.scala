package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerNumbers.`0`
import typingsJapgolly.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeParam extends js.Object {
  var duration: Double
  var position: Double
  var viewable: `0` | `1`
}

object TimeParam {
  @scala.inline
  def apply(duration: Double, position: Double, viewable: `0` | `1`): TimeParam = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimeParam]
  }
}

