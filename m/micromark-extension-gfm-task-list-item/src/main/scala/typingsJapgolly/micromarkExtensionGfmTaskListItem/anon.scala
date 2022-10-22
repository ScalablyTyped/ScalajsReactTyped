package typingsJapgolly.micromarkExtensionGfmTaskListItem

import typingsJapgolly.micromarkUtilTypes.mod.Effects
import typingsJapgolly.micromarkUtilTypes.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Tokenize extends StObject {
    
    def tokenize(effects: Effects, ok: State, nok: State): State
    @JSName("tokenize")
    var tokenize_Original: js.Function3[/* effects */ Effects, /* ok */ State, /* nok */ State, State]
  }
  object Tokenize {
    
    inline def apply(tokenize: (/* effects */ Effects, /* ok */ State, /* nok */ State) => State): Tokenize = {
      val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction3(tokenize))
      __obj.asInstanceOf[Tokenize]
    }
    
    extension [Self <: Tokenize](x: Self) {
      
      inline def setTokenize(value: (/* effects */ Effects, /* ok */ State, /* nok */ State) => State): Self = StObject.set(x, "tokenize", js.Any.fromFunction3(value))
    }
  }
}
