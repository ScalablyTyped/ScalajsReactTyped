package typingsJapgolly.antvDataSet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
import typingsJapgolly.antvDataSet.libDataSetMod.DataSet
import typingsJapgolly.antvDataSet.libDataSetMod.DataSetOptions
import typingsJapgolly.antvDataSet.libViewMod.View
import typingsJapgolly.antvDataSet.libViewMod.ViewOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Edges extends StObject {
    
    var edges: js.Array[Any]
    
    var nodes: js.Array[Any]
  }
  object Edges {
    
    inline def apply(edges: js.Array[Any], nodes: js.Array[Any]): Edges = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edges]
    }
    
    extension [Self <: Edges](x: Self) {
      
      inline def setEdges(value: js.Array[Any]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: Any*): Self = StObject.set(x, "edges", js.Array(value*))
      
      inline def setNodes(value: js.Array[Any]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Any*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait GEO extends StObject {
    
    var GEO: String
    
    var GEO_GRATICULE: String
    
    var GRAPH: String
    
    var HEX: String
    
    var HIERARCHY: String
    
    var STATISTICS_METHODS: js.Array[String]
    
    var TABLE: String
  }
  object GEO {
    
    inline def apply(
      GEO: String,
      GEO_GRATICULE: String,
      GRAPH: String,
      HEX: String,
      HIERARCHY: String,
      STATISTICS_METHODS: js.Array[String],
      TABLE: String
    ): GEO = {
      val __obj = js.Dynamic.literal(GEO = GEO.asInstanceOf[js.Any], GEO_GRATICULE = GEO_GRATICULE.asInstanceOf[js.Any], GRAPH = GRAPH.asInstanceOf[js.Any], HEX = HEX.asInstanceOf[js.Any], HIERARCHY = HIERARCHY.asInstanceOf[js.Any], STATISTICS_METHODS = STATISTICS_METHODS.asInstanceOf[js.Any], TABLE = TABLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[GEO]
    }
    
    extension [Self <: GEO](x: Self) {
      
      inline def setGEO(value: String): Self = StObject.set(x, "GEO", value.asInstanceOf[js.Any])
      
      inline def setGEO_GRATICULE(value: String): Self = StObject.set(x, "GEO_GRATICULE", value.asInstanceOf[js.Any])
      
      inline def setGRAPH(value: String): Self = StObject.set(x, "GRAPH", value.asInstanceOf[js.Any])
      
      inline def setHEX(value: String): Self = StObject.set(x, "HEX", value.asInstanceOf[js.Any])
      
      inline def setHIERARCHY(value: String): Self = StObject.set(x, "HIERARCHY", value.asInstanceOf[js.Any])
      
      inline def setSTATISTICS_METHODS(value: js.Array[String]): Self = StObject.set(x, "STATISTICS_METHODS", value.asInstanceOf[js.Any])
      
      inline def setSTATISTICS_METHODSVarargs(value: String*): Self = StObject.set(x, "STATISTICS_METHODS", js.Array(value*))
      
      inline def setTABLE(value: String): Self = StObject.set(x, "TABLE", value.asInstanceOf[js.Any])
    }
  }
  
  trait SankeyCenter extends StObject
  
  trait Type[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] extends StObject {
    
    var `type`: T
  }
  object Type {
    
    inline def apply[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */](`type`: T): Type[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    extension [Self <: Type[?], T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */](x: Self & Type[T]) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeT[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] extends StObject {
    
    var `type`: T
  }
  object TypeT {
    
    inline def apply[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */](`type`: T): TypeT[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeT[T]]
    }
    
    extension [Self <: TypeT[?], T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */](x: Self & TypeT[T]) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDataSet
    extends StObject
       with Instantiable0[DataSet]
       with Instantiable1[/* initialProps */ DataSetOptions, DataSet] {
    
    /**
      * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
      */
    var CONSTANTS: GEO = js.native
    
    /**
      * 注册的 Connector（key-value 对）
      */
    var connectors: Record[String, Any] = js.native
    
    def getConnector(name: String): js.Function = js.native
    
    def getTransform(): js.Function = js.native
    def getTransform(name: String): js.Function = js.native
    
    /**
      * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
      * @param name - 类型
      * @param connector - 解析逻辑
      */
    def registerConnector(name: String, connector: js.Function3[/* data */ Any, /* options */ Any, /* view */ View, Any]): Unit = js.native
    
    /**
      * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
      * @param name - transform 类型
      * @param transform - transform逻辑
      */
    def registerTransform(name: String, transform: Any): Unit = js.native
    
    /**
      * 已注册的 Transform（key-value 对）
      */
    var transforms: Record[String, Any] = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait TypeofDataSetInstantiable
    extends StObject
       with Instantiable0[DataSet]
       with Instantiable1[/* initialProps */ DataSetOptions, DataSet] {
    
    /**
      * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
      */
    var CONSTANTS: GEO = js.native
    
    /**
      * 注册的 Connector（key-value 对）
      */
    var connectors: Record[String, Any] = js.native
    
    def getConnector(name: String): js.Function = js.native
    
    def getTransform(): js.Function = js.native
    def getTransform(name: String): js.Function = js.native
    
    /**
      * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
      * @param name - 类型
      * @param connector - 解析逻辑
      */
    def registerConnector(
      name: String,
      connector: js.Function3[/* data */ Any, /* options */ Any, /* view */ this.type, Any]
    ): Unit = js.native
    
    /**
      * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
      * @param name - transform 类型
      * @param transform - transform逻辑
      */
    def registerTransform(name: String, transform: Any): Unit = js.native
    
    /**
      * 已注册的 Transform（key-value 对）
      */
    var transforms: Record[String, Any] = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait TypeofView
    extends StObject
       with Instantiable0[View]
       with Instantiable1[/* options */ ViewOptions, View]
}
