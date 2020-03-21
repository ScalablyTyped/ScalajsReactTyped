package typingsJapgolly.wegameApi

import typingsJapgolly.wegameApi.wx.types.ButtonStyle
import typingsJapgolly.wegameApi.wx.types.ButtonType
import typingsJapgolly.wegameApi.wx.types.GameClubButtonIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  /**
    * 游戏圈按钮的图标，仅当 object.type 参数为 image 时有效
    */
  var icon: js.UndefOr[GameClubButtonIcon] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[ButtonStyle] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: ButtonType
}

object AnonIcon {
  @scala.inline
  def apply(
    `type`: ButtonType,
    icon: GameClubButtonIcon = null,
    image: String = null,
    style: ButtonStyle = null,
    text: String = null
  ): AnonIcon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

