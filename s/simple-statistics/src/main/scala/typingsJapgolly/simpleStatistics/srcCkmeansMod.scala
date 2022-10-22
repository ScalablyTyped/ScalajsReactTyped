package typingsJapgolly.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCkmeansMod {
  
  @JSImport("simple-statistics/src/ckmeans", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Array[Double] */](x: T, nClusters: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], nClusters.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
