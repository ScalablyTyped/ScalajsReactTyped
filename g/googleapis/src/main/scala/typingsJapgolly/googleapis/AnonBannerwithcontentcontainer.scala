package typingsJapgolly.googleapis

import typingsJapgolly.googleapis.booksV1Mod.booksV1.SchemaVolume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBannerwithcontentcontainer extends js.Object {
  var banner_with_content_container: js.UndefOr[AnonFillColorArgb] = js.native
  var subTitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var totalVolumes: js.UndefOr[Double] = js.native
  var uid: js.UndefOr[String] = js.native
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
}

object AnonBannerwithcontentcontainer {
  @scala.inline
  def apply(
    banner_with_content_container: AnonFillColorArgb = null,
    subTitle: String = null,
    title: String = null,
    totalVolumes: Int | Double = null,
    uid: String = null,
    volumes: js.Array[SchemaVolume] = null
  ): AnonBannerwithcontentcontainer = {
    val __obj = js.Dynamic.literal()
    if (banner_with_content_container != null) __obj.updateDynamic("banner_with_content_container")(banner_with_content_container.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (totalVolumes != null) __obj.updateDynamic("totalVolumes")(totalVolumes.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBannerwithcontentcontainer]
  }
}

