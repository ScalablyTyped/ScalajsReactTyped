package typingsJapgolly.opentok.mod

import typingsJapgolly.opentok.opentokStrings.bestFit
import typingsJapgolly.opentok.opentokStrings.horizontalPresentation
import typingsJapgolly.opentok.opentokStrings.pip
import typingsJapgolly.opentok.opentokStrings.verticalPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredefinedArchiveLayoutOptions extends ArchiveLayoutOptions {
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation
}

object PredefinedArchiveLayoutOptions {
  @scala.inline
  def apply(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedArchiveLayoutOptions]
  }
}

