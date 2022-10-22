package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import typingsJapgolly.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenSpan
  extends StObject
     with TextSpan {
  
  /* private */ var _kind: Any
  
  def kind(): SyntaxKind
}
object TokenSpan {
  
  inline def apply(
    _kind: Any,
    _length: Any,
    _start: Any,
    containsPosition: Double => Boolean,
    containsTextSpan: TextSpan => Boolean,
    end: CallbackTo[Double],
    intersection: TextSpan => TextSpan,
    intersectsWith: (Double, Double) => Boolean,
    intersectsWithPosition: Double => Boolean,
    intersectsWithTextSpan: TextSpan => Boolean,
    isEmpty: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    length: CallbackTo[Double],
    overlap: TextSpan => TextSpan,
    overlapsWith: TextSpan => Boolean,
    start: CallbackTo[Double]
  ): TokenSpan = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], containsPosition = js.Any.fromFunction1(containsPosition), containsTextSpan = js.Any.fromFunction1(containsTextSpan), end = end.toJsFn, intersection = js.Any.fromFunction1(intersection), intersectsWith = js.Any.fromFunction2(intersectsWith), intersectsWithPosition = js.Any.fromFunction1(intersectsWithPosition), intersectsWithTextSpan = js.Any.fromFunction1(intersectsWithTextSpan), isEmpty = isEmpty.toJsFn, kind = kind.toJsFn, length = length.toJsFn, overlap = js.Any.fromFunction1(overlap), overlapsWith = js.Any.fromFunction1(overlapsWith), start = start.toJsFn)
    __obj.asInstanceOf[TokenSpan]
  }
  
  extension [Self <: TokenSpan](x: Self) {
    
    inline def setKind(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def set_kind(value: Any): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
  }
}
