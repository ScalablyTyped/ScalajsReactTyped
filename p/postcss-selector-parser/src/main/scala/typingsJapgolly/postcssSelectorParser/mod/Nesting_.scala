package typingsJapgolly.postcssSelectorParser.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nesting_
  extends StObject
     with Base[String, js.UndefOr[Container[String, Node]]] {
  
  @JSName("type")
  var type_Nesting_ : typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.nesting
}
object Nesting_ {
  
  inline def apply(
    appendToPropertyAndEscape: (String, Any, String) => Callback,
    clone_ : StringDictionary[Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    next: CallbackTo[Node],
    prev: CallbackTo[Node],
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: CallbackTo[Node],
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, Any, String) => Callback,
    setPropertyWithoutEscape: (String, Any) => Callback,
    sourceIndex: Double,
    spaces: Spaces,
    value: String
  ): Nesting_ = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3((t0: String, t1: Any, t2: String) => (appendToPropertyAndEscape(t0, t1, t2)).runNow()), isAtPosition = js.Any.fromFunction2(isAtPosition), next = next.toJsFn, prev = prev.toJsFn, rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = remove.toJsFn, replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3((t0: String, t1: Any, t2: String) => (setPropertyAndEscape(t0, t1, t2)).runNow()), setPropertyWithoutEscape = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyWithoutEscape(t0, t1)).runNow()), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")("nesting")
    __obj.asInstanceOf[Nesting_]
  }
  
  extension [Self <: Nesting_](x: Self) {
    
    inline def setType(value: typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.nesting): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
