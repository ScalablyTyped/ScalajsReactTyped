package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.HEIGHT
import typingsJapgolly.figma.figmaStrings.SCALE
import typingsJapgolly.figma.figmaStrings.WIDTH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettingsConstraints extends js.Object {
  val `type`: SCALE | WIDTH | HEIGHT
  val value: Double
}

object ExportSettingsConstraints {
  @scala.inline
  def apply(`type`: SCALE | WIDTH | HEIGHT, value: Double): ExportSettingsConstraints = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsConstraints]
  }
}

