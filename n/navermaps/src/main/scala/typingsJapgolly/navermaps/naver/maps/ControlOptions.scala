package typingsJapgolly.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOptions extends js.Object {
  var position: Position
}

object ControlOptions {
  @scala.inline
  def apply(position: Position): ControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ControlOptions]
  }
}

