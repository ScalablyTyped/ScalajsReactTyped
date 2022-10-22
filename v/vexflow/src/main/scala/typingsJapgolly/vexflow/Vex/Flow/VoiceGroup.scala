package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceGroup extends StObject {
  
  def addVoice(voice: Voice): Unit
  
  def getModifierContexts(): js.Array[ModifierContext]
  
  def getVoices(): js.Array[Voice]
}
object VoiceGroup {
  
  inline def apply(
    addVoice: Voice => Callback,
    getModifierContexts: CallbackTo[js.Array[ModifierContext]],
    getVoices: CallbackTo[js.Array[Voice]]
  ): VoiceGroup = {
    val __obj = js.Dynamic.literal(addVoice = js.Any.fromFunction1((t0: Voice) => addVoice(t0).runNow()), getModifierContexts = getModifierContexts.toJsFn, getVoices = getVoices.toJsFn)
    __obj.asInstanceOf[VoiceGroup]
  }
  
  extension [Self <: VoiceGroup](x: Self) {
    
    inline def setAddVoice(value: Voice => Callback): Self = StObject.set(x, "addVoice", js.Any.fromFunction1((t0: Voice) => value(t0).runNow()))
    
    inline def setGetModifierContexts(value: CallbackTo[js.Array[ModifierContext]]): Self = StObject.set(x, "getModifierContexts", value.toJsFn)
    
    inline def setGetVoices(value: CallbackTo[js.Array[Voice]]): Self = StObject.set(x, "getVoices", value.toJsFn)
  }
}
