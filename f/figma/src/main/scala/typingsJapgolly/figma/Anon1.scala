package typingsJapgolly.figma

import typingsJapgolly.figma.figmaStrings.ON_CLICK
import typingsJapgolly.figma.figmaStrings.ON_DRAG
import typingsJapgolly.figma.figmaStrings.ON_HOVER
import typingsJapgolly.figma.figmaStrings.ON_PRESS
import typingsJapgolly.figma.mod._Global_.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends Trigger {
  val `type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG
}

object Anon1 {
  @scala.inline
  def apply(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

