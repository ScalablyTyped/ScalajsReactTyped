package typingsJapgolly.nivoGenerators

import typingsJapgolly.nivoGenerators.anon.CategoryCount
import typingsJapgolly.nivoGenerators.anon.Color
import typingsJapgolly.nivoGenerators.anon.Country
import typingsJapgolly.nivoGenerators.anon.Data
import typingsJapgolly.nivoGenerators.anon.DataGroups
import typingsJapgolly.nivoGenerators.anon.DataId
import typingsJapgolly.nivoGenerators.anon.DataKeys
import typingsJapgolly.nivoGenerators.anon.Day
import typingsJapgolly.nivoGenerators.anon.Groups
import typingsJapgolly.nivoGenerators.anon.Id
import typingsJapgolly.nivoGenerators.anon.Keys
import typingsJapgolly.nivoGenerators.anon.Label
import typingsJapgolly.nivoGenerators.anon.LeafSize
import typingsJapgolly.nivoGenerators.anon.Links
import typingsJapgolly.nivoGenerators.anon.Matrix
import typingsJapgolly.nivoGenerators.anon.Max
import typingsJapgolly.nivoGenerators.anon.MaxIterations
import typingsJapgolly.nivoGenerators.anon.Nodes
import typingsJapgolly.nivoGenerators.anon.RandMax
import typingsJapgolly.nivoGenerators.anon.SerieIds
import typingsJapgolly.nivoGenerators.anon.Y
import typingsJapgolly.nivoGenerators.distTypesBulletMod.Options
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/generators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateBulletData(id: String, max: Double): Id = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBulletData")(id.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Id]
  inline def generateBulletData(id: String, max: Double, hasTitleSubtitleRangeCountMeasureCountMarkerCountFloat: Options): Id = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBulletData")(id.asInstanceOf[js.Any], max.asInstanceOf[js.Any], hasTitleSubtitleRangeCountMeasureCountMarkerCountFloat.asInstanceOf[js.Any])).asInstanceOf[Id]
  
  inline def generateChordData(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("generateChordData")().asInstanceOf[Matrix]
  inline def generateChordData(hasKeysSizeMinValueMaxValue: Keys): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("generateChordData")(hasKeysSizeMinValueMaxValue.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def generateCountriesData(keys: js.Array[String]): js.Array[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCountriesData")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, Any]]]
  inline def generateCountriesData(keys: js.Array[String], hasSizeMinMaxWithColors: Max): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCountriesData")(keys.asInstanceOf[js.Any], hasSizeMinMaxWithColors.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def generateCountriesPopulation(size: Double): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCountriesPopulation")(size.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country]]
  
  inline def generateDayCounts(from: js.Date, to: js.Date): js.Array[Day] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDayCounts")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Day]]
  inline def generateDayCounts(from: js.Date, to: js.Date, maxSize: Double): js.Array[Day] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDayCounts")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Day]]
  
  inline def generateDrinkStats(): js.Array[DrinkDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDrinkStats")().asInstanceOf[js.Array[DrinkDatum]]
  inline def generateDrinkStats(xSize: Double): js.Array[DrinkDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDrinkStats")(xSize.asInstanceOf[js.Any]).asInstanceOf[js.Array[DrinkDatum]]
  
  inline def generateLibTree(): LibTreeDatum = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")().asInstanceOf[LibTreeDatum]
  inline def generateLibTree(name: String): LibTreeDatum = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any]).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(name: String, limit: Double): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: String,
    limit: Double,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: String,
    limit: Null,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: String,
    limit: Unit,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(name: Unit, limit: Double): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: Unit,
    limit: Double,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: Unit,
    limit: Null,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: Unit,
    limit: Unit,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  
  inline def generateNetworkData(): Links = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNetworkData")().asInstanceOf[Links]
  inline def generateNetworkData(hasRootSizeMidSizeLeafSizeMinMidNodesMaxMidNodesMinLeavesMaxLeaves: LeafSize): Links = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNetworkData")(hasRootSizeMidSizeLeafSizeMinMidNodesMaxMidNodesMinLeavesMaxLeaves.asInstanceOf[js.Any]).asInstanceOf[Links]
  
  inline def generateOrderedDayCounts(from: js.Date, to: js.Date): js.Array[Day] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateOrderedDayCounts")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Day]]
  
  inline def generateParallelCoordinatesData(): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateParallelCoordinatesData")().asInstanceOf[js.Array[js.Object]]
  inline def generateParallelCoordinatesData(hasSizeKeys: typingsJapgolly.nivoGenerators.distTypesParallelCoordinatesMod.Options): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateParallelCoordinatesData")(hasSizeKeys.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  inline def generateProgrammingLanguageStats(): js.Array[Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateProgrammingLanguageStats")().asInstanceOf[js.Array[Label]]
  inline def generateProgrammingLanguageStats(shouldShuffle: Boolean): js.Array[Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateProgrammingLanguageStats")(shouldShuffle.asInstanceOf[js.Any]).asInstanceOf[js.Array[Label]]
  inline def generateProgrammingLanguageStats(shouldShuffle: Boolean, limit: Double): js.Array[Label] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgrammingLanguageStats")(shouldShuffle.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Label]]
  inline def generateProgrammingLanguageStats(shouldShuffle: Unit, limit: Double): js.Array[Label] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgrammingLanguageStats")(shouldShuffle.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Label]]
  
  inline def generateSankeyData(): Nodes = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSankeyData")().asInstanceOf[Nodes]
  inline def generateSankeyData(hasNodeCountMaxIterations: MaxIterations): Nodes = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSankeyData")(hasNodeCountMaxIterations.asInstanceOf[js.Any]).asInstanceOf[Nodes]
  
  inline def generateSerie(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSerie")().asInstanceOf[js.Array[Double]]
  inline def generateSerie(xSize: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSerie")(xSize.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def generateSeries(ids: js.Array[String], xKeys: js.Array[String]): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSeries")(ids.asInstanceOf[js.Any], xKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
  
  inline def generateStackData(): js.Array[js.Array[Y]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStackData")().asInstanceOf[js.Array[js.Array[Y]]]
  inline def generateStackData(size: Double): js.Array[js.Array[Y]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStackData")(size.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Y]]]
  
  inline def generateSwarmPlotData(groups: js.Array[String], hasMinMaxCategoryCount: CategoryCount): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSwarmPlotData")(groups.asInstanceOf[js.Any], hasMinMaxCategoryCount.asInstanceOf[js.Any])).asInstanceOf[Groups]
  
  inline def generateWinesTastes(): DataKeys = ^.asInstanceOf[js.Dynamic].applyDynamic("generateWinesTastes")().asInstanceOf[DataKeys]
  inline def generateWinesTastes(hasRandMinRandMax: RandMax): DataKeys = ^.asInstanceOf[js.Dynamic].applyDynamic("generateWinesTastes")(hasRandMinRandMax.asInstanceOf[js.Any]).asInstanceOf[DataKeys]
  
  inline def generateXYSeries(hasSerieIdsXY: SerieIds): js.Array[DataId] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateXYSeries")(hasSerieIdsXY.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataId]]
  
  inline def randColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randColor")().asInstanceOf[String]
  
  inline def randCountryCode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randCountryCode")().asInstanceOf[String]
  
  inline def randomizeSwarmPlotData(
    previousData: ReturnType[
      js.Function2[/* groups */ js.Array[String], /* hasMinMaxCategoryCount */ CategoryCount, Groups]
    ]
  ): DataGroups = ^.asInstanceOf[js.Dynamic].applyDynamic("randomizeSwarmPlotData")(previousData.asInstanceOf[js.Any]).asInstanceOf[DataGroups]
  
  object sets {
    
    @JSImport("@nivo/generators", "sets.countryCodes")
    @js.native
    val countryCodes: js.Array[String] = js.native
    
    @JSImport("@nivo/generators", "sets.names")
    @js.native
    val names: js.Array[String] = js.native
    
    @JSImport("@nivo/generators", "sets.programmingLanguages")
    @js.native
    val programmingLanguages: js.Array[String] = js.native
  }
  
  inline def uniqRand[T](generator: js.Function1[/* repeated */ Any, T]): js.Function1[/* repeated */ Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqRand")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, T]]
  
  trait DrinkDatum extends StObject {
    
    var color: String
    
    var data: js.Array[Color]
    
    var id: String
  }
  object DrinkDatum {
    
    inline def apply(color: String, data: js.Array[Color], id: String): DrinkDatum = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrinkDatum]
    }
    
    extension [Self <: DrinkDatum](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Color]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Color*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait LibTreeDatum extends StObject {
    
    var children: js.UndefOr[js.Array[LibTreeDatum]] = js.undefined
    
    var color: String
    
    var loc: js.UndefOr[Double] = js.undefined
    
    var name: String
  }
  object LibTreeDatum {
    
    inline def apply(color: String, name: String): LibTreeDatum = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibTreeDatum]
    }
    
    extension [Self <: LibTreeDatum](x: Self) {
      
      inline def setChildren(value: js.Array[LibTreeDatum]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: LibTreeDatum*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLoc(value: Double): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
