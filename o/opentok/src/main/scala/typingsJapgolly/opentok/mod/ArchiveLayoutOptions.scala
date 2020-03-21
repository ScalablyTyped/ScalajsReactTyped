package typingsJapgolly.opentok.mod

import typingsJapgolly.opentok.opentokStrings.bestFit
import typingsJapgolly.opentok.opentokStrings.custom
import typingsJapgolly.opentok.opentokStrings.horizontalPresentation
import typingsJapgolly.opentok.opentokStrings.pip
import typingsJapgolly.opentok.opentokStrings.verticalPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.opentok.mod.PredefinedArchiveLayoutOptions
  - typingsJapgolly.opentok.mod.CustomArchiveLayoutOptions
*/
trait ArchiveLayoutOptions extends js.Object

object ArchiveLayoutOptions {
  @scala.inline
  def PredefinedArchiveLayoutOptions(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): ArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveLayoutOptions]
  }
  @scala.inline
  def CustomArchiveLayoutOptions(stylesheet: String, `type`: custom): ArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveLayoutOptions]
  }
}

