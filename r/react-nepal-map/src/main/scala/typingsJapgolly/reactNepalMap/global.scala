package typingsJapgolly.reactNepalMap

import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactNepalMap.mod.DistrictMapTypes
import typingsJapgolly.reactNepalMap.mod.MapPropsTypes
import typingsJapgolly.reactNepalMap.mod.ProvinceMapPropsTypes
import typingsJapgolly.reactNepalMap.mod.ProvinceMapTypes
import typingsJapgolly.reactNepalMap.mod.ZonalMapTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactNepalMap {
    
    @JSGlobal("ReactNepalMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ReactNepalMap.DistrictMap")
    @js.native
    val DistrictMap: FC[MapPropsTypes] = js.native
    
    @JSGlobal("ReactNepalMap.ProvinceMap")
    @js.native
    val ProvinceMap: FC[ProvinceMapPropsTypes] = js.native
    
    @JSGlobal("ReactNepalMap.ZonalMap")
    @js.native
    val ZonalMap: FC[MapPropsTypes] = js.native
    
    @JSGlobal("ReactNepalMap.districtMapData")
    @js.native
    val districtMapData: js.Array[DistrictMapTypes] = js.native
    
    inline def getRandomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomColor")().asInstanceOf[String]
    
    @JSGlobal("ReactNepalMap.provinceMapData")
    @js.native
    val provinceMapData: js.Array[ProvinceMapTypes] = js.native
    
    @JSGlobal("ReactNepalMap.zonalMapData")
    @js.native
    val zonalMapData: js.Array[ZonalMapTypes] = js.native
  }
}
