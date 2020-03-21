package typingsJapgolly.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistListResponse extends js.Object {
  var data: js.UndefOr[PlaylistListData] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object PlaylistListResponse {
  @scala.inline
  def apply(data: PlaylistListData = null, kind: String = null): PlaylistListResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistListResponse]
  }
}

