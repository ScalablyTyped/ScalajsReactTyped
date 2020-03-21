package typingsJapgolly.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An asset, containing image, text, and link data, provided by the background app service for display on the Cortana canvas. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile")
@js.native
/** Creates an instance of the VoiceCommandContentTile class. */
class VoiceCommandContentTile () extends js.Object {
  /** Gets or sets supplementary information the background app service can associate with the content tile. This information is not used by Cortana. */
  var appContext: js.Any = js.native
  /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
  var appLaunchArgument: String = js.native
  /** Gets or sets the layout template used to display the content tile on the Cortana canvas. */
  var contentTileType: VoiceCommandContentTileType = js.native
  /** Gets or sets an image the background app service can associate with the content tile. */
  var image: IStorageFile = js.native
  /** Gets or sets the first line of text the background app service can associate with the content tile. */
  var textLine1: String = js.native
  /** Gets or sets the second line of text the background app service can associate with the content tile. */
  var textLine2: String = js.native
  /** Gets or sets the third line of text the background app service can associate with the content tile. */
  var textLine3: String = js.native
  /** Gets or sets the title the background app service can associate with the content tile. */
  var title: String = js.native
}

