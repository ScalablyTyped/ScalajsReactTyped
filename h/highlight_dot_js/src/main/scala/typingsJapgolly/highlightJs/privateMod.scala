package typingsJapgolly.highlightJs

import typingsJapgolly.highlightJs.mod.CompiledMode
import typingsJapgolly.highlightJs.mod.Language
import typingsJapgolly.highlightJs.mod.Mode
import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import typingsJapgolly.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateMod {
  
  trait AnnotatedError
    extends StObject
       with Error {
    
    var badRule: js.UndefOr[Mode] = js.undefined
    
    var languageName: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Mode | Language] = js.undefined
  }
  object AnnotatedError {
    
    inline def apply(message: String, name: String): AnnotatedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotatedError]
    }
    
    extension [Self <: AnnotatedError](x: Self) {
      
      inline def setBadRule(value: Mode): Self = StObject.set(x, "badRule", value.asInstanceOf[js.Any])
      
      inline def setBadRuleUndefined: Self = StObject.set(x, "badRule", js.undefined)
      
      inline def setLanguageName(value: String): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
      
      inline def setLanguageNameUndefined: Self = StObject.set(x, "languageName", js.undefined)
      
      inline def setMode(value: Mode | Language): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait EnhancedMatch
    extends StObject
       with RegExpMatchArray {
    
    var rule: CompiledMode = js.native
    
    var `type`: MatchType = js.native
  }
  
  type KeywordData = js.Tuple2[String, Double]
  
  type KeywordDict = Record[String, KeywordData]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.highlightJs.highlightJsStrings.begin
    - typingsJapgolly.highlightJs.highlightJsStrings.end
    - typingsJapgolly.highlightJs.highlightJsStrings.illegal
  */
  trait MatchType extends StObject
  object MatchType {
    
    inline def begin: typingsJapgolly.highlightJs.highlightJsStrings.begin = "begin".asInstanceOf[typingsJapgolly.highlightJs.highlightJsStrings.begin]
    
    inline def end: typingsJapgolly.highlightJs.highlightJsStrings.end = "end".asInstanceOf[typingsJapgolly.highlightJs.highlightJsStrings.end]
    
    inline def illegal: typingsJapgolly.highlightJs.highlightJsStrings.illegal = "illegal".asInstanceOf[typingsJapgolly.highlightJs.highlightJsStrings.illegal]
  }
}
