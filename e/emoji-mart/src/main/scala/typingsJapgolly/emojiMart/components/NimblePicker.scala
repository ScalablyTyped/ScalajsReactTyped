package typingsJapgolly.emojiMart.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.emojiMart.dataMod.Data
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.CustomEmoji
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsJapgolly.emojiMart.nimblePickerMod.NimblePickerProps
import typingsJapgolly.emojiMart.nimblePickerMod.default
import typingsJapgolly.emojiMart.sharedPropsMod.CategoryName
import typingsJapgolly.emojiMart.sharedPropsMod.CustomIcons
import typingsJapgolly.emojiMart.sharedPropsMod.EmojiSet
import typingsJapgolly.emojiMart.sharedPropsMod.EmojiSheetSize
import typingsJapgolly.emojiMart.sharedPropsMod.PartialI18n
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NimblePicker {
  def apply(
    data: Data,
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
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NimblePickerProps, default, Unit, NimblePickerProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.emojiMart.nimblePickerMod.NimblePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.emojiMart.nimblePickerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.emojiMart.nimblePickerMod.NimblePickerProps])(children: _*)
  }
  @JSImport("emoji-mart/dist-es/components/picker/nimble-picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

