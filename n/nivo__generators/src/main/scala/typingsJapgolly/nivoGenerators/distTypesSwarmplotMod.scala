package typingsJapgolly.nivoGenerators

import typingsJapgolly.nivoGenerators.anon.CategoryCount
import typingsJapgolly.nivoGenerators.anon.DataGroups
import typingsJapgolly.nivoGenerators.anon.Groups
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSwarmplotMod {
  
  @JSImport("@nivo/generators/dist/types/swarmplot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateSwarmPlotData(groups: js.Array[String], hasMinMaxCategoryCount: CategoryCount): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSwarmPlotData")(groups.asInstanceOf[js.Any], hasMinMaxCategoryCount.asInstanceOf[js.Any])).asInstanceOf[Groups]
  
  inline def randomizeSwarmPlotData(
    previousData: ReturnType[
      js.Function2[/* groups */ js.Array[String], /* hasMinMaxCategoryCount */ CategoryCount, Groups]
    ]
  ): DataGroups = ^.asInstanceOf[js.Dynamic].applyDynamic("randomizeSwarmPlotData")(previousData.asInstanceOf[js.Any]).asInstanceOf[DataGroups]
  
  trait SwarmPlotDatum extends StObject {
    
    var categories: js.UndefOr[js.Array[Double]] = js.undefined
    
    var group: String
    
    var id: String
    
    var price: Double
    
    var volume: Double
  }
  object SwarmPlotDatum {
    
    inline def apply(group: String, id: String, price: Double, volume: Double): SwarmPlotDatum = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwarmPlotDatum]
    }
    
    extension [Self <: SwarmPlotDatum](x: Self) {
      
      inline def setCategories(value: js.Array[Double]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: Double*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
}
