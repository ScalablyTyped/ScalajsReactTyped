package typingsJapgolly.nearley

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nearley.mod.LexerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var lexerState: LexerState
  }
  object Dictkey {
    
    inline def apply(lexerState: LexerState): Dictkey = {
      val __obj = js.Dynamic.literal(lexerState = lexerState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setLexerState(value: LexerState): Self = StObject.set(x, "lexerState", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
