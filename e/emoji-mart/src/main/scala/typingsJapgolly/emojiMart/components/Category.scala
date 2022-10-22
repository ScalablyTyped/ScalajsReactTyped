package typingsJapgolly.emojiMart.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.emojiMart.distEsComponentsCategoryMod.Props
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.CategoryName
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.EmojiProps
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.I18n
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Category {
  
  inline def apply(
    emojiProps: EmojiProps,
    i18n: I18n,
    id: CategoryName,
    name: String,
    native: Boolean,
    perLine: Double
  ): Builder = {
    val __props = js.Dynamic.literal(emojiProps = emojiProps.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], perLine = perLine.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("emoji-mart/dist-es/components", "Category")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.emojiMart.distEsComponentsMod.Category] {
    
    inline def emojis(value: js.Array[String | EmojiData]): this.type = set("emojis", value.asInstanceOf[js.Any])
    
    inline def emojisVarargs(value: (String | EmojiData)*): this.type = set("emojis", js.Array(value*))
    
    inline def hasStickyPosition(value: Boolean): this.type = set("hasStickyPosition", value.asInstanceOf[js.Any])
    
    inline def recent(value: js.Array[String]): this.type = set("recent", value.asInstanceOf[js.Any])
    
    inline def recentVarargs(value: String*): this.type = set("recent", js.Array(value*))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
