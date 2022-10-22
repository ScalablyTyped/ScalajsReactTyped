package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesBucketConstructionState extends StObject {
  
  def GetInsertionIndex(maskPosition: RulesPosition): Double
  
  def IncreaseInsertionIndex(maskPosition: RulesPosition): Unit
  
  /* private */ var rulesInsertionIndexBitmap: Any
}
object RulesBucketConstructionState {
  
  inline def apply(
    GetInsertionIndex: RulesPosition => Double,
    IncreaseInsertionIndex: RulesPosition => Callback,
    rulesInsertionIndexBitmap: Any
  ): RulesBucketConstructionState = {
    val __obj = js.Dynamic.literal(GetInsertionIndex = js.Any.fromFunction1(GetInsertionIndex), IncreaseInsertionIndex = js.Any.fromFunction1((t0: RulesPosition) => IncreaseInsertionIndex(t0).runNow()), rulesInsertionIndexBitmap = rulesInsertionIndexBitmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesBucketConstructionState]
  }
  
  extension [Self <: RulesBucketConstructionState](x: Self) {
    
    inline def setGetInsertionIndex(value: RulesPosition => Double): Self = StObject.set(x, "GetInsertionIndex", js.Any.fromFunction1(value))
    
    inline def setIncreaseInsertionIndex(value: RulesPosition => Callback): Self = StObject.set(x, "IncreaseInsertionIndex", js.Any.fromFunction1((t0: RulesPosition) => value(t0).runNow()))
    
    inline def setRulesInsertionIndexBitmap(value: Any): Self = StObject.set(x, "rulesInsertionIndexBitmap", value.asInstanceOf[js.Any])
  }
}
