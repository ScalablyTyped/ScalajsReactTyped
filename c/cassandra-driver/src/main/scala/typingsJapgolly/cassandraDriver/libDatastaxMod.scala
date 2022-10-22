package typingsJapgolly.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cassandraDriver.libTypesMod.types.ResultSet
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Iterator
import typingsJapgolly.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatastaxMod {
  
  object datastax {
    
    object graph {
      
      @JSImport("cassandra-driver/lib/datastax", "datastax.graph")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("cassandra-driver/lib/datastax", "datastax.graph.GraphResultSet")
      @js.native
      open class GraphResultSet protected ()
        extends StObject
           with Iterator[Any, Any, Unit] {
        def this(rs: ResultSet) = this()
        
        def first(): Any = js.native
        
        def next(): IteratorResult[Any, Any] = js.native
        def next(value: Any): IteratorResult[Any, Any] = js.native
        
        def toArray(): js.Array[Any] = js.native
        
        def values(): js.Iterator[Any] = js.native
      }
      
      inline def asDouble(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      
      inline def asFloat(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      
      inline def asInt(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      
      inline def asTimestamp(value: js.Date): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asTimestamp")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      
      inline def asUdt(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asUdt")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      
      object direction {
        
        @JSImport("cassandra-driver/lib/datastax", "datastax.graph.direction.both")
        @js.native
        val both: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.EnumValue = js.native
        
        // `in` is a reserved word
        @JSImport("cassandra-driver/lib/datastax", "datastax.graph.direction.in_")
        @js.native
        val in: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.EnumValue = js.native
        
        @JSImport("cassandra-driver/lib/datastax", "datastax.graph.direction.out")
        @js.native
        val out: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.EnumValue = js.native
      }
      
      object t {
        
        @JSImport("cassandra-driver/lib/datastax", "datastax.graph.t.id")
        @js.native
        val id: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.EnumValue = js.native
        
        @JSImport("cassandra-driver/lib/datastax", "datastax.graph.t.key")
        @js.native
        val key: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.EnumValue = js.native
        
        @JSImport("cassandra-driver/lib/datastax", "datastax.graph.t.label")
        @js.native
        val label: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.EnumValue = js.native
        
        @JSImport("cassandra-driver/lib/datastax", "datastax.graph.t.value")
        @js.native
        val value: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.EnumValue = js.native
      }
      
      trait Edge
        extends StObject
           with typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.Element {
        
        var inV: js.UndefOr[typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.Vertex] = js.undefined
        
        var inVLabel: js.UndefOr[String] = js.undefined
        
        var outV: js.UndefOr[typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.Vertex] = js.undefined
        
        var outVLabel: js.UndefOr[String] = js.undefined
        
        var properties: js.UndefOr[js.Object] = js.undefined
      }
      object Edge {
        
        inline def apply(id: Any, label: String): Edge = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[Edge]
        }
        
        extension [Self <: Edge](x: Self) {
          
          inline def setInV(value: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.Vertex): Self = StObject.set(x, "inV", value.asInstanceOf[js.Any])
          
          inline def setInVLabel(value: String): Self = StObject.set(x, "inVLabel", value.asInstanceOf[js.Any])
          
          inline def setInVLabelUndefined: Self = StObject.set(x, "inVLabel", js.undefined)
          
          inline def setInVUndefined: Self = StObject.set(x, "inV", js.undefined)
          
          inline def setOutV(value: typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.Vertex): Self = StObject.set(x, "outV", value.asInstanceOf[js.Any])
          
          inline def setOutVLabel(value: String): Self = StObject.set(x, "outVLabel", value.asInstanceOf[js.Any])
          
          inline def setOutVLabelUndefined: Self = StObject.set(x, "outVLabel", js.undefined)
          
          inline def setOutVUndefined: Self = StObject.set(x, "outV", js.undefined)
          
          inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
          
          inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        }
      }
      
      trait Element extends StObject {
        
        var id: Any
        
        var label: String
      }
      object Element {
        
        inline def apply(id: Any, label: String): Element = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[Element]
        }
        
        extension [Self <: Element](x: Self) {
          
          inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        }
      }
      
      trait EnumValue extends StObject
      
      trait Path extends StObject {
        
        var labels: js.Array[Any]
        
        var objects: js.Array[Any]
      }
      object Path {
        
        inline def apply(labels: js.Array[Any], objects: js.Array[Any]): Path = {
          val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
          __obj.asInstanceOf[Path]
        }
        
        extension [Self <: Path](x: Self) {
          
          inline def setLabels(value: js.Array[Any]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
          
          inline def setLabelsVarargs(value: Any*): Self = StObject.set(x, "labels", js.Array(value*))
          
          inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
          
          inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
        }
      }
      
      trait Property extends StObject {
        
        var key: Any
        
        var value: Any
      }
      object Property {
        
        inline def apply(key: Any, value: Any): Property = {
          val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
          __obj.asInstanceOf[Property]
        }
        
        extension [Self <: Property](x: Self) {
          
          inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
          
          inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        }
      }
      
      trait Vertex
        extends StObject
           with typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.Element {
        
        var properties: js.UndefOr[StringDictionary[js.Array[Any]]] = js.undefined
      }
      object Vertex {
        
        inline def apply(id: Any, label: String): Vertex = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[Vertex]
        }
        
        extension [Self <: Vertex](x: Self) {
          
          inline def setProperties(value: StringDictionary[js.Array[Any]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
          
          inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        }
      }
      
      trait VertexProperty
        extends StObject
           with typingsJapgolly.cassandraDriver.libDatastaxGraphMod.graph.Element {
        
        var key: String
        
        var properties: js.UndefOr[Any] = js.undefined
        
        var value: Any
      }
      object VertexProperty {
        
        inline def apply(id: Any, key: String, label: String, value: Any): VertexProperty = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
          __obj.asInstanceOf[VertexProperty]
        }
        
        extension [Self <: VertexProperty](x: Self) {
          
          inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
          
          inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
          
          inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
          
          inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object search {
      
      @JSImport("cassandra-driver/lib/datastax", "datastax.search.DateRange")
      @js.native
      open class DateRange protected () extends StObject {
        def this(
          lowerBound: typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound,
          upperBound: typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound
        ) = this()
        
        def equals(other: typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound): Boolean = js.native
        
        var lowerBound: typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound = js.native
        
        var upperBound: typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound = js.native
      }
      object DateRange {
        
        @JSImport("cassandra-driver/lib/datastax", "datastax.search.DateRange")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        inline def fromBuffer(value: Buffer): typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRange]
        
        /* static member */
        inline def fromString(value: String): typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRange]
      }
      
      @JSImport("cassandra-driver/lib/datastax", "datastax.search.DateRangeBound")
      @js.native
      open class DateRangeBound () extends StObject {
        
        var date: js.Date = js.native
        
        def equals(other: typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound): Boolean = js.native
        
        var precision: Double = js.native
      }
      object DateRangeBound {
        
        @JSImport("cassandra-driver/lib/datastax", "datastax.search.DateRangeBound")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        inline def fromString(value: String): typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound]
        
        /* static member */
        inline def toLowerBound(bound: typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound): typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerBound")(bound.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound]
        
        /* static member */
        inline def toUpperBound(bound: typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound): typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("toUpperBound")(bound.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libDatastaxSearchMod.search.DateRangeBound]
      }
      
      @js.native
      sealed trait dateRangePrecision extends StObject
      @JSImport("cassandra-driver/lib/datastax", "datastax.search.dateRangePrecision")
      @js.native
      object dateRangePrecision extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[dateRangePrecision & Double] = js.native
        
        @js.native
        sealed trait day
          extends StObject
             with dateRangePrecision
        /* 1 */ val day: typingsJapgolly.cassandraDriver.libDatastaxMod.datastax.search.dateRangePrecision.day & Double = js.native
        
        @js.native
        sealed trait hour
          extends StObject
             with dateRangePrecision
        /* 2 */ val hour: typingsJapgolly.cassandraDriver.libDatastaxMod.datastax.search.dateRangePrecision.hour & Double = js.native
        
        @js.native
        sealed trait millisecond
          extends StObject
             with dateRangePrecision
        /* 5 */ val millisecond: typingsJapgolly.cassandraDriver.libDatastaxMod.datastax.search.dateRangePrecision.millisecond & Double = js.native
        
        @js.native
        sealed trait minute
          extends StObject
             with dateRangePrecision
        /* 3 */ val minute: typingsJapgolly.cassandraDriver.libDatastaxMod.datastax.search.dateRangePrecision.minute & Double = js.native
        
        @js.native
        sealed trait month
          extends StObject
             with dateRangePrecision
        /* 0 */ val month: typingsJapgolly.cassandraDriver.libDatastaxMod.datastax.search.dateRangePrecision.month & Double = js.native
        
        @js.native
        sealed trait second
          extends StObject
             with dateRangePrecision
        /* 4 */ val second: typingsJapgolly.cassandraDriver.libDatastaxMod.datastax.search.dateRangePrecision.second & Double = js.native
        
        @js.native
        sealed trait year
          extends StObject
             with dateRangePrecision
        /* 0 */ val year: typingsJapgolly.cassandraDriver.libDatastaxMod.datastax.search.dateRangePrecision.year & Double = js.native
      }
    }
  }
}
