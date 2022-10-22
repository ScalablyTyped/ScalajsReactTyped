package typingsJapgolly.prefixfree

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.prefixfree.PrefixFree.KnownPrefixCSS
import typingsJapgolly.prefixfree.PrefixFree.KnownPrefixJS
import typingsJapgolly.prefixfree.StyleFix.StyleFixer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixFree extends StObject {
  
  /**
    * The prefix used for CSS properties in `CSSStyleDeclaration`.
    *
    * Eg.: `Moz`, `Ms`, `O` or `Webkit`.
    */
  var Prefix: KnownPrefixJS | String = js.native
  
  var atrules: js.Array[String] = js.native
  
  var functions: js.Array[String] = js.native
  
  var keywords: js.Array[String] = js.native
  
  /**
    * The prefix used for CSS properties.
    *
    * Eg.: `-moz-`, `-ms-`, `-o-` or `-webkit-`.
    */
  var prefix: KnownPrefixCSS | String = js.native
  
  def prefixCSS(css: String, raw: Boolean, element: Element): String = js.native
  @JSName("prefixCSS")
  var prefixCSS_Original: StyleFixer = js.native
  
  def prefixProperty(property: String): String = js.native
  def prefixProperty(property: String, camelCase: Boolean): String = js.native
  
  def prefixSelector(selector: String): String = js.native
  
  var properties: js.Array[String] = js.native
  
  def property(property: String): String = js.native
  
  var selectorMap: StringDictionary[String] = js.native
  
  var selectors: js.Array[String] = js.native
  
  def value(value: String): String = js.native
  def value(value: String, property: String): String = js.native
  
  var valueProperties: js.Array[String] = js.native
}
// PrefixFree
object PrefixFree {
  
  /** The known prefixes used for CSS properties. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.prefixfree.prefixfreeStrings.`-moz-`
    - typingsJapgolly.prefixfree.prefixfreeStrings.`-ms-`
    - typingsJapgolly.prefixfree.prefixfreeStrings.`-o-`
    - typingsJapgolly.prefixfree.prefixfreeStrings.`-webkit-`
  */
  trait KnownPrefixCSS extends StObject
  object KnownPrefixCSS {
    
    inline def `-moz-`: typingsJapgolly.prefixfree.prefixfreeStrings.`-moz-` = "-moz-".asInstanceOf[typingsJapgolly.prefixfree.prefixfreeStrings.`-moz-`]
    
    inline def `-ms-`: typingsJapgolly.prefixfree.prefixfreeStrings.`-ms-` = "-ms-".asInstanceOf[typingsJapgolly.prefixfree.prefixfreeStrings.`-ms-`]
    
    inline def `-o-`: typingsJapgolly.prefixfree.prefixfreeStrings.`-o-` = "-o-".asInstanceOf[typingsJapgolly.prefixfree.prefixfreeStrings.`-o-`]
    
    inline def `-webkit-`: typingsJapgolly.prefixfree.prefixfreeStrings.`-webkit-` = "-webkit-".asInstanceOf[typingsJapgolly.prefixfree.prefixfreeStrings.`-webkit-`]
  }
  
  /** The known prefixes used for CSS properties in `CSSStyleDeclaration`. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.prefixfree.prefixfreeStrings.Moz
    - typingsJapgolly.prefixfree.prefixfreeStrings.Ms
    - typingsJapgolly.prefixfree.prefixfreeStrings.O
    - typingsJapgolly.prefixfree.prefixfreeStrings.Webkit
  */
  trait KnownPrefixJS extends StObject
  object KnownPrefixJS {
    
    inline def Moz: typingsJapgolly.prefixfree.prefixfreeStrings.Moz = "Moz".asInstanceOf[typingsJapgolly.prefixfree.prefixfreeStrings.Moz]
    
    inline def Ms: typingsJapgolly.prefixfree.prefixfreeStrings.Ms = "Ms".asInstanceOf[typingsJapgolly.prefixfree.prefixfreeStrings.Ms]
    
    inline def O: typingsJapgolly.prefixfree.prefixfreeStrings.O = "O".asInstanceOf[typingsJapgolly.prefixfree.prefixfreeStrings.O]
    
    inline def Webkit: typingsJapgolly.prefixfree.prefixfreeStrings.Webkit = "Webkit".asInstanceOf[typingsJapgolly.prefixfree.prefixfreeStrings.Webkit]
  }
}
