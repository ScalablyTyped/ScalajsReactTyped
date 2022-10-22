package typingsJapgolly.cytoscape.anon

import typingsJapgolly.cytoscape.mod.CollectionReturnValue
import typingsJapgolly.cytoscape.mod.EdgeCollection
import typingsJapgolly.cytoscape.mod.NodeCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Components extends StObject {
  
  var components: CollectionReturnValue
  
  var cut: EdgeCollection
  
  var partitionFirst: NodeCollection
  
  var partitionSecond: NodeCollection
}
object Components {
  
  inline def apply(
    components: CollectionReturnValue,
    cut: EdgeCollection,
    partitionFirst: NodeCollection,
    partitionSecond: NodeCollection
  ): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  
  extension [Self <: Components](x: Self) {
    
    inline def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setCut(value: EdgeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    
    inline def setPartitionFirst(value: NodeCollection): Self = StObject.set(x, "partitionFirst", value.asInstanceOf[js.Any])
    
    inline def setPartitionSecond(value: NodeCollection): Self = StObject.set(x, "partitionSecond", value.asInstanceOf[js.Any])
  }
}
