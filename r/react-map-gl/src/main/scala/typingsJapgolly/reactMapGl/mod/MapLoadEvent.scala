package typingsJapgolly.reactMapGl.mod

import typingsJapgolly.mapboxGl.mod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLoadEvent extends js.Object {
  var target: Map
  var `type`: String
}

object MapLoadEvent {
  @scala.inline
  def apply(target: Map, `type`: String): MapLoadEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLoadEvent]
  }
}

