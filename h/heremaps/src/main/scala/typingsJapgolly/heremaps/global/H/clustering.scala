package typingsJapgolly.heremaps.global.H

import typingsJapgolly.heremaps.H.clustering.Provider.Options
import typingsJapgolly.heremaps.H.geo.Altitude
import typingsJapgolly.heremaps.H.geo.AltitudeContext
import typingsJapgolly.heremaps.H.geo.Latitude
import typingsJapgolly.heremaps.H.geo.Longitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** clustering *****/
object clustering {
  
  /**
    * This class represents the input data structure for data points to be clustered.
    * @property lat {H.geo.Latitude} - The latitude coordinate of the data point's position
    * @property lng {H.geo.Longitude} - The longitude coordinate of the data point's position
    * @property wt {number} - The weight of the data point
    * @property data {*} - Data associated with this data point
    */
  @JSGlobal("H.clustering.DataPoint")
  @js.native
  open class DataPoint protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.clustering.DataPoint {
    /**
      * Constructor
      * @param lat {H.geo.Latitude} - The latitude coordinate of the data point's position
      * @param lng {H.geo.Longitude} - The longitude coordinate of the data point's position
      * @param opt_weight {number=} - The weight of the data point as a positive number > 0. If not specified it , default is 1.
      * @param opt_data {*=} - Optional data, which will be associated with this DataPoint
      */
    def this(lat: Latitude, lng: Longitude) = this()
    def this(lat: Latitude, lng: Longitude, opt_weight: Double) = this()
    def this(lat: Latitude, lng: Longitude, opt_weight: Double, opt_data: Any) = this()
    def this(lat: Latitude, lng: Longitude, opt_weight: Unit, opt_data: Any) = this()
    
    /* CompleteClass */
    @JSName("alt")
    var alt_DataPoint: Altitude = js.native
    
    /* CompleteClass */
    @JSName("ctx")
    var ctx_DataPoint: AltitudeContext = js.native
    
    /* CompleteClass */
    var data: Any = js.native
    
    /* CompleteClass */
    var lat: Latitude = js.native
    
    /* CompleteClass */
    var lng: Longitude = js.native
    
    /* CompleteClass */
    var wt: Double = js.native
  }
  
  /**
    * The clustering provider serves clusters and noise point representation for the map depending on the provided data set.
    * Levels for clustering as well as custom cluster representation can be set via Options.
    * @property min {number} - Minimum zoom level at which provider can cluster data
    * @property max {number} - Maximum zoom level at which provider can cluster data
    */
  @JSGlobal("H.clustering.Provider")
  @js.native
  open class Provider protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.clustering.Provider {
    /**
      * Constructor
      * @param dataPoints {Array<H.clustering.DataPoint>}
      * @param opt_options {H.clustering.Provider.Options=}
      */
    def this(dataPoints: js.Array[typingsJapgolly.heremaps.H.clustering.DataPoint]) = this()
    def this(dataPoints: js.Array[typingsJapgolly.heremaps.H.clustering.DataPoint], opt_options: Options) = this()
  }
  object Provider {
    
    /**
      * Enumeration represents possible clustering strategies. FASTGRID clustering is the efficient way to cluster large sets of data points.
      * GRID clustering is slower but has greater precision due to the bigger range of epsilon values, this strategy suitable for clustering smaller data sets (up to 1000 data points)
      * on desktop devices. DYNAMICGRID clustering uses the same algorithm of clustering as the GRID, but clusters on the viewport basis is meant to be used with data sets that are subject
      * to the frequent update operations.
      */
    @JSGlobal("H.clustering.Provider.Strategy")
    @js.native
    object Strategy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.heremaps.H.clustering.Provider.Strategy & Double] = js.native
      
      /* 2 */ val DYNAMICGRID: typingsJapgolly.heremaps.H.clustering.Provider.Strategy.DYNAMICGRID & Double = js.native
      
      /* 0 */ val FASTGRID: typingsJapgolly.heremaps.H.clustering.Provider.Strategy.FASTGRID & Double = js.native
      
      /* 1 */ val GRID: typingsJapgolly.heremaps.H.clustering.Provider.Strategy.GRID & Double = js.native
    }
  }
}
