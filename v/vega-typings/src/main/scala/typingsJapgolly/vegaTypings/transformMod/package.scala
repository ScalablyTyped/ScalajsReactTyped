package typingsJapgolly.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transformMod {
  type ContourTransform = typingsJapgolly.vegaTypings.AnonBandwidth with (typingsJapgolly.vegaTypings.AnonNice | typingsJapgolly.vegaTypings.AnonThresholds)
  type DataName = java.lang.String
  type ExprString = java.lang.String
  type FieldRef = java.lang.String | typingsJapgolly.vegaTypings.transformMod.TransformField
  type ProjectionName = java.lang.String
  type SignalName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.transformMod.AggregateTransform
    - typingsJapgolly.vegaTypings.transformMod.BinTransform
    - typingsJapgolly.vegaTypings.transformMod.CollectTransform
    - typingsJapgolly.vegaTypings.transformMod.CountPatternTransform
    - typingsJapgolly.vegaTypings.transformMod.ContourTransform
    - typingsJapgolly.vegaTypings.transformMod.CrossTransform
    - typingsJapgolly.vegaTypings.transformMod.CrossFilterTransform
    - typingsJapgolly.vegaTypings.transformMod.DensityTransform
    - typingsJapgolly.vegaTypings.transformMod.DotBinTransform
    - typingsJapgolly.vegaTypings.transformMod.ExtentTransform
    - typingsJapgolly.vegaTypings.transformMod.FilterTransform
    - typingsJapgolly.vegaTypings.transformMod.FlattenTransform
    - typingsJapgolly.vegaTypings.transformMod.FoldTransform
    - typingsJapgolly.vegaTypings.transformMod.ForceTransform
    - typingsJapgolly.vegaTypings.transformMod.FormulaTransform
    - typingsJapgolly.vegaTypings.transformMod.HeatmapTransform
    - typingsJapgolly.vegaTypings.transformMod.GeoJSONTransform
    - typingsJapgolly.vegaTypings.transformMod.GeoPathTransform
    - typingsJapgolly.vegaTypings.transformMod.GeoPointTransform
    - typingsJapgolly.vegaTypings.transformMod.GeoShapeTransform
    - typingsJapgolly.vegaTypings.transformMod.GraticuleTransform
    - typingsJapgolly.vegaTypings.transformMod.IdentifierTransform
    - typingsJapgolly.vegaTypings.transformMod.ImputeTransform
    - typingsJapgolly.vegaTypings.transformMod.IsocontourTransform
    - typingsJapgolly.vegaTypings.transformMod.JoinAggregateTransform
    - typingsJapgolly.vegaTypings.transformMod.KDETransform
    - typingsJapgolly.vegaTypings.transformMod.KDE2DTransform
    - typingsJapgolly.vegaTypings.transformMod.LinkPathTransform
    - typingsJapgolly.vegaTypings.transformMod.LoessTransform
    - typingsJapgolly.vegaTypings.transformMod.LookupTransform
    - typingsJapgolly.vegaTypings.transformMod.NestTransform
    - typingsJapgolly.vegaTypings.transformMod.PackTransform
    - typingsJapgolly.vegaTypings.transformMod.PartitionTransform
    - typingsJapgolly.vegaTypings.transformMod.PieTransform
    - typingsJapgolly.vegaTypings.transformMod.PivotTransform
    - typingsJapgolly.vegaTypings.transformMod.ProjectTransform
    - typingsJapgolly.vegaTypings.transformMod.QuantileTransform
    - typingsJapgolly.vegaTypings.transformMod.RegressionTransform
    - typingsJapgolly.vegaTypings.transformMod.ResolveFilterTransform
    - typingsJapgolly.vegaTypings.transformMod.SampleTransform
    - typingsJapgolly.vegaTypings.transformMod.SequenceTransform
    - typingsJapgolly.vegaTypings.transformMod.StackTransform
    - typingsJapgolly.vegaTypings.transformMod.StratifyTransform
    - typingsJapgolly.vegaTypings.transformMod.TimeUnitTransform
    - typingsJapgolly.vegaTypings.transformMod.TreeTransform
    - typingsJapgolly.vegaTypings.transformMod.TreeLinksTransform
    - typingsJapgolly.vegaTypings.transformMod.TreemapTransform
    - typingsJapgolly.vegaTypings.transformMod.VoronoiTransform
    - typingsJapgolly.vegaTypings.transformMod.WindowTransform
    - typingsJapgolly.vegaTypings.transformMod.WordcloudTransform
  */
  type Transforms = typingsJapgolly.vegaTypings.transformMod._Transforms | typingsJapgolly.vegaTypings.transformMod.ContourTransform
}
