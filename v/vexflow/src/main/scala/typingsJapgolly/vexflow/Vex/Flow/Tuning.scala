package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tuning extends StObject {
  
  def getNoteForFret(fretNum: String, stringNum: String): String
  
  def getValueForFret(fretNum: String, stringNum: String): Double
  
  def getValueForString(stringNum: String): Double
  
  def noteToInteger(noteString: String): Double
  
  def setTuning(tuningString: String): Unit
}
object Tuning {
  
  inline def apply(
    getNoteForFret: (String, String) => String,
    getValueForFret: (String, String) => Double,
    getValueForString: String => Double,
    noteToInteger: String => Double,
    setTuning: String => Callback
  ): Tuning = {
    val __obj = js.Dynamic.literal(getNoteForFret = js.Any.fromFunction2(getNoteForFret), getValueForFret = js.Any.fromFunction2(getValueForFret), getValueForString = js.Any.fromFunction1(getValueForString), noteToInteger = js.Any.fromFunction1(noteToInteger), setTuning = js.Any.fromFunction1((t0: String) => setTuning(t0).runNow()))
    __obj.asInstanceOf[Tuning]
  }
  
  extension [Self <: Tuning](x: Self) {
    
    inline def setGetNoteForFret(value: (String, String) => String): Self = StObject.set(x, "getNoteForFret", js.Any.fromFunction2(value))
    
    inline def setGetValueForFret(value: (String, String) => Double): Self = StObject.set(x, "getValueForFret", js.Any.fromFunction2(value))
    
    inline def setGetValueForString(value: String => Double): Self = StObject.set(x, "getValueForString", js.Any.fromFunction1(value))
    
    inline def setNoteToInteger(value: String => Double): Self = StObject.set(x, "noteToInteger", js.Any.fromFunction1(value))
    
    inline def setSetTuning(value: String => Callback): Self = StObject.set(x, "setTuning", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
