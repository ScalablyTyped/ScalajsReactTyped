package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GraphExploreControls
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GraphHop
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GraphVertexDefinition
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connections extends StObject {
  
  var connections: js.UndefOr[GraphHop] = js.undefined
  
  var controls: js.UndefOr[GraphExploreControls] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var vertices: js.UndefOr[js.Array[GraphVertexDefinition]] = js.undefined
}
object Connections {
  
  inline def apply(): Connections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connections]
  }
  
  extension [Self <: Connections](x: Self) {
    
    inline def setConnections(value: GraphHop): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setControls(value: GraphExploreControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setVertices(value: js.Array[GraphVertexDefinition]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: GraphVertexDefinition*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
