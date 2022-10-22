package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YieldExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized
     with Terminatorless {
  
  var argument: js.UndefOr[Expression | Null] = js.undefined
  
  var delegate: Boolean
  
  @JSName("type")
  var type_YieldExpression_ : YieldExpression
}
object YieldExpression_ {
  
  inline def apply(delegate: Boolean): YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[YieldExpression_]
  }
  
  extension [Self <: YieldExpression_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setDelegate(value: Boolean): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setType(value: YieldExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
