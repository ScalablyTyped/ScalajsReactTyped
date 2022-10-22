package typingsJapgolly.rrdtool

import typingsJapgolly.rrdtool.anon.Force
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rrdtool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[D /* <: RrdtoolData */](file: String, opts: Force, args: js.Array[RrdtoolArgument[D]]): RrdtoolDatabase[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RrdtoolDatabase[D]]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def open(file: String): RrdtoolDatabase[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any]).asInstanceOf[RrdtoolDatabase[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rrdtool.rrdtoolStrings.AVERAGE
    - typingsJapgolly.rrdtool.rrdtoolStrings.MIN
    - typingsJapgolly.rrdtool.rrdtoolStrings.MAX
    - typingsJapgolly.rrdtool.rrdtoolStrings.LAST
  */
  trait ConsolidationFunction extends StObject
  object ConsolidationFunction {
    
    inline def AVERAGE: typingsJapgolly.rrdtool.rrdtoolStrings.AVERAGE = "AVERAGE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.AVERAGE]
    
    inline def LAST: typingsJapgolly.rrdtool.rrdtoolStrings.LAST = "LAST".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.LAST]
    
    inline def MAX: typingsJapgolly.rrdtool.rrdtoolStrings.MAX = "MAX".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.MAX]
    
    inline def MIN: typingsJapgolly.rrdtool.rrdtoolStrings.MIN = "MIN".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.MIN]
  }
  
  type DataSource[D /* <: RrdtoolData */] = DataSource_[D] | DataSourceCompute[D]
  
  // XXX: Enhance rpn-expression type
  // DS:ds-name:COMPUTE:rpn-expression
  type DataSourceCompute[D /* <: RrdtoolData */] = /* template literal string: DS:${keyofD&string}:COMPUTE:${string} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rrdtool.rrdtoolStrings.COMPUTE
    - typingsJapgolly.rrdtool.rrdtoolStrings.GAUGE
    - typingsJapgolly.rrdtool.rrdtoolStrings.COUNTER
    - typingsJapgolly.rrdtool.rrdtoolStrings.DCOUNTER
    - typingsJapgolly.rrdtool.rrdtoolStrings.DERIVE
    - typingsJapgolly.rrdtool.rrdtoolStrings.DDERIVE
    - typingsJapgolly.rrdtool.rrdtoolStrings.ABSOLUTE
  */
  trait DataSourceType extends StObject
  object DataSourceType {
    
    inline def ABSOLUTE: typingsJapgolly.rrdtool.rrdtoolStrings.ABSOLUTE = "ABSOLUTE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.ABSOLUTE]
    
    inline def COMPUTE: typingsJapgolly.rrdtool.rrdtoolStrings.COMPUTE = "COMPUTE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.COMPUTE]
    
    inline def COUNTER: typingsJapgolly.rrdtool.rrdtoolStrings.COUNTER = "COUNTER".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.COUNTER]
    
    inline def DCOUNTER: typingsJapgolly.rrdtool.rrdtoolStrings.DCOUNTER = "DCOUNTER".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.DCOUNTER]
    
    inline def DDERIVE: typingsJapgolly.rrdtool.rrdtoolStrings.DDERIVE = "DDERIVE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.DDERIVE]
    
    inline def DERIVE: typingsJapgolly.rrdtool.rrdtoolStrings.DERIVE = "DERIVE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.DERIVE]
    
    inline def GAUGE: typingsJapgolly.rrdtool.rrdtoolStrings.GAUGE = "GAUGE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.GAUGE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rrdtool.rrdtoolStrings.GAUGE
    - typingsJapgolly.rrdtool.rrdtoolStrings.COUNTER
    - typingsJapgolly.rrdtool.rrdtoolStrings.DCOUNTER
    - typingsJapgolly.rrdtool.rrdtoolStrings.DERIVE
    - typingsJapgolly.rrdtool.rrdtoolStrings.DDERIVE
    - typingsJapgolly.rrdtool.rrdtoolStrings.ABSOLUTE
  */
  trait DataSourceType_ extends StObject
  object DataSourceType_ {
    
    inline def ABSOLUTE: typingsJapgolly.rrdtool.rrdtoolStrings.ABSOLUTE = "ABSOLUTE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.ABSOLUTE]
    
    inline def COUNTER: typingsJapgolly.rrdtool.rrdtoolStrings.COUNTER = "COUNTER".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.COUNTER]
    
    inline def DCOUNTER: typingsJapgolly.rrdtool.rrdtoolStrings.DCOUNTER = "DCOUNTER".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.DCOUNTER]
    
    inline def DDERIVE: typingsJapgolly.rrdtool.rrdtoolStrings.DDERIVE = "DDERIVE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.DDERIVE]
    
    inline def DERIVE: typingsJapgolly.rrdtool.rrdtoolStrings.DERIVE = "DERIVE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.DERIVE]
    
    inline def GAUGE: typingsJapgolly.rrdtool.rrdtoolStrings.GAUGE = "GAUGE".asInstanceOf[typingsJapgolly.rrdtool.rrdtoolStrings.GAUGE]
  }
  
  // DS:ds-name:{GAUGE | COUNTER | DERIVE | DCOUNTER | DDERIVE | ABSOLUTE}:heartbeat:min:max
  type DataSource_[D /* <: RrdtoolData */] = /* template literal string: DS:${keyofD&string}:${DataSourceType_}:${Duration}:${number}:${number} */ String
  
  type Duration = Double | (/* template literal string: ${number}${s|m|h|d|w|M|y} */ String)
  
  // XXX: Not really correct, this would be better but does not work correctly (?):
  // (error: Error, data: undefined) => void | ((error: null, data: Array<DataPoint<A>>) => void)
  type FetchCallback[D /* <: RrdtoolData */] = js.Function2[/* error */ js.Error, /* data */ js.Array[RrdtoolDataPoint[D]], Unit]
  
  type RoundRobinArchive = RoundRobinArchive_ | RoundRobinArchiveHWPredict | RoundRobinArchiveSeasonal | RoundRobinArchiveDevPredict | RoundRobinArchiveFailures
  
  // RRA:DEVPREDICT:rows:rra-num
  type RoundRobinArchiveDevPredict = /* template literal string: RRA:DEVPREDICT:${Duration}:${number} */ String
  
  // RRA:FAILURES:rows:threshold:window length:rra-num
  type RoundRobinArchiveFailures = /* template literal string: RRA:FAILURES:${Duration}:${number}:${number}:${number} */ String
  
  // RRA:{HWPREDICT | MHWPREDICT}:rows:alpha:beta:seasonal period[:rra-num]
  type RoundRobinArchiveHWPredict = /* template literal string: RRA:${HWPREDICT|MHWPREDICT}:${Duration}:${number}:${number}:${Duration}${||:${number}} */ String
  
  // RRA:{SEASONAL | DEVSEASONAL}:seasonal period:gamma:rra-num[:smoothing-window]
  type RoundRobinArchiveSeasonal = /* template literal string: RRA:${SEASONAL|DEVSEASONAL}:${Duration}:${number}:${number}${||:${number}} */ String
  
  // RRA:{AVERAGE | MIN | MAX | LAST}:xff:steps:rows
  type RoundRobinArchive_ = /* template literal string: RRA:${ConsolidationFunction}:${number}:${Duration}:${Duration} */ String
  
  type RrdtoolArgument[D /* <: RrdtoolData */] = DataSource[D] | RoundRobinArchive
  
  type RrdtoolData = Record[String, Double]
  
  trait RrdtoolDataPoint[D /* <: RrdtoolData */] extends StObject {
    
    var time: Timestamp
    
    var values: D
  }
  object RrdtoolDataPoint {
    
    inline def apply[D /* <: RrdtoolData */](time: Timestamp, values: D): RrdtoolDataPoint[D] = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RrdtoolDataPoint[D]]
    }
    
    extension [Self <: RrdtoolDataPoint[?], D /* <: RrdtoolData */](x: Self & RrdtoolDataPoint[D]) {
      
      inline def setTime(value: Timestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setValues(value: D): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RrdtoolDatabase[D /* <: RrdtoolData */] extends StObject {
    
    def fetch(cf: ConsolidationFunction, start: Timestamp, stop: Timestamp, cb: FetchCallback[D]): Unit = js.native
    /**
      * Fetch a span of data from the database.
      */
    def fetch(cf: ConsolidationFunction, start: Timestamp, stop: Timestamp, res: Double, cb: FetchCallback[D]): Unit = js.native
    
    /**
      * Insert data into the database.
      */
    def update(ts: Timestamp, values: Partial[D]): Unit = js.native
    def update(ts: Timestamp, values: Partial[D], cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    def update(values: D): Unit = js.native
    def update(values: D, cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  }
  
  type Timestamp = Double
}
