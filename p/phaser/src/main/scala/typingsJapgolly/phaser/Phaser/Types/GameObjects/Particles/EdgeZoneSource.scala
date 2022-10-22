package typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeZoneSource extends StObject {
  
  /**
    * A function placing points on the sources edge or edges.
    */
  def getPoints(quantity: Double): Unit
  def getPoints(quantity: Double, stepRate: Double): Unit
  /**
    * A function placing points on the sources edge or edges.
    */
  @JSName("getPoints")
  var getPoints_Original: EdgeZoneSourceCallback
}
object EdgeZoneSource {
  
  inline def apply(getPoints: (/* quantity */ Double, /* stepRate */ js.UndefOr[Double]) => Callback): EdgeZoneSource = {
    val __obj = js.Dynamic.literal(getPoints = js.Any.fromFunction2((t0: /* quantity */ Double, t1: /* stepRate */ js.UndefOr[Double]) => (getPoints(t0, t1)).runNow()))
    __obj.asInstanceOf[EdgeZoneSource]
  }
  
  extension [Self <: EdgeZoneSource](x: Self) {
    
    inline def setGetPoints(value: (/* quantity */ Double, /* stepRate */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "getPoints", js.Any.fromFunction2((t0: /* quantity */ Double, t1: /* stepRate */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
  }
}
