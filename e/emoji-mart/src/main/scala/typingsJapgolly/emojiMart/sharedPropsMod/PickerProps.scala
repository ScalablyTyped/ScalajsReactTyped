package typingsJapgolly.emojiMart.sharedPropsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.CustomEmoji
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  /** NOTE: custom emoji are copied into a singleton object on every new mount */
  var custom: js.UndefOr[js.Array[CustomEmoji]] = js.undefined
  var darkMode: js.UndefOr[Boolean] = js.undefined
  var defaultSkin: js.UndefOr[EmojiSkin] = js.undefined
  var emoji: js.UndefOr[String] = js.undefined
  var emojiSize: js.UndefOr[Double] = js.undefined
  var emojiTooltip: js.UndefOr[Boolean] = js.undefined
  var emojisToShowFilter: js.UndefOr[js.Function1[/* emoji */ EmojiData, Boolean]] = js.undefined
  var exclude: js.UndefOr[js.Array[CategoryName]] = js.undefined
  var i18n: js.UndefOr[PartialI18n] = js.undefined
  var icons: js.UndefOr[CustomIcons] = js.undefined
  var include: js.UndefOr[js.Array[CategoryName]] = js.undefined
  var native: js.UndefOr[Boolean] = js.undefined
  var notFound: js.UndefOr[js.Function0[Component[js.Object, js.Object]]] = js.undefined
  var notFoundEmoji: js.UndefOr[String] = js.undefined
  /** NOTE: default is not preventable */
  var onClick: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement], Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* emoji */ EmojiData, Unit]] = js.undefined
  var onSkinChange: js.UndefOr[js.Function1[/* skin */ EmojiSkin, Unit]] = js.undefined
  var perLine: js.UndefOr[Double] = js.undefined
  var recent: js.UndefOr[js.Array[String]] = js.undefined
  var set: js.UndefOr[EmojiSet] = js.undefined
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.undefined
  var showPreview: js.UndefOr[Boolean] = js.undefined
  var showSkinTones: js.UndefOr[Boolean] = js.undefined
  var skin: js.UndefOr[EmojiSkin] = js.undefined
  var skinEmoji: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backgroundImageFn: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => CallbackTo[String] = null,
    color: String = null,
    custom: js.Array[CustomEmoji] = null,
    darkMode: js.UndefOr[Boolean] = js.undefined,
    defaultSkin: EmojiSkin = null,
    emoji: String = null,
    emojiSize: Int | Double = null,
    emojiTooltip: js.UndefOr[Boolean] = js.undefined,
    emojisToShowFilter: /* emoji */ EmojiData => CallbackTo[Boolean] = null,
    exclude: js.Array[CategoryName] = null,
    i18n: PartialI18n = null,
    icons: CustomIcons = null,
    include: js.Array[CategoryName] = null,
    native: js.UndefOr[Boolean] = js.undefined,
    notFound: js.UndefOr[CallbackTo[Component[js.Object, js.Object]]] = js.undefined,
    notFoundEmoji: String = null,
    onClick: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onSelect: /* emoji */ EmojiData => Callback = null,
    onSkinChange: /* skin */ EmojiSkin => Callback = null,
    perLine: Int | Double = null,
    recent: js.Array[String] = null,
    set: EmojiSet = null,
    sheetSize: EmojiSheetSize = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    showSkinTones: js.UndefOr[Boolean] = js.undefined,
    skin: EmojiSkin = null,
    skinEmoji: String = null,
    style: CSSProperties = null,
    title: String = null
  ): PickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(js.Any.fromFunction2((t0: /* set */ typingsJapgolly.emojiMart.sharedPropsMod.EmojiSet, t1: /* sheetSize */ typingsJapgolly.emojiMart.sharedPropsMod.EmojiSheetSize) => backgroundImageFn(t0, t1).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(darkMode)) __obj.updateDynamic("darkMode")(darkMode.asInstanceOf[js.Any])
    if (defaultSkin != null) __obj.updateDynamic("defaultSkin")(defaultSkin.asInstanceOf[js.Any])
    if (emoji != null) __obj.updateDynamic("emoji")(emoji.asInstanceOf[js.Any])
    if (emojiSize != null) __obj.updateDynamic("emojiSize")(emojiSize.asInstanceOf[js.Any])
    if (!js.isUndefined(emojiTooltip)) __obj.updateDynamic("emojiTooltip")(emojiTooltip.asInstanceOf[js.Any])
    if (emojisToShowFilter != null) __obj.updateDynamic("emojisToShowFilter")(js.Any.fromFunction1((t0: /* emoji */ typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData) => emojisToShowFilter(t0).runNow()))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    notFound.foreach(p => __obj.updateDynamic("notFound")(p.toJsFn))
    if (notFoundEmoji != null) __obj.updateDynamic("notFoundEmoji")(notFoundEmoji.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* emoji */ typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData, t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* emoji */ typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData) => onSelect(t0).runNow()))
    if (onSkinChange != null) __obj.updateDynamic("onSkinChange")(js.Any.fromFunction1((t0: /* skin */ typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiSkin) => onSkinChange(t0).runNow()))
    if (perLine != null) __obj.updateDynamic("perLine")(perLine.asInstanceOf[js.Any])
    if (recent != null) __obj.updateDynamic("recent")(recent.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkinTones)) __obj.updateDynamic("showSkinTones")(showSkinTones.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (skinEmoji != null) __obj.updateDynamic("skinEmoji")(skinEmoji.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps]
  }
}

