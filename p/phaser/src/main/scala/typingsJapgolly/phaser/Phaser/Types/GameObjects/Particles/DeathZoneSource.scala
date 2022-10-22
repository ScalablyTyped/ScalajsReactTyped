package typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeathZoneSource extends StObject {
  
  def contains(x: Double, y: Double): Unit
  @JSName("contains")
  var contains_Original: DeathZoneSourceCallback
}
object DeathZoneSource {
  
  inline def apply(contains: (/* x */ Double, /* y */ Double) => Callback): DeathZoneSource = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2((t0: /* x */ Double, t1: /* y */ Double) => (contains(t0, t1)).runNow()))
    __obj.asInstanceOf[DeathZoneSource]
  }
  
  extension [Self <: DeathZoneSource](x: Self) {
    
    inline def setContains(value: (/* x */ Double, /* y */ Double) => Callback): Self = StObject.set(x, "contains", js.Any.fromFunction2((t0: /* x */ Double, t1: /* y */ Double) => (value(t0, t1)).runNow()))
  }
}
