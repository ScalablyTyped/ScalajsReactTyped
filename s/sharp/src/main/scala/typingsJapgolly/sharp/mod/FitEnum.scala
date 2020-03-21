package typingsJapgolly.sharp.mod

import typingsJapgolly.sharp.sharpStrings.contain
import typingsJapgolly.sharp.sharpStrings.cover
import typingsJapgolly.sharp.sharpStrings.fill
import typingsJapgolly.sharp.sharpStrings.inside
import typingsJapgolly.sharp.sharpStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitEnum extends js.Object {
  var contain: typingsJapgolly.sharp.sharpStrings.contain
  var cover: typingsJapgolly.sharp.sharpStrings.cover
  var fill: typingsJapgolly.sharp.sharpStrings.fill
  var inside: typingsJapgolly.sharp.sharpStrings.inside
  var outside: typingsJapgolly.sharp.sharpStrings.outside
}

object FitEnum {
  @scala.inline
  def apply(contain: contain, cover: cover, fill: fill, inside: inside, outside: outside): FitEnum = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FitEnum]
  }
}

