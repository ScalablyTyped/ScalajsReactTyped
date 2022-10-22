package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRawQuery extends StObject {
  
  def ModifyWhere(): IRawQueryModify
  
  /** Change Where clause */
  def ReplaceWhere(): IFieldExpression
}
object IRawQuery {
  
  inline def apply(ModifyWhere: CallbackTo[IRawQueryModify], ReplaceWhere: CallbackTo[IFieldExpression]): IRawQuery = {
    val __obj = js.Dynamic.literal(ModifyWhere = ModifyWhere.toJsFn, ReplaceWhere = ReplaceWhere.toJsFn)
    __obj.asInstanceOf[IRawQuery]
  }
  
  extension [Self <: IRawQuery](x: Self) {
    
    inline def setModifyWhere(value: CallbackTo[IRawQueryModify]): Self = StObject.set(x, "ModifyWhere", value.toJsFn)
    
    inline def setReplaceWhere(value: CallbackTo[IFieldExpression]): Self = StObject.set(x, "ReplaceWhere", value.toJsFn)
  }
}
