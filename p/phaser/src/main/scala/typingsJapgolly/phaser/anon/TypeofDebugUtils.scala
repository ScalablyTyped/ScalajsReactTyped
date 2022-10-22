package typingsJapgolly.phaser.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.spine.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDebugUtils extends StObject {
  
  /* static member */
  def logBones(skeleton: Skeleton): Unit
}
object TypeofDebugUtils {
  
  inline def apply(logBones: Skeleton => Callback): TypeofDebugUtils = {
    val __obj = js.Dynamic.literal(logBones = js.Any.fromFunction1((t0: Skeleton) => logBones(t0).runNow()))
    __obj.asInstanceOf[TypeofDebugUtils]
  }
  
  extension [Self <: TypeofDebugUtils](x: Self) {
    
    inline def setLogBones(value: Skeleton => Callback): Self = StObject.set(x, "logBones", js.Any.fromFunction1((t0: Skeleton) => value(t0).runNow()))
  }
}
