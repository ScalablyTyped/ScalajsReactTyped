package typingsJapgolly.vueCompilerCore.mod

import typingsJapgolly.vueCompilerCore.vueCompilerCoreStrings.condense
import typingsJapgolly.vueCompilerCore.vueCompilerCoreStrings.preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserOptions
  extends StObject
     with ErrorHandlingOptions
     with CompilerCompatOptions {
  
  /**
    * Whether to keep comments in the templates AST.
    * This defaults to `true` in development and `false` in production builds.
    */
  var comments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only needed for DOM compilers
    */
  var decodeEntities: js.UndefOr[js.Function2[/* rawText */ String, /* asAttr */ Boolean, String]] = js.undefined
  
  /**
    * @default ['{{', '}}']
    */
  var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  /**
    * Get tag namespace
    */
  var getNamespace: js.UndefOr[js.Function2[/* tag */ String, /* parent */ js.UndefOr[ElementNode], Namespace]] = js.undefined
  
  /**
    * Get text parsing mode for this element
    */
  var getTextMode: js.UndefOr[
    js.Function2[/* node */ ElementNode, /* parent */ js.UndefOr[ElementNode], TextModes]
  ] = js.undefined
  
  /**
    * Platform-specific built-in components e.g. `<Transition>`
    */
  var isBuiltInComponent: js.UndefOr[js.Function1[/* tag */ String, js.Symbol | Unit]] = js.undefined
  
  /**
    * Separate option for end users to extend the native elements list
    */
  var isCustomElement: js.UndefOr[js.Function1[/* tag */ String, Boolean | Unit]] = js.undefined
  
  /**
    * e.g. platform native elements, e.g. `<div>` for browsers
    */
  var isNativeTag: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.undefined
  
  /**
    * e.g. elements that should preserve whitespace inside, e.g. `<pre>`
    */
  var isPreTag: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.undefined
  
  /**
    * e.g. native elements that can self-close, e.g. `<img>`, `<br>`, `<hr>`
    */
  var isVoidTag: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.undefined
  
  /**
    * Whitespace handling strategy
    */
  var whitespace: js.UndefOr[preserve | condense] = js.undefined
}
object ParserOptions {
  
  inline def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  extension [Self <: ParserOptions](x: Self) {
    
    inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setDecodeEntities(value: (/* rawText */ String, /* asAttr */ Boolean) => String): Self = StObject.set(x, "decodeEntities", js.Any.fromFunction2(value))
    
    inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
    
    inline def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
    
    inline def setGetNamespace(value: (/* tag */ String, /* parent */ js.UndefOr[ElementNode]) => Namespace): Self = StObject.set(x, "getNamespace", js.Any.fromFunction2(value))
    
    inline def setGetNamespaceUndefined: Self = StObject.set(x, "getNamespace", js.undefined)
    
    inline def setGetTextMode(value: (/* node */ ElementNode, /* parent */ js.UndefOr[ElementNode]) => TextModes): Self = StObject.set(x, "getTextMode", js.Any.fromFunction2(value))
    
    inline def setGetTextModeUndefined: Self = StObject.set(x, "getTextMode", js.undefined)
    
    inline def setIsBuiltInComponent(value: /* tag */ String => js.Symbol | Unit): Self = StObject.set(x, "isBuiltInComponent", js.Any.fromFunction1(value))
    
    inline def setIsBuiltInComponentUndefined: Self = StObject.set(x, "isBuiltInComponent", js.undefined)
    
    inline def setIsCustomElement(value: /* tag */ String => Boolean | Unit): Self = StObject.set(x, "isCustomElement", js.Any.fromFunction1(value))
    
    inline def setIsCustomElementUndefined: Self = StObject.set(x, "isCustomElement", js.undefined)
    
    inline def setIsNativeTag(value: /* tag */ String => Boolean): Self = StObject.set(x, "isNativeTag", js.Any.fromFunction1(value))
    
    inline def setIsNativeTagUndefined: Self = StObject.set(x, "isNativeTag", js.undefined)
    
    inline def setIsPreTag(value: /* tag */ String => Boolean): Self = StObject.set(x, "isPreTag", js.Any.fromFunction1(value))
    
    inline def setIsPreTagUndefined: Self = StObject.set(x, "isPreTag", js.undefined)
    
    inline def setIsVoidTag(value: /* tag */ String => Boolean): Self = StObject.set(x, "isVoidTag", js.Any.fromFunction1(value))
    
    inline def setIsVoidTagUndefined: Self = StObject.set(x, "isVoidTag", js.undefined)
    
    inline def setWhitespace(value: preserve | condense): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
