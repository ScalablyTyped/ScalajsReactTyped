package typingsJapgolly.romajiName

import typingsJapgolly.romajiName.romajiNameBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("romaji-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseName(name: String): ParseResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseName")(name.asInstanceOf[js.Any]).asInstanceOf[ParseResults]
  inline def parseName(name: String, options: ParseOptions): ParseResults = (^.asInstanceOf[js.Dynamic].applyDynamic("parseName")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResults]
  inline def parseName(results: ParseResults): ParseResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseName")(results.asInstanceOf[js.Any]).asInstanceOf[ParseResults]
  
  @JSImport("romaji-name", "settingsFile")
  @js.native
  def settingsFile: String = js.native
  inline def settingsFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settingsFile")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.romajiName.romajiNameStrings.ja
    - typingsJapgolly.romajiName.romajiNameStrings._empty
  */
  trait Locale extends StObject
  object Locale {
    
    inline def _empty: typingsJapgolly.romajiName.romajiNameStrings._empty = "".asInstanceOf[typingsJapgolly.romajiName.romajiNameStrings._empty]
    
    inline def ja: typingsJapgolly.romajiName.romajiNameStrings.ja = "ja".asInstanceOf[typingsJapgolly.romajiName.romajiNameStrings.ja]
  }
  
  trait ParseOptions extends StObject {
    
    /**
      * Names that don't have a "ja" locale should be flipped ("Smith John" becomes "John Smith").
      */
    var flipNonJa: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Assumes that the first name is always the given name.
      */
    var givenFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Removes anything that's wrapped in parentheses.
      * Normally this is left intact and any extra information is parsed from it.
      */
    var stripParens: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setFlipNonJa(value: Boolean): Self = StObject.set(x, "flipNonJa", value.asInstanceOf[js.Any])
      
      inline def setFlipNonJaUndefined: Self = StObject.set(x, "flipNonJa", js.undefined)
      
      inline def setGivenFirst(value: Boolean): Self = StObject.set(x, "givenFirst", value.asInstanceOf[js.Any])
      
      inline def setGivenFirstUndefined: Self = StObject.set(x, "givenFirst", js.undefined)
      
      inline def setStripParens(value: Boolean): Self = StObject.set(x, "stripParens", value.asInstanceOf[js.Any])
      
      inline def setStripParensUndefined: Self = StObject.set(x, "stripParens", js.undefined)
    }
  }
  
  trait ParseResults extends StObject {
    
    /**
      *  If the name includes some sort of "After" or "In the style of" or similar prefix then this will be true.
      */
    var after: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The full name, in ascii text, including the generation.
      * This is a proper ascii representation of the name (with long vowels converted from "ō" into "oo", for example).
      * Example: "Nakamura Gakuryoo II".
      */
    var ascii: js.UndefOr[String] = js.undefined
    
    /**
      * If the name includes a prefix like "Attributed to" then this will be true.
      */
    var attributed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A number representing the generation of the name. For example "John Smith II" would have a generation of 2.
      */
    var generation: js.UndefOr[Double] = js.undefined
    
    /**
      * A string of the Romaji form of the given name. (Will only exist if a Romaji form was originally provided.)
      */
    var `given`: js.UndefOr[String] = js.undefined
    
    /**
      * A string of the Kana form of the given name.
      * (Will only exist if a Romaji form was originally provided and if the locale is "ja".)
      */
    var given_kana: js.UndefOr[String] = js.undefined
    
    /**
      * A string of the Kanji form of the given name. (Will only exist if a Kanji form was originally provided.)
      */
    var given_kanji: js.UndefOr[String] = js.undefined
    
    /**
      * The full name, in kana, without the generation. For example: "なかむらがくりょう".
      */
    var kana: js.UndefOr[String] = js.undefined
    
    /**
      * The full name, in kanji, including the generation. For example: "戯画堂芦幸 2世".
      */
    var kanji: js.UndefOr[String] = js.undefined
    
    /**
      * A guess at the locale of the name. Only two values exist: "ja" and "".
      * Note that just because "ja" was returned it does not guarantee that the person is actually Japanese,
      * just that the name looks to be Japanese-like (for example: Some Chinese names also return "ja").
      */
    var locale: Locale
    
    /**
      * A string of the Romaji form of the middlename.
      */
    var middle: js.UndefOr[String] = js.undefined
    
    /**
      * The full name, in properly-stressed romaji, including the generation. For example: "Nakamura Gakuryō II".
      */
    var name: String
    
    /**
      * The original string that was passed in to parseName.
      */
    var original: String
    
    /**
      * The full name, in plain text, including the generation.
      * This is the same as the name property but with all stress formatting stripped from it.
      * This could be useful to use in the generation of a URL slug, or some such. It should never be displayed to an end-user as it will almost always be incorrect.
      * Example: "Nakamura Gakuryo II".
      */
    var plain: String
    
    /**
      * If the name includes a prefix like "School of", "Pupil of", or similar then this will be true.
      */
    var school: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object holding the settings that were passed in to the parseName method.
      */
    var settings: js.UndefOr[ParseOptions] = js.undefined
    
    /**
      * A string of the Romaji form of the surname.
      * (Will only exist if a Romaji form was originally provided.)
      */
    var surname: js.UndefOr[String] = js.undefined
    
    /**
      * A string of the Kana form of the surname.
      * (Will only exist if a Romaji form was originally provided and if the locale is "ja".)
      */
    var surname_kana: js.UndefOr[String] = js.undefined
    
    /**
      * A string of the Kanji form of the surname. (Will only exist if a Kanji form was originally provided.)
      */
    var surname_kanji: js.UndefOr[String] = js.undefined
    
    /**
      * If the name is a representation of an unknown individual (e.g. it's the string "Unknown", "Not known", or many of the other variations)
      * then this property will exist and be true.
      */
    var unknown: js.UndefOr[`true`] = js.undefined
  }
  object ParseResults {
    
    inline def apply(locale: Locale, name: String, original: String, plain: String): ParseResults = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResults]
    }
    
    extension [Self <: ParseResults](x: Self) {
      
      inline def setAfter(value: Boolean): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAscii(value: String): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
      
      inline def setAsciiUndefined: Self = StObject.set(x, "ascii", js.undefined)
      
      inline def setAttributed(value: Boolean): Self = StObject.set(x, "attributed", value.asInstanceOf[js.Any])
      
      inline def setAttributedUndefined: Self = StObject.set(x, "attributed", js.undefined)
      
      inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      inline def setGiven(value: String): Self = StObject.set(x, "given", value.asInstanceOf[js.Any])
      
      inline def setGivenUndefined: Self = StObject.set(x, "given", js.undefined)
      
      inline def setGiven_kana(value: String): Self = StObject.set(x, "given_kana", value.asInstanceOf[js.Any])
      
      inline def setGiven_kanaUndefined: Self = StObject.set(x, "given_kana", js.undefined)
      
      inline def setGiven_kanji(value: String): Self = StObject.set(x, "given_kanji", value.asInstanceOf[js.Any])
      
      inline def setGiven_kanjiUndefined: Self = StObject.set(x, "given_kanji", js.undefined)
      
      inline def setKana(value: String): Self = StObject.set(x, "kana", value.asInstanceOf[js.Any])
      
      inline def setKanaUndefined: Self = StObject.set(x, "kana", js.undefined)
      
      inline def setKanji(value: String): Self = StObject.set(x, "kanji", value.asInstanceOf[js.Any])
      
      inline def setKanjiUndefined: Self = StObject.set(x, "kanji", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setPlain(value: String): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setSchool(value: Boolean): Self = StObject.set(x, "school", value.asInstanceOf[js.Any])
      
      inline def setSchoolUndefined: Self = StObject.set(x, "school", js.undefined)
      
      inline def setSettings(value: ParseOptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
      
      inline def setSurname_kana(value: String): Self = StObject.set(x, "surname_kana", value.asInstanceOf[js.Any])
      
      inline def setSurname_kanaUndefined: Self = StObject.set(x, "surname_kana", js.undefined)
      
      inline def setSurname_kanji(value: String): Self = StObject.set(x, "surname_kanji", value.asInstanceOf[js.Any])
      
      inline def setSurname_kanjiUndefined: Self = StObject.set(x, "surname_kanji", js.undefined)
      
      inline def setUnknown(value: `true`): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
}
