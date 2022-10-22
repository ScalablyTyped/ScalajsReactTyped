package typingsJapgolly.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRetInsertRet extends StObject {
  
  def replace(updateOrReplaceExpr: Any): UpsertRetInsertRetUpdateRet
  @JSName("replace")
  var replace_Original: js.Function1[/* updateOrReplaceExpr */ Any, UpsertRetInsertRetUpdateRet]
  
  def update(updateOrReplaceExpr: Any): UpsertRetInsertRetUpdateRet
}
object UpsertRetInsertRet {
  
  inline def apply(
    replace: /* updateOrReplaceExpr */ Any => UpsertRetInsertRetUpdateRet,
    update: Any => UpsertRetInsertRetUpdateRet
  ): UpsertRetInsertRet = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction1(replace), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UpsertRetInsertRet]
  }
  
  extension [Self <: UpsertRetInsertRet](x: Self) {
    
    inline def setReplace(value: /* updateOrReplaceExpr */ Any => UpsertRetInsertRetUpdateRet): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: Any => UpsertRetInsertRetUpdateRet): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
