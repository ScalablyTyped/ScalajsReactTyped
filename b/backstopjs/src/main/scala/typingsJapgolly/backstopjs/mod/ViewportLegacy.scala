package typingsJapgolly.backstopjs.mod

import typingsJapgolly.backstopjs.backstopjsStrings.desktop
import typingsJapgolly.backstopjs.backstopjsStrings.phone
import typingsJapgolly.backstopjs.backstopjsStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportLegacy extends Viewport {
  var height: Double
  var name: phone | tablet | desktop
  var width: Double
}

object ViewportLegacy {
  @scala.inline
  def apply(height: Double, name: phone | tablet | desktop, width: Double): ViewportLegacy = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewportLegacy]
  }
}

