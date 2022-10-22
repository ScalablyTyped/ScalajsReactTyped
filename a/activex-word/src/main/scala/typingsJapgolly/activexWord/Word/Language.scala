package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  val ActiveGrammarDictionary: Dictionary
  
  val ActiveHyphenationDictionary: Dictionary
  
  val ActiveSpellingDictionary: Dictionary
  
  val ActiveThesaurusDictionary: Dictionary
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  var DefaultWritingStyle: String
  
  val ID: WdLanguageID
  
  val Name: String
  
  val NameLocal: String
  
  val Parent: Any
  
  var SpellingDictionaryType: WdDictionaryType
  
  /* private */ @JSName("Word.Language_typekey")
  var WordDotLanguage_typekey: Language
  
  val WritingStyleList: Any
}
object Language {
  
  inline def apply(
    ActiveGrammarDictionary: Dictionary,
    ActiveHyphenationDictionary: Dictionary,
    ActiveSpellingDictionary: Dictionary,
    ActiveThesaurusDictionary: Dictionary,
    Application: Application,
    Creator: Double,
    DefaultWritingStyle: String,
    ID: WdLanguageID,
    Name: String,
    NameLocal: String,
    Parent: Any,
    SpellingDictionaryType: WdDictionaryType,
    WordDotLanguage_typekey: Language,
    WritingStyleList: Any
  ): Language = {
    val __obj = js.Dynamic.literal(ActiveGrammarDictionary = ActiveGrammarDictionary.asInstanceOf[js.Any], ActiveHyphenationDictionary = ActiveHyphenationDictionary.asInstanceOf[js.Any], ActiveSpellingDictionary = ActiveSpellingDictionary.asInstanceOf[js.Any], ActiveThesaurusDictionary = ActiveThesaurusDictionary.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DefaultWritingStyle = DefaultWritingStyle.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameLocal = NameLocal.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpellingDictionaryType = SpellingDictionaryType.asInstanceOf[js.Any], WritingStyleList = WritingStyleList.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Language_typekey")(WordDotLanguage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setActiveGrammarDictionary(value: Dictionary): Self = StObject.set(x, "ActiveGrammarDictionary", value.asInstanceOf[js.Any])
    
    inline def setActiveHyphenationDictionary(value: Dictionary): Self = StObject.set(x, "ActiveHyphenationDictionary", value.asInstanceOf[js.Any])
    
    inline def setActiveSpellingDictionary(value: Dictionary): Self = StObject.set(x, "ActiveSpellingDictionary", value.asInstanceOf[js.Any])
    
    inline def setActiveThesaurusDictionary(value: Dictionary): Self = StObject.set(x, "ActiveThesaurusDictionary", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDefaultWritingStyle(value: String): Self = StObject.set(x, "DefaultWritingStyle", value.asInstanceOf[js.Any])
    
    inline def setID(value: WdLanguageID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameLocal(value: String): Self = StObject.set(x, "NameLocal", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSpellingDictionaryType(value: WdDictionaryType): Self = StObject.set(x, "SpellingDictionaryType", value.asInstanceOf[js.Any])
    
    inline def setWordDotLanguage_typekey(value: Language): Self = StObject.set(x, "Word.Language_typekey", value.asInstanceOf[js.Any])
    
    inline def setWritingStyleList(value: Any): Self = StObject.set(x, "WritingStyleList", value.asInstanceOf[js.Any])
  }
}
