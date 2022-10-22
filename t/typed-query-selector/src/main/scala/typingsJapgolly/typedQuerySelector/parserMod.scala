package typingsJapgolly.typedQuerySelector

import typingsJapgolly.typedQuerySelector.strictMod.global.Element
import typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Quotationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Space
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Greaterthansign
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Tilde
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Plussign
  */
  trait Combinators extends StObject
  object Combinators {
    
    inline def Greaterthansign: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Greaterthansign]
    
    inline def Plussign: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Plussign = "+".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Plussign]
    
    inline def Space: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Space = (" ").asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Space]
    
    inline def Tilde: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Tilde = "~".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Tilde]
  }
  
  /** Parse `:is()` and `:where()` */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    I extends / * template literal string: ${inferL}:${inferPseudo}(${inferArgs})${inferR} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pseudo * / any extends 'is' | 'where' ? typed-query-selector.typed-query-selector/parser.ExpandFunctions</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args * / any, [...LeftParts, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : typed-query-selector.typed-query-selector/parser.ExpandFunctions</ * template literal string: ${L}${R} * / string, Seen, LeftParts, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : typed-query-selector.typed-query-selector/parser.Join<typed-query-selector.typed-query-selector/parser.Expander<typed-query-selector.typed-query-selector/parser.Split<Seen>, typed-query-selector.typed-query-selector/parser.Join<LeftParts>, Right>> extends / * template literal string: ${inferS}, * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify S * / any : I
    }}}
    */
  @js.native
  trait ExpandFunctions[I, Seen, LeftParts /* <: js.Array[String] */, Right /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Args extends [] ? [] : Args extends [infer Head, ...infer Rest] ? [/ * template literal string: ${PostprocessEach<L>}${Head}${R}, * / string, ...typed-query-selector.typed-query-selector/parser.Expander<Rest, L, R>] : never
    }}}
    */
  @js.native
  trait Expander[Args, L /* <: String */, R /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    I extends / * template literal string: ${string}${Combinators}${inferRight} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any extends '' ? unknown : typed-query-selector.typed-query-selector/parser.GetLastTag</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any> : I
    }}}
    */
  @js.native
  trait GetLastTag[I] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Seq extends [] ? '' : Seq extends [infer Head, ...infer Rest] ? / * template literal string: ${Head}${Join<Rest>} * / string : never
    }}}
    */
  @js.native
  trait Join[Seq] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.ParseSelectorToTagNames<I> extends infer TagNames ? TagNames extends [] ? typed-query-selector.typed-query-selector/parser.TagNameToElement<'', Fallback> : TagNames extends std.Array<string> ? typed-query-selector.typed-query-selector/parser.TagNameToElement<TagNames[number], Fallback> : Fallback : never
    }}}
    */
  @js.native
  trait ParseSelector[I /* <: String */, Fallback /* <: Element */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.Trim<I> extends infer I ? I extends '' ? unknown : typed-query-selector.typed-query-selector/parser.Split<typed-query-selector.typed-query-selector/parser.ExpandFunctions<typed-query-selector.typed-query-selector/parser.Preprocess<typed-query-selector.typed-query-selector/parser.PreprocessGrouping<I>>, '', [], ''>> extends infer PreprocessedTagNames ? PreprocessedTagNames extends std.Array<string> ? typed-query-selector.typed-query-selector/parser.Postprocess<PreprocessedTagNames, []> : unknown : never : never
    }}}
    */
  @js.native
  trait ParseSelectorToTagNames[I /* <: String */] extends StObject
  
  /** Check whether each tag is valid or not. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tags extends [] ? R : Tags extends [infer H, ...infer Rest] ? typed-query-selector.typed-query-selector/parser.PostprocessEach<typed-query-selector.typed-query-selector/parser.GetLastTag<H>> extends infer T ? T extends string ? Rest extends std.Array<string> ? typed-query-selector.typed-query-selector/parser.Postprocess<Rest, [...R, T]> : never : unknown : never : Tags
    }}}
    */
  @js.native
  trait Postprocess[Tags /* <: js.Array[String] */, R /* <: js.Array[String] */] extends StObject
  
  /** Postprocess each tag with simple validation. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    I extends / * template literal string: ${inferTag}.${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any extends '' ? unknown : typed-query-selector.typed-query-selector/parser.PostprocessEach</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${inferTag}#${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any extends '' ? unknown : typed-query-selector.typed-query-selector/parser.PostprocessEach</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${inferTag}:${PseudoClassesFirstChar}${string} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEach</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${string}|${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEach</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : I
    }}}
    */
  @js.native
  trait PostprocessEach[I] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    I extends / * template literal string: ${inferL}\\${Quotes}${inferR} * / string ? typed-query-selector.typed-query-selector/parser.Preprocess</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${inferL}"${string}"${inferR} * / string ? typed-query-selector.typed-query-selector/parser.Preprocess</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${inferL}'${string}'${inferR} * / string ? typed-query-selector.typed-query-selector/parser.Preprocess</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${string}[]${string} * / string ? unknown : I extends / * template literal string: ${inferL}[${string}]${inferR} * / string ? typed-query-selector.typed-query-selector/parser.Preprocess</ * template literal string: ${L}#x${R} * / string> : I
    }}}
    */
  @js.native
  trait Preprocess[I] extends StObject
  
  // DO NOT use union type like `${infer L},${Whitespace}${infer R}` here,
  // or it may cause OOM when running tsc in downstream projects.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    I extends / * template literal string: ${inferL}, ${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I extends / * template literal string: ${inferL},\n${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I extends / * template literal string: ${inferL},\r${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I extends / * template literal string: ${inferL},\f${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I extends / * template literal string: ${inferL},\t${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I
    }}}
    */
  @js.native
  trait PreprocessGrouping[I] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.a
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.b
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.c
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.d
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.e
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.f
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.h
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.i
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.l
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.n
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.o
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.p
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.r
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.s
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.t
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.u
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.v
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.w
  */
  trait PseudoClassesFirstChar extends StObject
  object PseudoClassesFirstChar {
    
    inline def a: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.a = "a".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.a]
    
    inline def b: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.b = "b".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.b]
    
    inline def c: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.c = "c".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.c]
    
    inline def d: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.d = "d".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.d]
    
    inline def e: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.e = "e".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.e]
    
    inline def f: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.f = "f".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.f]
    
    inline def h: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.h = "h".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.h]
    
    inline def i: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.i = "i".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.i]
    
    inline def l: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.l = "l".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.l]
    
    inline def n: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.n = "n".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.n]
    
    inline def o: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.o = "o".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.o]
    
    inline def p: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.p = "p".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.p]
    
    inline def r: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.r = "r".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.r]
    
    inline def s: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.s = "s".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.s]
    
    inline def t: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.t = "t".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.t]
    
    inline def u: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.u = "u".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.u]
    
    inline def v: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.v = "v".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.v]
    
    inline def w: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.w = "w".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.w]
  }
  
  object Quotes {
    
    inline def Apostrophe: /* ' */ String = "'".asInstanceOf[/* ' */ String]
    
    inline def Quotationmark: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Quotationmark = "\"".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Quotationmark]
  }
  type Quotes = Quotationmark | (/* ' */ String)
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${string}, * / string ? unknown : S extends '' ? [] : S extends / * template literal string: ${inferLeft},${inferRight} * / string ? [/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Left * / any, ...typed-query-selector.typed-query-selector/parser.Split</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any>] : [S]
    }}}
    */
  @js.native
  trait Split[S] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tag extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[Tag] : Tag extends 'a' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'script' | 'set' | 'stop' | 'style' | 'svg' | 'switch' | 'symbol' | 'text' | 'textPath' | 'title' | 'tspan' | 'use' | 'view' ? std.SVGElementTagNameMap[Tag] : Fallback
    }}}
    */
  @js.native
  trait TagNameToElement[Tag /* <: String */, Fallback /* <: Element */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferT}${Whitespace} * / string ? typed-query-selector.typed-query-selector/parser.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T * / any> : S extends / * template literal string: ${Whitespace}${inferT} * / string ? typed-query-selector.typed-query-selector/parser.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T * / any> : S
    }}}
    */
  @js.native
  trait Trim[S /* <: String */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Space
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Linefeed
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Carriagereturn
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Formfeed
    - typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Charactertabulation
  */
  trait Whitespace extends StObject
  object Whitespace {
    
    inline def Carriagereturn: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Carriagereturn = "\r".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Carriagereturn]
    
    inline def Charactertabulation: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Charactertabulation = "\t".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Charactertabulation]
    
    inline def Formfeed: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Formfeed = "\f".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Formfeed]
    
    inline def Linefeed: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Linefeed = "\n".asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Linefeed]
    
    inline def Space: typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Space = (" ").asInstanceOf[typingsJapgolly.typedQuerySelector.typedQuerySelectorStrings.Space]
  }
}
