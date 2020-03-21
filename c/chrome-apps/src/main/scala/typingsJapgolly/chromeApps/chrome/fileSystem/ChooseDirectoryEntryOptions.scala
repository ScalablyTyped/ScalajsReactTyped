package typingsJapgolly.chromeApps.chrome.fileSystem

import typingsJapgolly.chromeApps.chromeAppsStrings.openDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ trait ChooseDirectoryEntryOptions extends ChooseEntryOptionsBase {
  var `type`: openDirectory
}

object ChooseDirectoryEntryOptions {
  @scala.inline
  def apply(
    `type`: openDirectory,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseDirectoryEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseDirectoryEntryOptions]
  }
}

