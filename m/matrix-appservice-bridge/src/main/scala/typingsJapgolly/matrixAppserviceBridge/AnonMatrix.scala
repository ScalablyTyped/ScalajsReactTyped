package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.matrixAppserviceBridge.mod.MatrixUser
import typingsJapgolly.matrixAppserviceBridge.mod.RemoteUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatrix extends js.Object {
  var matrix: MatrixUser
  var remote: Null | RemoteUser
  var remotes: js.Array[RemoteUser]
}

object AnonMatrix {
  @scala.inline
  def apply(matrix: MatrixUser, remotes: js.Array[RemoteUser], remote: RemoteUser = null): AnonMatrix = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatrix]
  }
}

