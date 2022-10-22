package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  var cluster: typingsJapgolly.yandexMaps.mod.Cluster
  
  var isClustered: Boolean
  
  var isShown: Boolean
}
object Cluster {
  
  inline def apply(cluster: typingsJapgolly.yandexMaps.mod.Cluster, isClustered: Boolean, isShown: Boolean): Cluster = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], isClustered = isClustered.asInstanceOf[js.Any], isShown = isShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setCluster(value: typingsJapgolly.yandexMaps.mod.Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setIsClustered(value: Boolean): Self = StObject.set(x, "isClustered", value.asInstanceOf[js.Any])
    
    inline def setIsShown(value: Boolean): Self = StObject.set(x, "isShown", value.asInstanceOf[js.Any])
  }
}
