package typingsJapgolly.simpleStatistics

import typingsJapgolly.simpleStatistics.anon.Centroids
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcKMeansClusterMod {
  
  @JSImport("simple-statistics/src/k_means_cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(points: js.Array[js.Array[Double]], numCluster: Double): Centroids = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any], numCluster.asInstanceOf[js.Any])).asInstanceOf[Centroids]
  inline def default(points: js.Array[js.Array[Double]], numCluster: Double, randomSource: js.Function0[Double]): Centroids = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any], numCluster.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[Centroids]
}
