package typingsJapgolly.moo

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.moo.mod.ErrorRule
import typingsJapgolly.moo.mod.FallbackRule
import typingsJapgolly.moo.mod.Lexer
import typingsJapgolly.moo.mod.Rules
import typingsJapgolly.moo.mod.TypeMapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object moo {
    
    @JSGlobal("moo")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compile(rules: Rules): Lexer = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(rules.asInstanceOf[js.Any]).asInstanceOf[Lexer]
    
    @JSGlobal("moo.error")
    @js.native
    val error: ErrorRule = js.native
    
    @JSGlobal("moo.fallback")
    @js.native
    val fallback: FallbackRule = js.native
    
    inline def keywords(kws: StringDictionary[String | js.Array[String]]): TypeMapper = ^.asInstanceOf[js.Dynamic].applyDynamic("keywords")(kws.asInstanceOf[js.Any]).asInstanceOf[TypeMapper]
    
    inline def states(states: StringDictionary[Rules]): Lexer = ^.asInstanceOf[js.Dynamic].applyDynamic("states")(states.asInstanceOf[js.Any]).asInstanceOf[Lexer]
    inline def states(states: StringDictionary[Rules], start: String): Lexer = (^.asInstanceOf[js.Dynamic].applyDynamic("states")(states.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Lexer]
  }
}
