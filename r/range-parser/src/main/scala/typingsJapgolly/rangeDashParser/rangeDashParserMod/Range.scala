package typingsJapgolly.rangeDashParser.rangeDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var end: Double
  var start: Double
}

object Range {
  @scala.inline
  def apply(end: Double, start: Double): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Range]
  }
}

