package typingsJapgolly.vegaLite

import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldName
import typingsJapgolly.vegaTypings.typesSpecTransformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAggregateMod {
  
  @JSImport("vega-lite/build/src/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "COUNTING_OPS")
  @js.native
  val COUNTING_OPS: ReadonlySet[NonArgAggregateOp] = js.native
  
  object MULTIDOMAIN_SORT_OP_INDEX {
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.count")
    @js.native
    def count: Double = js.native
    inline def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.max")
    @js.native
    def max: Double = js.native
    inline def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.min")
    @js.native
    def min: Double = js.native
    inline def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/aggregate", "SHARED_DOMAIN_OPS")
  @js.native
  val SHARED_DOMAIN_OPS: ReadonlySet[AggregateOp] = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "SUM_OPS")
  @js.native
  val SUM_OPS: ReadonlySet[NonArgAggregateOp] = js.native
  
  inline def isAggregateOp(a: String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  inline def isAggregateOp(a: ArgmaxDef): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  inline def isAggregateOp(a: ArgminDef): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  
  inline def isArgmaxDef(a: String): /* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgmaxDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean]
  inline def isArgmaxDef(a: Aggregate): /* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgmaxDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean]
  
  inline def isArgminDef(a: String): /* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgminDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean]
  inline def isArgminDef(a: Aggregate): /* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgminDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean]
  
  inline def isCountingAggregateOp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")().asInstanceOf[Boolean]
  inline def isCountingAggregateOp(aggregate: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCountingAggregateOp(aggregate: Aggregate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMinMaxOp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")().asInstanceOf[Boolean]
  inline def isMinMaxOp(aggregate: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMinMaxOp(aggregate: Aggregate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Inlined vega-lite.vega-lite/build/src/aggregate.NonArgAggregateOp | vega-lite.vega-lite/build/src/aggregate.ArgmaxDef | vega-lite.vega-lite/build/src/aggregate.ArgminDef */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.max
    - typingsJapgolly.vegaLite.vegaLiteStrings.q1
    - typingsJapgolly.vegaLite.vegaLiteStrings.median
    - typingsJapgolly.vegaLite.vegaLiteStrings.q3
    - typingsJapgolly.vegaLite.vegaLiteStrings.argmax
    - typingsJapgolly.vegaLite.vegaLiteStrings.mean
    - typingsJapgolly.vegaLite.vegaLiteStrings.sum
    - typingsJapgolly.vegaLite.vegaLiteStrings.variance
    - typingsJapgolly.vegaLite.vegaLiteStrings.stdev
    - typingsJapgolly.vegaLite.vegaLiteStrings.argmin
    - typingsJapgolly.vegaLite.vegaLiteStrings.min
    - typingsJapgolly.vegaLite.vegaLiteStrings.valid
    - typingsJapgolly.vegaLite.vegaLiteStrings.missing
    - typingsJapgolly.vegaLite.vegaLiteStrings.stdevp
    - typingsJapgolly.vegaLite.vegaLiteStrings.distinct
    - typingsJapgolly.vegaLite.vegaLiteStrings.ci0
    - typingsJapgolly.vegaLite.vegaLiteStrings.product
    - typingsJapgolly.vegaLite.vegaLiteStrings.stderr
    - typingsJapgolly.vegaLite.vegaLiteStrings.count
    - typingsJapgolly.vegaLite.vegaLiteStrings.ci1
    - typingsJapgolly.vegaLite.vegaLiteStrings.average
    - typingsJapgolly.vegaLite.vegaLiteStrings.values
    - typingsJapgolly.vegaLite.vegaLiteStrings.variancep
  */
  trait Aggregate extends StObject
  object Aggregate {
    
    inline def argmax: typingsJapgolly.vegaLite.vegaLiteStrings.argmax = "argmax".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.argmax]
    
    inline def argmin: typingsJapgolly.vegaLite.vegaLiteStrings.argmin = "argmin".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.argmin]
    
    inline def average: typingsJapgolly.vegaLite.vegaLiteStrings.average = "average".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.average]
    
    inline def ci0: typingsJapgolly.vegaLite.vegaLiteStrings.ci0 = "ci0".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.ci0]
    
    inline def ci1: typingsJapgolly.vegaLite.vegaLiteStrings.ci1 = "ci1".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.ci1]
    
    inline def count: typingsJapgolly.vegaLite.vegaLiteStrings.count = "count".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.count]
    
    inline def distinct: typingsJapgolly.vegaLite.vegaLiteStrings.distinct = "distinct".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.distinct]
    
    inline def max: typingsJapgolly.vegaLite.vegaLiteStrings.max = "max".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.max]
    
    inline def mean: typingsJapgolly.vegaLite.vegaLiteStrings.mean = "mean".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.mean]
    
    inline def median: typingsJapgolly.vegaLite.vegaLiteStrings.median = "median".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.median]
    
    inline def min: typingsJapgolly.vegaLite.vegaLiteStrings.min = "min".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.min]
    
    inline def missing: typingsJapgolly.vegaLite.vegaLiteStrings.missing = "missing".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.missing]
    
    inline def product: typingsJapgolly.vegaLite.vegaLiteStrings.product = "product".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.product]
    
    inline def q1: typingsJapgolly.vegaLite.vegaLiteStrings.q1 = "q1".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.q1]
    
    inline def q3: typingsJapgolly.vegaLite.vegaLiteStrings.q3 = "q3".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.q3]
    
    inline def stderr: typingsJapgolly.vegaLite.vegaLiteStrings.stderr = "stderr".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.stderr]
    
    inline def stdev: typingsJapgolly.vegaLite.vegaLiteStrings.stdev = "stdev".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.stdev]
    
    inline def stdevp: typingsJapgolly.vegaLite.vegaLiteStrings.stdevp = "stdevp".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.stdevp]
    
    inline def sum: typingsJapgolly.vegaLite.vegaLiteStrings.sum = "sum".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.sum]
    
    inline def valid: typingsJapgolly.vegaLite.vegaLiteStrings.valid = "valid".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.valid]
    
    inline def values: typingsJapgolly.vegaLite.vegaLiteStrings.values = "values".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.values]
    
    inline def variance: typingsJapgolly.vegaLite.vegaLiteStrings.variance = "variance".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.variance]
    
    inline def variancep: typingsJapgolly.vegaLite.vegaLiteStrings.variancep = "variancep".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.variancep]
  }
  
  trait ArgmaxDef extends StObject {
    
    var argmax: FieldName
  }
  object ArgmaxDef {
    
    inline def apply(argmax: FieldName): ArgmaxDef = {
      val __obj = js.Dynamic.literal(argmax = argmax.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgmaxDef]
    }
    
    extension [Self <: ArgmaxDef](x: Self) {
      
      inline def setArgmax(value: FieldName): Self = StObject.set(x, "argmax", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArgminDef extends StObject {
    
    var argmin: FieldName
  }
  object ArgminDef {
    
    inline def apply(argmin: FieldName): ArgminDef = {
      val __obj = js.Dynamic.literal(argmin = argmin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgminDef]
    }
    
    extension [Self <: ArgminDef](x: Self) {
      
      inline def setArgmin(value: FieldName): Self = StObject.set(x, "argmin", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Exclude<vega.vega.AggregateOp, 'argmin' | 'argmax'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.max
    - typingsJapgolly.vegaLite.vegaLiteStrings.q1
    - typingsJapgolly.vegaLite.vegaLiteStrings.median
    - typingsJapgolly.vegaLite.vegaLiteStrings.q3
    - typingsJapgolly.vegaLite.vegaLiteStrings.mean
    - typingsJapgolly.vegaLite.vegaLiteStrings.sum
    - typingsJapgolly.vegaLite.vegaLiteStrings.variance
    - typingsJapgolly.vegaLite.vegaLiteStrings.stdev
    - typingsJapgolly.vegaLite.vegaLiteStrings.min
    - typingsJapgolly.vegaLite.vegaLiteStrings.valid
    - typingsJapgolly.vegaLite.vegaLiteStrings.missing
    - typingsJapgolly.vegaLite.vegaLiteStrings.stdevp
    - typingsJapgolly.vegaLite.vegaLiteStrings.distinct
    - typingsJapgolly.vegaLite.vegaLiteStrings.ci0
    - typingsJapgolly.vegaLite.vegaLiteStrings.product
    - typingsJapgolly.vegaLite.vegaLiteStrings.stderr
    - typingsJapgolly.vegaLite.vegaLiteStrings.count
    - typingsJapgolly.vegaLite.vegaLiteStrings.ci1
    - typingsJapgolly.vegaLite.vegaLiteStrings.average
    - typingsJapgolly.vegaLite.vegaLiteStrings.values
    - typingsJapgolly.vegaLite.vegaLiteStrings.variancep
  */
  trait NonArgAggregateOp extends StObject
  object NonArgAggregateOp {
    
    inline def average: typingsJapgolly.vegaLite.vegaLiteStrings.average = "average".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.average]
    
    inline def ci0: typingsJapgolly.vegaLite.vegaLiteStrings.ci0 = "ci0".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.ci0]
    
    inline def ci1: typingsJapgolly.vegaLite.vegaLiteStrings.ci1 = "ci1".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.ci1]
    
    inline def count: typingsJapgolly.vegaLite.vegaLiteStrings.count = "count".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.count]
    
    inline def distinct: typingsJapgolly.vegaLite.vegaLiteStrings.distinct = "distinct".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.distinct]
    
    inline def max: typingsJapgolly.vegaLite.vegaLiteStrings.max = "max".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.max]
    
    inline def mean: typingsJapgolly.vegaLite.vegaLiteStrings.mean = "mean".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.mean]
    
    inline def median: typingsJapgolly.vegaLite.vegaLiteStrings.median = "median".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.median]
    
    inline def min: typingsJapgolly.vegaLite.vegaLiteStrings.min = "min".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.min]
    
    inline def missing: typingsJapgolly.vegaLite.vegaLiteStrings.missing = "missing".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.missing]
    
    inline def product: typingsJapgolly.vegaLite.vegaLiteStrings.product = "product".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.product]
    
    inline def q1: typingsJapgolly.vegaLite.vegaLiteStrings.q1 = "q1".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.q1]
    
    inline def q3: typingsJapgolly.vegaLite.vegaLiteStrings.q3 = "q3".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.q3]
    
    inline def stderr: typingsJapgolly.vegaLite.vegaLiteStrings.stderr = "stderr".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.stderr]
    
    inline def stdev: typingsJapgolly.vegaLite.vegaLiteStrings.stdev = "stdev".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.stdev]
    
    inline def stdevp: typingsJapgolly.vegaLite.vegaLiteStrings.stdevp = "stdevp".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.stdevp]
    
    inline def sum: typingsJapgolly.vegaLite.vegaLiteStrings.sum = "sum".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.sum]
    
    inline def valid: typingsJapgolly.vegaLite.vegaLiteStrings.valid = "valid".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.valid]
    
    inline def values: typingsJapgolly.vegaLite.vegaLiteStrings.values = "values".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.values]
    
    inline def variance: typingsJapgolly.vegaLite.vegaLiteStrings.variance = "variance".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.variance]
    
    inline def variancep: typingsJapgolly.vegaLite.vegaLiteStrings.variancep = "variancep".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.variancep]
  }
}
