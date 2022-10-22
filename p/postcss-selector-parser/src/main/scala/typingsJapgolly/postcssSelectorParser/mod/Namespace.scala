package typingsJapgolly.postcssSelectorParser.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.`class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace[Value /* <: js.UndefOr[String] */]
  extends StObject
     with Base[Value, js.UndefOr[Container[String, Node]]] {
  
  /**
    *  namespace prefix.
    */
  var namespace: String | `true`
  
  /**
    * A string representing the namespace suitable for output.
    */
  val namespaceString: String
  
  /** alias for namespace */
  var ns: String | `true`
  
  /**
    * If a namespace exists, prefix the value provided with it, separated by |.
    */
  def qualifiedName(value: String): String
}
object Namespace {
  
  inline def apply[Value /* <: js.UndefOr[String] */](
    appendToPropertyAndEscape: (String, Any, String) => Callback,
    clone_ : StringDictionary[Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    namespace: String | `true`,
    namespaceString: String,
    next: CallbackTo[Node],
    ns: String | `true`,
    prev: CallbackTo[Node],
    qualifiedName: String => String,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: CallbackTo[Node],
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, Any, String) => Callback,
    setPropertyWithoutEscape: (String, Any) => Callback,
    sourceIndex: Double,
    spaces: Spaces,
    `type`: typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.tag | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.string | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.selector | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.root | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.nesting | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.id | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.comment | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.attribute | typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.universal,
    value: Value
  ): Namespace[Value] = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3((t0: String, t1: Any, t2: String) => (appendToPropertyAndEscape(t0, t1, t2)).runNow()), isAtPosition = js.Any.fromFunction2(isAtPosition), namespace = namespace.asInstanceOf[js.Any], namespaceString = namespaceString.asInstanceOf[js.Any], next = next.toJsFn, ns = ns.asInstanceOf[js.Any], prev = prev.toJsFn, qualifiedName = js.Any.fromFunction1(qualifiedName), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = remove.toJsFn, replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3((t0: String, t1: Any, t2: String) => (setPropertyAndEscape(t0, t1, t2)).runNow()), setPropertyWithoutEscape = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyWithoutEscape(t0, t1)).runNow()), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace[Value]]
  }
  
  extension [Self <: Namespace[?], Value /* <: js.UndefOr[String] */](x: Self & Namespace[Value]) {
    
    inline def setNamespace(value: String | `true`): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceString(value: String): Self = StObject.set(x, "namespaceString", value.asInstanceOf[js.Any])
    
    inline def setNs(value: String | `true`): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setQualifiedName(value: String => String): Self = StObject.set(x, "qualifiedName", js.Any.fromFunction1(value))
  }
}
