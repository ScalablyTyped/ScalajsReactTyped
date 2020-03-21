package typingsJapgolly.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength[TOther] extends /* x */ NumberDictionary[TOther] {
  var length: Double
}

object AnonLength {
  @scala.inline
  def apply[TOther](length: Double, NumberDictionary: /* x */ NumberDictionary[TOther] = null): AnonLength[TOther] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonLength[TOther]]
  }
}

