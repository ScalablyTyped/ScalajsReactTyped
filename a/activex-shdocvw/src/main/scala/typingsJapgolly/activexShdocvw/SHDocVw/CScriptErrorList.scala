package typingsJapgolly.activexShdocvw.SHDocVw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CScriptErrorList extends StObject {
  
  /* private */ @JSName("SHDocVw.CScriptErrorList_typekey")
  var SHDocVwDotCScriptErrorList_typekey: CScriptErrorList
  
  def advanceError(): Unit
  
  def canAdvanceError(): Double
  
  def canRetreatError(): Double
  
  def getAlwaysShowLockState(): Double
  
  def getDetailsPaneOpen(): Double
  
  def getErrorChar(): Double
  
  def getErrorCode(): Double
  
  def getErrorLine(): Double
  
  def getErrorMsg(): String
  
  def getErrorUrl(): String
  
  def getPerErrorDisplay(): Double
  
  def retreatError(): Unit
  
  def setDetailsPaneOpen(fDetailsPaneOpen: Double): Unit
  
  def setPerErrorDisplay(fPerErrorDisplay: Double): Unit
}
object CScriptErrorList {
  
  inline def apply(
    SHDocVwDotCScriptErrorList_typekey: CScriptErrorList,
    advanceError: Callback,
    canAdvanceError: CallbackTo[Double],
    canRetreatError: CallbackTo[Double],
    getAlwaysShowLockState: CallbackTo[Double],
    getDetailsPaneOpen: CallbackTo[Double],
    getErrorChar: CallbackTo[Double],
    getErrorCode: CallbackTo[Double],
    getErrorLine: CallbackTo[Double],
    getErrorMsg: CallbackTo[String],
    getErrorUrl: CallbackTo[String],
    getPerErrorDisplay: CallbackTo[Double],
    retreatError: Callback,
    setDetailsPaneOpen: Double => Callback,
    setPerErrorDisplay: Double => Callback
  ): CScriptErrorList = {
    val __obj = js.Dynamic.literal(advanceError = advanceError.toJsFn, canAdvanceError = canAdvanceError.toJsFn, canRetreatError = canRetreatError.toJsFn, getAlwaysShowLockState = getAlwaysShowLockState.toJsFn, getDetailsPaneOpen = getDetailsPaneOpen.toJsFn, getErrorChar = getErrorChar.toJsFn, getErrorCode = getErrorCode.toJsFn, getErrorLine = getErrorLine.toJsFn, getErrorMsg = getErrorMsg.toJsFn, getErrorUrl = getErrorUrl.toJsFn, getPerErrorDisplay = getPerErrorDisplay.toJsFn, retreatError = retreatError.toJsFn, setDetailsPaneOpen = js.Any.fromFunction1((t0: Double) => setDetailsPaneOpen(t0).runNow()), setPerErrorDisplay = js.Any.fromFunction1((t0: Double) => setPerErrorDisplay(t0).runNow()))
    __obj.updateDynamic("SHDocVw.CScriptErrorList_typekey")(SHDocVwDotCScriptErrorList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CScriptErrorList]
  }
  
  extension [Self <: CScriptErrorList](x: Self) {
    
    inline def setAdvanceError(value: Callback): Self = StObject.set(x, "advanceError", value.toJsFn)
    
    inline def setCanAdvanceError(value: CallbackTo[Double]): Self = StObject.set(x, "canAdvanceError", value.toJsFn)
    
    inline def setCanRetreatError(value: CallbackTo[Double]): Self = StObject.set(x, "canRetreatError", value.toJsFn)
    
    inline def setGetAlwaysShowLockState(value: CallbackTo[Double]): Self = StObject.set(x, "getAlwaysShowLockState", value.toJsFn)
    
    inline def setGetDetailsPaneOpen(value: CallbackTo[Double]): Self = StObject.set(x, "getDetailsPaneOpen", value.toJsFn)
    
    inline def setGetErrorChar(value: CallbackTo[Double]): Self = StObject.set(x, "getErrorChar", value.toJsFn)
    
    inline def setGetErrorCode(value: CallbackTo[Double]): Self = StObject.set(x, "getErrorCode", value.toJsFn)
    
    inline def setGetErrorLine(value: CallbackTo[Double]): Self = StObject.set(x, "getErrorLine", value.toJsFn)
    
    inline def setGetErrorMsg(value: CallbackTo[String]): Self = StObject.set(x, "getErrorMsg", value.toJsFn)
    
    inline def setGetErrorUrl(value: CallbackTo[String]): Self = StObject.set(x, "getErrorUrl", value.toJsFn)
    
    inline def setGetPerErrorDisplay(value: CallbackTo[Double]): Self = StObject.set(x, "getPerErrorDisplay", value.toJsFn)
    
    inline def setRetreatError(value: Callback): Self = StObject.set(x, "retreatError", value.toJsFn)
    
    inline def setSHDocVwDotCScriptErrorList_typekey(value: CScriptErrorList): Self = StObject.set(x, "SHDocVw.CScriptErrorList_typekey", value.asInstanceOf[js.Any])
    
    inline def setSetDetailsPaneOpen(value: Double => Callback): Self = StObject.set(x, "setDetailsPaneOpen", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPerErrorDisplay(value: Double => Callback): Self = StObject.set(x, "setPerErrorDisplay", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
