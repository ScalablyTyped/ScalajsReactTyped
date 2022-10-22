package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchConditionEx extends StObject {
  
  def Clone(): ISearchConditionEx
  
  var Enabled: Boolean
  
  var Ignored: Boolean
  
  var SearchCondition: ISearchCondition
  
  def Set(SearchCondition: ISearchCondition, Enabled: Boolean, SpecialNULL: Boolean, Ignored: Boolean): Unit
  
  var SpecialNULL: Boolean
}
object ISearchConditionEx {
  
  inline def apply(
    Clone: CallbackTo[ISearchConditionEx],
    Enabled: Boolean,
    Ignored: Boolean,
    SearchCondition: ISearchCondition,
    Set: (ISearchCondition, Boolean, Boolean, Boolean) => Callback,
    SpecialNULL: Boolean
  ): ISearchConditionEx = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Enabled = Enabled.asInstanceOf[js.Any], Ignored = Ignored.asInstanceOf[js.Any], SearchCondition = SearchCondition.asInstanceOf[js.Any], Set = js.Any.fromFunction4((t0: ISearchCondition, t1: Boolean, t2: Boolean, t3: Boolean) => (Set(t0, t1, t2, t3)).runNow()), SpecialNULL = SpecialNULL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchConditionEx]
  }
  
  extension [Self <: ISearchConditionEx](x: Self) {
    
    inline def setClone(value: CallbackTo[ISearchConditionEx]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "Ignored", value.asInstanceOf[js.Any])
    
    inline def setSearchCondition(value: ISearchCondition): Self = StObject.set(x, "SearchCondition", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (ISearchCondition, Boolean, Boolean, Boolean) => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction4((t0: ISearchCondition, t1: Boolean, t2: Boolean, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSpecialNULL(value: Boolean): Self = StObject.set(x, "SpecialNULL", value.asInstanceOf[js.Any])
  }
}
