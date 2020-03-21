package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphMarker extends js.Object {
  var bullet: js.UndefOr[Bullet] = js.undefined
  var style: js.UndefOr[ParagraphStyle] = js.undefined
}

object ParagraphMarker {
  @scala.inline
  def apply(bullet: Bullet = null, style: ParagraphStyle = null): ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphMarker]
  }
}

