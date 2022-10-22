package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extendables
trait canBeEnabled extends StObject {
  
  def enable(): Unit
  
  def isEnabled(): Boolean
  
  def isPaused(): Boolean
  
  def pause(): Unit
}
object canBeEnabled {
  
  inline def apply(enable: Callback, isEnabled: CallbackTo[Boolean], isPaused: CallbackTo[Boolean], pause: Callback): canBeEnabled = {
    val __obj = js.Dynamic.literal(enable = enable.toJsFn, isEnabled = isEnabled.toJsFn, isPaused = isPaused.toJsFn, pause = pause.toJsFn)
    __obj.asInstanceOf[canBeEnabled]
  }
  
  extension [Self <: canBeEnabled](x: Self) {
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
    
    inline def setIsPaused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPaused", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
  }
}
