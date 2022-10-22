package typingsJapgolly.emojiMart

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.emojiMart.distEsUtilsDataMod.Data
import typingsJapgolly.emojiMart.emojiMartStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsUtilsEmojiIndexNimbleEmojiIndexMod {
  
  @JSImport("emoji-mart/dist-es/utils/emoji-index/nimble-emoji-index", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NimbleEmojiIndex {
    def this(data: Data) = this()
  }
  
  trait BaseEmoji
    extends StObject
       with EmojiData {
    
    var colons: String
    
    /** Reverse mapping to keyof emoticons */
    var emoticons: js.Array[String]
    
    var id: String
    
    var name: String
    
    var native: String
    
    var skin: EmojiSkin | Null
    
    var unified: String
  }
  object BaseEmoji {
    
    inline def apply(
      colons: String,
      emoticons: js.Array[String],
      id: String,
      name: String,
      native: String,
      unified: String
    ): BaseEmoji = {
      val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any], skin = null)
      __obj.asInstanceOf[BaseEmoji]
    }
    
    extension [Self <: BaseEmoji](x: Self) {
      
      inline def setColons(value: String): Self = StObject.set(x, "colons", value.asInstanceOf[js.Any])
      
      inline def setEmoticons(value: js.Array[String]): Self = StObject.set(x, "emoticons", value.asInstanceOf[js.Any])
      
      inline def setEmoticonsVarargs(value: String*): Self = StObject.set(x, "emoticons", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNative(value: String): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setSkin(value: EmojiSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinNull: Self = StObject.set(x, "skin", null)
      
      inline def setUnified(value: String): Self = StObject.set(x, "unified", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomEmoji
    extends StObject
       with EmojiData {
    
    // colons is overridden by :id:
    var colons: js.UndefOr[String] = js.undefined
    
    var emoticons: js.UndefOr[js.Array[String]] = js.undefined
    
    // id is overridden by short_names[0]
    var id: js.UndefOr[String] = js.undefined
    
    var imageUrl: String
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    /** Must contain at least one name. The first name is used as the unique id. */
    var short_names: js.Array[String]
  }
  object CustomEmoji {
    
    inline def apply(imageUrl: String, name: String, short_names: js.Array[String]): CustomEmoji = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEmoji]
    }
    
    extension [Self <: CustomEmoji](x: Self) {
      
      inline def setColons(value: String): Self = StObject.set(x, "colons", value.asInstanceOf[js.Any])
      
      inline def setColonsUndefined: Self = StObject.set(x, "colons", js.undefined)
      
      inline def setEmoticons(value: js.Array[String]): Self = StObject.set(x, "emoticons", value.asInstanceOf[js.Any])
      
      inline def setEmoticonsUndefined: Self = StObject.set(x, "emoticons", js.undefined)
      
      inline def setEmoticonsVarargs(value: String*): Self = StObject.set(x, "emoticons", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShort_names(value: js.Array[String]): Self = StObject.set(x, "short_names", value.asInstanceOf[js.Any])
      
      inline def setShort_namesVarargs(value: String*): Self = StObject.set(x, "short_names", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.BaseEmoji
    - typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.CustomEmoji
  */
  trait EmojiData
    extends StObject
       with EmojiEntry
  object EmojiData {
    
    inline def BaseEmoji(
      colons: String,
      emoticons: js.Array[String],
      id: String,
      name: String,
      native: String,
      unified: String
    ): typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.BaseEmoji = {
      val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any], skin = null)
      __obj.asInstanceOf[typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.BaseEmoji]
    }
    
    inline def CustomEmoji(imageUrl: String, name: String, short_names: js.Array[String]): typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.CustomEmoji = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.CustomEmoji]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiData
    - typingsJapgolly.emojiMart.anon.variantinEmojiSkinEmojiDa
  */
  trait EmojiEntry extends StObject
  object EmojiEntry {
    
    inline def BaseEmoji(
      colons: String,
      emoticons: js.Array[String],
      id: String,
      name: String,
      native: String,
      unified: String
    ): typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.BaseEmoji = {
      val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any], skin = null)
      __obj.asInstanceOf[typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.BaseEmoji]
    }
    
    inline def CustomEmoji(imageUrl: String, name: String, short_names: js.Array[String]): typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.CustomEmoji = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.CustomEmoji]
    }
    
    inline def variantinEmojiSkinEmojiDa(`1`: EmojiData, `2`: EmojiData, `3`: EmojiData, `4`: EmojiData, `5`: EmojiData, `6`: EmojiData): typingsJapgolly.emojiMart.anon.variantinEmojiSkinEmojiDa = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.emojiMart.anon.variantinEmojiSkinEmojiDa]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emojiMart.emojiMartInts.`1`
    - typingsJapgolly.emojiMart.emojiMartInts.`2`
    - typingsJapgolly.emojiMart.emojiMartInts.`3`
    - typingsJapgolly.emojiMart.emojiMartInts.`4`
    - typingsJapgolly.emojiMart.emojiMartInts.`5`
    - typingsJapgolly.emojiMart.emojiMartInts.`6`
  */
  trait EmojiSkin extends StObject
  object EmojiSkin {
    
    inline def `1`: typingsJapgolly.emojiMart.emojiMartInts.`1` = 1.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`1`]
    
    inline def `2`: typingsJapgolly.emojiMart.emojiMartInts.`2` = 2.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`2`]
    
    inline def `3`: typingsJapgolly.emojiMart.emojiMartInts.`3` = 3.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`3`]
    
    inline def `4`: typingsJapgolly.emojiMart.emojiMartInts.`4` = 4.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`4`]
    
    inline def `5`: typingsJapgolly.emojiMart.emojiMartInts.`5` = 5.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`5`]
    
    inline def `6`: typingsJapgolly.emojiMart.emojiMartInts.`6` = 6.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`6`]
  }
  
  @js.native
  trait NimbleEmojiIndex extends StObject {
    
    var emojis: StringDictionary[EmojiData] = js.native
    
    /** Mapping of string to keyof emojis */
    var emoticons: StringDictionary[String] = js.native
    
    def search(query: String): js.Array[EmojiData] | Null = js.native
    def search(query: _empty): Null = js.native
  }
}
