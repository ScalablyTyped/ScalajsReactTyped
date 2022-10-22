package typingsJapgolly.emojiMart.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.CustomEmoji
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiSkin
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.CategoryName
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.CustomIcons
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.EmojiSet
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.EmojiSheetSize
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.PartialI18n
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.PickerProps
import typingsJapgolly.emojiMart.emojiMartStrings.auto
import typingsJapgolly.emojiMart.emojiMartStrings.dark
import typingsJapgolly.emojiMart.emojiMartStrings.light
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picker {
  
  @JSImport("emoji-mart/dist-es/components", "Picker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.emojiMart.distEsComponentsMod.Picker] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def backgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): this.type = set("backgroundImageFn", js.Any.fromFunction2(value))
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def custom(value: js.Array[CustomEmoji]): this.type = set("custom", value.asInstanceOf[js.Any])
    
    inline def customVarargs(value: CustomEmoji*): this.type = set("custom", js.Array(value*))
    
    inline def defaultSkin(value: EmojiSkin): this.type = set("defaultSkin", value.asInstanceOf[js.Any])
    
    inline def emoji(value: String): this.type = set("emoji", value.asInstanceOf[js.Any])
    
    inline def emojiSize(value: Double): this.type = set("emojiSize", value.asInstanceOf[js.Any])
    
    inline def emojiTooltip(value: Boolean): this.type = set("emojiTooltip", value.asInstanceOf[js.Any])
    
    inline def emojisToShowFilter(value: /* emoji */ EmojiData => Boolean): this.type = set("emojisToShowFilter", js.Any.fromFunction1(value))
    
    inline def enableFrequentEmojiSort(value: Boolean): this.type = set("enableFrequentEmojiSort", value.asInstanceOf[js.Any])
    
    inline def exclude(value: js.Array[CategoryName]): this.type = set("exclude", value.asInstanceOf[js.Any])
    
    inline def excludeVarargs(value: CategoryName*): this.type = set("exclude", js.Array(value*))
    
    inline def i18n(value: PartialI18n): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    inline def icons(value: CustomIcons): this.type = set("icons", value.asInstanceOf[js.Any])
    
    inline def include(value: js.Array[CategoryName]): this.type = set("include", value.asInstanceOf[js.Any])
    
    inline def includeVarargs(value: CategoryName*): this.type = set("include", js.Array(value*))
    
    inline def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    
    inline def notFound(value: CallbackTo[Component[js.Object, js.Object]]): this.type = set("notFound", value.toJsFn)
    
    inline def notFoundEmoji(value: String): this.type = set("notFoundEmoji", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* emoji */ EmojiData, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onSelect(value: /* emoji */ EmojiData => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* emoji */ EmojiData) => value(t0).runNow()))
    
    inline def onSkinChange(value: /* skin */ EmojiSkin => Callback): this.type = set("onSkinChange", js.Any.fromFunction1((t0: /* skin */ EmojiSkin) => value(t0).runNow()))
    
    inline def perLine(value: Double): this.type = set("perLine", value.asInstanceOf[js.Any])
    
    inline def recent(value: js.Array[String]): this.type = set("recent", value.asInstanceOf[js.Any])
    
    inline def recentVarargs(value: String*): this.type = set("recent", js.Array(value*))
    
    inline def set(value: EmojiSet): this.type = set("set", value.asInstanceOf[js.Any])
    
    inline def sheetSize(value: EmojiSheetSize): this.type = set("sheetSize", value.asInstanceOf[js.Any])
    
    inline def showPreview(value: Boolean): this.type = set("showPreview", value.asInstanceOf[js.Any])
    
    inline def showSkinTones(value: Boolean): this.type = set("showSkinTones", value.asInstanceOf[js.Any])
    
    inline def skin(value: EmojiSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def skinEmoji(value: String): this.type = set("skinEmoji", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def theme(value: auto | light | dark): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def useButton(value: Boolean): this.type = set("useButton", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Picker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
