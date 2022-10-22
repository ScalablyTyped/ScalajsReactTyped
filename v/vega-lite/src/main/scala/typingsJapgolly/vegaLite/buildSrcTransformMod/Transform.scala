package typingsJapgolly.vegaLite.buildSrcTransformMod

import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldName
import typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalComposition
import typingsJapgolly.vegaLite.buildSrcPredicateMod.Predicate
import typingsJapgolly.vegaLite.buildSrcTimeunitMod.TimeUnit
import typingsJapgolly.vegaLite.buildSrcTimeunitMod.TimeUnitParams
import typingsJapgolly.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaLite.buildSrcTransformMod.AggregateTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.BinTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.CalculateTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.DensityTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.FilterTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.FlattenTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.FoldTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.ImputeTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.JoinAggregateTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.LoessTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.LookupTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.QuantileTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.RegressionTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.TimeUnitTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.SampleTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.StackTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.WindowTransform
  - typingsJapgolly.vegaLite.buildSrcTransformMod.PivotTransform
*/
trait Transform extends StObject
object Transform {
  
  inline def AggregateTransform(aggregate: js.Array[AggregatedFieldDef]): typingsJapgolly.vegaLite.buildSrcTransformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.AggregateTransform]
  }
  
  inline def BinTransform(as: FieldName | js.Array[FieldName], bin: `true` | BinParams, field: FieldName): typingsJapgolly.vegaLite.buildSrcTransformMod.BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.BinTransform]
  }
  
  inline def CalculateTransform(as: FieldName, calculate: String): typingsJapgolly.vegaLite.buildSrcTransformMod.CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], calculate = calculate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.CalculateTransform]
  }
  
  inline def DensityTransform(density: FieldName): typingsJapgolly.vegaLite.buildSrcTransformMod.DensityTransform = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.DensityTransform]
  }
  
  inline def FilterTransform(filter: LogicalComposition[Predicate]): typingsJapgolly.vegaLite.buildSrcTransformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.FilterTransform]
  }
  
  inline def FlattenTransform(flatten: js.Array[FieldName]): typingsJapgolly.vegaLite.buildSrcTransformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.FlattenTransform]
  }
  
  inline def FoldTransform(fold: js.Array[FieldName]): typingsJapgolly.vegaLite.buildSrcTransformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.FoldTransform]
  }
  
  inline def ImputeTransform(impute: FieldName, key: FieldName): typingsJapgolly.vegaLite.buildSrcTransformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(impute = impute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.ImputeTransform]
  }
  
  inline def JoinAggregateTransform(joinaggregate: js.Array[JoinAggregateFieldDef]): typingsJapgolly.vegaLite.buildSrcTransformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal(joinaggregate = joinaggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.JoinAggregateTransform]
  }
  
  inline def LoessTransform(loess: FieldName, on: FieldName): typingsJapgolly.vegaLite.buildSrcTransformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(loess = loess.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.LoessTransform]
  }
  
  inline def LookupTransform(from: LookupData | LookupSelection, lookup: String): typingsJapgolly.vegaLite.buildSrcTransformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.LookupTransform]
  }
  
  inline def PivotTransform(pivot: FieldName, value: FieldName): typingsJapgolly.vegaLite.buildSrcTransformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(pivot = pivot.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.PivotTransform]
  }
  
  inline def QuantileTransform(quantile: FieldName): typingsJapgolly.vegaLite.buildSrcTransformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(quantile = quantile.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.QuantileTransform]
  }
  
  inline def RegressionTransform(on: FieldName, regression: FieldName): typingsJapgolly.vegaLite.buildSrcTransformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], regression = regression.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.RegressionTransform]
  }
  
  inline def SampleTransform(sample: Double): typingsJapgolly.vegaLite.buildSrcTransformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.SampleTransform]
  }
  
  inline def StackTransform(as: FieldName | (js.Tuple2[FieldName, FieldName]), groupby: js.Array[FieldName], stack: FieldName): typingsJapgolly.vegaLite.buildSrcTransformMod.StackTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.StackTransform]
  }
  
  inline def TimeUnitTransform(as: FieldName, field: FieldName, timeUnit: TimeUnit | TimeUnitParams): typingsJapgolly.vegaLite.buildSrcTransformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.TimeUnitTransform]
  }
  
  inline def WindowTransform(window: js.Array[WindowFieldDef]): typingsJapgolly.vegaLite.buildSrcTransformMod.WindowTransform = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcTransformMod.WindowTransform]
  }
}
