package typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomZoneSource extends StObject {
  
  /**
    * A function modifying its point argument.
    */
  def getRandomPoint(point: Vector2Like): Unit
  /**
    * A function modifying its point argument.
    */
  @JSName("getRandomPoint")
  var getRandomPoint_Original: RandomZoneSourceCallback
}
object RandomZoneSource {
  
  inline def apply(getRandomPoint: /* point */ Vector2Like => Callback): RandomZoneSource = {
    val __obj = js.Dynamic.literal(getRandomPoint = js.Any.fromFunction1((t0: /* point */ Vector2Like) => getRandomPoint(t0).runNow()))
    __obj.asInstanceOf[RandomZoneSource]
  }
  
  extension [Self <: RandomZoneSource](x: Self) {
    
    inline def setGetRandomPoint(value: /* point */ Vector2Like => Callback): Self = StObject.set(x, "getRandomPoint", js.Any.fromFunction1((t0: /* point */ Vector2Like) => value(t0).runNow()))
  }
}
