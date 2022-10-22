package typingsJapgolly.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSKeywordValue
  extends StObject
     with CSSStyleValue {
  
  var value: String
}
object CSSKeywordValue {
  
  inline def apply(value: String): CSSKeywordValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeywordValue]
  }
  
  extension [Self <: CSSKeywordValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
