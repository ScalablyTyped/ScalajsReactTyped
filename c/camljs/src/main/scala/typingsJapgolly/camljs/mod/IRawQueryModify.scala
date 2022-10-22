package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRawQueryModify extends StObject {
  
  def AppendAnd(): IFieldExpression
  
  def AppendOr(): IFieldExpression
}
object IRawQueryModify {
  
  inline def apply(AppendAnd: CallbackTo[IFieldExpression], AppendOr: CallbackTo[IFieldExpression]): IRawQueryModify = {
    val __obj = js.Dynamic.literal(AppendAnd = AppendAnd.toJsFn, AppendOr = AppendOr.toJsFn)
    __obj.asInstanceOf[IRawQueryModify]
  }
  
  extension [Self <: IRawQueryModify](x: Self) {
    
    inline def setAppendAnd(value: CallbackTo[IFieldExpression]): Self = StObject.set(x, "AppendAnd", value.toJsFn)
    
    inline def setAppendOr(value: CallbackTo[IFieldExpression]): Self = StObject.set(x, "AppendOr", value.toJsFn)
  }
}
