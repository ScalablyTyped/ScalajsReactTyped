package typingsJapgolly.antvDataSet

import typingsJapgolly.antvDataSet.anon.Edges
import typingsJapgolly.antvDataSet.anon.Type
import typingsJapgolly.antvDataSet.anon.TypeT
import typingsJapgolly.antvDataSet.anon.TypeofDataSetInstantiable
import typingsJapgolly.antvDataSet.antvDataSetStrings.GeoJSON
import typingsJapgolly.antvDataSet.antvDataSetStrings.HexJSON
import typingsJapgolly.antvDataSet.antvDataSetStrings.TopoJSON
import typingsJapgolly.antvDataSet.antvDataSetStrings.`fill-rows`
import typingsJapgolly.antvDataSet.antvDataSetStrings.`hex-json`
import typingsJapgolly.antvDataSet.antvDataSetStrings.`kernel-smoothDotdensity`
import typingsJapgolly.antvDataSet.antvDataSetStrings.`kernel-smoothDotregression`
import typingsJapgolly.antvDataSet.antvDataSetStrings.`rename-fields`
import typingsJapgolly.antvDataSet.antvDataSetStrings.`sort-by`
import typingsJapgolly.antvDataSet.antvDataSetStrings.`tag-cloud`
import typingsJapgolly.antvDataSet.antvDataSetStrings.`word-cloud`
import typingsJapgolly.antvDataSet.antvDataSetStrings.adjacency
import typingsJapgolly.antvDataSet.antvDataSetStrings.aggregate
import typingsJapgolly.antvDataSet.antvDataSetStrings.arc
import typingsJapgolly.antvDataSet.antvDataSetStrings.binDotdot
import typingsJapgolly.antvDataSet.antvDataSetStrings.binDothex
import typingsJapgolly.antvDataSet.antvDataSetStrings.binDothexagon
import typingsJapgolly.antvDataSet.antvDataSetStrings.binDothistogram
import typingsJapgolly.antvDataSet.antvDataSetStrings.binDotquantile
import typingsJapgolly.antvDataSet.antvDataSetStrings.binDotrect
import typingsJapgolly.antvDataSet.antvDataSetStrings.binDotrectangle
import typingsJapgolly.antvDataSet.antvDataSetStrings.csv
import typingsJapgolly.antvDataSet.antvDataSetStrings.default
import typingsJapgolly.antvDataSet.antvDataSetStrings.diagram
import typingsJapgolly.antvDataSet.antvDataSetStrings.diagramDotarc
import typingsJapgolly.antvDataSet.antvDataSetStrings.diagramDotsankey
import typingsJapgolly.antvDataSet.antvDataSetStrings.diagramDotvoronoi
import typingsJapgolly.antvDataSet.antvDataSetStrings.dsv
import typingsJapgolly.antvDataSet.antvDataSetStrings.fillRows
import typingsJapgolly.antvDataSet.antvDataSetStrings.filter
import typingsJapgolly.antvDataSet.antvDataSetStrings.fold
import typingsJapgolly.antvDataSet.antvDataSetStrings.geo
import typingsJapgolly.antvDataSet.antvDataSetStrings.geoDotcentroid
import typingsJapgolly.antvDataSet.antvDataSetStrings.geoDotprojection
import typingsJapgolly.antvDataSet.antvDataSetStrings.geoDotregion
import typingsJapgolly.antvDataSet.antvDataSetStrings.geojson_
import typingsJapgolly.antvDataSet.antvDataSetStrings.graph
import typingsJapgolly.antvDataSet.antvDataSetStrings.group
import typingsJapgolly.antvDataSet.antvDataSetStrings.groups
import typingsJapgolly.antvDataSet.antvDataSetStrings.hex
import typingsJapgolly.antvDataSet.antvDataSetStrings.hexbin
import typingsJapgolly.antvDataSet.antvDataSetStrings.hexjson_
import typingsJapgolly.antvDataSet.antvDataSetStrings.hierarchy
import typingsJapgolly.antvDataSet.antvDataSetStrings.hierarchyDotpartition
import typingsJapgolly.antvDataSet.antvDataSetStrings.hierarchyDottreemap
import typingsJapgolly.antvDataSet.antvDataSetStrings.impute
import typingsJapgolly.antvDataSet.antvDataSetStrings.kernelDotdensity
import typingsJapgolly.antvDataSet.antvDataSetStrings.kernelDotregression
import typingsJapgolly.antvDataSet.antvDataSetStrings.map
import typingsJapgolly.antvDataSet.antvDataSetStrings.partition
import typingsJapgolly.antvDataSet.antvDataSetStrings.percent
import typingsJapgolly.antvDataSet.antvDataSetStrings.pick
import typingsJapgolly.antvDataSet.antvDataSetStrings.proportion
import typingsJapgolly.antvDataSet.antvDataSetStrings.regression
import typingsJapgolly.antvDataSet.antvDataSetStrings.rename
import typingsJapgolly.antvDataSet.antvDataSetStrings.reverse
import typingsJapgolly.antvDataSet.antvDataSetStrings.sankey
import typingsJapgolly.antvDataSet.antvDataSetStrings.sort
import typingsJapgolly.antvDataSet.antvDataSetStrings.sortBy
import typingsJapgolly.antvDataSet.antvDataSetStrings.subset
import typingsJapgolly.antvDataSet.antvDataSetStrings.summary
import typingsJapgolly.antvDataSet.antvDataSetStrings.topojson_
import typingsJapgolly.antvDataSet.antvDataSetStrings.tree
import typingsJapgolly.antvDataSet.antvDataSetStrings.treemap
import typingsJapgolly.antvDataSet.antvDataSetStrings.tsv
import typingsJapgolly.antvDataSet.antvDataSetStrings.voronoi
import typingsJapgolly.antvDataSet.libApiGeoMod.GeoApi
import typingsJapgolly.antvDataSet.libApiHierarchyMod.HierarchyApi
import typingsJapgolly.antvDataSet.libApiPartitionMod.PartitionApi
import typingsJapgolly.antvDataSet.libApiStatisticsMod.StatisticsApi
import typingsJapgolly.antvDataSet.libDataSetMod.DataSet
import typingsJapgolly.wolfy87Eventemitter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewMod {
  
  @JSImport("@antv/data-set/lib/view", "View")
  @js.native
  open class View ()
    extends ^
       with StatisticsApi
       with PartitionApi
       with HierarchyApi
       with GeoApi {
    def this(dataSet: DataSet) = this()
    def this(options: ViewOptions) = this()
    def this(dataSet: Unit, options: ViewOptions) = this()
    def this(dataSet: DataSet, options: ViewOptions) = this()
    
    var _GridHexJSON: Any = js.native
    
    var _HexJSON: Any = js.native
    
    /* private */ var _executeTransform: Any = js.native
    
    var _gridRows: Any = js.native
    
    /* private */ var _parseStateExpression: Any = js.native
    
    /* private */ var _prepareSource: Any = js.native
    
    /* private */ var _preparseOptions: Any = js.native
    
    var _projectedAs: js.Array[String] = js.native
    
    /* private */ var _reExecute: Any = js.native
    
    /* private */ var _reExecuteTransforms: Any = js.native
    
    var _source: CustomSource = js.native
    
    var _tagCloud: Any = js.native
    
    def addRow(row: Any): Unit = js.native
    
    /* CompleteClass */
    override def average(column: String): Double = js.native
    
    /**
      * 关联的数据集
      */
    var dataSet: DataSet | Null = js.native
    
    /**
      * 数据视图类型
      */
    var dataType: String = js.native
    
    var edges: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def extent(column: String): Double = js.native
    
    def findRow(query: Any): Any = js.native
    
    def findRows(query: Any): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def getAllEdges(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def getAllLinks(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def getAllNodes(): js.Array[Any] = js.native
    
    def getColumn(columnName: String): js.Array[Any] = js.native
    
    def getColumnData(columnName: String): js.Array[Any] = js.native
    
    def getColumnIndex(columnName: String): Double = js.native
    
    def getColumnName(index: Double): String = js.native
    
    def getColumnNames(): js.Array[String] = js.native
    
    def getSubset(startRowIndex: Double, endRowIndex: Double, columnNames: js.Array[String]): js.Array[Any] = js.native
    
    var graph: Edges = js.native
    
    /**
      * 是否是View
      */
    var isDataView: Boolean = js.native
    
    /**
      * 是否是View
      */
    var isView: Boolean = js.native
    
    /**
      * 是否关联了数据集
      */
    var loose: Boolean = js.native
    
    /* CompleteClass */
    override def max(column: String): Double = js.native
    
    /* CompleteClass */
    override def mean(column: String): Double = js.native
    
    /* CompleteClass */
    override def median(column: String): Double = js.native
    
    /* CompleteClass */
    override def min(column: String): Double = js.native
    
    /* CompleteClass */
    override def mode(column: String): Double = js.native
    
    var nodes: js.Array[Any] = js.native
    
    /**
      * 原始数据
      */
    var origin: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def product(column: String): Double = js.native
    
    /* CompleteClass */
    override def quantile(column: String, percent: Double): Double = js.native
    
    /* CompleteClass */
    override def quantiles(column: String, percents: js.Array[Double]): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def quantilesByFraction(column: String, fraction: Double): Double = js.native
    
    /* CompleteClass */
    override def range(column: String): js.Tuple2[Double, Double] = js.native
    
    def removeRow(index: Double): Unit = js.native
    
    /**
      * 存储处理后的数据
      */
    var rows: js.Array[Any] = js.native
    
    /**
      * 载入数据
      *
      * @remarks
      * data 是原始数据，可能是字符串，也可能是数组、对象，或者另一个数据视图实例。options 里指定了载入数据使用的 connector 和载入时使用的配置项。
      *
      * @param source - 数据
      * @param options- 数据解析配置
      */
    def source(source: String): View = js.native
    def source(
      source: /* import warning: importer.ImportType#apply Failed type conversion: [string, {}][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [string, @antv/data-set.@antv/data-set/lib/connector/dsv.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/graph.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [std.Array<any>, @antv/data-set.@antv/data-set/lib/connector/hexjson.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, {}][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/hierarchy.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/topojson.Options][0] */ js.Any,
      options: ConnectorOptions[
          GeoJSON | HexJSON | TopoJSON | csv | diagram | dsv | geo | geojson_ | graph | hex | `hex-json` | hexjson_ | hierarchy | topojson_ | tree | tsv
        ]
    ): View = js.native
    def source(source: js.Array[Any]): View = js.native
    def source(source: View): View = js.native
    
    /* CompleteClass */
    override def standardDeviation(column: String): Double = js.native
    
    /* CompleteClass */
    override def sum(column: String): Double = js.native
    
    /* CompleteClass */
    override def sumSimple(column: String): Double = js.native
    
    def toString(prettyPrint: Boolean): String = js.native
    
    /**
      *  执行数据处理数据。执行完这个函数后，transform 会被存储
      * @param options - 某种类型的transform
      */
    def transform(): View = js.native
    @JSName("transform")
    def transform_adjacency(options: TransformOptions[adjacency]): View = js.native
    @JSName("transform")
    def transform_aggregate(options: TransformOptions[aggregate]): View = js.native
    @JSName("transform")
    def transform_arc(options: TransformOptions[arc]): View = js.native
    @JSName("transform")
    def transform_bindot(options: TransformOptions[binDotdot]): View = js.native
    @JSName("transform")
    def transform_binhex(options: TransformOptions[binDothex]): View = js.native
    @JSName("transform")
    def transform_binhexagon(options: TransformOptions[binDothexagon]): View = js.native
    @JSName("transform")
    def transform_binhistogram(options: TransformOptions[binDothistogram]): View = js.native
    @JSName("transform")
    def transform_binquantile(options: TransformOptions[binDotquantile]): View = js.native
    @JSName("transform")
    def transform_binrect(options: TransformOptions[binDotrect]): View = js.native
    @JSName("transform")
    def transform_binrectangle(options: TransformOptions[binDotrectangle]): View = js.native
    @JSName("transform")
    def transform_default(options: TransformOptions[default]): View = js.native
    @JSName("transform")
    def transform_diagramarc(options: TransformOptions[diagramDotarc]): View = js.native
    @JSName("transform")
    def transform_diagramsankey(options: TransformOptions[diagramDotsankey]): View = js.native
    @JSName("transform")
    def transform_diagramvoronoi(options: TransformOptions[diagramDotvoronoi]): View = js.native
    @JSName("transform")
    def transform_fillRows(options: TransformOptions[fillRows]): View = js.native
    @JSName("transform")
    def transform_fillrows(options: TransformOptions[`fill-rows`]): View = js.native
    @JSName("transform")
    def transform_filter(options: TransformOptions[filter]): View = js.native
    @JSName("transform")
    def transform_fold(options: TransformOptions[fold]): View = js.native
    @JSName("transform")
    def transform_geocentroid(options: TransformOptions[geoDotcentroid]): View = js.native
    @JSName("transform")
    def transform_geoprojection(options: TransformOptions[geoDotprojection]): View = js.native
    @JSName("transform")
    def transform_georegion(options: TransformOptions[geoDotregion]): View = js.native
    @JSName("transform")
    def transform_group(options: TransformOptions[group]): View = js.native
    @JSName("transform")
    def transform_groups(options: TransformOptions[groups]): View = js.native
    @JSName("transform")
    def transform_hexbin(options: TransformOptions[hexbin]): View = js.native
    @JSName("transform")
    def transform_hierarchypartition(options: TransformOptions[hierarchyDotpartition]): View = js.native
    @JSName("transform")
    def transform_hierarchytreemap(options: TransformOptions[hierarchyDottreemap]): View = js.native
    @JSName("transform")
    def transform_impute(options: TransformOptions[impute]): View = js.native
    @JSName("transform")
    def transform_kerneldensity(options: TransformOptions[kernelDotdensity]): View = js.native
    @JSName("transform")
    def transform_kernelregression(options: TransformOptions[kernelDotregression]): View = js.native
    @JSName("transform")
    def transform_kernelsmoothdensity(options: TransformOptions[`kernel-smoothDotdensity`]): View = js.native
    @JSName("transform")
    def transform_kernelsmoothregression(options: TransformOptions[`kernel-smoothDotregression`]): View = js.native
    @JSName("transform")
    def transform_map(options: TransformOptions[map]): View = js.native
    @JSName("transform")
    def transform_partition(options: TransformOptions[partition]): View = js.native
    @JSName("transform")
    def transform_percent(options: TransformOptions[percent]): View = js.native
    @JSName("transform")
    def transform_pick(options: TransformOptions[pick]): View = js.native
    @JSName("transform")
    def transform_proportion(options: TransformOptions[proportion]): View = js.native
    @JSName("transform")
    def transform_regression(options: TransformOptions[regression]): View = js.native
    @JSName("transform")
    def transform_rename(options: TransformOptions[rename]): View = js.native
    @JSName("transform")
    def transform_renamefields(options: TransformOptions[`rename-fields`]): View = js.native
    @JSName("transform")
    def transform_reverse(options: TransformOptions[reverse]): View = js.native
    @JSName("transform")
    def transform_sankey(options: TransformOptions[sankey]): View = js.native
    @JSName("transform")
    def transform_sort(options: TransformOptions[sort]): View = js.native
    @JSName("transform")
    def transform_sortBy(options: TransformOptions[sortBy]): View = js.native
    @JSName("transform")
    def transform_sortby(options: TransformOptions[`sort-by`]): View = js.native
    @JSName("transform")
    def transform_subset(options: TransformOptions[subset]): View = js.native
    @JSName("transform")
    def transform_summary(options: TransformOptions[summary]): View = js.native
    @JSName("transform")
    def transform_tagcloud(options: TransformOptions[`tag-cloud`]): View = js.native
    @JSName("transform")
    def transform_treemap(options: TransformOptions[treemap]): View = js.native
    @JSName("transform")
    def transform_voronoi(options: TransformOptions[voronoi]): View = js.native
    @JSName("transform")
    def transform_wordcloud(options: TransformOptions[`word-cloud`]): View = js.native
    
    /**
      * 已应用的 transform
      */
    var transforms: js.Array[TransformOptions[Any]] = js.native
    
    def updateRow(index: Double, newRow: Any): Unit = js.native
    
    /* CompleteClass */
    override def variance(column: String): Double = js.native
    
    /**
      *
      */
    /* private */ var watchingStates: Any = js.native
  }
  /* static members */
  object View {
    
    @JSImport("@antv/data-set/lib/view", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/view", "View.DataSet")
    @js.native
    def DataSet: TypeofDataSetInstantiable = js.native
    inline def DataSet_=(x: TypeofDataSetInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSet")(x.asInstanceOf[js.Any])
  }
  
  type ConnectorOptions[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] = Type[T] & (/* import warning: importer.ImportType#apply Failed type conversion: @antv/data-set.@antv/data-set/lib/connector-params.ConnectorParams[T][1] */ js.Any)
  
  trait CustomSource extends StObject {
    
    var options: Any
    
    var source: Any
  }
  object CustomSource {
    
    inline def apply(options: Any, source: Any): CustomSource = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSource]
    }
    
    extension [Self <: CustomSource](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformOptions[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] = TypeT[T] & (/* import warning: importer.ImportType#apply Failed type conversion: @antv/data-set.@antv/data-set/lib/transform-params.TransformsParams[T] */ js.Any)
  
  trait ViewOptions extends StObject {
    
    var watchingStates: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ViewOptions {
    
    inline def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    extension [Self <: ViewOptions](x: Self) {
      
      inline def setWatchingStates(value: js.Array[String]): Self = StObject.set(x, "watchingStates", value.asInstanceOf[js.Any])
      
      inline def setWatchingStatesUndefined: Self = StObject.set(x, "watchingStates", js.undefined)
      
      inline def setWatchingStatesVarargs(value: String*): Self = StObject.set(x, "watchingStates", js.Array(value*))
    }
  }
}
