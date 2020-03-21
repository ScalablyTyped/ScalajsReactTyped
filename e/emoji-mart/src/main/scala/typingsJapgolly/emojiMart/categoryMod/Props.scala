package typingsJapgolly.emojiMart.categoryMod

import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.sharedPropsMod.CategoryName
import typingsJapgolly.emojiMart.sharedPropsMod.EmojiProps
import typingsJapgolly.emojiMart.sharedPropsMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var emojiProps: EmojiProps
  var emojis: js.UndefOr[js.Array[String | EmojiData]] = js.undefined
  var hasStickyPosition: js.UndefOr[Boolean] = js.undefined
  var i18n: I18n
  var id: CategoryName
  var name: String
  var native: Boolean
  var perLine: Double
  var recent: js.UndefOr[js.Array[String]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    emojiProps: EmojiProps,
    i18n: I18n,
    id: CategoryName,
    name: String,
    native: Boolean,
    perLine: Double,
    emojis: js.Array[String | EmojiData] = null,
    hasStickyPosition: js.UndefOr[Boolean] = js.undefined,
    recent: js.Array[String] = null
  ): Props = {
    val __obj = js.Dynamic.literal(emojiProps = emojiProps.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], perLine = perLine.asInstanceOf[js.Any])
    if (emojis != null) __obj.updateDynamic("emojis")(emojis.asInstanceOf[js.Any])
    if (!js.isUndefined(hasStickyPosition)) __obj.updateDynamic("hasStickyPosition")(hasStickyPosition.asInstanceOf[js.Any])
    if (recent != null) __obj.updateDynamic("recent")(recent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

