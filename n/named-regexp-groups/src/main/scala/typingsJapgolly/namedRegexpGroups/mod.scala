package typingsJapgolly.namedRegexpGroups

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("named-regexp-groups", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NamedRegExp {
    def this(pattern: String) = this()
    def this(pattern: js.RegExp) = this()
    def this(pattern: String, flags: String) = this()
    def this(pattern: js.RegExp, flags: String) = this()
    def this(pattern: Unit, flags: String) = this()
  }
  
  @js.native
  trait NamedRegExp extends StObject {
    
    /**
      * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
      * @param string The String object or string literal on which to perform the search.
      */
    def exec(string: String): NamedRegExpExecArray | Null = js.native
    
    @JSName(js.Symbol.`match`)
    var `match`: js.Function1[/* str */ String, NamedRegExpExecArray] = js.native
    
    @JSName(js.Symbol.replace)
    var replace: js.Function2[
        /* str */ String, 
        /* replacement */ String | (js.Function2[/* match */ String, /* repeated */ String, String]), 
        String
      ] = js.native
    
    @JSName(js.Symbol.search)
    var search: js.Function1[/* str */ String, Double] = js.native
    
    @JSName(js.Symbol.split)
    var split: js.Function1[/* str */ String, js.Array[String]] = js.native
    
    /**
      * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
      * @param string String on which to perform the search.
      */
    def test(string: String): Boolean = js.native
  }
  
  @js.native
  trait NamedRegExpExecArray
    extends StObject
       with RegExpExecArray {
    
    @JSName("groups")
    var groups_NamedRegExpExecArray: StringDictionary[String] = js.native
  }
}
