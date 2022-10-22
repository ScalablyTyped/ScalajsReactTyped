package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.anon.AccidentalNote
import typingsJapgolly.vexflow.anon.Change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyManager extends StObject {
  
  def getAccidental(key: String): AccidentalNote
  
  def getKey(): String
  
  def reset(): KeyManager
  
  def selectNote(note: String): Change
  
  def setKey(key: String): KeyManager
}
object KeyManager {
  
  inline def apply(
    getAccidental: String => AccidentalNote,
    getKey: CallbackTo[String],
    reset: CallbackTo[KeyManager],
    selectNote: String => Change,
    setKey: String => KeyManager
  ): KeyManager = {
    val __obj = js.Dynamic.literal(getAccidental = js.Any.fromFunction1(getAccidental), getKey = getKey.toJsFn, reset = reset.toJsFn, selectNote = js.Any.fromFunction1(selectNote), setKey = js.Any.fromFunction1(setKey))
    __obj.asInstanceOf[KeyManager]
  }
  
  extension [Self <: KeyManager](x: Self) {
    
    inline def setGetAccidental(value: String => AccidentalNote): Self = StObject.set(x, "getAccidental", js.Any.fromFunction1(value))
    
    inline def setGetKey(value: CallbackTo[String]): Self = StObject.set(x, "getKey", value.toJsFn)
    
    inline def setReset(value: CallbackTo[KeyManager]): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSelectNote(value: String => Change): Self = StObject.set(x, "selectNote", js.Any.fromFunction1(value))
    
    inline def setSetKey(value: String => KeyManager): Self = StObject.set(x, "setKey", js.Any.fromFunction1(value))
  }
}
