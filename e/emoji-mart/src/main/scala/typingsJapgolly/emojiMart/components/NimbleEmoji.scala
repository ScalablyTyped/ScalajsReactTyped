package typingsJapgolly.emojiMart.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.emojiMart.distEsComponentsEmojiNimbleEmojiMod.NimbleEmojiProps
import typingsJapgolly.emojiMart.distEsUtilsDataMod.Data
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiSkin
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.EmojiSet
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.EmojiSheetSize
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NimbleEmoji {
  
  inline def apply(data: Data, emoji: String | EmojiData, size: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NimbleEmojiProps]))
  }
  
  @JSImport("emoji-mart/dist-es/components/emoji/nimble-emoji", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): this.type = set("backgroundImageFn", js.Any.fromFunction2(value))
    
    inline def fallback(value: (/* emoji */ EmojiData, NimbleEmojiProps) => (Component[js.Object, js.Object]) | Element): this.type = set("fallback", js.Any.fromFunction2(value))
    
    inline def forceSize(value: Boolean): this.type = set("forceSize", value.asInstanceOf[js.Any])
    
    inline def html(value: Boolean): this.type = set("html", value.asInstanceOf[js.Any])
    
    inline def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* emoji */ EmojiData, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onLeave(value: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onLeave", js.Any.fromFunction2((t0: /* emoji */ EmojiData, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onOver(value: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onOver", js.Any.fromFunction2((t0: /* emoji */ EmojiData, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def set(value: EmojiSet): this.type = set("set", value.asInstanceOf[js.Any])
    
    inline def sheetColumns(value: Double): this.type = set("sheetColumns", value.asInstanceOf[js.Any])
    
    inline def sheetRows(value: Double): this.type = set("sheetRows", value.asInstanceOf[js.Any])
    
    inline def sheetSize(value: EmojiSheetSize): this.type = set("sheetSize", value.asInstanceOf[js.Any])
    
    inline def skin(value: EmojiSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: Boolean): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NimbleEmojiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
