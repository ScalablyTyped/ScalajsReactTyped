package typingsJapgolly.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "AndOrNotEvaluator")
@js.native
open class AndOrNotEvaluator ()
  extends typingsJapgolly.babylonjs.miscAndOrNotEvaluatorMod.AndOrNotEvaluator
/* static members */
object AndOrNotEvaluator {
  
  @JSImport("babylonjs/Misc/index", "AndOrNotEvaluator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Evaluate a query
    * @param query defines the query to evaluate
    * @param evaluateCallback defines the callback used to filter result
    * @returns true if the query matches
    */
  inline def Eval(query: String, evaluateCallback: js.Function1[/* val */ Any, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Eval")(query.asInstanceOf[js.Any], evaluateCallback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("babylonjs/Misc/index", "AndOrNotEvaluator._HandleParenthesisContent")
  @js.native
  def _HandleParenthesisContent: Any = js.native
  inline def _HandleParenthesisContent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HandleParenthesisContent")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "AndOrNotEvaluator._SimplifyNegation")
  @js.native
  def _SimplifyNegation: Any = js.native
  inline def _SimplifyNegation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SimplifyNegation")(x.asInstanceOf[js.Any])
}
