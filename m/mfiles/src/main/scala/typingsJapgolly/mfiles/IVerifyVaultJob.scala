package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVerifyVaultJob extends StObject {
  
  def Clone(): IVerifyVaultJob
  
  val FixErrors: Boolean
  
  def GetNumberOfSteps(): Double
  
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double
  
  def GetStepProgressText(CurrentStep: Double): String
  
  def Set(GuidVault: String, FixErrors: Boolean, VerifyFileContents: Boolean): Unit
  
  val VaultGUID: String
  
  val VerifyFileContents: Boolean
}
object IVerifyVaultJob {
  
  inline def apply(
    Clone: CallbackTo[IVerifyVaultJob],
    FixErrors: Boolean,
    GetNumberOfSteps: CallbackTo[Double],
    GetOneBasedIndexOfStep: Double => Double,
    GetStepProgressText: Double => String,
    Set: (String, Boolean, Boolean) => Callback,
    VaultGUID: String,
    VerifyFileContents: Boolean
  ): IVerifyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, FixErrors = FixErrors.asInstanceOf[js.Any], GetNumberOfSteps = GetNumberOfSteps.toJsFn, GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (Set(t0, t1, t2)).runNow()), VaultGUID = VaultGUID.asInstanceOf[js.Any], VerifyFileContents = VerifyFileContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerifyVaultJob]
  }
  
  extension [Self <: IVerifyVaultJob](x: Self) {
    
    inline def setClone(value: CallbackTo[IVerifyVaultJob]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setFixErrors(value: Boolean): Self = StObject.set(x, "FixErrors", value.asInstanceOf[js.Any])
    
    inline def setGetNumberOfSteps(value: CallbackTo[Double]): Self = StObject.set(x, "GetNumberOfSteps", value.toJsFn)
    
    inline def setGetOneBasedIndexOfStep(value: Double => Double): Self = StObject.set(x, "GetOneBasedIndexOfStep", js.Any.fromFunction1(value))
    
    inline def setGetStepProgressText(value: Double => String): Self = StObject.set(x, "GetStepProgressText", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
    
    inline def setVerifyFileContents(value: Boolean): Self = StObject.set(x, "VerifyFileContents", value.asInstanceOf[js.Any])
  }
}
