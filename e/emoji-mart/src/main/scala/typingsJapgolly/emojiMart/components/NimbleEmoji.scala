package typingsJapgolly.emojiMart.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.emojiMart.dataMod.Data
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsJapgolly.emojiMart.nimbleEmojiMod.NimbleEmojiProps
import typingsJapgolly.emojiMart.sharedPropsMod.EmojiSet
import typingsJapgolly.emojiMart.sharedPropsMod.EmojiSheetSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NimbleEmoji {
  def apply(
    data: Data,
    emoji: String | EmojiData,
    size: Double,
    backgroundImageFn: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => CallbackTo[String] = null,
    fallback: (/* emoji */ EmojiData, NimbleEmojiProps) => CallbackTo[Component[js.Object, js.Object]] = null,
    forceSize: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    native: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onLeave: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onOver: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    set: EmojiSet = null,
    sheetColumns: Int | Double = null,
    sheetRows: Int | Double = null,
    sheetSize: EmojiSheetSize = null,
    skin: EmojiSkin = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    NimbleEmojiProps, 
    MountedWithRawType[NimbleEmojiProps, js.Object, RawMounted[NimbleEmojiProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
      if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(js.Any.fromFunction2((t0: /* set */ typingsJapgolly.emojiMart.sharedPropsMod.EmojiSet, t1: /* sheetSize */ typingsJapgolly.emojiMart.sharedPropsMod.EmojiSheetSize) => backgroundImageFn(t0, t1).runNow()))
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction2((t0: /* emoji */ typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData, t1: typingsJapgolly.emojiMart.nimbleEmojiMod.NimbleEmojiProps) => fallback(t0, t1).runNow()))
    if (!js.isUndefined(forceSize)) __obj.updateDynamic("forceSize")(forceSize.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* emoji */ typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData, t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0, t1).runNow()))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction2((t0: /* emoji */ typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData, t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLeave(t0, t1).runNow()))
    if (onOver != null) __obj.updateDynamic("onOver")(js.Any.fromFunction2((t0: /* emoji */ typingsJapgolly.emojiMart.nimbleEmojiIndexMod.EmojiData, t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onOver(t0, t1).runNow()))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (sheetColumns != null) __obj.updateDynamic("sheetColumns")(sheetColumns.asInstanceOf[js.Any])
    if (sheetRows != null) __obj.updateDynamic("sheetRows")(sheetRows.asInstanceOf[js.Any])
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.emojiMart.nimbleEmojiMod.NimbleEmojiProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.emojiMart.nimbleEmojiMod.NimbleEmojiProps])(children: _*)
  }
  @JSImport("emoji-mart/dist-es/components/emoji/nimble-emoji", "default")
  @js.native
  object componentImport extends js.Object
  
}

