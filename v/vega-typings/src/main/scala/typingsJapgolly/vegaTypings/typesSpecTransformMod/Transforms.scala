package typingsJapgolly.vegaTypings.typesSpecTransformMod

import typingsJapgolly.vegaTypings.typesSpecMarkMod.Compare
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.typesSpecUtilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.AggregateTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.BinTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.CollectTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.CountPatternTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.ContourTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.CrossTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.CrossFilterTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.DensityTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.DotBinTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.ExtentTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.FilterTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.FlattenTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.FoldTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.ForceTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.FormulaTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.HeatmapTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoJSONTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoPathTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoPointTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoShapeTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.GraticuleTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.IdentifierTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.ImputeTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.IsocontourTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.JoinAggregateTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.KDETransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.KDE2DTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.LabelTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.LinkPathTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.LoessTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.LookupTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.NestTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.PackTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.PartitionTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.PieTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.PivotTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.ProjectTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.QuantileTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.RegressionTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.ResolveFilterTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.SampleTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.SequenceTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.StackTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.StratifyTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.TimeUnitTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.TreeTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.TreeLinksTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.TreemapTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.VoronoiTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.WindowTransform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.WordcloudTransform
*/
trait Transforms extends StObject
object Transforms {
  
  inline def AggregateTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("aggregate")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.AggregateTransform]
  }
  
  inline def BinTransform(extent: (Vector2[Double | SignalRef]) | SignalRef, field: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.BinTransform = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bin")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.BinTransform]
  }
  
  inline def CollectTransform(sort: Compare): typingsJapgolly.vegaTypings.typesSpecTransformMod.CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.CollectTransform]
  }
  
  inline def CountPatternTransform(field: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.CountPatternTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("countpattern")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.CountPatternTransform]
  }
  
  inline def CrossFilterTransform(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef
  ): typingsJapgolly.vegaTypings.typesSpecTransformMod.CrossFilterTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("crossfilter")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.CrossFilterTransform]
  }
  
  inline def CrossTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.CrossTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("cross")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.CrossTransform]
  }
  
  inline def DensityTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("density")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.DensityTransform]
  }
  
  inline def DotBinTransform(field: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.DotBinTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dotbin")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.DotBinTransform]
  }
  
  inline def ExtentTransform(field: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("extent")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.ExtentTransform]
  }
  
  inline def FilterTransform(expr: ExprString): typingsJapgolly.vegaTypings.typesSpecTransformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filter")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.FilterTransform]
  }
  
  inline def FlattenTransform(fields: js.Array[FieldRef] | SignalRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("flatten")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.FlattenTransform]
  }
  
  inline def FoldTransform(fields: js.Array[FieldRef] | SignalRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fold")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.FoldTransform]
  }
  
  inline def ForceTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("force")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.ForceTransform]
  }
  
  inline def FormulaTransform(as: String | SignalRef, expr: ExprString): typingsJapgolly.vegaTypings.typesSpecTransformMod.FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("formula")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.FormulaTransform]
  }
  
  inline def GeoJSONTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoJSONTransform]
  }
  
  inline def GeoPathTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geopath")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoPathTransform]
  }
  
  inline def GeoPointTransform(fields: Vector2[FieldRef] | SignalRef, projection: ProjectionName): typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("geopoint")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoPointTransform]
  }
  
  inline def GeoShapeTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoShapeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geoshape")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.GeoShapeTransform]
  }
  
  inline def GraticuleTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("graticule")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.GraticuleTransform]
  }
  
  inline def HeatmapTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.HeatmapTransform]
  }
  
  inline def IdentifierTransform(as: String | SignalRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.IdentifierTransform]
  }
  
  inline def ImputeTransform(field: FieldRef, key: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("impute")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.ImputeTransform]
  }
  
  inline def IsocontourTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("isocontour")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.IsocontourTransform]
  }
  
  inline def JoinAggregateTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("joinaggregate")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.JoinAggregateTransform]
  }
  
  inline def KDE2DTransform(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    x: String | TransformField,
    y: String | TransformField
  ): typingsJapgolly.vegaTypings.typesSpecTransformMod.KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kde2d")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.KDE2DTransform]
  }
  
  inline def KDETransform(field: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.KDETransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kde")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.KDETransform]
  }
  
  inline def LabelTransform(size: (Vector2[Double | SignalRef]) | SignalRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.LabelTransform]
  }
  
  inline def LinkPathTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linkpath")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.LinkPathTransform]
  }
  
  inline def LoessTransform(x: FieldRef, y: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("loess")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.LoessTransform]
  }
  
  inline def LookupTransform(fields: js.Array[FieldRef] | SignalRef, from: DataName, key: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("lookup")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.LookupTransform]
  }
  
  inline def NestTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nest")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.NestTransform]
  }
  
  inline def PackTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.PackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pack")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.PackTransform]
  }
  
  inline def PartitionTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.PartitionTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("partition")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.PartitionTransform]
  }
  
  inline def PieTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.PieTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pie")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.PieTransform]
  }
  
  inline def PivotTransform(field: FieldRef, value: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pivot")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.PivotTransform]
  }
  
  inline def ProjectTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("project")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.ProjectTransform]
  }
  
  inline def QuantileTransform(field: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantile")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.QuantileTransform]
  }
  
  inline def RegressionTransform(x: FieldRef, y: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("regression")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.RegressionTransform]
  }
  
  inline def ResolveFilterTransform(filter: SignalRef, ignore: Double | SignalRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("resolvefilter")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.ResolveFilterTransform]
  }
  
  inline def SampleTransform(size: Double | SignalRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sample")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.SampleTransform]
  }
  
  inline def SequenceTransform(start: Double | SignalRef, stop: Double | SignalRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.SequenceTransform = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequence")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.SequenceTransform]
  }
  
  inline def StackTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.StackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stack")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.StackTransform]
  }
  
  inline def StratifyTransform(key: FieldRef, parentKey: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stratify")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.StratifyTransform]
  }
  
  inline def TimeUnitTransform(field: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timeunit")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.TimeUnitTransform]
  }
  
  inline def TreeLinksTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("treelinks")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.TreeLinksTransform]
  }
  
  inline def TreeTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("tree")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.TreeTransform]
  }
  
  inline def TreemapTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("treemap")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.TreemapTransform]
  }
  
  inline def VoronoiTransform(x: FieldRef, y: FieldRef): typingsJapgolly.vegaTypings.typesSpecTransformMod.VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("voronoi")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.VoronoiTransform]
  }
  
  inline def WindowTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("window")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.WindowTransform]
  }
  
  inline def WordcloudTransform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wordcloud")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.WordcloudTransform]
  }
  
  inline def countnumberSignalRefundef(size: (js.Array[Double | SignalRef]) | SignalRef): typingsJapgolly.vegaTypings.anon.countnumberSignalRefundef = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.countnumberSignalRefundef]
  }
  
  inline def thresholdsArraynumberSign(size: (js.Array[Double | SignalRef]) | SignalRef): typingsJapgolly.vegaTypings.anon.thresholdsArraynumberSign = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.thresholdsArraynumberSign]
  }
}
