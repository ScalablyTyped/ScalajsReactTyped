package typingsJapgolly.plugapi.mod.Enum

import typingsJapgolly.plugapi.plugapiStrings.d
import typingsJapgolly.plugapi.plugapiStrings.f
import typingsJapgolly.plugapi.plugapiStrings.h
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ban extends js.Object {
  var DAY: d
  var HOUR: h
  var PERMA: f
}

object Ban {
  @scala.inline
  def apply(DAY: d, HOUR: h, PERMA: f): Ban = {
    val __obj = js.Dynamic.literal(DAY = DAY.asInstanceOf[js.Any], HOUR = HOUR.asInstanceOf[js.Any], PERMA = PERMA.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ban]
  }
}

