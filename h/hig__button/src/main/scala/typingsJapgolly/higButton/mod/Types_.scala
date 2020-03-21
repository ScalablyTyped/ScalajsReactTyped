package typingsJapgolly.higButton.mod

import typingsJapgolly.higButton.higButtonStrings.flat
import typingsJapgolly.higButton.higButtonStrings.outline
import typingsJapgolly.higButton.higButtonStrings.primary
import typingsJapgolly.higButton.higButtonStrings.secondary
import typingsJapgolly.higButton.higButtonStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types_ extends js.Object {
  var FLAT: flat
  var OUTLINE: outline
  /** @deprecated */
  var PRIMARY: primary
  /** @deprecated */
  var SECONDARY: secondary
  var SOLID: solid
}

object Types_ {
  @scala.inline
  def apply(FLAT: flat, OUTLINE: outline, PRIMARY: primary, SECONDARY: secondary, SOLID: solid): Types_ = {
    val __obj = js.Dynamic.literal(FLAT = FLAT.asInstanceOf[js.Any], OUTLINE = OUTLINE.asInstanceOf[js.Any], PRIMARY = PRIMARY.asInstanceOf[js.Any], SECONDARY = SECONDARY.asInstanceOf[js.Any], SOLID = SOLID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Types_]
  }
}

