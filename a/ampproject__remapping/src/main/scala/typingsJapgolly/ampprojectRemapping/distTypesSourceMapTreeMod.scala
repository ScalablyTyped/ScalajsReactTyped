package typingsJapgolly.ampprojectRemapping

import typingsJapgolly.jridgewellGenMapping.mod.GenMapping
import typingsJapgolly.jridgewellTraceMapping.mod.TraceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSourceMapTreeMod {
  
  @JSImport("@ampproject/remapping/dist/types/source-map-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MapSource
    extends StObject
       with Sources {
    
    var content: String | Null
    
    var map: TraceMap
    
    var source: String
    
    var sources: js.Array[Sources]
  }
  object MapSource {
    
    @JSImport("@ampproject/remapping/dist/types/source-map-tree", "MapSource")
    @js.native
    def apply(map: TraceMap, sources: js.Array[Sources]): MapSource = js.native
    
    extension [Self <: MapSource](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setMap(value: TraceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[Sources]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: Sources*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  trait OriginalSource
    extends StObject
       with Sources {
    
    var content: String | Null
    
    var map: TraceMap
    
    var source: String
    
    var sources: js.Array[Sources]
  }
  object OriginalSource {
    
    @JSImport("@ampproject/remapping/dist/types/source-map-tree", "OriginalSource")
    @js.native
    def apply(source: String): OriginalSource = js.native
    @JSImport("@ampproject/remapping/dist/types/source-map-tree", "OriginalSource")
    @js.native
    def apply(source: String, content: String): OriginalSource = js.native
    
    extension [Self <: OriginalSource](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setMap(value: TraceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[Sources]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: Sources*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  inline def originalPositionFor(source: Sources, line: Double, column: Double, name: String): SourceMapSegmentObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("originalPositionFor")(source.asInstanceOf[js.Any], line.asInstanceOf[js.Any], column.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[SourceMapSegmentObject | Null]
  
  inline def traceMappings(tree: MapSource): GenMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("traceMappings")(tree.asInstanceOf[js.Any]).asInstanceOf[GenMapping]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ampprojectRemapping.anon.Column
    - typingsJapgolly.ampprojectRemapping.anon.Content
  */
  trait SourceMapSegmentObject extends StObject
  object SourceMapSegmentObject {
    
    inline def Column(column: Double, line: Double, name: String, source: String): typingsJapgolly.ampprojectRemapping.anon.Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[typingsJapgolly.ampprojectRemapping.anon.Column]
    }
    
    inline def Content(column: Null, content: Null, line: Null, name: Null, source: Null): typingsJapgolly.ampprojectRemapping.anon.Content = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ampprojectRemapping.anon.Content]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ampprojectRemapping.distTypesSourceMapTreeMod.OriginalSource
    - typingsJapgolly.ampprojectRemapping.distTypesSourceMapTreeMod.MapSource
  */
  trait Sources extends StObject
  object Sources {
    
    inline def MapSource(map: TraceMap, source: String, sources: js.Array[Sources]): typingsJapgolly.ampprojectRemapping.distTypesSourceMapTreeMod.MapSource = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[typingsJapgolly.ampprojectRemapping.distTypesSourceMapTreeMod.MapSource]
    }
    
    inline def OriginalSource(map: TraceMap, source: String, sources: js.Array[Sources]): typingsJapgolly.ampprojectRemapping.distTypesSourceMapTreeMod.OriginalSource = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[typingsJapgolly.ampprojectRemapping.distTypesSourceMapTreeMod.OriginalSource]
    }
  }
}
