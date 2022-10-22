package typingsJapgolly.phaser.MatterJS

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SleepingFactory extends StObject {
  
  def set(body: BodyType, isSleeping: Boolean): Unit
}
object SleepingFactory {
  
  inline def apply(set: (BodyType, Boolean) => Callback): SleepingFactory = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2((t0: BodyType, t1: Boolean) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[SleepingFactory]
  }
  
  extension [Self <: SleepingFactory](x: Self) {
    
    inline def setSet(value: (BodyType, Boolean) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: BodyType, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
