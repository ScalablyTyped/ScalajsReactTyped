package typingsJapgolly.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompareOperator extends StObject
@JSImport("business-rules-engine", "CompareOperator")
@js.native
object CompareOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompareOperator & Double] = js.native
  
  @js.native
  sealed trait Equal
    extends StObject
       with CompareOperator
  /* 2 */ val Equal: typingsJapgolly.businessRulesEngine.mod.CompareOperator.Equal & Double = js.native
  
  @js.native
  sealed trait GreaterThan
    extends StObject
       with CompareOperator
  /* 5 */ val GreaterThan: typingsJapgolly.businessRulesEngine.mod.CompareOperator.GreaterThan & Double = js.native
  
  @js.native
  sealed trait GreaterThanEqual
    extends StObject
       with CompareOperator
  /* 4 */ val GreaterThanEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.GreaterThanEqual & Double = js.native
  
  @js.native
  sealed trait LessThan
    extends StObject
       with CompareOperator
  /* 0 */ val LessThan: typingsJapgolly.businessRulesEngine.mod.CompareOperator.LessThan & Double = js.native
  
  @js.native
  sealed trait LessThanEqual
    extends StObject
       with CompareOperator
  /* 1 */ val LessThanEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.LessThanEqual & Double = js.native
  
  @js.native
  sealed trait NotEqual
    extends StObject
       with CompareOperator
  /* 3 */ val NotEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.NotEqual & Double = js.native
}
