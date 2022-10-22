package typingsJapgolly.nivoBar

import typingsJapgolly.nivoBar.distTypesTypesMod.BarLegendProps
import typingsJapgolly.nivoBar.distTypesTypesMod.LegendData
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarLegendsMod {
  
  @JSImport("@nivo/bar/dist/types/BarLegends", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BarLegends(hasWidthHeightLegendsToggleSerie: BarLegendsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BarLegends")(hasWidthHeightLegendsToggleSerie.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait BarLegendsProps extends StObject {
    
    var height: Double = js.native
    
    var legends: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]] = js.native
    
    def toggleSerie(id: String): Unit = js.native
    def toggleSerie(id: Double): Unit = js.native
    
    var width: Double = js.native
  }
}
