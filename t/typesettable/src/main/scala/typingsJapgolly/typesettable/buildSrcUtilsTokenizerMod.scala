package typingsJapgolly.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsTokenizerMod {
  
  @JSImport("typesettable/build/src/utils/tokenizer", "Tokenizer")
  @js.native
  open class Tokenizer () extends StObject {
    
    /* private */ var WhitespaceRegExp: Any = js.native
    
    /* private */ var WordDividerRegExp: Any = js.native
    
    /* private */ def shouldCreateNewToken(token: Any, newCharacter: Any): Any = js.native
    
    def tokenize(line: String): js.Array[String] = js.native
  }
}
