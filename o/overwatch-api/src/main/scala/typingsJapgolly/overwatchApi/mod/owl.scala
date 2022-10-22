package typingsJapgolly.overwatchApi.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait owl extends StObject {
  
  def getLiveMatch(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
  
  def getSchedule(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
  
  def getStandings(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
}
object owl {
  
  inline def apply(
    getLiveMatch: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback,
    getSchedule: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback,
    getStandings: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback
  ): owl = {
    val __obj = js.Dynamic.literal(getLiveMatch = js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => getLiveMatch(t0).runNow()), getSchedule = js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => getSchedule(t0).runNow()), getStandings = js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => getStandings(t0).runNow()))
    __obj.asInstanceOf[owl]
  }
  
  extension [Self <: owl](x: Self) {
    
    inline def setGetLiveMatch(value: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback): Self = StObject.set(x, "getLiveMatch", js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => value(t0).runNow()))
    
    inline def setGetSchedule(value: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback): Self = StObject.set(x, "getSchedule", js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => value(t0).runNow()))
    
    inline def setGetStandings(value: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback): Self = StObject.set(x, "getStandings", js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => value(t0).runNow()))
  }
}
