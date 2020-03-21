package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.matrixAppserviceBridge.mod.MatrixRoom
import typingsJapgolly.matrixAppserviceBridge.mod.RemoteRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemotes extends js.Object {
  var matrix: MatrixRoom
  var remote: Null | RemoteRoom
  var remotes: js.Array[RemoteRoom]
}

object AnonRemotes {
  @scala.inline
  def apply(matrix: MatrixRoom, remotes: js.Array[RemoteRoom], remote: RemoteRoom = null): AnonRemotes = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemotes]
  }
}

