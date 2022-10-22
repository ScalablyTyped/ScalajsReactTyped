package typingsJapgolly.typedQuerySelector

import typingsJapgolly.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`0`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`1`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`2`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`3`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`4`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`5`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`6`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`7`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`8`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`9`
  */
  trait Digit
    extends StObject
       with _IdentifierChar
  object Digit {
    
    inline def `0`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`0` = "0".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`0`]
    
    inline def `1`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`1` = "1".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`1`]
    
    inline def `2`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`2` = "2".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`2`]
    
    inline def `3`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`3` = "3".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`3`]
    
    inline def `4`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`4` = "4".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`4`]
    
    inline def `5`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`5` = "5".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`5`]
    
    inline def `6`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`6` = "6".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`6`]
    
    inline def `7`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`7` = "7".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`7`]
    
    inline def `8`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`8` = "8".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`8`]
    
    inline def `9`: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`9` = "9".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`9`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedQuerySelector.strictMod.IdentifierFirstChar
    - typingsJapgolly.typedQuerySelector.strictMod.Digit
  */
  type IdentifierChar = _IdentifierChar | Uppercase[LowerCaseLetter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedQuerySelector.strictMod.LowerCaseLetter
    - typingsJapgolly.std.Uppercase[typingsJapgolly.typedQuerySelector.strictMod.LowerCaseLetter]
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.`-_`
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings._underscore
  */
  type IdentifierFirstChar = _IdentifierFirstChar | Uppercase[LowerCaseLetter]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferH}${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H * / any extends typed-query-selector.typed-query-selector/strict.IdentifierChar ? typed-query-selector.typed-query-selector/strict.IsValidRestChars</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false : true
    }}}
    */
  @js.native
  trait IsValidRestChars[S /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferH}${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H * / any extends typed-query-selector.typed-query-selector/strict.IdentifierFirstChar ? typed-query-selector.typed-query-selector/strict.IsValidRestChars</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false : false
    }}}
    */
  @js.native
  trait IsValidTagName[S] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends [infer H, ...infer Rest] ? H extends '' | '*' ? typed-query-selector.typed-query-selector/strict.IsValidTags<Rest> : typed-query-selector.typed-query-selector/strict.IsValidTagName<H> extends true ? typed-query-selector.typed-query-selector/strict.IsValidTags<Rest> : false : true
    }}}
    */
  @js.native
  trait IsValidTags[S] extends StObject
  
  // Specification is here: https://drafts.csswg.org/css-syntax-3/#ident-token-diagram
  // but we don't plan to comply that fully,
  // otherwise it will increase type-checking time and the complexity of parser.
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.a
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.b
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.c
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.d
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.e
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.f
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.g
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.h
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.i
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.j
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.k
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.l
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.m
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.n
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.o
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.p
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.q
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.r
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.s
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.t
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.u
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.v
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.w
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.x
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.y
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.z
  */
  trait LowerCaseLetter
    extends StObject
       with _IdentifierFirstChar
  object LowerCaseLetter {
    
    inline def a: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.a = "a".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.a]
    
    inline def b: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.b = "b".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.b]
    
    inline def c: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.c = "c".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.c]
    
    inline def d: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.d = "d".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.d]
    
    inline def e: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.e = "e".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.e]
    
    inline def f: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.f = "f".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.f]
    
    inline def g: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.g = "g".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.g]
    
    inline def h: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.h = "h".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.h]
    
    inline def i: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.i = "i".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.i]
    
    inline def j: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.j = "j".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.j]
    
    inline def k: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.k = "k".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.k]
    
    inline def l: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.l = "l".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.l]
    
    inline def m: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.m = "m".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.m]
    
    inline def n: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.n = "n".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.n]
    
    inline def o: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.o = "o".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.o]
    
    inline def p: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.p = "p".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.p]
    
    inline def q: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.q = "q".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.q]
    
    inline def r: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.r = "r".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.r]
    
    inline def s: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.s = "s".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.s]
    
    inline def t: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.t = "t".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.t]
    
    inline def u: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.u = "u".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.u]
    
    inline def v: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.v = "v".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.v]
    
    inline def w: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.w = "w".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.w]
    
    inline def x: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.x = "x".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.x]
    
    inline def y: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.y = "y".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.y]
    
    inline def z: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.z = "z".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.z]
  }
  
  // no characters left, so it's OK
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.ParseSelectorToTagNames<S> extends infer Tags ? Tags extends [] ? typed-query-selector.typed-query-selector/parser.TagNameToElement<'', typed-query-selector.typed-query-selector/strict.<global>.Element> : Tags extends std.Array<string> ? typed-query-selector.typed-query-selector/strict.IsValidTags<Tags> extends true ? typed-query-selector.typed-query-selector/parser.TagNameToElement<Tags[number], typed-query-selector.typed-query-selector/strict.<global>.Element> : never : never : never
    }}}
    */
  @js.native
  trait Parse[S /* <: String */] extends StObject
  
  trait _IdentifierChar extends StObject
  
  trait _IdentifierFirstChar
    extends StObject
       with _IdentifierChar
  
  object global {
    
    trait Element extends StObject {
      
      def closest[S /* <: String */, E /* <: Parse[S] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
    }
    object Element {
      
      inline def apply(
        closest: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
      ): Element = {
        val __obj = js.Dynamic.literal(closest = js.Any.fromFunction1(closest))
        __obj.asInstanceOf[Element]
      }
      
      extension [Self <: Element](x: Self) {
        
        inline def setClosest(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
        ): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
      }
    }
    
    trait ParentNode extends StObject {
      
      def querySelector[S /* <: String */, E /* <: Parse[S] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
      
      def querySelectorAll[S /* <: String */, E /* <: Parse[S] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
    }
    object ParentNode {
      
      inline def apply(
        querySelector: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any,
        querySelectorAll: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
      ): ParentNode = {
        val __obj = js.Dynamic.literal(querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
        __obj.asInstanceOf[ParentNode]
      }
      
      extension [Self <: ParentNode](x: Self) {
        
        inline def setQuerySelector(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
        ): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
        
        inline def setQuerySelectorAll(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
        ): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
      }
    }
  }
}
