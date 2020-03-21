package typingsJapgolly.winrtUwp.Windows.System

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the options used to launch the default app for URI on a remote device. */
@JSGlobal("Windows.System.RemoteLauncherOptions")
@js.native
/** Creates an instance of the RemoteLauncherOptions class. */
class RemoteLauncherOptions () extends js.Object {
  /** Specifies the URI of the web site to view if the app to handle the URI can't be launched on the remote device. */
  var FallbackUri: Uri = js.native
  /** A list of package family names that should be used to launch the URI on the remote device. The first one in the list should be the preferred application to launch on the remote system (device). */
  var PreferredAppIds: IIterable[String] = js.native
}

