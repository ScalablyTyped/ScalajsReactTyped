package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOptimizeVaultJob extends StObject {
  
  var GarbageCollectFiles: Boolean
  
  def GetNumberOfSteps(): Double
  
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double
  
  def GetStepProgressText(CurrentStep: Double): String
  
  def Set(GuidVault: String, Thorough: Boolean): Unit
  
  val Thorough: Boolean
  
  val VaultGUID: String
}
object IOptimizeVaultJob {
  
  inline def apply(
    GarbageCollectFiles: Boolean,
    GetNumberOfSteps: CallbackTo[Double],
    GetOneBasedIndexOfStep: Double => Double,
    GetStepProgressText: Double => String,
    Set: (String, Boolean) => Callback,
    Thorough: Boolean,
    VaultGUID: String
  ): IOptimizeVaultJob = {
    val __obj = js.Dynamic.literal(GarbageCollectFiles = GarbageCollectFiles.asInstanceOf[js.Any], GetNumberOfSteps = GetNumberOfSteps.toJsFn, GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction2((t0: String, t1: Boolean) => (Set(t0, t1)).runNow()), Thorough = Thorough.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptimizeVaultJob]
  }
  
  extension [Self <: IOptimizeVaultJob](x: Self) {
    
    inline def setGarbageCollectFiles(value: Boolean): Self = StObject.set(x, "GarbageCollectFiles", value.asInstanceOf[js.Any])
    
    inline def setGetNumberOfSteps(value: CallbackTo[Double]): Self = StObject.set(x, "GetNumberOfSteps", value.toJsFn)
    
    inline def setGetOneBasedIndexOfStep(value: Double => Double): Self = StObject.set(x, "GetOneBasedIndexOfStep", js.Any.fromFunction1(value))
    
    inline def setGetStepProgressText(value: Double => String): Self = StObject.set(x, "GetStepProgressText", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Boolean) => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setThorough(value: Boolean): Self = StObject.set(x, "Thorough", value.asInstanceOf[js.Any])
    
    inline def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
  }
}
