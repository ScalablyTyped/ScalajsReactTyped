package typingsJapgolly.jdataview.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bytes extends /* index */ NumberDictionary[Double] {
  var length: Double
}

object Bytes {
  @scala.inline
  def apply(length: Double, NumberDictionary: /* index */ NumberDictionary[Double] = null): Bytes = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Bytes]
  }
}

