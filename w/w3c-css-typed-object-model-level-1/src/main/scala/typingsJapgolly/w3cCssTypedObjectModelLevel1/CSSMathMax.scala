package typingsJapgolly.w3cCssTypedObjectModelLevel1

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSMathMax
  extends StObject
     with CSSMathValue {
  
  val values: CSSNumericArray
}
object CSSMathMax {
  
  inline def apply(
    add: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    div: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    equals_ : /* repeated */ CSSNumberOrNumeric => Boolean,
    max: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    min: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    mul: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    operator: CSSMathOperator,
    sub: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    to: String => CSSUnitValue,
    toSum: /* repeated */ String => CSSMathSum,
    `type`: CallbackTo[CSSNumericType],
    values: CSSNumericArray
  ): CSSMathMax = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), operator = operator.asInstanceOf[js.Any], sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum), values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[CSSMathMax]
  }
  
  extension [Self <: CSSMathMax](x: Self) {
    
    inline def setValues(value: CSSNumericArray): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
