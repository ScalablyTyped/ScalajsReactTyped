package typingsJapgolly.cassandraDriver.mod

import typingsJapgolly.cassandraDriver.typesMod.types.ResultSet
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "datastax")
@js.native
object datastax extends js.Object {
  @js.native
  object graph extends js.Object {
    @js.native
    class GraphResultSet protected ()
      extends typingsJapgolly.cassandraDriver.datastaxMod.datastax.graph.GraphResultSet {
      def this(rs: ResultSet) = this()
    }
    
  }
  
  @js.native
  object search extends js.Object {
    @js.native
    class DateRange protected ()
      extends typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.DateRange {
      def this(
        lowerBound: typingsJapgolly.cassandraDriver.searchMod.search.DateRangeBound,
        upperBound: typingsJapgolly.cassandraDriver.searchMod.search.DateRangeBound
      ) = this()
    }
    
    @js.native
    class DateRangeBound ()
      extends typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.DateRangeBound
    
    /* static members */
    @js.native
    object DateRange extends js.Object {
      def fromBuffer(value: Buffer): typingsJapgolly.cassandraDriver.searchMod.search.DateRange = js.native
      def fromString(value: String): typingsJapgolly.cassandraDriver.searchMod.search.DateRange = js.native
    }
    
    /* static members */
    @js.native
    object DateRangeBound extends js.Object {
      def fromString(value: String): typingsJapgolly.cassandraDriver.searchMod.search.DateRangeBound = js.native
      def toLowerBound(bound: typingsJapgolly.cassandraDriver.searchMod.search.DateRangeBound): typingsJapgolly.cassandraDriver.searchMod.search.DateRangeBound = js.native
      def toUpperBound(bound: typingsJapgolly.cassandraDriver.searchMod.search.DateRangeBound): typingsJapgolly.cassandraDriver.searchMod.search.DateRangeBound = js.native
    }
    
    @js.native
    object dateRangePrecision extends js.Object {
      /* 1 */ val day: typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.day with Double = js.native
      /* 2 */ val hour: typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.hour with Double = js.native
      /* 5 */ val millisecond: typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.millisecond with Double = js.native
      /* 3 */ val minute: typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.minute with Double = js.native
      /* 0 */ val month: typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.month with Double = js.native
      /* 4 */ val second: typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.second with Double = js.native
      /* 0 */ val year: typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.year with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision with Double
          ] = js.native
    }
    
  }
  
}

