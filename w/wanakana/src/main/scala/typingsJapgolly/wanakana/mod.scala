package typingsJapgolly.wanakana

import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.std.Record
import typingsJapgolly.wanakana.anon.PassKanji
import typingsJapgolly.wanakana.wanakanaStrings.hepburn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wanakana", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wanakana", "ROMANIZATIONS")
  @js.native
  val ROMANIZATIONS: Record[String, String] = js.native
  
  @JSImport("wanakana", "TO_KANA_METHODS")
  @js.native
  val TO_KANA_METHODS: Record[String, String] = js.native
  
  @JSImport("wanakana", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  inline def bind(el: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def bind(el: HTMLInputElement, options: WanakanaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bind(el: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def bind(el: HTMLTextAreaElement, options: WanakanaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isHiragana(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHiragana")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isJapanese(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJapanese")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKana(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKana")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKanji(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKanji")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKatakana(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKatakana")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMixed(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMixed")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMixed(input: String, options: PassKanji): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMixed")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRomaji(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRomaji")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def stripOkurigana(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripOkurigana")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stripOkurigana(input: String, options: StripOkuriganaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stripOkurigana")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toHiragana(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiragana")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHiragana(input: String, options: WanakanaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHiragana")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toKana(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKana")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toKana(input: String, options: WanakanaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toKana")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toKatakana(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakana")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toKatakana(input: String, options: WanakanaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toKatakana")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toRomaji(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRomaji")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toRomaji(input: String, options: WanakanaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRomaji")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tokenize(input: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def tokenize(input: String, options: TokenizeOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def unbind(el: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unbind(el: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wanakana.wanakanaBooleans.`true`
    - typingsJapgolly.wanakana.wanakanaBooleans.`false`
    - typingsJapgolly.wanakana.wanakanaStrings.toHiragana
    - typingsJapgolly.wanakana.wanakanaStrings.toKatakana
  */
  trait IMEModes extends StObject
  object IMEModes {
    
    inline def `false`: typingsJapgolly.wanakana.wanakanaBooleans.`false` = false.asInstanceOf[typingsJapgolly.wanakana.wanakanaBooleans.`false`]
    
    inline def toHiragana: typingsJapgolly.wanakana.wanakanaStrings.toHiragana = "toHiragana".asInstanceOf[typingsJapgolly.wanakana.wanakanaStrings.toHiragana]
    
    inline def toKatakana: typingsJapgolly.wanakana.wanakanaStrings.toKatakana = "toKatakana".asInstanceOf[typingsJapgolly.wanakana.wanakanaStrings.toKatakana]
    
    inline def `true`: typingsJapgolly.wanakana.wanakanaBooleans.`true` = true.asInstanceOf[typingsJapgolly.wanakana.wanakanaBooleans.`true`]
  }
  
  trait StripOkuriganaOptions extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var matchKanji: js.UndefOr[String] = js.undefined
  }
  object StripOkuriganaOptions {
    
    inline def apply(): StripOkuriganaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripOkuriganaOptions]
    }
    
    extension [Self <: StripOkuriganaOptions](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setMatchKanji(value: String): Self = StObject.set(x, "matchKanji", value.asInstanceOf[js.Any])
      
      inline def setMatchKanjiUndefined: Self = StObject.set(x, "matchKanji", js.undefined)
    }
  }
  
  trait TokenizeOptions extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var detailed: js.UndefOr[Boolean] = js.undefined
  }
  object TokenizeOptions {
    
    inline def apply(): TokenizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeOptions]
    }
    
    extension [Self <: TokenizeOptions](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
      
      inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    }
  }
  
  trait WanakanaOptions extends StObject {
    
    var IMEMode: js.UndefOr[IMEModes] = js.undefined
    
    var customKanaMapping: js.UndefOr[Record[String, String]] = js.undefined
    
    var customRomajiMapping: js.UndefOr[Record[String, String]] = js.undefined
    
    var passRomaji: js.UndefOr[Boolean] = js.undefined
    
    var romanization: js.UndefOr[hepburn] = js.undefined
    
    var upcaseKatakana: js.UndefOr[Boolean] = js.undefined
    
    var useObsoleteKana: js.UndefOr[Boolean] = js.undefined
  }
  object WanakanaOptions {
    
    inline def apply(): WanakanaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WanakanaOptions]
    }
    
    extension [Self <: WanakanaOptions](x: Self) {
      
      inline def setCustomKanaMapping(value: Record[String, String]): Self = StObject.set(x, "customKanaMapping", value.asInstanceOf[js.Any])
      
      inline def setCustomKanaMappingUndefined: Self = StObject.set(x, "customKanaMapping", js.undefined)
      
      inline def setCustomRomajiMapping(value: Record[String, String]): Self = StObject.set(x, "customRomajiMapping", value.asInstanceOf[js.Any])
      
      inline def setCustomRomajiMappingUndefined: Self = StObject.set(x, "customRomajiMapping", js.undefined)
      
      inline def setIMEMode(value: IMEModes): Self = StObject.set(x, "IMEMode", value.asInstanceOf[js.Any])
      
      inline def setIMEModeUndefined: Self = StObject.set(x, "IMEMode", js.undefined)
      
      inline def setPassRomaji(value: Boolean): Self = StObject.set(x, "passRomaji", value.asInstanceOf[js.Any])
      
      inline def setPassRomajiUndefined: Self = StObject.set(x, "passRomaji", js.undefined)
      
      inline def setRomanization(value: hepburn): Self = StObject.set(x, "romanization", value.asInstanceOf[js.Any])
      
      inline def setRomanizationUndefined: Self = StObject.set(x, "romanization", js.undefined)
      
      inline def setUpcaseKatakana(value: Boolean): Self = StObject.set(x, "upcaseKatakana", value.asInstanceOf[js.Any])
      
      inline def setUpcaseKatakanaUndefined: Self = StObject.set(x, "upcaseKatakana", js.undefined)
      
      inline def setUseObsoleteKana(value: Boolean): Self = StObject.set(x, "useObsoleteKana", value.asInstanceOf[js.Any])
      
      inline def setUseObsoleteKanaUndefined: Self = StObject.set(x, "useObsoleteKana", js.undefined)
    }
  }
}
