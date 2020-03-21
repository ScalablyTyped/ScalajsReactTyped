package typingsJapgolly.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomControlOptions extends js.Object {
  var legendDisabled: Boolean
  var position: Position
  var style: ZoomControlStyle
}

object ZoomControlOptions {
  @scala.inline
  def apply(legendDisabled: Boolean, position: Position, style: ZoomControlStyle): ZoomControlOptions = {
    val __obj = js.Dynamic.literal(legendDisabled = legendDisabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZoomControlOptions]
  }
}

