package typingsJapgolly.emojiMart.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.emojiMart.categoryMod.Props
import typingsJapgolly.emojiMart.categoryMod.default
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.sharedPropsMod.CategoryName
import typingsJapgolly.emojiMart.sharedPropsMod.EmojiProps
import typingsJapgolly.emojiMart.sharedPropsMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Category {
  def apply(
    emojiProps: EmojiProps,
    i18n: I18n,
    id: CategoryName,
    name: String,
    native: Boolean,
    perLine: Double,
    emojis: js.Array[String | EmojiData] = null,
    hasStickyPosition: js.UndefOr[Boolean] = js.undefined,
    recent: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(emojiProps = emojiProps.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], perLine = perLine.asInstanceOf[js.Any])
  
      if (emojis != null) __obj.updateDynamic("emojis")(emojis.asInstanceOf[js.Any])
    if (!js.isUndefined(hasStickyPosition)) __obj.updateDynamic("hasStickyPosition")(hasStickyPosition.asInstanceOf[js.Any])
    if (recent != null) __obj.updateDynamic("recent")(recent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.emojiMart.categoryMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.emojiMart.categoryMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.emojiMart.categoryMod.Props])(children: _*)
  }
  @JSImport("emoji-mart/dist-es/components/category", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

