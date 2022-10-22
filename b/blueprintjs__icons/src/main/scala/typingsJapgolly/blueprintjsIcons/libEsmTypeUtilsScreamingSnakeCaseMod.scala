package typingsJapgolly.blueprintjsIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTypeUtilsScreamingSnakeCaseMod {
  
  /**
  Returns a boolean for whether the string is screaming snake case.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Value extends std.Uppercase<Value> ? @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/includes.Includes<@blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/delimiter-case.SplitIncludingDelimiters<std.Lowercase<Value>, '_'>, '_'> extends true ? true : false : false
    }}}
    */
  @js.native
  trait IsScreamingSnakeCase[Value /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Value extends string ? @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/screaming-snake-case.IsScreamingSnakeCase<Value> extends true ? Value : std.Uppercase<@blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/snake-case.SnakeCase<Value>> : Value
    }}}
    */
  @js.native
  trait ScreamingSnakeCase[Value] extends StObject
}
