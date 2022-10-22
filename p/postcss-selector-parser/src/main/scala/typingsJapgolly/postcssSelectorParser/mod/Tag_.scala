package typingsJapgolly.postcssSelectorParser.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag_
  extends StObject
     with Namespace[String] {
  
  @JSName("type")
  var type_Tag_ : typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.tag
}
object Tag_ {
  
  inline def apply(
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
    value: String
  ): Tag_ = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3((t0: String, t1: Any, t2: String) => (appendToPropertyAndEscape(t0, t1, t2)).runNow()), isAtPosition = js.Any.fromFunction2(isAtPosition), namespace = namespace.asInstanceOf[js.Any], namespaceString = namespaceString.asInstanceOf[js.Any], next = next.toJsFn, ns = ns.asInstanceOf[js.Any], prev = prev.toJsFn, qualifiedName = js.Any.fromFunction1(qualifiedName), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = remove.toJsFn, replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3((t0: String, t1: Any, t2: String) => (setPropertyAndEscape(t0, t1, t2)).runNow()), setPropertyWithoutEscape = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyWithoutEscape(t0, t1)).runNow()), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")("tag")
    __obj.asInstanceOf[Tag_]
  }
  
  extension [Self <: Tag_](x: Self) {
    
    inline def setType(value: typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
