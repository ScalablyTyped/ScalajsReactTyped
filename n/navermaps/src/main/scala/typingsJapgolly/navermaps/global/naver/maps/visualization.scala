package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.visualization.DotMapOptions
import typingsJapgolly.navermaps.naver.maps.visualization.HeatMapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  // Sub module: visualization
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.visualization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("naver.maps.visualization.DotMap")
  @js.native
  open class DotMap ()
    extends StObject
       with typingsJapgolly.navermaps.naver.maps.visualization.DotMap {
    def this(dotMapOptions: DotMapOptions) = this()
  }
  
  @JSGlobal("naver.maps.visualization.HeatMap")
  @js.native
  open class HeatMap ()
    extends StObject
       with typingsJapgolly.navermaps.naver.maps.visualization.HeatMap {
    def this(heatMapOptions: HeatMapOptions) = this()
  }
  
  @JSGlobal("naver.maps.visualization.SpectrumStyle")
  @js.native
  object SpectrumStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle & Double] = js.native
    
    /* 3 */ val COOL: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.COOL & Double = js.native
    
    /* 4 */ val GREYS: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.GREYS & Double = js.native
    
    /* 2 */ val HOT: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.HOT & Double = js.native
    
    /* 1 */ val HSV: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.HSV & Double = js.native
    
    /* 0 */ val JET: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.JET & Double = js.native
    
    /* 10 */ val OXYGEN: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.OXYGEN & Double = js.native
    
    /* 9 */ val PORTLAND: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.PORTLAND & Double = js.native
    
    /* 8 */ val RAINBOW: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.RAINBOW & Double = js.native
    
    /* 7 */ val RdBu: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.RdBu & Double = js.native
    
    /* 5 */ val YIGnBu: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.YIGnBu & Double = js.native
    
    /* 6 */ val YIOrRd: typingsJapgolly.navermaps.naver.maps.visualization.SpectrumStyle.YIOrRd & Double = js.native
  }
  
  @JSGlobal("naver.maps.visualization.WeightedLocation")
  @js.native
  open class WeightedLocation protected ()
    extends StObject
       with typingsJapgolly.navermaps.naver.maps.visualization.WeightedLocation {
    def this(lat: Double, lng: Double) = this()
    def this(lat: Double, lng: Double, weight: Double) = this()
    
    /* CompleteClass */
    override def getLocation(): typingsJapgolly.navermaps.naver.maps.LatLng = js.native
    
    /* CompleteClass */
    override def getWeight(): Double = js.native
    
    /* CompleteClass */
    override def lat(): Double = js.native
    
    /* CompleteClass */
    override def lng(): Double = js.native
  }
}
