package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.X
import typingsJapgolly.figma.figmaStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guide extends js.Object {
  val axis: X | Y
  val offset: Double
}

object Guide {
  @scala.inline
  def apply(axis: X | Y, offset: Double): Guide = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Guide]
  }
}

