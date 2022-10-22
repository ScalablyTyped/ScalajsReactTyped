package typingsJapgolly.postcssSelectorParser.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Combinator_
  extends StObject
     with Base[String, js.UndefOr[Container[String, Node]]] {
  
  var raws: js.UndefOr[CombinatorRaws] = js.undefined
  
  @JSName("type")
  var type_Combinator_ : typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.combinator
}
object Combinator_ {
  
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
  ): Combinator_ = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3((t0: String, t1: Any, t2: String) => (appendToPropertyAndEscape(t0, t1, t2)).runNow()), isAtPosition = js.Any.fromFunction2(isAtPosition), next = next.toJsFn, prev = prev.toJsFn, rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = remove.toJsFn, replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3((t0: String, t1: Any, t2: String) => (setPropertyAndEscape(t0, t1, t2)).runNow()), setPropertyWithoutEscape = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyWithoutEscape(t0, t1)).runNow()), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")("combinator")
    __obj.asInstanceOf[Combinator_]
  }
  
  extension [Self <: Combinator_](x: Self) {
    
    inline def setRaws(value: CombinatorRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    inline def setType(value: typingsJapgolly.postcssSelectorParser.postcssSelectorParserStrings.combinator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
