package typingsJapgolly.phaser.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSkeletonClipping extends StObject {
  
  /* static member */
  def makeClockwise(polygon: ArrayLike[Double]): Unit
}
object TypeofSkeletonClipping {
  
  inline def apply(makeClockwise: ArrayLike[Double] => Callback): TypeofSkeletonClipping = {
    val __obj = js.Dynamic.literal(makeClockwise = js.Any.fromFunction1((t0: ArrayLike[Double]) => makeClockwise(t0).runNow()))
    __obj.asInstanceOf[TypeofSkeletonClipping]
  }
  
  extension [Self <: TypeofSkeletonClipping](x: Self) {
    
    inline def setMakeClockwise(value: ArrayLike[Double] => Callback): Self = StObject.set(x, "makeClockwise", js.Any.fromFunction1((t0: ArrayLike[Double]) => value(t0).runNow()))
  }
}
